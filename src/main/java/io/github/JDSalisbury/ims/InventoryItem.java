package io.github.JDSalisbury.ims;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class InventoryItem {

	@Id
	@GeneratedValue
	private long id;

	private String name;
	private String barcode;
	private int amount;
	private int date;
	private String unit;
	private String location;
	private double price;
	private String description;

	public InventoryItem(String barcode, int amount, int date, String name, String unit, String location, double price,
			String description) {
		this.barcode = barcode;
		this.amount = amount;
		this.date = date;
		this.name = name;
		this.unit = unit;
		this.location = location;
		this.price = price;
		this.description = description;

	}

	public String getBarcode() {
		return barcode;
	}

	public int getAmount() {
		return amount;
	}

	public int getDate() {
		return date;
	}

	public String getUnit() {
		return unit;
	}

	public String getLocation() {
		return location;
	}

	public double getPrice() {
		return price;
	}

	public String getDescription() {
		return description;
	}

	public String getName() {
		return name;
	}

}
