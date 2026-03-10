package com.gal.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class TopicTeaching {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	long teachingid;
	@ManyToOne
	@JoinColumn(name="trainerid")
	public
	Trainer trainer;
	@ManyToOne
	@JoinColumn(name="bid")
	Batch batch;
	Date stdate;
	Date endDate;
	String topics;
	public TopicTeaching(Trainer trainer, Batch batch, String topics) {
        this.trainer = trainer;
        this.batch = batch;
        this.topics = topics;
    }

    public TopicTeaching() {
		// TODO Auto-generated constructor stub
	}

	public Batch getBatch() {
		return batch;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}

	public String getTopics() {
		return topics;
	}

	public void setTopics(String topics) {
		this.topics = topics;
	}

	@Override
    public String toString() {
        return "TopicTeaching{" + topics + "}";
    }

}
