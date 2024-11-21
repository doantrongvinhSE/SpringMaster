package com.doanvinh.SpringFramework;

import com.doanvinh.SpringFramework.SpringCore.DI.Car;
import com.doanvinh.SpringFramework.SpringCore.DI.Engine;
import com.doanvinh.SpringFramework.Value_Annotation.ServerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringCoreApplication.class, args);

		Engine engine = applicationContext.getBean(Engine.class);

		System.out.println(engine);

//		engine.setNameEngine("XLSK800");
//		engine.setSpeedEngine(300);


		Car car = applicationContext.getBean(Car.class);
		Car car2 = applicationContext.getBean(Car.class);
		System.out.println(car);
		System.out.println(car.hashCode());
		System.out.println(car2);
		System.out.println(car2.hashCode());

		System.out.println(car.equals(car2));


		ServerConfig serverConfig = applicationContext.getBean(ServerConfig.class);
		System.out.println(serverConfig);



	}

}
