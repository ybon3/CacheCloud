package com.nkg.cache.center.ctrl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckAlive extends BaseController {
	@RequestMapping("/CheckAlive")
	public String welcome(HttpServletRequest req, HttpServletResponse res) {
		return "OK";
	}
}
