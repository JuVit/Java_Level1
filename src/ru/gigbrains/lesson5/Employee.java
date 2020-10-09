package ru.gigbrains.lesson5;

public class Employee
{
    String fio;
    String position;
    String email;
    String telephone;
    int age;
    int salary;

    Employee (String fio, String position, String email, String telephone, int age, int salary) {
                this.fio = fio;
                this.position = position;
                this.email = email;
                this.telephone = telephone;
                this.age = age;
                this.salary = salary;
    }
    @Override
    public String toString()
    {
        return "Сотрудник { "
                + " ФИО = " + fio
                + ", Возраст = " + age
                + ", Должность = " + position
                + ", E-mail = " + email
                + ", Телефон = " + telephone
                + ", Зарплата = " + salary
                + " }";
    }
    public void print()
    {
        System.out.println(this);
    }

}
