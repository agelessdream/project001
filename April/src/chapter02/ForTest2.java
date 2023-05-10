package chapter02;
//输出所有水仙花数,并计数，并求和
public class ForTest2 {
    public static void main(String[] args) {
        int count=0,sum=0;
        for(int i=100;i<1000;i++){
            int hundred=i/100;
            int ten=i%100/10;
            int one=i%10;
            if(i==hundred*hundred*hundred+ten*ten*ten+one*one*one){
                System.out.print(i+"\t");
                sum+=i;
                count++;
            }
        }
        System.out.println("\n"+sum+"\t"+count);
    }
}
