class Foo {
  int id;
  String pp;
  String name;

  public String display() {
    return (
      this.getClass().getName() +
      ": id=" +
      this.id +
      ", name=" +
      this.name +
      ", pp=" +
      this.pp
    );
  }
}
