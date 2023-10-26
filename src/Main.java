public class Main {
    public static void main(String[] args) {

        String[] flowers = {"Krizantēmas", "Dālijas", "Asteres", "Gladiolas", "Hiperikum", "Fizālis", "Gloriosa"};
        //for loop
        for (int i = 0; i < flowers.length; i++) {
            System.out.println(flowers[i]);
        }
        //for each loop
        for (String flower : flowers) {
            System.out.println(flower);
        }

        int YearofRabbit[] = {1915, 1927, 1939, 1951, 1963, 1975, 1987, 1999, 2011, 2023};
        //for each loop
        for (int year : YearofRabbit) {
            System.out.println(year);
        }
        //for loop
        for (int i = 0; i < YearofRabbit.length; i++) {
            System.out.println(YearofRabbit[i]);
        }
    }
}