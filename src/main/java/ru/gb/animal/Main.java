package ru.gb.animal;

public class Main {

    public static void main(String[] args) {

        Animal[] dog = {
                new Dog("Моника", 400,6),
                new Dog("Софа", 300, 5),
                new Dog("Криш", 600, 12),
        };
        Animal[] cat = {
                new Cat("Барсик", 250,0),
                new Cat("Мурзик", 100,2),
                new Cat("Муся", 140,0),
        };
        Animal[] other = {
                new Other("Кеша",50,0,"Попугай"),
                new Other("Эдик",20,2,"Хорёк"),
        };
        int dogScore = 0;
        int catScore = 0;
        int otherScore = 0;
        //printAnimal(dog[], dogScore);
        // printAnimal(cat[], catScore);

        for (int i = 0; i <dog.length; i++) {
            dogScore++;
            dog[i].print(dogScore, dog.length);
        }
        System.out.println("Всего собак: "+ dogScore);
        System.out.println();

        for (int i = 0; i <cat.length; i++) {
            catScore++;
            cat[i].print(catScore, cat.length);
        }
        System.out.println("Всего кошек: " + catScore);
        System.out.println();

        for (int i = 0; i < other.length; i++) {
            otherScore++;
            other[i].print(otherScore, other.length);
        }
        System.out.println("Остальных животных: "+ otherScore);
        System.out.println("Всего животных: " + (catScore + dogScore+ otherScore));
    }
}
