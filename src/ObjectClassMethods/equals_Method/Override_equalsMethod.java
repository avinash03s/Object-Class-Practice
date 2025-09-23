package ObjectClassMethods.equals_Method;

import ObjectClassMethods.toString_Method.Student;

public class Override_equalsMethod {
    String employ;
    int id;
   // String employ1;

    Override_equalsMethod(String employ,int id){
        this.employ=employ;
        this.id=id;
    }

   // @Override
    /*public boolean equals(Object obj) {
        if (obj == this) {
            return true;
            if (obj instanceof Override_equalsMethod) {
                Override_equalsMethod ob = (Override_equalsMethod) obj;

                if (employ.equals(employ) && id == ob.id) {
                    return true;
                } else {
                    return false;
                }
            }else {
              return false;
              }
        }
        return false;
    }*/

    public static void main(String[] args) {
        Override_equalsMethod ob= new Override_equalsMethod("Avinash",264);
        Override_equalsMethod ob1= new Override_equalsMethod("Ram",100);
        Override_equalsMethod ob2= new Override_equalsMethod("Avinash",264);
        Override_equalsMethod ob3=ob;

        System.out.println(ob.equals(ob1));
        System.out.println(ob.equals(ob2));
        System.out.println(ob.equals(ob3));

    }

}
