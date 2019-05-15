package ru.ivmit;

/**
 * Created by ВАСЯ on 15.05.2019.
 */
public class HelloMessage implements Message {


    private String text;

    public HelloMessage(String text) {
        this.text = "Hello " + text;
    }

    public String getText() {
        return null;
    }
}
