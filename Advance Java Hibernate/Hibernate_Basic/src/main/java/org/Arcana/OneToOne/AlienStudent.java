package org.Arcana.OneToOne;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Alien_Student_Table")
public class AlienStudent {
	
	@Id
	private int aId;
	
	@Column(name="alien_name")
	private String aName;
	
	private String aTech;
	
	@OneToOne
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

