package f_oop2.ex_abstract;

public abstract class SampleAbstractParent {

	void method()
	{
		
	}
	
	//추상 메서드 : 선언부만 있고 구현부는 없는 메서드
	abstract void abstractMethod();
}

/*class SampleAbstractChild extends SampleAbstractParent	//상속받은 클래스에 추상메서드가 있을 경우 선언해주지 않으면 에러가 생긴다.
{

}*/

class SampleAbstractChild extends SampleAbstractParent		//따라서 이와같이 오버라이딩하여 abstractMethod를 구현한다.
{															//또는 상속받은 클래스와 같이 클래스 선언 앞에 abstract를 붙여 추상클래스로 만들어주는 경우도 있다.
	//추상메서드를 상속받으면 반드시 구현해야 한다.
	//상속받은 추상메서드를 추상메서드로 남겨두려면
	//클래스를 추상클래스로 변경해야 한다.
	
	@Override
	void abstractMethod() {
		// TODO Auto-generated method stub
		
	}
}

