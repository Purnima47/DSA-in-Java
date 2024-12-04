import java.util.ArrayList;

public class MultiDimensionalList {
    public static void multiDimen() {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        mainList.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        mainList.add(list2);

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> cuArrayList = mainList.get(i);
            for (int j = 0; j < cuArrayList.size(); j++) {
                System.out.print(cuArrayList.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(mainList);

    }

    public static void multiDimen2() {
        ArrayList<ArrayList<Integer>> mArrayList = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            l1.add(i * 1);
            l2.add(i * 2);
            l3.add(i * 3);
        }
        mArrayList.add(l1);
        mArrayList.add(l2);
        mArrayList.add(l3);
        System.out.println(mArrayList);

        for (int i = 0; i < mArrayList.size(); i++) {
            ArrayList<Integer> cuArrayList = mArrayList.get(i);
            for (int j = 0; j < cuArrayList.size(); j++) {
                System.out.print(cuArrayList.get(j) + " ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        multiDimen();
        multiDimen2();
    }
}
