package ru.frechman.start;

public interface Input {

    String ask(String question);

    int ask(String question, int[] range);
}
