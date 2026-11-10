package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class au1 extends p41 implements ti3, zo0 {
    public kr2 d;
    public final cu1 k;

    public au1() {
        cu1 cu1Var = new cu1(0, new v30(2, this, au1.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, (byte) 2), 9);
        Q0(cu1Var);
        this.k = cu1Var;
    }

    @Override // defpackage.ti3
    public final void N() {
        u54 u54Var = new u54();
        mq2.b(this, new rg((Object) u54Var, (Object) this, (byte) 11));
        kr2 kr2Var = (kr2) u54Var.j;
        if (this.k.V0().y()) {
            kr2 kr2Var2 = this.d;
            if (kr2Var2 != null) {
                kr2Var2.y();
            }
            if (kr2Var != null) {
                kr2Var.g();
            } else {
                kr2Var = null;
            }
            this.d = kr2Var;
        }
    }
}
