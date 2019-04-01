import java.util.Scanner;

public class Driver {

  public static void main(String[] args) {

    System.out.println("MAIN MENU:");
    System.out.println("[1] STANDARD");
    System.out.println("[2] DEBUGGER");
    System.out.println("[3] QUIT\n");

    Scanner sc = new Scanner(System.in);
    System.out.print("input: ");

    int input = sc.nextInt();

    switch(input) {
      case 1:
        // construct new, empty LinkedList
        System.out.println("\nMyLinkedList test_case = new MyLinkedList();");
        MyLinkedList test_case = new MyLinkedList();

        // continue
        System.out.println("[.]+[ENTER] to run diagnostics");
        String cont = sc.next();

        // LinkedList constructor diagnostics
        // check initial size()
        System.out.print("// ");
        if(test_case.size() == 0) {
          System.out.println("PASS");
          System.out.println("   test_case.size() == 0");
        } else {
          System.out.println("FAIL");
          System.out.println("   test_case.size() != 0");
        }

        // check toString() against expected
        System.out.print("// ");
        if(test_case.toString().equals("[]")) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println("   expected: []");
        System.out.println("   actual:   " + test_case);

        // --------------------------------------------------

        // continue
        System.out.println("\n[.]+[ENTER] to test add(Integer value)");
        cont = sc.next();

        // add(Integer value) values to test_case
        System.out.println("test_case.add(1)");
        System.out.println("test_case.add(2)");
        test_case.add(1);
        test_case.add(2);

        // continue
        System.out.println("\n[.]+[ENTER] to run diagnostics");
        cont = sc.next();

        // LinkedList add(Integer value) diagnostics
        // check size()
        System.out.print("// ");
        if(test_case.size() == 2) {
          System.out.println("PASS");
          System.out.println("  test_case.size() == 2");
        } else {
          System.out.println("FAIL");
          System.out.println("  test_case.size() != 2");
        }

        // check toString() against expected
        System.out.print("// ");

        if(test_case.toString().equals("[1, 2]")) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println("  expected: [1, 2]");
        System.out.println("  actual:   " + test_case);

        // continue
        System.out.println("\n[.]+[ENTER] to test add(Integer value)");
        cont = sc.next();

        // add(Integer value) values to test_case
        System.out.println("test_case.add(-4)");
        System.out.println("test_case.add(-7)");
        test_case.add(-4);
        test_case.add(-7);

        // continue
        System.out.println("\n[.]+[ENTER] to run diagnostics");
        cont = sc.next();

        // LinkedList add(Integer value) diagnostics
        // check size()
        System.out.print("// ");
        if(test_case.size() == 4) {
          System.out.println("PASS");
          System.out.println("  test_case.size() == 4");
        } else {
          System.out.println("FAIL");
          System.out.println("  test_case.size() != 4");
        }

        // check toString() against expected
        System.out.print("// ");

        if(test_case.toString().equals("[1, 2, -4, -7]")) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println("  expected: [1, 2, -4, -7]");
        System.out.println("  actual:   " + test_case);

        // continue
        System.out.println("\n[.]+[ENTER] to test toStringReverse()");
        cont = sc.next();

        System.out.println( "test_case.toStringReverse()");

        // continue
        System.out.println("\n[.]+[ENTER] to run diagnostics");
        cont = sc.next();

        System.out.print("// ");

        if(test_case.toStringReverse().equals("[-7, -4, 2, 1]")) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println("  expected: [-7, -4, 2, 1]");
        System.out.println("  actual:   " + test_case.toStringReverse());

        // continue
        System.out.println("\n[.]+[ENTER] to test add(int index, Integer value)");
        cont = sc.next();

        // add(int index, Integer value) values to test_case
        System.out.println("test_case.add(3, -9)");
        test_case.add(3, -9);

        // continue
        System.out.println("\n[.]+[ENTER] to run diagnostics");
        cont = sc.next();

        // LinkedList add(int index, Integer value) diagnostics
        // check size()
        System.out.print("// ");
        if(test_case.size() == 5) {
          System.out.println("PASS");
          System.out.println("  test_case.size() == 5");
        } else {
          System.out.println("FAIL");
          System.out.println("  test_case.size() != 5");
        }

        // check toString() against expected
        System.out.print("// ");

        if(test_case.toString().equals("[1, 2, -4, -9, -7]")) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println("  expected: [1, 2, -4, -9, -7]");
        System.out.println("  actual:   " + test_case);

        // continue
        System.out.println("\n[.]+[ENTER] to test add(int index, Integer value)");
        cont = sc.next();

        // add(int index, Integer value) values to test_case
        System.out.println("test_case.add(0, -5)");
        test_case.add(0, -5);

        // continue
        System.out.println("\n[.]+[ENTER] to run diagnostics");
        cont = sc.next();

        // LinkedList add(int index, Integer value) diagnostics
        // check size()
        System.out.print("// ");
        if(test_case.size() == 6) {
          System.out.println("PASS");
          System.out.println("  test_case.size() == 6");
        } else {
          System.out.println("FAIL");
          System.out.println("  test_case.size() != 6");
        }

        // check toString() against expected
        System.out.print("// ");

        if(test_case.toString().equals("[-5, 1, 2, -4, -9, -7]")) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println("  expected: [-5, 1, 2, -4, -9, -7]");
        System.out.println("  actual:   " + test_case);

        // continue
        System.out.println("\n[.]+[ENTER] to test negative EXCEPTIONS add(int index, Integer value)");
        cont = sc.next();

        // add(int index, Integer value) EXCEPTIONS values to test_case
        System.out.println("test_case.add(-1, 10)");

        System.out.println();

        try {
          test_case.add(-1, 10);
        } catch(IndexOutOfBoundsException e) {
          System.out.println("INDEX_EXCEPTION : given index exceeds bounds, negative EXCEPTION");
        }

        // continue
        System.out.println("\n[.]+[ENTER] to run diagnostics");
        cont = sc.next();

        // LinkedList add(int index, Integer value) diagnostics
        // check size()
        System.out.print("// ");
        if(test_case.size() == 6) {
          System.out.println("PASS");
          System.out.println("  test_case.size() == 6");
        } else {
          System.out.println("FAIL");
          System.out.println("  test_case.size() != 6");
        }

        // check toString() against expected
        System.out.print("// ");

        if(test_case.toString().equals("[-5, 1, 2, -4, -9, -7]")) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println("  expected: [-5, 1, 2, -4, -9, -7]");
        System.out.println("  actual:   " + test_case);

        // continue
        System.out.println("\n[.]+[ENTER] to test overflow EXCEPTIONS add(int index, Integer value)");
        cont = sc.next();

        // add(int index, Integer value) EXCEPTIONS values to test_case
        System.out.println("test_case.add(7, 10)");

        System.out.println();

        try {
          test_case.add(7, 10);
        } catch(IndexOutOfBoundsException e) {
          System.out.println("INDEX_EXCEPTION : given index exceeds bounds, overflow EXCEPTION");
        }

        // continue
        System.out.println("\n[.]+[ENTER] to run diagnostics");
        cont = sc.next();

        // LinkedList add(int index, Integer value) diagnostics
        // check size()
        System.out.print("// ");
        if(test_case.size() == 6) {
          System.out.println("PASS");
          System.out.println("  test_case.size() == 6");
        } else {
          System.out.println("FAIL");
          System.out.println("  test_case.size() != 6");
        }

        // check toString() against expected
        System.out.print("// ");

        if(test_case.toString().equals("[-5, 1, 2, -4, -9, -7]")) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println("  expected: [-5, 1, 2, -4, -9, -7]");
        System.out.println("  actual:   " + test_case);

        // --------------------------------------------------

        // get(Index) on test_case
        System.out.println("\n[.]+[ENTER] to test get(Index)");
        cont = sc.next();

        System.out.print("// ");
        if(test_case.get(0) == -5 && test_case.get(5) == -7 && test_case.get(3) == -4) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println(" expected: -5, -7, -4");
        System.out.println(" actual: " + test_case.get(0) + test_case.get(5) + test_case.get(3));

        // continue
        System.out.println("\n[.]+[ENTER] to test INDEXOUTOFBOUNDS EXCEPTIONS get(int index)");
        cont = sc.next();

        try{
          test_case.get(-1);
        } catch ( IndexOutOfBoundsException e) {
          System.out.println("INDEX_EXCEPTION: given index below expected bounds");
        }
        try{
          test_case.get(6);
        } catch (IndexOutOfBoundsException e) {
          System.out.println(" INDEX_EXCEPTION: given index exceeds bounds");
        }

        //set(Index) on test_case
        System.out.println("\n[.]+[ENTER] to test set(Index)");
        cont = sc.next();

        //testing if set returns olds values
        System.out.print("// ");
        if(test_case.set(0,0) == -5 && test_case.set(5,5) == -7 && test_case.set(3,3) == -4){
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println(" expected: -5, -7, -4");

        // continue
        System.out.println("\n[.]+[ENTER] to test INDEXOUTOFBOUNDS EXCEPTIONS set(int index)");
        cont = sc.next();

        try{
          test_case.set(-1,0);
        } catch ( IndexOutOfBoundsException e) {
          System.out.println("INDEX_EXCEPTION: given index below expected bounds");
        }
        try{
          test_case.set(6,-1);
        } catch (IndexOutOfBoundsException e) {
          System.out.println(" INDEX_EXCEPTION: given index exceeds bounds");
        }

        // continue
        System.out.println("\n[.]+[ENTER] to test if values are properly set");
        cont = sc.next();

        System.out.print("// ");
        if(test_case.toString().equals("[0, 1, 2, 3, -9, 5]")) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println("  expected: [0, 1, 2, 3, -9, 5]");
        System.out.println("  actual:   " + test_case);

        System.out.println("\n[.]+[ENTER] to test remove(int index)");
        cont = sc.next();

        // remove(int index)to test_case
        System.out.println("test_case.remove(0)");
        System.out.println("test_case.remove(4)");
        System.out.println("test_Case.remove(2)");
        test_case.remove(0);
        test_case.remove(4);
        test_case.remove(2);

        // continue
        System.out.println("\n[.]+[ENTER] to run diagnostics");
        cont = sc.next();

        // check size()
        System.out.print("// ");
        if(test_case.size() == 3) {
          System.out.println("PASS");
          System.out.println("  test_case.size() == 3");
        } else {
          System.out.println("FAIL");
          System.out.println("  test_case.size() != 3");
        }

        // check toString() against expected
        System.out.print("// ");

        if(test_case.toString().equals("[1, 2, -9]")) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println("  expected: [1, 2, -9]");
        System.out.println("  actual:   " + test_case);

        // continue
        System.out.println("\n[.]+[ENTER] to test overflow EXCEPTIONS remove(int index");
        cont = sc.next();

        try {
          test_case.remove(10);
        } catch(IndexOutOfBoundsException e) {
          System.out.println("INDEX_EXCEPTION : given index exceeds bounds");
        }

        try {
          test_case.remove(-1);
        } catch(IndexOutOfBoundsException e) {
          System.out.println("INDEX_EXCEPTION : given index exceeds bounds");
        }

        System.out.println("\n[.]+[ENTER] to test contains(Integer value)");
        cont = sc.next();

        // check toString() against expected

        System.out.println("test_case.contains(1)");
        System.out.println("test_case.contains(9)");
        System.out.println("test_case.contains(2)");
        System.out.println("!test_case.contains(-4) \n");

        // continue
        System.out.println("\n[.]+[ENTER] to run diagnostics");
        cont = sc.next();


        System.out.print("// ");

        if(test_case.contains(1) && test_case.contains(-9) && test_case.contains(2) && !(test_case.contains(-4))) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println("  expected: true true true true");

        System.out.println("\n[.]+[ENTER] to test indexOf(Integer value)");
        cont = sc.next();

        System.out.println("test_case.indexOf(1)");
        System.out.println("test_case.indexOf(9)");
        System.out.println("test_case.indexOf(2)");
        System.out.println("!test_case.indexOf(-4) \n");

        // continue
        System.out.println("\n[.]+[ENTER] to run diagnostics");
        cont = sc.next();

        System.out.print("// ");

        if(test_case.indexOf(1) == 0 && test_case.indexOf(-9) == 2 && test_case.indexOf(2) == 1 && test_case.indexOf(-4) == -1) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println(" expected : 0 2 1 -1");
        System.out.println(" actual : " + test_case.indexOf(1) + test_case.indexOf(-9) + test_case.indexOf(2) + test_case.indexOf(-1));


        System.out.println("\n[.]+[ENTER] to test remove(Integer value)");
        cont = sc.next();

        System.out.println("test_case.remove( (Integer)1)");
        System.out.println("test_case.remove( (Integer)-9)");

        test_case.remove( (Integer)1);
        test_case.remove( (Integer)(-9));

        //contine
        System.out.println("\n[.]+[ENTER] to run diagnostics");
        cont = sc.next();

        System.out.print("// ");

        if( test_case.toString().equals("[2]")) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println(" expected: [2]");
        System.out.println(" actual "+ test_case);
        System.out.println();


        System.out.println("test_case.add( (Integer) 3) adding more stuff for more remove tests");
        System.out.println("test_case.add( (Integer) 4) adding more stuff for more remove tests");
        System.out.println("test_case.add( (Integer) 5) adding more stuff for more remove tests");
        System.out.println("test_case.add( (Integer) 6) adding more stuff for more remove tests");
        System.out.println("test_case.add( (Integer) 7) adding more stuff for more remove tests");
        System.out.println("test_case.add( (Integer) 8) adding more stuff for more remove tests");
        System.out.println("test_case.remove( (Integer) 3)");
        System.out.println("test_case.remove( (Integer) 6)");
        System.out.println("test_case.remove( (Integer) 8)");
        // nice formatting, cody
        // you *are* a genius

        test_case.add( (Integer) 3);
        test_case.add( (Integer) 4);
        test_case.add( (Integer) 5);
        test_case.add( (Integer) 6);
        test_case.add( (Integer) 7);
        test_case.add( (Integer) 8);
        test_case.remove( (Integer) 3);
        test_case.remove( (Integer) 6);
        test_case.remove( (Integer) 8);

        //continue
        System.out.println("\n[.]+[ENTER] to run diagnostics");
        cont = sc.next();

        System.out.print("// ");

        if( test_case.toString().equals("[2, 4, 5, 7]")) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println(" expected: [2, 4, 5, 7]");
        System.out.println(" actual "+ test_case);

        System.out.println("\n[.]+[ENTER] to test extend(MyLinkedList Other)");
        cont = sc.next();

        MyLinkedList L1 = new MyLinkedList();
        for( int i = 0; i < 5; i++){
          L1.add(i);
        }

        System.out.println(test_case);
        System.out.println(L1);
        System.out.println("test_case.extend(L1)");

        //continue
        System.out.println("\n[.]+[ENTER] to run diagnostics");
        cont = sc.next();

        test_case.extend(L1);

        System.out.print("// ");

        if( L1.toString().equals("[]")) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println(" expected: []");
        System.out.println(" actual "+ L1.toString());

        System.out.print("// ");

        if( test_case.toString().equals("[2, 4, 5, 7, 0, 1, 2, 3, 4]")) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println(" expected: [2, 4, 5, 7, 0, 1, 2, 3 ,4]");
        System.out.println(" actual : "+ test_case.toString());

        System.out.print("// ");

        if( test_case.toStringReverse().equals("[4, 3, 2, 1, 0, 7, 5, 4, 2]")) {
          System.out.println("PASS");
        } else {
          System.out.println("FAIL");
        }
        System.out.println(" expected : [4, 3, 2, 1, 0, 7, 5, 4, 2] ");
        System.out.println(" actual : " + test_case.toStringReverse());



        break;
      case 2:
        // ?
        break;
      case 3:
        System.out.println("How could you leave me like this");
        System.exit(0);
        break;
      default:
        // ?
    }
  }
}
