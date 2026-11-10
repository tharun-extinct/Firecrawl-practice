package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d44 {
    public static final List n = pw5.d(20000L, 40000L, 120000L, 300000L);
    public final List g;
    public long r;
    public int y;

    public d44() {
        List list = n;
        list.getClass();
        this.g = list;
    }

    public final Long g(Long l, boolean z) {
        int i;
        if (!z && (i = this.y) != 0) {
            Long l2 = (Long) cj0.m0(i - 1, this.g);
            if (l2 == null) {
                return null;
            }
            long jLongValue = l2.longValue();
            if (l != null) {
                long jLongValue2 = jLongValue - l.longValue();
                return Long.valueOf(jLongValue2 >= 0 ? jLongValue2 : 0L);
            }
        }
        return 0L;
    }
}
