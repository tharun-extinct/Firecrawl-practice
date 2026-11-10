package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class hc3 implements Comparator {
    public final /* synthetic */ byte g;
    public static final hc3 y = new hc3(0);
    public static final hc3 r = new hc3(1);

    public /* synthetic */ hc3(byte b) {
        this.g = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.g) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                comparable4.getClass();
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.g) {
            case 0:
                return r;
            default:
                return y;
        }
    }
}
