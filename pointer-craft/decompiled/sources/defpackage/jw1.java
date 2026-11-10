package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class jw1 extends v4 {
    public final /* synthetic */ AtomicReference g;

    public jw1(AtomicReference atomicReference) {
        this.g = atomicReference;
    }

    @Override // defpackage.v4
    public final void g(Object obj) {
        v4 v4Var = (v4) this.g.get();
        if (v4Var != null) {
            v4Var.g(obj);
        } else {
            l0.z("Operation cannot be started before fragment is in created state");
        }
    }
}
