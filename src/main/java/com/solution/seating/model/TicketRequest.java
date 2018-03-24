package com.solution.seating.model;

public class TicketRequest 
{
	private String name;
	private int noOfTicketsReq;
	private int row;
	private int section;
	
	//Constructors with parameters
	public TicketRequest(String name,  int noOfTicketsReq)
	{
		super();
		this.name = name;
		this.noOfTicketsReq = noOfTicketsReq;
	}
	//Getters and Setters

	public String getName()
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getNoOfTicketsReq() 
	{
		return noOfTicketsReq;
	}

	public void setNoOfTicketsReq(int noOfTicketsReq) 
	{
		this.noOfTicketsReq = noOfTicketsReq;
	}

	public int getRow() 
	{
		return row;
	}

	public void setRow(int row) 
	{
		this.row = row;
	}

	public int getSection() 
	{
		return section;
	}

	public void setSection(int section) 
	{
		this.section = section;
	}

	@Override
	public String toString() 
	{
		return "TicketRequest [name=" + name + ", noOfTicketsReq=" + noOfTicketsReq + ", row=" + row + ", section="
				+ section + "]";
	}
	
}