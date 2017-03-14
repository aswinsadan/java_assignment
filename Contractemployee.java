

package employee1;


public class Contractemployee extends Employee {
    int ContractDuration,total_salary;
   
    public Contractemployee(int id,String name,int ContractDuration){
        super(id,name);
        this.ContractDuration=ContractDuration;
        System.out.println("contract duration:"+ContractDuration);
    }
    void setSalary(int salary){
        super.salary=salary;
    }
    void setFine(int fine){
        super.fine=fine;
    }
    void calculatesalary(int fine){
        
        total_salary=salary-super.fine;
        System.out.println("SALARY:"+total_salary);
    }
    
    
}
