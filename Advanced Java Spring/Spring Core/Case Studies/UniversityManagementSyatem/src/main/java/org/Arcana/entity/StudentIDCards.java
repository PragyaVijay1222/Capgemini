package org.Arcana.entity;

import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
@Table(name="studentsIDCard")
public class StudentIDCards {
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_seq")
    @SequenceGenerator(name = "id_seq", sequenceName = "id_sequence", initialValue = 10, allocationSize = 1)
    private int id;
	
	private int cardNumber;
	
	@OneToOne(mappedBy="idCard")
	Students student;
	
	public StudentIDCards() {
	}
	
	public int getId() {
		return this.id;
	}
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	public int getCardNumber() {
		return cardNumber;
	}
}
