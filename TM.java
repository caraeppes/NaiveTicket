/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * @author David J. Barnes and Michael Kölling
 * @version 2006.03.30
 */
public class TM {

    private int price;
    private int balance;
    private int total;
    
    public TM(int ticketCost){
        price = ticketCost;
        balance = 0;
        total = 0;
    }
    
    public int getPrice(){
        return price;
    }
    
    public int getBalance(){
        return balance;
    }
    
    public void insertMoney(int amount){
        if(amount >= 0){
            balance = balance + amount;
        }
        else{
            System.out.println("Use a positive amount: " + amount);
        }
    }
    
    public void printTicket(){
        
        int amountLeftToPay = price - balance;
        
        if(amountLeftToPay <= 0) {
            System.out.println("##################"); 
            System.out.println("# The BlueJ Line"); 
            System.out.println("# Ticket"); 
            System.out.println("# " + price + " cents."); 
            System.out.println("##################"); 
            System.out.println();
            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
        }
       
        else {
            System.out.println("You must insert at least: " + 
            amountLeftToPay + " cents.");
        }
    }
    
    public int refundBalance(){
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
    
    public int emptyMachine(){
	int temp = total;
	total = 0;
	return temp;
}
}

