package com.csc;

public class OakTree {
  public static void main(String[] args) {
    // Creating Squirrel objects
    Squirrel cheeks = new Squirrel("Cheeks");
    Squirrel squeaks = new Squirrel("Squeaks");
    Squirrel fluffybutt = new Squirrel("Mr. Fluffy Butt");
    Squirrel nutsy = new Squirrel("Nutsy");
    Squirrel chip = new Squirrel("Chip");

    // Creating Node objects with generic type (<Squirrel>)
    Node<Squirrel> nodeOne = new Node<>(cheeks);
    Node<Squirrel> nodeTwo = new Node<>(squeaks);
    Node<Squirrel> nodeThree = new Node<>(fluffybutt);
    Node<Squirrel> nodeFour = new Node<>(nutsy);
    Node<Squirrel> nodeFive = new Node<>(chip);

    nodeOne.setLeft(nodeTwo);
    nodeOne.setRight(nodeThree);
    nodeTwo.setLeft(nodeFour);
    nodeThree.setRight(nodeFive);

    System.out.println("Root: " + nodeOne.getName());
    System.out.println("Left child of root: " + (nodeOne.left() != null ? nodeOne.left().getName() : "None"));
    System.out.println("Right child of root: " + (nodeOne.right() != null ? nodeOne.right().getName() : "None"));
    System.out.println("Left child of left node: " + (nodeTwo.left() != null ? nodeTwo.left().getName() : "None"));
    System.out.println("Right child of right node: " + (nodeThree.right() != null ? nodeThree.right().getName() : "None"));
  }
}
