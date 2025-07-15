class RadioRunner{
	public static void main(String[] details){
		System.out.println("main started");
		
		String brand = Radio.getBrand();
		System.out.println("The radio brand name is: "+brand);
		
		String connectorType = Radio.getConnectorType();
		System.out.println("The radio connector type is: "+connectorType);
		
		String colour = Radio.getColour();
		System.out.println("The radio colour is: "+colour);
		
		String weight = Radio.getWeight();
		System.out.println("The radio weight is: "+weight);
		
		String radioBandsSupported = Radio.getRadioBandsSupported();
		System.out.println("The radio bands suppored is: "+radioBandsSupported);
		
		String compatibleDevices = Radio.getCompatibleDevices();
		System.out.println("The radio compatible devices: "+ compatibleDevices);
		
		System.out.println("main ended");
		
	}
}