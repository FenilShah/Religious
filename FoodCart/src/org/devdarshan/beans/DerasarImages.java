package org.devdarshan.beans;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="DDDerasarImages")
public class DerasarImages {
	Integer derasarImageId;
	Derasar derasar;
	String imagePath;
	Timestamp imageDate;
	
	@Id
	@GeneratedValue
	@Column
	public Integer getDerasarImageId() {
		return derasarImageId;
	}
	public void setDerasarImageId(Integer derasarImageId) {
		this.derasarImageId = derasarImageId;
	}
	
	@ManyToOne(targetEntity=Derasar.class)
	public Derasar getDerasar() {
		return derasar;
	}
	public void setDerasar(Derasar derasar) {
		this.derasar = derasar;
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
	
	
}
