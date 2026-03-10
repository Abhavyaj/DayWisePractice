package com.gal.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence. GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence. TableGenerator;

@Entity
public class Batch {

@TableGenerator(name = "batchidgenerator",allocationSize = 1, initialValue = 101, table = "allidgenerator", valueColumnName="nextbatchid")
@Id
@GeneratedValue(strategy = GenerationType. TABLE,generator="batchIdGenerator")
long bid;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
String name;
public Batch(String name, String content, String venue, List<TopicTeaching> topicsTaught) {
	super();
	this.name = name;
	this.content = content;
	this.venue = venue;
	this.topicsTaught = topicsTaught;
}
public Batch() {
	// TODO Auto-generated constructor stub
}
Date startDate;
Date endDate;
String content;
String venue;
@ManyToMany
@JoinTable(name="topicteaching",
joinColumns = { @JoinColumn(name="bid")} ,
inverseJoinColumns = { @JoinColumn(name="trainerid")})
List<Trainer> trainers=new ArrayList<>();
@OneToMany(mappedBy = "batch")
List<TopicTeaching> topicsTaught = new ArrayList<>();
@Override
public String toString() {
    return "Batch{" + name + "}";
}
}
