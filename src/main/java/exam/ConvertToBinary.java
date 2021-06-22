import java.io.*;

 class ConvertToBinary {

   static void defToBinary(int n)
   {
     int[] binary Num = new int [35];
     int i = 0;
     while (n > 0)
     {
       binaryNum[i] = n % 2;
       n = n / 2;
       i++;
     }
     
     for(int j = i - 1; j >= 0; j--)
       System.out.print(binaryNum[j]);
   }
     
     
  public static void main(String[] args) {
    {
      int n = 35;
      decToBinary(n);
    }
}
