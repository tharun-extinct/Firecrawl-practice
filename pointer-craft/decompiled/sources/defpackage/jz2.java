package defpackage;

import java.net.UnknownHostException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class jz2 extends u25 {
    public final AtomicReference l;
    public final nb1 v;
    public final mb1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz2(b35 b35Var, nb1 nb1Var, mb1 mb1Var) {
        super(mb1Var.g.concat(" dns"), false);
        b35Var.getClass();
        this.v = nb1Var;
        this.x = mb1Var;
        this.l = new AtomicReference(gz2.y);
    }

    @Override // defpackage.u25
    public final long r() {
        Object obj;
        gz2 gz2Var = gz2.g;
        AtomicReference atomicReference = this.l;
        try {
            this.v.g(this.x.g);
            loop0: while (true) {
                obj = atomicReference.get();
                iz2 iz2Var = (iz2) obj;
                iz2Var.getClass();
                if (!(iz2Var instanceof hz2)) {
                    break;
                }
                do {
                    if (atomicReference.compareAndSet(obj, gz2Var)) {
                        break loop0;
                    }
                } while (atomicReference.get() == obj);
            }
            return -1L;
        } catch (UnknownHostException unused) {
            while (true) {
                Object obj2 = atomicReference.get();
                iz2 iz2Var2 = (iz2) obj2;
                iz2Var2.getClass();
                if (!(iz2Var2 instanceof hz2)) {
                    return -1L;
                }
                while (!atomicReference.compareAndSet(obj2, gz2Var)) {
                    if (atomicReference.get() != obj2) {
                    }
                }
                return -1L;
            }
        }
    }
}
