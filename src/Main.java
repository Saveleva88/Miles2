public class Main {
        public static void main(String[] args) {
            BonusMilesService service = new BonusMilesService();
            int price = 10_000;
            int cost = 20;
            int miles = price / cost;

            System.out.println(miles + "мили");
        }

    }
