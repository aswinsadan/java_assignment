
package permenentemployee;


public class ContractEmployee {
       String name,gender;
    int age,Empcode,PhoneNo,Salary,contractduration;
    public ContractEmployee( String name,String gender,int contractduration,int age,int Empcode,int PhoneNo,int Salary){
        this.name=name;
        this.gender=gender;
        this.Empcode=Empcode;
        this.PhoneNo=PhoneNo;
        this.Salary=Salary;
        this.contractduration=contractduration;
        this.age=age;
        System.out.println("Name:"+name+"\nAge:"+age+"\nEmpcode:"+Empcode+"\nGender:"+gender+"\nPhoneNO:"+PhoneNo+"Salary:"+Salary+"\nContract Period:"+contractduration);
    }
    

   
    public static void main(String[] args) {
        ContractEmployee obj=new ContractEmployee("Mary", "Female",6, 24, 1002, 9823672, 10000);
     
    }
    
    
}
