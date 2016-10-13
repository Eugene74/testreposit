package test;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {
    public static void main(String args[]) {

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                System.out.println("Enter date for search in format dd.MM.yyyy , for example 24.11.2016 : ");
                DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
                String input = reader.readLine();
                Date day = format.parse(input);
                System.out.println("Enter first time in format hh:mm");
                String time = reader.readLine();
                Date firstTime = (Date) day.clone();
                firstTime.setTime(firstTime.getTime() + (Long.parseLong((time.split(":"))[0]) * 60 * 60 * 1000) + (Long.parseLong((time.split(":"))[1]) * 60 * 1000));
                System.out.println(firstTime);
                System.out.println("Enter last time in format hh:mm");
                time = reader.readLine();
                Date lastTime = day;
                lastTime.setTime(lastTime.getTime() + (Long.parseLong((time.split(":"))[0]) * 60 * 60 * 1000) + (Long.parseLong((time.split(":"))[1]) * 60 * 1000));
                System.out.println(lastTime);

               // trains.searchByTime(firstTime,lastTime);

            } catch (ParseException | IOException e) {
                e.printStackTrace();
            }
        }
    }
