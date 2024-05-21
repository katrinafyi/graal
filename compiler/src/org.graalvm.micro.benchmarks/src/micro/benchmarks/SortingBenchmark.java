package micro.benchmarks;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.IntUnaryOperator;

@State(Scope.Thread)
public class SortingBenchmark extends BenchmarkBase {

    @Param({"10000"}) private int N;

    private int[] list;

    @Setup public void setup() throws Exception {
        list = new int[N];
        var random = ThreadLocalRandom.current();
        IntUnaryOperator intUnaryOperator = i -> random.nextInt();
        Arrays.setAll(list, intUnaryOperator);
    }

    public static void bubbleSort(int[] comparable) {
        boolean changed = false;
        do {
            changed = false;
            for (int a = 0; a < comparable.length - 1; a++) {
                if (comparable[a] > (comparable[a + 1])) {
                    int tmp = comparable[a];
                    comparable[a] = comparable[a + 1];
                    comparable[a + 1] = tmp;
                    changed = true;
                }
            }
        } while (changed);
    }

    public static void insertSort(int[] A){
        for(int i = 1; i < A.length; i++){
            int value = A[i];
            int j = i - 1;
            while(j >= 0 && A[j] > value){
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = value;
        }
    }

    public static void selectionSort(int[] nums){
        for(int currentPlace = 0;currentPlace<nums.length-1;currentPlace++){
            int smallest = Integer.MAX_VALUE;
            int smallestAt = currentPlace+1;
            for(int check = currentPlace; check<nums.length;check++){
                if(nums[check]<smallest){
                    smallestAt = check;
                    smallest = nums[check];
                }
            }
            int temp = nums[currentPlace];
            nums[currentPlace] = nums[smallestAt];
            nums[smallestAt] = temp;
        }
    }

    public static void cocktailSort(int[] A){
        boolean swapped;
        do {
            swapped = false;
            for (int i =0; i<=  A.length  - 2;i++) {
                if (A[ i ] > A[ i + 1 ]) {
                    //test whether the two elements are in the wrong order
                    int temp = A[i];
                    A[i] = A[i+1];
                    A[i+1]=temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                //we can exit the outer loop here if no swaps occurred.
                break;
            }
            swapped = false;
            for (int i= A.length - 2;i>=0;i--) {
                if (A[ i ] > A[ i + 1 ]) {
                    int temp = A[i];
                    A[i] = A[i+1];
                    A[i+1]=temp;
                    swapped = true;
                }
            }
            //if no elements have been swapped, then the list is sorted
        } while (swapped);
    }

    public static int paperExample(int[] a) {
        var limit = a.length;
        var st = -1;
        var s = 0;
        while (st < limit) {
            st++;
            limit--;
            for (var j = st; j < limit; j++) {
                if (a[j] > a[j+1]) {
                    s += 1;
//                    var tmp = a[j];
//                    a[j] = a[j+1];
//                    a[j+1] = tmp;
                }
            }

            for (var j = limit; --j >= st; ) {
                if (a[j] > a[j+1]) {
                    s += 1;
//                    var tmp = a[j];
//                    a[j] = a[j+1];
//                    a[j+1] = tmp;
                }
            }
        }
        return s;
    }

    @Benchmark
    public int paper() {
        return paperExample(list);
    }
    @Benchmark
    public int[] cocktail() {
        cocktailSort(list);
        return list;
    }
    @Benchmark
    public int[] bubble() {
        bubbleSort(list);
        return list;
    }
    @Benchmark
    public int[] insert() {
        insertSort(list);
        return list;
    }
    @Benchmark
    public int[] selection() {
        selectionSort(list);
        return list;
    }
}
