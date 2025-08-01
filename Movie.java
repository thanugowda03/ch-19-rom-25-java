class Movie {

String movieTitle;
String movieLanguage;
double movieRating;

Movie(String movieTitle,String movieLanguage,double movieRating){
this.movieTitle=movieTitle;
this.movieLanguage=movieLanguage;
this.movieRating=movieRating;

}
public void getMovieInfo() {
System.out.println("Movie Title is"+movieTitle);
System.out.println("Movie Language is "+movieLanguage);
System.out.println("Movie Rating is "+movieRating);
}

}