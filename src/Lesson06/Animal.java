package Lesson06;

public class Animal {
    protected String name;
    private int run_limit;
    private int swim_limit;
    Animal(String name, int run_limit, int swim_limit) {
        this.name = name;
        this.run_limit = run_limit;
        this.swim_limit = swim_limit;
    }
    String getName() {
        return this.name;
    }
    protected boolean run(int distance) {
        return distance <= run_limit;
    }
    protected boolean swim(int distance) {
        return distance <= swim_limit;
    }
}
