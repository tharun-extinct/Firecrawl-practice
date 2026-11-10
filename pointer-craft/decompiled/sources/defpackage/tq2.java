package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class tq2 implements Comparator {
    public final /* synthetic */ byte g;
    public final /* synthetic */ bm y;

    public /* synthetic */ tq2(bm bmVar, byte b) {
        this.g = b;
        this.y = bmVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.g;
        bm bmVar = this.y;
        switch (b) {
            case 0:
                return Integer.valueOf(bmVar.v(((ms2) obj).m)).compareTo(Integer.valueOf(bmVar.v(((ms2) obj2).m)));
            case 1:
                return Integer.valueOf(bmVar.v(((ms2) obj).m)).compareTo(Integer.valueOf(bmVar.v(((ms2) obj2).m)));
            case 2:
                return Integer.valueOf(bmVar.v(((ms2) obj2).m)).compareTo(Integer.valueOf(bmVar.v(((ms2) obj).m)));
            default:
                return Integer.valueOf(bmVar.v(((ms2) obj2).m)).compareTo(Integer.valueOf(bmVar.v(((ms2) obj).m)));
        }
    }
}
