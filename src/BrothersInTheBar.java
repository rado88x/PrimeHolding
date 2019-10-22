import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class BrothersInTheBar {

    public static void main(String[] args) {

        int[] glasses = new int[100000];
        Arrays.fill(glasses, 7);

        System.out.println(brothersInTheBar(glasses));

    }


    public static int brothersInTheBar(int[] glasses) {
        if (glasses.length < 3) {
            return 0;
        }

        int result = 0;
        List<Integer> barTable = new LinkedList<Integer>();
        for (int glass : glasses) {
            barTable.add(glass);
        }

        ListIterator<Integer> iterator = barTable.listIterator();
        int glassTwoBefore = iterator.next();// I can call next safely because size is at least 3.
        int glassBefore = iterator.next();

        while (barTable.size() >= 3 && iterator.hasNext()) {
            int glass = iterator.next(); // current position
            if (glassTwoBefore == glassBefore && glassBefore == glass) {
                iterator.remove(); //delete glass
                iterator.previous();
                iterator.remove(); // delete glassBefore
                iterator.previous();
                iterator.remove(); // delete glassTwoBefore
                result++;

                if (barTable.size() < 3) {
                    break;  // if there are not 3 glasses no sense to load them
                }
                for (int i = 0; i < 2 && iterator.hasPrevious(); i++) {
                    iterator.previous();
                }
                glassTwoBefore = iterator.next();
                glassBefore = iterator.next();
            } else {
                glassTwoBefore = glassBefore;
                glassBefore = glass;
                //in case we don't consume beers we have to update them
            }
        }

        return result;
    }
}
