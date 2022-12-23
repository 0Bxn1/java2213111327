package oop;
public class Product {
	public String id;
	public int unit;
	public double price;
    
public void setld(String ID) {
	id = ID;
    }
public String getld() {
	return id;
	
    }
public void setUnit(int UNIT) {
	 unit = UNIT ;
    }
public int getUnit() {
	return unit;
	//unit
    }
public void setPrice(double PRICE) {
	price = PRICE ;
    }
public double getPrice() {
	return price;
    }
public double calculate () {
	 return  unit*price;
     }
public String CheckStatus() {
	if (unit<5) {
		return "LOW"; 
	}else if (unit>=5 && unit<50) {
		return "NORMAL";
	}else { 
		return "HIGH";
	}
  }
}
