package String_ClassMethod;

import java.util.Arrays;

public class StringClassMethod {
    public static void main(String[] args) {

        //compareTo()
        String s="Avinash";
        String str="Java";
        int compare=s.compareTo(str);//comparison is based on Unicode
        System.out.println(compare);

        //compareToIgnoreCase()
        String s1="JavaProgram";
        String ss="javaprogram";
        int comp=s1.compareToIgnoreCase(ss);//
        System.out.println(comp);

        //length()
        String s2="JavaDeveloper";
        System.out.println(s2.length());


        //replaceAll()
        String s3="JavaCore";
        System.out.println(s3.replaceAll("Java","Program"));

        //replace()
        String s4="Java";
        System.out.println(s4.replace("J","K"));

        //substring
        String s5="Hello World";
        System.out.println(s5.substring(6,11));

        //equals()
        String s6="Hello";
        String str1="Hello";
        System.out.println(s6.equals(str1));

        //equalsIgnoreCase()
        String s7="HELLOJAVA";
        String str2="hellojava";
        System.out.println(s7.equalsIgnoreCase(str2));

        //contains
        String s8="StringClass";
        System.out.println(s8.contains("Class")); //true
        //System.out.println(s8.contains("Java")); //false

        //indexOf
        String s9="Pune";
        System.out.println(s9.indexOf("P"));

        //trim()
        String s10="  Mumbai Cha Raja   ";
        System.out.println(s10.trim());

        //charAt()
        String s11="Method";
        System.out.println(s11.charAt(1));

        //toLowerCase()
        String s12="WORLD CUP";
        System.out.println(s12.toLowerCase());

        //concat()
        String s13="String";
       String string1=s13.concat("Method");
        System.out.println(string1);

        //startsWith()
        String s14="TeamIndia";
        System.out.println(s14.startsWith("Team"));

        //endsWith() method
        String s15="TeamIndia";
        System.out.println(s15.endsWith("India"));

        //intern() method
        String s16=new String("Tdit");
        String str3=new String("Tdit");
        s16=s16.intern();
        str3=str3.intern();
        System.out.println(s16==str3);

        //getBytes() method
       /* String s17="Beed";
        byte [] b=s17.getBytes();
        System.out.println(Arrays.toString(b));*/

        //contentEquals() method
        String s18="Mumbai";
        String s19="Mumbai";
        System.out.println(s18.contentEquals(s19));

        //hashCode() method
        String s20="ODI WorldCup";
        System.out.println(s20.hashCode());

        //join() method
        String s21="Rohit";
        String s22="45";
        String join=String.join(" ",s21, s22);
        System.out.println(join);

        //replaceFirst() method
        String s23="ABC";
        System.out.println(s23.replaceFirst("ABC","XYZ"));

        //subSequence() method
        String s24="Swing";
        System.out.println(s24.subSequence(1,4));

        //format() method
        String s25="45";
        String s26= String.format("Rohit", s25);
        System.out.println(s26);

        //codePointAt()
        String s27="JavaPrograming";
        int str4=s27.codePointAt(1); //return Unicode of the specific index;
        System.out.println(str4);

        //codePointBefore()
        String s28="Java";
        int codePoint=s28.codePointBefore(3);//return Unicode of the char before specified index;
        System.out.println(codePoint);

        //isEmpty() & isBlank()
        String s29=" ";
        System.out.println(s29.isEmpty());
        System.out.println(s29.isBlank());

        //toCharArray()
        String s30="avinash";
        char[]arr=s30.toCharArray();
        System.out.println(arr);

    }
}
