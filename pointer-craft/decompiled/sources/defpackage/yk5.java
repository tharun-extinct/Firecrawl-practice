package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes2.dex */
public final class yk5 extends ContextWrapper {
    public LayoutInflater g;
    public LayoutInflater y;

    /* JADX WARN: Illegal instructions before constructor call */
    public yk5(LayoutInflater layoutInflater, pw1 pw1Var) {
        Context context = layoutInflater.getContext();
        context.getClass();
        super(context);
        ro0 ro0Var = new ro0(this, (byte) 1);
        this.g = layoutInflater;
        pw1Var.X.g(ro0Var);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        LayoutInflater layoutInflater = this.y;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflater2 = this.g;
        if (layoutInflater2 == null) {
            layoutInflater2 = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            this.g = layoutInflater2;
        }
        LayoutInflater layoutInflaterCloneInContext = layoutInflater2.cloneInContext(this);
        this.y = layoutInflaterCloneInContext;
        return layoutInflaterCloneInContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk5(Context context, pw1 pw1Var) {
        super(context);
        context.getClass();
        ro0 ro0Var = new ro0(this, (byte) 1);
        this.g = null;
        pw1Var.X.g(ro0Var);
    }
}
