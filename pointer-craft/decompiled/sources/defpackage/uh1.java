package defpackage;

import android.text.Editable;

/* JADX INFO: loaded from: classes.dex */
public final class uh1 extends Editable.Factory {
    public static final Object g = new Object();
    public static Class r;
    public static volatile uh1 y;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = r;
        return cls != null ? new mu4(cls, charSequence) : super.newEditable(charSequence);
    }
}
