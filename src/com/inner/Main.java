package com.inner;

public class Main {

    int y;
    class NonStaticClass {
        public void nonStaticTest() {
            System.out.println("Test from non-static inner class (non-static test)");
        }
    }

    static int x;
    static class StaticClass {
        public static void test() {
            System.out.println("Test from static inner class (static test)");
        }

        public void nonStaticTest() {
            System.out.println("Test from non-static inner class (non-static test)");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.y);
        NonStaticClass nonStaticClass = main.new NonStaticClass();
        nonStaticClass.nonStaticTest();

        System.out.println(Main.x);
        StaticClass.test();
        StaticClass staticClass = new StaticClass();
        staticClass.nonStaticTest();
    }
}
