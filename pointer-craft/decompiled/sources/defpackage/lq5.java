package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class lq5 {
    public static final /* synthetic */ int[] g;

    static {
        int[] iArr = new int[vt2.values().length];
        try {
            iArr[vt2.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[vt2.ON_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[vt2.ON_STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[vt2.ON_DESTROY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[vt2.ON_PAUSE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[vt2.ON_RESUME.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[vt2.ON_ANY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        g = iArr;
    }
}
