package sec01.exam01;

public class Audio implements RemoteControl {

	int volume;

	@Override
	public void turnOn() {
		System.out.println("audio를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("audio를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("audio현재 볼륨 : " + this.volume);
	}
}
