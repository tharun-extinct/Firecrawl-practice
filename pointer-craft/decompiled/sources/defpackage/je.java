package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class je implements bz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ jz1 q;
    public final /* synthetic */ int t;

    public /* synthetic */ je(Object obj, Object obj2, jz1 jz1Var, int i, byte b) {
        this.j = b;
        this.a = obj;
        this.m = obj2;
        this.q = jz1Var;
        this.t = i;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        int i = this.t;
        jz1 jz1Var = this.q;
        Object obj3 = this.m;
        Object obj4 = this.a;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                gh6.g((cj3) obj4, (u6) obj3, (nm0) jz1Var, (h02) obj, aq2.J(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                kh6.y((cz1) obj4, (j73) obj3, (xy1) jz1Var, (h02) obj, aq2.J(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ra.g((gk0) obj4, obj3, (nm0) jz1Var, (h02) obj, aq2.J(i | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                az5.g((j73) obj4, (j14) obj3, (nm0) jz1Var, (h02) obj, aq2.J(i | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ju0.g((gu0) obj4, (j73) obj3, (nm0) jz1Var, (h02) obj, aq2.J(i | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                x31.r((xy) obj4, (w35) obj3, (my1) jz1Var, (h02) obj, aq2.J(i | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                mf6.v((View) obj4, (j51) obj3, (my1) jz1Var, (h02) obj, aq2.J(i | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((o75) obj4).y((Object[]) obj3, (xy1) jz1Var, (h02) obj, aq2.J(i | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ib6.r((un5) obj4, (xy1) obj3, (my1) jz1Var, (h02) obj, aq2.J(i | 1));
                break;
        }
        return og5Var;
    }
}
