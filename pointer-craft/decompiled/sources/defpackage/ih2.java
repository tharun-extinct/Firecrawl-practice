package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class ih2 extends yx2 implements ya1, wa2 {
    public nh2 m;

    public abstract void c(Throwable th);

    @Override // defpackage.ya1
    public final void g() {
        ih2 ih2Var;
        Unsafe unsafe;
        long j;
        nh2 nh2VarQ = q();
        while (true) {
            Object objY = nh2VarQ.Y();
            if (objY instanceof ih2) {
                if (objY != this) {
                    return;
                }
                ji1 ji1Var = gp4.k;
                do {
                    unsafe = qr.g;
                    j = nh2.a;
                    if (unsafe.compareAndSwapObject(nh2VarQ, j, objY, ji1Var)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(nh2VarQ, j) == objY);
            } else {
                if (!(objY instanceof wa2) || ((wa2) objY).n() == null) {
                    return;
                }
                while (true) {
                    Object objJ = this.j();
                    if (objJ instanceof v64) {
                        return;
                    }
                    if (objJ == this) {
                        return;
                    }
                    objJ.getClass();
                    yx2 yx2Var = (yx2) objJ;
                    Unsafe unsafe2 = qr.g;
                    long j2 = yx2.a;
                    v64 v64Var = (v64) unsafe2.getObjectVolatile(yx2Var, j2);
                    if (v64Var == null) {
                        v64Var = new v64(yx2Var);
                        unsafe2.putObjectVolatile(yx2Var, j2, v64Var);
                    }
                    v64 v64Var2 = v64Var;
                    while (true) {
                        Unsafe unsafe3 = qr.g;
                        long j3 = yx2.j;
                        ih2Var = this;
                        if (unsafe3.compareAndSwapObject(ih2Var, j3, objJ, v64Var2)) {
                            yx2Var.x();
                            return;
                        } else if (unsafe3.getObjectVolatile(ih2Var, j3) != objJ) {
                            break;
                        } else {
                            this = ih2Var;
                        }
                    }
                    this = ih2Var;
                }
            }
        }
    }

    @Override // defpackage.wa2
    public final ih3 n() {
        return null;
    }

    public final nh2 q() {
        nh2 nh2Var = this.m;
        if (nh2Var != null) {
            return nh2Var;
        }
        yf2.Y("job");
        throw null;
    }

    @Override // defpackage.yx2
    public final String toString() {
        return getClass().getSimpleName() + '@' + a11.z(this) + "[job@" + a11.z(q()) + ']';
    }

    public boolean w() {
        return false;
    }

    @Override // defpackage.wa2
    public final boolean y() {
        return true;
    }
}
