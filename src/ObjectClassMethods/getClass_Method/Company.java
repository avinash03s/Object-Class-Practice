package ObjectClassMethods.getClass_Method;

public class Company {
    String managerName;
    String hrName;
    String devName;
    int companyValue;

    Company(String managerName,String hrName,String devName,int companyValue){
        this.managerName=managerName;
        this.hrName=hrName;
        this.devName=devName;
        this.companyValue=companyValue;
    }

    public static void main(String[] args) {
        Company ob = new Company("Avinash","Ramu","Raju",100000);
        System.out.println(ob.getClass());
    }
}

//getClass() method cannot override because this method is "final";
