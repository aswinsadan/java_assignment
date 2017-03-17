

package employee;


public abstract class Insurance {
     double insureAmount,totalEMI;
     String insuranceNo;
    public abstract void  registerInsurance();
    public abstract void  payEMI();
    public void claimInsurance(){
        if(totalEMI==insureAmount){
            System.out.println(insureAmount);
        }
        else {
           System.out.println(totalEMI); 
        }
    }
    
}
