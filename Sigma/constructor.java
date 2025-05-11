package Sigma;

public class constructor {
    public static void main(String args[]){
        Student s1 = new Student("Nitish");
       
        System.out.println(s1.name);

    }
    
}
class Student{
    String  name;
    int rollno;

    Student (String iname){
        name=iname;

    }

}
