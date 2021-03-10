package com.product.model;  
import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  
//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table  
public class Products  
{  
//Defining book id as primary key  
@Id  
@Column  
private int productid;  
@Column  
private String productname;  
@Column  
private String description;  
@Column  
private int price;  
public int getProductid()   
{  
return productid;  
}  
public void setProductid(int productid)   
{  
this.productid = productid;  
} 
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
} 
public int getPrice()   
{  
return price;  
}  
public void setPrice(int price)   
{  
this.price = price;  
}  
}  