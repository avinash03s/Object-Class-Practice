package ObjectClassMethods.hashCode_Method;

public class Override_hashCodeMethod {
    int i;
    Override_hashCodeMethod(int a){
        this.i=a;
    }

    @Override
    public int hashCode() {
        return i;
    }
   /* @Override
    public String toString(){
        return "Int I value is :"+i;
    }*/

    public static void main(String[] args) {
        Override_hashCodeMethod ob= new Override_hashCodeMethod(10);
        System.out.println(ob);

    }
}
