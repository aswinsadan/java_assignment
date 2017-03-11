

package employee7;


public class Employee {
     int id;
    String name;
    public void setId(int id)
    {
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

   
    public static void main(String[] args) {
        Employee obj1=new Employee();
        obj1.setId(1);
        obj1.setName("aswin");
        System.out.println("details for customer no.1\nID:"+obj1.getId());
        System.out.println("\nNAME:"+obj1.getName());
         Employee obj2=new Employee();
        obj2.setId(2);
        obj2.setName("amal");
        System.out.println("details for customer no.2\nID:"+obj2.getId());
        System.out.println("\nNAME:"+obj2.getName());
         Employee obj3=new Employee();
        obj3.setId(3);
        obj3.setName("amith");
        System.out.println("details for customer no.3\nID:"+obj3.getId());
        System.out.println("\nNAME:"+obj3.getName());
    }
    
}
