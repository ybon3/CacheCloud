package com.nkg.cache.center.ctrl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/center")
public class CenterController extends BaseController {
	@RequestMapping(value = "/join",
			method = RequestMethod.POST)
	public String add(@RequestBody String input) {
		return null;
	}


	@RequestMapping(value = "/quit",
			method = RequestMethod.POST)
	public String quit(@RequestBody String input) {
		return null;
	}


}
