package human.class1.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

// @RequestBody  :. post 로 보낸 json을 설치
@Controller
public class AjaxController {

	@RequestMapping(value = "/ajax.view", method = RequestMethod.GET)
	public String ajaxView() {
		System.out.println("아작스 뷰 실행");
		return "ajax";
	}

	@RequestMapping(value = "/ajax", method = RequestMethod.POST)
	public String ajax(String ename, @ModelAttribute EmpDTO dto2, @RequestBody EmpDTO dto) {
		// json으로 보냈더니 @RequestParam 또는 request.getParameter로 받을 수 없다.
		System.out.println("ename : " + ename);
		System.out.println("dto2 : " + dto2);
		System.out.println("dto : " + dto);
		return "ajax";
	}

	// @ResponseBody : 그냥 값이나 json으로 리턴해줌
	@RequestMapping(value = "/ajax/string", method = RequestMethod.POST)
	@ResponseBody
	public String ajaxString(@RequestBody EmpDTO dto) {

		System.out.println("dto : " + dto);

		return "human";
	}

	@RequestMapping(value = "/ajax/dto", method = RequestMethod.POST)
	@ResponseBody
	public EmpDTO ajaxDto(@RequestBody EmpDTO dto) {

		System.out.println("dto : " + dto);

		return dto;
	}

	@RequestMapping(value = "/ajax/list", method = RequestMethod.POST)
	@ResponseBody
	public List ajaxList(@RequestBody EmpDTO dto) {

		System.out.println("dto : " + dto);
		List list = new ArrayList();
		list.add(dto);
		list.add(dto);
		list.add(dto);

		return list;

	}

	@RequestMapping(value = "/ajax/forward", method = RequestMethod.GET)
	public String ajaxForward() {

		return "forward:/ajax.view";
	}

	@RequestMapping(value = "/ajax/redirect", method = RequestMethod.GET)
	public String ajaxRediect() {

		return "redirect:/ajax.view";
	}

}
