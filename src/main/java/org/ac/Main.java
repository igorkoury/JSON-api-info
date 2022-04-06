package org.ac;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Main {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            MyPojo myPojo = mapper.readValue(new URL("https://ipinfo.io/8.8.8.8/json"), MyPojo.class);
            System.out.println(myPojo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
