package i_collection;

import java.util.ArrayList;

public class ArrayListClass {
	public static void main(String[] args) {
		/*
		 * add()	: 마지막 위치에 객체를 추가
		 * get()	: 지정된 위치의 객체를 반환
		 * set()	: 지정된 위치에 주어진 객체를 저장(수정)
		 * remove()	: 지정된 위치의 객체를 제거
		 * size()	: 저장된 객체의 수 반환				//length와 비슷한 기능을 하는 메서드
		 */
		
		ArrayList<Object> list = new ArrayList<Object>();
		
		list.add(10);
		list.add("abc");
		list.add(true);
		list.add(new ArrayListClass());
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("abc");
		list2.add("123");
		list2.add("가나다");
		
		list2.set(1, "456");
		
		for(int i=0;i<list2.size();i++)
		{
			System.out.println(list2.get(i));
		}
		
		list2.remove(0);
		//리스트에 저장된 값을 삭제하면 그 뒤의 모든 값의 인덱스가 당겨진다.
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		
		ArrayList<ArrayList<Integer>> list3 = new ArrayList<ArrayList<Integer>>();	//2차원 배열
		ArrayList<Integer> list4 = new ArrayList<Integer>();
		list4.add(10);
		list3.add(list4);
		
		System.out.println(list3);
		
		list4 = new ArrayList<Integer>();
		list4.add(20);
		list3.add(list4);
		
		System.out.println(list3);
		System.out.println(list3.get(0));
		System.out.println(list3.get(0).get(0));
		
		//정수를 저장할 수 있는 ArrayList를 생성해 값을 5번 넣어주세요.
		ArrayList<Integer> intArrList = new ArrayList<Integer>();
		intArrList.add(1);
		intArrList.add(2);
		intArrList.add(3);
		intArrList.add(4);
		intArrList.add(5);
		
		System.out.println(intArrList);
		
		//위에서 만든 ArrayList에 담긴 값들의 합계와 평균을 출력해주세요.
		int sum = 0;
		double avg = 0;
		for(int i=0;i<intArrList.size();i++)
		{
			sum += intArrList.get(i);
		}
		avg = (double)sum / intArrList.size();
		
		System.out.println("합계 : " + sum + " 평균 : " + avg);
		
		//위에서 만든 ArrayList에 담긴 값들 중 최소값과 최대값을 출력해주세요.
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for(int i=0;i<intArrList.size();i++)
		{
			if(min>intArrList.get(i))
			{
				min = intArrList.get(i);
			}
			if(max<intArrList.get(i));
			{
				max = intArrList.get(i);
			}
		}
		System.out.println("최소값 : "+min+" 최대값 : "+max);
	}
}
