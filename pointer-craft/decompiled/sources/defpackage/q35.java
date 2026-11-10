package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes2.dex */
public final class q35 extends lr2 {
    public final /* synthetic */ r35 j;
    public final /* synthetic */ lr2 l;
    public final /* synthetic */ Context v;
    public final /* synthetic */ TextPaint x;

    public q35(r35 r35Var, Context context, TextPaint textPaint, lr2 lr2Var) {
        this.j = r35Var;
        this.v = context;
        this.x = textPaint;
        this.l = lr2Var;
    }

    @Override // defpackage.lr2
    public final void B(int i) {
        this.l.B(i);
    }

    @Override // defpackage.lr2
    public final void C(Typeface typeface, boolean z) {
        this.j.x(this.v, this.x, typeface);
        this.l.C(typeface, z);
    }
}
