/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package requirement;

import java.util.ArrayList;
import static org.hamcrest.CoreMatchers.hasItems;
import org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class RequirementTest {

    @Test
    public void testConstructor1() {
        Requirement requirement = new Requirement("test requirement");
        String testValue = requirement.description;
        assertEquals("test requirement", testValue);
    }

    @Test
    public void testConstructor2() {

        ArrayList stakeholders = new ArrayList();

        stakeholders.add("Bob");
        stakeholders.add("Josh");
        stakeholders.add("John");
        stakeholders.add("June");

        Requirement requirement = new Requirement("test requirement", stakeholders);

        assertEquals(stakeholders, requirement.stakeholders);

    }

    @Test
    public void testSetType() {
        Requirement requirement = new Requirement("test requirement");
        requirement.setType("functional");

        assertEquals("functional", requirement.type);
    }

    @Test
    public void testSetDescription() {
        Requirement requirement = new Requirement("test requirement");
        requirement.setDescription("To save a file");

        assertEquals("To save a file", requirement.description);
    }

    @Test
    public void testSetStakeholders() {
        Requirement requirement = new Requirement("test requirement");
        ArrayList stakeholders = new ArrayList();

        stakeholders.add("Bob");
        stakeholders.add("Josh");
        stakeholders.add("John");
        stakeholders.add("June");

        requirement.setStakeholders(stakeholders);

        assertEquals(stakeholders, requirement.stakeholders);

    }

    @Test
    public void testGetType() {
        Requirement requirement = new Requirement("test requirement");
        requirement.type = "System";

        assertEquals("System", requirement.getType());

    }

    @Test
    public void testGetDescription() {
        Requirement requirement = new Requirement("test requirement");
        requirement.type = "Test Description";

        assertEquals("Test Description", requirement.getType());

    }

    public void testGetStakeholders() {
        Requirement requirement = new Requirement("test requirement");
        ArrayList stakeholders = new ArrayList();

        stakeholders.add("Bob");
        stakeholders.add("Josh");
        stakeholders.add("John");
        stakeholders.add("June");

        requirement.stakeholders = stakeholders;

        assertEquals(stakeholders, requirement.getStakeholders());

    }

    @Test
    public void testAddStakeholder() {
        Requirement requirement = new Requirement("test requirement");

        requirement.addStakeholder("Lucy");
        assertEquals(requirement.stakeholders, hasItems("Lucy"));

    }

    public void testRemoveStakeholder() {
        Requirement requirement = new Requirement("test requirement");

        requirement.addStakeholder("Lucy");
        requirement.stakeholders.add("Bob");
        requirement.stakeholders.add("Josh");
        requirement.stakeholders.add("John");
        requirement.stakeholders.add("June");

        requirement.deleteStakeholder("Josh");
        
        assertEquals(requirement.stakeholders, requirement.stakeholders.contains("Josh"));
        
    }

}
