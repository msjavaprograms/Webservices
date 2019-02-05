package com.msjava.ws.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ws.msjavasolutions.CreateOrdersRequest;
import com.ws.msjavasolutions.CreateOrdersResponse;
import com.ws.msjavasolutions.CustomerOrdersPortType;
import com.ws.msjavasolutions.GetOrdersRequest;
import com.ws.msjavasolutions.GetOrdersResponse;
import com.ws.msjavasolutions.Order;
import com.ws.msjavasolutions.Product;

public class CustomersOrdersWSImpl implements CustomerOrdersPortType {

	
	Map<BigInteger, List<Order>> customerOrders = new HashMap<>();
	int currentCustomerId;

	public CustomersOrdersWSImpl() {
		init();
	}

	public void init() {
		List<Order> orders = new ArrayList<Order>();
		Order order = new Order();
		order.setId(BigInteger.valueOf(1));
		Product product = new Product();
		product.setDescription("Samsung");
		product.setId("1");
		product.setQuantity(BigInteger.valueOf(3));

		order.getProduct().add(product);

		orders.add(order);
		customerOrders.put(BigInteger.valueOf(++currentCustomerId), orders);
	}
	@Override
	public GetOrdersResponse getOrders(GetOrdersRequest parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CreateOrdersResponse createOrders(CreateOrdersRequest parameters) {
		// TODO Auto-generated method stub
		return null;
	}

}
