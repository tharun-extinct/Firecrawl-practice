package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class mv {
    public static final /* synthetic */ AtomicIntegerFieldUpdater y = AtomicIntegerFieldUpdater.newUpdater(mv.class, "notCompletedCount$volatile");
    public final g41[] g;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public mv(g41[] g41VarArr) {
        this.g = g41VarArr;
        this.notCompletedCount$volatile = g41VarArr.length;
    }
}
