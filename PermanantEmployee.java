

package employee;


public class PermanantEmployee extends Employee {
    int PermanantCode,pf,gratuity;
    public PermanantEmployee(int id,String name,int PermanantCode){
        super(id,name);
        this.PermanantCode=PermanantCode;
        System.out.println("details of permanant employee\nid:"+id+"\nname:"+name+"\nPermamant code:"+PermanantCode);
    }
   void setSalary(int salary){
       super.salary=salary;
   }
   void setPf(int pf){
       this.pf=pf;
   }
   void setGratuity(int gratuity){
       this.gratuity=gratuity;
   }
   void calculatesalary(){
       salary=salary-(pf+gratuity);
       System.out.println("salary:"+salary);
   }
}
