package b_operator;

public class ComparisonOperator {
	public static void main(String[] args) {
		/*
		 * <<비교연산자>>
		 * - <	: 작다
		 * - >	: 크다
		 * - <=	: 작거나 같다
		 * - >=	: 크거나 같다
		 * - ==	: 같다
		 * - !=	: 같지 않다
		 */
		
		System.out.println(10>1);
		//비교연산자의 연산결과는 boolean이다.
		System.out.println(10 < 20 - 15);
		//비교연산자와 산술연산자가 같이 있을 경우 산술연산자가 우선권을 갖는다.
		System.out.println(10 <= 10.0);
		//(int)10을 (double)로 형변환하여 비교연산자를 수행한다.
		System.out.println(65 >= 'B');
		//(char)'B'를 (int)로 형변환하여 비교연산자를 수행한다.
		System.out.println(66 == 'B');
		
		System.out.println(10.0f == 10.0);//true	float과 double은 몇몇을 제외하고 숫자를 표현할 때 부정확하다.
		System.out.println(10.1f == 10.1);//false	실수는 정수와 소수점아래 숫자를 나누어 표현한다.
		
		System.out.printf("%21.20f%n",10.1f);
		System.out.printf("%21.20f%n",10.1);
		//float은 7, double은 15까지 정밀도를 제공하기 때문에 정확하게 비교할 수 없다.
		//float이 double이 되면서 소수점 7번째부터 쓰레기 값이 나온다.
		//float을 double로 형변환하고 비교를 하기때문에 발생하는 문제
		
		System.out.printf("%21.20f%n",(double)10.1f);
		System.out.printf("%21.20f%n",(float)10.1);
		//따라서 double을 float으로 형변환하면 정확한 비교를 할 수 있다.
		
		System.out.println(10.1f == (float)10.1);
		
		//대소 비교는 boolean을 제외한 기본형 타입만 비교할 수 있지만
		//등가 비교는 모든 타입을 비교할 수 있다.
		//ex) true > false	- 불가능
		//ex) true != false	- 가능
		
		System.out.println("abc" == "abc");		//문자열 또한 비교 가능
		//System.out.println("abc" > "abc");	//string타입은 대소 비교 불가. 주소값을 참조해서 불러오기 때문
		System.out.println("abc" == new String("abc"));		//new는 새로운 주소를 생성한다. 결과 false
		System.out.println("abc".equals(new String("abc")));	//equals()메서드를 사용하여 String의 내용을 비교할 수 있다.
		System.out.println(!"abc".equals("ABC"));				//"".equals() 혹은 !"".equals
		
		//System.out.println();		sysout까지만 치고 Ctrl + Space누르면 자동완성. 명령프롬프트의 탭 기능
		
		//다음의 문장을 코드로 표현해주세요.
		//1보다 2가 크다.
		//0은 100보다 작거나 같다.
		//3.14f와 3.14는 같지 않다.
		//"남자"와 "여자"는 다르다.
		
		System.out.println(1 < 2);
		System.out.println(0 <= 100);
		System.out.println(3.14f != (float)3.14);
		System.out.println("남자".equals("여자"));
	}
}
