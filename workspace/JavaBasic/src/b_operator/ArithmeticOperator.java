package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		/*
		 *  <<산술 연산자>>
		 *  - + : 더하기
		 *  - - : 빼기
		 *  - * : 곱하기
		 *  - / : 나누기
		 *  - % : 나머지
		 *  - 이항 연산자는 양쪽의 피연산자의 타입이 일치해야 연산이 가능하다.
		 */
		
		int a = 10 + 20 - 10 * 5 / 10 % 2;
		
		System.out.println(a); //결과 : 29
		/*수학과 같이 *,/,% 연산자가 +,-보다 연산의 우선순위가 높다.
		우선순위가 동일할 경우 왼쪽부터 연산이 수행된다.*/
		
		a = (int)(10 + 20.3 + 20.8);	//int + double -> double + double
		System.out.println(a);//결과 : 51//피연산자의 타입이 서로 다른경우 표현범위가 큰쪽으로 형변환한 후 연산이 수행된다.
										//따라서 연산의 결과도 표현범위가 큰 쪽의 타입이 된다.
		
		byte b = 10;
		short c = 20;
		
		short d = (short)(c - b);	//int보다 작은 정수 타입은 int로 형변환 후 연산이 수행된다.
									//int로 형변환하는 과정이 추가되기 때문에 시간이 더 걸릴 수 있다.(조금)
									//때문에 정수타입의 변수를 사용할 때 int타입을 많이 사용한다.
		//4바이트인 int로 바꿔서 연산한다. 아마도 short(2) 최대 값과 short(2) 최대 값을 더했을 때 범위가 초과하기 때문인 것 같다.
		
		long e1 = 100000 * 100000;	//int와 int의 연산 결과는 int이다. 오버플로우가 발생하기 때문에 결과는 1410065408이 나온다.
		long e2 = 100000 * 100000;	//피연산자 중 하나는 long이어야 결과로 long을 얻을 수 있다.
		System.out.println(e1);
		System.out.println(e2);
		
		float f1 = 10 / 4f;			//마찬가지로 float 또한 피연산자 중 하나는 float타입이어야 한다.
		System.out.println(f1);
		int f3 = 10 % 3;
		System.out.println(f3);
		
		//정수는 0으로 나눌 수 없다.
		//int g1 = 10 / 0; 컴파일은 되나 실행 시 런타임 에러가 발생한다. 에러 이유로 / by zero라는 메세지가 나온다.
		float g2 = 10.0f / 0;
		System.out.println(g2);		//결과 Infinity라고 나옴.
		float g3 = 0 / 0f;
		System.out.println(g3);		//결과 NaN이라고 나옴. Not a Number 숫자가 아님.
		//만약 다른 변수에 g2, g3를 넣으면 어떻게 되는가?
		float g4 = g2;
		float g5 = g3;
		System.out.println(g4);
		System.out.println(g5);		//결과 똑같이 나옴.
		int g6 = (int)g2;
		System.out.println(g6);		//결과 2147483647
		
		char h1 = 'A';
		char h2 = (char)(h1 + 1);
		System.out.println(h2);		//결과 B
		
		int h3 = 'D' - 'A';
		System.out.println(h3);		//결과 3
		
		int h4 = '5' - '0';			//'5'는 53, '0'은 48
		
		int i = 0;
		System.out.println(i);
		i = i + 1;
		System.out.println(i);
		i++;
		System.out.println(i);
		++i;
		System.out.println(i);
		System.out.println(i++);
		System.out.println(i);
		System.out.println(++i);
		i += 1;
		System.out.println(i);		//c언어와 동일
		
		i -= 1;
		i *= 1;
		i /= 1;
		i %= 10;
		System.out.println(i);
		
		//소수점 반올림
		//0.5를 더하고 int로 형변환 한다.
		float j = 1.66f;
		System.out.println((int)(j+0.5));
		
		//Math.round() 메서드를 사용한다. 소수점 첫째자리에서만 반올림 가능
		System.out.println(Math.round(j));
		
		//둘째자리 이상에서는 자리수를 곱한다음 수행하고 다시 나눠준다. 형변환을 해주어야 정상 동작.
		j *= 10.0f;
		System.out.println(j);		//자리수를 옮기기 위해서 10.0을 곱한다.
		j += 0.5f;
		System.out.println(j);		//반올림을 하기위해서 0.5를 더한다.
		j = (int)j;
		System.out.println(j);		//소수점을 지우기 위해서 int형으로 형변환한다.
		/*j = (float)j;
		System.out.println(j);*/	//float으로 바꿀 필요 없음. 연산 후에 float j로 대입하였기 때문.
		j /= 10.0f;
		System.out.println(j);		//다시 자리수를 처음상태로 돌리기 위해서 10.0을 나눈다.
		//System.out.println((float)((int)((j*10.0f)+0.5f))/10.0f);
		System.out.println(((int)((j*10.0f)+0.5f))/10.0f);
		
		//문제1. 다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		//1. 123456 + 654321
		//2. 1번의 결과값 * 123456
		//3. 2번의 결과값 / 123456
		//4. 3번의 결과값 - 654321
		//5. 4번의 결과값 % 123456
		
		long test_number = 0;
		test_number = 123456 + 654321;
		System.out.println(test_number);
		test_number *= 123456;
		System.out.println(test_number);
		test_number /= 123456;
		System.out.println(test_number);
		test_number -= 654321;
		System.out.println(test_number);
		test_number %= 123456;
		System.out.println(test_number);
		
		//문제2. 3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 구해주세요.
		//평균은 소수점 둘째자리에서 반올림
		
		int num1 = 13;
		int num2 = 29;
		int num3 = 37;
		System.out.println("합계 = " + num1 + num2 + num3);
		System.out.println("평균 = " + (int)(((num1 + num2 + num3) / 3.0)*10.0+0.5)/10.0);
	}

}
