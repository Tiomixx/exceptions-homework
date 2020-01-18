package Tests;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestParseException {
    private DateFormat dateFormat;
    private Date date;


    public TestParseException() throws ParseException {
        this.dateFormat = new SimpleDateFormat("   dd MM yyyy hh:mm:ss   ");
        this.date = dateFormat.parse("01 08 1996 12:12:21");
    }
}
