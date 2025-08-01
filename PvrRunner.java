class PvrRunner {

public static void main(String a[]){

Movie movie=new Movie("Su From So","Kannada",4.8);
Screen screen=new Screen(111,"3D","2.30pm and 6.30pm",movie);
Pvr pvr=new Pvr("Prasanna","RajajiNagar",4.0,2,screen);

pvr.getPvrInfo();


}



}