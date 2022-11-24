package account;

//code after refactoring

class Account {
 float principal;
 float rate;
 int daysActive;
 int accountType;

 public static final int STANDARD = 0;
 public static final int BUDGET = 1;

 public static final int PREMIUM = 2;
 public static final int PREMIUM_PLUS = 3;
 public static final double percentage = 0.0125; //initializing and assigning the percentage value outside the function and making it public

   float principalInterest(){

     return( principal *(float) Math.exp( rate * (daysActive/365.25) ) )- principal; }

     //created a fuction principlInterest to be called in calculateFee 
 
   float calculateFee (Account accounts[]) {
    
     float totalFee = 0;
     Account account;
     for (int i = 0; i < accounts.length; i++) {
 
     account = accounts[i];
 
     if ( account.accountType == Account.PREMIUM || account.accountType == Account.PREMIUM_PLUS )
      {
 
            totalFee += percentage * account.principalInterest();
            
     }
 
     }
     return totalFee;
     }
 
}