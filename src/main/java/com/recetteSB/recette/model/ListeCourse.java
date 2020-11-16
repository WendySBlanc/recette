package com.recetteSB.recette.model;

import java.util.List;

public class ListeCourse {

	private int id;
	private String product;
	private int total;

	public ListeCourse(int id, String product, int total) {
		this.id = id;
		this.product = product;
		this.total = total;
	}

	public ListeCourse() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "ListeCourse{" +
				"id=" + id +
				", product='" + product + '\'' +
				", total=" + total +
				'}';
	}
}