package defpackage;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class a83 {
    public static final a83 g = new a83();

    public final boolean g(MotionEvent motionEvent, int i) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i)) & Integer.MAX_VALUE) < 2139095040;
    }
}
