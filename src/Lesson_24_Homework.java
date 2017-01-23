/**
 //Массивы - места где лежат много интов
 //Если массив имеет размер 10, но мы нем можем
 // хранить в нем больше элементов

 //Хранилище будет иметь возможность
 //хранить переменное число элементов
 //1)Добавить элемент в хвости хранилища++
 //2)Получить элемент по номеру из хранилища++
 //3)Узнать сколько элементов сейчас в хранилище++
 //4)Удалить по индексу++
 //5)Удалить по значению (если есть повторное то удалить одно)++
 //6)Удалить все по значению (все повтороные)++
 //7)Метод int есть ли такое значение(возвращает индекс) если нет то -1 ++
 //8)Метод добавить массив (принимает инт массив)++
 //9)Метод добавить другое хранилище (принимает хранилище)
 //у нас их два.
 //10)метод у одного хранилища который принимает второе хранилище
 //и возвращает третье хранилище в коротом лежат элементы
 //котоые есть и в первом и во втором


 //Хранилище интов
 public class WarehouseForInt {
 private int size; //сколько элементов у меня сейчас
 private int[] array;//место где мы храним инты

 public WarehouseForInt(int capacity){
 size = 0;
 array = new int[capacity];
 }

 public WarehouseForInt() {
 size = 0;
 array = new int[5];//Создадим место для наших будущих интов
 }


 public void add(int newValue) {
 if (size == array.length) {
 System.out.println("Тяжелый коТ");
 int[] newArray = new int[size * 2];
 for (int i = 0; i < size; i++)
 newArray[i] = array[i];
 array = newArray;
 }
 array[size] = newValue;
 size++;
 }

 public int getByIndex(int index) {
 return array[index];
 }

 public int count() {
 return size;
 }

 //удаление элемента по номеру
 public void removeByIndex(int index) {
 for (int i = index; i < size - 1; i++)
 array[i] = array[i + 1];
 size--;

 if (size * 3 <= array.length) {
 System.out.println("Кот на диете");
 int[] newArray = new int[array.length / 2];
 for (int i = 0; i < size; i++)
 newArray[i] = array[i];
 array = newArray;
 }
 }

 //СЛУЖЕБНОЕ ПОЛЕ, нам для обучения надо знать его значение
 //в реальной жизни неважно сколько там свободного места
 //это внутренняя кухня хранилища
 public int getRealSize() {
 return array.length;
 }
 //ctrl + alt + l  == красивый код
 }

 */


public class Lesson_24_Homework {
}
