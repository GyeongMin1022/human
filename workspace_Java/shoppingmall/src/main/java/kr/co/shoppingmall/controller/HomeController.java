package kr.co.shoppingmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/") // /로 입력하면 이 메서드를 실행
    public String home() {
    	
        return "index"; // index.jsp 파일로 이동
    }
}
