package ru.gb.animal;

public abstract class Animal {

    protected String name;
    protected int run;
    protected int swim;
    protected String view;

    public Animal(String name,int run, int swim){
        setName(name);
        setRun(run);
        setSwim(swim);
    }

    public abstract void print(int score);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() != 0) this.name = name;
    }

    protected int getRun() {
        return run;
    }

    public abstract void setRun(int run);

    public int getSwim() {
        return this.swim;
    }

    public abstract void setSwim(int swim);

}
