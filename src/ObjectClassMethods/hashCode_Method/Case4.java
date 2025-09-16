package ObjectClassMethods.hashCode_Method;

public class Case4 {
    String name;
    int id;
    Case4(String name,int id){
        this.name=name;
        this.id=id;
    }

    @Override
    public String toString(){
        return name+id;
    }

    @Override
    public int hashCode(){
        return id;
    }

    public static void main(String[] args) {
        Case4 ob= new Case4("java",19);
        System.out.println(ob);
    }
}

/*
* in these case we are both toString() and hashCode() method are override in class then
* only toString() method are executed */
