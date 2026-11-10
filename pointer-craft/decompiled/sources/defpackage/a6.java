package defpackage;

import android.widget.ArrayAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class a6 extends ArrayAdapter {
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
