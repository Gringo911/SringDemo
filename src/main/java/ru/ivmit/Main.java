package ru.ivmit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ВАСЯ on 14.05.2019.
 */
public class Main {
    public static void main (String[]args){

        ApplicationContext context = new ClassPathXmlApplicationContext("ru.ivmit\\contex.xml");
        MessageRenderer renderer = (MessageRenderer) context.getBean("MessageRenderer");
        renderer.printMessage();
    }
}
