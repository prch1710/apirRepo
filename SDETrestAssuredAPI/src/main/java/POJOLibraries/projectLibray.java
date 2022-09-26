package POJOLibraries;

public class projectLibray {
	//step1: Declare all the variables as global
	String createdBy;
	String projectName;
	String status;
	int teamSize;
	//step2:provider constructor to initilalise
	public projectLibray(String createdBy, String projectName, String status, int teamSize) {
		
		this.createdBy = createdBy;
		this.projectName = projectName;
		this.status = status;
		this.teamSize = teamSize;
	}
	//step3:provide getters and setters
	
	
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	   
  //step3:provide getters and setters
	
}
