package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class ja1 extends re4 {
    public static final /* synthetic */ long w = qr.g.objectFieldOffset(ja1.class.getDeclaredField("_decision$volatile"));
    private volatile /* synthetic */ int _decision$volatile;

    @Override // defpackage.re4, defpackage.nh2
    public final void B(Object obj) throws ha1 {
        G(obj);
    }

    @Override // defpackage.re4, defpackage.nh2
    public final void G(Object obj) throws ha1 {
        while (true) {
            Unsafe unsafe = qr.g;
            long j = w;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile == 1) {
                    pw5.K(pw5.o(this.q), gp4.M(obj));
                    return;
                } else {
                    l0.z("Already resumed");
                    return;
                }
            }
            ja1 ja1Var = this;
            if (unsafe.compareAndSwapInt(ja1Var, j, 0, 2)) {
                return;
            } else {
                this = ja1Var;
            }
        }
    }
}
