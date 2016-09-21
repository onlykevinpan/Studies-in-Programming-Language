	public class ReturnHomeByCoach extends ReturnHome {
		@Override
		protected void buyTicket(){
			System.out.println("Buy Coach ticket.");
		}
		@Override
		protected void transport(){
			System.out.println("take Coach to taipei main station.");
		}
	}
