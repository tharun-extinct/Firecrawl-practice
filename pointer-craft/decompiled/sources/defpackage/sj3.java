package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class sj3 {
    public static final /* synthetic */ int[] g;

    static {
        int[] iArr = new int[vt2.values().length];
        try {
            iArr[vt2.ON_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[vt2.ON_STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[vt2.ON_DESTROY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        g = iArr;
    }
}
