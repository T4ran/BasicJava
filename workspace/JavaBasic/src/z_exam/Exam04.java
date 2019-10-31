package z_exam;

public class Exam04 {

	public static void main(String[] args) {
/*
[4-1] 다음의 문장들을 조건식으로 표현하라.
1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
(x>10 && x<20)
2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
(ch!=' ' || ch!='\t')
3. char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식
(ch=='x' || ch=='X')
4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식
(ch>=0 && ch<=9)
5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지
않을 때 true인 조건식
(year%400==0||(year%4==0 && year%100!=0))
7. boolean형 변수 powerOn가 false일 때 true인 조건식
(!powerOn)
8.문자열 참조변수 str이 "yes"일 때 true인 조건식
(str.equals("yes"))

[4-2] 1부터 20까지의 정수 중에서 2또는 3의 배수가 아닌 수의 총합을 구하시오.
int sum;
for(int i;i<=20;i++)
	if(i%2!=0 && i%3!=0)
		sum += i;
		
[4-3] 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
int sum;
for(int i=1;i<=10;i++)
	for(int j=1;j<=i;j++)
		sum += j;

[4-4] 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이
100이상이 되는지 구하시오.

int i=1, sum=0;

for(i=1;sum<=100;i++)
{
	switch(i%2)
	{
		case 0:
			sum -= i;
			break;
		case 1:
			sum += i;
		default:
			break;
	}
}
i-1의 값

[4-5] 다음의 for문을 while문으로 변경하시오.
public class Exercise4_5 {
	public static void main(String[] args) { 
		for(int i=0; i<=10; i++) { 
			for(int j=0; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}
	} // end of main 
} // end of class

int i=0, j=0;

while(i<=10)
{
	while(j<=i)
	{
		System.out.print("*");
		j++;
	}
	System.out.println();
	i++;
}		

[4-6] 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프
로그램을 작성하시오.

for(int i=1;i<=6;i++)
	for(int j=1;j<=6;j++)
		if(i+j==6)
			System.out.println("눈의 합이 6이 되는 경우는 i가 " + i + "이고 j가 " + j +"인 경우가 있습니다.");

[4-7] Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는
 코드를 완성하라. (1)에 알맞은 코드를 넣으시오.

class Exercise4_7 {
	public static void main(String[] args) { 
	int value = ( (1) );
	System.out.println("value:"+value);
}

(1) <== Math.random()*6 + 1

[4-8] 방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는
0<=x<=10, 0<=y<=10 이다.

for(int x=0;x<=10;x++)
	for(int y=0;y<=10;y++)
		if(2*x + 4*y == 10)
			System.out.println("x="x + ", " + "y=" + y + "일 때 2x+4y=10을 만족한다.")

[4-10] int타입의 변수 num이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를
완성하라. 만일 변수 num의 값이 12345라면, '1+2+3+4+5'의 결과인 15를 출력하라.
(1)에 알맞는 코드를 넣으시오.
[ 주의 ] 문자열로 변환하지 말고 숫자로만 처리해야 한다.


public static void main(String[] args) { 
	int num = 12345; 
	int sum = 0;
	
	(1)
	 
	System.out.println("sum="+sum);
}

(1)
while(num/10!=0)
{
	sum += num%10;
	num /= 10;
}

[4-11] 피보나치(Fibonnaci) 수열(數列) 은 앞을 두 수를 더해서 다음 수를 만들어 나가
는 수열이다. 예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 그 다음 수는
1과 2를 더해서 3이 되어서 1,1,2,3,5,8,13,21,...과 같은 식으로 진행된다. 1과 1부터
시작하는 피보나치수열의 10번째 수는 무엇인지 계산하는 프로그램을 완성하시오.

public class Exercise4_11 {
	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 1;
		int num3 = 0; 
		System.out.print(num1+","+num2);
		for (int i = 0 ; i < 8 ; i++ ) { 
		
		
		(1)
		
		}
	} // end of main 
} // end of class

num3 = num1 + num2;
num1 = num2;
num2 = num3;

[4-13] 다음은 주어진 문자열(value)이 숫자인지를 판별하는 프로그램이다. (1)에 알맞
은 코드를 넣어서 프로그램을 완성하시오.

class Exercise4_13 
{
	public static void main(String[] args) 
	{
		String value = "12o34"; 
		char ch = ' ';
		boolean isNumber = true;
		//charAt(int i)
		
		
		for(int i=0; i < value.length() ;i++)
		{ 
			(1)
		}
		
		if (isNumber)
		{		
			System.out.println(value+" 는 숫자입니다.");
		}
		else
		{		
			System.out.println(value+" 는 숫자가 아닙니다.");
		}
	} // end of main 
} // end of class

(1) <=
if(value.charAt(i)<=48 && value.charAt(i)>=57)
	isNumber = false;

[4-14] 다음은 숫자맞추기 게임을 작성한 것이다. 1과 100사이의 값을 반복적으로 입력
해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다. 사용자가 값을 입력하면, 컴퓨터는 자
신이 생각한 값과 비교해서 결과를 알려준다. 사용자가 컴퓨터가 생각한 숫자를 맞추면
게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다. (1)~(2)에 알맞은 코드를 넣어 프
로그램을 완성하시오.

class Exercise4_14{
	public static void main(String[] args)
	{
		int answer = (1);
		int input = 0; // 사용자입력을 저장할 공간 
		int count = 0; // 시도횟수를 세기위한 변수
		
		java.util.Scanner s = new java.util.Scanner(System.in); 
		
		do
		{
			count++;
			
			System.out.print("1과 100사이의 값을 입력하세요 :");
			
			input = s.nextInt();
			
			(2)
			
		} while(true); 
	} // end of main
} // end of class HighLow

(1) <== (int)(Math.random()*100)+1
(2)
if(input<answer)
	System.out.println("더 큰 수를 입력하세요.");
else if(input>answer)
	System.out.println("더 작은 수를 입력하세요.");
else
{
	System.out.println("맞췄습니다.\n시도 횟수는 " + count + "번 입니다.");
	break;
}

[4-15] 다음은 회문수를 구하는 프로그램이다. 회문수(palindrome)란, 숫자를 거꾸로 읽
어도 앞으로 읽는 것과 같은 수를 말한다. 예를 들면 ‘12321’이나 ‘13531’같은 수를 말한
다. (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
[Hint] 나머지 연산자를 이용하시오.

class Exercise4_15{
	public static void main(String[] args)
	{
		int number = 12321; 
		int tmp = number;
		
		int result =0;
		
		while(tmp !=0)
		{
			(1) 
		}
		if(number == result)
			System.out.println( number + "는 회문수입니다.");
		else 
			System.out.println( number + "는 회문수가 아닙니다.");
	}
}

(1)
result = result*10 + tmp%10;
tmp /= 10;

*/
	}

}
