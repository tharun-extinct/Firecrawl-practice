package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class kv extends ih2 {
    public static final /* synthetic */ long i = qr.g.objectFieldOffset(kv.class.getDeclaredField("_disposer$volatile"));
    private volatile /* synthetic */ Object _disposer$volatile;
    public final /* synthetic */ mv c;
    public final ib0 q;
    public ya1 w;

    public kv(mv mvVar, ib0 ib0Var) {
        this.c = mvVar;
        this.q = ib0Var;
    }

    @Override // defpackage.ih2
    public final void c(Throwable th) throws ha1 {
        ib0 ib0Var = this.q;
        if (th != null) {
            ky2 ky2VarG = ib0Var.G(new hl0(th, false), null);
            if (ky2VarG != null) {
                ib0Var.H(ky2VarG);
                lv lvVar = (lv) qr.g.getObjectVolatile(this, i);
                if (lvVar != null) {
                    lvVar.g();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = mv.y;
        mv mvVar = this.c;
        if (atomicIntegerFieldUpdater.decrementAndGet(mvVar) == 0) {
            g41[] g41VarArr = mvVar.g;
            ArrayList arrayList = new ArrayList(g41VarArr.length);
            for (g41 g41Var : g41VarArr) {
                arrayList.add(g41Var.a());
            }
            ib0Var.j(arrayList);
        }
    }
}
