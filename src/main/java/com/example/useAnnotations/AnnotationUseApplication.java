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

		//Bean structure is like every time we create new object of doctor,manager of ib we it will return same object
		//because of singleton design pattern
		/*
			for getting different object every time we need to define @Scope annotation at that class
		 */
		Manager Man1 = context1.getBean(Manager.class);
		Manager Man2 = context1.getBean(Manager.class);
		Manager Man3 = context1.getBean(Manager.class);

		Man2.setQualification("MBA");
		Man3.setQualification("BBA");
		System.out.println(Man1);
		System.out.println(Man2);
		System.out.println(Man3);

		Doctor doc1 = context.getBean(Doctor.class);
		Doctor doc2 = context.getBean(Doctor.class);
		Doctor doc3 = context.getBean(Doctor.class);
		doc2.setQualification("BAMS");
		doc3.setQualification("MBBS");
		System.out.println(doc1);
		System.out.println(doc2);
		System.out.println(doc3);






	}

}
