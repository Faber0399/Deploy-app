package co.industriasfrc.pruebaheroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import co.industriasfrc.pruebaheroku.repositories.Laptoprepository;
import co.industriasfrc.pruebaheroku.entities.*;

@SpringBootApplication
public class PruebaherokuApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(PruebaherokuApplication.class, args);
		Laptoprepository laptoprepository=(Laptoprepository) context.getBean(Laptoprepository.class);
		
		System.out.println(context.getBeansOfType(Laptoprepository.class));
		//CRUD LAPTOPS
		System.out.println("El numero de computadores actualmente es: "+laptoprepository.count());
		Laptop laptop1=new Laptop("Pavillo ","HP","2021","Windows","Full","Gamer",true);
		Laptop laptop2=new Laptop("G15 ","Dell","2020","Linux","Low","Executive",false);

		laptoprepository.save(laptop1);
		laptoprepository.save(laptop2);
		System.out.println("El numero de computadores actualmente es: "+laptoprepository.count());
	}

}
