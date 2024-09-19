package edu.grinnell.csc207.util;

public class Box<T> {
  T value;
  //constructor
  public Box(T val){
    this.value = val;
  } // constructor Box(T)

  public void set(T val) {
    this.value = val;
    return;
  } // set(T)

  public T get() {
    return this.value;
  } // get()
} // class Box<T>
