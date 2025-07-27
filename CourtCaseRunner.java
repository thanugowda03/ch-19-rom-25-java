class CourtCaseRunner {
    public static void main(String[] cases) {
        System.out.println("Main started");

        CourtCase case1 = new CourtCase(1, "State vs John", "State", "John", "High Court of Delhi", "Criminal", "Open");
        case1.getCourtInfo();

        CourtCase case2 = new CourtCase(2, "Ram vs Shyam", "Ram", "Shyam", "District Court", "Civil", "Pending");
        case2.getCourtInfo();

        CourtCase case3 = new CourtCase(3, "XYZ Ltd vs ABC Ltd", "XYZ Ltd", "ABC Ltd", "Commercial Court", "Corporate", "Closed");
        case3.getCourtInfo();

        CourtCase case4 = new CourtCase(4, "Amit vs Metro Corp", "Amit Kumar", "Metro Corp", "Consumer Court", "Consumer", "Open");
        case4.getCourtInfo();

        CourtCase case5 = new CourtCase(5, "Rani vs Mohan", "Rani", "Mohan", "Family Court", "Family", "Closed");
        case5.getCourtInfo();

        CourtCase case6 = new CourtCase(6, "Govt vs Illegal Builders", "Government", "Builder Group", "Supreme Court", "Constitutional", "Open");
        case6.getCourtInfo();

        CourtCase case7 = new CourtCase(7, "Arun vs Tax Dept", "Arun Sharma", "Income Tax Dept", "Tribunal Court", "Tax", "Pending");
        case7.getCourtInfo();

        CourtCase case8 = new CourtCase(8, "City Council vs Factory", "City Council", "Polluting Factory", "Environmental Court", "Environmental", "Open");
        case8.getCourtInfo();

        CourtCase case9 = new CourtCase(9, "Tenant vs Landlord", "Tenant", "Landlord", "Rental Court", "Property", "Closed");
        case9.getCourtInfo();

        CourtCase case10 = new CourtCase(10, "Mahesh vs Builder Corp", "Mahesh Babu", "Builder Corp", "Civil Court", "Real Estate", "Pending");
        case10.getCourtInfo();

        CourtCase case11 = new CourtCase(11, "Neha vs Insurance Co", "Neha Singh", "SecureLife Insurance", "Consumer Court", "Insurance", "Pending");
        case11.getCourtInfo();

        CourtCase case12 = new CourtCase(12, "Priya vs Hospital Trust", "Priya Reddy", "City Hospital Trust", "Health Tribunal", "Medical Negligence", "Open");
        case12.getCourtInfo();

        CourtCase case13 = new CourtCase(13, "Lalit vs HR Dept", "Lalit Kumar", "HR Department", "Labor Court", "Employment", "Closed");
        case13.getCourtInfo();

        CourtCase case14 = new CourtCase(14, "Students vs University", "Student Union", "XYZ University", "Education Tribunal", "Education", "Open");
        case14.getCourtInfo();

        CourtCase case15 = new CourtCase(15, "Ravi vs Car Dealer", "Ravi Narayan", "FastWheels Auto", "Consumer Court", "Consumer", "Closed");
        case15.getCourtInfo();

        CourtCase case16 = new CourtCase(16, "NGO vs Plastic Co", "Green Earth NGO", "Plastic Manufacturers Ltd", "Environmental Court", "Environmental", "Pending");
        case16.getCourtInfo();

        CourtCase case17 = new CourtCase(17, "Shweta vs Software Ltd", "Shweta Rao", "Software Ltd", "Cyber Court", "IT Dispute", "Open");
        case17.getCourtInfo();

        CourtCase case18 = new CourtCase(18, "Local Authority vs Builders", "Local Authority", "Builders Group", "Construction Tribunal", "Urban Development", "Pending");
        case18.getCourtInfo();

        CourtCase case19 = new CourtCase(19, "Anil vs College Mgmt", "Anil Kapoor", "College Management", "Education Tribunal", "Student Rights", "Closed");
        case19.getCourtInfo();

        System.out.println("Main ended");
    }
}
