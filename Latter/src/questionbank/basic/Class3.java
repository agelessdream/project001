package questionbank.basic;


//3、编写方法实现：求某年某月某日是这一年的第几天
public class Class3 {
    static int daysOfYear(int year,int month,int day){
        int[] arr={31,28,31,30,31,30,31,31,30,31,30,31};
        if(year%4==0&&year%100!=0||year%400==0)arr[1]=29;
        int a=0;
        for(int i=1;i<month;i++){
            a+=arr[month-1];
        }
        a+=day;
        return a;
    }
}
