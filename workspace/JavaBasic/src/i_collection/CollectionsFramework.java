package i_collection;

import java.util.ArrayList;

public class CollectionsFramework {
	public static void main(String[] args) {
		/*
		 * <<CollectionsFramework>>
		 * - Collections	: 다수의 데이터
		 * - Framework		: 표준화된 프로그래밍 방식
		 * 
		 * <<List>>
		 * - Vector			: ArrayList의 구버전
		 * - ArrayList		: 저장순서 유지, 중복 허용			//데이터 추가/삭제가 LinkedList보다 비교적 느림
		 * - LinkedList		: 데이터 추가 및 삭제시간 단축		//읽는게 ArrayList보다 비교적 느림
		 * - Stack			: LIFO(Last In First Out)
		 * - Queue			: FIFO(First In First Out)
		 * 
		 * <<Set>>
		 * - HashSet		: 중복 허용 안함, 저장순서 유지 안함
		 * - HashMap		: 키(key)와 값(value)을 한쌍으로 저장
		 * - TreeMap		: 정렬, 검색 기능 향상
		 */
		
		ArrayList<ArrayList<Object>> score = new ArrayList<ArrayList<Object>>();
		ArrayList<Object> personal;// = new ArrayList<Object>();
		
		personal = new ArrayList<Object>();
		personal.add("석차");
		personal.add("이름");
		personal.add("Java");
		personal.add("Oracle");
		personal.add("HTML");
		personal.add("JQuery");
		personal.add("JSP");
		personal.add("총점");
		personal.add("평균");
		score.add(personal);
		
		for(int j=0;j<7;j++)
		{
			personal = new ArrayList<Object>();
			int sum=0;
			double avg=0.0;
			personal.add(1);
			personal.add("한승희");
			for(int i=0;i<5;i++)
			{
				personal.add((int)(Math.random()*50)+50);
				sum += (int)personal.get(i+2);
			}
			avg = sum/5.0;
			personal.add(sum);
			personal.add(avg);
			score.add(personal);
		}
		
		//버블 정렬하기
		//1 2 3 4 5 6 7 이 있으면 76,65,54,43,32,21으로 비교하여 큰것을 앞으로 보내기
		//다음번에는 76,65,54,43,32 비교
		//다음번에는 76,65,54,43 비교			<= 하나씩 줄여나갈것.
		ArrayList<Object> temp = new ArrayList<Object>();
		for(int i=score.size()-1;i>1;i--)
		{
			for(int j=score.size()-1;j>1;j--)
			{
				if((int)score.get(j).get(7)>=(int)score.get(j-1).get(7))
				{
					temp = score.get(j);
					score.set(j, score.get(j-1));
					score.set(j-1, temp);
				}
			}
		}
		
		//정렬 후 석차에 번호 붙이기
		for(int i=1;i<score.size();i++)
		{
			temp = score.get(i);
			temp.set(0, i);
			score.set(i, temp);
		}
		
		for(int i=0;i<score.size();i++)
		{
			System.out.println(score.get(i));
		}
	}
}
