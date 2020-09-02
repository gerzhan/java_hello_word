import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// NOTE: public перед классом требовалось указывать в ранних версиях Java
class HelloWordApplication {

  // NOTE: обязательный метод для запуска приложения
  public static void main(String[] args) {
    System.out.println("Hello Word!!");

    List<Map<String, Foo>> bar;
    bar = new ArrayList();
    List<Foo> list = new ArrayList();
    Foo item1 = new Foo();
    item1.id = 1;
    item1.name = "one";
    list.add(item1);
    Map map1 = new HashMap<String, Foo>();
    map1.put(item1.name, item1);
    bar.add(map1);

    Foo item2 = new Foo();
    item2.id = 2;
    item2.name = "two";
    list.add(item2);
    Map map2 = new HashMap<String, Foo>();
    map2.put(item2.name, item2);
    bar.add(map2);

    Foo item3 = new Foo();
    item3.id = 3;
    item3.name = "three";
    list.add(item3);
    Map map3 = new HashMap<String, Foo>();
    map3.put(item3.name, item3);
    bar.add(map3);
    System.out.println("--- step 1 print foo");
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i).display());
    }
    System.out.println(" --- step 2 print bar");
    for (int i = 0; i < bar.size(); i++) {
      Map<String, Foo> barMap = bar.get(i);
      barMap.forEach(
        (k, foo) -> System.out.println(("Item: [" + k + foo.display() + "]"))
      );
    }
  }
}
