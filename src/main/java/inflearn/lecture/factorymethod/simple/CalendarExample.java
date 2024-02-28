package inflearn.lecture.factorymethod.simple;

import java.util.Calendar;
import java.util.Locale;

public class CalendarExample {

    public static void main(String[] args) {
        Calendar.getInstance();
        Calendar.getInstance(Locale.forLanguageTag("th-TH-x-lvariant-TH"));
        Calendar.getInstance(Locale.forLanguageTag("ja-JP-x-lvariant-JP"));
    }

}
