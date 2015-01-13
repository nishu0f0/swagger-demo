package in.frodo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
	
	@RequestMapping(value = "greeting", method = RequestMethod.GET)
	public Map<String, String> getGreeting(){
		Map<String, String> responseModel = new HashMap<String, String>();
		responseModel.put("message", "Welcome to This Application");
		return responseModel;
	}
	

}
