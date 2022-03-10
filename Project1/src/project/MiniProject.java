package project;

import java.util.Scanner;

class MiniProject 
{
	private String name;
	private String address;
	private char type1;
	private int balance;
	private int accno;

	// Constructor of class Bank
	MiniProject() 
	{

		// Initializing values 0 for float
		// and null for String and character
		name = " ";
		address = " ";
		type1 = ' ';
		balance = 0;
	}

// Method to open the account
void open_account()
{
	Scanner sc = new Scanner(System.in);  
    System.out.println("Enter username");

    name = sc.nextLine();  
//    System.out.println("name is: " + userName);
    
    System.out.println("Enter Address");
    address = sc.nextLine();
//    System.out.println("Address is: " + address);
    
    System.out.println("What type of account you want to open saving(S) or Current(C):");
    System.out.println("Enter Account Type");
    
    type1 = sc.next().charAt(0);
    if (type1 =='S' || type1 == 's')
    {
    	System.out.println("Account Type is Saving");
    }
    else if(type1 == 'C' || type1 == 'c')
    {
    	System.out.println("Account Type is Current");
    }
    else 
    {
    	System.out.println("Invaild Input");
//    	break;
    }
    
    System.out.println("Enter Balance");
    balance = sc.nextInt();
//    int balance = bal;
    System.out.println("balnce is   "+balance);


 //   balance = 8000;
 //   System.out.println("Enter How much money you want to deposit: ");
    System.out.println("Account Created Successfully");
    
}

// Method to deposit the account
void deposit_money()
{   
	Scanner am = new Scanner(System.in);  // Create a Scanner object
  
    System.out.println( "Enter how much money you want to deposit: ");
    int amount = am.nextInt();

    balance  += amount;
    System.out.println( "\n Available Balance: "+balance); 
                                       
}

// Method to withdraw the account
void withdraw_money()
{
	Scanner wit = new Scanner(System.in);  // Create a Scanner object
	System.out.println( "Enter how much money you want to withdraw: ");
    int amount = wit.nextInt();

    balance  -= amount;
    System.out.println( "\n Available Balance: "+balance); 
}

void acc_no()
{
    int min = 14000000;
    int max = 90000000;     
    
    System.out.println("\n Your Account Number is : \n");  
    accno =(int) (Math.random()*(max-min+1)+min);   
    System.out.println(accno);       
}

//Method to display the account
void display_account() 
{
	System.out.println("\n Name: " + name );
	System.out.println("Address: " + address);
	System.out.println("Type: " + type1);
	System.out.println("Balance: " + balance);
	System.out.println("Account No: " + accno);
	}


public static void main(String[] args)
{   
    
    // Creating Customer Object of Bank Class
	char ch1;
    MiniProject customer=new MiniProject();
    Scanner input = new Scanner(System.in);
    
    System.out.println("...........BANK MANAGEMENT SYSTEM.......................................");
    
    
    System.out.println("\n======================ABC CO-OPERATIVE BANK==============================================================\n");
   
    System.out.println("\n CREATE ACCOUNT    \n");
     
    customer.open_account();
    customer.acc_no();
    
    System.out.println("\n........................................................................\n");

    
    System.out.println("A. Deposit Money "+'\n'+ "B. Withdraw Money"+ '\n'+ "C. Show Details");
    
    String options = input.nextLine();
    switch(options)
    {
    
    case "a":
    	System.out.println(".......................DEPOSIT MONEY.....................................");
    	customer.deposit_money();
    	break;
    	
    case "b":
    	System.out.println("........................WITHDRAW MONEY.....................................");
    	customer.withdraw_money();
    	break;
    	
    case "c":
    	System.out.println("...........................SHOW DETAILS....................");
    	customer.display_account();
    	break;
    	
    default :
    	System.out.println("Invalid Input");
    
    }  
    	System.out.println("\n    ........  Thanku So Much For Choosing Us ........              \n");
}
}
