class Network{
	Network(){
		System.out.println("Network cons is invoked");
	}
	Network(int networkId, String providerName, String type, double frequency, String coverage, int speed) {
        this.networkId = networkId;
        this.providerName = providerName;
        this.type = type;
        this.frequency = frequency;
        this.coverage = coverage;
        this.speed = speed;
    }

	int networkId;
    String providerName;
    String type;         
    double frequency;     
    String coverage;      
    double speed; 

    public void getNetworkInfo() {
	System.out.println("The network id is " + networkId);
	System.out.println("The network provider name is " + providerName);
	System.out.println("The network type is " + type);
	System.out.println("The network frequency is " + frequency);
	System.out.println("The network coverage is " + coverage);
	System.out.println("The network speed is " + speed);	
	}
}