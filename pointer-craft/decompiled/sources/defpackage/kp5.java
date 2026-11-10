package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class kp5 extends jp5 {
    public nd2 h;
    public nd2 o;
    public nd2 z;

    public kp5(tp5 tp5Var, WindowInsets windowInsets) {
        super(tp5Var, windowInsets);
        this.z = null;
        this.h = null;
        this.o = null;
    }

    @Override // defpackage.pp5
    public nd2 i() {
        nd2 nd2Var = this.o;
        if (nd2Var != null) {
            return nd2Var;
        }
        nd2 nd2VarN = nd2.n(this.r.getTappableElementInsets());
        this.o = nd2VarN;
        return nd2VarN;
    }

    @Override // defpackage.pp5
    public nd2 m() {
        nd2 nd2Var = this.h;
        if (nd2Var != null) {
            return nd2Var;
        }
        nd2 nd2VarN = nd2.n(this.r.getMandatorySystemGestureInsets());
        this.h = nd2VarN;
        return nd2VarN;
    }

    @Override // defpackage.hp5, defpackage.pp5
    public tp5 p(int i, int i2, int i3, int i4) {
        return tp5.l(null, this.r.inset(i, i2, i3, i4));
    }

    @Override // defpackage.pp5
    public nd2 w() {
        nd2 nd2Var = this.z;
        if (nd2Var != null) {
            return nd2Var;
        }
        nd2 nd2VarN = nd2.n(this.r.getSystemGestureInsets());
        this.z = nd2VarN;
        return nd2VarN;
    }

    public kp5(tp5 tp5Var, kp5 kp5Var) {
        super(tp5Var, kp5Var);
        this.z = null;
        this.h = null;
        this.o = null;
    }

    @Override // defpackage.ip5, defpackage.pp5
    public void e(nd2 nd2Var) {
    }
}
