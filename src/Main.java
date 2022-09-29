public class Main {
    public static void main(String[] args) {
        String companyNim = "Apple";
        System.out.println("Крутое компание" + companyNim);

        final int numberOfToys = 10;
        System.out.println("Число игрушек" + numberOfToys);

        String myHouse = "big";
        System.out.println(myHouse);

        if (numberOfToys <= 5) { // false
            System.out.println("toys not for sale");
        } else { // иначе
            System.out.println("toys will stop at the store");
        }
    }
}
