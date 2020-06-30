
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Hesap hesap1 = new Hesap("Berkay", "123", 720, 1500);
        
        System.out.println("Welcome to Bank App");
        
        if(Login.login(hesap1)){
        
            System.out.println("Which do you do transaction?"
                + "\n1-Pay Into\n2-Draw the Money\n3-Show the Money");
        
         String choice = scanner.nextLine();
         
         if(choice.equals("1")){
             System.out.println("How much money do you pay?\nMoney which pay : " );
             int money = scanner.nextInt();
             hesap1.payInto(money);
             System.out.println(money + " dollars has paid. Your new money : " + hesap1.getAmount());
         }
            
         else if(choice.equals("2")){
             System.out.println("How much money do you draw?\nMoney which draw : ");
             int money = scanner.nextInt();
             hesap1.drawMoney(money);
             System.out.println(money + " dollars has drawn. Your new money : " + hesap1.getAmount());
         }
         
         else if(choice.equals("3")){
             hesap1.showMoney();
         }
            
        }
        
        else{
            System.out.println("Your access is wrong!");
        }
        
    }
}
