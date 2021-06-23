package org.example.entity;

import javax.persistence.*;

@Entity
@Table(name="EVENT_DATA")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer event_id;
    private String event_name;
    private String event_description;

    public Event() {
    }

    public Integer getId() {
        return event_id;
    }

    public void setId(Integer id) {
        this.event_id = id;
    }

    public String getName() {
        return event_name;
    }

    public void setName(String name) {
        this.event_name = name;
    }

    public String getDescription() {
        return event_description;
    }

    public void setDescription(String description) {
        this.event_description = description;
    }

    public Event(Integer id, String name, String description) {
        this.event_id = id;
        this.event_name = name;
        this.event_description = description;
    }


    @Override
    public String toString() {
        return "Event{" +
                "id=" + event_id +
                ", name='" + event_name + '\'' +
                '}';
    }
}
