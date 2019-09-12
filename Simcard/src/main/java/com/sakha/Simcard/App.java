package com.sakha.Simcard;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // Mobile m = new Mobile();
      	//ApplicationContext context=new ClassPathXmlApplicationContext(AppConfig.class);
      
    	ApplicationContext context=new AnnotationConfigApplicationContext(Appconfig.class);
        
    	//Sim sim=context.getBean("airtel",Sim.class);
//       // Sim sim=new Idea();
//        m.setSim(sim);
      	Mobile m=context.getBean("Mobile",Mobile.class);
        m.sendMessage();
        m.toBrowse();
       // m.getSim().setcallcharge(2.67f);
       
        m.makeCall();
        m.sendMms();
        m.sendSms();
        m.showsupport();
        
      //  System.out.println(m);
      //  Mobile nokia=context.getBean("mobile",Mobile.class);
       // nokia.makeCall();
        
    }
}
