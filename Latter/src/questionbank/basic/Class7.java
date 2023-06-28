package questionbank.basic;
//7、请编写代码使用把一个字符串反转，例如：hello1234，反转后：4321olleh。
public class Class7 {
    public static void main(String[] args) {
        String s="hello1234";
        char[] c=s.toCharArray();
        s="";
        for(int i=c.length;i>0;i--){
            s+=c[i];
        }
        System.out.println(s);
    }
}
