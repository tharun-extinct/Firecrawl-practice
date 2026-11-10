package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class du4 {
    public static final /* synthetic */ int[] g = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141};

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void A(cc4 cc4Var) throws Exception {
        boolean zIsTerminated;
        if (cc4Var instanceof AutoCloseable) {
            cc4Var.close();
            return;
        }
        if (!(cc4Var instanceof ExecutorService)) {
            if (cc4Var instanceof TypedArray) {
                ((TypedArray) cc4Var).recycle();
                return;
            }
            if (cc4Var instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) cc4Var).release();
                return;
            } else if (cc4Var instanceof MediaDrm) {
                ((MediaDrm) cc4Var).release();
                return;
            } else {
                t94.g();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) cc4Var;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static void B(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static /* synthetic */ String C(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ int D(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] E(int i) {
        int[] iArr = new int[i];
        System.arraycopy(g, 0, iArr, 0, i);
        return iArr;
    }

    public static ClassCastException a(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static String b(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String c(String str, pw1 pw1Var, String str2) {
        return str + pw1Var + str2;
    }

    public static void d(ro roVar, long j) {
        roVar.b().t();
        roVar.b0(j);
    }

    public static void e(kq3 kq3Var, float f, float f2, float f3, float f4) {
        kq3Var.j(f, f2);
        kq3Var.v(f3);
        kq3Var.w(f4);
    }

    public static void f(int i, h02 h02Var, int i2, on0 on0Var) {
        h02Var.i0(Integer.valueOf(i));
        h02Var.y(on0Var, Integer.valueOf(i2));
    }

    public static /* synthetic */ boolean g(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public static void h(int i, nm0 nm0Var, h02 h02Var, boolean z) {
        nm0Var.l(h02Var, Integer.valueOf(i));
        h02Var.b(z);
    }

    public static String i(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static kq3 j(float f, float f2) {
        kq3 kq3Var = new kq3();
        kq3Var.j(f, f2);
        return kq3Var;
    }

    public static void k(int i, h02 h02Var, on0 on0Var, h02 h02Var2) {
        xs2.E(on0Var, h02Var, Integer.valueOf(i));
        xs2.D(h02Var2);
    }

    public static fp3 l(int i, eb4 eb4Var) {
        return new fp3(eb4Var, new dm2(i));
    }

    public static String m(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static ja3 n(h02 h02Var) {
        ja3 ja3Var = new ja3();
        h02Var.i0(ja3Var);
        return ja3Var;
    }

    public static void o(int i, bz1 bz1Var, h02 h02Var, boolean z) {
        bz1Var.l(h02Var, Integer.valueOf(i));
        h02Var.b(z);
    }

    public static StringBuilder p(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static String q(int i, int i2, String str, String str2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static int r(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static StringBuilder s(int i, int i2, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static m14 t(long j, vf1 vf1Var) {
        return vf1Var.g(new jj0(j));
    }

    public static StringBuilder u(String str, float f, String str2, float f2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(f);
        sb.append(str2);
        sb.append(f2);
        sb.append(str3);
        return sb;
    }

    public static fp3 v(int i, v50 v50Var) {
        return new fp3(v50Var, new dm2(i));
    }

    public static String w(int i, String str, String str2) {
        return str + i + str2;
    }

    public static fp3 x(int i, ht0 ht0Var) {
        return new fp3(ht0Var, new gt0(i));
    }

    public static float y(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static StringBuilder z(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }
}
