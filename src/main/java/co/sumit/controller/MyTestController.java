package co.sumit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyTestController {

	@GetMapping("/api/v1/message")
	public String sendMessage(@RequestParam("msg") String msg) {
		return new String(msg);
	}
}
