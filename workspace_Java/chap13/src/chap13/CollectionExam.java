package chap13;

import java.util.*;

public class CollectionExam {

	public static void main(String[] args) {

		List list = new ArrayList();
		System.out.println(list.isEmpty());
		
		list.add("10");
		int a = 20;
		list.add(a);
		list.add(true);
		System.out.println(list.isEmpty());
	
		// 중간에 삽입
		list.add(1,123);
		
		// 삭제
		list.remove(1);
		
		int b = (Integer)list.get(1);
		System.out.println(b);
		System.out.println(list.size());
		System.out.println(list);
//		list.get(100);  java.lang.IndexOutOfBoundsException 에러
		
		// 초기화
		list.clear();
		list = new ArrayList();
		
		Map map = new HashMap();
		// 추가
		map.put("k1", 10);
		map.put("abc", list);
		
		int k1  = (int)map.get("k1");
		System.out.println(k1);
		
		// key가 없으면 null
		// 실제로 key가 있지만 value를 null을 넣었을 경우도 있다.
		System.out.println(map.get("k2"));
		
		
		list = new ArrayList();
		map = new HashMap();
		map.put("제목", "사건의 지평선");
		map.put("가수", "윤하");
		map.put("가수", "yun ha");
		list.add(map);
		System.out.println(list);
		
		
		map = new HashMap();
		map.put("제목", "바람이 분다");
		map.put("가수", "이소라");
		map.put("가사", "바람이...");
		// 얕은복사
		list.add(map);
		System.out.println(list);
		
		// 제네릭 generic
		List<String> list2 = new ArrayList<String>();
		list2.add("글씨");
//		list2.add(2);
		// 제네릭이 있는 경우 꺼낼때 형변환을 알아서 해준다
		String str = list2.get(0);
		
		Map<String, Integer> map2 = new HashMap<String,Integer>();
	}

}
