class PMO{

String function;
String location;
String leadership;
PrimeMinister primeminister;

PMO(String function,String location,String leadership,PrimeMinister primeminister) {
this.function=function;
this.location=location;
this.leadership=leadership;
this.primeminister=primeminister;

}
public void getPMOInfo() {

System.out.println("Functions of PMO "+function);
System.out.println("PMO Location "+location);
System.out.println("Leader of PMO "+leadership);
System.out.println("Prime Minister");

this.primeminister.getPrimeMinisterInfo();


}
}