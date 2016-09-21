	public class ReturnHomeByAir extends ReturnHome {
		@Override
		protected void buyTicket(){
			System.out.println("Buy plan ticket.");
		}
		@Override
		protected void transport(){
			System.out.println("take plan to taipei main station.");
		}
	}
