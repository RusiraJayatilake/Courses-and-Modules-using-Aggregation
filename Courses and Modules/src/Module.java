public class Module{
	private String assessment;
	private int creditPoints;
	private String moduleName;


	public Module(String moduleName, int creditPoints, String assessements) {
		setModuleName(moduleName);
		setCreditPoints(creditPoints);
		setAssessment(assessements);
	}


	//Getters and Setters
	public String getAssessment() {
		return assessment;
	}
	public void setAssessment(String assessment) {
		this.assessment = assessment;
	}
	public int getCreditPoints() {
		return creditPoints;
	}
	public void setCreditPoints(int creditPoints) {
		this.creditPoints = creditPoints;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
}