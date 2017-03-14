

package employee1;


public class Employee {
int id,salary,fine;
 String name;
 public Employee(int id,String name){
     this.id=id;
     this.name=name;
      System.out.println("ID:"+id+"  NAME:"+name);
 }
    
    public static void main(String[] args) {
        Contractemployee obj1=new Contractemployee(101,"AMAL",10);
     obj1.setSalary(10000);
     obj1.setFine(1000);
     obj1.calculatesalary(1000);
       
    }
    
}
