package c_statement;

import java.util.Scanner;

public class SimLiTest {

	public static void main(String[] args) {
		Scanner ans = new Scanner(System.in);
		String result = null;
		char ch = 0x22, ch2 = 46;
		
		System.out.println("[인포그래픽] 말해 YES or NO! 나의 연애 유형은?");
		System.out.println("나는 어떤 연애 유형을 가지고 있는지 궁금하지 않으신가요?!\n재미있는 연애 심리테스트를 서울우유의 음료와 커피로 알아보세요!");
		System.out.println("(모든 질문의 답변은 Y 혹은 N으로 해주세요.)\n");
		
		System.out.println("1. 나는 금사빠다.(*금방 사랑에 빠진다.)");
		String answer = ans.nextLine();
		if(answer.equals("Y")||answer.equals("y"))
		{
			System.out.println("2. 연애할 때 끌려다니는 타입이다.");
			answer = ans.nextLine();
			if(answer.equals("Y")||answer.equals("y"))
			{
				System.out.println("3. 감정표현에 솔직한 편이다.");
				answer = ans.nextLine();
				if(answer.equals("Y")||answer.equals("y"))
				{
					System.out.println("4. 이성친구는 존재할 수 없다.");
					answer = ans.nextLine();
					if(answer.equals("Y")||answer.equals("y"))
					{
						System.out.println("5. 아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
						answer = ans.nextLine();
						if(answer.equals("Y")||answer.equals("y"))
						{
							result = "D";
						}
						else if(answer.equals("N")||answer.equals("n"))
						{
							result = "C";
						}
						else
							System.out.println("잘못 입력하셨습니다.");
					}
					else if(answer.equals("N")||answer.equals("n"))
					{
						result = "B";
					}
					else
						System.out.println("잘못 입력하셨습니다.");
				}
				else if(answer.equals("N")||answer.equals("n"))
				{
					System.out.println("4. 활동적인 데이트가 좋다.");
					answer = ans.nextLine();
					if(answer.equals("Y")||answer.equals("y"))
					{
						System.out.println("5. 이성친구는 존재할 수 없다.");
						answer = ans.nextLine();
						if(answer.equals("Y")||answer.equals("y"))
						{
							System.out.println("6. 아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
							answer = ans.nextLine();
							if(answer.equals("Y")||answer.equals("y"))
							{
								result = "D";
							}
							else if(answer.equals("N")||answer.equals("n"))
							{
								result = "C";
							}
							else
								System.out.println("잘못 입력하셨습니다.");
						}
						else if(answer.equals("N")||answer.equals("n"))
						{
							result = "B";
						}
						else
							System.out.println("잘못 입력하셨습니다.");
					}
					else if(answer.equals("N")||answer.equals("n"))
					{
						System.out.println("5. 아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
						answer = ans.nextLine();
						if(answer.equals("Y")||answer.equals("y"))
						{
							result = "D";
						}
						else if(answer.equals("N")||answer.equals("n"))
						{
							result = "C";
						}
						else
							System.out.println("잘못 입력하셨습니다.");
					}
					else
						System.out.println("잘못 입력하셨습니다.");
				}
				else
					System.out.println("잘못 입력하셨습니다.");
			}
			else if(answer.equals("N")||answer.equals("n"))
			{
				System.out.println("3. 데이트 코스는 미리 짜는게 편하다.");
				answer = ans.nextLine();
				if(answer.equals("Y")||answer.equals("y"))
				{
					System.out.println("4. 활동적인 데이트가 좋다.");
					answer = ans.nextLine();
					if(answer.equals("Y")||answer.equals("y"))
					{
						System.out.println("5. 이성친구는 존재할 수 없다.");
						answer = ans.nextLine();
						if(answer.equals("Y")||answer.equals("y"))
						{
							System.out.println("6. 아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
							answer = ans.nextLine();
							if(answer.equals("Y")||answer.equals("y"))
							{
								result = "D";
							}
							else if(answer.equals("N")||answer.equals("n"))
							{
								result = "C";
							}
							else
								System.out.println("잘못 입력하셨습니다.");
						}
						else if(answer.equals("N")||answer.equals("n"))
						{
							result = "B";
						}
						else
							System.out.println("잘못 입력하셨습니다.");
					}
					else if(answer.equals("N")||answer.equals("n"))
					{
						System.out.println("5. 아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
						answer = ans.nextLine();
						if(answer.equals("Y")||answer.equals("y"))
						{
							result = "D";
						}
						else if(answer.equals("N")||answer.equals("n"))
						{
							result = "C";
						}
						else
							System.out.println("잘못 입력하셨습니다.");
					}
					else
						System.out.println("잘못 입력하셨습니다.");
				}
				else if(answer.equals("N")||answer.equals("n"))
				{
					System.out.println("4. 감정표현에 솔직한 편이다.");
					answer = ans.nextLine();
					if(answer.equals("Y")||answer.equals("y"))
					{
						System.out.println("5. 이성친구는 존재할 수 없다.");
						answer = ans.nextLine();
						if(answer.equals("Y")||answer.equals("y"))
						{
							System.out.println("6. 아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
							answer = ans.nextLine();
							if(answer.equals("Y")||answer.equals("y"))
							{
								result = "D";
							}
							else if(answer.equals("N")||answer.equals("n"))
							{
								result = "C";
							}
							else
								System.out.println("잘못 입력하셨습니다.");
						}
						else if(answer.equals("N")||answer.equals("n"))
						{
							result = "B";
						}
						else
							System.out.println("잘못 입력하셨습니다.");
					}
					else if(answer.equals("N")||answer.equals("n"))
					{
						System.out.println("5. 활동적인 데이트가 좋다.");
						answer = ans.nextLine();
						if(answer.equals("Y")||answer.equals("y"))
						{
							System.out.println("6. 이성친구는 존재할 수 없다.");
							answer = ans.nextLine();
							if(answer.equals("Y")||answer.equals("y"))
							{
								System.out.println("7. 아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
								answer = ans.nextLine();
								if(answer.equals("Y")||answer.equals("y"))
								{
									result = "D";
								}
								else if(answer.equals("N")||answer.equals("n"))
								{
									result = "C";
								}
								else
									System.out.println("잘못 입력하셨습니다.");
							}
							else if(answer.equals("N")||answer.equals("n"))
							{
								result = "B";
							}
							else
								System.out.println("잘못 입력하셨습니다.");
						}
						else if(answer.equals("N")||answer.equals("n"))
						{
							System.out.println("6. 아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
							answer = ans.nextLine();
							if(answer.equals("Y")||answer.equals("y"))
							{
								result = "D";
							}
							else if(answer.equals("N")||answer.equals("n"))
							{
								result = "C";
							}
							else
								System.out.println("잘못 입력하셨습니다.");
						}
						else
							System.out.println("잘못 입력하셨습니다.");
					}
					else
						System.out.println("잘못 입력하셨습니다.");
				}
				else
					System.out.println("잘못 입력하셨습니다.");
			}
			else
				System.out.println("잘못 입력하셨습니다.");
		}
		else if(answer.equals("N")||answer.equals("n"))
		{
			System.out.println("2. 감정기복이 크지않다.");
			answer = ans.nextLine();
			if(answer.equals("Y")||answer.equals("y"))
			{
				System.out.println("3. 연락이없어도 믿고 기다리는 편이다.");
				answer = ans.nextLine();
				if(answer.equals("Y")||answer.equals("y"))
				{
					result = "A";
				}
				else if(answer.equals("N")||answer.equals("n"))
				{
					System.out.println("4. 이성친구는 존재할 수 없다.");
					answer = ans.nextLine();
					if(answer.equals("Y")||answer.equals("y"))
					{
						System.out.println("5. 아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
						answer = ans.nextLine();
						if(answer.equals("Y")||answer.equals("y"))
						{
							result = "D";
						}
						else if(answer.equals("N")||answer.equals("n"))
						{
							result = "C";
						}
						else
							System.out.println("잘못 입력하셨습니다.");
					}
					else if(answer.equals("N")||answer.equals("n"))
					{
						result = "B";
					}
					else
						System.out.println("잘못 입력하셨습니다.");
				}
				else
					System.out.println("잘못 입력하셨습니다.");
			}
			else if(answer.equals("N")||answer.equals("n"))
			{
				System.out.println("3. 감정표현에 솔직한 편이다.");
				answer = ans.nextLine();
				if(answer.equals("Y")||answer.equals("y"))
				{
					System.out.println("4. 이성친구는 존재할 수 없다.");
					answer = ans.nextLine();
					if(answer.equals("Y")||answer.equals("y"))
					{
						System.out.println("5. 아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
						answer = ans.nextLine();
						if(answer.equals("Y")||answer.equals("y"))
						{
							result = "D";
						}
						else if(answer.equals("N")||answer.equals("n"))
						{
							result = "C";
						}
						else
							System.out.println("잘못 입력하셨습니다.");
					}
					else if(answer.equals("N")||answer.equals("n"))
					{
						result = "B";
					}
					else
						System.out.println("잘못 입력하셨습니다.");
				}
				else if(answer.equals("N")||answer.equals("n"))
				{
					System.out.println("4. 활동적인 데이트가 좋다.");
					answer = ans.nextLine();
					if(answer.equals("Y")||answer.equals("y"))
					{
						System.out.println("5. 이성친구는 존재할 수 없다.");
						answer = ans.nextLine();
						if(answer.equals("Y")||answer.equals("y"))
						{
							System.out.println("6. 아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
							answer = ans.nextLine();
							if(answer.equals("Y")||answer.equals("y"))
							{
								result = "D";
							}
							else if(answer.equals("N")||answer.equals("n"))
							{
								result = "C";
							}
							else
								System.out.println("잘못 입력하셨습니다.");
						}
						else if(answer.equals("N")||answer.equals("n"))
						{
							result = "B";
						}
						else
							System.out.println("잘못 입력하셨습니다.");
					}
					else if(answer.equals("N")||answer.equals("n"))
					{
						System.out.println("5. 아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
						answer = ans.nextLine();
						if(answer.equals("Y")||answer.equals("y"))
						{
							result = "D";
						}
						else if(answer.equals("N")||answer.equals("n"))
						{
							result = "C";
						}
						else
							System.out.println("잘못 입력하셨습니다.");
					}
					else
						System.out.println("잘못 입력하셨습니다.");
				}
				else
					System.out.println("잘못 입력하셨습니다.");
			}
			else
				System.out.println("잘못 입력하셨습니다.");
		}
		else
			System.out.println("잘못 입력하셨습니다.");
		
		switch(result)
		{
		case "A":
			System.out.println("A : 당신은 " + ch + "스페셜티 카페라떼 프리미엄 타입" + ch +
								"\n서로에 대한 신뢰감이 깊고, 존중해주는"
								+ "\n어른스러운 연애를 하는 타입!");
			break;
		case "B":
			System.out.println("B : 당신은 " + ch + "스페셜티 카페라떼 타입" + ch +
					"\n구속을 하는 것도, 받는 것도 싫은"
					+ "\n자유로운 연애를 하는 타입!");
			break;
		case "C":
			System.out.println("C : 당신은 " + ch + "아침에주스 오렌지 타입" + ch +
					"\n이것은 의리인가 사랑인가" + ch2 + ch2 + ch2
					+ "\n친구같이 편안한 연애를 하는 타입!");
			break;
		case "D":
			System.out.println("D : 당신은 " + ch + "아침에주스 유기농 타입" + ch +
					"\n무조건 잘해주고, 무조건 맞춰주는"
					+ "\n다 퍼주는 연애를 하는 타입!");
		default:
			break;
		}
	}

}
