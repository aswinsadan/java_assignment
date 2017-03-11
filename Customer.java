

package customer;

import java.util.Scanner;


public class Customer {
    int Customer_id;
    String Name;
    String address;
    int Salary;
    public Customer( int id,String Name,String address,int Salary){       
        this.Customer_id=id;
        this.Name=Name;
        this.address=address;
        this.Salary=Salary;
    }

   
    public static void main(String[] args) {
        Customer obj=new Customer(101,"Aswin","Sree sadanam",30000);
        System.out.println("DETAILS OF CUSTOMER:ID:"+obj.Customer_id+"\nNAME:"+obj.Name+"\nADDRESS:"+obj.address+"\nSALARY:"+obj.Salary);
    }
    
}
