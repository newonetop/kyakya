package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestDemo {
	private int wins;
	private int losses;
	
	@RequestMapping(value="/score/update",method=RequestMethod.PUT)
	public String updatescore(int wins, int losses)
	{
		this.wins=wins;
		this.losses=losses;
		return "wins="+wins+"losses="+losses;
	}
	@RequestMapping(value="/score/delete",method=RequestMethod.DELETE)
	public String deletescore()
	{
		this.wins=0;
		this.losses=0;
		return "wins="+wins+"losses="+losses;
	}
	@RequestMapping(value="/score/losses",method=RequestMethod.POST)
	public int increaselosses()
	{
		return losses++;
	}
	@RequestMapping(value="/score/wins",method=RequestMethod.POST)
	public int increasewins()
	{
		return wins++;
	}
	
	@RequestMapping(value="/score/wins",method=RequestMethod.GET)
	public int getwins()
	{
		return wins;
	}
	@RequestMapping(value="/score/losses",method=RequestMethod.GET)
	public int getlosses()
	{
		return losses;
	}   
}
