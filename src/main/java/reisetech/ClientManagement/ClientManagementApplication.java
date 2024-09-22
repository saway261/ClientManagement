package reisetech.ClientManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ClientManagementApplication {

	private String name = "Enami Kouji";

	public static void main(String[] args) {
		SpringApplication.run(ClientManagementApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(){
		return "nyan!";
	}

}
