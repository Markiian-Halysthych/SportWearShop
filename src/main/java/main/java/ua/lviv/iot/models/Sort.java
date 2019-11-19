package main.java.ua.lviv.iot.models;

public class Sort extends Wear {

    public static void sortByPercentageOfCotton(Wear[] arrWearCotton) {
        for (int i = 0; i < arrWearCotton.length; i++) {
            Wear num = arrWearCotton[i];
            for (int j = i - 1; j >= 0; j--) {
                Wear leftNumber = arrWearCotton[j];
                if (num.getPercentageOfCotton() < leftNumber.getPercentageOfCotton()) {
                    arrWearCotton[j + 1] = leftNumber;
                    arrWearCotton[j] = num;
                } else {
                    break;
                }
            }
        }
    }
    void sortByPercentageOfCottonUp(Wear[] arrWearCottonUp) {
        for (int i = 0; i < arrWearCottonUp.length - 1; i++) {
            for (int j = 0; j <arrWearCottonUp.length - i - 1; j--) {
                if (arrWearCottonUp[j].getPercentageOfCotton() < arrWearCottonUp[j + 1].getPercentageOfCotton()){
                    Wear swap = arrWearCottonUp[j + 1];
                    arrWearCottonUp[j + 1] = arrWearCottonUp[j];
                    arrWearCottonUp[j] = swap;
                }
            }
        }
    }
    public static void sortByPrice(Wear[] arrWearPrice) {
        for (int i = 0; i < arrWearPrice.length; i++) {
            Wear num = arrWearPrice[i];
            for (int j = i - 1; j >= 0; j--) {
                Wear leftNumber = arrWearPrice[j];
                if (num.getPrice() < leftNumber.getPrice()) {
                    arrWearPrice[j + 1] = leftNumber;
                    arrWearPrice[j] = num;
                } else {
                    break;
                }
            }
        }
    }
}
