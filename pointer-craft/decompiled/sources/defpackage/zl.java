package defpackage;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class zl {
    public final TextView g;
    public final y22 y;

    public zl(TextView textView) {
        this.g = textView;
        this.y = new y22(textView);
    }

    public final void g(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.g.getContext().obtainStyledAttributes(attributeSet, r24.t, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            r(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void r(boolean z) {
        ((ra) this.y.t).R(z);
    }

    public final void y(boolean z) {
        ((ra) this.y.t).Q(z);
    }
}
