package com.mainacad;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import static java.time.LocalDateTime.parse;

public class User {
 private String UserIP;
 private long sessionID;
 private Date connectionTime;

    public User() {
    }

    public String getUserIP() {
        return UserIP;
    }

    public void setUserIP(String userIP) {
        UserIP = userIP;
    }

    public long getSessionID() {
        return sessionID;
    }

    public void setSessionID(long sessionID) {
        this.sessionID = sessionID;
    }



//    public long GetDateInMilliseconds(CharSequence connectionTime) {
//        long millisSinceEpoch = parse(connectionTime, DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss"))
//                .atZone(ZoneId.systemDefault())
//                .toInstant()
//                .toEpochMilli();
//        return millisSinceEpoch;
//    }


    public Date getConnectionTime() {
        return connectionTime;
    }

    public void setConnectionTime(Date connectionTime) {
        this.connectionTime = connectionTime;
    }

}
