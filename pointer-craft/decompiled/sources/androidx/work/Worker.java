package androidx.work;

import android.content.Context;
import defpackage.ml;
import defpackage.ol4;
import defpackage.yw2;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Worker extends ListenableWorker {
    public ol4 w;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.ListenableWorker
    public final ol4 l() {
        this.w = new ol4();
        this.t.n.execute(new ml((Object) this, (byte) 17));
        return this.w;
    }

    public abstract yw2 t();
}
