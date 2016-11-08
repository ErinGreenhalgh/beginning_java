public class OysterPuzzle {
  public static void main (String[] args) {
    int x = 0;
    while ( x < 4 ) {
      x += 1;
      if (x < 1) {
        System.out.print("annoys");
      }
      if ( x > 0) {
        System.out.print(" ");
        System.out.print("noise");
      }
      if (x == 1) {
        System.out.print("an");
      }
      if ( x > 0 ) {
        System.out.print("oyster");
      }
      System.out.println("");
      x -= 2;
    }
  }
}

//create this output :
// a noise
// annoys
// an oyster

//from these snippets (each can only be used once, don't need to use all:)
//System.out.print(" ");
//System.out.print("a ");
//System.out.print("n");
//System.out.print("an");

//x > 0
//x < 1
//x > 1
//x > 3
//x < 4

//x += 1;
//x += 2;
//x -= 2;
//x -= 1;

//System.out.print("noys ");
//System.out.print("oise");
//System.out.print(" oyster");
//System.out.print("annoys");
//System.out.print("noise");
