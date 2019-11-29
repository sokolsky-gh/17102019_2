package DZ_Generics;


//Часть 1
//Создать класс Box (коробку) с дженериком, указывающий на тип объекта, который в эту коробку можно положить.
public class Box<T> {
    T anything;

    //Данный класс имеет три метода:
//1. Положить в коробку
    void putAnything(T anything) {
        if (this.anything != null) {      //проверка наличия/отсутствия объекта в коробке.
            this.anything = anything;
        } else System.out.println("Занято!");
    }

    //2. Забрать из коробки
    T getAnything() {
        if (this.anything != null) {      //проверка наличия/отсутствия объекта в коробке.
            return anything;
        } else System.out.println("Ларчик пуст!");
        return null;
    }

    //3. Удалить из коробки
    void removeAnything() {
        this.anything = null;
    }

}


//BONUS:
// Чтобы при использовании методов родителя в любом наследнике
// они также возвращали экземпляр наследника,
// что позволит писать сеттеры цепочкой, независимо от их порядка.