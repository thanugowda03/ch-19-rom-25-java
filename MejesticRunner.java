class MejesticRunner {

public static void main(String details[]){

Platform platform=new Platform("B120","Non-AC","30m");
BusStand busstand=new BusStand("12","KBS",25,platform);
Mejestic mejestic=new Mejestic("Central Bangalore",1,25,busstand);

mejestic.getMejesticInfo();
}

}