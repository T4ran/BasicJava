package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		/*
		 * <<조건문 if>>
		 * - if			: 조건식의 결과가 true이면 블럭안의 문장을 수행한다.
		 * - else if	: 다수의 조건이 필요할 때 if 뒤에 추가한다.
		 * - else		: 결과가 true인 조건식이 하나도 없는 경우를 위해 추가한다.
		 */
		int a=0;
		
		if(false)
			a = 10;
		else
			a = 20;
		System.out.println(a);
		//수행할 내용이 한 문장일 경우 블럭을 생략할 수 있다.
		if(a==20){
			System.out.println(a-5);
		}
		else if(a==10){
			System.out.println(a+5);
		}
		else{
			System.out.println(a);
		}
		
		int regNo = 1;
		String gender = null;
		
		if(regNo == 1 || regNo == 3){
			gender = "남자";
		}
		else if(regNo == 2 || regNo == 4){
			gender = "여자";
		}
		else{
			gender = "알수없음";
		}
		System.out.println(gender);
		
		//수행할 내용이 동일한 경우 논리연산자를 사용해 조건식을 결합할 수 있다.
		
		//성적에 등급을 부여하는 프로그램을 만들어보자.
		int score = 99;
		String grade = null;
		
		if(score >= 90)
			grade = "A";
		else if(score >= 80)
			grade = "B";
		else if(score >= 70)
			grade = "C";
		else if(score >= 60)
			grade = "D";
		else
			grade = "F";
		System.out.println(score + "점인 당신의 등급은 " + grade + "입니다." );
		
		//등급 안에서 +와 -를 나누어보자.
		if(score >= 90){
			grade = "A";
			if(score >= 97)
				grade += "+";
			else if(score <= 93)
				grade += "-";
		}
		else if(score >= 80){
			grade = "B";
			if(score >= 87)
				grade += "+";
			else if(score <= 83)
				grade += "-";
		}
		else if(score >= 70){
			grade = "C";
			if(score >= 77)
				grade += "+";
			else if(score <= 73)
				grade += "-";
		}
		else if(score >= 60){
			grade = "D";
			if(score >= 67)
				grade += "+";
			else if(score <= 63)
				grade += "-";
		}
		else
			grade = "F";
		System.out.println(score + "점인 당신의 등급은 " + grade + "입니다." );	
		
		
		/*
		 *<<조건문 switch>>
		 * - 조건식과 일치하는 case문 이후의 문장을 수행한다.
		 * - 조건식의 결과는 정수와 문자열만(JDK1.7부터 문자열 허용) 허용한다.		<== ?
		 */
		
		regNo = 1;
		gender = null;
		switch(regNo){
		case 1 :
		case 3 :
			gender = "남자";
			break;
		case 2 :
		case 4 :
			gender = "여자";
			break;
		default :
			gender = "알수없음";
			break;
		}
		System.out.println(gender);
		
		score = 100;
		switch(score / 10){
		case 9 :
			grade = "A";
			break;
		case 8 :
			grade = "B";
			break;
		case 7 :
			grade = "C";
			break;
		case 6 :
			grade = "D";
			break;
		default :
			grade = "F";
			break;
		}
		
		switch(score % 10){
		case 0:
		case 1:
		case 2:
		case 3:
			grade += "-";
			break;
		case 7:
		case 8:
		case 9:
			grade += "+";
			break;
		default:
			break;
		}
		
		switch(score / 10){
		case 10:
			grade = "A+";
		default:
			break;
		}
		System.out.println(score + "점인 당신의 등급은 " + grade + "입니다.");
		
		//문제 1. 숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력해주세요.
		/*Scanner str = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요 : ");
		int num = Integer.parseInt(str.nextLine());
		System.out.println(num);
		if(num == 0)
			System.out.println("입력받은 숫자는 0입니다.");
		else
			System.out.println("입력받은 숫자는 0이 아닙니다.");*/
		
		//문제 1_5. 숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력해주세요.(단, 문자열을 비교할 수 있도록 수정)
		/*Scanner str = new Scanner(System.in);					//문자열 비교는 (A).equals((B));로 가능하다
		System.out.println("숫자를 입력해주세요 : ");
		String num = str.nextLine();
		System.out.println(num);
		if(num.equals("0"))
			System.out.println("입력받은 숫자는 0입니다.");
		else
			System.out.println("입력받은 숫자는 0이 아닙니다.");*/
		
		//문제 2. 숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요.
		/*Scanner num1 = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요 : ");
		int num = Integer.parseInt(num1.nextLine());
		if(num%2==0 && num!=0)
			System.out.println("짝수입니다.");
		else if(num == 0)
			System.out.println("0입니다.");
		else
			System.out.println("홀수입니다.");*/
		
		//문제 3. 점수 3개를 입력받아 총점, 평균, 등급을 출력해주세요.
		Scanner number = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해주세요 : ");
		int num1 = Integer.parseInt(number.nextLine());
		System.out.println("두번째 숫자를 입력해주세요 : ");
		int num2 = Integer.parseInt(number.nextLine());
		System.out.println("세번째 숫자를 입력해주세요 : ");
		int num3 = Integer.parseInt(number.nextLine());
		int sum=num1+num2+num3;
		System.out.println("총점은 " + sum + "입니다.");
		System.out.println("평균은 " + ((int)(sum/3.0f*100+0.5f)/100.0f) + "입니다.");
		switch(sum/30)
		{
		case 10:
		case 9:
		case 8:
			System.out.println("등급은 A입니다.");
			break;
		case 7:
		case 6:
		case 5:
			System.out.println("등급은 B입니다.");
			break;
		default:
			System.out.println("등급은 C입니다.");
			break;
		}
	}
}
