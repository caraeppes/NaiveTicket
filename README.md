# NaiveTicket

The second Objects lab, from the BlueJ book's second chapter.

Look for the [Chapter 2 file](./doc/BlueJ-objects-first-ch2.pdf) you need in the [doc](./doc) folder.
There is 35 pages of reading and exercises in the chapter.

Work through all these exercises. You edit this file with your answers for these exercises.

### Exercise 2.1
* Create a TicketMachine object on the object bench.
* Upon viewing its methods, `getBalance`, `getPrice`, `insertMoney`, `printTicket`.
* Use `getPrice` method to view the value of the price of the tickets that was set when this object was created.
* Use `insertMoney` method to simulate inserting an amount of money into the machine.
* Use `getBalance` to check that the machine has a record of the amount inserted.
	* You can insert several separate amounts of money into the machine, just like you might insert multiple coins or notes into a real machine. Try inserting the exact amount required for a ticket. As this is a simple machine, a ticket will not be issued automatically, so once you have inserted enough money, call the `printTicket` method. A facsimile ticket should be printed in the BlueJ terminal window.

### Exercise 2.2
* What value is returned if you check the machine’s balance after it has printed a ticket?

0


### Exercise 2.3
* Experiment with inserting different amounts of money before printing tickets.
	* Do you notice anything strange about the machine’s behavior?
	* What happens if you insert too much money into the machine – do you receive any refund?
	* What happens if you do not insert enough and then try to print a ticket?

Regardless of the amount of money you insert, you can print your ticket.  If you insert too much money and print your ticket, you do not receive a refund.  If you do not insert enough money, your ticket will still print.



### Exercise 2.4
* Try to obtain a good understanding of a ticket machine’s behavior by interacting with it on the object bench before we start looking at how the `TicketMachine` class is implemented in the next section.

### Exercise 2.5
* Create another ticket machine for tickets of a different price.
	* Buy a ticket from that machine.
	* Does the printed ticket look different?

The printed ticket looks the same except for the price.  Each printed ticket has is respective price.



### Exercise 2.6
* Write out what you think the outer wrappers of the `Student` and `LabClass` classes might look like – do not worry about the inner part.

public class Student{}
public class LabClass{}

 

### Exercise 2.7
Does it matter whether we write<br>
`public class TicketMachine`<br>
or<br>
`class public TicketMachine`<br>
in the outer wrapper of a class?

* Edit the source of the `TicketMachine` class to make the change and then close the editor window.
	* Do you notice a change in the class diagram?
	* What error message do you get when you now press the compile button?
	* Do you think this message clearly explains what is wrong?

The class diagram shows lines through the TicketMachine class and it does not compile.  The error says "<identifier> expected".  This explains that following the declaration of a class, there needs to be an identifier or name for the class.  public TicketMachine is not a valid identifier for a class.

  

### Exercise 2.8
* Check whether or not it is possible to leave out the word `public` from the outer wrapper of the `TicketMachine` class.

It is possible to leave out the word public.



### Exercise 2.9
* From your earlier experimentation with the ticket machine objects within BlueJ you can probably remember the names of some of the methods – `printTicket`, for instance.
	* Look at the class definition in Code 2.1 and use this knowledge, along with the additional information about ordering we have given you, to try to make a list of the names of the fields, constructors, and methods in the `TicketMachine` class.
	* Hint: There is only one constructor in the class.


public class TicketMachine{
	// fields
	private int price;
	private int balance;
	private int total;

	// constructor
	public TicketMachine(int ticketCost){}

	// methods
	public int getPrice(){}
	public int getBalance(){}
	public void insertMoney(int amount){}
	public void printTicket(){}
}



### Exercise 2.10
* Do you notice any features of the constructor that make it significantly different from the other methods of the class?

The constructor does not have a return type.



### Exercise 2.11
* What do you think is the type of each of the following fields?

```java
private int count;
private Student representative;
private Server host;
```

count is an int, representative is a Student, and host is a Server. 



### Exercise 2.12
* What are the names of the following fields?

```java
private boolean alive;
private Person tutor;
private Game game;
```

The names are alive, tutor, and game.



### Exercise 2.13

In the following field declaration from the TicketMachine class<br>

```java
private int price;
```
does it matter which order the three words appear in?
* Edit the `TicketMachine` class to try different orderings. After each change, close the editor.
	* Does the appearance of the class diagram after each change give you a clue as to whether or not other orderings are
possible?
	* Check by pressing the compile button to see if there is an error message.
	* Make sure that you reinstantiate the original version after your experiments!

When the order is changed, the TicketMachine class has lines through it on the class diagram and the program does not compile.  The error given reads "<identifier> expected", just like the error when the order of "public class TicketMachine" was changed.



### Exercise 2.14
* Is it always necessary to have a semicolon at the end of a field declaration?
* Once again, experiment via the editor.
* The rule you will learn here is an important one, so be sure to remember it.

Yes, it is always necessary to have a semicolon at the end of a field declaration.



### Exercise 2.15
* Write in full the declaration for a field of type `int` whose name is `status`.

private int status;



### Exercise 2.16
* To what class does the following constructor belong?
```
public Student(String name)
```

It belongs to the Student class.




### Exercise 2.17
* How many parameters does the following constructor have and what are their types?
```
public Book(String title, double price)
```

It has 2 parameters of type String and double.




### Exercise 2.18
* Can you guess what types some of the `Book` class’s fields might be?
* Can you assume anything about the names of its fields?

The fields are likely type String and double because those are the types of the constructor's parameters.  We do not know what the name of the fields will be, but they would likely be title and price.


Work all Exercises from 2.19 to 2.58 that are **NOT** marked *Challenge exercise*.
READ upto and INCLUDING section 2.15 of this chapter.



### Exercise 2.19

public Pet(String petsName){
	name = petsName;
}


### Exercise 2.20

This constructor is declaring a new price variable and is not referring to the price field of the TicketMachine.  This code compiles, but when you create a TicketMachine with the constructor, the ticketCost parameter does not change the price field of the TicketMachine object.


### Exercise 2.21

The getPrice method returns the price of the TicketMachine.  The getBalance method returns the amount of money inserted into the machine.


### Exercise 2.22

A call to getBalance could be characterized as "How much money have I inserted into the machine?".


### Exercise 2.23

The return statement does not need to be changed because changing the name of the getBalance method does not change the name of the balance field.


### Exercise 2.24

public int getTotal(){
	return total;
}


### Exercise 2.25

If you remove the return statement from getPrice and try to compile, you get an error that says "missing return statement".



### Exercise 2.26

getPrice() returns an integer that is the price of the TicketMachine.  printTicket() prints the ticket, including the price of the ticket, but it does not return anything.



### Exercise 2.27

insertMoney and printTicket do not have return statements because their return types designated in their headers are 'void'.
 

### Exercise 2.28

### Exercise 2.29

You can tell that setPrice is not a constructor from its header because setPrice has a return type of void and constructors do not have return types.


### Exercise 2.30

public void setPrice(int ticketCost){
	price = ticketCost;
}


### Exercise 2.31

public void increase(int points){
	score += points;
}


### Exercise 2.32

public void discount(int amount){
	price -= amount;
}


### Exercise 2.33

public void prompt(){
	System.out.println("Please insert the correct amount of money.");
}   


### Exercise 2.34

public void showPrice(){
	System.out.println("The price of the ticket is " + price + " cents.");
} 


### Exercise 2.35

They do not have the same output because the different TicketMachine objects have different values in their price fields.


### Exercise 2.36

System.out.println("# " + "price" + " cents.") prints "# price cents.".


### Exercise 2.37

System.out.println("# price cents.") also prints "# price cents.".


### Exercise 2.38

No because neither of those statements print the value at the field 'price'.  They simply print "price".


### Exercise 2.39

If you remove the parameter for the TicketMachine constructor and set the value of price to 1000, you no longer have to enter a value for price when making an instance of a TicketMachine.


### Exercise 2.40

public void empty(){
	total = 0;
} 

empty() is a mutator and requires no parameters.


### Exercise 2.41

public void setPrice(int newPrice){
	price = newPrice;
} 

This method is a mutator.



### Exercise 2.42

// sets price to 1000
  public TicketMachine(){
      price = 1000;
      balance = 0;
      total = 0;
}

// sets price to value passed into parameter p
  public TicketMachine(int p){
      price = p;
      balance = 0;
      total = 0;
}


### Exercise 2.43

When you call insertMoney with an integer of value 1 or more, the balance increases.  If you pass in a negative number or 0, the error is printed and the balance does not change.


### Exercise 2.44

If > is changed to >= in the insertMoney method, when 0 is passed as a parameter, the error is no longer printed, but the balance still remains unchanged.


### Exercise 2.45

The boolean field in the Circle class was called isVisible and was used to determine whether or not the Circle object would be made visible on the screen when the draw method was called.  This was well suited to being controlled by a boolean with only 2 different values because the Circle has either going to be Visible or not visible.  There are no other options.


### Exercise 2.46

In the earlier printTicket version, the ticket was printed regardless of the balance.  The total was updated to the sum of the previous total and whatever the balance was.  This also occurred regardless of the value of the balance.  Then, the balance was reset to 0 regardless of if it had been higher or lower than the price. 

In the newer printTicket version, if the balance was less than the price, an error was printed instead of the ticket.  If the balance was greater than or equal to the price, the ticket was printed.  The total was increased to the previous total plus the price (rather than the entire balance).  The balance was decreased to the difference between the balance and the price (rather than automatically being reset to 0).


### Exercise 2.47

The value in the balance field could not be set to a negative number by subtracting price from it because "balance = balance - price" is inside of an if statement that checks that balance is greater than or equal to price before it runs the code.


### Exercise 2.48

### Exercise 2.49

int saving = price * discount;


### Exercise 2.50

int mean = total / count;


### Exercise 2.51

if (price > budget){
	System.out.println("Too expensive");
}
else{ 
	System.out.println("Just right");
}


### Exercise 2.52
 
if (price > budget){
	System.out.println("Too expensive.  Your budget is " + budget + ".");
}
else{ 
	System.out.println("Just right");
}


### Exercise 2.53

In the original refundBalance, the balance to be refunded was stored in another int variable, amountToRefund.  This allowed us to store and return the balance to be refunded after resetting balance to 0.  In the new refundBalance, balance is set to 0 and then balance is returned, so it always returns 0.


### Exercise 2.54

The code does not compile.  It gives errors 'missing return statement' and 'unreachable statement'.  The return statement needs to be the last line in a block of code. We exit the method after the return statement, hence the 'unreachable statement' error referring to the statement 'balance = 0;' on the line following 'return balance;'.


### Exercise 2.55

public int emptyMachine(){
	int temp = total;
	total = 0;
	return temp;
}


### Exercise 2.56

emptyMachine is both an accessor and a mutator.



### Exercise 2.57

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