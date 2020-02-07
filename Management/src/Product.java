
public class Product {
    
    private int id;
    private String name;
    private String nic;
    private String address;
    private String contact_no;
    
    public Product (int pid, String pname,String pnic, String paddresss, String pcontact){
        
        this.id=pid;
        this.name=pname;
        this.nic=pnic; 
        this.address=paddresss;
        this.contact_no=pcontact;
    }
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    public String getNic(){
        return nic;
    }
    public String getAddress(){
        return address;
    }
    public String getContact(){
        return contact_no;
    }

}
