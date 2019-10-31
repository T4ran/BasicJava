package e_oop.class_making;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MusicPlayer {
	public static void main(String[] args) {
		
		MusicPlayer mp = new MusicPlayer();
		
		mp.power();
		
	}
	
	String[] music = new String[5];
	boolean power=false, play=false, replay=false, select=false;
	int index=0, tempIndex=0, volume=0, tempNum=0;
	Scanner ans = new Scanner(System.in);
	String answer = null, search = null;
	final int MAX_MUSIC_NUMBER=5, MIN_MUSIC_NUMBER=0, MAX_MUSIC_VOLUME=10, MIN_MUSIC_VOLUME=0;
	
	void power()
	{
		power = !power;
		inIt();
		
		if(power)
			select();
	}
	
	void inIt()
	{
		String[] arr = {"1","2","3","4","5"};
		for(int i=0;arr.length<=MAX_MUSIC_NUMBER&&i<arr.length;i++)	//music 배열에 저장
		{
			music[i] = arr[i];
		}
	}
	
	void select()
	{
		select = true;
		while(select)
		{
			System.out.print("\n0.전원끄기 1.재생 2.앞으로 3.뒤로 4.음악섞기 5.반복듣기 6.이름순정렬 7.볼륨업 8.볼륨다운 9.음악찾기\n기능을 선택해주세요 >");
			answer = ans.nextLine();
			
			switch(answer)
			{
			case "0":
				power();
				select=false;
				break;
			case "1":
				play();
				break;
			case "2":
				front();
				break;
			case "3":
				back();
				break;
			case "4":
				shuffleMusic();
				break;
			case "5":
				replay();
				break;
			case "6":
				sortMusic();
				break;
			case "7":
				volumeUp();
				break;
			case "8":
				volumeDown();
				break;
			case "9":
				System.out.println("음악을 찾습니다. 찾으시려는 음악의 이름을 입력해주세요.");
				search = ans.nextLine();
				searchMusic(search);
			default:
				break;
			}
		}
	}
	
	void play()			//재생, 일시정지
	{
		if(power)
		{
			play = !play;
			if(play)
				System.out.println("음악을 재생합니다.");
			else
				System.out.println("음악을 정지합니다.");
		}
	}
	
	void front()		//앞으로
	{
		if(power)
		{
			if(!replay&&++index>MAX_MUSIC_NUMBER-1)
				index=MIN_MUSIC_NUMBER;
			else
			{
				index=tempIndex;
			}
			System.out.println("다음곡을 선택합니다.");
		}
	}
	
	void back()			//뒤로
	{
		if(power)
		{
			if(!replay&&--index<MIN_MUSIC_NUMBER)
				index=MAX_MUSIC_NUMBER;
			else
			{
				index=tempIndex;
			}
			System.out.println("이전곡을 선택합니다.");
		}
	}
	
	void shuffleMusic()
	{
		if(power)
			Collections.shuffle(Arrays.asList(music));
		System.out.println("음악들의 순서를 섞습니다.");
	}
	
	void replay()
	{
		if(power)
		{
			if(replay==false)
			{
				replay = true;
				tempIndex = index;
				System.out.println("음악이 반복재생됩니다.");
			}
			else
			{
				replay = false;
				System.out.println("반복재생이 취소되었습니다.");
			}
		}
	}
	
	void sortMusic()
	{
		if(power)
		{
			Arrays.sort(music, String.CASE_INSENSITIVE_ORDER);
			System.out.println("음악을 이름순으로 정렬합니다.");
		}
	}
	
	void searchMusic(String str)
	{
		if(power)
		{
			for(int i=0;i<MAX_MUSIC_NUMBER;i++)
			{
				if(str.equals(music[i]))
					tempNum=i+1;
			}
			System.out.println("찾으시려는 음악은 " + tempNum + "번째에 있습니다.");
		}	
	}
	
	void volumeUp()
	{
		if(power)
		{
			if(++volume>=MAX_MUSIC_VOLUME)
				volume=MAX_MUSIC_VOLUME;
			System.out.println("음악의 볼륨을 높입니다. 현재 볼륨 : " + volume);
		}
	}
	
	void volumeDown()
	{
		if(power)
		{
			if(--volume<=MIN_MUSIC_VOLUME)
				volume=MIN_MUSIC_VOLUME;
			System.out.println("음악의 볼륨을 낮춥니다. 현재 볼륨 : " + volume);
		}
	}
}
