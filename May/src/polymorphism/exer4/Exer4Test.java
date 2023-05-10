package polymorphism.exer4;

public class Exer4Test {
    public void meeting(Person...ps){
        for(int i=0;i< ps.length;i++) {
            ps[i].eat();
            ps[i].toilet();
            if (ps[i] instanceof Man) {
                ((Man) ps[i]).smoke();
            }
            if(ps[i] instanceof Woman){
                ((Woman) ps[i]).makeup();
            }
        }
    }

    public static void main(String[] args) {
        Person person[]={new Man(),new Woman(),new Man()};

        new Exer4Test().meeting(person);
        new Man().equals(new Man());
    }
}
