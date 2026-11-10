package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class eb5 {
    public static final long g = az5.x(0, 0, 0, 0);
    public static final /* synthetic */ int y = 0;

    public static final int g(long j, fl2 fl2Var) {
        if ((Long.MIN_VALUE & j) != 0 && fl2Var != fl2.j) {
            j >>= 30;
        }
        return ((int) j) & 32767;
    }

    public static final int n(long j) {
        return ((int) (j >> 15)) & 32767;
    }

    public static final int r(long j) {
        return ((int) (j >> 45)) & 32767;
    }

    public static final int y(long j, fl2 fl2Var) {
        if ((Long.MIN_VALUE & j) == 0 || fl2Var == fl2.j) {
            j >>= 30;
        }
        return ((int) j) & 32767;
    }
}
