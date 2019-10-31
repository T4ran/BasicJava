package a_variable;

//Ctrl + Shift + o : 자동 참조
import java.util.Scanner;

public class Variable {
	public static void main(String[] args){
		/*
		 * << 변수 >>
		 * - 하나의 데이터를 저장할 수 있는 메모리상의 공간
		 * 
		 * << 사용 가능한 기본형 데이터의 종류 >>
		 * - 정수 : byte(1), short(2), int(4), long(8)
		 * - 실수 : float(4), double(8)
		 * - 문자 : char(2)
		 * - 논리 : boolean(1)
		 * 
		 * - 데이터를 사용하기 위해서는 어떤 종류의 데이터를 사용할 것인지 그것의 이름이 무엇인지 알려줘야 한다.
		 * 
		 * << 명명 규칙 >>
		 * - 블럭안에서 변수명은 중복될 수 없다.
		 * - 영문자 대소문자, 한글, 숫자, 특수문자('_','$')를 사용할 수 있다.
		 * 	(한글 사용은 자제)
		 * - 대소문자가 구분되며 길이에 제한이 없다.
		 * - 숫자로는 시작할 수 없다.
		 * - 예약어는 사용할 수 없다.
		 * - [기본적으로 변수는 소문자를 사용하고, 상수는 대문자를 사용한다.]
		 * - [여러 단어로 이루어진 경우 단어의 첫 글자는 대문자로 한다.(상수는 언더바로 구분)]
		 * - [클래스명의 첫글자는 대문자로 한다.]
		 * - [패키지명은 모두 소문자로 한다.]
		 */
		
		//변수 선언 방법 : 데이터 타입 + 변수 이름. C언어와 동일하지만 데이터 타입의 크기가 다름.
		int number = 10000; //warning이 뜨는 이유는 변수가 선언되었지만 아무곳에서도 쓰이지 않았기 때문.
		System.out.printf("%5d\n", number);//warning을 없애기 위해서 넣었다.
		byte abc;
		char moonja;
		
		//기본형 타입 8개를 사용하여 변수를 선언
		byte _byte;
		short _short;
		int _int;
		long _long;
		float _float;
		double _double;
		char _char;
		boolean _boolean;
		
		//선언한 이후 변수를 사용할 때는 변수의 이름으로 사용한다.
		//변수에 값을 저장하지 않으면 변수의 값을 참조할 수 없다.
//		System.out.println(i);//컴파일 에러(Syntax Error 문법 오류)가 발생한 이유 - 변수 값이 저장되지 않았음.
		
		//=(대입 연산자) : 대입 연산자 오른쪽의 값을 왼쪽(변수)에 저장한다.
		
		_byte = 123;//변수 타입에 맞는 값을 저장해야만 한다.
		_long = 900L;//long 접미사 : L
		_float = 3.14f;//float 접미사 : f
		_double = 3.14;//double의 접미사 : d(생략가능)
		_char = '가';
		_boolean = true;
		_boolean = false;
		//초기화 : 변수에 처음으로 값을 저장하는 것.
		System.out.println(_boolean);
		_boolean = true;
		
		//위에서 초기화한 변수에 새로운 값을 저장하고 출력.
		_byte = 127;
		_short = 32767;
		_int = 3;
		_long = 4L;
		_float = 1.1f;
		_double = 2.2;
		_char = '나';
		_boolean = true;
		
		System.out.println(_byte);
		System.out.println(_short);
		System.out.println(_int);
		System.out.println(_long);
		System.out.println(_float);
		System.out.println(_double);
		System.out.println(_char);
		System.out.println(_boolean);
		
		//String : 여러개의 문자를 편리하게 사용하기 위한 클래스
		//문자열 : ""로 감싸진 글자
		String _String = new String("abcdefg");
		
		System.out.println(_String);
		
		/*
		 * << 리터럴의 종류 >>
		 * - 숫자 : 0, 10, -5, 3.14
		 * - 문자 : '가', 'a', '0', ' '
		 * - 문자열 : "가나다", "abc", "123", "   ", ""
		 * - 그 외 : true, false, null
		 * 
		 * << 참조형 타입 >>
		 * - 기본형 타입을 제외한 모든 데이터 타입(배열, 클래스 등)
		 * - ex) String, ABC, Variable
		 * - 값이 변수에 저장되지 않고 따로 저장되며, 그 주소가 변수에 저장된다.
		 * - 변수의 크기는 4byte 이다.
		 */
		
		//기본값 : 전역변수에 아무것도 저장하지 않았을 때 저장되어 있는 값
		_byte = 0;
		_short = 0;
		_int = 0;
		_long = 0L;
		_float = 0.0f;
		_double = 0.0d;
		_char = '\u0000';// ' '. "\ u"는 유니코드를 표기할 때 쓴다. 주석 안쪽에 \ u를 붙여서 썼을 때 에러가 발생함.
		_boolean = false;
		_String = null;
		
		//경우에 따라 변수에 타입이 다른 값을 저장한다.
		//ex) _byte = (byte)_int; 형변환 : 데이터 타입을 변환하는 것.
		
		_byte = -128;
		_int = -129;
		_byte = (byte)_int;
		System.out.println(_byte);// -129 -> 127(언더 플로우)
		//표현범위가 큰 타입에서 작은 타입으로 형변환 할 경우
		//데이터가 손실될 수 있다.
		
		_double = 3.14;
		_int = (int)_double;
		System.out.println(_int);
		//int는 소수점을 표현할 수 없으므로 소수점이 손실된다.
		
		//표현범위가 작은 타입에서 큰 타입으로 형변환 할 경우 데이터가 손실될 염려가 없다.
		//그러므로 형변환을 생략할 수 있다.
		_int = _byte;
		_long = _int;
		_double = _int;
		
		//위에서 만든 변수들을 작은 타입으로 형변환 3번
		//위에서 만든 변수들을 큰 타입으로 형변환 3번
		
		_short = (short)_long;
		_float = (float)_double;
		_byte = (byte)_double;
		
		_long = (long)_short;
		_double = (double)_float;
		_double = (double)_byte;
		
		//콘솔창에서 입력받는 방법
//		Scanner s = new Scanner(System.in);
//		System.out.println("문자열을 입력해주세요>");
//		String input1 = s.nextLine();
//		System.out.println("입력받은 문자열 : " + input1);
//		
//		System.out.println("숫자를 입력해주세요 >");
//		int input2 = Integer.parseInt(s.nextLine());
//		System.out.println("입력받은 숫자 : " + input2);
		
		//문자열을 입력받고 입력받은 문자열 출력.
		Scanner str = new Scanner(System.in);
		System.out.println("문자를 입력 ");
		String InputMsg = str.nextLine();
		System.out.println("입력된 문자 : " + InputMsg);
		//숫자를 입력받고 입력받은 숫자를 출력.
		System.out.println("숫자를 입력 ");
		int InputNum = Integer.parseInt(str.nextLine());
		System.out.println("입력된 숫자 : " + InputNum);
		
		//위에서 입력받은 문자열과 숫자를 더해서 출력.
		System.out.println("입력된 문자열과 숫자 : " + InputMsg + InputNum);
		//문자열과 다른 타입의 데이터를 더한 결과의 타입은 문자열이 된다.
		
		/*
		 * << 상수 >>
		 * - 값을 한번 저장하면 변경할 수 없는 저장공간
		 * - final int MAX_NUMBER;
		 * - 리터럴에 의미를 부여하기 위해 사용한다.
		 */
		
		final int MAX_NUMBER = 1;
//		MAX_NUMBER = 10;	//상수에 다시 값을 넣으면 에러가 발생함.
//		MAX_NUMBER = 100;
		
	}

}
