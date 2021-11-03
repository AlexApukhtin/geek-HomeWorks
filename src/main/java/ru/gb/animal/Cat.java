package ru.gb.animal;

public class Cat extends Animal {

    private static int trueCat;
    public Cat(String name, int run, int swim) {
        super(name, run, swim);
    }

    @Override
    public void setRun(int run) {
        if(run >=0){
            this.run = run;
        }else if(run>200){
            this.run = 200;
            System.out.println("Превышение норматива у кошки. run =  " + run + " присвоилось значение 200м\n");
        }else{
            System.out.println("run = " +run + " должно быть положительным!\n");
        }
    }

    @Override
    public void setSwim(int swim) {
        //if(swim != 0){
        this.swim = swim;
    }

    @Override
    public void print ( int score, int length){
        if (run > 0 && run <= 200 && swim == 0) {
            trueCat++;
            System.out.printf("%s пробежала %d м.\n", name, run);
            //if( swim != 0) System.out.print(" Кошки не плавают!");
        }
        if(swim>0) System.out.println("Кошки(" +score+ ") не плавают!");
        if(run>200){
            System.out.println("Кошки("+score+") столько не бегают.run = "+ run + " присвоилось значение 200м");
            this.run = 200;
        }
        if(score == length) System.out.println("Кол-во правильных кошек: " + trueCat);
    }
}
