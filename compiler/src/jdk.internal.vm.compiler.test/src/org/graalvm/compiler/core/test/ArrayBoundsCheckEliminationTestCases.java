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

  public static void f(int[] a) {
    int i = 0;
    while (i < a.length) {
      GraalDirectives.blackhole(a[i]);
      i++;
    }
    GraalDirectives.blackhole(a[i]);
  }

    public static void g(Object x) {
      if (x instanceof String string) {
          GraalDirectives.blackhole(string.length());
      }
    }

    public static void problem(int[] a) {
        if (a.length == 0) {
            return; }
            {
            int x = 100000;
            int y = 0;
            for (int i = 0; i < 10000; i++) {
                if (x < a.length)
                    GraalDirectives.blackhole(a[y]);
                y = x;
                x = -1;
            }
        }
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


    int big_n20_multipleTrue_trans0_transrandomTrue_f(int[] a0,int[] a1,int[] a2,int[] a3,int[] a4,int[] a5,int[] a6,int[] a7,int[] a8,int[] a9,int[] a10,int[] a11,int[] a12,int[] a13,int[] a14,int[] a15,int[] a16,int[] a17,
                                                    int[] a18, int[] a19, int[] a20, int[] t) {
        int s = 0;
        if (!(t.length >= 1)) return -1;
        var t0 = t[0];
        if (t0 <= a0.length) for (int i0 = 0; i0 < 1 && i0 < t0; i0++) {
            for (int i1 = 0; i1 < 1 && i1 < a1.length; i1++) {
                for (int i2 = 0; i2 < 1 && i2 < a2.length; i2++) {
                    for (int i3 = 0; i3 < 1 && i3 < a3.length; i3++) {
                        for (int i4 = 0; i4 < 1 && i4 < a4.length; i4++) {
                            for (int i5 = 0; i5 < 1 && i5 < a5.length; i5++) {
                                for (int i6 = 0; i6 < 1 && i6 < a6.length; i6++) {
                                    for (int i7 = 0; i7 < 1 && i7 < a7.length; i7++) {
                                        for (int i8 = 0; i8 < 1 && i8 < a8.length; i8++) {
                                            for (int i9 = 0; i9 < 1 && i9 < a9.length; i9++) {
                                                for (int i10 = 0; i10 < 1 && i10 < a10.length; i10++) {
                                                    for (int i11 = 0; i11 < 1 && i11 < a11.length; i11++) {
                                                        for (int i12 = 0; i12 < 1 && i12 < a12.length; i12++) {
                                                            for (int i13 = 0; i13 < 1 && i13 < a13.length; i13++) {
                                                                for (int i14 = 0; i14 < 1 && i14 < a14.length; i14++) {
                                                                    for (int i15 = 0; i15 < 1 && i15 < a15.length; i15++) {
                                                                        for (int i16 = 0; i16 < 1 && i16 < a16.length; i16++) {
                                                                            for (int i17 = 0; i17 < 1 && i17 < a17.length; i17++) {
                                                                                for (int i18 = 0; i18 < 1 && i18 < a18.length; i18++) {
                                                                                    for (int i19 = 0; i19 < 1 && i19 < a19.length; i19++) {
                                                                                        s += a0[i0];
                                                                                        s += a1[i1];
                                                                                        s += a2[i2];
                                                                                        s += a3[i3];
                                                                                        s += a4[i4];
                                                                                        s += a5[i5];
                                                                                        s += a6[i6];
                                                                                        s += a7[i7];
                                                                                        s += a8[i8];
                                                                                        s += a9[i9];
                                                                                        s += a10[i10];
                                                                                        s += a11[i11];
                                                                                        s += a12[i12];
                                                                                        s += a13[i13];
                                                                                        s += a14[i14];
                                                                                        s += a15[i15];
                                                                                        s += a16[i16];
                                                                                        s += a17[i17];
                                                                                        s += a18[i18];
                                                                                        s += a19[i19];
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return s; }


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
