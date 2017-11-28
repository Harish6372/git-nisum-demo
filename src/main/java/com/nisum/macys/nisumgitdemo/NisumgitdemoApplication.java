package com.nisum.macys.nisumgitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NisumgitdemoApplication {

	public static void main(String[] args) {
		System.out.println("sd,jfhjdsmhamsad");
		System.out.println("harish");
		System.out.println("local1");
		System.out.println("ssss");
		System.out.println("ssss");
		SpringApplication.run(NisumgitdemoApplication.class, args);
	}

	public String getProduct()
		{
			
			return "single product";
		}
	public String getProducts()
	{
		
		return "allproducts";
	}
	public String getUpdtae()
	{
		
		return "allproducts";
	}
}
