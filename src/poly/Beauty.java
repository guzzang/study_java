package poly;

public class Beauty extends Product implements DeliveryChargeCalculator{

    public Beauty(String name, int price, int weight) {
        super(name, price, weight);
    }

    @Override
    public int getDeliveryCharge(int weight, int price) {

        if (price < 30000){
            return BaseDeliveryChargeStore.getBaseDeliveryCharge(weight);
        } else if (30000 < price && price < 100000) {
            return BaseDeliveryChargeStore.getBaseDeliveryCharge(weight) - 1000;
        }else {
            return 0;
        }

    }


}


