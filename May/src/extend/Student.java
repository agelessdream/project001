package extend;

public class Student extends Person{

    public Student(int a){
        age=a;
    }
    @Override
    public void eat() {
        System.out.println("学生要吃饭");
    }
    public void show(){
        eat();
        super.eat();
    }
    public void run(){
        System.out.println("学生会跑步");
    }
    public void changeAge(){
        super.age=1;
    }
    public void change2Age(){
        this.age=2;
    }
    public static void main(String[] args) {
        Person s1=new Student(55);
        Student s2=(Student)s1;
        s2.run();
        System.out.println(s1==s2);

    }
}
