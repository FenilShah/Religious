package org.devdarshan.beans;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="DDDerasarMaster")
public class Derasar {
	Integer derasarId;
	String derasarName;
	Timestamp dateOfJoin;
	City city;
	String imagePath;
	Timestamp imageDate;
	DerasarDetails derasarDetail;
	List<DerasarImages> derasarImages;
	
	@Id
	@GeneratedValue
	@Column
	public Integer getDerasarId() {
		return derasarId;
	}
	public void setDerasarId(Integer derasarId) {
		this.derasarId = derasarId;
	}
	
	@Column(length=50)
	public String getDerasarName() {
		return derasarName;
	}
	public void setDerasarName(String derasarName) {
		this.derasarName = derasarName;
	}
	
	@Column
	public Timestamp getDateOfJoin() {
		return dateOfJoin;
	}
	public void setDateOfJoin(Timestamp dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}
	
	@ManyToOne(targetEntity=City.class)
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	
	@Column(length=100)
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	@Column
	public Timestamp getImageDate() {
		return imageDate;
	}
	public void setImageDate(Timestamp imageDate) {
		this.imageDate = imageDate;
	}
	
	@OneToOne(mappedBy="derasar")
	public DerasarDetails getDerasarDetail() {
		return derasarDetail;
	}
	public void setDerasarDetail(DerasarDetails derasarDetail) {
		this.derasarDetail = derasarDetail;
	}
	
	@OneToMany(mappedBy="derasar")
	public List<DerasarImages> getDerasarImages() {
		return derasarImages;
	}
	public void setDerasarImages(List<DerasarImages> derasarImages) {
		this.derasarImages = derasarImages;
	}
	
	
	
	
}
