package in.frodo.controller;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestSpecController {
	
	@RequestMapping(value = "restSpecs/{fileResourceName:.+}", method = RequestMethod.GET)
	public ClassPathResource getGreeting(
			@PathVariable("fileResourceName") String fileResourceName){
		System.out.println(fileResourceName);
		return new ClassPathResource(fileResourceName);		
	}
}
