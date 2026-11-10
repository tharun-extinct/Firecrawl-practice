package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillId;

/* JADX INFO: loaded from: classes.dex */
public final class a9 extends hv implements kt1 {
    public final ba a;
    public boolean b;
    public final AutofillId c;
    public final ia3 i;
    public final ji j;
    public final m44 m;
    public final String q;
    public final jj4 t;
    public final Rect w = new Rect();

    public a9(ji jiVar, jj4 jj4Var, ba baVar, m44 m44Var, String str) {
        this.j = jiVar;
        this.t = jj4Var;
        this.a = baVar;
        this.m = m44Var;
        this.q = str;
        baVar.setImportantForAutofill(1);
        q64 q64VarP = jr2.p(baVar);
        AutofillId autofillIdR = q64VarP != null ? y8.r(q64VarP.t) : null;
        if (autofillIdR != null) {
            this.c = autofillIdR;
            this.i = new ia3();
        } else {
            mc2.r("Required value was null.");
            l0.x();
            throw null;
        }
    }

    @Override // defpackage.kt1
    public final void g(cu1 cu1Var, cu1 cu1Var2) {
        um2 um2VarV;
        aj4 aj4VarK;
        um2 um2VarV2;
        aj4 aj4VarK2;
        ba baVar = this.a;
        ji jiVar = this.j;
        if (cu1Var != null && (um2VarV2 = k33.V(cu1Var)) != null && (aj4VarK2 = um2VarV2.k()) != null && v70.C(aj4VarK2)) {
            jiVar.G().notifyViewExited(baVar, um2VarV2.t);
        }
        if (cu1Var2 == null || (um2VarV = k33.V(cu1Var2)) == null || (aj4VarK = um2VarV.k()) == null || !v70.C(aj4VarK)) {
            return;
        }
        int i = um2VarV.t;
        m44 m44Var = this.m;
        um2 um2Var = (um2) m44Var.g.y(i);
        if (um2Var == null || um2Var.c == -4) {
            return;
        }
        bm bmVar = m44Var.r;
        int iN = m44Var.n(um2Var);
        long[] jArr = (long[]) bmVar.y;
        long j = jArr[iN];
        long j2 = jArr[iN + 1];
        jiVar.G().notifyViewEntered(baVar, i, new Rect((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2));
    }
}
