
public class Lesson_19 {
//Тема: Класс  (составные типы данных)
//Класс часто является ПОЛЬЗОВАТЕЛЬСКИМ типом данных
//"ТИП ДАННЫХ СОЗДАННЫЙ ПРОГРАММИСТОМ" -
//ООП - подход к программированию когда мы мыслим
//объектами, их классификацией и действиями
//которые эти объект могу делать

//В реально жизни мы делаем ДЕЙСТВИЯ над
//объектами  - дом, стул, сообщение, звонок, человек
// алгоритм, событие, друг, животное

//Существительное

//Чтобы описать некоторый объект необходимо
//выбрать параметры, по которым мы описываем
//этот объект.


//Пример: Класс Холодильник
//int x,y,z; размеры
//double power; мощность
//bool noFrost; +- функциип noFrost
//float m;  масса
//String color; цвет
//int db;  уровень шума
//float price; стоимость
//...

//Холодильник, который стоит на кухне, белый,
//2013 года выпуска ---ВЕЩЬ, КОТОРУЮ МОЖНО ПОТРОГАТЬ
//КОНКРЕТНЫЙ ОБЪЕКТ

//Класс "Холодильник" -- идея о том, как можно описать
//любой холодильник на планете -- АБСТРАКЦИЯ для классификации

//Класс -- идея о том как мы можем что то описать
//Объект класса -- КОНКРЕТАНЯ ШТУКА описанная по тому шаблону


//ООП
//Класс
//Объект класса


//опишите свой класс
//возьмите любой объект,
//создайте для него класс
//создайте пару объектов этого класса
//напишите функцию вывода на экран
//функцию сортировки
//фукнцию поиска (найти тетрадь с 10 страница)

//





        public static class Notebook {
            public int pageCount;
            public String format;
            public double price;
            public String color;
        }

        public static void showInfoAboutNotebook(Notebook nb) {
            System.out.println("кол-во страниц: " + nb.pageCount);
            System.out.println("Ф0рмат: " + nb.format);
            System.out.println("Цена: " + nb.price);
            System.out.println("Цвет: " + nb.color);

        }

        public static void main(String[] args) {


            Notebook[] arrayNote = new Notebook[4];
            arrayNote[0] = new Notebook();
            arrayNote[0].pageCount = 12;
            arrayNote[0].format = "A5";
            arrayNote[0].price = 0.10;
            arrayNote[0].color = "green";


            arrayNote[1] = new Notebook();
            arrayNote[1].pageCount = 48;
            arrayNote[1].format = "A4";
            arrayNote[1].price = 0.70;
            arrayNote[1].color = "blue";


            arrayNote[2] = new Notebook();
            arrayNote[2].pageCount = 100;
            arrayNote[2].format = "A4";
            arrayNote[2].price = 1.9;
            arrayNote[2].color = "black";


            Notebook notebook = new Notebook();

            notebook.pageCount = 1;
            notebook.format = "A6";
            notebook.price = 2.5;
            notebook.color = "red";
            arrayNote[3] = notebook;

            for (int i = 0; i < arrayNote.length; i++)
                showInfoAboutNotebook(arrayNote[i]);


        }


        public static class Refrigerator {
            public int x, y, z; //поле класса
            public double power;//поле класса
            public boolean noFrost;//поле класса
            public float m;//поле класса
            public String color;//поле класса
            public int db;//поле класса
            public float price;//поле класса
        }

        //В С++ класс у которого все поля публичны
        //называется СТРУКТУРА


        public static void showInfoAboutFrige(Refrigerator r) {
            System.out.println("Цвет: " + r.color);
            System.out.println("Масса: " + r.m);
            System.out.println("Ширина: " + r.x);

        }

        public static void main234234(String[] args) {
            Refrigerator[] array = new Refrigerator[3];
            //заполнить массив
            //отсортировать по некоторому критерию

            //функция принимает массив объектов и значение
            //возвращает объект с этим значением


            Refrigerator f1 = new Refrigerator();
            Refrigerator f2 = new Refrigerator();
            Refrigerator f3 = new Refrigerator();
            f1.color = "red";
            f1.m = 34;
            f1.x = 345;

            f2.color = "purple";
            f2.m = 4;
            f2.x = 3545;

            f3.color = "blue";
            f3.m = 12;
            f3.x = 56;

            showInfoAboutFrige(f1);
            showInfoAboutFrige(f2);
            showInfoAboutFrige(f3);
        }


        //byte short int long float double char boolean
        //String
        //Refrigerator

    }

