class CourtCase {
	CourtCase() {
		System.out.println("The court case cons is invoked");
	}
	CourtCase(int caseId, String caseTitle, String plaintiff, String defendant,String courtName, String caseType, String status) {
        this.caseId = caseId;
        this.caseTitle = caseTitle;
        this.plaintiff = plaintiff;
        this.defendant = defendant;
        this.courtName = courtName;
        this.caseType = caseType;
        this.status = status;
    }
    int caseId;
    String caseTitle;
    String plaintiff;
    String defendant;
    String courtName;
    String caseType;       
    String status;  

public void getCourtInfo(){
	System.out.println("Case ID: " + caseId);
    System.out.println("Title: " + caseTitle);
    System.out.println("Plaintiff: " + plaintiff);
    System.out.println("Defendant: " + defendant);
    System.out.println("Court: " + courtName);
    System.out.println("Type: " + caseType);
    System.out.println("Status: " + status);
}	
}