package model;

import java.util.HashSet;
import java.util.Set;

public class Provider {

	private Integer id;
	private String description;
	private String name;
	private String surname;
	private String email;
	private Integer idCategory;
	private String address;
	private Integer telephone;
	private String fiscalStatus;
	private Integer fiscalStatusNumber;
	private String keyWords;
	private Set<Product> products = new HashSet<Product>();

	public Provider(){
		super();
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	public String getKeyWords() {
		return keyWords;
	}
	public void setKeyWords(String keyWords) {
		this.keyWords = keyWords;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getTelephone() {
		return telephone;
	}
	public void setTelephone(Integer telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFiscalStatus() {
		return fiscalStatus;
	}
	public void setFiscalStatus(String fiscalStatus) {
		this.fiscalStatus = fiscalStatus;
	}
	public Integer getFiscalStatusNumber() {
		return fiscalStatusNumber;
	}
	public void setFiscalStatusNumber(Integer fiscalStatusNumber) {
		this.fiscalStatusNumber = fiscalStatusNumber;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getIdCategory() {
		return idCategory;
	}
	public void setIdCategory(Integer idCategory) {
		this.idCategory = idCategory;
}
}
