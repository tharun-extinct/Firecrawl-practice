package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class v9 extends s1 {
    public final /* synthetic */ ba m;
    public final /* synthetic */ um2 q;
    public final /* synthetic */ ba w;

    public v9(ba baVar, um2 um2Var, ba baVar2) {
        this.m = baVar;
        this.q = um2Var;
        this.w = baVar2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004c  */
    @Override // defpackage.s1
    public final void n(View view, m2 m2Var) {
        this.j.onInitializeAccessibilityNodeInfo(view, m2Var.o0());
        ba baVar = this.m;
        ia iaVar = baVar.D;
        if (iaVar.o()) {
            m2Var.n0(false);
        }
        um2 um2Var = this.q;
        um2 um2VarO = um2Var.o();
        while (true) {
            if (um2VarO == null) {
                um2VarO = null;
                break;
            } else if (um2VarO.M.r(8)) {
                break;
            } else {
                um2VarO = um2VarO.o();
            }
        }
        Integer numValueOf = um2VarO != null ? Integer.valueOf(um2VarO.t) : null;
        if (numValueOf != null) {
            if (numValueOf.intValue() == baVar.getSemanticsOwner().g().x) {
                numValueOf = -1;
            }
        } else {
            numValueOf = -1;
        }
        int iIntValue = numValueOf.intValue();
        ba baVar2 = this.w;
        m2Var.V(baVar2, iIntValue);
        int i = um2Var.t;
        int iN = iaVar.I.n(i);
        if (iN != -1) {
            dg dgVarN = sf6.n(baVar.getAndroidViewsHandler$ui(), iN);
            if (dgVarN != null) {
                m2Var.k0(dgVarN);
            } else {
                m2Var.l0(baVar2, iN);
            }
            baVar.r(i, m2Var.o0(), iaVar.K);
        }
        int iN2 = iaVar.J.n(i);
        if (iN2 != -1) {
            dg dgVarN2 = sf6.n(baVar.getAndroidViewsHandler$ui(), iN2);
            if (dgVarN2 != null) {
                m2Var.i0(dgVarN2);
            } else {
                m2Var.j0(baVar2, iN2);
            }
            baVar.r(i, m2Var.o0(), iaVar.L);
        }
    }
}
