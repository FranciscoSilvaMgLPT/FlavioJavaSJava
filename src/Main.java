import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static String name = "Francisco Silva";
    static int id = 123456789;

    static ArrayList<Integer> arrayTest = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

    static ArrayList<String> arrayTest1 = new ArrayList<>(Arrays.asList("-", "-", "~", "-", "-", "-", "-", "~", "~", "-", "-", "~", "~"));

    public static void main(String[] args) {
        getPassengerInfo();
        System.out.println(getRentalCost(8));
        System.out.println(getMultipliedBoxDigits(arrayTest));
        System.out.println(chatAnalyser(arrayTest1));

    }

    public static void getPassengerInfo() {
        System.out.println(name);
        System.out.println(id);
    }

    public static String getRentalCost(int days) {
        int cost = days * 35;
        if (days >= 3) {
            cost -= 10;
            return "Total cost is " + cost;
        } else if (days >= 7) {
            cost -= 40;
            return "Total cost is " + cost;
        } else {
            return "Total cost is " + cost;
        }
    }

    public static int getMultipliedBoxDigits(ArrayList<Integer> a) {
        int total = 0;
        for (int i = 1; i < a.size(); i++) {
            total = total + a.get(i - 1) * a.get(i);
        }

        return total;
    }

    public static String chatAnalyser(ArrayList<String> a) {
        int count = 0;
        float lenght = a.size();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).equals("-")) {
                count += 1;
            }
        }
        double percent = Math.floor((count / lenght) * 100);
        return "The percentage of calm sea is " + percent + "%";
    }


}