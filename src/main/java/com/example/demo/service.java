package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Service
public class service {
@Autowired
dao d;
public  List<topic> foo()
{	List<topic> l=new ArrayList<>();
	for(topic t:d.findAll())
	{
		l.add(t);
	}
	return l;
}
public  Optional<topic> getTopic(String id)
{	
	return d.findById(id);
}
public  void add(topic t)
{
	d.save(t);
	
}

public void update(topic t, String id) {
	
	d.save(t);
	
}
public void delete(String id) {
	d.deleteById(id);
	
}



}
