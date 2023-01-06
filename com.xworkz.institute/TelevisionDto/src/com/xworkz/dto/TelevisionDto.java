package com.xworkz.dto;

public class TelevisionDto {
	private String brandname;
	private String model;
	private String type;
	private int size;
	private int price;
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "TelevisionDto [brandname=" + brandname + ", model=" + model + ", type=" + type + ", size=" + size
				+ ", price=" + price + "]";
	}
	public TelevisionDto(String brandname, String model, String type, int size, int price) {
		super();
		this.brandname = brandname;
		this.model = model;
		this.type = type;
		this.size = size;
		this.price = price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brandname == null) ? 0 : brandname.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + price;
		result = prime * result + size;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TelevisionDto other = (TelevisionDto) obj;
		if (brandname == null) {
			if (other.brandname != null)
				return false;
		} else if (!brandname.equals(other.brandname))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (price != other.price)
			return false;
		if (size != other.size)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	

}
