package com.example.dependencyinjection;

import com.example.dependencyinjection.controllers.*;
import com.example.dependencyinjection.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyinjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(DependencyinjectionApplication.class, args);

//		PetController petController = context.getBean("petController", PetController.class);
//		System.out.println("--- The Best Pet is ---");
//		System.out.println(petController.whichPetIsTheBest());
//
//		I18NController i18NController = (I18NController) context.getBean("i18NController");
//
//		System.out.println(i18NController.sayHello());

		MyController myController = (MyController) context.getBean("myController");

		FakeDataSource fakeDataSource =  (FakeDataSource) context.getBean(FakeDataSource.class);

		System.out.println(fakeDataSource.getUser());

//		System.out.println("------- Primary bean");
//
//		System.out.println(myController.sayHello());
//
//		System.out.println("------- Property");
//
//		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
//
//		String propertyGreeting = propertyInjectedController.getGreeting();
//
//		System.out.println(propertyGreeting);
//
//		System.out.println("----- Setter based");
//
//		SetterInjectionController setterInjectionController = (SetterInjectionController) context.getBean("setterInjectionController");
//
//		String setterGreeting = setterInjectionController.getGreeting();

//		System.out.println(setterGreeting);
//
//		System.out.println("----- Constructor based");
//
//		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
//
//		String consGreeting = constructorInjectedController.getGreeting();
//
//		System.out.println(consGreeting);
	}

}
