package poly;

public class ProductMain {

    public static void main(String[] args) {

        Beauty beauty = new Beauty("쿠션",25000,1);

        Grocery grocery = new Grocery("소금", 40000,5);

        LargeAppliance largeAppliance  = new LargeAppliance("쇼파",200000, 20);

        System.out.println(beauty.getDeliveryCharge(beauty.getWeight(), beauty.getPrice()));

        System.out.println(grocery.getDeliveryCharge(grocery.getWeight(), grocery.getPrice()));
        
        System.out.println(largeAppliance.getDeliveryCharge(largeAppliance.getWeight(), largeAppliance.getPrice()));

    }


}
