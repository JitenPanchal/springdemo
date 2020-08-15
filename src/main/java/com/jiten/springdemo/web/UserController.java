package com.jiten.springdemo.web;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jiten.springdemo.domain.Product;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@RequestMapping(value = "/{userId}")
	public String displayUser(@PathVariable int userId) {
		return "User ID" + userId;
	}

	@RequestMapping(value = "/{userId}/invoices")
	public String displayUser(@PathVariable("userId") int userId,
			@RequestParam(value = "date", required = false) Date dateOrNull) {
		return "User ID" + userId + " Invoice Date " + dateOrNull;
	}

	@RequestMapping(value = "/{userId}/items")
	public List<String> displayStringJson() {
		return Arrays.asList("A", "B", "C");
	}

	@RequestMapping(value = "/{userId}/items_as_json")
	public List<Product> displayItemsAsJson() {
		return Arrays.asList(new Product(1, "Shoes", 21.99), new Product(2, "Books", 1.99));
	}
}
