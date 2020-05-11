package data;

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
