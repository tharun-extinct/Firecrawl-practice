package defpackage;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes2.dex */
public final class kf extends zz4 implements bz1 {
    public final /* synthetic */ byte q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf() {
        super(2, null);
        this.q = (byte) 0;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        switch (this.q) {
            case 0:
                return new kf(2, mu0Var, (byte) 0);
            default:
                return new kf(2, mu0Var, (byte) 1);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                return ((kf) b((mu0) obj2, (ox0) obj)).u(og5Var);
            default:
                ((kf) b((mu0) obj2, (pf4) obj)).u(og5Var);
                return og5Var;
        }
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        switch (this.q) {
            case 0:
                js2.o(obj);
                return Choreographer.getInstance();
            default:
                js2.o(obj);
                return og5.g;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kf(int i, mu0 mu0Var, byte b) {
        super(i, mu0Var);
        this.q = b;
    }
}
