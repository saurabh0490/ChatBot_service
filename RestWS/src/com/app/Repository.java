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

	Connection con = null;

	public Repository() {

		String url = "jdbc:mysql://localhost:3306/restdb";
		String user = "root";
		String password = "root";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public List<Names> AllNames() {

		List<Names> name = new ArrayList<>();
		String sql = "select * from hartford";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Names n = new Names();
				n.setProjectId(rs.getInt(1));
				n.setProjectName(rs.getString(2));
				n.setDescription(rs.getString(3));
				n.setCategory(rs.getString(4));
				n.setFunctionalDocumentLink(rs.getString(5));
				name.add(n);

			}

		} catch (Exception e) {
			System.out.println(e);
		}

		return name;
	}

	public void addName(Names n) {

		String sql = "insert into Hartford values(?,?,?,?,?)";
		try {
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, n.getProjectId());
			st.setString(2, n.getProjectName());
			st.setString(3, n.getDescription());
			st.setString(4, n.getCategory());
			st.setString(5, n.getFunctionalDocumentLink());
			st.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public Names singleName(int id) {

		String sql = "select * from Hartford where ProjectId=" + id;
		Names n = new Names();
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if (rs.next()) {

				n.setProjectId(rs.getInt(1));
				n.setProjectName(rs.getString(2));
				n.setDescription(rs.getString(3));
				n.setCategory(rs.getString(4));
				n.setFunctionalDocumentLink(rs.getString(5));

			}

		} catch (Exception e) {
			System.out.println(e);
		}

		return n;

	}

	public void Update(Names n) {
		String sql = "update Hartford set ProjectName=?,Description=?,Category=?,FunctionalDocumentLink=? where ProjectId=?";
		Repository repo = new Repository();
		try {
			PreparedStatement st = con.prepareStatement(sql);
			if (n.getProjectName() == null) {
				st.setString(1, repo.singleName(n.getProjectId()).getProjectName());
			} else {
				st.setString(1, n.getProjectName());
			}

			if (n.getDescription() == null) {
				st.setString(2, repo.singleName(n.getProjectId()).getDescription());
			} else {
				st.setString(2, n.getDescription());
			}

			if (n.getCategory() == null) {
				st.setString(3, repo.singleName(n.getProjectId()).getCategory());
			} else {
				st.setString(3, n.getCategory());
			}

			if (n.getFunctionalDocumentLink() == null) {
				st.setString(4, repo.singleName(n.getProjectId()).getFunctionalDocumentLink());
			} else {
				st.setString(4, n.getFunctionalDocumentLink());
			}

			if (n.getProjectId() == 0)
				System.out.println("Please enter Project id to identify data");
			else {
				st.setInt(5, n.getProjectId());
			}

			st.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void Delete(int id) {

		String sql = "delete from Hartford where ProjectId=?";

		try {
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, id);
			st.executeUpdate();
			System.out.println("deleted ");
		}

		catch (Exception e) {
			System.out.println(e);
		}

	}

	public List<Names> CategoryName(String category) {

		List<Names> name = new ArrayList<>();
		String sql = "SELECT * from Hartford WHERE category = '" + category + "'";

		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Names n = new Names();
				n.setProjectId(rs.getInt(1));
				n.setProjectName(rs.getString(2));
				n.setDescription(rs.getString(3));
				n.setCategory(rs.getString(4));
				n.setFunctionalDocumentLink(rs.getString(5));

				name.add(n);
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		return name;

	}

	public List<String> AllCategory() {

		List<String> Domain = new ArrayList<>();

		String sql = "SELECT DISTINCT category from Hartford";

		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {

				Domain.add((rs.getString(1)));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return Domain;
	}

	public DevName singleDev(int id) {

		String sql = "select * from Development where ProjectId=" + id;
		DevName n = new DevName();
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if (rs.next()) {

				n.setProjectId(rs.getInt(1));
				n.setDevelopmentId(rs.getInt(2));
				n.setDevelopmentName(rs.getString(3));
				n.setDevelopmentLink(rs.getString(4));
				n.setCreatedBy(rs.getString(5));
				n.setUpdatedBy(rs.getString(6));
				n.setUpdatedDate(rs.getString(7));

			}

		} catch (Exception e) {
			System.out.println(e);
		}

		return n;

	}

	public TestName singleTest(int id) {

		String sql = "select * from Testing where ProjectId=" + id;
		TestName n = new TestName();
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if (rs.next()) {

				n.setProjectId(rs.getInt(1));
				n.setTestingId(rs.getInt(2));
				n.setTestingLink(rs.getString(4));
				n.setTestingName(rs.getString(3));
				n.setCreatedBy(rs.getString(5));
				n.setUpdatedBy(rs.getString(6));
				n.setUpdatedDate(rs.getString(7));

			}

		} catch (Exception e) {
			System.out.println(e);
		}

		return n;

	}

}
