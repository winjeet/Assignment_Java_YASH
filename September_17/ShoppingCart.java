package com.shopping.cart.model;

public class Appliances {
	private String id;
	private String name;
	private Double price;
	private String description;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Appliances [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description + "]";
	}
	
}


package com.shopping.cart.model;

public class Electronics {
	private String id;
	private String name;
	private Double price;
	private String description;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Electronics [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description + "]";
	}
	
}



package com.shopping.cart.model;

public class Mobiles {
	private String id;
	private String name;
	private Double price;
	private String description;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Mobiles [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description + "]";
	}
	
}


package com.shopping.cart.controller;

import java.util.Scanner;

import com.shopping.cart.service.ShoppingCartService;

public class ShoppingCartController {

	
	public static void shoppingUI() {
		ShoppingCartService service = new ShoppingCartService();
		Scanner scanner = new Scanner(System.in);
		int option;
		
		System.out.println("-------- Welcome to Electronics Store --------");
		do {
			System.out.println("Press 1 => Electronics");
			System.out.println("Press 2 => Mobile");
			System.out.println("Press 3 => Appliances");
			System.out.println("Press 4 => Confirm Order");
			System.out.println("Press 5 => Exit");
			
			System.out.println("Please select any one option");
			option = scanner.nextInt();
			
			
			switch(option) {
			case 1: service.getElectronics();
				break;
			case 2: service.getMobiles();
				break;
			case 3: service.getAppliances();
				break;
			case 4: System.out.println("Your Order of value "+ShoppingCartService.total +" has been confirmed.");
					System.out.println("Thanks for Shopping, Visit Again!!!");
					System.exit(0);
			case 5:
				System.exit(0);
			}
		}while(option!=5);
	}
	
	public static void main(String[] args) {
		shoppingUI();
	}

}


package com.shopping.cart.service;

import java.util.List;
import java.util.Scanner;

import com.shopping.cart.model.Appliances;
import com.shopping.cart.model.Electronics;
import com.shopping.cart.model.Mobiles;
import com.shopping.cart.repository.ShoppingCartRepository;

public class ShoppingCartService {
	private int quantity;
	public static double total=0.0;
	private String option;
	
	
	public void getElectronics() {
		System.out.println("-----------Electronics Menu-----------");
		ShoppingCartRepository repository = new ShoppingCartRepository();
		List<Electronics> electronics = repository.getElectronicsRepository();
		
		System.out.println(" Id     |    Name     |    Price    |    Description");
		for(Electronics electronic:electronics) {
			System.out.println(electronic.getId()+"  "+electronic.getName()+"  "
					+electronic.getPrice()+"  "+electronic.getDescription());
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Id to Buy Product");
		  option = scanner.nextLine();
		  System.out.println("Enter Quantity");
		  quantity = scanner.nextInt();
		  for(Electronics electronic:electronics)
		  {
			  if(option.equals(electronic.getId()))
			  {
				  total += (electronic.getPrice())*quantity;
				  System.out.println("Current Amount : "+total);
			  }
		  }
		
	}
	
	public void getMobiles() {
		System.out.println("-----------Mobiles Menu-----------");
		ShoppingCartRepository repository = new ShoppingCartRepository();
		List<Mobiles> mobiles = repository.getMobileRepository();
		
		System.out.println(" Id     |    Name     |    Price    |    Description");
		for(Mobiles mobile:mobiles) {
			System.out.println(mobile.getId()+"  "+mobile.getName()+"  "
					+mobile.getPrice()+"  "+mobile.getDescription());
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Id to Buy Product");
		  option = scanner.nextLine();
		  System.out.println("Enter Quantity");
		  quantity = scanner.nextInt();
		  for(Mobiles mobile:mobiles)
		  {
			  if(option.equals(mobile.getId()))
			  {
				  total += (mobile.getPrice())*quantity;
				  System.out.println("Current Amount : "+total);
			  }
		  }
	}
	
	public void getAppliances() {
		System.out.println("-----------Appliances Menu-----------");
		ShoppingCartRepository repository = new ShoppingCartRepository();
		List<Appliances> Appliances = repository.getAppliancesRepository();
		
		System.out.println(" Id     |    Name     |    Price    |    Description");
		for(Appliances Appliance:Appliances) {
			System.out.println(Appliance.getId()+"  "+Appliance.getName()+"  "
					+Appliance.getPrice()+"  "+Appliance.getDescription());
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Id to Buy Product");
		  option = scanner.nextLine();
		  System.out.println("Enter Quantity");
		  quantity = scanner.nextInt();
		  for(Appliances Appliance:Appliances)
		  {
			  if(option.equals(Appliance.getId()))
			  {
				  total += (Appliance.getPrice())*quantity;
				  System.out.println("Current Amount : "+total);
			  }
		  }
	}
}


package com.shopping.cart.repository;

import java.util.ArrayList;
import java.util.List;

import com.shopping.cart.model.Appliances;
import com.shopping.cart.model.Electronics;
import com.shopping.cart.model.Mobiles;

public class ShoppingCartRepository {
	
	public List<Mobiles> getMobileRepository(){
		List<Mobiles> mobiles = new ArrayList<>();
		
		Mobiles mobiles1 = new Mobiles();
		mobiles1.setId("MOB001");
		mobiles1.setName("Iphone 13 Pro Max");
		mobiles1.setPrice(129000.00);
		mobiles1.setDescription("Lastest in the market & best in quality");
		mobiles.add(mobiles1);
		
		Mobiles mobiles2 = new Mobiles();
		mobiles2.setId("MOB002");
		mobiles2.setName("Samsung S21 Ultra");
		mobiles2.setPrice(105000.00);
		mobiles2.setDescription("Best in camera zoom");
		mobiles.add(mobiles2);
		
		Mobiles mobiles3 = new Mobiles();
		mobiles3.setId("MOB003");
		mobiles3.setName("Goolge Pixel 6");
		mobiles3.setPrice(75000.00);
		mobiles3.setDescription("Latest Andorid Phone");
		mobiles.add(mobiles3);
		
		Mobiles mobiles4 = new Mobiles();
		mobiles4.setId("MOB004");
		mobiles4.setName("Iphone 12");
		mobiles4.setPrice(69000.00);
		mobiles4.setDescription("Lite weight & durable");
		mobiles.add(mobiles4);
		return mobiles;
		
	}
	public List<Electronics> getElectronicsRepository(){
		List<Electronics> electronics = new ArrayList<>();

		
		Electronics electronics1 = new Electronics();
		electronics1.setId("ELC001");
		electronics1.setName("Acer Laptop");
		electronics1.setPrice(150000.00);
		electronics1.setDescription("Intel i5 10th genration");
		electronics.add(electronics1);
		
		Electronics electronics2 = new Electronics();
		electronics2.setId("ELC002");
		electronics2.setName("Boss Speaker");
		electronics2.setPrice(30000.00);
		electronics2.setDescription("Deep Base");
		electronics.add(electronics2);
		
		Electronics electronics3 = new Electronics();
		electronics3.setId("ELC003");
		electronics3.setName("JBL Headphones");
		electronics3.setPrice(10000.00);
		electronics3.setDescription("Over the ear with bass");
		electronics.add(electronics3);
		
		Electronics electronics4 = new Electronics();
		electronics4.setId("ELC004");
		electronics4.setName("Printer");
		electronics4.setPrice(15000.00);
		electronics4.setDescription("Coloured printer");
		electronics.add(electronics4);
		return electronics;	
		
	}
	
	public List<Appliances> getAppliancesRepository(){
		List<Appliances> appliances = new ArrayList<>();
		Appliances appliances1 = new Appliances();
		appliances1.setId("APP001");
		appliances1.setName("Sony TV");
		appliances1.setPrice(200000.00);
		appliances1.setDescription("Ultra HD with curved");
		appliances.add(appliances1);
		
		Appliances appliances2 = new Appliances();
		appliances2.setId("APP002");
		appliances2.setName("LG Refrigerator");
		appliances2.setPrice(35000.00);
		appliances2.setDescription("Dual door");
		appliances.add(appliances2);
		
		Appliances appliances3 = new Appliances();
		appliances3.setId("APP003");
		appliances3.setName("Washing Machine");
		appliances3.setPrice(20000.00);
		appliances3.setDescription("Front Load");
		appliances.add(appliances3);
		
		Appliances appliances4 = new Appliances();
		appliances4.setId("APP004");
		appliances4.setName("Haier AC");
		appliances4.setPrice(80000.00);
		appliances4.setDescription("Cooler + Heater");
		appliances.add(appliances4);
		return appliances;
			
		}
		
		
}

