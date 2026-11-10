package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class xc2 implements yc2 {
    public final InputContentInfo j;

    public xc2(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.j = new InputContentInfo(uri, clipDescription, uri2);
    }

    @Override // defpackage.yc2
    public final Uri c() {
        return this.j.getLinkUri();
    }

    @Override // defpackage.yc2
    public final Object m() {
        return this.j;
    }

    @Override // defpackage.yc2
    public final Uri q() {
        return this.j.getContentUri();
    }

    @Override // defpackage.yc2
    public final ClipDescription v() {
        return this.j.getDescription();
    }

    @Override // defpackage.yc2
    public final void w() {
        this.j.requestPermission();
    }

    public xc2(Object obj) {
        this.j = (InputContentInfo) obj;
    }
}
