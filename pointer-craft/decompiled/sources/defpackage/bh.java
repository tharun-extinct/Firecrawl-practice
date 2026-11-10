package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bh implements va1 {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object y;

    public /* synthetic */ bh(Object obj, Object obj2, Object obj3, byte b) {
        this.g = b;
        this.y = obj;
        this.r = obj2;
        this.n = obj3;
    }

    @Override // defpackage.va1
    public final void g() {
        byte b = this.g;
        Object obj = this.n;
        Object obj2 = this.r;
        Object obj3 = this.y;
        switch (b) {
            case 0:
                ((st4) obj3).remove(obj2);
                ((oh) obj).n.q(obj2);
                break;
            case 1:
                ((gu2) obj3).a().x((au2) obj2);
                pu2 pu2Var = (pu2) ((u54) obj).j;
                if (pu2Var != null) {
                    pu2Var.g();
                }
                break;
            case 2:
                gu2 gu2Var = (gu2) obj3;
                gu2Var.a().x((ol0) obj2);
                gu2Var.a().x(((b30) obj).r.g);
                break;
            default:
                sc4 sc4Var = (sc4) obj3;
                xc4 xc4Var = (xc4) obj;
                if (sc4Var.t.q(obj2) == xc4Var) {
                    Map map = sc4Var.j;
                    Map mapV = xc4Var.v();
                    if (!mapV.isEmpty()) {
                        map.put(obj2, mapV);
                    } else {
                        map.remove(obj2);
                    }
                }
                break;
        }
    }
}
