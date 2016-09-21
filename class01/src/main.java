public class main {
	public static void main(String []args){
		ReturnHome tar = new ReturnHomeByTSR();
		ReturnHome coach = new ReturnHomeByCoach();
		ReturnHome air = new ReturnHomeByAir();
		ReturnHome boat = new ReturnHomeByBoat();
		
		System.out.println("A san:");
		tar.meetParent();
		
		System.out.println("B san");
		coach.meetParent();
		
		System.out.println("C san:");
		air.meetParent();
		
		System.out.println("D san:");
		boat.meetParent();
		
	}
	
	
}
