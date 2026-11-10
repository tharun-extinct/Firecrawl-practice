package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public class fh2 extends nh2 {
    public final boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh2(dh2 dh2Var) {
        super(true);
        boolean z = true;
        b0(dh2Var);
        Unsafe unsafe = qr.g;
        long j = nh2.t;
        be0 be0Var = (be0) unsafe.getObjectVolatile(this, j);
        ce0 ce0Var = be0Var instanceof ce0 ? (ce0) be0Var : null;
        if (ce0Var == null) {
            z = false;
            break;
        }
        nh2 nh2VarQ = ce0Var.q();
        while (!nh2VarQ.V()) {
            be0 be0Var2 = (be0) qr.g.getObjectVolatile(nh2VarQ, j);
            ce0 ce0Var2 = be0Var2 instanceof ce0 ? (ce0) be0Var2 : null;
            if (ce0Var2 == null) {
                z = false;
                break;
            }
            nh2VarQ = ce0Var2.q();
        }
        this.m = z;
    }

    @Override // defpackage.nh2
    public final boolean V() {
        return this.m;
    }

    @Override // defpackage.nh2
    public final boolean W() {
        return true;
    }
}
