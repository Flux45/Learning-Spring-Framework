package com.example.learnspringframework;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Eliminate verbosity on creating Java Beans
//Public accessor methods, constructor,
//equals,hashcode and toString are automatically created.
//Realesed in JDK 16.

record Person (String name, int age, Address address) {};
record Address (String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Ayush JJ";
    }

    @Bean
    public int age() {
        return 25;
    }

    @Bean
    public Person person() {
        return new Person("Ayush AJ" , 25, new Address("main street","pune"));
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name() , age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3) {
        return new Person(name , age, address3);
    }

    @Bean(name = "address2")
    public Address address() {
        return new Address("South Toboggan Magnum Tower","Indore");
    }

    @Bean(name = "address3")
    public Address address3() {
        return new Address("BanjaraHills","Hydrebad");
    }
}
