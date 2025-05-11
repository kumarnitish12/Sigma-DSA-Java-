package Sigma;

public class copycoonstructor {
    public static void main(String args[]){
        Student s1 = new Student();
            s1.name = "Nitish";
            s1.rollno = 456;
            s1.password="abcd";
            s1.marks[0]=100;
            s1.marks[1]=90;
            s1.marks[2]=80;


        
        Student s2 = new Student(s1);
            s2.password="xyz";
            for(int i=1;i<s2.marks.length;i++){
                System.out.println(s2.marks[i]);

            }

        

    }
}
class Student{
    String name;
    int rollno;
    String password;
    int marks[];
    Student(Student s1){
        this.name=s1.name;
        this.rollno=s1.rollno;
        this.marks=s1.marks;
        

    }
    Student(){
        System.out.println("nsf");
    }
    Student(String name){
        this.name=name;
        marks=new int[3];
    }
    Student(int rollno){
        this.rollno=rollno;
        marks=new int[3];
    }

}
