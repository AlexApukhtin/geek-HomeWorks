package ru.gb.personal;

public class Person {

    private String name, post, email, phone;
    private int salary, age;

    Person(String name, String post, String email, String phone, int salary, int age){
        setName(name);
        setPost(post);
        setEmail(email);
        setPhone(phone);
        setSalary(salary);
        setAge(age);
    }

    void print(){
        System.out.printf("Сотрудник: %s,\nДолжность: %s,\nЭл.почта: %s,\nМоб.телефон: %s,\nЗарплата: %d,\nВозраст: %d\n\n", name, post, email, phone, salary, age);
    }

    void setSalary(int salary){
        if (salary > 0){
            this.salary = salary;
        }else{
            System.out.println("Зарплата сотруднику не назначена");
        }
    }

    void setAge(int age){
        if(age < 14){
            System.out.println("Некорректный ввод||Слишком молодой отказано в приеме на работу");
        }else{
            this.age = age;
        }
    }

    void setName(String name){
        if(name.length()>0)this.name = name;
    }

    void setPost(String post){
        if(post.length()>0)this.post = post;
    }

    void setEmail(String email){
        if(email.length()>0)this.email = email;
    }

    void setPhone(String phone){
        if(phone.length() == 15){
            this.phone = phone;
        }else{
            System.out.println("Введите номер телефона в формате 8-123-456-78-90");
        }
    }

    public int getAge(){
        return this.age;
    }
}