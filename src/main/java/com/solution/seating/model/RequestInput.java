package com.solution.seating.model;

import java.util.List;
//This class is utilized to take input from the customer for pre-sale tickets
public class RequestInput
{
	private List<List<Integer>> layout;
	List<TicketRequest> request;
	
	//Getters and Setters
	public List<List<Integer>> getLayout()
	{
		return layout;
	}
	public void setLayout(List<List<Integer>> layout)
	{
		this.layout = layout;
	}
	public List<TicketRequest> getRequest() 
	{
		return request;
	}
	public void setRequest(List<TicketRequest> request)
	{
		this.request = request;
	}
	
	
}