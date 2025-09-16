package ObjectClassMethods.hashCode_Method;

public class Case2 {
    int id;
    Case2(int id){
        this.id=id;
    }

    @Override
    public int hashCode(){
        return id;
    }

    public static void main(String[] args) {
        Case2 ob= new Case2(10);
        System.out.println(ob);
    }

}
/*in this case we override hashCode() method then internally toString() & hashCode()
* are executed ;*/
