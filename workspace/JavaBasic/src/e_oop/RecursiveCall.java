package e_oop;

public class RecursiveCall {

	public static void main(String[] args) {
		/*
		 * <<재귀호출>>
		 * - 메서드 내에서 메서드 자신을 호출하는 것이다.
		 * - 재귀호출을 하는 메서드를 재귀 메서드라고 한다.
		 * - 무한반복을 벗어나기 위한 조건이 있어야 한다.
		 */
		
		//팩토리얼을 만들어보자. ex) 4! == 4*3*2*1 == 24
		int result = factorial(4);
		System.out.println(result);
	}
	
	static int factorial(int i)
	{
		int result = 0;
		
		if(i==-1)
			result=-1;
		else if(i==1)
			result=1;
		else if(i<0)
			result=i*factorial(i+1);
		else
			result=i*factorial(i-1);
		
		return result;
	}

}
