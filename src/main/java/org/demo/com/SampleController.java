package org.demo.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class SampleController {
	public static void main(String[] args) {
		SpringApplication.run(SampleController.class, args);
	}
	
	@RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}
