package hello.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
//@ToString
//@Configuration

public class HelloLombok {
    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("asdsda");

        String name = helloLombok.getName();
        System.out.println("name = " + name);
    }
}
