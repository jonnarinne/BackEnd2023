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
	
	@RequestMapping("moi3")
	@ResponseBody
	public String sayHello3(@RequestParam (name="nimesi", required=false, defaultValue="Muumi") String nimi,
			@RequestParam (name="ika") int age) {
		return "Hei" + nimi + ", " + age + " vuotta";
	}
	
	// Viikkoharjoitukset (viikko 1)
	
	@RequestMapping("/index")
	@ResponseBody
	public String showMainPage2() {
		return "This is the main page";
	}
	
	@RequestMapping("/contact")
	@ResponseBody
	public String showContactPage() {
		return "This is the contact page";
	}
	
	@RequestMapping("/hello")
	@ResponseBody
	public String sayHello4(@RequestParam (name="location") String location,
			@RequestParam (name="name") String name) {
		return "Welcome to the " + location + " " + name + "!";
	}
	
	
	
	
	
}
