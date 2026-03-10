package com.gal.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="PROJECT")
public class Project {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int projectId;
    private String title;
    private String client;
    private LocalDate startDate;
    private LocalDate endDate;
    private double budget;
    public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	public ProjectManager getProjectManager() {
		return projectManager;
	}
	public void setProjectManager(ProjectManager projectManager) {
		this.projectManager = projectManager;
	}
	@OneToOne
    @JoinColumn(name="MANAGER_ID")
    private ProjectManager projectManager;
    public Project() {
    }
    public Project(String title,String client,LocalDate startDate,
                   LocalDate endDate,double budget,ProjectManager projectManager) {
        this.title = title;
        this.client = client;
        this.startDate = startDate;
        this.endDate = endDate;
        this.budget = budget;
        this.projectManager = projectManager;
    }
	public Project(int projectid, String title, String client) {
		this.projectId=projectid;
		this.title=title;
		this.client=client;
		// TODO Auto-generated constructor stub
	}
}