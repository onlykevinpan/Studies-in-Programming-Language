
	public class ReturnHomeByBoat extends ReturnHome {
		@Override
		protected void buyTicket(){
			System.out.println("Buy boat ticket.");
		}
		@Override
		protected void transport(){
			System.out.println("take boat to taipei main station.");
		}
	}