package com.example.useAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

//		// her we are using Configuration and ComponentScan annotations instead for using xml file.
//		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig1.class);
//		Staff ib = context.getBean(InvestmentBanker.class);
//
//		Staff doc = context.getBean(Doctor.class);
//		ib.assist();
//		doc.assist();
//
//		// use of @Bean
//
//		ApplicationContext context1 = new AnnotationConfigApplicationContext(BeanConfig2.class);
//		Staff newDoc = context1.getBean(Doctor.class);
//		Staff newIB = context1.getBean(InvestmentBanker.class);
//		Staff newMan = context1.getBean(Manager.class);
//
//		newDoc.assist();
//		newIB.assist();
//		newMan.assist();
//
//		//Bean structure is like every time we create new object of doctor,manager of ib we it will return same object
//		//because of singleton design pattern
//		/*
//			for getting different object every time we need to define @Scope annotation at that class
//		 */
//		Manager Man1 = context.getBean(Manager.class);
//		Manager Man2 = context.getBean(Manager.class);
//		Manager Man3 = context.getBean(Manager.class);
//
//		Man2.setQualification("MBA");
//		Man3.setQualification("BBA");
//		System.out.println(Man1);
//		System.out.println(Man2);
//		System.out.println(Man3);
//
//
//		/*
//		Here we are not used singleton pattern every new object created is different.
//		Engineer class contain annotation @Scope so spring always return different object.
//		 */
//		Engineer eng = context.getBean(Engineer.class);
//		Engineer eng2 = context.getBean(Engineer.class);
//		eng.setQualification("btech");
//		System.out.println(eng +" "+eng2);
	ApplicationContext con = new AnnotationConfigApplicationContext(BeanConfig.class);
	Student std = con.getBean(Student.class);

std.study();


	}

}
