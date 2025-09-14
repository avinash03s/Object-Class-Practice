package ObjectClassMethods.ObjectClass;
import java.lang.reflect.*;
public class ObjectClass {
    public static void main(String[] args) throws Exception {
        int count=0;
        Class c= Class.forName("java.lang.Object");
        Method[]m=c.getDeclaredMethods();
        for (Method m1:m){
            count++;
            System.out.println(m1.getName());
        }
        System.out.println("The Number of method Present in object class: "+count);
    }
}
