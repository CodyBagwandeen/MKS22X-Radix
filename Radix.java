import java.util.Arrays;
public class Radix{
  public static void radixsort(int[] data){
    if(data.length == 0 || data.length == 1){
      return;
    }

    MyLinkedList[] buckets = new MyLinkedList[10];
    for( int i = 1; i < getLength(data); i++){

      // putting the numbers into the buckets
      for(int j = 0; j < data.length -1; j++){
        int index = getDigit(data[j], i); // gets the needed digit

        System.out.println();
        System.out.println("" + index);
        System.out.println("" + data[j]);

        if(data[j] >= 0){
          buckets[index].add(data[j]);
        } else {
          buckets[index].add(data[j],0);
        }
      }

      // now to get them out
      int counter = 0;
      for(int j = 0; j < 10; j++){
        for(int k = 0; k < buckets[j].size() -1; k++){
          int temp = buckets[j].removeFront();
          data[counter++] = temp;
        }
      }
    }

  }

  public static int getDigit(int num, int i){ // return the ith digit
    if( i > numDigits(num)){
      return 0;
    }

    while( i > 1){
      num = num / 10;
      i--;
    }
    return num % 10;
  }

  public static int numDigits(int num){
    int counter =0;
    while(num > 0){
      num = num / 10;
      counter++;
    }
    return counter;
  }



  public static int getLength(int[] data) { // return the length of the largest digit in an array
    int max = data[0];
    for(int i = 1; i < data.length -1; i++){
      if(Math.abs(data[i]) >= max){
        max = Math.abs(data[i]);
      }
    }
    return numDigits(max);
  }

  public static void main(String[] args){
    System.out.println("getDigit(51, 3) : Should be 0, Actual : " + getDigit(51,3));
    System.out.println("getDigit(12345,3) : Should be 3, Actual : " + getDigit(12345,3));
    System.out.println("numDigits(312) : Should be 3, Actual : " + numDigits(312));
    System.out.println("numDigits(4) : Should be 1, Actual : " + numDigits(1));
    int[] a1 = {1,22,312,74,8};
    System.out.println("getLength(a1) : Should be 3, Actual : " + getLength(a1));
    System.out.println("radixsort(a1) : Should be [1,8,22,74,312], Actual : ");
    radixsort(a1);
    System.out.print(Arrays.toString(a1));
  }
}
