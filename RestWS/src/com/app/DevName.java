package com.app;

public class DevName {
	
	private int projectId;
	private int developmentId;
	private String developmentName;
	private String developmentLink;
	private String createdBy;
	private String updatedBy;
	private String updatedDate;
	
	
	
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public int getDevelopmentId() {
		return developmentId;
	}
	public void setDevelopmentId(int developmentId) {
		this.developmentId = developmentId;
	}
	public String getDevelopmentName() {
		return developmentName;
	}
	public void setDevelopmentName(String developmentName) {
		this.developmentName = developmentName;
	}
	public String getDevelopmentLink() {
		return developmentLink;
	}
	public void setDevelopmentLink(String developmentLink) {
		this.developmentLink = developmentLink;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}
	@Override
	public String toString() {
		return "DevName [projectId=" + projectId + ", developmentId=" + developmentId + ", developmentName="
				+ developmentName + ", developmentLink=" + developmentLink + ", createdBy=" + createdBy + ", updatedBy="
				+ updatedBy + ", updatedDate=" + updatedDate + ", getProjectId()=" + getProjectId()
				+ ", getDevelopmentId()=" + getDevelopmentId() + ", getDevelopmentName()=" + getDevelopmentName()
				+ ", getDevelopmentLink()=" + getDevelopmentLink() + ", getCreatedBy()=" + getCreatedBy()
				+ ", getUpdatedBy()=" + getUpdatedBy() + ", getUpdatedDate()=" + getUpdatedDate() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	

}
