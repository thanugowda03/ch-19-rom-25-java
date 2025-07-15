class CountryCodesRunner {

public static void main(String country[]) {
String countryName="India";
int countryCode =CountryCodes.getCountryCode(countryName);
System.out.println("Country code for "+countryName+ " is "+countryCode);
}
}