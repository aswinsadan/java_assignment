public class Customer {
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
      Customer obj=new Customer();
      obj.setId(101);
      obj.setName("aswin");
        System.out.println("ID:"+obj.getId());
        System.out.println("\nNAME:"+obj.getName());
    }
   
    }