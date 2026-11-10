package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class pt extends zz4 implements bz1 {
    public final /* synthetic */ String c;
    public final /* synthetic */ byte q;
    public /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pt(String str, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = str;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        String str = this.c;
        switch (b) {
            case 0:
                pt ptVar = new pt(str, mu0Var, (byte) 0);
                ptVar.w = obj;
                return ptVar;
            case 1:
                pt ptVar2 = new pt(str, mu0Var, (byte) 1);
                ptVar2.w = obj;
                return ptVar2;
            default:
                pt ptVar3 = new pt(str, mu0Var, (byte) 2);
                ptVar3.w = obj;
                return ptVar3;
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                ((pt) b((mu0) obj2, (db3) obj)).u(og5Var);
                return og5Var;
            case 1:
                return ((pt) b((mu0) obj2, (List) obj)).u(og5Var);
            default:
                ((pt) b((mu0) obj2, (db3) obj)).u(og5Var);
                return og5Var;
        }
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        String str = this.c;
        Object obj2 = this.w;
        switch (b) {
            case 0:
                db3 db3Var = (db3) obj2;
                js2.o(obj);
                rw3 rw3Var = yl4.g;
                Set set = (Set) db3Var.r(rw3Var);
                if (set == null) {
                    set = vi1.j;
                }
                db3Var.x(rw3Var, nl4.D(set, str));
                db3Var.v(yl4.y, str);
                return og5Var;
            case 1:
                List<g61> list = (List) obj2;
                js2.o(obj);
                boolean z = false;
                if (list == null || !list.isEmpty()) {
                    for (g61 g61Var : list) {
                        if (yf2.p(g61Var.t, str) && g61Var.l()) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            default:
                db3 db3Var2 = (db3) obj2;
                js2.o(obj);
                rw3 rw3Var2 = yl4.g;
                rw3 rw3Var3 = yl4.y;
                if (!yf2.p((String) db3Var2.r(rw3Var3), str)) {
                    db3Var2.v(rw3Var3, str);
                }
                return og5Var;
        }
    }
}
