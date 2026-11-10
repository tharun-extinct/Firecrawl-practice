package defpackage;

import java.net.Proxy;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class tp0 {
    public static final /* synthetic */ int[] g;

    static {
        int[] iArr = new int[Proxy.Type.values().length];
        try {
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        g = iArr;
    }
}
