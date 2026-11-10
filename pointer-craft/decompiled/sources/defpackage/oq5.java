package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class oq5 extends ContentObserver {
    public final /* synthetic */ m70 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq5(m70 m70Var, Handler handler) {
        super(handler);
        this.g = m70Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.g.z(og5.g);
    }
}
