public class Radix{
  public static void radixsort(int[] data){
    if(data.length == 0 || data.length == 1){
      return;
    }

    MyLinkedList[] temp = new MyLinkedList[10];

  }

  public static int getDigit(int num, int i){ // return the ith digit
    while( i > 1){
      num = num / 10;
      i--;
    }
    return num % 10;
  }



  public static int getLength(int[] data) { // return the length of the largest digit in an array
    int max = data[0];
    for(int i = 1; i < data.length -1; i++){
      if(Math.abs(data[i]) >= max){
        max = Math.abs(data[i]);
      }
    }
    int num = 0;
    while(max > 0){
      max = max / 10;
      num++;
    }
    return num;
  }

  public static void main(String[] args){
    System.out.println("getDigit(51, 1) : Should be 1, Actual : " + getDigit(51,1));
    System.out.println("getDigit(12345,3) : Should be 3, Actual : " + getDigit(12345,3));
    int[] a1 = {1,22,312,44,51,62,74,8};
    System.out.println("getLength(a1) : Should be 3, Actual : " + getLength(a1));
  }
}
