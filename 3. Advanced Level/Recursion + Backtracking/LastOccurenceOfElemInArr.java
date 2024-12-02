public class LastOccurenceOfElemInArr {
    public static int lastOcuu(int a[], int key, int i) {
        if (i == a.length)
            return -1;

        int isFound = lastOcuu(a, key, i + 1);
        if (isFound == -1 && a[i] == key)
            return i;

        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(lastOcuu(arr, 4, 0));
    }
}
