package ru.gb.animal;

public class Main {

    public static void main(String[] args) {

        Animal[] dog = new Dog[3];
        Animal[] cat = new Cat[3];
        Animal[] other = new Other[2];
        dog[0] = new Dog("Моника", 400,6);
        dog[1] = new Dog("Софа", 600, 5);
        dog[2] = new Dog("Криш", 300, 12);

        cat[0] = new Cat("Барсик", 250,0);
        cat[1] = new Cat("Мурзик", 100,2);
        cat[2] = new Cat("Муся", 140,0);

        other[0] = new Other("Кеша",50,0,"Попугай");
        other[1] = new Other("Эдик",20,2,"Хорёк");
        int dogScore = 0;
        int catScore = 0;
        int otherScore = 0;
        //printAnimal(dog[], dogScore);
        // printAnimal(cat[], catScore);

        for (int i = 0; i <dog.length; i++) {
            dogScore++;
            dog[i].print(dogScore);
        }
        System.out.println("Всего собак: "+ dogScore);

        for (int i = 0; i <cat.length; i++) {
            catScore++;
            cat[i].print(catScore);
        }
        System.out.println("\nВсего кошек: " + catScore);
        System.out.println();

        for (int i = 0; i < other.length; i++) {
            otherScore++;
            other[i].print(otherScore);
        }
        System.out.println("Остальных животных: "+ otherScore);
        System.out.println("Всего животных: " + (catScore + dogScore+ otherScore));
    }
}
