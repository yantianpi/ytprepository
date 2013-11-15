package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GeneralController {

	@RequestMapping(value = "index.do")
	public String index_jsp(Model model) {
		model.addAttribute("liming", "۳��ا���");
		System.out.println("index.jsp");
		return "index";
	}

	@RequestMapping(value = "generalindex.do")
	public String index_jsp1(Model model) {
		model.addAttribute("liming", "yantianpi���");
		System.out.println("index.jsp");
		return "ytpindex";
	}
}