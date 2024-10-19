package Oops;

public class oopsbasic {
    public static class student{ //data type creation
        String name;
        int rollno;
        double percentage;
    }

    public static void main(String[] args) {
        student x=new student(); //declaration
        x.name= "dev";
        x.rollno=4;
        x.percentage=94.5;

        student s=new student();
        s.name="rajat";
        s.rollno=6;
        System.out.println(s.name);
    }
}
