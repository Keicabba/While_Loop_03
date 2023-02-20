package it.figuccia;

public class Start {
    public static void main(String[] args) {
        int a = 0, b = 1, c = 0, i = 0, count = 10;
        while (i < count) {
            a = b;
            b = c;
            System.out.println(c);
            c = a + b;
            i++;
        }
    }
}
