package com.truckloadingapi.loading.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class loaders {

	@Id
	 private long truckid;
	 private String loadingPoint;
	 private String unloadingPoint;
	 private String productType;
	 private String truckType;
	 private String noofTrucks;
	 private String weight;
	 private String comment;
	public loaders(long truckid, String loadingPoint, String unloadingPoint, String productType, String truckType,
			String noofTrucks, String weight, String comment) {
		super();
		this.truckid = truckid;
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noofTrucks = noofTrucks;
		this.weight = weight;
		this.comment = comment;
	}
	public loaders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getTruckid() {
		return truckid;
	}
	public void setTruckid(long truckid) {
		this.truckid = truckid;
	}
	public String getLoadingPoint() {
		return loadingPoint;
	}
	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}
	public String getUnloadingPoint() {
		return unloadingPoint;
	}
	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getTruckType() {
		return truckType;
	}
	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}
	public String getNoofTrucks() {
		return noofTrucks;
	}
	public void setNoofTrucks(String noofTrucks) {
		this.noofTrucks = noofTrucks;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "loaders [truckid=" + truckid + ", loadingPoint=" + loadingPoint + ", unloadingPoint=" + unloadingPoint
				+ ", productType=" + productType + ", truckType=" + truckType + ", noofTrucks=" + noofTrucks
				+ ", weight=" + weight + ", comment=" + comment + "]";
	}
	 

	 
}

