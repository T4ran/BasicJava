package f_oop2;

public class Time
{
	
	private int hour;
	private int minute;
	private int second;
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour>=0&&hour<24)
			this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute>=0&&minute<60)
			this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second>=0&&second<60)
			this.second = second;
	}
	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", second="
				+ second + "]";
	}
	
	
	
}
