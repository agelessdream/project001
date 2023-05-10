package object_oriented.clientmanagementsystem;

public class CustomerView {
    CustomerList customerList=new CustomerList(10);
    public void enterMainMenu(){

    }
    public static void main(String[] args) {
        CustomerView customerView=new CustomerView();
        customerView.enterMainMenu();
    }

}
