class ChatShop{

static String chats[]={"Pani Puri","Bhel Puri","Sev Puri","Dahi Puri","Samosa","Puffs","Gobi Manchurian","Cutlet","Aloo chats","Cheese Corn"};
public static void main (String[] fruits){

System.out.println("main started");
//System.out.println("Name of the chats are "+chats.length);
//System.out.println(chats[0]+" "+chats[1]+" "+chats[2]+" "+chats[3]+" "+chats[4]+" "+chats[5]+" "+chats[6]+" "+chats[7]+" "+chats[8]+" "+chats[9]);

System.out.println("Name of the chats are ");
for(String chat:chats)
{
	System.out.println(chat);
}
System.out.println("main ended");
}
}

