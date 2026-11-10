package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tq extends zq2 {
    public static final sq n = new sq((byte) 0);
    public static volatile tq r;
    public final u31 y = new u31();

    public static tq K() {
        if (r != null) {
            return r;
        }
        synchronized (tq.class) {
            try {
                if (r == null) {
                    r = new tq();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r;
    }
}
