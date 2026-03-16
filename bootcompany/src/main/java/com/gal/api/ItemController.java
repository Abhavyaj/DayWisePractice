package com.gal.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gal.model.Item;
import com.gal.service.ItemService;

@Controller
public class ItemController {
	@Autowired
	ItemService itemservice;
	
	@RequestMapping("/item")//Front controller sends this request to one controller it is then send to service
	@ResponseBody//it is the actual body no http or other
	public String getItem() {
		Item item=itemservice.find(10);
		return item.toString();
	}
	//@RequestMapping("/item")//Front controller sends this request to one controller it is then send to service
	//@ResponseBody
	
	

}

