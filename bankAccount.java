public class bankAccount{
       String accountHolder;
        double balance;

        public bankAccount(String accountHolder,double balance){
            this.accountHolder=accountHolder;
            this.balance=balance;
        }

        
    
public  void deposit(double amt){
    balance= balance + amt;
    System.out.println("deposited amt: " + amt);
}
public  void withdraw(double amt){
    balance= balance - amt;
    System.out.println("withdraw amt:" +amt);
}
public  void displayBalance(){
    System.out.println(accountHolder +" "+ "balance:"  +balance);
}

public static void main(String args[]){
    bankAccount acc1=new bankAccount("laddu",10000);
    bankAccount acc2=new bankAccount("vaishu",15000);
    acc1.deposit(1500);
    acc1.withdraw(1700);
    acc1.displayBalance();
}
}


