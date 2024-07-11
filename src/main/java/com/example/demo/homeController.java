package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/* http://localhost:8080/swagger-ui/#/
 * useing this url we can view all APIs inSwagger uI
 */
@RestController
public class homeController {
@Autowired
private service s;
//@RequestMapping("/topics")
@GetMapping("/topics")
public   List<topic> getAllTopics ()
{
	return s.foo();
	
}
//@RequestMapping("/topic/{val}")
@GetMapping("/topic/{val}")
public  Optional<topic> gettopic(@PathVariable("val") String id)
{	Optional<topic> a =s.getTopic(id);
	System.out.println(a);
	return a;
}
//@RequestMapping(method = RequestMethod.POST,value = "/add")
@PostMapping("/add")
public  void addtopic(@RequestBody topic t)
{
	s.add(t);
	
}
//
//@RequestMapping(method = RequestMethod.PUT,value = "/update/{id}")
//@PutMapping("/update/{id}")
@PatchMapping("/update/{id}")
public  void updatetopic(@RequestBody topic t,@PathVariable String id)
{
	s.update(t,id);
	
}
//@RequestMapping(method = RequestMethod.DELETE,value = "/delete/{id}")
@DeleteMapping("/delete/{id}")
public  void deletetopic(@PathVariable String id)
{
	s.delete(id);
	
}
@GetMapping("/getdu/{duration}")
public Optional<topic>getduration(@PathVariable String duration){
	return s.getdeuration(duration);
}
@GetMapping("/test")
public void gitTest()
{
}
}
