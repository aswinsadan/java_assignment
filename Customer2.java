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
        Customer obj1=new Customer(101,"Aswin","Sree sadanam",30000);
        System.out.println("DETAILS OF CUSTOMER 1:\nID:"+obj1.Customer_id+"\nNAME:"+obj1.Name+"\nADDRESS:"+obj1.address+"\nSALARY:"+obj1.Salary);
   Customer obj2=new Customer(102,"Amal","farm vilaa",35000);
        System.out.println("\nDETAILS OF CUSTOMER 2:\nID:"+obj2.Customer_id+"\nNAME:"+obj2.Name+"\nADDRESS:"+obj2.address+"\nSALARY:"+obj2.Salary);
    Customer obj3=new Customer(103,"Amith","nest",37000);
        System.out.println("\nDETAILS OF CUSTOMER 3:\nID:"+obj3.Customer_id+"\nNAME:"+obj3.Name+"\nADDRESS:"+obj3.address+"\nSALARY:"+obj3.Salary);
    }
    
    
  
    
}