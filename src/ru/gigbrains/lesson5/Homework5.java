package ru.gigbrains.lesson5;

public class Homework5 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] =new Employee("Иванов Иван Иванович", "Разработчик" , "ivan@ir.ru", "23-45-66", 30, 300000);
        employees[1] =new Employee("Петров Петр Петрович", "Тестировщик" , "petr@ir.ru", "55-77-08", 22, 50000);
        employees[2] =new Employee("Сидорова Екатерина Дмитриевна", "Аналитик" , "katya@ir.ru", "23-08-90", 43, 500000);
        employees[3] =new Employee("Сорокина Ирина Александровна", "Тестировщик" , "ira@ir.ru", "32-67-12", 32, 80000);
        employees[4] =new Employee("Петрыкина Ольга Алексеевна", "Разработчик" , "olga@ir.ru", "10-32-61", 45, 400000);

        System.out.println("Сотрудники старше сорока лет:");
        for (int i = 0; i < employees.length; i++)
        {
            if (employees[i].age>40)
            {
                employees[i].print();
            }
        }
    }

}
