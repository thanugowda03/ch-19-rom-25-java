class LokSabhaRunner{
		
		public static void main(String details[]){
		
		System.out.println("main started");
		
		Politicians politicians = new Politicians("B.Y. Raghavendra",51,"BJP","MP, Shivmogga");
		
		Seat seat = new Seat(215,"Shivmogga","Karnataka",false,"BJP",politicians);
		
		LokSabha loksabha = new LokSabha(18,"Om Birla",543,"BJP",seat);
		
		loksabha.getLokSabhaInfo();
		
		System.out.println("main ended");
		}

}