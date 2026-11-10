package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class ek3 implements Comparator {
    public static final ek3 y = new ek3(0);
    public final /* synthetic */ byte g;

    public /* synthetic */ ek3(byte b) {
        this.g = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.g) {
            case 0:
                um2 um2Var = (um2) obj;
                um2 um2Var2 = (um2) obj2;
                int iF = yf2.f(um2Var2.f, um2Var.f);
                return iF != 0 ? iF : yf2.f(um2Var.hashCode(), um2Var2.hashCode());
            case 1:
                um2 um2Var3 = (um2) obj;
                um2 um2Var4 = (um2) obj2;
                int iF2 = yf2.f(um2Var3.f, um2Var4.f);
                return iF2 != 0 ? iF2 : yf2.f(um2Var3.hashCode(), um2Var4.hashCode());
            case 2:
                return Integer.valueOf(((c43) obj).y).compareTo(Integer.valueOf(((c43) obj2).y));
            default:
                return Integer.valueOf(((c43) obj).g).compareTo(Integer.valueOf(((c43) obj2).g));
        }
    }
}
