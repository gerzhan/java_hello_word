class Foo {
  int id;
  String pp;
  String name;

  public String display() {
    return (
      this.getClass().getName() + ": id=" + id + ", name=" + name + ", pp=" + pp
    );
  }
}
