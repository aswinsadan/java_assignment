

package employee;


public abstract class Insurance {
     int InsuranceNo,insureAmount,totalEMI;
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
