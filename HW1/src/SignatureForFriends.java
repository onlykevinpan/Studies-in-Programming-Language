// project:Happy Cow
// date 2016/09/23
//author: 610577103 Pan
public class SignatureForFriends extends Sign {
	@Override//Don't forget this.
	protected void sayHello(){    //protected
		System.out.println("      Hi XXX:");
	}
	@Override
	protected void blessing(){
		System.out.println("      Have a nice day.");
	}
}
