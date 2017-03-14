

package permenentemployee;


public class PermenentEmployee {
    String name,gender,parmanatcode;
    int age,Empcode,PhoneNo,Salary;
    public PermenentEmployee( String name,String gender,String parmanatcode,int age,int Empcode,int PhoneNo,int Salary){
        this.name=name;
        this.gender=gender;
        this.Empcode=Empcode;
        this.PhoneNo=PhoneNo;
        this.Salary=Salary;
        this.parmanatcode=parmanatcode;
        this.age=age;
        System.out.println("Name:"+name+"\nAge:"+age+"\nEmpcode:"+Empcode+"\nGender:"+gender+"\nPhoneNO:"+PhoneNo+"Salary:"+Salary+"\nPermanantCode:"+parmanatcode);
    }
    

   
    public static void main(String[] args) {
        PermenentEmployee obj=new PermenentEmployee("John", "Male", "PM100", 35, 1001, 98967623, 15000);
     
    }
    
}
