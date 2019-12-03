
package com.codingdojo.routing;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
@SpringBootApplication


public class DojoController {
	@RequestMapping("/{name}")
	public String dojo(@PathVariable("name") String name) {
		if (name.equals("dojo")) {
			return  "The dojo is awesome";
		}
		else if(name.equals("burbank-dojo")) {
			return  "The burbank-dojo is located in southern california";
			
		}
		else if(name.equals("san-hose")) {
			return "The san hose is the headquarter";
			
		}
		else {
			return "give the right location";
		}
	}
	
	

}
