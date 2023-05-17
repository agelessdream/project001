package block;

public class User {
    private String userName,password;
    private long registrationTime;
    {
        System.out.println("新用户注册");
        registrationTime = System.currentTimeMillis();
        userName=System.currentTimeMillis()+"";
        password="123456";
    }

    public User() {
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getRegistrationTime() {
        return registrationTime;
    }


    public String getInfo() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", registrationTime=" + registrationTime +
                '}';
    }
}
