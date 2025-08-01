class Screen {

int screenId;
String type;
String screenSchedule;
Movie movie;

Screen(int screenId,String type,String screenSchedule,Movie movie) {
this.screenId=screenId;
this.type=type;
this.screenSchedule=screenSchedule;
this.movie=movie;
}

public void getScreenInfo(){
System.out.println("Screen Id is "+screenId);
System.out.println("Screen type "+type);
System.out.println("No of Screen schedules "+screenSchedule);
System.out.println("Movie ");

this.movie.getMovieInfo();
}


}