package defpackage;

import java.util.Comparator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class h90 implements Comparator {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object y;

    public /* synthetic */ h90(Object obj, byte b) {
        this.g = b;
        this.y = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.g;
        Object obj3 = this.y;
        switch (b) {
            case 0:
                Set set = (Set) obj3;
                return Integer.valueOf(!set.contains(Integer.valueOf(((zf5) obj).l)) ? 1 : 0).compareTo(Integer.valueOf(!set.contains(Integer.valueOf(((zf5) obj2).l)) ? 1 : 0));
            case 1:
                int iCompare = ((Comparator) obj3).compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                um2 um2Var = ((gj4) obj).r;
                um2 um2Var2 = ((gj4) obj2).r;
                return um2Var.d() == um2Var2.d() ? yf2.f(um2Var.f(), um2Var2.f()) : Float.compare(um2Var.d(), um2Var2.d());
            default:
                int iCompare2 = ((h90) obj3).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : Integer.valueOf(((gj4) obj).x).compareTo(Integer.valueOf(((gj4) obj2).x));
        }
    }
}
