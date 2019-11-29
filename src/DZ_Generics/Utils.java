package DZ_Generics;

//Часть 2
//Создать (или использовать класс из ДЗ Enum) класс Utils,
//не имеющий дженерика в объявлении класса (в методах можно).
public class Utils extends Box {
    //В классе Utils создать метод, который принимает любой объект и возвращает коробку с этим объектом.
    public <T> Box giveMePleaseBoxWithThisObject(T anyObj) {
        Box box = new Box();
        box.putAnything(anyObj);
        return box;
    }
    //В классе Utils создать метод, который принимает три любых объекта и возвращает один (случайный) из переданных.

    public static  <T> T getRandomObject(T firstObj, T secondObj, T thirdObj) {

        final int max = 2;
        final int rnd = rnd(max);
        switch (rnd) {
            case 0:
                return firstObj;
            case 1:
                return secondObj;
            case 2:
                return thirdObj;
            default:
                System.out.println("Этого не могло произойти");
                return null;
        }
    }

    public static int rnd(int max) {
        return (int) (Math.random() * ++max);
    }

    public static void main(String[] args) {
        System.out.println(getRandomObject(1, "тринадцать", 2.68));
    }
}