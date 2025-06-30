class StockMarket{
static String stockNames[]={"TCS","Infosys Ltd","HDFC Bank Ltd","ICICI Bank Ltd","Hindustan Unilever Ltd","SBI","Wipro Ltd","Bharti Airtel Ltd","Larsen & Toubro","Reliance Industies Ltd"};

public static void main(String[] stock){
System.out.println("main started");
//System.out.println("Stocks names are "+stockNames.length);
//System.out.println(stockNames[0]+" "+stockNames[1]+" "+stockNames[2]+" "+stockNames[3]+" "+stockNames[4]+" "+stockNames[5]+" "+stockNames[6]+" "+stockNames[7]+" "+stockNames[8]+" "+stockNames[9]);
System.out.println("Stocks names are ");
for(String stockName:stockNames)
{
System.out.println(stockName);	
}
System.out.println("main ended");
}
}
