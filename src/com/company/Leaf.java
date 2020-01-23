package com.company;

public class Leaf {
    //region Properties
    private String color;
    //endregion

    //region Constructors
    public Leaf() {
    }

    public Leaf(String color) {
        this.color = color;
    }
    //endregion

    //region Getters and Setters

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //endregion

    //region  equals hashcode and toString

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Leaf leaf = (Leaf) o;

        return color != null ? color.equals(leaf.color) : leaf.color == null;
    }

    @Override
    public int hashCode() {
        return color != null ? color.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Leaf{" +
                "color='" + color + '\'' +
                '}';
    }
    //endregion
}
