

package employee;


public class Customer implements promotionalOffers{
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
        Customer a=new Customer();
       /* Customer b=new Customer();
        Customer c=new Customer();
        a.setId(1);
        a.setName("aswin");
       System.out.println("details of object1\nid:"+a.getId()+"\nname:"+a.getName());
         b.setId(2);
        b.setName("amal");
        System.out.println("details of object2\nid:"+b.getId()+"\nname:"+b.getName());
         c.setId(3);
        c.setName("amith");
        System.out.println("details of object3\nid:"+c.getId()+"\nname:"+c.getName()); */
        a.SeasonOffer(2500);
        a.regularoffer(2500);
        
    }

    @Override
    public void SeasonOffer(double amount) {
      amount=amount-(0.10*amount);
        System.out.println("seasonal offer:"+amount);
    }

    @Override
    public void regularoffer(double amount) {
   
        System.out.println("regular offer:"+amount);
    }
    
}
