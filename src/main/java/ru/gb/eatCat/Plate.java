package ru.gb.eatCat;

import java.util.Scanner;

public class Plate {
    private int food;
    private int bagEat = 50;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return this.food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void decreaseFood(int food) {
        this.food -= food;
    }

    public int getBagEat() {return this.bagEat;}

    public int addFood(int food) {
        Scanner sc = new Scanner(System.in);
        int addFood = sc.nextInt();
        if (this.bagEat >= addFood) {
            this.bagEat -= addFood;
            System.out.println("Еды в коробке осталось " + this.bagEat);
            food += addFood;
            if(this.bagEat == 0){
                getBagEat();
            }
            return food;
        } else {
            System.out.println("Высыпали остатки " + this.bagEat + ". Больше нет!");
            food += this.bagEat;
            this.bagEat = this.bagEat - this.bagEat;
            return food;
        }
    }

    public void inspectionFood(Plate plate,Cat cat){
        if(getFood()>= cat.getAppetite()){
            System.out.println(cat.haveEat(plate,cat));
        }else if(getBagEat() >=0 && getFood()< cat.getAppetite()){
            System.out.println(cat.notEat(plate));
        }
    }

    public String toString() {
        return "Plate remained food= ";
    }
}
