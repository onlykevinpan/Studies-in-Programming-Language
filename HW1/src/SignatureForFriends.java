public class SignatureForFriends extends Sign {
	@Override//Don't forget this.
	protected void sayHello(){
		System.out.println("      Hi XXX:");
	}
	@Override
	protected void blessing(){
		System.out.println("      Have a nice day.");
	}
}
