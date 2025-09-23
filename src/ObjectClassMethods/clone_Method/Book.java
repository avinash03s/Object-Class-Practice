package ObjectClassMethods.clone_Method;

public class Book {
    int number;

    Book(int number){
        this.number=number;
    }

   /* public Object clone(){throw Exception
        return clone();
    }*/

    public static void main(String[] args) {
        Book ob= new Book(45);
       // Book ob1= (Book) ob.clone();
       // System.out.println("Page of book is : "+ob +ob1);

    }


}
