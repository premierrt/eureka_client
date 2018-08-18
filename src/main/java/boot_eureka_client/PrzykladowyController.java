package boot_eureka_client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrzykladowyController {

	@GetMapping("/mow")
	public String mow(){
		return "Cos mowie";
	}
	
	@GetMapping("/mowDlugo")
	public String mowDlugo(){
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "mowie dlugoooooo";
	}
}
