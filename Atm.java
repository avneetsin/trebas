/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sarbjeet kaur
 */
import java.util.Scanner ;

class Saving
{
    public void withdrawal (int a)
    {
       int total= 3456 -a ;
       System.out.println("tour ballance before was: 3456");
       System.out.println("tour savings act ballance after is :"+total);
    }    
}
class Checking extends Saving{
    public void withdrawal (int a)
    {
       int total= 32421 -a ;
       System.out.println("tour ballance before was: 32421");
       System.out.println("tour checking act ballance after is :"+total);
    }    
}
public class Atm {
     public static void main(String args[])
    {
        
        int a;
        int actno;
        int actype;
        Scanner newscan = new Scanner(System.in);
         
        System.out.println("Enter your name:");
        String name= newscan.nextLine();
        System.out.println("Enter the account number:");
        actno= newscan.nextInt();
        System.out.println("Enter account type 1:checking  \t 2:saving ");
        actype= newscan.nextInt();
        System.out.println("Enter Withdrawal amt: ");
        a = newscan.nextInt();
        if (actype==1){
         Checking ckg = new Checking ();
         ckg.withdrawal(a);
         
        }
        if (actype==2){
         Saving svg = new Saving();
         svg.withdrawal(a);
        }
        System.out.println(" your name is:"+name + "\t your account number is: "+actno );
        
        
    }
    
}
    

