// project:Happy Cow
// date 2016/09/23
//author: 610577103 Pan
public class main {
	public static void main(String []args){
		SignatureForTeacher teacher = new SignatureForTeacher();
		SignatureForParents parents = new SignatureForParents();
		SignatureForFriends friends = new SignatureForFriends();
		
		System.out.println("Signature for Teacher:");
		teacher.makeSignature();
		
		System.out.println("Signature for Parents:");
		parents.makeSignature();
		
		System.out.println("Signature for Friends:");
		friends.makeSignature();
			
	}
	
	
}
