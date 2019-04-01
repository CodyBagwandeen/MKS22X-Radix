public class Radix{
  public static void radixsort(int[] data){

  }

  public static int getDigit(int num, int i){ // return the ith digit
    while( i > 1){
      num = num / 10;
      i--;
    }
    return num % 10;
  }

  public static void main(String[] args){
    System.out.println("getDigit(51, 1) : Should be 1, Actual : " + getDigit(51,1));
    System.out.println("getDigit(12345,3) : Should be 3, Actual : " + getDigit(12345,3));
  }
}
