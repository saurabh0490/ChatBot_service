package com.app;

public class TestName {

	private int projectId;
	private int testingId;
	private String testingName;
	private String testingLink;
	private String createdBy;
	private String updatedBy;
	private String updatedDate;
	
	
	
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public int getTestingId() {
		return testingId;
	}
	public void setTestingId(int testingId) {
		this.testingId = testingId;
	}
	public String getTestingName() {
		return testingName;
	}
	public void setTestingName(String testingName) {
		this.testingName = testingName;
	}
	public String getTestingLink() {
		return testingLink;
	}
	public void setTestingLink(String testingLink) {
		this.testingLink = testingLink;
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
		return "TestName [projectId=" + projectId + ", testingId=" + testingId + ", testingName=" + testingName
				+ ", testingLink=" + testingLink + ", createdBy=" + createdBy + ", updatedBy=" + updatedBy
				+ ", updatedDate=" + updatedDate + ", getProjectId()=" + getProjectId() + ", getTestingId()="
				+ getTestingId() + ", getTestingName()=" + getTestingName() + ", getTestingLink()=" + getTestingLink()
				+ ", getCreatedBy()=" + getCreatedBy() + ", getUpdatedBy()=" + getUpdatedBy() + ", getUpdatedDate()="
				+ getUpdatedDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
	
}
