package e_oop;

public class Airconditioner {
	public static void main(String[] args) {
		Airconditioner aircon = new Airconditioner();
		
		aircon.temperatureUp();
		System.out.println(aircon.temperature);
		
		aircon.power();
		aircon.temperatureUp();
		System.out.println(aircon.temperature);
		
		aircon.temperatureDown();
		aircon.temperatureDown();
		System.out.println(aircon.temperature);
		
		aircon.temperatureDown();
		aircon.temperatureDown();
		aircon.temperatureDown();
		aircon.temperatureDown();
		aircon.temperatureDown();
		aircon.temperatureDown();
		System.out.println(aircon.temperature);
		
		aircon.temperatureDown();
		aircon.temperatureDown();
		aircon.temperatureDown();
		System.out.println(aircon.temperature);
		
		aircon.airVolumeUp();
		System.out.println(aircon.airVolume);
		
		aircon.airVolumeUp();
		System.out.println(aircon.airVolume);
		
		aircon.airVolumeUp();
		System.out.println(aircon.airVolume);
		
		aircon.airVolumeUp();
		System.out.println(aircon.airVolume);
		
		aircon.airVolumeUp();
		System.out.println(aircon.airVolume);
		
		System.out.println(aircon.airVolume);			//Ctrl + Alt + 방향키
		System.out.println(aircon.airVolume);			//복사 단축키
		System.out.println(aircon.airVolume);
		System.out.println(aircon.airVolume);
		System.out.println(aircon.airVolume);
		aircon.airVolumeUp();							//Alt + 방향키
		System.out.println(aircon.airVolume);			//위치 이동 단축키
		System.out.println(aircon.airVolume);
		System.out.println(aircon.airVolume);
		System.out.println(aircon.airVolume);
		System.out.println(aircon.airVolume);
		System.out.println(aircon.airVolume);
		System.out.println(aircon.airVolume);
		System.out.println(aircon.airVolume);
		System.out.println(aircon.airVolume);
		
	}
	
	boolean power;//전원
	int temperature;//온도
	int airVolume;//풍량	1~5
	
	Airconditioner()
	{
		power = false;
		temperature = 25;
		airVolume = 1;
	}
	
	//전원버튼
	void power()
	{
		power = !power;
	}
		
	//온도 + 버튼
	void temperatureUp()
	{
		if(power&&++temperature>=30)
			temperature = 30;
	}
	
	//온도 - 버튼
	void temperatureDown()
	{
		if(power&&--temperature<=18)
			temperature = 18;
	}
	
	//풍량 + 버튼
	void airVolumeUp()
	{
		if(power&&++airVolume>=5)
			airVolume = 5;
	}
	
	//풍량 + 버튼
	void airVolumeDown()
	{
		if(power&&--airVolume<=1)
			airVolume = 1;
	}
}
