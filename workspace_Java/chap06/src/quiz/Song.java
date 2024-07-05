package quiz;

public class Song {
	String name = "노래제목";
	String artist = "가수명";
	String 장르 = "장르";
	String 가사 = "가사";
	int 곡길이 = 10;
	
	void setName(String a) {
		name = a;
	}
	void setArtist(String a) {
		artist = a;
	}
	void set장르(String a) {
		장르 = a;
	}
	
	void set가사(String a) {
		가사 = a;
	}
	void set곡길이(int a) {
		곡길이 = a;
	}
	void 전체출력() {
		System.out.println("====================");
		System.out.println("노래 제목 : " + name);
		System.out.println("가수명 : " + artist);
		System.out.println("장르 : " + 장르);
		System.out.println("가사 : " + 가사);
		System.out.println("곡길이 : " + 곡길이);
	}
}

