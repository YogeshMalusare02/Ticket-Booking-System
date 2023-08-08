package com.jsp.Theater;

import java.util.Scanner;

public class BoxOffice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     
     Theater theater=new Theater("PVR");
     
     
     
     
     
     
     
     boolean flag=true;
     while(flag) {
    	 System.out.println("Press 1-Bookticket, 2-check availablity, 3-Ticket details, 4-cancel, 5-Exit");
    	 int n=sc.nextInt();
    	 
    	 switch (n) {
    	 case 1: {
    		 System.out.println("Enter the movie name");
    		 String mname=sc.next();
    		 System.out.println("Enter the number of seats");
    		 int seat=sc.nextInt();
    		 theater.setTicket(new Ticket(mname,seat));
    		 theater.bookTickets();
    		 
    	 }break;
    	 
    	 case 2: {
    		 System.out.println("check availablity");
    		 theater.checkAvailablity();
    		 
    	 }break;
    	 
    	 case 3: {
    		 System.out.println("Ticket details");
    		 theater.printTicketDetails(); 
    		
    	 }break;
    	 
    	 case 4: {
    		 System.out.println("Cancel ticket");
    		 System.out.println("Your booking has "+theater.getTicket().getNo_of_seats()+" Tickets");
    		 System.out.println("Enter number of tickets to cancel");
    		 int cancel=sc.nextInt();
    		 if(theater.getTicket().getNo_of_seats()>=cancel) {
    			 theater.cancelTickets(cancel);
    			 
    		 }
    		 else {
            	 System.out.println("Could not cancel your bookings");
             }
    		 
    		 
    		 
    		 
    	 }break;
    	 
    	 case 5: {
    		 flag=false;
    		 System.out.println("Exit");
    	 }break;
    	 
    	 default :{
    		 System.out.println("invalid");
    	 }break;
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 }
     }
	}

}
