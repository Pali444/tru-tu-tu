public class main {
    public static void main(String[] args) {
        weight = 3000;
        name = "Barsik";
        age = 1;
        color = "Grey";
    }

    //Конструктор, принимающий параметры
    public Cat(double weight1, String name1, int age1, String color1) {
        /* как видно, мы создали новые переменные и указали их тип прямо в скобках, описывающих, какие именно переменные будут передаваться этой функции, когда мы будем её использовать. Обратите внимание, что именно значения этих переменных (например, name1) потом передаются полям класса (например, name)*/
        weight = weight1;
        name = name1;
        age = age1;
        color = color1;
    }

    }
}
