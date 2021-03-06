package com.netbuilder.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.netbuilder.util.ContactMethod;

/**
 * @author cpoole
 * -------------------------------------------------------------------------------------------------------------------------------------
 * Supplier:
 * -------------------------------------------------------------------------------------------------------------------------------------
 * Supplier can be Constructor using one of two constructors:
 * 		Supplier(int id, String name) creates a Supplier with a non-null supplierId and supplierName
 * 		Supplier(int id, String name, String email, String phone, String pref) creates a fully instantiated Supplier, where pref 
 *                                                                          is the preferredContactMethod of the Supplier
 *		
 * 		Supplier contains no methods besides getters and setters.
 * 
 * 		NOTE: preferredContactMethod could potentially be better as an Enum but with such few states its even possible to use a Boolean.
 * 			  Currently a String is being used with either the value "Phone" or "Email"
 * -------------------------------------------------------------------------------------------------------------------------------------
 */
@Entity
public class Supplier {
	@Id
	@GeneratedValue(
	strategy = GenerationType.IDENTITY)
	private int supplierId;
	
	private String supplierName;
	private String supplierEmail = "";
	private String supplierPhone = "";
	private String preferredContactMethod = "";
	
	public Supplier()
	{
		
	}
	
	public Supplier (int id, String name){
		this.supplierId = id;
		this.supplierName = name;
	}
	
	public Supplier (int id, String name, String email, String phone, String pref){
		this.supplierId = id;
		this.supplierName = name;
		this.supplierEmail = email;
		this.supplierPhone = phone;
		this.preferredContactMethod = pref; //This may be better as an Enum
	}
	
	public void setId(int x){	supplierId = x;	}
	public int getId(){	return supplierId;	}
	
	public void setName(String x){	supplierName = x;	}
	public String getName(){	return supplierName;	}
	
	public void setEmail(String x){	supplierEmail = x;	}
	public String getEmail(){	return supplierEmail;	}
	
	public void setPhone(String x){	supplierPhone = x;	}
	public String getPhone(){	return supplierPhone;	}
	
	public void setPreferredContactMethod(String x){	preferredContactMethod = x;	}
	public String getPreferredContactMethod(){	return preferredContactMethod;	}
}