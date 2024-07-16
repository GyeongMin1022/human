package sec01.exam01;

public class Tv implements RemoteControl {

	int volume;

	@Override
	public void turnOn() {
		System.out.println("tv 를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("tv 를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("Tv 현재 볼륨 : " + this.volume);
	}
}
