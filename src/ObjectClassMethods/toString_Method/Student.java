package ObjectClassMethods.toString_Method;

public class Student {

}
class B{
    public static void main(String[] args) {
        Student ob= new Student();
       System.out.println(ob);
        System.out.println(ob.toString());
    }
}
// when we try to print object reference then internally toString method are called;