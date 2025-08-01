class Balloon{

	int balloonId;
	String color;
	boolean isFilledWithAir;
	String balloonShape;
	double balloonPrice;
	boolean isEnvironmentFriendly;
	
	void Balloon(){
		this(1,"Blue");
		System.out.println("Balloon default constructor invoked");
	}
	
	Balloon(int balloonId,String color){
		this(true,"Round");
		System.out.println("Balloon constructor with(int,String) parameter invoked");
		this.balloonId=balloonId;
		this.color=color;
	}
	
	Balloon(boolean isFilledWithAir,String balloonShape){
		this(20.0,false);
		System.out.println("Balloon constructor with(boolean,String) invoked");
		this.isFilledWithAir=isFilledWithAir;
		this.balloonShape=balloonShape;
		
	}
	
	Balloon(double balloonPrice,boolean isEnvironmentFriendly){
		this(2,"Red",true,"Heart",50.0,false);
		System.out.println("Balloon constructor with(double,boolean) invoked");
		this.balloonPrice=balloonPrice;
		this.isEnvironmentFriendly=isEnvironmentFriendly;
		
	}
	
	Balloon(int balloonId,String color,boolean isFilledWithAir,String balloonShape,double balloonPrice,boolean isEnvironmentFriendly){
		this(3,"Pink",false);
		System.out.println("Balloon constructor with all parameters invoked");
		this.balloonId=balloonId;
		this.color=color;
		this.isFilledWithAir=isFilledWithAir;
		this.balloonShape=balloonShape;
		this.balloonPrice=balloonPrice;
		this.isEnvironmentFriendly=isEnvironmentFriendly;
		
	}
	
	Balloon(int balloonId,String color,boolean isFilledWithAir){
		this("Heart",10.0,true);
		System.out.println("Balloon constructor with(int,String,boolean) parameters invoked");
		this.balloonId=balloonId;
		this.color=color;
		this.isFilledWithAir=isFilledWithAir;
	}
	
	Balloon(String balloonShape,double balloonPrice,boolean isEnvironmentFriendly){
		System.out.println("Balloon constructor with(String,double,boolean) parameters invoked");
		this.balloonShape=balloonShape;
		this.balloonPrice=balloonPrice;
		this.isEnvironmentFriendly=isEnvironmentFriendly;
	}
	
	public void fetchBalloonDetails(){
		System.out.println("Balloon Details are : ");
		System.out.println("The id of the balloon is : "+balloonId);
		System.out.println("The color of the balloon is : "+color);
		System.out.println("Is balloon filled with air? "+isFilledWithAir);
		System.out.println("shape of the balloon is : "+balloonShape);
		System.out.println("price of the balloon is : "+balloonPrice);
		System.out.println("Is the balloon environment friendly? "+isEnvironmentFriendly);
		
	}
}