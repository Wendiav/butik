public class Main {
    public static void main(String[] args) {
        int numberOfIphone14 = 270;
        int numberOfPlayStation5 = 50;
        int numberOfSamsung23 = 399;
        int allProducts = numberOfIphone14 + numberOfPlayStation5 + numberOfSamsung23;
        System.out.println("---TEKNOLOGI---");
        System.out.println("Iphone14: " +numberOfIphone14 +"st.");
        System.out.println("Samsung23: " +numberOfSamsung23 +"st.");
        System.out.println("PlayStation5: "+numberOfPlayStation5 +"st.");
        System.out.println("Total produkter i Butik: " + allProducts);
        numberOfIphone14 -= 7;
        allProducts = numberOfIphone14 + numberOfPlayStation5 + numberOfSamsung23;
        System.out.println("Total produkter efter första köp: " + allProducts);
        numberOfPlayStation5 -=19;
        allProducts = numberOfIphone14 + numberOfPlayStation5 +numberOfSamsung23;
        System.out.println("Total produkter edter andra köp: " +allProducts);
        numberOfPlayStation5 -= 39;
        numberOfSamsung23 -= 214;
        allProducts = numberOfIphone14 + numberOfPlayStation5 + numberOfSamsung23;
        System.out.println("Det finns " + allProducts + " varor kvar i butiken.");
        boolean differentAmount = numberOfIphone14 > numberOfSamsung23;
        System.out.println("Det finns inte lika många Iphone som samsung: " + differentAmount);
    }
}
