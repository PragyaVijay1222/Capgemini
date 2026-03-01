package org.Arcana.OneToMany;

import java.util.List;
import java.util.ArrayList;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Alien_Student_Multiple_Laptops_Table")
public class AlienStudentsMultipleLaptops {
	
	@Id
	private int aId;
	
	@Column(name="alien_name")
	private String aName;
	
	private String aTech;
	
	@OneToMany(mappedBy = "aliens")
	private List<MultipleLaptops> laptops = new ArrayList<>();
	
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
	
	public List<MultipleLaptops> getLaptop() {
		return laptops;
	}
	public void setLaptop(List<MultipleLaptops> laptop) {
		this.laptops = laptop;
	}
	public void addLaptop(MultipleLaptops laptop) {
		this.laptops.add(laptop);
	}
	
	@Override
	public String toString() {
		return "Id: "+aId+" Name: "+aName+" Tech: "+aTech+" Laptop: "+laptops;
	}
}

