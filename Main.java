class Main {
  public static void main(String[] args) {
   // kindly use appropriate data types for your declaration
   // declare variables days the debtor defaulted, amount the debtor is to pay per day,amount the debtor paid and assign values to them
   int daysdefaulted = 20;
   int amountperday = 1500;
   int paidamount = 6000;
   
   //Declare the variable of the total amount the debtor is to pay, the days the debtor paid for, amount the debtor is left to pay, days the debtor has not payed for
   int amounttopay;
   int dayspaid;
   int daystopay;
   int amountlefttopay;

   // calculate and print total amount the debtor is to pay
   amounttopay = daysdefaulted * amountperday;
   System.out.println("The amount to pay is " + amounttopay);

   // calculate and print the days the debtor paid for
   dayspaid = paidamount / amountperday;
   System.out.println("The number of days paid for is " + dayspaid);
  
  // calculate and print the amount whose day was not captured because the amount was incomplete
  int incompleteamount = paidamount % amountperday;
  System.out.println("The incomplete amount not captured in a day is " + incompleteamount);

   // calculate and print amount the debtor is left to pay
   amountlefttopay = amounttopay - paidamount;
   System.out.println("The amount left to pay is " + amountlefttopay);

   // calculate and print days the debtor has not payed for
   daystopay = daysdefaulted - dayspaid;
   System.out.println("The number of days the debtor has not paid for is " + daystopay);

   //kindly remove the statement below when you are done with the assignment
    
  }
}