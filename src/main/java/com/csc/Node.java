package com.csc;

public class Node<T> {
  Node<T> left, right;
  T data;
  String name;

  public Node(T data){
    this.data = data;
    this.name = ((Squirrel)data).getName();
  }

  public void setLeft(Node<T> leftNode) {
    this.left = leftNode;
  }

  public void setRight(Node<T> rightNode) {
    this.right = rightNode;
  }

  public Node<T> left() {
    return this.left;
  }

  public Node<T> right() {
    return this.right;
  }

  public String getName() {
    return this.name;
  }

  public T getData() {
    return this.data;
  }
}