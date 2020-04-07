class A {

  int foo() {}
  int foo(int a) {} // Noncompliant {{message}}
  int foo(int a, int b) {}

  Object foo(Object a){} // Noncompliant
  String foo(String a){} // Noncompliant
  String foo(Object a){}
}