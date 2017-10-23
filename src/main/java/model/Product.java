package model;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Product {

	private int idProduct;
	private String keysWords;
	private Integer idCategory;
	private byte[] image;
	private String code;
	private BigDecimal priceOfSale;
	private BigDecimal priceOfBuy;
	private int stock;
	private int minStock;
	private String description;
	private BigDecimal gain;
	private Set<Provider> providers = new HashSet<Provider>();
	
	public Product(){
		super();
	}
	
	public Set<Provider> getProviders() {
		return providers;
	}

	public void setProviders(Set<Provider> providers) {
		this.providers = providers;
	}

	public String getKeysWords() {
		return keysWords;
	}
	public void setKeysWords(String keysWords) {
		this.keysWords = keysWords;
	}
	public Integer getIdCategory() {
		return idCategory;
	}
	public void setIdCategory(Integer idCategory) {
		this.idCategory = idCategory;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}

	public int getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
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
