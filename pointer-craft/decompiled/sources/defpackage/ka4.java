package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.fonts.Font;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureTarget;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class ka4 {
    public static /* synthetic */ ScrollCaptureTarget j(ba baVar, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(baVar, rect, point, scrollCaptureCallback);
    }

    public static /* synthetic */ Font.Builder n(Font font) {
        return new Font.Builder(font);
    }
}
