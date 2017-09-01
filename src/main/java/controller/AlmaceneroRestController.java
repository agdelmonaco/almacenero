package controller;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.google.gson.Gson;

import services.ProductService;

@ControllerAdvice
@RequestMapping("/services")
@ResponseBody
@EnableWebMvc
public class AlmaceneroRestController {

	@Autowired
	ProductService productService;
	
	//Services 
	//Pasajeros
	
	@RequestMapping(value = "/products", method = RequestMethod.GET, produces = "application/json", headers = "Accept=application/json")
	public String getPassengers() {
		Map<String, Object> aMap = new HashMap<String, Object>();
		
		try {		
		aMap.put("result", "OK");		
		} catch (Exception e) {
			aMap.put("result", "FAILED");
			aMap.put("error", e.getMessage());
		}

		return new Gson().toJson(aMap);
	}
	
	
	
}

