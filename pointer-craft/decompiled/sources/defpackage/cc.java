package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cc implements bz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object c;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ int t;
    public final /* synthetic */ Object w;

    public /* synthetic */ cc(Class cls, j73 j73Var, qx1 qx1Var, wt2 wt2Var, xy1 xy1Var, int i) {
        this.j = (byte) 0;
        Bundle bundle = Bundle.EMPTY;
        this.a = cls;
        this.m = j73Var;
        this.q = qx1Var;
        this.w = wt2Var;
        this.c = xy1Var;
        this.t = i;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        Object obj3 = this.w;
        Object obj4 = this.q;
        og5 og5Var = og5.g;
        int i = this.t;
        Object obj5 = this.c;
        Object obj6 = this.m;
        Object obj7 = this.a;
        switch (b) {
            case 0:
                Bundle bundle = Bundle.EMPTY;
                ((Integer) obj2).getClass();
                c93.g((Class) obj7, (j73) obj6, (qx1) obj4, (wt2) obj3, (xy1) obj5, (h02) obj, aq2.J(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                j33.g((rj0) obj7, (e83) obj6, (un4) obj4, (mf5) obj3, (nm0) obj5, (h02) obj, aq2.J(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iJ = aq2.J(i | 1);
                ra.q((nc5) obj7, (hc5) obj6, this.q, this.w, (no1) obj5, (h02) obj, iJ);
                break;
        }
        return og5Var;
    }

    public /* synthetic */ cc(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, byte b) {
        this.j = b;
        this.a = obj;
        this.m = obj2;
        this.q = obj3;
        this.w = obj4;
        this.c = obj5;
        this.t = i;
    }
}
