package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tz1 implements xy1 {
    public final /* synthetic */ xy1 a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte j = 1;
    public final /* synthetic */ ob3 m;
    public final /* synthetic */ ob3 q;
    public final /* synthetic */ Object s;
    public final /* synthetic */ bw4 t;
    public final /* synthetic */ Object w;

    public /* synthetic */ tz1(ox0 ox0Var, ik1 ik1Var, xy1 xy1Var, bz1 bz1Var, ss2 ss2Var, ob3 ob3Var, ob3 ob3Var2, gx3 gx3Var, bw4 bw4Var) {
        this.t = bw4Var;
        this.w = ik1Var;
        this.c = gx3Var;
        this.m = ob3Var;
        this.a = xy1Var;
        this.i = ox0Var;
        this.b = ss2Var;
        this.q = ob3Var2;
        this.s = bz1Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        og5 og5Var = og5.g;
        Object obj2 = this.s;
        Object obj3 = this.b;
        Object obj4 = this.i;
        Object obj5 = this.c;
        Object obj6 = this.w;
        bw4 bw4Var = this.t;
        switch (b) {
            case 0:
                es2 es2Var = (es2) obj;
                es2Var.getClass();
                List list = (List) bw4Var.getValue();
                es2Var.H(list.size(), null, new wk0(list, (byte) 3), new nm0(802480018, true, new a02(list, (ik1) obj6, (gx3) obj5, this.m, this.a, (ox0) obj4, (ss2) obj3, this.q, (bz1) obj2)));
                break;
            default:
                ob3 ob3Var = (ob3) obj2;
                es2 es2Var2 = (es2) obj;
                es2Var2.getClass();
                List list2 = (List) bw4Var.getValue();
                vq0 vq0Var = new vq0((byte) 6);
                es2Var2.H(list2.size(), new sd((Object) vq0Var, (Object) list2, (byte) 7), new wk0(list2, (byte) 7), new nm0(2039820996, true, new a02(list2, (ao2) obj6, this.a, (xy1) obj5, (xy1) obj4, (xy1) obj3, this.m, this.q, ob3Var)));
                break;
        }
        return og5Var;
    }

    public /* synthetic */ tz1(ob3 ob3Var, ao2 ao2Var, xy1 xy1Var, xy1 xy1Var2, xy1 xy1Var3, xy1 xy1Var4, ob3 ob3Var2, ob3 ob3Var3, ob3 ob3Var4) {
        this.t = ob3Var;
        this.w = ao2Var;
        this.a = xy1Var;
        this.c = xy1Var2;
        this.i = xy1Var3;
        this.b = xy1Var4;
        this.m = ob3Var2;
        this.q = ob3Var3;
        this.s = ob3Var4;
    }
}
