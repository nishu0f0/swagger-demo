package in.frodo;


import javax.servlet.MultipartConfigElement;


import org.springframework.boot.SpringApplication;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.MultipartConfigFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

//import com.fasterxml.jackson.databind.DeserializationFeature;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.PropertyNamingStrategy;
//import com.fasterxml.jackson.databind.SerializationFeature;


//import java.io.*;
//import java.util.Map;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application{

    @Autowired 
    private Environment env; 

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
	}
    	
	@Bean
	MultipartConfigElement multipartConfigElement(){
	    MultipartConfigFactory factory = new MultipartConfigFactory();
	    factory.setMaxFileSize("1024KB");
	    factory.setMaxRequestSize("1024KB");
	    
	    return factory.createMultipartConfig();
	}

}
