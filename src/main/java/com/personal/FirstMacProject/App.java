package com.personal.FirstMacProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.personal.library.MobilePhone;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        
        MobilePhone phone = (MobilePhone) ctx.getBean("iosmobile");
        System.out.println(phone.toString());
    }
}
