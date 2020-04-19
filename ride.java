/*
ID: michell45
LANG: JAVA
TASK: ride
*/

import java.io.*;
import java.util.*;
class ride{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new FileReader("ride.in"));
    PrintWriter pw = new PrintWriter(new FileWriter("ride.out"));
    if (product(br.readLine())%47 == product(br.readLine())%47){
      pw.println("GO");
    }
    else {
      pw.println("STAY");
    }
    br.close();
    pw.close();

  }

  public static int product (String s){
    int p = 1;
    for (int i = 0; i < s.length(); i++){
      int value = (s.charAt(i) - 'A') + 1;
      p*= value;
    }
    return p;
  }
}
    
        
