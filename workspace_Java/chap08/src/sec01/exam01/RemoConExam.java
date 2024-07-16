package sec01.exam01;

import java.util.ArrayList;
import java.util.List;

public class RemoConExam {

	public static void main(String[] args) {

		RemoteControl tv = new Tv();
		Audio audio = new Audio();
		RemoteControl audio2 = audio;

		tv.turnOn();
		audio.setVolume(12);

		List list = new ArrayList();
	}

}
