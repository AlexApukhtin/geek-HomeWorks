package ru.gb.animal;

public class Other extends Animal {

    public Other(String name, int run, int swim, String view) {
        super(name, run, swim);
        setView(view);

    }

    public void setView(String view) {
        if (view.length() != 0) this.view = view;
    }

    @Override
    public void setRun(int run) {
        this.run = run;
    }

    @Override
    public void setSwim(int swim) {
        this.swim = swim;
    }

    @Override
    public void print(int score) {
        System.out.printf("Это %s. %s пробежал %dм. и проплыл %dм.\n", view, name, run, swim);
    }
}
