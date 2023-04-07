package br.com.clansa;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeloWordController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/HelloWorld")
	public HelloWord helloWord (
			@RequestParam(value = "name", defaultValue = "World")String name) {
		return new HelloWord(counter.incrementAndGet(), String.format(template, name));
	}
	
}
