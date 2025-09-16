package ObjectClassMethods.hashCode_Method;

public class Case1 {
    int rollNo;
    Case1(int rollNo){
        this.rollNo=rollNo;
    }

    public static void main(String[] args) {
        Case1 ob= new Case1(10);
        System.out.println(ob);
    }

}
/*in these case both toString and hashCode method are call internally*/
