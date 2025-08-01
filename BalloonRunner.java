class BalloonRunner{
	public static void main(String balloon[]){
		System.out.println("main started");
			System.out.println();
			
				System.out.println("Instance one created");
				Balloon balloonOne = new Balloon();
				balloonOne.fetchBalloonDetails();
				System.out.println("Instance one ended");
				System.out.println();
				
				System.out.println("Instance Two created");
				Balloon balloonTwo = new Balloon(2,"Yellow",true,"Round",15.0,true);
				balloonTwo.fetchBalloonDetails();
				System.out.println("Instance Two ended");
				System.out.println();
				
				System.out.println("Instance Three created");
				Balloon balloonThree = new Balloon(3,"Green");
				balloonThree.fetchBalloonDetails();
				System.out.println("Instance Three ended");
				System.out.println();
				
				System.out.println("Instance Four created");
				Balloon balloonFour = new Balloon(4,"Orange",true);
				balloonFour.fetchBalloonDetails();
				System.out.println("Instance four ended");
				System.out.println();
				
				System.out.println("Instance Five created");
				Balloon balloonFive = new Balloon(true,"Heart");
				balloonFive.fetchBalloonDetails();
				System.out.println("Instance Five ended");
				System.out.println();
				
				System.out.println("Instance six created");
				Balloon balloonSix = new Balloon("Round",25.0,true);
				balloonSix.fetchBalloonDetails();
				System.out.println("Instance six ended");
				System.out.println();
				
				System.out.println("Instance seven created");
				Balloon balloonSeven = new Balloon(30.0,false);
				balloonSeven.fetchBalloonDetails();
				System.out.println("Instance seven ended");
				
			System.out.println();
		System.out.println("main ended");
	}
}