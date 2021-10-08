package Lesson06;

public class HomeWork06 {

    public static void main(String[] args) {
        Cat cat1 = new Cat("кот Рыжик", 200, 1);
        Cat cat2 = new Cat("кот Барсик", 180, 2);
        Dog dog1 = new Dog("пес Дима", 500, 10);
        Dog dog2 = new Dog("пес Вася", 600, 20);

        Animal[] animal = {cat1, cat2, dog1, dog2};
        for (Animal an : animal)
            System.out.println(
                    an.getName() +
                            "\nБежать: " + an.run(200) +
                            "\nПлыть: " + an.swim(5));
    }
}