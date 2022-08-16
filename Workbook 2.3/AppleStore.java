public class AppleStore {
    public static void main(String[] args) {
        int numOfApples = 0;
        int numOfCustomers = 0;
        double profit = 0;


        System.out.println("You picked 500 apples from an apple orchard");
        numOfApples += 500;//Update number of apples.
        
        System.out.println("Time for business! You're selling each apple for 40 cents");
        double price = 0.40;//Make a price variable. Set it equal to 40 cents.

        System.out.println("One customer walked in. He bought 4 apples!");
        numOfApples -= 4;//Update number of apples.
        numOfCustomers += 1;//Update number of customers;
        profit = price*(500 - numOfApples);//Update profit

        System.out.println("Another customer walked in. He bought 20 apples!");
        numOfApples -= 20;//Update number of apples;
        numOfCustomers += 1;//Update number of customers;
        profit = price*(500 - numOfApples);//Update profit

        System.out.println("Another customer walked in. She bought 200 apples!");
        numOfApples -= 200;//Update number of apples;
        numOfCustomers += 1;//Update number of customers;
        profit = price*(500 - numOfApples);//Update profit

        System.out.println("Wow! So far, you made: " + profit);
        System.out.println(numOfCustomers + " customers love your apples.");
        System.out.println("You have " + (500 - numOfApples)  + " apples left. We'll sell more tomorrow!");




    }

}