/*
ID: michell45
LANG: JAVA
TASK: friday
 */

import java.util.*;
import java.io.*;

class friday {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new FileReader("friday.in"));
    PrintWriter pw = new PrintWriter(new FileWriter("friday.out"));
    int years = Integer.parseInt(br.readLine());
    int[] daysweek = {0,0,0,0,0,0,0};

    int daymonth = 0;
    int[] regdays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int[] leapdays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    int end = 1900+years;
    for (int y = 1900; y < end; y++){
      for (int m = 0; m < 12; m++){
        int day = (daymonth + 12) % 7;
        daysweek[day]++;
        daymonth += isLeapYear(y)?leapdays[m] : regdays[m];
      }
    }
    pw.println(daysweek[5] + " " + daysweek[6] + " " + daysweek[0] + " " + daysweek[1] + " "+ daysweek[2] + " " + daysweek[3] + " " + daysweek[4]);

    br.close();
    pw.close();
  }

  public static boolean isLeapYear(int year) {
    if (year % 100 == 0) {
      return year % 400 == 0;
    } else {
      return year % 4 == 0;
      }
    }
}