package com.example.demo.Domain;

import com.example.demo.Ifaces.DiscountService;
import com.example.demo.utils.ShowExecutionTime;

public class Billing implements DiscountService {

	@Override
	public double CashDiscount() {
		return 0.10;
	}

	@Override
	@ShowExecutionTime
	public String[] getCoupons(){
		try {
		Thread.sleep(150);
		}
		catch(InterruptedException e)
		{
			
		}
		return new String[] {"Shoppers Stop", "Pizza Hut", "Tata Sky"};
	}

}
