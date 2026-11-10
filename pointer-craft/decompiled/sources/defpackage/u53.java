package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class u53 implements p14 {
    public final /* synthetic */ byte g;
    public final p14 r;
    public final p14 y;

    public /* synthetic */ u53(p14 p14Var, p14 p14Var2, byte b) {
        this.g = b;
        this.y = p14Var;
        this.r = p14Var2;
    }

    @Override // defpackage.p14
    public final Object get() {
        byte b = this.g;
        p14 p14Var = this.y;
        switch (b) {
            case 0:
                return new t53((Context) ((wx0) p14Var).y, (ro) ((wx0) this.r).get());
            default:
                return new bc4(new tg1((byte) 18), new f73((byte) 17), ku.x, (oe4) p14Var.get(), this.r);
        }
    }
}
