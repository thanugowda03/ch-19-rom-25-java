class PlayStation{

static String games[]={"God of War","Spider-Man","Elden Ring","Ghost of Tsushmia","Death Standing","The Last of Us Part 1 & 2","Spider-Man-2","Call of Duty","Fortnite","Street Fighter-6"};

public static void main(String[] play){
System.out.println("main started");
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
