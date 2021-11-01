package ru.gb.animal;

public class Cat extends Animal {
    public Cat(String name, int run, int swim) {
        super(name, run, swim);
    }

    @Override
    public void setRun(int run) {
        if( run <= 200 && run >=0){
            this.run = run;
        }else if(run>200){
            this.run = 200;
            System.out.println("Некоректное условие для кошки. run =  " + run + " присвоилось значение 200м\n");
        }else{
            System.out.println("run = " +run + " должно быть положительным!\n");
        }
    }

    @Override
    public void setSwim(int swim) {
        //if(swim != 0){
        this.swim = swim;
        //System.out.println("Кошки не плавают!\n");
        // }
    }

    @Override
    public void print ( int score){
        if (run > 0 && run <= 200) {
            System.out.printf("\n%s пробежала %d м.", name, run);
            if( swim != 0) System.out.print(" Кошки не плавают!");
        } else {
            System.out.print("\nУ кошки " + score + " неверно заданны параметры!");
        }
    }
}
