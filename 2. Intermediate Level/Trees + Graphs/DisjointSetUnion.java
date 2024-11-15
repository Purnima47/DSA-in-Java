public class DisjointSetUnion {
    static int n = 7;
    static int parent[] = new int[n];
    static int rank[] = new int[n];

    public static void initializeParent() {
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    // Rank will be 0 of all the vertices.

    // Find the leader i.e. ultimate parent
    // O(1)
    public static int find(int x) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }

    // O(4 * k) --> T.C.
    // O(1) -> generally
    public static void union(int a, int b) {
        int parentOfa = find(a);
        int parentOfb = find(b);

        if (rank[parentOfa] == rank[parentOfb]) {
            parent[parentOfb] = parentOfa;
            rank[parentOfa]++;
        } else if (rank[parentOfa] < rank[parentOfb]) {
            parent[parentOfa] = parentOfb;
        } else {
            parent[parentOfb] = parentOfa;
        }
    }

    // Path Compression
    public static void main(String[] args) {
        initializeParent();
        System.out.println(find(3));
        union(1, 3);
        System.out.println(find(3));
        union(2, 4);
        union(3, 6);
        union(1, 4);
        System.out.println(find(3));
        System.out.println(find(4));
        union(1, 5);
    }
}
