package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kd3 extends hf3 {
    public final qp3 a;
    public final tp3 j;
    public mc3 l;
    public final pp3 t;
    public final un0 x;

    public kd3(un0 un0Var) {
        super(new nc3((mc3) cj0.s0((List) un0Var.y().v.j.getValue())), true);
        this.x = un0Var;
        this.j = kq2.M(Boolean.FALSE);
        this.t = new pp3(0.0f);
        this.a = new qp3(2);
    }

    @Override // defpackage.hf3
    public final void g() {
        this.j.setValue(Boolean.FALSE);
        this.t.e(0.0f);
        this.a.e(2);
        this.l = null;
    }

    public final void l() {
        un0 un0Var = this.x;
        List list = (List) un0Var.y().v.j.getValue();
        if (list.size() < 2) {
            return;
        }
        mc3 mc3Var = (mc3) cj0.r0(list);
        mc3 mc3Var2 = (mc3) list.get(list.size() - 2);
        un0Var.l(mc3Var);
        un0Var.l(mc3Var2);
        this.l = mc3Var;
    }

    @Override // defpackage.hf3
    public final void n(ff3 ff3Var) {
        l();
        this.j.setValue(Boolean.TRUE);
        this.t.e(ff3Var.g());
        this.a.e(ff3Var.y());
    }

    @Override // defpackage.hf3
    public final void r(ff3 ff3Var) {
        this.j.setValue(Boolean.TRUE);
        this.t.e(ff3Var.g());
        this.a.e(ff3Var.y());
    }

    @Override // defpackage.hf3
    public final void y() {
        tp3 tp3Var = this.j;
        if (!((Boolean) tp3Var.getValue()).booleanValue()) {
            l();
        }
        mc3 mc3Var = this.l;
        if (mc3Var != null) {
            this.x.v(mc3Var, false);
        }
        tp3Var.setValue(Boolean.FALSE);
        this.t.e(0.0f);
        this.a.e(2);
        this.l = null;
    }
}
