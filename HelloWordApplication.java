class Foo {
  int id;
  String pp;
  String name;
}

// NOTE: public перед классом требовалось указывать в ранних версиях Java
class HelloWordApplication {

  static void displayItem(Foo item) {
    System.out.println(
      "Foo: id=" + item.id + ", name=" + item.name + ", pp=" + item.pp
    );
  }

  // NOTE: обязательный метод для запуска приложения
  public static void main(String[] args) {
    System.out.println("Hello Word!!");

    Foo item1 = new Foo();
    item1.id = 1;
    item1.name = "one";
    HelloWordApplication.displayItem(item1);

    Foo item2 = new Foo();
    item2.id = 2;
    item2.name = "two";

    HelloWordApplication.displayItem(item2);
    Foo item3 = new Foo();
    item3.id = 3;
    item3.name = "three";
    HelloWordApplication.displayItem(item3);

    for (int i = 1; i <= 5; i++) {
      System.out.println(i);
    }
  }
}
