import java.util.*;

public class CoinChangeGreedy {
    public static void main(String[] args) {
        int[] coins = {10, 5, 2, 1}; // Indian coins
        int amount = 93;
        System.out.println("Coins used:");
        for (int coin : coins) {
            while (amount >= coin) {
                amount -= coin;
                System.out.print(coin + " ");
            }
        }
    }
}
