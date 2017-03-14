

package employee;


public class Employee {
  int id,salary;
  String name;
  public Employee(int id,String name){
      this.id=id;
      this.name=name;
      
  }
  
    public static void main(String[] args) {
        PermanantEmployee p=new PermanantEmployee(101,"ASWIN", 9);
        p.setSalary(15000);
        p.setPf(1000);
        p.setGratuity(1000);
        p.calculatesalary();
        ContractedEmployee c=new ContractedEmployee(102, "AMAL", 6);
        c.setSalary(10000);
        c.setFine(4000);
        c.calculatesalary();
        
    }
    
}
