package main;

import org.ipn.bean.BeanSpring;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    
    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");
        
        BeanFactory factory = context;
//        SE UTILIZA EL BEAN QUE SE CREO EN EL CONTEXT (SPRINGXML)
        BeanSpring miBean = (BeanSpring) factory.getBean("miBean");
        
        System.out.println("Mensaje: " + miBean.getMensaje());
    }
}   
