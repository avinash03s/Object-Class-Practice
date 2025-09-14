package ObjectClassMethods.toString_Method;

public class A {
    String name;
    int rollNo;
    A(String n,int r){
        this.name=n;
        this.rollNo=r;
    }

    public static void main(String[] args) {
        A ob1= new A("Avi",45);
        A ob2= new A("Java",46);
        System.out.println(ob1);
        System.out.println(ob2);
    }
}

//output=>className+"@"+hashcode_in_hexadecimal_form


/*in this program try to print object reference then internally toString()
* method will call and output above program is (className+"@"+hashcode_in_hexadecimal_form)*/
