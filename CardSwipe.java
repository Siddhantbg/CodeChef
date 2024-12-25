import java.util.*; // Import necessary libraries

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // Create a scanner to read input
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int t = scanner.nextInt();

        // Iterate for each test case
        while (t-- > 0) {
            // Read the size of the array
            int n = scanner.nextInt();
            int[] arr = new int[n];

            // Use a HashMap to track occurrences of elements
            HashMap<Integer, Integer> elementMap = new HashMap<>();

            // Read the array elements
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int maxDistinct = 0; // Tracks the maximum distinct elements at any time
            int currentDistinct = 0; // Tracks the current distinct count

            // Traverse the array
            for (int i = 0; i < n; i++) {
                // If the element is not in the map, add it
                if (!elementMap.containsKey(arr[i])) {
                    currentDistinct++; // Increase distinct count
                    elementMap.put(arr[i], 1); // Add element to map
                } else {
                    // If the element already exists, remove it
                    currentDistinct--; // Decrease distinct count
                    elementMap.remove(arr[i]);
                }

                // Update the maximum distinct count
                maxDistinct = Math.max(maxDistinct, currentDistinct);
            }

            // Print the maximum distinct elements for this test case
            System.out.println(maxDistinct);
        }

        // Close the scanner
        scanner.close();
    }
}
import java.util.*; // Import necessary libraries

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // Create a scanner to read input
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int t = scanner.nextInt();

        // Iterate for each test case
        while (t-- > 0) {
            // Read the size of the array
            int n = scanner.nextInt();
            int[] arr = new int[n];

            // Use a HashMap to track occurrences of elements
            HashMap<Integer, Integer> elementMap = new HashMap<>();

            // Read the array elements
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int maxDistinct = 0; // Tracks the maximum distinct elements at any time
            int currentDistinct = 0; // Tracks the current distinct count

            // Traverse the array
            for (int i = 0; i < n; i++) {
                // If the element is not in the map, add it
                if (!elementMap.containsKey(arr[i])) {
                    currentDistinct++; // Increase distinct count
                    elementMap.put(arr[i], 1); // Add element to map
                } else {
                    // If the element already exists, remove it
                    currentDistinct--; // Decrease distinct count
                    elementMap.remove(arr[i]);
                }

                // Update the maximum distinct count
                maxDistinct = Math.max(maxDistinct, currentDistinct);
            }

            // Print the maximum distinct elements for this test case
            System.out.println(maxDistinct);
        }

        // Close the scanner
        scanner.close();
    }
}
import java.util.*; // Import necessary libraries

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // Create a scanner to read input
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int t = scanner.nextInt();

        // Iterate for each test case
        while (t-- > 0) {
            // Read the size of the array
            int n = scanner.nextInt();
            int[] arr = new int[n];

            // Use a HashMap to track occurrences of elements
            HashMap<Integer, Integer> elementMap = new HashMap<>();

            // Read the array elements
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int maxDistinct = 0; // Tracks the maximum distinct elements at any time
            int currentDistinct = 0; // Tracks the current distinct count

            // Traverse the array
            for (int i = 0; i < n; i++) {
                // If the element is not in the map, add it
                if (!elementMap.containsKey(arr[i])) {
                    currentDistinct++; // Increase distinct count
                    elementMap.put(arr[i], 1); // Add element to map
                } else {
                    // If the element already exists, remove it
                    currentDistinct--; // Decrease distinct count
                    elementMap.remove(arr[i]);
                }

                // Update the maximum distinct count
                maxDistinct = Math.max(maxDistinct, currentDistinct);
            }

            // Print the maximum distinct elements for this test case
            System.out.println(maxDistinct);
        }

        // Close the scanner
        scanner.close();
    }
}
