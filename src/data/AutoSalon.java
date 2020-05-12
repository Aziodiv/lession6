package data;
//Склад-магазин вместимостью до 6 автомобилей,
// который может хранить и продавать автомобили, а так же накапливать деньги в кассе.
//1. Реализовать класс автомобиль у которго есть:
// цвет (может быть - Красный, белый, черный)
// применить константы(подумать какого типа они должны быть) ),
// вес (от 1200 до 2500 кг)
// и цена (от 80 000 до 400 000).
// Реализуйте в классе конструктор в котором все параметы автомобиля должны gerirovatsja randomno!.
// Инкапсулируйте свойства класса так чтоб небыло возможности
// ввести некорректные данные(проверка в конструкторе+сеттеры).


//2. Реализуйте класс AutoSalon, который может хранить максимум 5 автомобилей.
// Склад магазин должен знать сколько автомобилей у него храниться .
//3. Реализуйте метод "добавить автомобиль на склад" который добавляет автомобиль,
// и в случае если все места заняты просит продать какой то из автомобилей на складе.
// Под добавлением автомобиля подразумевается покупка за деньги,
// которы имеются в кассе и размешение его на любом первом попавшемся свободном месте.




public class AutoSalon {
    private static final int CAR_QUANTITY = 5;
    private static final double INTEREST = 0.2;

    private Auto[] places;
    private long balance;



    public AutoSalon(long balance) {
        this.balance = balance;
        places = new Auto[CAR_QUANTITY];
    }




    public void buyAuto(Auto auto) {
        this.balance = this.balance - auto.getPrice();
        int freePlace = getFreePlace();
        if (freePlace < 0) {
            System.out.println("No free places, sell Auto");
            return;
        }
        places[0] = auto;
    }



    private int getFreePlace() {
        for (int i = 0; i < places.length; i++) {
            if (places[i] == null) {
                return i;
            }
        }
        return -1;
    }




///////////////////
    public Auto sellAuto() {
        //TODO HOMEWORK
        return null;
    }

    public void prinReport(){

    }
    //TODO HW
    //Place-price






}
