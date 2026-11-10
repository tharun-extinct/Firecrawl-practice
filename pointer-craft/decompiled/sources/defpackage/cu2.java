package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class cu2 {
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
            iArr[vt2.ON_RESUME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[vt2.ON_PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        g = iArr;
    }
}
