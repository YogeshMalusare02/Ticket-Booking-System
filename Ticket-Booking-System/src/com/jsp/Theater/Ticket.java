package com.jsp.Theater;

public class Ticket {
   private String movie_name;
   private int no_of_seats;
   
   
   ////constructor
   Ticket(){}
   
   Ticket(String movie_name,int no_of_seats){
	   this.movie_name=movie_name;
	   this.no_of_seats=no_of_seats;
   }
   
   ////////////////

public String getMovie_name() {
	return movie_name;
}

public void setMovie_name(String movie_name) {
	this.movie_name = movie_name;
}

public int getNo_of_seats() {
	return no_of_seats;
}

public void setNo_of_seats(int no_of_seats) {
	this.no_of_seats = no_of_seats;
}
   
   
   ///////////////
   public void ticketDetails() {
	   System.out.println("====Ticket details====");
	   System.out.println(movie_name);
	   System.err.println(no_of_seats);
   }
   
}
