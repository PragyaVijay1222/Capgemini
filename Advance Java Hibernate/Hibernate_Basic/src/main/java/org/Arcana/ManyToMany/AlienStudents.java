package org.Arcana.ManyToMany;

import java.util.List;
import java.util.ArrayList;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Alien_Student")
public class AlienStudents {
	
	@Id
	private int aId;
	
	@Column(name="alien_name")
	private String aName;
	
	private String aTech;
	
	@ManyToMany
	private List<LabLaptops> laptops = new ArrayList<>();
	
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
	
	public List<LabLaptops> getLaptop() {
		return laptops;
	}
	public void setLaptop(List<LabLaptops> laptop) {
		this.laptops = laptop;
	}
	public void addLaptop(LabLaptops laptop) {
		this.laptops.add(laptop);
	}
	
	@Override
	public String toString() {
		return "Id: "+aId+" Name: "+aName+" Tech: "+aTech+" Laptop: "+laptops;
	}
}

