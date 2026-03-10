package com.gal.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
@Entity
public class Trainee {
	@SequenceGenerator(name="traineeseq",allocationSize=1,initialValue=1001)
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="traineeseq")
    long superid;
	@Column(nullable=false)
	String name;
	String institute;
	String email;
	String phone;
	// trainee many to one batch
	@ManyToOne
	Batch batch;
	public Trainee(String name, String college, String email, String phone) {
	    this.name = name;
	    this.institute = college;
	    this.email = email;
	    this.phone = phone;
	}
	@Override
    public String toString() {
        return "Trainee{" + name + ", " + email + "}";
    }

	public void setBatch(Batch batch) {
	    this.batch = batch;
}
}
