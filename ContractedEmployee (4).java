

package employee;


public class ContractedEmployee extends Employee implements promotionalOffers {
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

    @Override
    public void SeasonOffer(double amount) {
        amount=amount-(0.08*amount);
        System.out.println("seasonal offer:"+amount);
    }

    @Override
    public void regularoffer(double amount) {
        amount=amount-(0.15*amount);
        System.out.println("regular offer:"+amount); 
    }
    
    public void registerInsurance() {
      insuranceNo="INS_"+id+02;
          insureAmount=3000;
         System.out.println("insure no:"+insuranceNo+"insureamount:"+insureAmount);
    }

        public void payEMI() {
             totalEMI=0.08*insuranceAmount;
            System.out.println("emi:"+totalEMI);
    
    }
}
