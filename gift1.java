/*
ID: michell45
LANG: JAVA
TASK: gift1
 */
import java.io.*;
import java.util.*;

class gift1{
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(new File("gift1.in"));
    PrintWriter pw = new PrintWriter( new FileWriter("gift1.out"));
    int np = Integer.parseInt(sc.nextLine());
    ArrayList <String> names = new ArrayList <String>();
    for (int i = 0; i < np; i++){
      names.add(sc.nextLine());
    }

    Map<String, Integer> result = new HashMap<String, Integer>();
    for (String name: names){
      result.put(name, 0);
    }
    Map<String,Integer> start = new HashMap<String,Integer>();
    for (int j = 0; j < np; j++){
      String name = sc.next();
      int money = sc.nextInt();
      int num = sc.nextInt();

      start.put(name, money);

      int gift = 0;
      if (num > 0){
        gift = money/num;
        result.put(name, result.get(name) + money%num);
      }

      for (int k=0; k<num; k++){
        String nname = sc.next();
        result.put(nname, result.get(nname)+ gift);
      }
      }
    for (String name: names){
      pw.println(name + " " + (result.get(name) - start.get(name)));
    }
    pw.close();
  }
}

//deine mutter ist dum