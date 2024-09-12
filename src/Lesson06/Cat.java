package Lesson06;

public class Cat extends Animal{

        Cat(String name,int run_limit, int swim_limit) {
            super(name, run_limit, swim_limit);
        }
        @Override
        protected boolean swim(int distance) {
            return false;
        }
    }
