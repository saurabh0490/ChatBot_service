package com.resource;


public class Names {

	private String projectName;
	private  int projectId;
	private String projectDetails;
	private String projectHead;
	private String toolsUsed;
	private String category;
	
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectDetails() {
		return projectDetails;
	}

	public void setProjectDetails(String projectDetails) {
		this.projectDetails = projectDetails;
	}

	public String getProjectHead() {
		return projectHead;
	}

	public void setProjectHead(String projectHead) {
		this.projectHead = projectHead;
	}

	public String getToolsUsed() {
		return toolsUsed;
	}

	public void setToolsUsed(String toolsUsed) {
		this.toolsUsed = toolsUsed;
	}


	
	@Override
	public String toString() {
		return "Names [category=" + category + ", ProjectName=" + projectName + ", ProjectId=" + projectId
				+ ", ProjectDetails=" + projectDetails + ", ProjectHead=" + projectHead + ", ToolsUsed=" + toolsUsed
				+ "]";
	}
	
	
	
	}
	
	
		
	
	
	


