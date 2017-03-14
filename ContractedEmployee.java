

package employee;


public class ContractedEmployee extends Employee {
    int ContractDuration,fine;
    public ContractedEmployee(int id,String name,int ContractDuration){
       super(id,name);
       this.ContractDuration=ContractDuration;
       System.out.println("details of contracted employee\nid:"+id+"\nname:"+name+"\ncontract code:"+ContractDuration);
    }
    void setSalary(int salary){
        super.salary=salary;
    }
    void setFine(int fine){
        this.fine=fine;
    }
    void calculatesalary(){
        salary=salary-fine;
         System.out.println("salary:"+salary);
    }
}
