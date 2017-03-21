package com.example.domain;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;




@Getter
@Setter
@Entity
@Table(name="hotels")
@NamedQuery(name = "findByhotel", query = "from Hotel where price <= :price")
public class Hotel {
	
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "price")
	private int price;
	
	@Column(name = "area_name")
	private String areaName;
	
	@Column(name = "hotel_name")
	private String hotelName;

	@Column(name = "nearest_station")
	private String nearestStation;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "parking")
	private String parking;

}
