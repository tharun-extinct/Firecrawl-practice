package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ws implements bz1 {
    public final /* synthetic */ short a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object w;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ws(g61 g61Var, cq0 cq0Var, my1 my1Var, my1 my1Var2, int i) {
        this.j = (byte) 1;
        this.t = g61Var;
        this.m = cq0Var;
        this.q = my1Var;
        this.w = my1Var2;
        this.a = i;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        short s = this.a;
        Object obj3 = this.w;
        Object obj4 = this.q;
        Object obj5 = this.t;
        Object obj6 = this.m;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ot.t((List) obj6, (g61) obj5, (xy1) obj4, (j73) obj3, (h02) obj, aq2.J(s | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                gp4.h((g61) obj5, (cq0) obj6, (my1) obj4, (my1) obj3, (h02) obj, aq2.J(s | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                gy3.y((b30) obj6, (my1) obj5, (z14) obj4, (String) obj3, (h02) obj, aq2.J(s | 1));
                break;
        }
        return og5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ws(Object obj, Object obj2, Object obj3, Object obj4, int i, byte b) {
        this.j = b;
        this.m = obj;
        this.t = obj2;
        this.q = obj3;
        this.w = obj4;
        this.a = i;
    }
}
