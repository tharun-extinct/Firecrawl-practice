package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g80 implements bz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte j = 0;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ int t;
    public final /* synthetic */ Object w;

    public /* synthetic */ g80(nm0 nm0Var, Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, int i) {
        this.a = nm0Var;
        this.m = obj;
        this.q = bool;
        this.w = obj2;
        this.c = obj3;
        this.i = obj4;
        this.t = i;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        Object obj3 = this.i;
        Object obj4 = this.c;
        Object obj5 = this.w;
        Object obj6 = this.m;
        og5 og5Var = og5.g;
        int i = this.t;
        Object obj7 = this.q;
        Object obj8 = this.a;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                rz5.x((j73) obj8, (bg5) obj6, (xy1) obj7, (xy1) obj5, (xy1) obj4, (bz1) obj3, (h02) obj, aq2.J(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iJ = aq2.J(i) | 1;
                ((nm0) obj8).m(this.m, (Boolean) obj7, this.w, this.c, this.i, (h02) obj, iJ);
                break;
            default:
                ((Integer) obj2).getClass();
                xj4.r((String) obj8, (List) obj6, (g61) obj5, (xy1) obj7, (my1) obj4, (my1) obj3, (h02) obj, aq2.J(i | 1));
                break;
        }
        return og5Var;
    }

    public /* synthetic */ g80(j73 j73Var, bg5 bg5Var, xy1 xy1Var, xy1 xy1Var2, xy1 xy1Var3, bz1 bz1Var, int i) {
        this.a = j73Var;
        this.m = bg5Var;
        this.q = xy1Var;
        this.w = xy1Var2;
        this.c = xy1Var3;
        this.i = bz1Var;
        this.t = i;
    }

    public /* synthetic */ g80(String str, List list, g61 g61Var, xy1 xy1Var, my1 my1Var, my1 my1Var2, int i) {
        this.a = str;
        this.m = list;
        this.w = g61Var;
        this.q = xy1Var;
        this.c = my1Var;
        this.i = my1Var2;
        this.t = i;
    }
}
