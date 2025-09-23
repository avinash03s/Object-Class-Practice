package ObjectClassMethods.getClass_Method;

public class Student {
    String studentName;
    int studentRollNumber;
    int studentId;

    //constructor
    Student(String studentName,int studentRollNumber,int studentId){
        this.studentName=studentName;
        this.studentRollNumber=studentRollNumber;
        this.studentId=studentId;
    }

    //toString() method overide
    public String toString(){
        return "Student Name: "+studentName+"|"+"Roll No: "+studentRollNumber+"|"+"Id: "+studentId;
    }

    public static void main(String[] args) {
        Student ob= new Student("Avinash",264,45);
        System.out.println(ob);
        //getClass()
        System.out.println(ob.getClass());
    }

}
