package ru.gb.eatCat;

public class Main {
    private static int catEat;

    public static void main(String[] args) {
        final int numberOfMeals = 5;
        Cat[] cat = new Cat[]{
                new Cat(NameCat.BASYA.name()),
                new Cat(NameCat.MURZIK.name()),
                new Cat(NameCat.VASYA.name()),
                new Cat(NameCat.MAYKA.name()),
                new Cat(NameCat.TIMOFHEY.name())
        };
        Plate plate = new Plate(50);

        for(int j = 0; j < numberOfMeals; ++j) {
            for(int i = 0; i < cat.length; ++i) {
                catEat++;
                plate.inspectionFood(plate,cat[i]);
                plate.getBagEat();
                if(plate.getBagEat() == 0 && plate.getFood()< cat[i].getAppetite()){
                    j = numberOfMeals;
                    break;
                }
            }
        }
        System.out.print("Котов поело: "+ Cat.getCountEat());
        System.out.println(". Подходило к миске: "+ catEat);
        if(Cat.getCountEat() != cat.length * numberOfMeals) System.out.println("Еда кончилась, коты не наелись!");
    }
}

