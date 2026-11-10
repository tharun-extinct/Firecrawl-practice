package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import defpackage.iy2;
import defpackage.ml;
import defpackage.ol4;
import defpackage.xq5;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements xq5 {
    public static final String p = iy2.v("ConstraintTrkngWrkr");
    public final ol4 b;
    public final Object c;
    public volatile boolean i;
    public ListenableWorker s;
    public final WorkerParameters w;

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.w = workerParameters;
        this.c = new Object();
        this.i = false;
        this.b = new ol4();
    }

    @Override // androidx.work.ListenableWorker
    public final ol4 l() {
        this.t.n.execute(new ml(this, (byte) 3));
        return this.b;
    }

    @Override // defpackage.xq5
    public final void r(ArrayList arrayList) {
        iy2.r().g(p, String.format("Constraints changed for %s", arrayList), new Throwable[0]);
        synchronized (this.c) {
            this.i = true;
        }
    }

    @Override // defpackage.xq5
    public final void v(List list) {
    }

    @Override // androidx.work.ListenableWorker
    public final void x() {
        ListenableWorker listenableWorker = this.s;
        if (listenableWorker == null || listenableWorker.a) {
            return;
        }
        this.s.j();
    }

    @Override // androidx.work.ListenableWorker
    public final boolean y() {
        ListenableWorker listenableWorker = this.s;
        return listenableWorker != null && listenableWorker.y();
    }
}
