package com.epam.homework2.task1;

import com.epam.homework2.scanner.DataReader;

public class Hello {

    public void sayHello() {

        DataReader reader = new DataReader();
        String name = reader.enterName();

        System.out.println("Hello, " + name);
    }

}
