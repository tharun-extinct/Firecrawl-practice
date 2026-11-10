package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes.dex */
public final class qz4 implements bz1 {
    public final /* synthetic */ long a;
    public final /* synthetic */ bz1 c;
    public final /* synthetic */ j73 j;
    public final /* synthetic */ float m;
    public final /* synthetic */ z40 q;
    public final /* synthetic */ cn4 t;
    public final /* synthetic */ float w;

    public qz4(j73 j73Var, cn4 cn4Var, long j, float f, z40 z40Var, float f2, bz1 bz1Var) {
        this.j = j73Var;
        this.t = cn4Var;
        this.a = j;
        this.m = f;
        this.q = z40Var;
        this.w = f2;
        this.c = bz1Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        h02 h02Var = (h02) obj;
        int iIntValue = ((Number) obj2).intValue();
        boolean zN = h02Var.N(iIntValue & 1, (iIntValue & 3) != 2);
        og5 og5Var = og5.g;
        if (!zN) {
            h02Var.Q();
            return og5Var;
        }
        j73 j73VarV = uz4.v(this.j, this.t, uz4.x(this.a, this.m, h02Var), this.q, ((j51) h02Var.a(hp0.j)).e(this.w));
        Object objK = h02Var.K();
        l76 l76Var = oo0.g;
        if (objK == l76Var) {
            objK = new nd4((byte) 24);
            h02Var.i0(objK);
        }
        j73 j73VarG = dj4.g(j73VarV, false, (xy1) objK);
        Object objK2 = h02Var.K();
        if (objK2 == l76Var) {
            objK2 = f31.r;
            h02Var.i0(objK2);
        }
        j73 j73VarG2 = b05.g(j73VarG, og5Var, (PointerInputEventHandler) objK2);
        t33 t33VarR = z50.r(hi0.t, true);
        int iS = pw5.s(h02Var);
        tr3 tr3VarQ = h02Var.q();
        j73 j73VarW = m50.W(h02Var, j73VarG2);
        jo0.n.getClass();
        h02Var.b0();
        if (h02Var.S) {
            h02Var.m(um2.Z);
        } else {
            h02Var.l0();
        }
        xs2.E(tg1.w, h02Var, t33VarR);
        xs2.E(tg1.q, h02Var, tr3VarQ);
        on0 on0Var = tg1.c;
        if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS))) {
            du4.f(iS, h02Var, iS, on0Var);
        }
        xs2.E(tg1.m, h02Var, j73VarW);
        du4.o(0, this.c, h02Var, true);
        return og5Var;
    }
}
