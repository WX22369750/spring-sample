package com.xyz.learning;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("simple")
public class SimpleController {
	@RequestMapping("one")
	public String one() {
		System.out.println("--simple/one--");
		return "one-view";
	}
}
