package Task1;
public class Main {
    public static void main(String[] args) {
        Phone phone1=new Phone("125567","Iphone");
        Phone phone2=new Phone("334456","Xiaomi");
        Phone phone3=new Phone("112233","Samsung",160.10);
       phone1.sendMessage(phone2,phone3);
    }
}
