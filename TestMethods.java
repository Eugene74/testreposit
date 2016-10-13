package test;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Test  {
    public static void main(String[] args) {


       TimeZone timeZone1 = TimeZone.getTimeZone("America/Los_Angeles");
       TimeZone timeZone2 = TimeZone.getTimeZone("Europe/Kiev");

        Calendar calendartz = new GregorianCalendar();

        long timeCPH = calendartz.getTimeInMillis();
        System.out.println("timeCPH  = " + timeCPH);
        System.out.println("hour     = " + calendartz.get(Calendar.HOUR_OF_DAY));

        calendartz.setTimeZone(timeZone1);

        long timeLA = calendartz.getTimeInMillis();
        System.out.println("timeLA   = " + timeLA);
        System.out.println("hour     = " + calendartz.get(Calendar.HOUR_OF_DAY));

        System.out.println("--------------------");

        TimeZone tz = TimeZone.getTimeZone("Cuba");

            Calendar calendar = Calendar.getInstance(tz);

       //Calendar calendar= Calendar.getInstance();
        //calendar.setTimeZone(TimeZone.getTimeZone("America/Vancouver"));
           // calendar.set(2016, Calendar.OCTOBER, 8, 14, 51, 0);
           // calendar.add(Calendar.DAY_OF_YEAR, -2);
           //
           // Assert.assertEquals(Calendar.SUNDAY, calendar.get(Calendar.DAY_OF_WEEK));
        //long l1=calendar.getTimeInMillis();
      //  System.out.println(l1);

        Date dt = calendar.getTime();
       System.out.println("date -- "+dt);

        Locale language =new Locale("uk");
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm", language);
        System.out.println(dateFormat);



        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2016, Calendar.OCTOBER, 8, 14, 51, 0);
        Date dt1 = calendar1.getTime();
       // long l2=calendar1.getTimeInMillis();
       // System.out.println(l2);

        String s = dateFormat.format(dt1);
        System.out.println("date-format  -- "+s);
        System.out.println(calendar.before(calendar1));
        System.out.println(calendar.after(calendar1));

        Date sc=null;
        String data = "11.10.2013";
        String time = "12:14";
        try {

             sc = dateFormat.parse(data  +" "+ time);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(sc);
        System.out.println(dt1.after(sc));
        System.out.println(dt1.before(sc));
    }
    }
