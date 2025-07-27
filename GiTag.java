class GiTag {
	GiTag() {
		System.out.println("The GiTag cons is invoked");
	}
    GiTag(int tagId, String productName, String state, String category, int yearOfRegistration, String authorizedBody) {
        this.tagId = tagId;
        this.productName = productName;
        this.state = state;
        this.category = category;
        this.yearOfRegistration = yearOfRegistration;
        this.authorizedBody = authorizedBody;
    }

    int tagId;
    String productName;
    String state;
    String category;
    int yearOfRegistration;
    String authorizedBody;
	
	public void getGiTagInfo() {
	System.out.println("Tag ID: " + tagId);
	System.out.println("Product name " + productName);
	System.out.println("State: " + state);
	System.out.println("Category: " + category);
	System.out.println("Year of registration " + yearOfRegistration);
	System.out.println("Authorized body" + authorizedBody);
}
}