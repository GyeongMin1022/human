package sec01.exam01;

public interface RemoteControl {

	// 상수
	// public static final 생략 가능
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// 추상 메소드
	public abstract void turnOn();

	void turnOff();

	void setVolume(int Volume);
}
