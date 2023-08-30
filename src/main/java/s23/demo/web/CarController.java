package s23.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CarController {

	@RequestMapping("main")
	@ResponseBody
	public String showMainPage() {
		return "Tämä on pääsivu";
	}
	
	@RequestMapping("moi")
	@ResponseBody
	public String sayHello(@RequestParam (name="nimesi") String nimi) {
		return "hei" + nimi;
	}
	
	@RequestMapping("moi2")
	@ResponseBody
	public String sayHello2(@RequestParam (name="nimesi", required=false, defaultValue="Muumi") String nimi) {
		return "hei" + nimi;
	}
	
	
	
}
