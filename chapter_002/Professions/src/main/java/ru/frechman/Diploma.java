package ru.frechman;

public class Diploma {
    private final String diploma;

    public Diploma(String diploma) {
        this.diploma = diploma;
    }

    @Override
    public String toString() {
        return diploma;
    }
}
