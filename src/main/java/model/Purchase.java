package model;

import java.util.Date;

public class Purchase {

	private Integer idPurchasis;
	private Integer idUser;
	private Date date;
	private Integer idProvider;
	
	public Integer getIdPurchasis() {
		return idPurchasis;
	}
	public void setIdPurchasis(Integer idPurchasis) {
		this.idPurchasis = idPurchasis;
	}
	public Integer getIdUser() {
		return idUser;
	}
	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getIdProvider() {
		return idProvider;
	}
	public void setIdProvider(Integer idProvider) {
		this.idProvider = idProvider;
	}
	
	
}
