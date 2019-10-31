package d_array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		/*
		 * << 배열 >>
		 * - int[] number = new int[5];	//기본값으로 초기화된다.
		 * - int number[] = new int[]{10, 20, 30, 40, 50};
		 * - int[] number = {10, 20, 30, 40, 50};
		 * 
		 */
		
		//배열은 참조형 타입이다.
		int[] array;	//배열의 주소를 저장할 공간이 만들어진다.
		array = new int[5];	//배열이 생성되고 그 주소가 저장된다.
		//new : 새로운 저장공간 생성 및 주소 반환
		//int[5] : int를 저장할 수 있는 5개의 공간
		//배열 초기화시 기본값이 저장된다.
		
		System.out.println(array);	//주소가 저장되어 있다.
		
		System.out.println(array[0]);
		//실제 값에 접근하기 위해서는 index를 지정해줘야 한다.
		//index에는 int만 사용할 수 있다.(리터럴, 변수, 상수, 연산 등)
		//배열의 최대 크기는 int의 최대값(약 20억)이다.
		
		String arrayStr = Arrays.toString(array);
		//배열의 모든 인덱스에 저장된 값을 문자열로 반환한다.
		System.out.println(arrayStr);	//int의 기본값인 0이 저장되어있다.
		
		int[] iArray1 = new int[]{1, 2, 3};	//값의 개수로 배열의 길이가 정해진다.
		int[] iArray2 = {1, 2, 3};	//선언과 초기화를 동시에 해야한다.
		int[] iArray3;
		//iArray3 = {1, 2, 3};	//컴파일 에러
		
		array[0] = 10;	//인덱스는 0부터 시작한다.
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;	//마지막 인덱스는 "배열의 길이 - 1"이다.
		
		//정수를 저장할 수 있는 길이가 10인 배열을 생성 및 초기화해주세요.
		int[] jArray1 = new int[10];
		arrayStr = Arrays.toString(jArray1);
		System.out.println(arrayStr);
		
		//모든 인덱스에 있는 값을 변경해주세요.
		for(int i=0;i<=9;i++)
		{
			jArray1[i] = i;
		}
		
		System.out.println(Arrays.toString(jArray1));
		
		//모든 인덱스에 있는 값을 더해주세요.
		int sum=0;
		for(int i=0;i<=9;i++)
		{
			sum += jArray1[i];
		}
		System.out.println(sum);
		
		//배열변수이름.length를 이용하면 배열의 길이를 구할 수 있다.
		//ex) array.length
		
		//배열의 길이를 알고있다고 리터럴을 사용하는 것을 하드코딩이라고 한다.
		//길이를 알더라도 length를 사용하는 것이 더 좋은 코드이다. 범용성
		
		for(int i=0;i<array.length;i++)
		{
			array[i] = i + 1;
		}
		System.out.println(Arrays.toString(array));
		
		//배열의 숫자를 저장하고 합계와 평균을 구해주세요.
		sum=0;
		float average=0;
		int[] numbers = new int[10];
		for(int i=0;i<numbers.length;i++)		//i를 0으로 초기화하고 i<=numbers.length의 조건식을 쓸경우 배열길이보다
		{										//1 큰값을 다룰 수 있으므로주의하도록 한다.
			numbers[i] = (int)(Math.random()*100)+1;
			sum += numbers[i];
		}
		average = (int)((float)sum / numbers.length * 100) / 100.0f;
		System.out.println(sum + "\n" + average);
		
		//향상된 for
		for(int number : numbers)	//배열에 있는 값을 차례대로 변수에 넣는다.
		{
			System.out.println(number);
		}
		
		for(int number : numbers)
		{
			number = 0;		//numbers의 값은 변경되지 않는다.
			System.out.println(number);
		}
		System.out.println(Arrays.toString(numbers));
		
		//배열에 저장된 숫자들 중 최소값과 최대값을 찾아주세요.
		//배열의 값이 최소값보다 작으면 최소값에 배열의 값을 저장하고
		//배열의 값이 최대값보다 크면 최대값에 배열의 값을 저장한다.
		
		int[] jArray2 = new int[10];
		for(int i=0;i<jArray2.length;i++)
			jArray2[i] = (int)(Math.random()*100)+1;
		int min=jArray2[0], max=jArray2[0];
		for(int i=1;i<jArray2.length;i++)
		{
			if(min>=jArray2[i])
				min = jArray2[i];
			else if(max<=jArray2[i])
				max = jArray2[i];
		}
		System.out.println("\n\n"+Arrays.toString(jArray2));
		System.out.println("최소값은 " + min + "이고, 최대값은 " + max + "입니다.");
		
		int[] shuffle = new int[30];
		int temp=0, tempNumber=0;
		for(int i=0;i<shuffle.length;i++)
		{
			shuffle[i] = i + 1;
		}
		System.out.println("\n\n"+Arrays.toString(shuffle));
		for(int i=0;i<shuffle.length;i++)
		{
			temp = shuffle[i];
			tempNumber=(int)(Math.random()*shuffle.length);		//Math.random()*30을 했을때 0.0 ~ 0.99999...에
			shuffle[i] = shuffle[tempNumber];					//30을 곱하게 되므로 30은 나오지 않고 최소0, 최대 29의 숫자를 얻는다.
			shuffle[tempNumber] = temp;
		}
		System.out.println(Arrays.toString(shuffle));
		
		//배열은 길이를 변경할 수 없기 때문에 길이가 부족할 경우
		//더 큰 배열에 복사를 해야한다.
		int[] tmp = new int[shuffle.length*2];
		System.out.println(shuffle);
		System.out.println(tmp);
		for(int i=0;i<shuffle.length;i++)
		{
			tmp[i] = shuffle[i];
		}
		shuffle = tmp;
		System.out.println(Arrays.toString(shuffle));
		System.out.println(shuffle);
		System.out.println(tmp);
		
		//배열 복사 메서드
		int[] originArray = new int[]{1, 2, 3, 4, 5};
		int[] copyArray = new int[originArray.length *2];
		System.arraycopy(originArray, 0, copyArray, 2, originArray.length);
		System.out.println("\n\n"+Arrays.toString(copyArray));
		
		//1~10 사이의 난수를 500번 생성하고,
		//각 숫자가 생성된 횟수를 출력해주세요.
		int[] randomNumbers = new int[500];
		int[] countNumbers = new int[10];
		for(int i=0;i<randomNumbers.length;i++)
			randomNumbers[i] = (int)(Math.random()*10) + 1;
		for(int i=0;i<randomNumbers.length;i++)
		{
			switch(randomNumbers[i])
			{
			case 1:
				countNumbers[0]++;
				break;
			case 2:
				countNumbers[1]++;
				break;
			case 3:
				countNumbers[2]++;
				break;
			case 4:
				countNumbers[3]++;
				break;
			case 5:
				countNumbers[4]++;
				break;
			case 6:
				countNumbers[5]++;
				break;
			case 7:
				countNumbers[6]++;
				break;
			case 8:
				countNumbers[7]++;
				break;
			case 9:
				countNumbers[8]++;
				break;
			case 10:
				countNumbers[9]++;
			default:
				break;
			}
		}
		for(int i=1;i<=countNumbers.length;i++)
		{
			System.out.println(i + "은(는) " + countNumbers[i-1] + "번 생성되었습니다.");
		}
			
	}

}
