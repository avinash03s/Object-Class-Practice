package ObjectClassMethods.toString_Method;

import java.util.Scanner;

public class BankApp {
    String accountHolder;
    private int accountNumber;// data hiding(Encapsulation)
    private double balance;// data hiding(Encapsulation)
    static String bankName="State Bank Of India";

    public void setAccountNumber(int a,double b){
        this.accountNumber=a;
        this.balance=b;
    }

    BankApp(String accountHolder,int accountNumber,double balance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;

    }

    public String toString(){   //use toString method to print object reference
        return "Account Holder:"+accountHolder+"|"
                +"Account Number: "+accountNumber+"|"
                +"Available Balance: "+balance;

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num;
        BankApp ob= new BankApp("Avinash",101,100000.0);
        /*BankApp ob1= new BankApp("Harsh",102,175000.0);
        BankApp ob2= new BankApp("Karan",103,164000.0);
        BankApp ob3= new BankApp("Rushi",104,122000.0);
        BankApp ob4= new BankApp("Rahul",105,120000.0);
        BankApp ob5= new BankApp("Ram",106,160000.0);
        BankApp ob6= new BankApp("Ranjit",107,190000.0);
        BankApp ob7= new BankApp("Nikhil",108,170000.0);
        BankApp ob8= new BankApp("Narayan",109,150000.0);
        BankApp ob9= new BankApp("Abhishek",110,1300000.0);*/

        do {
            System.out.println("Enter Your Account Number: ");
            num = sc.nextInt();

            if (num != ob.accountNumber) {
                System.out.println("Warning : Incorrect Account Number. Try again!");
            }
        } while (num != ob.accountNumber);  // if condition is  then repeat

        ob.setAccountNumber(101,100000.0);
        System.out.println("Login Successful!");
        System.out.println(bankName);
        System.out.println(ob);
//.............................................................................................
       /* do {
            System.out.println("Enter Your Account Number: ");
            num = sc.nextInt();

            if (num != ob1.accountNumber) {
                System.out.println("Warning : Incorrect Account Number. Try again!");
            }
        } while (num != ob1.accountNumber);

        ob1.setAccountNumber(102,100000.0);
        System.out.println("Login Successful!");
        System.out.println(bankName);
        System.out.println(ob1);
        //..........................................................................
        do {
            System.out.println("Enter Your Account Number: ");
            num = sc.nextInt();

            if (num != ob2.accountNumber) {
                System.out.println("Warning : Incorrect Account Number. Try again!");
            }
        } while (num != ob2.accountNumber);
        ob2.setAccountNumber(5555,100000.0);
        System.out.println("Login Successful!");
        System.out.println(bankName);
        System.out.println(ob2);
        //...................................................................
        do {
            System.out.println("Enter Your Account Number: ");
            num = sc.nextInt();

            if (num != ob.accountNumber) {
                System.out.println("Warning : Incorrect Account Number. Try again!");
            }
        } while (num != ob.accountNumber);
        ob3.setAccountNumber(5555,100000.0);
        System.out.println("Login Successful!");
        System.out.println(bankName);
        System.out.println(ob3);
        //...............................................................................
        do {
            System.out.println("Enter Your Account Number: ");
            num = sc.nextInt();

            if (num != ob.accountNumber) {
                System.out.println("Warning : Incorrect Account Number. Try again!");
            }
        } while (num != ob.accountNumber);
        ob4.setAccountNumber(5555,100000.0);
        System.out.println("Login Successful!");
        System.out.println(bankName);
        System.out.println(ob4);
        //............................................................................
        do {
            System.out.println("Enter Your Account Number: ");
            num = sc.nextInt();

            if (num != ob.accountNumber) {
                System.out.println("Warning : Incorrect Account Number. Try again!");
            }
        } while (num != ob.accountNumber);

        ob5.setAccountNumber(5555,100000.0);
        System.out.println("Login Successful!");
        System.out.println(bankName);
        System.out.println(ob5);
        //............................................................................
        do {
            System.out.println("Enter Your Account Number: ");
            num = sc.nextInt();

            if (num != ob.accountNumber) {
                System.out.println("Warning : Incorrect Account Number. Try again!");
            }
        } while (num != ob.accountNumber);

        ob6.setAccountNumber(5555,100000.0);
        System.out.println("Login Successful!");
        System.out.println(bankName);
        System.out.println(ob6);
        //..............................................................................
        do {
            System.out.println("Enter Your Account Number: ");
            num = sc.nextInt();

            if (num != ob.accountNumber) {
                System.out.println("Warning : Incorrect Account Number. Try again!");
            }
        } while (num != ob.accountNumber);
        ob7.setAccountNumber(5555,100000.0);
        System.out.println("Login Successful!");
        System.out.println(bankName);
        System.out.println(ob7);
        //..................................................................
        do {
            System.out.println("Enter Your Account Number: ");
            num = sc.nextInt();

            if (num != ob.accountNumber) {
                System.out.println("Warning : Incorrect Account Number. Try again!");
            }
        } while (num != ob.accountNumber);

        ob8.setAccountNumber(5555,100000.0);
        System.out.println("Login Successful!");
        System.out.println(bankName);
        System.out.println(ob8);
        //....................................................................
        do {
            System.out.println("Enter Your Account Number: ");
            num = sc.nextInt();

            if (num != ob.accountNumber) {
                System.out.println("Warning : Incorrect Account Number. Try again!");
            }
        } while (num != ob.accountNumber);
        ob9.setAccountNumber(5555,100000.0);
        System.out.println("Login Successful!");
        System.out.println(bankName);
        System.out.println(ob9);

        // If correct

        //...............................................*/
    }
}


