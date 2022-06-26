class LeadersInArray {
    /* Java Function to print leaders in an array */
    void printLeaders(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            int j;
            for (j = i + 1; j < size; j++) {
                if (arr[i] <= arr[j])
                    break;
            }
            if (j == size) // the loop didn't break
                System.out.print(arr[i] + " ");
        }
    }

    /* Driver program to test above functions */
    public static void main(String[] args) {
        LeadersInArray lead = new LeadersInArray();
        int arr[] = new int[] { 7, 10, 4, 10, 6, 5, 2 };
        int n = arr.length;
        lead.printLeaders(arr, n);
    }
}
