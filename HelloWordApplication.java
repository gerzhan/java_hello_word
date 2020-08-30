import java.util.ArrayList;
import java.util.List;

class Foo {
  int id;
  String pp;
  String name;

  public String display() {
    return "Foo: id=" + this.id + ", name=" + this.name + ", pp=" + this.pp;
  }
}

// NOTE: public перед классом требовалось указывать в ранних версиях Java
class HelloWordApplication {

  // NOTE: обязательный метод для запуска приложения
  public static void main(String[] args) {
    System.out.println("Hello Word!!");

    List<Foo> list = new ArrayList();
    Foo item1 = new Foo();
    item1.id = 1;
    item1.name = "one";
    list.add(item1);

    Foo item2 = new Foo();
    item2.id = 2;
    item2.name = "two";
    list.add(item2);

    Foo item3 = new Foo();
    item3.id = 3;
    item3.name = "three";
    list.add(item3);

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i).display());
    }
  }
}
