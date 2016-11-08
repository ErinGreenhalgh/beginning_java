class PassByValue {
  static void addSome(int x) {
    x += 10;
    System.out.println("X inside addSome:" + x);
  }

  public static void main (String[] args) {
    int x = 7;
    addSome(x);
    System.out.println("X in main:" + x);
  }
}

//illustration of pass by value:
//x passed into the method is a copy of the originally declared x variable 
