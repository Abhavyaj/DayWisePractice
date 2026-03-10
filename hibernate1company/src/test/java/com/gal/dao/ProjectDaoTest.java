package com.gal.dao;

import com.gal.model.Project;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.gal.EntityManagerFactoryConnectionMain;

class ProjectDaoTest {

    private static ProjectDao dao;

    @BeforeAll
    static void setup() {
        EntityManagerFactoryConnectionMain.getEntityManagerFactory();
        dao = new ProjectDao();
    }

    @Test
    void testGetProject() {
        Project project = dao.getProject(1);
        assertNotNull(project);
        assertEquals(1, project.getProjectId());
        System.out.println(project);
    }

    @Test
    void testAddProject() {
        Project project = new Project(60,"New Project","ClientA");
        dao.addProject(project);

        Project saved = dao.getProject(60);
        assertNotNull(saved);
        assertEquals("New Project", saved.getTitle());
        System.out.println(saved);
    }

    @AfterAll
    static void closeConnection() {
        EntityManagerFactoryConnectionMain.getEntityManger().close();
        EntityManagerFactoryConnectionMain.getEntityManagerFactory().close();
    }
}