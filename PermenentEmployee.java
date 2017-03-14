package employee;


public class PermenentEmployee extends Employee {
    int PermenantCode;
    int BasicSalary;
    
    public PermenentEmployee(int id,String name,int PermanentCode){
        super(id,name);
        this.PermenantCode=PermanentCode;
        System.out.println("permanentcode:"+PermanentCode);
  }
    void setSalary(int salary){
        super.salary=salary;
    }
   int getSalary(){
       return salary;
   }
   void setPf(int pf){
        super.pf=pf;
    }
   int getPf(){
       return pf;
   }
   void setGratuity(int gratuity){
        super.gratuity=gratuity;
    }
   int getGratuity(){
       return gratuity;
   }
   
    void calculateSalary(){
       BasicSalary=salary-(pf+gratuity);
        System.out.println("BASIC SALARY:"+BasicSalary);
       
    }
    
    
         
    
       
       
        
    
}
