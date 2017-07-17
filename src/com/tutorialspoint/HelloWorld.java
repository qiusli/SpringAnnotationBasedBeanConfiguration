package com.tutorialspoint;

/**
 * Created by Qiushi on 7/16/2017.
 */
public class HelloWorld {
    private String message;

    public void getMessage() {
        System.out.println("Your message: " + message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
