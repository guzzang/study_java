package poly;

public abstract class BaseDeliveryChargeStore {

    public static int getBaseDeliveryCharge(double weight){
        int deliveryCharge = 0;
        if (weight < 3) deliveryCharge = 1000;
        else if (3 < weight && weight < 10) deliveryCharge = 5000;
        else deliveryCharge = 10000;
        return deliveryCharge;
    }

}
