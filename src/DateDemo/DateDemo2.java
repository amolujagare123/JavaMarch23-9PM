package DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo2 {

    public static void main(String[] args) throws ParseException {
        String str = "11/02/2023";
        System.out.println(str);
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sd.parse(str);
        System.out.println(date);

        String dateStr0= "23-June-2016" ;
        //→ dd-MMMM-yyyy
        System.out.println(dateStr0);
        SimpleDateFormat sd0 = new SimpleDateFormat("dd-MMMM-yyyy");
        Date date0 = sd0.parse(dateStr0);
        System.out.println(date0);

        String dateStr1= "23 | June 16  8:34" ;
        //→ dd | MMMM yy hh:mm
        System.out.println(dateStr1);
        SimpleDateFormat sd1 = new SimpleDateFormat("dd | MMMM yy hh:mm");
        Date date1 = sd1.parse(dateStr1);
        System.out.println(date1);

        String dateStr2= "2016-06-23 | 8:34:23";
        //→ yyyy-MM-dd | hh:mm:ss
        System.out.println(dateStr2);
        SimpleDateFormat sd2 = new SimpleDateFormat("yyyy-MM-dd | hh:mm:ss");
        Date date2 = sd2.parse(dateStr2);
        System.out.println(date2);


    }
}
