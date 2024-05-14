package org.graalvm.compiler.core.test;

import org.graalvm.compiler.api.directives.GraalDirectives;

import java.lang.reflect.InvocationTargetException;

@SuppressWarnings("unused")
public class ArrayBoundsCheckEliminationTestCases {

    public static void example1_f(int[] a) {
        for (int i = 0; i < a.length; i++) {
            GraalDirectives.blackhole(a[i]);
        }
    }
    public static void example2_p(int[] a) {
        for (int i = a.length + 53; i >= 0; i--) {
            GraalDirectives.blackhole(a[i]);
        }
    }
    public static int constant_p(int[] a) {
        return a[5];
    }

    public static int constant_f(int[] a) {
        if (!(10 < a.length))
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

    public static int param_trans_f(int[] a, int x, int lower, int upper) {
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

    public static int loop1_c(int[] a) {
        int s = 0;
        if (!(5 <= a.length)) {
            return a.length | 0xff;
        }
        for (int i = 0; i < 5; i++) {
            s += a[i];
        }
        return s;
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

    public static int bubblesortx(int[] a) {
        var x = a[0];
        var s = 0;
        if (x < 0) {
            s++;
            if (x < -1) {
                s++;
                if (x < -1) {
                    s++;
                }
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

    @SuppressWarnings("ResultOfMethodCallIgnored")
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        int[] ints = {1,2,3,4, 5, 6, 7, 8};
        int a = 1;
        switch (args.length) {
            case 10:
                constant_p(ints);
            case 11:
                constant_f(ints);
            case 12:
                param_p(ints, a);
            case 13:
                param_f(ints, a);
            case 14:
                param_trans_f(ints, a, a, a);
            case 15:
                loop1_p(ints, a);
            case 16:
                loop1_f(ints);
            case 17:
                loop1plus5_p(ints, a);
            case 18:
                loop1plus5_f(ints);
            case 19:
                loop1plusc_p(ints, a, a);
            case 20:
                loop1plusc_f(ints, a);
            case 21:
                loop1double_p(ints, a);
            case 22:
                loop1double_f(ints, a);
            case 23:
                loop2i_p(ints, a, a);
            case 24:
                loop2i_f(ints);
            case 25:
                loop2triangular_p(ints, a, a);
            case 26:
                loop2trianglular_f(ints);
            case 27:
                loop2lowertri_p(ints, a, a);
            case 28:
                loop2lowertri_f(ints);
            case 29:
                loop2uppertri_p(ints, a, a);
            case 30:
                loop2uppertri_f(ints);
            case 31:
                loop2sum_p(ints, a, a);
            case 32:
                loop2sum_f(ints);
            case 33:
                loop2sumplus5_p(ints, a, a);
            case 34:
                loop2sumplus5_f(ints);
            case 35:
                loop2addmul_p(ints, a, a);
            case 36:
                loop2addmul_f(ints);
        }
    }
}
