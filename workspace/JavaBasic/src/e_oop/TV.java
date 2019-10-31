package e_oop;

public class TV {

	public static void main(String[] args) {
		//전원 채널+,- 채널직접입력 음량+,- 음소거
		//power() channelUp() channelDown() channelInput(int input) volumeUp volumeDown slient()
		TV tv = new TV();
		
		tv.power();
		
		System.out.println(tv.channel);
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		System.out.println(tv.channel);
		
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		System.out.println(tv.channel);
		
		tv.channelInput(345);
		System.out.println(tv.channel);
		
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		System.out.println(tv.volume);
		
		tv.slient();
		System.out.println(tv.volume);
		
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		System.out.println(tv.volume);
		
		tv.slient();
		System.out.println(tv.volume);		
		
	}

	boolean power;
	boolean slient;
	int channel;
	int volume;
	int tempVolume;
	
	final int MAX_CHANNEL = 1000;
	final int MIN_CHANNEL = 0;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	
	TV()
	{
		power = false;		// true, false
		slient = false;		// true, false
		channel = 0;		// 0~1000
		volume = 0;			// 0~100
		tempVolume=0;
	}
	
	//전원
	void power()
	{
		power = !power;
	}
	
	//채널+
	void channelUp()
	{
		if(power&&++channel>=MAX_CHANNEL)
			channel=MAX_CHANNEL;
	}
	
	//채널-
	void channelDown()
	{
		if(power&&--channel<=MIN_CHANNEL)
			channel=MIN_CHANNEL;
	}
	
	//채널 직접입력
	void channelInput(int input)
	{
		if(power&&input<=MAX_CHANNEL&&input>=MIN_CHANNEL)
			channel = input;
	}
	
	//음소거
	void slient()
	{
		if(slient==false)
		{
			slient = true;
			tempVolume = volume;
			volume = 0;
		}
		else
		{
			slient = false;
			volume = tempVolume;
		}
	}
	
	//음량+
	void volumeUp()
	{
		if(power&&!slient&&++volume>=MAX_VOLUME)
			volume=MAX_VOLUME;
	}
	
	//음량-
	void volumeDown()
	{
		if(power&&!slient&&--volume<=MIN_VOLUME)
			volume=MIN_VOLUME;
	}
}
//전원 채널+,- 채널직접입력 음량+,- 음소거


//과제. 클래스 하나로 간단한 프로그램을 만들어 주세요.
//발표 : 프로그램주제, 기능, 메서드 구성, 시연
//콘솔에서 입력받아 실행하는 프로그램을 설계		금요일까지






