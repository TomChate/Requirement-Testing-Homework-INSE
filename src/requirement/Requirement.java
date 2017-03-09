/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package requirement;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Tom
 */
public class Requirement {

    public  String type;
    public String description;
    public ArrayList stakeholders = new ArrayList();

    public static void main(String[] args) { 
        // TODO code application logic here
    }

    public Requirement(String description) {
        this.description = description;
    }

    public Requirement(String description, ArrayList stakeholder) {
        this.description = description;
        this.stakeholders = stakeholder;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStakeholders(ArrayList stakeholders) {
        this.stakeholders = stakeholders;

    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList getStakeholders() {
        return stakeholders;

    }

    public void addStakeholder(String name) {
        stakeholders.add(name);
    }

    public void deleteStakeholder(String name) {

        Iterator<String> itr = stakeholders.iterator();

        while (itr.hasNext()) {
            String stakeholder = itr.next();

            if (name == stakeholder) {
                itr.remove();

            }
        }

    }

}
