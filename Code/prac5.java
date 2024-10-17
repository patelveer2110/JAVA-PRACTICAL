public class prac5 {
    public static void main(String[] args) {
        float price[] = { 100, 200, 300, 400, 500 };
        int code[] = { 1, 2, 3, 4, 5 };
        float totalBill = 0;

        for (int i = 0; i < code.length; i++) {
            switch (code[i]) {
                case 1:
                    System.out.println("The price of motor is :"+price[i]);
                    totalBill += price[i] + (0.08 * price[i]);
                    break;
                case 2:
                System.out.println("The price of fan is :"+price[i]);
                    totalBill += price[i] + (0.12 * price[i]);
                    break;
                case 3:
                System.out.println("The price of tubelight is :"+price[i]);
                    totalBill += price[i] + (0.05 * price[i]);
                    break;
                case 4:
                System.out.println("The price of wire is :"+price[i]);
                    totalBill += price[i] + (0.075 * price[i]);
                    break;
                case 5:
                System.out.println("The price of other items is :"+price[i]);
                    totalBill += price[i] + (0.03 * price[i]);
                    break;

                default:
                    break;
            }
        }
        System.out.println("The Total bill is "+totalBill);
    }

}
