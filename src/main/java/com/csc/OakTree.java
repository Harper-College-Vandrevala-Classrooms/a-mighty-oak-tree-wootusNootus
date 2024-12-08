package com.csc;

public class OakTree {
  public static void main(String[] args) {
    // Creating Squirrel objects
    Squirrel cheeks = new Squirrel("Cheeks");
    Squirrel squeaks = new Squirrel("Squeaks");
    Squirrel fluffybutt = new Squirrel("Mr. Fluffy Butt");
    Squirrel nutsy = new Squirrel("Nutsy");
    Squirrel chip = new Squirrel("Chip");

    // Creating Node objects
    Node nodeOne = new Node(cheeks);
    Node nodeTwo = new Node(squeaks);
    Node nodeThree = new Node(fluffybutt);
    Node nodeFour = new Node(nutsy);
    Node nodeFive = new Node(chip);

    nodeOne.setLeft(nodeTwo);
    nodeOne.setRight(nodeThree);
    nodeTwo.setLeft(nodeFour);
    nodeThree.setRight(nodeFive);

    // Traverse and print the structure
    System.out.println("Root: " + nodeOne.getName());
    System.out.println("Left child of root: " + (nodeOne.left() != null ? nodeOne.left().getName() : "None"));
    System.out.println("Right child of root: " + (nodeOne.right() != null ? nodeOne.right().getName() : "None"));
    System.out.println("Left child of left node: " + (nodeTwo.left() != null ? nodeTwo.left().getName() : "None"));
    System.out.println("Right child of right node: " + (nodeThree.right() != null ? nodeThree.right().getName() : "None"));
  }
}
