package com.jayklef.reversestring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReversestringApplication {

    public static void main(String[] args) {
       // String name = "Joyce";
       // String reverse = new StringBuffer(name).reverse().toString();
      //  System.out.println(reverse);


        String name = "Confamento";
        char[] newname = name.toCharArray();
        for (int i = newname.length-1;i >= 0; i--)
            System.out.print(newname[i]);
    }

}
