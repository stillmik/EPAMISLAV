package by.neuhen.task01javabasic.controller;
import by.neuhen.task01javabasic.view.TaskManagerInputImpl;

public class Main {
    public static void main(String[] args) {
        //Найдите значение функции: z = ( (a – 3 ) * b / 2) + c

        //Найдите значение функции: с = 3 + а.

        //Найти произведение цифр заданного четырехзначного числа.

        //Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого
        // куба.

        //Три сопротивления R1 R2, и R3 соединены параллельно. Найдите сопротивление соединения
        // 2 4 16 18 30
        var taskManager =new TaskManager(new TaskManagerInputImpl());
        taskManager.run();
    }
}
