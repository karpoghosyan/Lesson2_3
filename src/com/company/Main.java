package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        Leaf leaf1 = new Leaf();
        Leaf leaf2 = new Leaf();
        Leaf leaf3 = new Leaf();
        leaf1.setColor("red");
        leaf2.setColor("Green");
        leaf3.setColor("Orange");
        ArrayList<Leaf> leaves = new ArrayList<>();
        leaves.add(leaf1);
        leaves.add(leaf2);
        leaves.add(leaf3);
        tree.setLeaves(leaves);
        tree.makeLeafsYellow();
        tree.makeLeafsFall();
    }
}
