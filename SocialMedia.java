class SocialMedia{

static String mediaNames[]={"WhatsApp Messenger","Telegram","Instagram","YouTube","LinkedIn","ShareChat","Moj","Twitter","Threads","Koo"};

public static void main(String[] media){
System.out.println("main started");
//System.out.println("Media names are "+mediaNames.length);
//System.out.println(mediaNames[0]+" "+mediaNames[1]+" "+mediaNames[2]+" "+mediaNames[3]+" "+mediaNames[4]+" "+mediaNames[5]+" "+mediaNames[6]+" "+mediaNames[7]+" "+mediaNames[8]+" "+mediaNames[9]);
System.out.println("Media names are ");
for(String mediaName:mediaNames)
{
System.out.println(mediaName);
}
System.out.println("main ended");
}
}

