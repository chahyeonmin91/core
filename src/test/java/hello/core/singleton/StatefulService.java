package hello.core.singleton;

public class StatefulService {
    //싱글톤은 무상태로 만들어야함
    //private int price; //상태를 유지하는 필드

    public int order(String name, int price) {
        System.out.println("name=" +name +"price="+price);
        //this.price = price;
        return price;
    }
}
