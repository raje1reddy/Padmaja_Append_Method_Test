package com.padmaja.stringappend;
//import static java.lang.System.out;
import java.util.Scanner;
import java.lang.String;

//Method append accepts the method parameter of type object
public class StringAppend {
    public static void main(String[] args){
        StringBuilder sb1 = new StringBuilder();
        sb1.append("java");
        sb1.append(new Person("Oracle"));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("World");
        System.out.println(sb1);
        System.out.println(sb2);
        sb1.append("AppendTest");
        System.out.println(sb1);

    }

}
class Person {
    String name ;
    Person(String str) { name = str;}
}




