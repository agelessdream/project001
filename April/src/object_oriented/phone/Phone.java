package object_oriented.phone;

public class Phone {
    String name;
    int price;
    public void call(){
        System.out.println("手机能打电话");
    }
    public void sendMessage(String message){
        System.out.println("发送信息"+message);
    }
}
