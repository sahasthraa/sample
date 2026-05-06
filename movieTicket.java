public  class movieTicket {
    String moviename;
    double seatno;
    double price;


public movieTicket(String moviename,double seatno,double price){
    this.moviename=moviename;
    this.seatno=seatno;
    this.price=price;
}
public void printTicket(){
    System.out.println("moviename: " + moviename);
    System.out.println("seatno: " + seatno);
    System.out.println("price: " + price);
}
public static void main(String args[]){
    movieTicket ticket1=new movieTicket("RRR",17,450);
    movieTicket ticket2=new movieTicket("devara",42,500);
    movieTicket ticket3=new movieTicket("Dragon",99,1000);

    ticket1.printTicket();
    ticket2.printTicket();
    ticket3.printTicket();
}
}
