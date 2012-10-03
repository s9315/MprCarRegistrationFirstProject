package CarRegister.BusinessObjects;

import CarRegister.BusinessObjects.Cars.*;
import CarRegister.BusinessObjects.Persons.Person;

public class Main {

	
	public static void main(String[] args) {
		
		Person p = new Person("Adam");
		
		Car c1=new PersonCar("Nissan", "gda12234");
		Car c2=new TruckCar();
		
		p.getCars().add(c2);
		p.getCars().add(c1);
		
		for(Car c : p.getCars())
		{
			c.printData();
		}

	}

}
