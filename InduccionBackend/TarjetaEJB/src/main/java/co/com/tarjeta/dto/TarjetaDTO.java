package co.com.tarjeta.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class TarjetaDTO implements Serializable {
	
	private Integer id;
	private String cardNumber;
	private Integer identityCard;
	private String type;
	private Double debt;
	private Double totalAmount;
	private Integer delayDays;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public Integer getIdentityCard() {
		return identityCard;
	}
	public void setIdentityCard(Integer identityCard) {
		this.identityCard = identityCard;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getDebt() {
		return debt;
	}
	public void setDebt(Double debt) {
		this.debt = debt;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Integer getDelayDays() {
		return delayDays;
	}
	public void setDelayDays(Integer delayDays) {
		this.delayDays = delayDays;
	}
	
}
