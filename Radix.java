import java.util.*;
public class Radix{
  public static void radixsort(int[] data){
    if(data.length == 0 || data.length == 1){
      return;
    }

    @SuppressWarnings("unchecked")
    MyLinkedList<Integer>[] buckets = new MyLinkedList[20];
    for(int i = 0; i < 20; i++){ // initiate the buckets
      if ( buckets[i] == null){
        buckets[i] = new MyLinkedList<Integer>();
      }
    }

    for( int i = 1; i <= getLength(data); i++){

      // putting the numbers into the buckets
      //System.out.println("Putting them in");
      for(int j = 0; j < data.length ; j++){
        int index = getDigit(data[j], i); // gets the needed digit

        //System.out.println();
        //System.out.println("" + index);
        //System.out.println("" + data[j]);

        if(data[j] >= 0){
          buckets[index+10].add(data[j]);
        } else {
          buckets[9 - index].add(data[j]);
        }
      }

      // now to get them out
      //System.out.println("taking them out");
      int counter = 0;
      for(int j = 0; j < 20; j++){
        int s = buckets[j].size();
        //System.out.println("buckets[" + j + "]" + " : " + buckets[j]);
        //System.out.println("s = " + s);
        for(int k = 1; k <= s ; k++){
          //System.out.println(buckets[j]);
          int temp = buckets[j].removeFront();
          //System.out.println("temp = " + temp);
          data[counter] = temp;
          counter++;
        }
      }

      //System.out.println(Arrays.toString(data));
    }

  }

  public static int getDigit(int num, int i){ // return the ith digit
    if( i > numDigits(num)){
      return 0;
    }

    if( num < 0) { // pos digits only
      num = num * -1;
    }

    while( i > 1){
      num = num / 10;
      i--;
    }
    return num % 10;
  }

  public static int numDigits(int num){ // number of digits
    if( num < 0){
      num = num * -1;
    }
    int counter =0;
    while(num > 0){
      num = num / 10;
      counter++;
    }
    return counter;
  }



  public static int getLength(int[] data) { // return the length of the largest digit in an array
    int max = Math.abs(data[0]);
    for(int i = 1; i < data.length ; i++){
      if(Math.abs(data[i]) >= max){
        max = Math.abs(data[i]);
      }
    }
    return numDigits(max);
  }

  public static void main(String[] args){

    System.out.println("getDigit(51, 3) : Should be 0, Actual : " + getDigit(51,3) + "\n");
    System.out.println("getDigit(12345,3) : Should be 3, Actual : " + getDigit(12345,3) + "\n");
    System.out.println("getDigit(-21, 1) : Should be 1, Actual : " + getDigit(-21,1) + "\n");
    System.out.println("numDigits(312) : Should be 3, Actual : " + numDigits(312) + "\n");
    System.out.println("numDigits(4) : Should be 1, Actual : " + numDigits(1)+ "\n");
    int[] a1 = {1,22,312,74,8444};
    System.out.println("getLength(a1) : Should be 4, Actual : " + getLength(a1) + "\n");
    radixsort(a1);
    System.out.println("radixsort(a1) : Should be [1, 22, 74, 312, 8444], Actual : " + Arrays.toString(a1) + "\n");
    int[] a2 = {1,-22,312,-74,8};
    System.out.println("getLength(a2) : Should be 3, Actual : " + getLength(a2) + "\n");
    radixsort(a2);
    System.out.println("radixsort(a2) : Should be [-74, -22, 1, 8, 312], Actual : " + Arrays.toString(a2));

    int[] test = {12,512,-1231, 51, -7238, 6, -18, 162, 59, -8123, 2};
    int[] testC = {12,512,-1231, 51, -7238, 6, -18, 162, 59, -8123, 2};
    System.out.println("\nTest Array: " + Arrays.toString(test) + "\nCopy of Test Array : " + Arrays.toString(testC));

    int[] testB = {-8123, -7238, -1231, -18, 2, 6, 12, 51, 59, 162, 512};
    testC = testB;
    radixsort(test);

    System.out.println(" \nSorted Test Array : " + Arrays.toString(test));
    System.out.println(" \nSorted Copy : " + Arrays.toString(testC));
    if(Arrays.toString(test).equals(Arrays.toString(testC))){
      System.out.println("\nSucessful Sort");
    } else {
      System.out.println("\nFailed Sort");
    }

  }

}
