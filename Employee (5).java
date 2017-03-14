
package employee;


public class Employee {
 int id,salary,pf,gratuity;
 String name;
 public Employee(int id,String name){
     this.id=id;
     this.name=name;
      System.out.println("ID:"+id+"  NAME:"+name);
 }
 
 
 
 
 public static void main(String args[]){
     PermenentEmployee obj1=new PermenentEmployee(101,"AMAL",9);
     obj1.setSalary(10000);
     obj1.setPf(1000);
     obj1.setGratuity(4000);
     obj1.calculateSalary();
 }
 }
