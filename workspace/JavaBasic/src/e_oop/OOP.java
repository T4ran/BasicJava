package e_oop;

public class OOP {

	/*SampleClass sc = new SampleClass();*/	//main밖에 선언되면 에러발생
	public static void main(String[] args) {
		/*
		 * << 객체지향 프로그래밍 >>
		 * - 프로그래밍을 단순히 코드의 연속으로 보는것이 아니라
		 * 	객체간의 상호작용으로 보는것.
		 * - 코드의 재사용성이 높고 유지보수가 용이하다.
		 * 
		 * << 객체 생성(인스턴스화) >>
		 * - 클래스를 사용하기 위해 메모리(Heap영역)에 올려놓은 것.
		 * - new 클래스명(); => 객체가 저장된 메모리의 주소 반환.
		 * - 객체 뒤에 참조연산자(.)를 붙여 객체의 변수와 메서드에 접근할 수 있다.
		 * - 객체는 생성될때 마다 새로운 객체가 생성되고,
		 * 	여러개의 객체가 동시에 존재할 수 있다.
		 * 
		 */
		
		SampleClass sc = new SampleClass();		//SampleClass()안에 있는 변수 및 메서드를 활용하기 위한 문장 객체생성
		
		sc.method1();
		
		sc.method2(sc.field);	//SampleClass안에 있는 변수 또한 사용할 수 있다.
		
		String returnString = sc.method3();
		System.out.println(returnString);
		
		int returnInt = sc.method4(7, 15);
		System.out.println(returnInt);
		
		OOP Oop = new OOP();	//같은 클래스에서 선언되었더라도 필요하다.
		
		Oop.method5();
		
		sc.test1();
		
		ClassMaker cm = new ClassMaker();	//객체 생성 후 변수 저장
		
		cm.method1();
		System.out.println(cm.method2());
		cm.method3(cm.vari);
		System.out.println(cm.method4(3, 5));
		
		System.out.print("\n\n\n\n");
		
		//문제1. 다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		//1. 123456 + 654321
		//2. 1번의 결과값 * 123456
		//3. 2번의 결과값 / 123456
		//4. 3번의 결과값 - 654321
		//5. 4번의 결과값 % 123456
		
		Calculator cal = new Calculator();
		double result=0.0;
		
		System.out.println(result=cal.plusMethod(123456, 654321));
		System.out.println(result=cal.multipleMethod(result, 123456));
		System.out.println(result=cal.divideMethod(result, 123456));
		System.out.println(result=cal.minusMethod(result, 654321));
		System.out.println(cal.remMethod(result, 123456));
		
		MindTest mt = new MindTest();
		
		mt.startTest();
	}
	
	void method5()
	{
		System.out.println("5번째 메서드, 같은 클래스안에서 선언해주었다.");
	}

}
