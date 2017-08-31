package model;

import java.math.BigDecimal;

public class Product {

	private int idProduct;
	private int code;
	private BigDecimal priceOfSale;
	private BigDecimal priceOfBuy;
	private int stock;
	private int minStock;
	private String description;
	private BigDecimal gain;
	
	public Product(){
		super();
	}
	public int getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public BigDecimal getPriceOfSale() {
		return priceOfSale;
	}
	public void setPriceOfSale(BigDecimal priceOfSale) {
		this.priceOfSale = priceOfSale;
	}
	public BigDecimal getPriceOfBuy() {
		return priceOfBuy;
	}
	public void setPriceOfBuy(BigDecimal priceOfBuy) {
		this.priceOfBuy = priceOfBuy;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getMinStock() {
		return minStock;
	}
	public void setMinStock(int minStock) {
		this.minStock = minStock;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getGain() {
		return gain;
	}
	public void setGain(BigDecimal gain) {
		this.gain = gain;
	}
	
	
}
