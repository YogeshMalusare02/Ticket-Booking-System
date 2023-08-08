package com.jsp.Theater;

public class Theater {

	private String theater_name;
	static int no_of_seats=500;
	//////////
	
	private Ticket ticket;
	
	///////////////////
	
	Theater(){
		}
	
	Theater(String theater_name){
		this.theater_name=theater_name;
	}
	////////////////////////

	public String getTheater_name() {
		return theater_name;
	}

	public void setTheater_name(String theater_name) {
		this.theater_name = theater_name;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
    
	
	
	
	
	////////////////////methods
	
	public void bookTickets() {
		System.out.println("Booking in progress");
		
		if(ticket.getNo_of_seats()<=Theater.no_of_seats) {
		int remaining=Theater.no_of_seats-ticket.getNo_of_seats();
		Theater.no_of_seats=remaining;
		System.out.println("your ticket has been booked");
		}
		else {
			System.out.println("no booked due to technical issue");
		}
		System.out.println(no_of_seats+" left for booking");
		
	}
	
	public void cancelTickets(int n) {
		System.out.println("Cancelling in progress");
		int remaining=Theater.no_of_seats+n;
		Theater.no_of_seats=remaining;
		System.out.println(n+" tickets are cancelled");
		System.out.println(no_of_seats+" left for booking");
		
	}
	
	public void checkAvailablity() {
		System.out.println(no_of_seats+" left for booking");
	}
	
	public void printTicketDetails() {
		System.out.println("**************TICKET DETAILS****************");
		System.out.println("*         Movie Name: "+ticket.getMovie_name()   +"                  *");
		System.out.println("*         No_Of_Tickets: "+ticket.getNo_of_seats() +"                *");
		System.out.println("*     Thank You for choosing PVR           *");
		System.out.println("********************************************");
		
	}
	
	
	
}
