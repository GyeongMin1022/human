package human.class1.rest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rest")
// @RestController Controller + ResponseBody
public class RestController {

	@RequestMapping("/test1")
	public int test1() {
		return 100;
	}

	@RequestMapping("/test2")
	public String test2() {
		return "ajax";
	}

	@RequestMapping("/ajax/notice/{num}/static/{str}")
	@ResponseBody
	public int notice(

			@PathVariable("num") int number,

			@PathVariable("str") String str1,
			
			HttpServletRequest request
			
			) {
		System.out.println(request.getParameter("num"));
		System.out.println("number : " + number);
		System.out.println("str1 : " + str1);
		
		return number;

	}

}
