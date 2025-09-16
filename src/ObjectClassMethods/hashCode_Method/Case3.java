package ObjectClassMethods.hashCode_Method;

public class Case3 {
    String name;
    int id;

    Case3(String name,int id){
        this.name=name;
        this.id=id;
    }

    public String toString(){
        return name+id;
    }

    public static void main(String[] args) {
        Case3 ob= new Case3("Avinash",45);
        System.out.println(ob);

    }
}

/*in this case we override toString() method then not execute hashCode() method*/
