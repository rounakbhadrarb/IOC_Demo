package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("file:src/main/java/beans.xml");
        Customer customer=(Customer) context.getBean("customer");
        customer.setCustId(100);
        customer.setCustName("Rounak");

        Address address=(Address) customer.getAddress();
        address.setDoorNo("17");
        address.setStreet("rail road");
        address.setCity("majhdia");
        address.setState("wb");
        address.setPin("741507");

        Account account=(Account)customer.getAccount();
        account.setAccId("1001");
        account.setAccType("Savings");

        System.out.println(customer);

        ClassPathXmlApplicationContext cpc=(ClassPathXmlApplicationContext) context;
        cpc.close();
    }
}
