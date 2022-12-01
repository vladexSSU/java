import java.util.HashMap;
import java.util.Random;

public class Stats {
    private HashMap<String, Integer> stats = new HashMap<String, Integer>();

    public int roll_dice() {
        int i, first = 0, second = 0, third = 0;
        int[] records = new int[6];
        Random randInt = new Random();
        int total = 0;
        int randomNumber = 0;

        for (i = 0; i < records.length; i++) {
            records[i] = randInt.nextInt(6) + 1;
        }

        for (i = 0; i < records.length; i++) {
            /* If current element is greater than
            first*/
            if (records[i] > first) {
                third = second;
                second = first;
                first = records[i];
            }

            /* If arr[i] is in between first and
            second then update second  */
            else if (records[i] > second) {
                third = second;
                second = records[i];
            } else if (records[i] > third)
                third = records[i];
        }

        total = first + second + third;

        return total;
    }

    public Stats generate_stats() {
        Stats s = new Stats();
        s.stats.put("Strength", roll_dice());
        s.stats.put("Intelligence", roll_dice());
        s.stats.put("Wisdom", roll_dice());
        s.stats.put("Dexterity", roll_dice());
        s.stats.put("Constitution", roll_dice());
        s.stats.put("Charisma", roll_dice());
        return s;
    }

    public HashMap<String, Integer> getStats() {
        return stats;
    }
}
