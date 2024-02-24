package org.set.entities;

import java.util.Date;
import java.util.Objects;

public class LogEntry {

    private String username;

    private Date momento;

    public LogEntry(String username, Date momento) {
        this.username = username;
        this.momento = momento;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogEntry logEntry = (LogEntry) o;
        return Objects.equals(username, logEntry.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }
}
