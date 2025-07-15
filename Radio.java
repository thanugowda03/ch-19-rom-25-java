class Radio{
	static String brand;
	static String connectorType;
	static String colour;
	static String weight;
	static String radioBandsSupported;
	static String compatibleDevices;
	
	public static String getBrand(){
		brand = "Philips";
		return brand;
	}
	
	public static String getConnectorType(){
		connectorType = "Ethernet";
		return connectorType;
	}
	
	public static String getColour(){
		colour = "White";
		return colour;
	}
	
	public static String getWeight(){
		weight = "739 g";
		return weight;
	}
	
	public static String getRadioBandsSupported(){
		radioBandsSupported = "FM,SM";
		return radioBandsSupported;
	}
	
	public static String getCompatibleDevices(){
		compatibleDevices = "Headphone, Speaker";
		return compatibleDevices;
	}

}