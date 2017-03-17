

package employee;


public class PermanantEmployee extends Employee implements promotionalOffers{
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

    @Override
    public void SeasonOffer(double amount) {
       amount=amount-(0.25*amount);
        System.out.println("seasonal offer:"+amount);
    }

    @Override
    public void regularoffer(double amount) {
        amount=amount-(0.10*amount);
        System.out.println("regular offer:"+amount);
   
    }
          public void registerInsurance() {
          insuranceNo="INS_"+id+01;
         insureAmount=5000;
         System.out.println("insure no:"+insuranceNo+"insureamount:"+insureAmount);
    }

        public void payEMI() {
          totalEMI=0.05*insureAmount;
            System.out.println("emi:"+totalEMI);
    }
     

}
