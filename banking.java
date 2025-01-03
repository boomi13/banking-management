import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("services in our bank");
        System.out.println("enter value true if you need serice");
        boolean service= true;
        while(service){
            
            System.out.println("1.deposit\n2.withdraw\n3.checkbalance\n4.anyoffers\n5.exit");
            System.out.println("enter your current balance");
            float current_balance=sc.nextFloat();
        
            System.out.println("enter your account number");
            int account_number=sc.nextInt();
            System.out.println("enter your name");
            String uname=sc.next();
            String name="";
            System.out.println("enter your option");
            int choose=sc.nextInt();
            if(account_number>=1000){
                System.out.println("valid account number "+uname);

            }
            else{
                System.out.println("invalid account number");
            }

        
        switch(choose){
            case 1:
                float deposit_amt=sc.nextFloat();
                name="Deposit";
                System.out.println("deposit value $"+(current_balance+deposit_amt));

                break;
            case 2:
                name="withdraw";
                float withdraw_amt=sc.nextFloat();
                System.out.println("withdraw $"+(current_balance - withdraw_amt));
                break;
            case 3:
                name= "checkbalance" ;
                
                System.out.println("current balnce $"+current_balance);
                break;
            case 4: 
                System.out.println("any offers");
                System.out.println("type whether you need loan or not?");
                boolean l_name=sc.nextBoolean();
                if(l_name){
                    System.out.print("thank for choosing personal loan");System.out.println(" our team will contact youu");

                } 
                  
                else{
                    System.out.println("choose valid loan available");
                } 
                break;
            case 5:
                System.out.println("exiting the service");
                service = false;
                break;    
            default:
                System.out.println("choose valid number");
                break;
                   
            }
            if (choose != 5) {

                System.out.println("\nDo you want to continue with another service? (true to continue, false to exit):");
                service = sc.nextBoolean(); 
                }
           

        }
        
    }
}        