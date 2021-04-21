package com.example.demo;

import java.util.HashMap;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
	static HashMap<Integer, Data> hs=new HashMap<>();
	
	public DataController() {
		// hs=new HashMap<>();
	}
	
	
	@RequestMapping("/add/{id}/{name}")
	public String addData(@PathVariable Integer id,@PathVariable String name)
	{
		System.out.println(hs);
		hs.put(id, new Data(id, name));
		return (hs.size()>0)?hs.size()+" Data Uploaded ":" Getting error";
	}
	

}



class Data
{
	private int id;
	private String name;
	public Data(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Data [id=" + id + ", name=" + name + "]";
	}
	
	public Data()
	{
		
	}
}
