package object_oriented.thistest.boyandgirl;

public class Girl {
    String name;
    int age;

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void marry(Boy boy){
        System.out.println("我想要marry"+boy.getName());
        boy.marry(this);//boy回应这个girl
    }
    public int compare(Girl girl){
        if(this.age > girl.age){
            return 1;
        }else if(this.age < girl.age){
            return -1;
        }else{
            return 0;
        }

    }
}
