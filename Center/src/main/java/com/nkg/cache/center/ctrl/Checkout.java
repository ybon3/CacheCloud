package com.nkg.cache.center.ctrl;
import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/checkout")
public class Checkout extends BaseController {
	private HttpHeaders headers = new HttpHeaders();
	private RestTemplate restTemplate = new RestTemplate();

//	@Value("${ms.order.add.url}")
//	private String orderAddURL;
//
//	@Value("${ms.payment.checkout.url}")
//	private String paymentCheckoutURL;
//
//	public Checkout() {
//		headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
//	}
//
//	@PostConstruct
//	public void init() {
//		logger.info("orderAddURL: " + orderAddURL);
//		logger.info("paymentCheckoutURL: " + paymentCheckoutURL);
//	}
//
//	@RequestMapping(value = "/pay/{pay_mod}/{pay_method}",
//			method = RequestMethod.POST,
//			consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
//	public String execute(
//			@PathVariable("pay_mod") String pay_mod,
//			@PathVariable("pay_method") String pay_method,
//			@RequestBody String input) {
//
//		// Execute create order API
//		HttpEntity<String> entity = new HttpEntity<>(input, headers);
//		ResponseEntity<String> resp = restTemplate.exchange(
//				orderAddURL,
//				HttpMethod.PUT,
//				entity,
//				String.class);
//
//		ObjRetMessage retMsg = parse(resp.getBody(), ObjRetMessage.class);
//
//		if (retMsg.retCode != 0) {
//			return resp.getBody();
//		}
//
//		//if pay_method is "transfer", stop here
//		if ("transfer".equals(pay_method)) {
//			return resp.getBody();
//		}
//
//		// Execute payment checkout API
//		ObjCheckout combinedObjCheckout = combine(input, retMsg);
//		input = gson.toJson(combinedObjCheckout);
//		entity = new HttpEntity<>(input, headers);
//		resp = restTemplate.exchange(
//				paymentCheckoutURL + "/" + pay_method,
//				HttpMethod.POST,
//				entity,
//				String.class);
//
//		return resp.getBody();
//	}
}
