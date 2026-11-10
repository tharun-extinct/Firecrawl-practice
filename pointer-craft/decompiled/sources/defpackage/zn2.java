package defpackage;

import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final class zn2 extends zz4 implements bz1 {
    public final /* synthetic */ sk2 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ao2 i;
    public qp2 q;
    public final /* synthetic */ wn4 s;
    public byte w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn2(ao2 ao2Var, sk2 sk2Var, wn4 wn4Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.i = ao2Var;
        this.b = sk2Var;
        this.s = wn4Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        zn2 zn2Var = new zn2(this.i, this.b, this.s, mu0Var);
        zn2Var.c = obj;
        return zn2Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((zn2) b((mu0) obj2, (ox0) obj)).u(og5.g);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        Object objR;
        qp2 qp2Var;
        qp2 qp2Var2;
        ox0 ox0Var = (ox0) this.c;
        byte b = this.w;
        sk2 sk2Var = this.b;
        ao2 ao2Var = this.i;
        px0 px0Var = px0.j;
        if (b == 0) {
            js2.o(obj);
            gp2 gp2Var = (gp2) ao2Var.v.get();
            this.c = ox0Var;
            this.w = (byte) 1;
            objR = gp2Var.r(sk2Var, this.s, this);
            if (objR != px0Var) {
            }
            return px0Var;
        }
        if (b == 1) {
            js2.o(obj);
            objR = obj;
        } else {
            if (b != 2) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qp2Var2 = this.q;
            js2.o(obj);
        }
        qp2Var = qp2Var2;
        ox0Var.getClass();
        ao2Var.l.setValue(xn2.g(ao2Var.x(), null, null, qp2Var, 1));
        return og5.g;
        qp2Var = (qp2) objR;
        if ((qp2Var != null ? qp2Var.g : null) != null) {
            wh4 wh4Var = ao2Var.n;
            sk2 sk2VarG = sk2.g(sk2Var, 0, null, qp2Var.g, qp2Var.y, qp2Var.r, null, 151);
            this.c = ox0Var;
            this.q = qp2Var;
            this.w = (byte) 2;
            if (wh4Var.l(sk2VarG, this) != px0Var) {
                qp2Var2 = qp2Var;
                qp2Var = qp2Var2;
            }
            return px0Var;
        }
        ao2Var.v(R.string.message_error);
        ox0Var.getClass();
        ao2Var.l.setValue(xn2.g(ao2Var.x(), null, null, qp2Var, 1));
        return og5.g;
    }
}
