package com.app;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.resource.Names;
@Path("/GetName")
public class GetName {
	
	Repository repo=new Repository();
		
	
	@GET
	@Path("/All")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Names> getnames() {
		//System.out.println("inside getname");		
		
		
		return repo.AllNames();
		/*Names n1=new Names();
		n1.setName("ankit");
		n1.setId(1);
		//return n1;
		Names n2=new Names();
		n2.setName("sunnny");
		n2.setId(2);
		//return n1;
		List<Names> name=Arrays.asList(n1,n2);
		return name;*/

	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("single/{id}")
	public Names getname(@PathParam("id") int id){
		return repo.singleName(id);
	}
	
	@POST
	@Path("/create")
	@Consumes(MediaType.APPLICATION_JSON)
	public Names CreateName(Names n) {
		System.out.println(n);
		repo.addName(n);
		return n;
	}
	@PUT
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	public Names UpdateName(Names n) {
		System.out.println(n);
		if(repo.singleName(n.getProjectId()).getProjectId()==0)
		{
			System.out.println("Data not present");
		}
		else {
		repo.Update(n);
		}
		return n;
	}
	
	@DELETE
	@Path("/delete/{id}")
	public Names DeleteName(@PathParam("id") int id) {
		Names n=repo.singleName(id);
		System.out.println(n);
		if(n.getProjectId()==0)
		{
			System.out.println("Data to be deleted is not present");
		}
		else {
		repo.Delete(id);
		}
		return n;
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("category/{category}")
	public List<Names> getname(@PathParam("category") String category){
		return repo.CategoryName(category);
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/AllCategory")
	public List<String> getCategory(){
		return repo.AllCategory();
	} 

}
