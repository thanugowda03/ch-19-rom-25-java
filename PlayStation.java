class PlayStation{

/*static String godOfWar="God of War";
static String spiderMan="Spider-Man";
static String eldenRing="Elden Ring";
static String ghostOfTsushmia="Ghost of Tsushmia";
static String deathStanding="Death Standing";
static String theLastOfUs="The Last of Us";
static String spiderMan2="Spider-Man-2";
static String callOfDuty="Call of Duty";
static String fortnite="Fortnite";
static String streetFighter6="Street Fighter-6";
static String games[]={godOfWar,spiderMan,eldenRing,ghostOfTsushmia,deathStanding,theLastOfUs,spiderMan2,callOfDuty,fortnite,streetFighter6};*/

public static void main(String[] play){
System.out.println("main started");

String godOfWar="God of War";
String spiderMan="Spider-Man";
String eldenRing="Elden Ring";
String ghostOfTsushmia="Ghost of Tsushmia";
String deathStanding="Death Standing";
String theLastOfUs="The Last of Us";
String spiderMan2="Spider-Man-2";
String callOfDuty="Call of Duty";
String fortnite="Fortnite";
String streetFighter6="Street Fighter-6";
String games[]={godOfWar,spiderMan,eldenRing,ghostOfTsushmia,deathStanding,theLastOfUs,spiderMan2,callOfDuty,fortnite,streetFighter6};

//System.out.println("Play Station games are "+games.length);
//System.out.println(games[0]+" "+games[1]+" "+games[2]+" "+games[3]+" "+games[4]+" "+games[5]+" "+games[6]+" "+games[7]+" "+games[8]+" "+games[9]);
System.out.println("Play station games are ");
for(String game:games)
{
	System.out.println(game);
}
System.out.println("main ended");
}
}
