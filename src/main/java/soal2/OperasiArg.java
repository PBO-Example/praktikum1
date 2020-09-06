//OperasiArg.java
package soal6c;

public class OperasiArg{
      public static void main (String args[]){
			int a,b;
			 a=Integer.parseInt(args[0]);
			 b=Integer.parseInt(args[1]);
			 System.out.print("" + a + "x" + b + "=" + kali(a,b)+"\n");
			 System.out.print("" + a + "/" + b + "=" + bagi(a,b)+"\n");
			 System.out.print("" + a + "+" + b + "=" + tambah(a,b)+"\n");
			 System.out.print("" + a + "-" + b + "=" + kurang(a,b)+"\n");
      }
      static int kali (int x, int y){
             return x * y;
      }
      static double bagi (int m,int n){
           return (double)(m/n);
      }
	  static int tambah (int m,int n){
           return m + n;
      }
	  static int kurang (int m,int n){
           return m - n;
      }
}
