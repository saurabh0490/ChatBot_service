package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.resource.Names;

public class Repository {
	List<Names> name;
	

	Connection con =null;
	public Repository() {
		
			String url= "jdbc:mysql://localhost:3306/restdb";
			String user="root";
			String password="root";
			try {
				Class.forName("com.mysql.jdbc.Driver");
			    con= DriverManager.getConnection(url,user,password);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		
	}

		
		/*name= new ArrayList(); 
		
		Names n1=new Names();
		n1.setName("ankit");
		n1.setId(1);
		//return n1;
		Names n2=new Names();
		n2.setName("sunnny");
		n2.setId(2);
		
		name.add(n1);
		name.add(n2);
		//return n1;*/
	
	
	public List<Names> AllNames(){
		
		
		List <Names> name=new ArrayList<>();
		String sql="select * from hartford";
		try {
		Statement st = con.createStatement();
		ResultSet rs =	st.executeQuery(sql);
		while(rs.next()) {
			Names n=new Names();
			n.setProjectId(rs.getInt(1));
			n.setProjectName(rs.getString(2));
			n.setProjectHead(rs.getString(3));
			n.setProjectDetails(rs.getString(4));
			n.setToolsUsed(rs.getString(5));
			//n.setCategory(rs.getString(6));
			name.add(n);
		
		}

		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return name;
	}

	public void addName(Names n) {
		
		String sql="insert into Hartford values(?,?,?,?,?,?)";
		try {
		PreparedStatement st=con.prepareStatement(sql);
		st.setInt(1, n.getProjectId());
		st.setString(2, n.getProjectName());
		st.setString(3, n.getProjectHead());
		st.setString(4, n.getProjectDetails());
		st.setString(5, n.getToolsUsed());
		st.setString(6,n.getCategory());
		st.executeUpdate();
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		// TODO Auto-generated method stub
		//name.add(n);
	}

	public Names singleName(int id) {
		//List <Names> name=new ArrayList<>();
		String sql="select * from Hartford where ProjectId="+id;
		Names n=new Names();
		try {
		Statement st = con.createStatement();
		ResultSet rs =	st.executeQuery(sql);
		if(rs.next()) {
		
			n.setProjectId(rs.getInt(1));
			n.setProjectName(rs.getString(2));
			n.setProjectHead(rs.getString(3));
			n.setProjectDetails(rs.getString(4));
			n.setToolsUsed(rs.getString(5));
			n.setCategory(rs.getString(6));
		
		}

		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return n;
		/*for(Names n4 : name)
		{
			if(n4.getId()==id)
			{
		// TODO Auto-generated method stub
		    return n4;
			}
		}
		return new Names();*/

}


	public void Update(Names n) {
		String sql="update Hartford set ProjectName=?,ProjectDetails=?,ProjectHead=?,ToolUsed=?,category=? where ProjectId=?";
		Repository repo=new Repository();
		try {
		PreparedStatement st=con.prepareStatement(sql);
		if(n.getProjectName()==null) {
			st.setString(1, repo.singleName(n.getProjectId()).getProjectName());	}
		else {
		st.setString(1, n.getProjectName());}
		
		if(n.getProjectDetails()==null) {
			st.setString(2, repo.singleName(n.getProjectId()).getProjectDetails());}
		else {
		st.setString(2, n.getProjectDetails());}
		
		if(n.getProjectHead()==null) {
			st.setString(3, repo.singleName(n.getProjectId()).getProjectHead());}
		else {
		st.setString(3, n.getProjectHead());}
		
		
		if(n.getToolsUsed()==null) {
			st.setString(4, repo.singleName(n.getProjectId()).getToolsUsed());
		}
		else {
			st.setString(4, n.getToolsUsed());
		}
		if(n.getCategory()==null) {
			st.setString(5, repo.singleName(n.getProjectId()).getCategory());
		}
		else {
			st.setString(5, n.getCategory());
		}
		if(n.getProjectId()==0)
			System.out.println("Please enter Project id to identify data");
		else {
		st.setInt(6, n.getProjectId());}
		
		st.executeUpdate();
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	
		
	}


	public void Delete(int id) {
		String sql="delete from Hartford where ProjectId=?";
		//Names n=new Names();
		try {
			PreparedStatement st=con.prepareStatement(sql);
			//st.setString(1, n.getProjectDetails());
			st.setInt(1, id);
			st.executeUpdate();
		System.out.println("deleted ");
		}

		
		catch(Exception e) {
			System.out.println(e);
		}
		
	}


	public List<Names> CategoryName(String category) {
		
		List <Names> name=new ArrayList<>();
		String sql="SELECT * from Hartford WHERE category = '"+category+"'";
		
		try {
		Statement st = con.createStatement();
		ResultSet rs =	st.executeQuery(sql);
		while(rs.next()) {
			Names n=new Names();
			n.setProjectId(rs.getInt(1));
			n.setProjectName(rs.getString(2));
			n.setProjectHead(rs.getString(3));
			n.setProjectDetails(rs.getString(4));
			n.setToolsUsed(rs.getString(5));
		/*	n.setCategory(rs.getString(6));*/
		    name.add(n);
		}

		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return name;
		// TODO Auto-generated method stub
	
	}

               public List<String> AllCategory() {
	
		List <String> Domain=new ArrayList<>();
		
		String sql="SELECT DISTINCT category from Hartford";
		
		try {
		Statement st = con.createStatement();
		ResultSet rs =	st.executeQuery(sql);
		while(rs.next()) {
			
		
			Domain.add((rs.getString(1)));
		}

		}
		catch(Exception e) {
			System.out.println(e);
		}
		return Domain;
	} 
 

	
	
}
