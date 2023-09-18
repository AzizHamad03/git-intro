//push test  
class lab03 {
    public static void main(String[] args) {
        System.out.println("test");
    }

    void selectionSort(int[] array) {
        int len = array.length;
        for (int i = 0; i < len - 1; i++) {
            
            int smallest = i;
            for (int j = i + 1; j < len; j++)
                if (array[j] < array[smallest])
                    smallest = j;

            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
        }
    }
}
