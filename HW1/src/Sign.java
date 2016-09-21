public abstract class Sign {
	public void makeSignature(){
		sayHello();
		blessing();
		signature();
	}
	protected abstract void sayHello();
	
	protected abstract void blessing();
	
	protected final void signature(){
		System.out.println(" |w')/");
		System.out.println(" | /");
		System.out.println(" |U");
		System.out.println();
	}
	
	
}
