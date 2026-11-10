package defpackage;

import android.widget.RemoteViews;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class o64 {
    public static final o64 n = new o64(new long[0], new RemoteViews[0], 1);
    public final long[] g;
    public final int r;
    public final RemoteViews[] y;

    public o64(long[] jArr, RemoteViews[] remoteViewsArr, int i) {
        this.g = jArr;
        this.y = remoteViewsArr;
        this.r = i;
        if (jArr.length != remoteViewsArr.length) {
            l0.u("RemoteCollectionItems has different number of ids and views");
            throw null;
        }
        if (i < 1) {
            l0.u("View type count must be >= 1");
            throw null;
        }
        ArrayList arrayList = new ArrayList(remoteViewsArr.length);
        for (RemoteViews remoteViews : remoteViewsArr) {
            arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
        }
        int size = cj0.F0(cj0.I0(arrayList)).size();
        if (size <= this.r) {
            return;
        }
        throw new IllegalArgumentException(("View type count is set to " + this.r + ", but the collection contains " + size + " different layout ids").toString());
    }
}
