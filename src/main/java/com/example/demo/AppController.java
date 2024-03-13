package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.CandidateDTO;
import entity.OfficeDTO;


@RestController
@RequestMapping("/api/")
public class AppController {

    @GetMapping("/test")
    public String test() {
        return "hello";
    }

    @GetMapping("/loop/{count}")
    public String loop(@PathVariable(value = "count") int count) {
        String result = "";
        for(int i= 1; i <= count; i++){
			for(int j=0; j<i;j++){
				result += "" + i;
			}
			result+= "\n";
		}
        return result;
    }
    
    
    
    @PostMapping("/first/yDEEW3KjymTG9yjj9830")
    public String first(@RequestBody(required = true) CandidateDTO entity) {
        return "1st API done";
    }

    @PostMapping("/second/yDEEW3KjymTG9yjj9830")
    public String second(@RequestBody(required = true) OfficeDTO entity) {
        return "2nd API done";
    
    }
}
