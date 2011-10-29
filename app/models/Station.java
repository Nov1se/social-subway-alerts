/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import com.google.code.morphia.annotations.*;
import org.bson.types.ObjectId;

/**
 *
 * @author Michael
 */
public class Station {
    private String name;    
    private double[] geolocation;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the geolocation
     */
    public double[] getGeolocation() {
        return geolocation;
    }

    /**
     * @param geolocation the geolocation to set
     */
    public void setGeolocation(double[] geolocation) {
        this.geolocation = geolocation;
    }
}
