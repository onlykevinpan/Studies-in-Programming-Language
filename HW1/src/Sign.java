// project:Happy Cow
// date 2016/09/23
//author: 610577103 Pan
public abstract class Sign {
	public void makeSignature(){
		sayHello();
		blessing();
		signature();
	}
	protected abstract void sayHello();
	
	protected abstract void blessing();
	//final
	protected final void signature(){
		System.out.println(" |w')/");
		System.out.println(" | /");
		System.out.println(" |U");
		System.out.println();
	}
	
	
}
