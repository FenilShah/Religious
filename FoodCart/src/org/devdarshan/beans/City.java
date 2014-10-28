package org.devdarshan.beans;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="DDCity")
public class City implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Integer cityId;
	String cityName;
	List<Derasar> derasarList;
	
	@Id
	@GeneratedValue
	//@Column(name="UserId")
	@Column
	public Integer getCityId() {
		return cityId;
	}
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	
	@Column(length=50)
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	@OneToMany(mappedBy="city")
	public List<Derasar> getDerasarList() {
		return derasarList;
	}
	public void setDerasarList(List<Derasar> derasarList) {
		this.derasarList = derasarList;
	}
	
	
	
	
}
