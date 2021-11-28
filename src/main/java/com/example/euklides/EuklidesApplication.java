package com.example.euklides;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EuklidesApplication {
    public static int NWD1(int first, int second) {
        while (first != second) {
            if (first > second) {
                first = first-second;
            }
            else {
                second = second-first;
            }
        }
        return first;
    }

    public static int NWD2(int first, int second) {
        if (second == 0) {
            return first;
        }
        else {
            return NWD2(second, first%second);
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(EuklidesApplication.class, args);
    } {
        System.out.println(NWD1(121,22));
        System.out.println(NWD2(144,156));

    }

}



