package com.example.jenkins;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class TestController {

	@PostMapping(value = "/addition")
	public Integer addBatchLog(Integer num1, Integer num2) {
		Integer result = num1 + num2;
		log.info("num1 + num2 = " + result);
		return result;
	}

}
