//Inheritance - inheriting the properties and behaviour of parent class from child class
class Product{
    //Attribute(state)
    int pid;
    String pname;
    void Product(int pid, String pname){
        this.pid =pid;
        this.pname=pname;
        System.out.println("Product object constructor " +pid+ " & " +pname);
    }
}
class MobileProduct extends Product{
    void MobileProduct(){
        System.out.println("MobileProduct object constructor");
    }
}
public class Inheritance {
    public static void main(String args[]){
        Product pro=new Product();
        pro.Product(101,"globalProduct");
        MobileProduct mobileProduct=new MobileProduct();
        mobileProduct.MobileProduct();
        mobileProduct.Product(1001, "RealmeMobile");
    }
}
