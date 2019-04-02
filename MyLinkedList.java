public class MyLinkedList{
  private int size;
  private Node start,end;

  public MyLinkedList(){
      start = null;
      end = null;
      size = 0;
  }

  public int size() {
    return size;
  }
  public boolean add(int value) {
    if( size == 0) {
      Node n = new Node(value,null,null);
      start = n;
      end = n;
    }
    if( size >= 1) {
      Node n = new Node(value, null, end);
      n.prev().setNext(n);
      end = n;
    }
    size++;
    return true;
  }

  public String toString() {
    if( size == 0)
    return "[]";
    String output = "[";
    Node n = start;
    while(n != end) {
      output += n.getData() +", ";
      n = n.next();
    }
    return output + n.getData() + "]";
  }

  public String toStringReverse() {
    if (size == 0)
    return "[]";
    String output = "[";
    Node n = end;
    while( n != start ) {
      output += n.getData() + ", ";
      n = n.prev();
    }
    return output + n.getData() + "]";
  }

  public Integer get(int index) {
    if( index < 0 || index >= size)
    throw new IndexOutOfBoundsException("Index must be within list");
    Node current = start;
    for( int i = 0; i < index; i++) {
      current = current.next();
    }
    return current.getData();
  }

  public Integer set(int index, Integer value) {
    if( index < 0 || index >= size)
    throw new IndexOutOfBoundsException("Index must be within list");
    Node current = start;
    for( int i = 0; i < index; i++) {
      current = current.next();
    }
    Integer temp = current.getData();
    current.setData(value);
    return temp;
  }

  public boolean contains( Integer value){
    Node current = start;
    while( current != null) {
      if ( current.getData() == value)
      return true;
      current = current.next();
    }
    return false;
    }

  public int indexOf(Integer value){
    if(contains(value)) {
      Node current = start;
      int index = 0;
      while( current.getData() != value) {
        index++;
        current = current.next();
      }
      return index;
    }
    return -1;
  }

  public void add(int index, Integer value){
    if( index < 0 || index > size)
    throw new IndexOutOfBoundsException("Index must be within list");
    Node n = new Node(value,null,null);
    if( index == 0){
      n.setNext(start);
      start.setPrev(n);
      start = n;
      size++;
    } else {
      Node current = start;
      for( int i = 0; i < index; i++) {
        current = current.next();
      }
      Node before = current.prev();
      before.setNext(n);
      current.setPrev(n);
      n.setPrev(before);
      n.setNext(current);
      size++;
    }
  }

  public Integer remove(int index){
    if( index < 0 || index >= size)
    throw new IndexOutOfBoundsException("Index must be within list");
    Node current = start;
    for( int i = 0; i < index; i++) {
      current = current.next();
    }
    if( end == current) {
      Node before = current.prev();
      before.setNext(null);
      end = before;
      size--;
      return current.getData();
    } else {
      if ( current == start) {
        Node after = current.next();
        after.setPrev(null);
        start = after;
        size--;
      } else {
        Node before = current.prev();
        Node after = current.next();
        before.setNext(after);
        after.setPrev(before);
        size--;
      }
    }
    return current.getData();
  }

  public boolean remove(Integer value){
    if(contains(value)) {
      remove(indexOf(value));
      return true;
    }
    return false;
  }

  public Integer removeFront(){
    if( size == 1){
      int temp = start.getData();
      start = end = null;
      size = 0;
      return temp;
    }
    Node temp = start;
    Node newStart = start.next();
    start = newStart;
    newStart.setPrev(null);
    temp.setNext(null);
    size--;
    return temp.getData();
  }
    //in O(1) runtime, move the elements from other onto the end of this
    //The size of other is reduced to 0
    //The size of this is now the combined sizes of both original lists
   public void extend(MyLinkedList other){
      end.setNext(other.start);
      other.start.setPrev(end);
      size += other.size();
      end = other.end;
      other.start = null;
      other.end = null;
      other.size = 0;
    }

    public static void main(String[] args){
      MyLinkedList L1 = new MyLinkedList();
      L1.add(1);
      L1.add(2);
      L1.add(3);
      L1.add(4);

      System.out.println(L1 + " size : " + L1.size());
      System.out.println(L1.removeFront());
      System.out.println(L1 + " size : " + L1.size());

      MyLinkedList L2 = new MyLinkedList();
      L2.add(1);

      System.out.println(L2 + " size : " + L2.size());
      System.out.println(L2.removeFront());
      System.out.println(L2 + " size : " + L2.size());

    }

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

}
