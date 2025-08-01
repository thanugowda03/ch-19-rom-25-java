class PrimeMinister {

String powers;
String responsibilities;
String appointedBy;
CabinetMinister cabinetminister;

PrimeMinister(String powers,String responsibilities,String appointedBy,CabinetMinister cabinetminister) {
this.powers=powers;
this.responsibilities=responsibilities;
this.appointedBy=appointedBy;
this.cabinetminister=cabinetminister;
}
public void getPrimeMinisterInfo(){

System.out.println("PM Power is "+powers);
System.out.println("PM Responsibilities "+responsibilities);
System.out.println("PM is appointed by "+appointedBy);
System.out.println("Cabinet Minister");
this.cabinetminister.getCabinetMinisterInfo();
}
}