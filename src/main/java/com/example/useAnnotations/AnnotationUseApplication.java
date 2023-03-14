package com.example.useAnnotations;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AnnotationUseApplication {
	public static void main(String[] args) {
//		here we used component scan for scanning Doctor class

//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		Doctor d = context.getBean(Doctor.class);
//		d.assist();
//
//		InvestmentBanker ib = context.getBean(InvestmentBanker.class);
//		ib.assist();

		// her we are using Configuration and ComponentScan annotations instead for using xml file.
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		Staff ib = context.getBean(InvestmentBanker.class);

		Staff doc = context.getBean(Doctor.class);
		ib.assist();
		doc.assist();

		// use of @Bean

		ApplicationContext context1 = new AnnotationConfigApplicationContext(BeanConfig2.class);
		Staff newDoc = context1.getBean(Doctor.class);
		Staff newIB = context1.getBean(InvestmentBanker.class);
		Staff newMan = context1.getBean(Manager.class);

		newDoc.assist();
		newIB.assist();
		newMan.assist();


	}

}
