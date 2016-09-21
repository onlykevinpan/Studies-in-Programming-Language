public abstract class ReturnHome {
	public void meetParent(){
		buyTicket();
		transport();
		localTransport();
	}
	protected abstract void buyTicket();
	
	protected abstract void transport();
	
	protected final void localTransport(){
		System.out.println("take MRT");
		System.out.println("take bus to home");
		System.out.println();
	}
	
	
}
