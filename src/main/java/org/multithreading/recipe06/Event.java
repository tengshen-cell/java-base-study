package org.multithreading.recipe06;

import java.util.Date;

/**
 * @author 滕广银
 * @description Class that stores event's information
 * @date 2023/8/1 8:32
 */
public class Event {

    private Date date;

    private String event;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

}
