package org.graalvm.compiler.core.test;

import java.lang.reflect.InvocationTargetException;

public class ArrayBoundsCheckEliminationTestCases {

    public static int constant_p(int[] a) {
        return a[5];
    }

    public static int constant_f(int[] a) {
        if (!(0 <= 5 && 5 < a.length))
            return -1;
        return a[5];
    }

    public static int param_p(int[] a, int x) {
        return a[x];
    }

    public static int param_f(int[] a, int x) {
        if (!(0 <= x && x < a.length))
            return -1;
        return a[x];
    }

    public static int param_f_trans(int[] a, int x, int lower, int upper) {
        if (!(0 <= lower))
            return -1;
        if (!(upper < a.length))
            return -1;
        if (!(lower <= x))
            return -1;
        if (!(x <= upper))
            return -1;
        return a[x];
    }


    public static int loop1_p(int[] a, int max) {
        int s = 0;
        for (int i = 0; i < max; i++) {
            s += a[i];
        }
        return s;
    }

    public static int loop1_f(int[] a) {
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            s += a[i];
        }
        return s;
    }

    public static int loop1plus5_p(int[] a, int max) {
        int s = 0;
        for (int i = 0; i < max - 5; i++) {
            s += a[i + 5];
        }
        return s;
    }

    public static int loop1plus5_f(int[] a) {
        int s = 0;
        for (int i = 0; i < a.length - 5; i++) {
            s += a[i + 5];
        }

        return s;
    }

    public static int loop1plusc_p(int[] a, int max, int c) {
        int s = 0;
        for (int i = 0; i < max - c; i++) {
            s += a[i + c];
        }
        return s;
    }

    public static int loop1plusc_f(int[] a, int c) {
        int s = 0;
        for (int i = 0; i < a.length - c; i++) {
            s += a[i + c];
        }
        return s;
    }


    public static int loop1double_p(int[] a, int max) {
        int s = 0;
        for (int i = 0; i < max / 2; i++) {
            s += a[2*i] + a[2*i+1];
        }
        return s;
    }

    public static int loop1double_f(int[] a, int c) {
        int s = 0;
        for (int i = 0; i < a.length / 2; i++) {
            s += a[2*i] + a[2*i+1];
        }
        return s;
    }


    public static int loop2i_p(int[] a, int imax, int jmax) {
        int s = 0;
        for (int i = 0; i < imax; i++) {
            for (int j = 0; j < jmax; j++) {
                s += a[i];
                s += a[j];
            }
        }
        return s;
    }

    public static int loop2i_f(int[] a) {
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                s += a[i];
                s += a[j];
            }
        }
        return s;
    }

    public static int loop2triangular_p(int[] a, int imax, int jmax) {
        int s = 0;
        for (int i = 0; i < imax; i++) {
            for (int j = 0; j < i; j++) {
                s += a[i];
                s += a[j];
            }
        }
        return s;
    }

    public static int loop2trianglular_f(int[] a) {
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                s += a[i];
                s += a[j];
            }
        }
        return s;
    }

    public static int loop2lowertri_p(int[] a, int imax, int jmax) {
        int s = 0;
        for (int i = 0; i < imax; i++) {
            for (int j = 0; j < i; j++) {
                s += a[i];
                s += a[j];
            }
        }
        return s;
    }

    public static int loop2lowertri_f(int[] a) {
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                s += a[i];
                s += a[j];
            }
        }
        return s;
    }

    public static int loop2uppertri_p(int[] a, int imax, int jmax) {
        int s = 0;
        for (int i = 0; i < imax; i++) {
            for (int j = i; j < jmax; j++) {
                s += a[i];
                s += a[j];
            }
        }
        return s;
    }

    public static int loop2uppertri_f(int[] a) {
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                s += a[i];
                s += a[j];
            }
        }
        return s;
    }


    public static int loop2sum_p(int[] a, int imax, int jmax) {
        int s = 0;
        for (int i = 0; i < imax; i++) {
            for (int j = 0; j < jmax - i; j++) {
                s += a[i + j];
            }
        }
        return s;
    }

    public static int loop2sum_f(int[] a) {
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i; j++) {
                s += a[i + j];
            }
        }
        return s;
    }

    public static int loop2sumplus5_p(int[] a, int imax, int jmax) {
        int s = 0;
        for (int i = 0; i < imax; i++) {
            for (int j = 0; j < jmax - i - 5; j++) {
                s += a[i + j + 5];
            }
        }
        return s;
    }

    public static int loop2sumplus5_f(int[] a) {
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 5; j++) {
                s += a[i + j + 5];
            }
        }
        return s;
    }

    public static int loop2addmul_p(int[] a, int imax, int jmax) {
        int s = 0;
        for (int i = 0; i < imax / 4; i++) {
            for (int j = 0; j < 4; j++) {
                s += a[j + 4 * i];
            }
        }
        return s;
    }


    public static int loop2addmul_f(int[] a) {
        int s = 0;
        for (int i = 0; i < a.length / 4; i++) {
            for (int j = 0; j < 4; j++) {
                s += a[j + 4 * i];
            }
        }
        return s;
    }

    public static int bubblesort(int[] a) {
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

//            for (var j = limit; --j >= st; ) {
//                if (a[j] > a[j+1]) {
//                    var tmp = a[j];
//                    a[j] = a[j+1];
//                    a[j+1] = tmp;
//                }
//            }
        }
        return s;
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        int[] ints = {1,2,3,4, 5, 6, 7, 8};
        int a = 1;  
        constant_p(ints);
        constant_f(ints);
        param_p(ints, a);
        param_f(ints, a);
        param_f_trans(ints, a, a, a);
        loop1_p(ints, a);
        loop1_f(ints);
        loop1plus5_p(ints, a);
        loop1plus5_f(ints);
        loop1plusc_p(ints, a, a);
        loop1plusc_f(ints, a);
        loop1double_p(ints, a);
        loop1double_f(ints, a);
        loop2i_p(ints, a, a);
        loop2i_f(ints);
        loop2triangular_p(ints, a, a);
        loop2trianglular_f(ints);
        loop2lowertri_p(ints, a, a);
        loop2lowertri_f(ints);
        loop2uppertri_p(ints, a, a);
        loop2uppertri_f(ints);
        loop2sum_p(ints, a, a);
        loop2sum_f(ints);
        loop2sumplus5_p(ints, a, a);
        loop2sumplus5_f(ints);
        loop2addmul_p(ints, a, a);
        loop2addmul_f(ints);
    }
}
