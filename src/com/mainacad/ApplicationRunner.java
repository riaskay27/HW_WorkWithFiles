package com.mainacad;

import com.mainacad.service.WorkWithFilesService;

import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Logger;

public class ApplicationRunner {
    private static final Logger LOGGER=Logger.getLogger(ApplicationRunner.class.getName());
    public static void main(String[] args) {

        User User1=new User();
        User User2=new User();
        User User3=new User();
        User User4=new User();
        User User5=new User();
        User1.setUserIP("123.123.123.123");
        User1.setSessionID(12345);
        Date date1=new Date();
        User1.setConnectionTime(date1);
        User2.setUserIP("234.234.234.234");
        User2.setSessionID(34512);
        Date date2=new Date();
        User2.setConnectionTime(date2);
        User3.setUserIP("345.345.345.345");
        User3.setSessionID(45123);
        Date date3=new Date();
        User3.setConnectionTime(date3);
        User4.setUserIP("456.456.456.456");
        User4.setSessionID(56789);
        Date date4=new Date();
        User4.setConnectionTime(date4);
        User5.setUserIP("567.567.567.567");
        User5.setSessionID(67890);
        Date date5=new Date();
        User5.setConnectionTime(date5);


        LOGGER.info("First User :"+User1.getUserIP()+" "+User1.getSessionID()+" "+User1.getConnectionTime()+"\n");

        ArrayList<String> Users = new ArrayList<String>();
        // добавим в список ряд элементов
        Users.add(User1.getUserIP()+" "+User1.getSessionID()+" "+User1.getConnectionTime()+"\n");
        Users.add(User2.getUserIP()+" "+User2.getSessionID()+" "+User2.getConnectionTime()+"\n");
        Users.add(User3.getUserIP()+" "+User3.getSessionID()+" "+User3.getConnectionTime()+"\n");
        Users.add(User4.getUserIP()+" "+User4.getSessionID()+" "+User4.getConnectionTime()+"\n");
        Users.add(User5.getUserIP()+" "+User5.getSessionID()+" "+User5.getConnectionTime()+"\n");

        for(String person : Users){

            LOGGER.info(person);
        }

        for(String people :Users){
            WorkWithFilesService.writeTextToFile(people,"text.txt",true);
        }

    }
}
