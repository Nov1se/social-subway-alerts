/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import com.google.code.morphia.annotations.*;
import java.util.List;
import org.bson.types.ObjectId;
import play.modules.morphia.Model;


/**
 *
 * @author Michael
 */
@Entity
public class Line extends Model {
    @Id
    private ObjectId id;
    private String name;
    private LineType type;
    @Embedded("station")
    private List<Station> stations;
    @Embedded
    private Status status;
    @Embedded("tweet")
    private List<Tweet> tweets;

    /**
     * @return the id
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

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
     * @return the type
     */
    public LineType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(LineType type) {
        this.type = type;
    }

    /**
     * @return the stations
     */
    public List<Station> getStations() {
        return stations;
    }

    /**
     * @param stations the stations to set
     */
    public void setStations(List<Station> stations) {
        this.stations = stations;
    }

    /**
     * @return the status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * @return the tweets
     */
    public List<Tweet> getTweets() {
        return tweets;
    }

    /**
     * @param tweets the tweets to set
     */
    public void setTweets(List<Tweet> tweets) {
        this.tweets = tweets;
    }
}
