package e_oop;

public class JVM_Memory {

	/*
	 * <<JVM 메모리 구조>>			//Java Virtual Machine
	 * - Method Area : 클래스가 저장된다.
	 * - Call Stack : 현재 호출되어 있는 메서드가 저장된다.
	 * - Heap : 객체가 저장된다.
	 * 
	 * 운영체제 -> 프로그램
	 * 운영체제 -> JVM -> 프로그램
	 */
	
	/*	Static.java 참조
	 * 
	 * <<Method Area>>
	 * - Static
	 * - Math
	 * - System
	 * - PrintStream
	 * - ClassMember : classVariable, classMethod()		//static이 붙으면 Method Area에 저장됨.
	 * 
	 * <<Call Stack>>		//수행한 메서드는 삭제된다.
	 * - main()	: cm1	//주소값 저장
	 * - random()	: 삭제
	 * - println()	: 삭제
	 * - println()	: 삭제
	 * - println()	: 삭제
	 * 
	 * <<Heap>>
	 * - cm1 = new ClassMember() : instanceVariable, instanceMethod()
	 * - cm2 = new ClassMember() : instanceVariable, instanceMethod()
	 */
	
}
