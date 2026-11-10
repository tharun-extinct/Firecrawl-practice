package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class ql5 {
    public volatile boolean n;
    public final d52 g = new d52(16);
    public final LinkedHashMap y = new LinkedHashMap();
    public final LinkedHashSet r = new LinkedHashSet();

    public static void g(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                xi3.q(autoCloseable);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
