 class WeaponRunner {
    public static void main(String[] safety ) {

        Weapon weapon1 = new Weapon(1,"AK-47","Assault Rifle","Russia",4.3,"Steel");
		weapon1.getWeaponInfo();

        Weapon weapon2 = new Weapon(2,"Katana","Sword","Japan",1.2,"Tamahagane Steel");
		weapon2.getWeaponInfo();
		
        Weapon weapon3 = new Weapon(3,"M16","Rifle","USA",3.5,"Aluminum Alloy");
        weapon3.weaponId = 3;
        weapon3.name = "M16";
        weapon3.type = "Rifle";
        weapon3.originCountry = "USA";
        weapon3.weight = 3.5;
        weapon3.material = "Aluminum Alloy";
      
	    weapon3.getWeaponInfo();

        Weapon weapon4 = new Weapon(4,"Longbow","Bow","England",1.8,"Yew Wood");
		weapon4.getWeaponInfo();

        Weapon weapon5 = new Weapon(5,"Glock 17","Pistol","Austria",0.9,"Polymer and Steel");
		weapon5.getWeaponInfo();
		
        Weapon weapon6 = new Weapon(6,"Uzi","SMG","Israel",3.7,"Steel");
		weapon6.getWeaponInfo();
		
        Weapon weapon7 = new Weapon(7,"Crossbow","Ranged","China",4.0,"Wood and Metal"); 
		weapon7.getWeaponInfo();
		
        Weapon weapon8 = new Weapon(8,"Balisong","Knife","Philippines",0.2,"Stainless Steel");
		weapon8.getWeaponInfo();
		
        Weapon weapon9 = new Weapon(9,"Bazooka","Rocket Launcher","USA",7.1,"Steel");
		weapon9.getWeaponInfo();

        Weapon weapon10 = new Weapon(10,"Shuriken","Throwing star","Japan",0.1,"Steel");
	    weapon10.getWeaponInfo();

        Weapon weapon11 = new Weapon(11,"Rapier","Sword","Spain",1.0,"Carbon Steel");
		weapon11.getWeaponInfo();

        Weapon weapon12 = new Weapon(12,"FN SCAR","Assault Rifle","Belgium",3.9,"Aluminum Polymer");
		weapon12.getWeaponInfo();

        Weapon weapon13 = new Weapon(13,"Halberd","Polearm","Switzerland",2.5,"Steel and Wood");
		weapon13.getWeaponInfo();

        Weapon weapon14 = new Weapon(14,"Machete","Blade","Brazil",1.5,"Crbon Steel");
		weapon14.getWeaponInfo();

        Weapon weapon15 = new Weapon(15,"Nunchaku","Blunt","Okinawa",0.7,"Wood and Chain");
		weapon15.getWeaponInfo();

        Weapon weapon16 = new Weapon(16,"MP5","SMG","Germany",3.0,"Steel");
		weapon16.getWeaponInfo();
		
        Weapon weapon17 = new Weapon(17,"Tomahawk","Axe","USA",0.8,"Steel and Wood");
		weapon17.getWeaponInfo();

        Weapon weapon18 = new Weapon(18,"Dragunov","Sniper Rifle","Russia",4.4,"Wood and Steel");
		weapon18.getWeaponInfo();
		
        Weapon weapon19 = new Weapon(19,"Bayonet","Blade","France",0.6,"Steel");
		weapon19.getWeaponInfo();
		
        Weapon weapon20 = new Weapon(20,"Morning Star","Blunt","Medieval Europe",3.3,"Iron"); 
		weapon20.getWeaponInfo();
}
 }
