

package employee6;


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
      Employee obj=new Employee();
      obj.setId(101);
      obj.setName("aswin");
        System.out.println("ID:"+obj.getId());
        System.out.println("\nNAME:"+obj.getName());
    }
    
}
