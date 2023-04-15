/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sarbjeet kaur
 */
class Pay{
    private int payid;
    private String name;
    private double payment;
public int getpayid()
    {
      return payid;
    }
    
    public String getname()
    {
      return name;
    }
    
    public double getpayment()
    {
      return payment;
    }
    
    public void setpayid (int p)
    {
       payid=p;
    }
    public void setname (String b)
    {
       name=b;
    }
    public void setpayment (int m)
    {
       payment=m;
    }
    

}

class Employee
{
    private int empo;
    private String name;
    private double salary;
    
    public int getempno()
    {
      return empo;
    }
    
    public String getname()
    {
      return name;
    }
    
    public double getsalary()
    {
      return salary;
    }
    
    public void setempo (int a)
    {
      empo=a;
    }
    public void setname (String b)
    {
      name=b;
    }
    public void setsalary (int c)
    {
      salary=c;
    }
    

}


public class encaptulation {
 
    public static void main(String args[]){
    Employee emp1 =new Employee ();
    emp1.setempo(5234);
    emp1.setname("john");
    emp1.setsalary(10000);
  
  System.out.println("Employee no:"+emp1.getempno()+"\tEmployee name"+ emp1.getname()+
          "\tEmployee salary"+ emp1.getsalary());
  Employee emp2 =new Employee ();
  emp2.setempo(007);
  emp2.setname("wick");
  emp2.setsalary(80085);
  Pay pay1= new Pay();
  pay1.setpayid(111);
  pay1.setpayment(3000);
  
  System.out.println("Employee name"+ emp2.getname()+
          "\tEmployee salary"+ emp2.getsalary()+
          "\tEmployee payment"+ pay1.getpayment());
 
 }
}