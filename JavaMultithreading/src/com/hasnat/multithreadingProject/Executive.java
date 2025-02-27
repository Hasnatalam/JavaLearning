/*
 * package com.hasnat.multithreadingProject; import java.util.Arrays; import
 * java.util.Scanner;
 * 
 * public class Executive{
 * 
 * static int noOfAvailableSeat = 10; static int availableSeat []=
 * {1,2,3,4,5,6,7,8,9,10};
 * 
 * 
 * 
 * public static synchronized void getTicket(Scanner sc) { try {
 * 
 * String name = Thread.currentThread().getName();
 * System.out.print("Enter no of ticket you want:"); int noOfTicket =
 * sc.nextInt();
 * 
 * //Checking whether no of seat are greater then 0 are not if(noOfTicket >0)
 * 
 * 
 * { //Checking whether no of seat are available or not if(noOfAvailableSeat >=
 * noOfTicket) {
 * 
 * System.out.println("Choose seat no :");
 * System.out.println("Avalable seat are :"); for(int a:availableSeat) {
 * if(a!=0) System.out.print(a+" "); }
 * 
 * int selectedSeat[] =new int[noOfTicket]; for(int i =0;i<noOfTicket;i++) {
 * selectedSeat[i]=sc.nextInt(); } Arrays.sort(selectedSeat);
 * //--------z----------------Verifying Seat no
 * duplication--------------------------------
 * 
 * int verifySeat[]= new int[noOfAvailableSeat];
 * 
 * for(int i=0;i<noOfTicket;i++) { if(verifySeat[i]!=-1) { int c=1; for(int
 * j=i+1;j<noOfTicket;j++) { if(selectedSeat[i]==selectedSeat[j]) {
 * c++;verifySeat[j]=-1; } } verifySeat[i]=c; } } for(int
 * i=0;i<noOfAvailableSeat;i++) { if(verifySeat[i]>1) {
 * 
 * throw new
 * Exception("You have enterd wrong seat no"+selectedSeat[i]+" "+verifySeat[i]+
 * "times"); } }
 * //---------------------------------------------------------------------------
 * ---
 * 
 * 
 * //-----------------Checking selected seat no. is available or
 * not------------------
 * 
 * for(int i=0;i<noOfTicket;i++) { int count=0; for(int
 * j=0;j<noOfAvailableSeat;j++) { if(selectedSeat[i]==availableSeat[j]) {
 * count++; } } if(count==0)throw new
 * Exception("Seat no "+selectedSeat[i]+" is not available"); }
 * 
 * 
 * 
 * //---------------------Deleting Booked
 * seat--------------------------------------- int noOfDeletion=0;
 * 
 * for (int i = 0; i < noOfTicket; i++) { for (int j = 0; j < noOfAvailableSeat
 * ; j++) { if (selectedSeat[i] == availableSeat[j]) { noOfDeletion++; for (int
 * k = j; k < noOfAvailableSeat-noOfDeletion; k++) { availableSeat[k] =
 * availableSeat[k + 1]; } availableSeat[noOfAvailableSeat-noOfDeletion] = 0;
 * break; } } }
 * //---------------------------------------------------------------------------
 * ----
 * 
 * 
 * noOfAvailableSeat-=noOfTicket;
 * System.out.println("-----------------------------");
 * System.out.println("	Cinema Ticket");
 * System.out.println("Name          :"+name);
 * System.out.println("No of ticket  :"+noOfTicket);
 * System.out.println("Class         :Executive	");
 * System.out.println("Rate          :300");
 * System.out.println("Total amount  :"+noOfTicket*300); System.out.print
 * ("Seat No(s)    :"); for(int seat:selectedSeat) { System.out.print(seat+" ");
 * } System.out.println("\n----------------------------\n");
 * 
 * } else throw new
 * Exception("Sorry "+name+" only "+noOfAvailableSeat+" seat are available"); }
 * else throw new Exception("You have enter a Invalid no of seat");}
 * catch(Exception e) { System.out.println(e.getMessage()); }
 * 
 * }
 * 
 * }
 */