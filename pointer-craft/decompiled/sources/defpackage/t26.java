package defpackage;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class t26 extends PhantomReference {
    public final Set g;

    public /* synthetic */ t26(lh0 lh0Var, ReferenceQueue referenceQueue, Set set) {
        super(lh0Var, referenceQueue);
        this.g = set;
    }
}
