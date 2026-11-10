package defpackage;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class jc implements w32 {
    public static boolean x = true;
    public final ba g;
    public boolean n;
    public ol5 r;
    public final gc v;
    public final Object y = new Object();

    public jc(ba baVar) {
        this.g = baVar;
        gc gcVar = new gc();
        this.v = gcVar;
        if (baVar.isAttachedToWindow()) {
            Context context = baVar.getContext();
            if (!this.n) {
                context.getApplicationContext().registerComponentCallbacks(gcVar);
                this.n = true;
            }
        }
        baVar.addOnAttachStateChangeListener(new hc(this, (byte) 0));
    }

    @Override // defpackage.w32
    public final void g(x32 x32Var) {
        synchronized (this.y) {
            if (!x32Var.u) {
                x32Var.u = true;
                x32Var.y();
            }
        }
    }

    @Override // defpackage.w32
    public final x32 y() {
        z32 g42Var;
        z32 e42Var;
        x32 x32Var;
        synchronized (this.y) {
            try {
                ba baVar = this.g;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    baVar.getUniqueDrawingId();
                }
                if (i >= 29) {
                    e42Var = new e42();
                } else {
                    if (x) {
                        try {
                            g42Var = new c42(this.g);
                        } catch (Throwable unused) {
                            x = false;
                            ba baVar2 = this.g;
                            ol5 ol5Var = this.r;
                            if (ol5Var == null) {
                                ol5 ol5Var2 = new ol5(baVar2.getContext());
                                baVar2.addView(ol5Var2, -1);
                                this.r = ol5Var2;
                                ol5Var = ol5Var2;
                            }
                            g42Var = new g42(ol5Var);
                        }
                    } else {
                        ba baVar3 = this.g;
                        ol5 ol5Var3 = this.r;
                        if (ol5Var3 == null) {
                            ol5 ol5Var4 = new ol5(baVar3.getContext());
                            baVar3.addView(ol5Var4, -1);
                            this.r = ol5Var4;
                            ol5Var3 = ol5Var4;
                        }
                        g42Var = new g42(ol5Var3);
                    }
                    e42Var = g42Var;
                }
                x32Var = new x32(e42Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return x32Var;
    }
}
