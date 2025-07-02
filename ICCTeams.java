class ICCTeams{
/* static String india="India";                              //static type
static String newZealand="New Zealand";
static String australia = "Australia";
static String sriLanka="Sri Lanka";
static String pakistan ="Pakistan";
static String southAfrica="South Africa";
static String afghanistan="Afghanistan";
static String england="England";
static String westIndies="West Indies";
static String bangladesh="Bangladesh";

static String teamNames[]={india,newZealand,australia,sriLanka,pakistan,southAfrica,afghanistan,england,westIndies,bangladesh}; */

public static void main(String[] teams){            //inside main (local)
    String india="India"; 
	String newZealand="New Zealand";
    String australia = "Australia";
    String sriLanka="Sri Lanka"; 
	String pakistan ="Pakistan";
    String southAfrica="South Africa";
    String afghanistan="Afghanistan";
    String england="England";
    String westIndies="West Indies";
	String bangladesh="Bangladesh";
	String teamNames[]={india,newZealand,australia,sriLanka,pakistan,southAfrica,afghanistan,england,westIndies,bangladesh};                                                               

System.out.println("main started");
System.out.println("The ICC Top Ten Teams are");
for(String teamName:teamNames)
{
System.out.println(teamName);
}
System.out.println("main ended");
}
}