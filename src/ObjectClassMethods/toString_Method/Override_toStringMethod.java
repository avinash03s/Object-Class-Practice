package ObjectClassMethods.toString_Method;

/*when we try to take meaningful out-put then override toString method*/

import java.util.ArrayList;

public class Override_toStringMethod {
    String name;
    int id;
    Override_toStringMethod(String n,int id){
        this.name=n;
        this.id=id;
    }

    //override toString() method
    @Override
    public String toString(){
        return "Student Name : "+name+" | "+"Student Id: "+id;
    }



    public static void main(String[] args) {
        Override_toStringMethod ob1= new Override_toStringMethod("Avinash",101);
        System.out.println(ob1);

        Override_toStringMethod ob2= new Override_toStringMethod("Karan",102);
        System.out.println(ob2);

        Override_toStringMethod ob3= new Override_toStringMethod("Harsh",103);
        System.out.println(ob3);

        String s= new String("Surwase");
        System.out.println(s);

        ArrayList li= new ArrayList();
        li.add("A");
        li.add("B");
        System.out.println(li);

    }
}
