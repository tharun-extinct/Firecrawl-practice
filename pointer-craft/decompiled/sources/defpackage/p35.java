package defpackage;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class p35 extends jr2 {
    public final /* synthetic */ r35 n;
    public final /* synthetic */ lr2 r;

    public p35(r35 r35Var, lr2 lr2Var) {
        this.n = r35Var;
        this.r = lr2Var;
    }

    @Override // defpackage.jr2
    public final void C(int i) {
        this.n.c = true;
        this.r.B(i);
    }

    @Override // defpackage.jr2
    public final void D(Typeface typeface) {
        r35 r35Var = this.n;
        Typeface typefaceCreate = Typeface.create(typeface, r35Var.n);
        r35Var.b = typefaceCreate;
        r35Var.c = true;
        this.r.C(typefaceCreate, false);
    }
}
