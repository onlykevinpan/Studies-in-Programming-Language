public class ReturnHomeByTSR extends ReturnHome {
	@Override
	protected void buyTicket(){
		System.out.println("Buy TSR ticket.");
	}
	@Override
	protected void transport(){
		System.out.println("take TSR to taipei main station.");
	}
}
