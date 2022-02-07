public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);

//        public class Main {
//            public static void main(String[] args) {
//                int price = 3298;
//                int mile = 20;
//                int total = price / mile;
//                System.out.println(total);
//            }
//        }

    }
}