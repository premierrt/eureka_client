package boot_eureka_client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrzykladowyController {

	@GetMapping("/mow")
	public String mow(){
		return "Cos mowie";
	}
}
