package com.csc;

public class Node {
  Node left, right;
  String name;

  public Node(Squirrel data){
    name = data.getName();
  }

  public void setLeft(Node leftNode) {
    this.left = leftNode;
  }

  public void setRight(Node rightNode) {
    this.right = rightNode;
  }

  public Node left() {
    return this.left;
  }

  public Node right() {
    return this.right;
  }

  public String getName() {
    return this.name;
  }
}