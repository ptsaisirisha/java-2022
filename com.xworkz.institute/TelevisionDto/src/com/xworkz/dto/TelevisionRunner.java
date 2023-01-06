package com.xworkz.dto;

import com.xworkz.service.TelevisionService;
import com.xworkz.service.TelevisionServiceImpl;

public class TelevisionRunner {
	public static void main(String[] args) {
	 
		TelevisionService service = new TelevisionServiceImpl();
		
		 TelevisionDto TV=new TelevisionDto("LG","dome","smartTv",42,40000);
		 TelevisionDto TV1=new TelevisionDto("Samsung","flat","smartTv",45,30000);
		 TelevisionDto TV2=new TelevisionDto("Lenovo","dome","smartTv",55,50000);
		 TelevisionDto TV3=new TelevisionDto("Dell","flat","smartTv",32,20000);
		 
		 service.save(TV);
		 service.read();
		 service.findNameBySize("Samsung", 45);
	}

}
