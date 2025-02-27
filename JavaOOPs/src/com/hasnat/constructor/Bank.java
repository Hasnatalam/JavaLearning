/*A BLC class named as Bank is given in which you need to write the code for performing 
the withdrawal and deposit process and also Checking current balance and displayDetail of 
the Customer (BlC class)
Instance variable
bankName:String, private
bankCustomerName:String, private
bankAddress:String, private
bankIFSCCode:Stirng, private
customerAccountNumber:int, private
currentBalance:int, private
---------------------------------------------------
This BLC class will contain 6 methods with the following specifications :-
---------------------------------------------------
1. Name of method : setDeatils
Arguments : 6 parameters
Access modifier : public
 
[bankName,bankCustomerName,bankAddress,bankIFSCCode,customerAccountNumber,c
urrentBalance]
 Return Type : void
Access Modifiers: public
---------------------------------------------------
2. Name of method : withdraw
Arguments : double amount
Return Type : void
Access Modifiers: public
Rules on this Withdraw method:-
In the account, Rs.1000 is the minimum balance to be maintained.
If current balance is Rs.1000 or below, then print InsufficientBalance from the method.
While withdrawing, if the remaining current balance goes less than Rs.1000, then print 
Maintain MinimumBalance message from the method.
While withdrawing, if the remaining current balance is Rs.1000 or above, then print in the 
following manner from the method:-
Transaction Successful.
Available Balance : Rs.1000.0
--------------------------------------------------
3. Name of method : deposit
Arguments : double amount
Return Type : void
Access Modifiers: public 
Rules on this Withdraw method:-
In the account, Rs.1000 is the minimum balance to be maintained.
After deposit from here only call the CurrentBalance Method which will show the Updated 
BALANCE in the following manner from the method:-
For Example : you are trying to deposit 2000 rs in your account and current balance is 
1000 so the output should be 
 Deposited Successfully .
 Available Balance : Rs.3000.0
--------------------------------------------------
4. Name of method : currentBalance
Arguments : No Argument
Return Type : void
Access Modifiers: public
This Method print the Current balance
-------------------------------------------------
5. Name of method : displayDetails
Arguments : No Argument
Return Type : String
Access Modifiers: public

Here We need to to return all the properties in String format through this displayDetails() method.
------------------------------------------------
ELC Class
-------------------------------------------------
An ELC class BankCustomer is given to you, call the method and perform the Operation
[Input you have to take from the Scanner class*/
package com.hasnat.constructor;

public class Bank {
	private String bankName;
	private String bankCustomerName;
	private String bankAddress;
	private String bankIFSCCode;
	private int customerAccountNumber;
	private int currentBalance;
	
	public void setDetails(String bankName,String bankCustomerName,String bankAddress,String bankIFSCCode,int customerAccountNumber,int currentBalance) {
		this.bankName = bankName;
		this.bankCustomerName = bankCustomerName;
		this.bankAddress = bankAddress;
		this.bankIFSCCode = bankIFSCCode;
		this.customerAccountNumber = customerAccountNumber;
		this.currentBalance = currentBalance;
		
	}
	
	public void withdraw(double amount) {
		if(currentBalance<=1000) {
			System.out.println("Insufficient Balance");
		}
		if(currentBalance-amount<1000) {
			System.out.println("Please maintain minimum balance");
		}
		else {
			currentBalance-=amount;
			System.out.println("Transaction Successful.\nAvailable Balance : "+currentBalance+"\nWithdraw amount : "+amount);
		}
	}
	
	public void deposit(double amount) {
		if(currentBalance<=1000) {
			System.out.println("Please maintain minimum balance");
		}
		
		currentBalance+=amount;
		System.out.println("Deposite succesfully ");
		currentBalance();
	}
	
	public void currentBalance() {
		System.out.println("Available balance is : "+currentBalance);
	}
	public String displayDetails() {
		return("Name : "+bankCustomerName+"\nBank name : "+bankName+"\nBank address : "+bankAddress+"\nIFSC : "+bankIFSCCode+"\nAc no. : "+customerAccountNumber);
	
	
	}
}













