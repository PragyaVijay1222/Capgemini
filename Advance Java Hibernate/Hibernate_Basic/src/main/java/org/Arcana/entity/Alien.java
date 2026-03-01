package org.Arcana.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Alien_Table")
public class Alien {
	
	@Id
	private int aId;
	
	@Column(name="alien_name")
	private String aName;
	
	//@Transient        //To keep the variable only in the object but not in the table
	private String aTech;
	
	private Laptop laptop;
	
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getaTech() {
		return aTech;
	}
	public void setaTech(String aTech) {
		this.aTech = aTech;
	}
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	@Override
	public String toString() {
		return "Id: "+aId+" Name: "+aName+" Tech: "+aTech+" Laptop: "+laptop;
	}
}
