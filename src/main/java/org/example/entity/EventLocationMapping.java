package org.example.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="EVENT_LOCATION_MAPPING")
public class EventLocationMapping {
    @EmbeddedId
    private EventLocationPrimaryKey eventLocation;
    private Date event_date;

    public EventLocationMapping() {
    }

    public EventLocationMapping(EventLocationPrimaryKey eventLocation, Date event_date) {
        this.eventLocation = eventLocation;
        this.event_date = event_date;
    }

    public EventLocationPrimaryKey getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(EventLocationPrimaryKey eventLocation) {
        this.eventLocation = eventLocation;
    }

    public Date getEvent_date() {
        return event_date;
    }

    public void setEvent_date(Date event_date) {
        this.event_date = event_date;
    }
}
