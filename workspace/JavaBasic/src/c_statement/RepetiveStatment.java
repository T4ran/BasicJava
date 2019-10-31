package c_statement;

import java.util.Scanner;

public class RepetiveStatment {

	public static void main(String[] args) {
		/*
		 * <<반복문 for>>
		 * - for(int i=1; i<=10; i++){}
		 * - for(1부터 10까지 1씩 증가하면서 반복){}
		 */
		
		/*for(int i=1; i<=10; i++)
		{
			//for(초기화; 조건식; 증감식){}
			//초기화 : 조건식과 증감식에 사용할 변수 초기화
			//조건식 : 연산결과가 true이면 블럭안의 내용을 수행한다.
			//증감식 : 변수를 증가/감소시켜 반복문을 제어한다.
			System.out.println(i + "번째 반복");
			//초기화한 변수를 블럭안에서 사용할 수 있다.
		}*/
		
		int sum = 0;	//1부터 10까지 합계를 저장
		
		/*sum += 1;
		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;
		sum += 6;
		sum += 7;
		sum += 8;
		sum += 9;
		sum += 10;
		System.out.println(sum);
		
		sum = 0;
		for(int j=1; j<=10; j++)
		{
			sum += j;
		}
		System.out.println(sum);
		
		sum = 0;
		
		for(int k=100; k >= 1; k--)
		{
			sum += k;
		}
		System.out.println(sum);
		
		sum = 0;*/
		//1부터 100까지 짝수의 합을 구해보자.
		/*for(int l=1; l<=100; l++)
		{
			if(l%2==0)
				sum+=l;
		}
		System.out.println(sum);*/
		
		/*for(int i=1; i<=100; i++)
		 {
		 	switch(i%2)
		 	{
		 		case 0:
		 			sum+=i;
		 		default:
		 			break;
		 	}
		 }
		 System.out.println(sum);
		 */
		/*sum=0;
		for(int u=1; u<=100; u++)
		{
			switch(u%2)
			{
			case 1:
				sum+=u;
			default:
				break;
			}
		}
		System.out.println(sum);*/
		
		//구구단 출력.
		/*Scanner num = new Scanner(System.in);
		int number = 0;
		
		System.out.println("구구단을 출력합니다.\n출력을 원하는 단수를 입력해주세요 : ");
		number = Integer.parseInt(num.nextLine());
		if(number >= 1 && number <= 9)
		{
			for(int i=1; i<=9; i++)
				System.out.println(number + " * " + i + " = " + number*i);
		}
		else
			System.out.println("잘못입력하셨습니다.");*/
		
		
		/*for(int i=1; i<=9; i++)
		{
			System.out.println("7 * " + i +" = " + 7*i);
		}*/
		
		/*for(int i=2; i<=9; i++)
		{
			for(int j=1; j<=9; j++)
				System.out.println(i + " * " + j + " = " + i*j);
		}*/
		
		//구구단 전체의 짝수단의 홀수줄만 출력해주세요.
		/*for(int i=2; i<=9; i++)
		{
			for(int j=1; j<=9; j++)
			{
				if(i%2==0 && j%2==1)
					System.out.println(i + " * " + j + " = " + i*j);
			}
		}*/
		
		//구구단 전체를 가로로 출력해주세요.
		/*for(int i=1; i<=9; i++)
		{
			for(int j=2; j<=9; j++)
				System.out.printf(j + " * " + i + " = " + "%2d" + "\t", i*j);
			System.out.print("\n");
		}*/
		
		/*
		 * <<반복문 while>>
		 * - while(조건식){}
		 * - 조건식의 결과가 true인 동안 계속해서 반복
		 * - 반복횟수를 알 수 없을 때 사용한다.
		 */
		
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		/*while(true)
		{
			System.out.println("원하시는 단수를 입력하세요.(1~9, 0 : 종료)");
			num = Integer.parseInt(input.nextLine());
			
			if(num == 0)
			{
				System.out.println("종료되었습니다.");
				break;
			}
			else
			{
				for(int i=1; i<=9; i++)
					System.out.println(num + " * " + i + " = " + num*i);
			}
		}*/
		
		/*
		 * <<반복문 do-while>>
		 * - do{}while(조건식);
		 * - 최소한 한번의 수행을 보장한다.
		 */
		
		//숫자 맞추기
		/*int answer = (int)(Math.random()*100)+1;
		//1~100 사이의 랜덤 수를 발생시킨다.
		
		do{
			System.out.println("1~100 사이의 수를 입력해주세요>");
			num = Integer.parseInt(input.nextLine());
			
			if(answer < num)
				System.out.println(num + "보다 작습니다.");
			else if(answer > num)
				System.out.println(num + "보다 큽니다.");
			else
				System.out.println("정답입니다.");
		}
		while(num != answer);*/
		
		//이름붙은 반복문	//(?)	반복문 말고도 다른 것에 이름을 붙일 수 있는가? No. 반복문에만 이름을 붙일 수 있다. 그리고 보통 이름을 붙이는 적이 없다.
		/*outer : for(int i=2; i<=9; i++)
		{
			for(int j=1; j<=9; j++)
			{
				if(j==5)
				{
					//break;		//가장 가까운 반복문 하나를 빠져나간다.
					break outer;	//outer라는 이름의 반복문을 빠져나간다.//outer라는 이름은 임의로 지정한 것이다.
					//continue;		//가장 가까운 반복문의 현재 회차를 빠져나간다.//j가 5일때 아래의 프린트라인 메서드를 실행하지않고 j++
					//continue outer;	//outer라는 반복문의 현재 회차를 빠져나간다.
				}
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
		System.out.println();*/
		
		int answer1=0, answer2=0, answer3=0, strike=0, ball=0, out=0, count=0;
		int inputnum=0, inputnum1=0, inputnum2=0, inputnum3=0;
		while(answer1 == answer2 || answer1 == answer3 || answer2 == answer3)
		{
			answer1 = (int)(Math.random()*9) + 1;
			answer2 = (int)(Math.random()*9) + 1;
			answer3 = (int)(Math.random()*9) + 1;
			System.out.println(answer1+ "" + answer2+ "" + answer3);	//랜덤 숫자 확인용
		}
		
		System.out.println("숫자 야구 게임을 실행합니다.\n서로다른 3개의 숫자를 입력해주세요.(ex) 123)");
		
		while(strike!=3)
		{			
			strike=0;
			ball=0;
			out=0;
			count++;
			inputnum = Integer.parseInt(input.nextLine());
			/*System.out.println(inputnum);	//입력 숫자 확인용
*/			inputnum1 = inputnum/100;
			inputnum2 = (inputnum%100 - inputnum%10)/10;
			inputnum3 = inputnum%10;
			/*System.out.println(inputnum1);	//입력 숫자 확인용
			System.out.println(inputnum2);	//입력 숫자 확인용
			System.out.println(inputnum3);	//입력 숫자 확인용
*/			
			if(inputnum1==answer1)
				strike++;
			else if(inputnum1==answer2 || inputnum1==answer3)
				ball++;
			else
				out++;
			
			if(inputnum2==answer2)
				strike++;
			else if(inputnum2==answer1 || inputnum2==answer3)
				ball++;
			else
				out++;
			
			if(inputnum3==answer3)
				strike++;
			else if(inputnum3==answer1 || inputnum3==answer2)
				ball++;
			else
				out++;
			
			System.out.println("결과는 " + strike + "S " + ball + "B " + out + "O 입니다.");
			
		}
		System.out.println("정답입니다. " + count + "번 도전하셨습니다.");
	}

}



