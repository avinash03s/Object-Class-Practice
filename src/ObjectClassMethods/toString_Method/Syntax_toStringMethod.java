package ObjectClassMethods.toString_Method;

public class Syntax_toStringMethod {


    public String toString(){

        return getClass().getName()+"@"+Integer.toHexString(hashCode());
    }

    /*these are implements/syntax of toString() method*/


    public static void main(String[] args) {

    }
}

