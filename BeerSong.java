public class BeerSong {
  public static void main (String[] args) {
    int beers = 3;
    String word = "";
    while (beers >= 0) {
      if (beers == 1) {
        word = "bottle";
      } else {
        word = "bottles";
      }


      if (beers == 0) {
        System.out.println("No more " + word + " of beer on the wall! :(");
      }
      else {
        System.out.println(beers + " " + word + " of beer on the wall.");
        System.out.println(beers + " " + word + " of beer.");
        System.out.println("Take one down. Pass it around.");
      }

      beers -= 1;

    }
  }
}
