public class Node{
 private Integer data;
 private Node next,prev;

public Node( Integer val, Node Next, Node previous) {
  data = val;
  next = Next;
  prev = previous;
}

 public int getData() {
   return data;
 }

 public Node next() {
   return next;
 }

 public void setNext( Node val) {
   next = val;
 }

 public Node prev() {
   return prev;
 }

 public void setPrev( Node val) {
   prev = val;
 }

 public Integer setData(Integer i) {
   Integer temp = data;
   data = i;
   return temp;
 }

 public String toString() {
   return "" + data;
 }

}
