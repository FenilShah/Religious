package org.devdarshan.beans;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="DDDerasarDetails")
public class DerasarDetails {
	Integer derasarDetailId;
	Derasar derasar;
	String mulNayak;
	String sthapakName;
	Timestamp sthapnaDate;
	
	@Id
	@GeneratedValue
	public Integer getDerasarDetailId() {
		return derasarDetailId;
	}
	public void setDerasarDetailId(Integer derasarDetailId) {
		this.derasarDetailId = derasarDetailId;
	}	
	
	@OneToOne(targetEntity=Derasar.class)
	public Derasar getDerasar() {
		return derasar;
	}
	public void setDerasar(Derasar derasar) {
		this.derasar = derasar;
	}
	
	@Column(length=50)
	public String getMulNayak() {
		return mulNayak;
	}
	public void setMulNayak(String mulNayak) {
		this.mulNayak = mulNayak;
	}
	
	@Column(length=50)
	public String getSthapakName() {
		return sthapakName;
	}
	public void setSthapakName(String sthapakName) {
		this.sthapakName = sthapakName;
	}
	
	@Column
	public Timestamp getSthapnaDate() {
		return sthapnaDate;
	}
	public void setSthapnaDate(Timestamp sthapnaDate) {
		this.sthapnaDate = sthapnaDate;
	}
	
	
}
