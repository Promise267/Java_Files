package Practice3;

public class DiscountRate {
    //declaring initialized static variables
    private static double serviceDiscountPremium = 0.2;
    private static double serviceDiscountGold = 0.15;
    private static double serviceDiscountSilver = 0.1;
    private static double productDiscountPremium = 0.1;
    private static double productDiscountGold = 0.1;
    private static double productDiscountSilver = 0.1;

    //function to check type of membership for bought services
    public static double getServiceDiscountRate(String type){
        double rate = switch (type.toUpperCase()) {
            case "PREMIUM" -> serviceDiscountPremium;
            case "GOLD" -> serviceDiscountGold;
            case "SILVER" -> serviceDiscountSilver;
            default -> 1;
        };
        return rate;
    };
    //function to check type of membership for bought products
    public static double getProductDiscountRate(String type){
        double rate = switch (type.toUpperCase()) {
            case "PREMIUM" -> productDiscountPremium;
            case "GOLD" -> productDiscountGold;
            case "SILVER" -> productDiscountSilver;
            default -> 1;
        };
        return rate;
    };
}
