package com.navin;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //BeanFactory for small application
        //ApplicationContext for enterprise application
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Scanner scanner = new Scanner(System.in);
//        String objName = scanner.nextLine().toLowerCase();
//        Vehicle obj = (Vehicle) context.getBean("bike");
//        obj.drive();

//        Tyre tyre = (Tyre) context.getBean("car");
//        System.out.println(tyre);
        Vehicle obj = (Vehicle) context.getBean("car");
        obj.drive();

    }
}
