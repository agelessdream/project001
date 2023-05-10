package object_oriented.constructor;

public class Student {
    String name;
    int age;
    String school;
    String major;
    Student(String n,int a){
        name=n;
        age=a;
    }
    Student(String n,int a,String s){
        name=n;
        age=a;
        school=s;
    }
    Student(String n,int a,String s,String m){
        name=n;
        age=a;
        school=s;
        major=m;
    }
    public String getInfo(){
        return "姓名为"+name+"年龄为"+age+"学校为"+school+"专业为"+major;
    }

    public static void main(String[] args) {
        System.out.println(new Student("张三",25).getInfo());
        System.out.println(new Student("李四",26,"家里蹲").getInfo());
        System.out.println(new Student("王五",28,"华科","CS").getInfo());

    }
}
