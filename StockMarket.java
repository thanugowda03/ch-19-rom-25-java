class StockMarket {
	/*static String ltd = "Reliance Industries Ltd";
	static String bank = "HDFC Bank";
	static String tcs = "TCS";
	static String infosys = "Infosys";
	static String icici = "ICICI Bank";
	static String inc = "Apple Inc";
	static String corp = "NVIDIA Corp";
	static String soft = "Microsoft Corp";
	static String com = "Amazon.com Inc";
	static String bet = "Alphabet Inc";
static String stockNames[] ={ltd,bank,tcs,infosys,icici,inc,corp,soft,com,bet};*/ 

public static void main (String[] names){
	String ltd = "Reliance Industries Ltd";
	String bank = "HDFC Bank";
	String tcs = "TCS";
	String infosys = "Infosys";
	String icici = "ICICI Bank";
	String inc = "Apple Inc";
	String corp = "NVIDIA Corp";
	String soft = "Microsoft Corp";
	String com = "Amazon.com Inc";
	String bet = "Alphabet Inc";
	String stockNames[] = {ltd,bank,tcs,infosys,icici,inc,corp,soft,com,bet};
	System.out.println("main started");
	System.out.println("StockMarket names are ");
	//System.out.println("StockMarket names are "+ stockNames.length);
	//System.out.println(stockNames[0] +" "+ stockNames[1] +" "+ stockNames[2] +" "+ stockNames[3] +" "+ stockNames[4] +" "+ stockNames[5] +" "+ stockNames[6] +" "+ stockNames[7] +" "+ stockNames[8] +" "+ stockNames[9]);
	for(String stockName : stockNames){
		System.out.println(stockName);
	}
	System.out.println("main ended");
	}
}