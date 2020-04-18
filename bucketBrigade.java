import java.io.*;
public class bucketBrigade {
public static void main(String[] args) throws IOException {
  BufferedReader br = new BufferedReader(new FileReader("buckets.in"));
  PrintWriter pw = new PrintWriter(new File("buckets.out"));
  String a = "";
  Point B = new Point();
  Point R = new Point();
  Point L = new Point();
  for (int i = 0; i < 10; i++){
      a = br.readLine();
      for (int j = 0; j < a.length(); j++){
        if (a.charAt(j)=='B')
          B = new Point(i,j);
        if (a.charAt(j) == 'R')
          R = new Point(i, j);
        if (a.charAt(j) == 'L')
          L = new Point(i, j);
        } 
      }
      if ((B.getX() == R.getX() && B.getX() == L.getX() )|| (B.getY() == R.getY() && B.getY() == L.getY())){
        pw.println(getDistance(B, L) + 2);
      }
      else {
      pw.println(getDistance(B, L));
      }
      
      br.close();
      pw.close();

    }

    public static int getDistance(Point x, Point y){
      int sum1 = Math.abs(x.getX() - y.getX());
      int sum2 = Math.abs(x.getY() - y.getY());
      return sum1+sum2-1;
    }      
  }

class Point{
private int a;
private int b;

public Point (int a, int b){
  this.a = a;
  this.b = b;
}

public Point(){
  this.a = 0;
  this.b = 0;
}

public int getX(){
  return a;
}

public int getY(){
  return b;
}
}