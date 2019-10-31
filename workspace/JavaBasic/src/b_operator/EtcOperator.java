package b_operator;

public class EtcOperator {

	public static void main(String[] args) {
		/*
		 * <<비트 연산자>>
		 * - |(OR)		: 피연산자 중 한 쪽이라도 값이 1이면, 1을 그외는 0을 결과로 얻는다.
		 * - &(AND)		: 피연산자 양 쪽이 모두 1이어야만 1을 그외는 0을 결과로 얻는다.
		 * - ^(XOR)		: 피연산자의 값이 서로 다를 때만 1을 같을때는 0을 결과로 얻는다.
		 * - ~(비트전환)	: 피연산자의 값이 0이면 1로 1이면 0으로 바꾼다.
		 * - <<(좌쉬프트)	: 피연산자의 각 자리를 왼쪽으로 이동시킨다. 빈칸은 0으로 채운다.
		 * - >>(우쉬프트)	: 피연산자의 각 자리를 오른쪽으로 이동시킨다. 빈칸은 0으로 채운다.
		 * 
		 * <<기타 연산자>>
		 * - .(참조연산자)	: 특정 범위 내에 속해 있는 멤버를 지칭할 떄 사용한다.
		 * - (type)			: 형변환(casting)
		 * - ?:(삼항연산자)	: 조건식 ? 조건식이 참일 경우 수행할 문장 : 조건식이 거짓일 경우 수행할 문장
		 * - instanceof		: 참조형 타입 확인
		 */
		
		byte i = -128;
		i >>= 1;
		System.out.println(i);
		
		//1바이트는 8비트로 이루어져있고 1비트는 0 또는 1을 표현할 수 있다.
		//즉, 1바이트는 8개의 0 또는 1을 표현할 수 있다.
		
		/*
		 *	- 10진수 -> 2진수		: 10진수 값을 1이 될 때까지 2로 나눈다.
		 *	- 2진수	-> 10진수	: 각 n번째 자리에 2^(n-1)을 곱한다.
		 *
		 *	15_(10) -> 1111_(2)		1111_(2) -> 15_(10)
		 */
		
		//10	: 00001010
		//15	: 00001111
		
		//10|15	: 00001111
		System.out.println(10|15);
		//10&15	: 00001010
		System.out.println(10&15);
		//10^15	: 00000101
		System.out.println(10^15);
		//~10	: 11110101
		System.out.println(~10);
		//10<<1	: 00010100
		System.out.println(10<<1);
		//10>>1	: 00000101
		System.out.println(10>>1);
		
		int x = 10;
		int y = 20;
		int result = (x < y) ? x : y;
		System.out.println(result);
		
		//시험점수가 60점 이상이면 합격 미만이면 불합격
		int score = 60;
		String res = 60 <= score ?"합격" :"불합격";
		System.out.println(score + "점은" + res + "입니다");
		
		//주민등록번호 뒷자리의 첫번째 숫자가 1이면 남자 2면 여자
		int regNo = 5;
		res = regNo == 1 || regNo == 3?"남자입":(regNo == 2 || regNo == 4 ?"여자입":"확인할 수 없습");
		System.out.println("당신의 성별은 " + res + "니다.");
		
		//문제1. 두개의 변수에 저장된 수 중에 큰 숫자를 출력해주세요.
		int a1 = 14;
		int b1 = 19;
		int res1 = a1 < b1 ? b1 : a1;
		System.out.printf("%d\n",res1);
		
		//문제2. 변수에 저장된 수의 절대값을 출력해주세요.
		int c = -5;
		int res2 = c < 0 ? -c : c;
		System.out.println(res2);
		//System.out.println(~c+1);
		
		//문제3. 변수에 저장된 주민등록번호 뒷자리의 첫번째 숫자가 1이나 3이면 남자
		//2나 4면 여자를 출력해주세요.
		//그외의 숫자를 입력하면 "잘못 입력하셨습니다."를 출력해주세요.
		int id = 1;
		String res3 = id == 1 || id == 3 ?"남자":(id == 2 || id == 4?"여자":"잘못 입력하셨습니다.");
		System.out.println(res3);
	}

}
