class CabinetMinister {

String appointedBy;
String removedBy;

CabinetMinister(String appointedBy,String removedBy){
this.appointedBy=appointedBy;
this.removedBy=removedBy;

}
public void getCabinetMinisterInfo(){
System.out.println("Cabinet Minister was Appointed By "+appointedBy);
System.out.println("Cabinet Minister was Removed by "+removedBy);

}
}