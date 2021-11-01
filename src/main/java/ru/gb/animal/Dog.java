package ru.gb.animal;

public class Dog extends Animal{

    public Dog(String name, int run, int swim) {
        super(name, run, swim);
    }

    @Override
    public void setRun(int run) {
        if(run<= 500 && run>=0){
            this.run = run;
        }else if(run>500){
            this.run = 500;
            System.out.println("Некоректное условие для собаки. run = " + run + " присвоилось значение 500м");
        }else{
            System.out.println("run = " +run + " должно быть положительным!");
        }
    }

    @Override
    public void setSwim(int swim) {
        if(swim <= 10 && swim>= 0){
            this.swim = swim;
        }else if (swim>10){
            System.out.println("Некоректное условие для собаки. swim = " + swim + " присвоилось значение 10м");
            this.swim = 10;
        }else{
            System.out.println("swim = " +swim + " должно быть положительным!");
        }

    }

    @Override
    public void print(int score) {
        if (run > 0 && run <= 500 && swim > 0 && swim <= 10) {
            System.out.printf("%s пробежала %d м., проплыла %dм.\n", name, run, swim);
        } else {
            System.out.println("У собаки " + score + " неверно заданы параметры!");
        }
    }
}

