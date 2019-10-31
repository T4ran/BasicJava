package f_oop2.access;

import f_oop2.AccessModifier;

public class AccessTest extends AccessModifier {
	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
		AccessTest at = new AccessTest();
		at.protectedTest();
		
		/*System.out.println("\n"+am.protectedVar);
		am.protectedMethod();*/
		
		/*System.out.println("\n"+am.defaultVar);
		am.defaultMethod();
		
		System.out.println("\n"+am.privateVar);
		am.privateMethod();*/
	}
	
	void protectedTest()
	{
		System.out.println("\n"+protectedVar);
		protectedMethod();
	}
}
