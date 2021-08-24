package jjh.api;

import jjh.api.item.controller.ItemController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//개발순서: domain -> repository -> service -> controller
@SpringBootApplication
public class ItemApplication {
	@Autowired
	ItemController itemController;
	public static void main(String[] args) {
		SpringApplication.run(ItemApplication.class, args);
	}



}
