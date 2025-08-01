class PMORunner {

public static void main(String details[]){

CabinetMinister cabinetminister=new CabinetMinister("President","PM or Resign");
PrimeMinister primeminister=new PrimeMinister("Head of the Union Council of Ministers","Decision Making","President",cabinetminister );
PMO pmo=new PMO("Assists the PM","New Delhi","Prime Minister",primeminister);

primeminister.getPrimeMinisterInfo();

}
}