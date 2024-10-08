package kr.or.human.login;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("/loginForm.do")
	public ModelAndView loginForm() {
		System.out.println("loginForm 실행");

		ModelAndView mav = new ModelAndView("login");

		return mav;
	}

	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest req) {
		String userID = req.getParameter("userID");
		String userPW = req.getParameter("userPW");

		MemberDTO dto = new MemberDTO();
		dto.setUserID(userID);
		dto.setUserPW(userPW);

		System.out.println(dto);

		ModelAndView mav = new ModelAndView();
		mav.addObject("dto", dto);
		mav.setViewName("result");

		return mav;
	}

	@RequestMapping("/login2")
	public ModelAndView login2(

//			String userID = req.getParameter("userID");과 동일한 동작
//			기본적으로 필수 값으로 변경됨. 없다면 400 Bad Request 코드 발생
			@RequestParam("userID") String userID, @RequestParam(value = "userPW", required = false)
//			만약 parameter의 key와 변수명이 같다면 @RequestParam 생략 가능
			String userPW) {
//		String userID = req.getParameter("userID");
//		String userPW = req.getParameter("userPW");

		MemberDTO dto = new MemberDTO();
		dto.setUserID(userID);
		dto.setUserPW(userPW);

		System.out.println(dto);

		ModelAndView mav = new ModelAndView();
		mav.addObject("dto", dto);
		mav.setViewName("result");

		return mav;
	}

	@RequestMapping("/login3")
	public ModelAndView login3(

			@RequestParam
			// 전달 받은 모든 것을 Map으로 전환
			Map<String, String> user

	) {
		String userID = (String) user.get("userID");
		String userPW = (String) user.get("userPW");

		MemberDTO dto = new MemberDTO();
		dto.setUserID(userID);
		dto.setUserPW(userPW);

		System.out.println(dto);

		ModelAndView mav = new ModelAndView();
		mav.addObject("dto", dto);
		mav.setViewName("result");

		return mav;
	}

	@RequestMapping("/login4")
	public ModelAndView login4(MemberDTO dto2) {

		System.out.println(dto2);

		ModelAndView mav = new ModelAndView();
		mav.setViewName("result");

		return mav;
	}

	@RequestMapping("/login5")
	public String login5(String userID, MemberDTO dto, Model model) {
		System.out.println("로그인5 실행");
		System.out.println("userID " + userID);
		System.out.println(dto);

		model.addAttribute("userID", userID);
		model.addAttribute("dto", dto);

		return "result";

	}
	
	@RequestMapping("result")
//	@RequestMapping("result.do")
	public void login6(MemberDTO dto) {
		// return type이 void
		// 또는 return값이 null 일때
		//주소의 마지막 쩜 앞의 주소를
		// ViewResolver 로 보냄
		// 즉 주소 .jsp가 호출된다
		
		//그래도 읽기 좋게 명시적으로
		// return "result" 해주는게 좋다
	}

}
