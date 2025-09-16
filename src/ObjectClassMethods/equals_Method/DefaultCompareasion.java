package ObjectClassMethods.equals_Method;

public class DefaultCompareasion {

    String name;
    int id;
    DefaultCompareasion(String name,int id){
        this.name=name;
        this.id=id;
    }

    public static void main(String[] args) {
        DefaultCompareasion ob1=new DefaultCompareasion("Avinash",10);
        DefaultCompareasion ob2= new DefaultCompareasion("Ram",20);
        DefaultCompareasion ob3= new DefaultCompareasion("Avinash",10);
        DefaultCompareasion ob4=ob1;
        System.out.println(ob1.equals(ob2));
        System.out.println(ob1.equals(ob3));
        System.out.println(ob1.equals(ob4));
    }
}
