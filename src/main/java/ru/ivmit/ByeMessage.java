package ru.ivmit;

/**
 * Created by ВАСЯ on 15.05.2019.
 */
public class ByeMessage implements Message {

    private String text;

    public ByeMessage(String text) {
        this.text = "Bye " + text;
    }


    public String getText() {
        return null;
    }
}
