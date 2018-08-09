package boot_eureka_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BootEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootEurekaClientApplication.class, args);
	}
}
