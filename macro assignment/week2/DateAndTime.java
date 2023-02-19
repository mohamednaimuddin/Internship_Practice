import java.text.SimpleDateFormat;
import java.util.*;
public class DateAndTime {
  public static void main(String[] args) {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy HH:mm:ss");
    Date now = new Date();
    dateFormat.setTimeZone(TimeZone.getTimeZone("IST"));
    String formattedDate = dateFormat.format(now);
    System.out.println("Current date and time: " + formattedDate);
  }
}