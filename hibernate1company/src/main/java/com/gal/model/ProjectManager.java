package com.gal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PROJECTMANAGER")
public class ProjectManager {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long managerId;
    private String managerName;
    private String email;
    public ProjectManager() {
    }
    public ProjectManager(String managerName,String email) {
        this.managerName = managerName;
        this.email = email;
    }
}
