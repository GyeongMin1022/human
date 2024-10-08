package kr.or.human;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

// Controller Bean(즉 spring이 생성 할 수 있는 class)으로 등록한다
@Controller
// ip:port/context_path/
// class에 붙은@RequestMapping은 HandlerMapping이 처리합니다. 
//ip:port/context_path/sub/**
// 이 클래스에서 반복되는 첫 주소를 한번에 지정할 떄 사용
@RequestMapping("/sub")
public class MainController {

	@RequestMapping("/test/main1.do")
	public ModelAndView main1() {
		System.out.println("메인1 실행");

		// ViewResolver로 보내는 객체
		ModelAndView mav = new ModelAndView();
		// jsp의 조합을 위한 이름
		// forward로 이동하게 됨
		mav.setViewName("main");

		// viewName을 생성자에 넣어도 됨
//		ModelAndView mav = new ModelAndView("main");

		return mav;
	}

	// 메소드에 적용한 @RequestMapping은 HandlerAdapter가 처리합니다.
	@RequestMapping("/test/main2.do")
	public ModelAndView main2() {
		System.out.println("메인2 실행");

		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");

		// 마치 request.setAttribute처럼 담을 수 있는 방법
		mav.addObject("msg", "최민수");

		return mav;
	}

	// 전달인자가 value 하나 일때는 value라는 글씨를 생략 할 수 있다.
	// 두개 이상의 값을 넣을때는 {}안에 넣는다
	// value는 url 패턴을 뜻한다.
	// method는 접근 방식을 제안함
	// 적은 것만 들어올 수 있음
	@RequestMapping(value = { "/test/main/*/search", "/test/main4.do" }, method = { RequestMethod.POST,
			RequestMethod.GET })
	public ModelAndView main3() {
		System.out.println("메인3 실행");

		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");

		// 마치 request.setAttribute처럼 담을 수 있는 방법
		mav.addObject("msg", "메인3 실행");

		return mav;
	}
	// url 주소가 같으면 부팅시 예외 발생
//	@RequestMapping("/test/main2.do")
//	public ModelAndView main4() {
//		System.out.println("메인2 실행");
//		
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("main");
//		
//		// 마치 request.setAttribute처럼 담을 수 있는 방법
//		mav.addObject("msg","최민수");
//		
//		return mav;
//	}

	@RequestMapping(value = "/test/main5.do", method = RequestMethod.GET)
	public ModelAndView main5() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		mav.addObject("msg", "최민수");

		return mav;
	}

	@RequestMapping(value = "/test/main5.do", method = RequestMethod.POST)
	public ModelAndView main6() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		mav.addObject("msg", "최민수");

		return mav;
	}

	@PutMapping("/test/main5.do")
	public ModelAndView main7() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		mav.addObject("msg", "최민수");

		return mav;
	}
	@DeleteMapping("/test/main5.do")
	public ModelAndView main8() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		mav.addObject("msg", "최민수");

		return mav;
	}


	
}
