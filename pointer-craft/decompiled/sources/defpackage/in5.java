package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class in5 extends zz4 implements bz1 {
    public final /* synthetic */ String b;
    public final /* synthetic */ fo5 c;
    public final /* synthetic */ List i;
    public /* synthetic */ Object q;
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in5(int i, fo5 fo5Var, List list, String str, mu0 mu0Var) {
        super(2, mu0Var);
        this.w = i;
        this.c = fo5Var;
        this.i = list;
        this.b = str;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        in5 in5Var = new in5(this.w, this.c, this.i, this.b, mu0Var);
        in5Var.q = obj;
        return in5Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        in5 in5Var = (in5) b((mu0) obj2, (db3) obj);
        og5 og5Var = og5.g;
        in5Var.u(og5Var);
        return og5Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        db3 db3Var = (db3) this.q;
        js2.o(obj);
        int i = this.w;
        rw3 rw3Var = new rw3(xi3.j("widget_", i));
        rw3 rw3Var2 = new rw3(xi3.j("widget_type_", i));
        fo5 fo5Var = this.c;
        String str = fo5Var.j;
        db3Var.getClass();
        db3Var.x(rw3Var2, str);
        int iOrdinal = fo5Var.ordinal();
        if (iOrdinal != 0) {
            int i2 = 1;
            if (iOrdinal != 1) {
                up.y();
                return null;
            }
            List<o04> list = this.i;
            if (list != null) {
                cx cxVar = ex.v;
                p04 p04Var = new p04();
                p04Var.m = 0;
                p04Var.i = 0;
                ArrayList arrayList = new ArrayList(dj0.Y(list, 10));
                for (o04 o04Var : list) {
                    r04 r04Var = new r04();
                    int i3 = i2 + 1;
                    r04Var.m = i2;
                    s04 s04Var = new s04();
                    s04Var.a = 1.0f;
                    r04Var.q = s04Var;
                    o04Var.getClass();
                    r04Var.t = (byte) 2;
                    r04Var.a = o04Var;
                    arrayList.add(r04Var);
                    i2 = i3;
                }
                p04Var.a = (r04[]) arrayList.toArray(new r04[0]);
                db3Var.x(rw3Var, ex.y(cxVar, np3.t(p04Var)));
            }
        } else {
            db3Var.n(rw3Var);
        }
        db3Var.x(new rw3(xi3.j("widget_device_", i)), this.b);
        return og5.g;
    }
}
