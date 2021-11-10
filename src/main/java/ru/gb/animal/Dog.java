package ru.gb.animal;

public class Dog extends Animal{

    private static int trueDog;
    public Dog(String name, int run, int swim) {
        super(name, run, swim);
    }

    @Override
    public void setRun(int run) {
        if(run>=0){
            this.run = run;
//        }else if(run>500){
//            this.run = 500;
//            System.out.println("Превышение норматива у собаки. run = " + run + " присвоилось значение 500м");
        }else{
            System.out.println("run = " +run + " должно быть положительным!");
        }
    }

    @Override
    public void setSwim(int swim) {
        if( swim>= 0){
            this.swim = swim;
//        }else if (swim>10){
//            System.out.println("Превышение норматива у собаки. swim = " + swim + " присвоилось значение 10м");
//            this.swim = 10;
        }else{
            System.out.println("swim = " +swim + " должно быть положительным!");
        }

    }

    @Override
    public void print(int score, int length) {
        if (run > 0 && run <= 500 && swim > 0 && swim <= 10) {
            trueDog++;
            System.out.printf("%s пробежала %d м., проплыла %dм.\n", getName(), getRun(), getSwim());
        }
        if(run>500){
            System.out.println("Собаки("+score+") столько не бегают.run = "+ run + " присвоилось значение 500м");
            this.run = 500;
        }
        if(swim>10){
            System.out.println("Собаки("+score+") столько не плавают. swim = " + swim + " присвоилось значение 10м");
            this.swim = 10;
        }
        if(score == length) System.out.println("Кол-во правильных собак: " + trueDog);
    }
}

