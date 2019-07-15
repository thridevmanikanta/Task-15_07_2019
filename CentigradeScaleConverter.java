class CentigradeScaleConverter {
  public static void main(String[] args) {
    if(args.length > 2) {
      System.out.println("Only two command line arguments should be entered.");
    }
    if(args[0].equals("0")) {
      float celsius = Float.parseFloat(args[1]);
      float fahrenheit = (celsius * 9) / 5 + 32;
      System.out.println(fahrenheit);
    }
    else {
      float fahrenheit = Float.parseFloat(args[1]);
      float celsius = (fahrenheit - 32) * 5 / 9;
      System.out.println(celsius);
    }
  }
}
