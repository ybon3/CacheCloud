package com.nkg.cache.center.ctrl;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.google.gson.Gson;
import com.nkg.cache.center.GsonUtil;

/**
 * To provide all Controller common functions
 * <p>
 * @author Dante
 */
public class BaseController {
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	protected Gson gson = GsonUtil.create();

	/**
	 * Notice: All {@link Date} field will be parse to "Timestamp" (as long type),
	 * and vice versa.
	 */
	protected <T> T parse(String input, Class<T> clazz) {
		try {
			return gson.fromJson(URLDecoder.decode(input, "utf-8"), clazz);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace(); // should not be happened
			return null;
		}
	}

	@ExceptionHandler(Throwable.class)
	private String handleError(HttpServletRequest req, Throwable ex) {
		logger.error("handleError()", ex);
		return "We got trouble, sorry.";
	}
}
