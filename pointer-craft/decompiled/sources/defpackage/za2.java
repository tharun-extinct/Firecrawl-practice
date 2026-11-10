package defpackage;

import android.text.Layout;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class za2 {
    public static final /* synthetic */ int[] g;

    static {
        int[] iArr = new int[Layout.Alignment.values().length];
        try {
            iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        g = iArr;
    }
}
