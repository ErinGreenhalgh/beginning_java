class Dog {
  int size;
  String breed;
  String name;

  void bark(){
    System.out.println("Ruff!");
  }
}

class DogTester {
  public static void main (String[] args) {
    Dog benji = new Dog();
    benji.size = 12;
    benji.name = "Benji";
    benji.bark();
    System.out.println("This dog's name is " + benji.name + " and he is size " + benji.size);
  }
}

//this file has to be named DogTester, ie named after the class that contains the main method 
