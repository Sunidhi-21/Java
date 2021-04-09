package com.xworkz.crud;

import java.util.ArrayList;
import java.util.Iterator;

public class Cart {
	
	int id;
	double subtotal;
	double gst;
	int discountPercent;
	double total;
	ArrayList<Item> itemList = new ArrayList<Item>();

	void addItemToCart(Item item) { // Create
		itemList.add(item);
		subtotal = subtotal + item.price * item.quantity;
		// total =
	}

	void readItemsInCart() throws Exception { // Read
		if (itemList.isEmpty()) {
			throw new Exception("No items in cart");
		} else {
			System.out.println("The items in the cart are: ");
			for (Item i : itemList) {
				System.out.println("Item Name:" + i.name);
				System.out.println("Item quantity:" + i.quantity);
				System.out.println("Item Size:" + i.size);
				System.out.println("Item price:" + i.price);
			}

		}
	}

	void increaseQuantityBy1(Item item) { // update
		Iterator<Item> itr = itemList.iterator();
		while (itr.hasNext()) {
			Item i = itr.next();
			if (item.itemId == i.itemId) {
				i.quantity += 1;
			}
		}
		// subttotal , total
	}

	void deleteItem(Item item) { // delete
		Iterator<Item> itr = itemList.iterator();
		while (itr.hasNext()) {
			Item i = itr.next();
			if (item.itemId == i.itemId) {
				itr.remove();
			}
		}
		// subttotal , total
	}
}
