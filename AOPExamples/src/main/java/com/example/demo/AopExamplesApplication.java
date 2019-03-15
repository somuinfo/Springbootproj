package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.example.demo.Advices.CalculateTime;
import com.example.demo.Advices.FestivalOffer;
import com.example.demo.Domain.Billing;
import com.example.demo.Ifaces.DiscountService;

@SpringBootApplication
@EnableAspectJAutoProxy()
public class AopExamplesApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext ctx	= SpringApplication.run(AopExamplesApplication.class, args);
	 DiscountService ds = ctx.getBean(DiscountService.class);
	
	  System.out.println("" + ds.getCoupons().toString());
	  
	  System.out.println("" + ds.CashDiscount());
	
	 
	}
	
	@Bean
	public DiscountService service()
	{
		return new Billing();
	}

	@Bean
	public FestivalOffer offer()
	{
		return new FestivalOffer();
	}
	
	@Bean
	public CalculateTime time()
	{
		return new CalculateTime();
	}
}
