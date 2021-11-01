package ru.gb.personal;

public class Main {

    public static void main(String[] args) {

        Person[] pers = new Person[5];
        pers[0] = new Person("Пополитова Ирина", "Специалист-консультант", "popolitova@orticongroup.ru","8-951-553-31-08",60000,28);
        pers[1] = new Person("Сычёва Юлия","Аналитик", "sycheva@orticongroup.ru","8-919-776-15-73",80000, 52);
        pers[2] = new Person("Калашников Алексей","Программист", "kalashnikov@orticongroup.ru", "8-985-823-44-82", 100000,  46);
        pers[3] = new Person("Лукьянов Павел", "Сист. Администратор","Lukyanov@orticongroup.ru", "8-977-803-34-23", 80000, 31);
        pers[4] = new Person("Власова Дарья", "Секретарь","VlasovaD@orticongroup.ru", "8-903-584-64-40", 50000,34);
        int score = 0;
        for (int i = 0; i < pers.length; i++) {
            if(pers[i].getAge()> 40){
                score++;
                pers[i].print();
            }
            //pers[i].print();
        }
        System.out.println("Кол-во сотрудников возрастом более 40 лет: " + score);
    }
}
