package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class j81 extends zz4 implements bz1 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ob3 h;
    public final /* synthetic */ s30 i;
    public final /* synthetic */ ob3 p;
    public boolean q;
    public final /* synthetic */ ob3 s;
    public final /* synthetic */ ob3 u;
    public boolean w;
    public final /* synthetic */ ob3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j81(boolean z, s30 s30Var, Context context, ob3 ob3Var, ob3 ob3Var2, ob3 ob3Var3, ob3 ob3Var4, ob3 ob3Var5, mu0 mu0Var) {
        super(2, mu0Var);
        this.c = z;
        this.i = s30Var;
        this.b = context;
        this.s = ob3Var;
        this.p = ob3Var2;
        this.u = ob3Var3;
        this.z = ob3Var4;
        this.h = ob3Var5;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        return new j81(this.c, this.i, this.b, this.s, this.p, this.u, this.z, this.h, mu0Var);
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((j81) b((mu0) obj2, (ox0) obj)).u(og5.g);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        boolean zJ;
        boolean z = this.w;
        ob3 ob3Var = this.u;
        og5 og5Var = og5.g;
        ob3 ob3Var2 = this.z;
        if (!z) {
            js2.o(obj);
            if (this.c && ((wt2) this.s.getValue()) == wt2.q) {
                ob3 ob3Var3 = this.p;
                ob3Var3.setValue(dc6.g((ih0) ob3Var3.getValue(), this.i, 4));
                zJ = dc6.j(this.b);
                if (zJ != ((Boolean) ob3Var.getValue()).booleanValue() || ((Boolean) ob3Var2.getValue()).booleanValue()) {
                    this.q = zJ;
                    this.w = true;
                    Object objE = yf2.e(350L, this);
                    px0 px0Var = px0.j;
                    if (objE == px0Var) {
                        return px0Var;
                    }
                }
            }
            return og5Var;
        }
        if (!z) {
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        zJ = this.q;
        js2.o(obj);
        ob3Var.setValue(Boolean.valueOf(zJ));
        if (((Boolean) ob3Var2.getValue()).booleanValue()) {
            ob3Var2.setValue(Boolean.FALSE);
            this.h.setValue(Boolean.TRUE);
        }
        return og5Var;
    }
}
