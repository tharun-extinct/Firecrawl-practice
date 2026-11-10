package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ol5 extends ud1 {
    public ol5(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
    }

    public final void dispatchGetDisplayList() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }
}
