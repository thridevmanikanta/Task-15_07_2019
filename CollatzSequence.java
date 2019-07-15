class CollatzSequence {
  public static void main(String args[]) {
    try {
      int prevNumber = Integer.parseInt(args[0]);
      System.out.print(prevNumber + " ");
      printCollatzSequence(prevNumber);
    }
    catch(ArrayIndexOutOfBoundsException e) {
      System.out.print("Please provide a number through command line arguments.");
    }
  }
  public static void printCollatzSequence(int prevNumber) {
    if(prevNumber == 1) {
      return;
    }
    else if(prevNumber % 2 == 0) {
      int nextNumber = prevNumber / 2;
      System.out.print(nextNumber + " ");
      printCollatzSequence(nextNumber);
    }
    else {
      int nextNumber = 3 * prevNumber + 1;
      System.out.print(nextNumber + " ");
      printCollatzSequence(nextNumber);
    }
  }
}
