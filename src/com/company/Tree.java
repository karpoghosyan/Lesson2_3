package com.company;

import java.util.ArrayList;

public class Tree {
    //region Properties
    private Leaf leaf;
    private ArrayList<Leaf> leaves;
    //endregion

    //region Constructors
    public Tree() {
    }

    public Tree(Leaf leaf, ArrayList<Leaf> leaves) {
        this.leaf = leaf;
        this.leaves = leaves;
    }

    //endregion

    //region Public Methods
    public void bloom() {
        System.out.println("The tree is blooming");
    }

    public void makeLeafsYellow() {
        for (int i = 0; i < leaves.size(); i++) {
            leaves.get(i).setColor("Yellow");
        }
        System.out.println("All leaves are Yellow");
    }

    public void makeLeafsFall() {
        for (int i = 0; i < leaves.size(); i++) {
            leaves.remove(i);
        }
        System.out.println("The tree dont have leaves");
    }
    //endregion

    //region Getters and Setters

    public Leaf getLeaf() {
        return leaf;
    }

    public void setLeaf(Leaf leaf) {
        this.leaf = leaf;
    }

    public ArrayList<Leaf> getLeaves() {
        return leaves;
    }

    public void setLeaves(ArrayList<Leaf> leaves) {
        this.leaves = leaves;
    }

    //endregion

    //region  equals hashcode and toString

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tree tree = (Tree) o;

        if (leaf != null ? !leaf.equals(tree.leaf) : tree.leaf != null) return false;
        return leaves != null ? leaves.equals(tree.leaves) : tree.leaves == null;
    }

    @Override
    public int hashCode() {
        int result = leaf != null ? leaf.hashCode() : 0;
        result = 31 * result + (leaves != null ? leaves.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "leaf=" + leaf +
                ", leaves=" + leaves +
                '}';
    }
//endregion
}
