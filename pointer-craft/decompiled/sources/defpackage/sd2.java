package defpackage;

import android.os.Build;
import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class sd2 extends ri0 implements Runnable, jj3, View.OnAttachStateChangeListener {
    public final yp5 a;
    public boolean m;
    public boolean q;
    public tp5 w;

    public sd2(yp5 yp5Var) {
        super(!yp5Var.h ? 1 : 0);
        this.a = yp5Var;
    }

    @Override // defpackage.ri0
    public final cd2 a(yo5 yo5Var, cd2 cd2Var) {
        this.m = false;
        return cd2Var;
    }

    @Override // defpackage.ri0
    public final tp5 j(tp5 tp5Var, List list) {
        yp5 yp5Var = this.a;
        yp5.y(yp5Var, tp5Var);
        return yp5Var.h ? tp5.y : tp5Var;
    }

    @Override // defpackage.ri0
    public final void l(yo5 yo5Var) {
        this.m = true;
        this.q = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.m) {
            this.m = false;
            this.q = false;
            tp5 tp5Var = this.w;
            if (tp5Var != null) {
                yp5 yp5Var = this.a;
                yp5Var.z.x(mq2.C(tp5Var.g.t(8)));
                yp5.y(yp5Var, tp5Var);
                this.w = null;
            }
        }
    }

    @Override // defpackage.jj3
    public final tp5 t(View view, tp5 tp5Var) {
        this.w = tp5Var;
        yp5 yp5Var = this.a;
        pi5 pi5Var = yp5Var.u;
        pp5 pp5Var = tp5Var.g;
        pi5Var.x(mq2.C(pp5Var.t(8)));
        if (this.m) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.q) {
            yp5Var.z.x(mq2.C(pp5Var.t(8)));
            yp5.y(yp5Var, tp5Var);
        }
        return yp5Var.h ? tp5.y : tp5Var;
    }

    @Override // defpackage.ri0
    public final void x(yo5 yo5Var) {
        this.m = false;
        this.q = false;
        tp5 tp5Var = this.w;
        if (yo5Var.g.y() > 0 && tp5Var != null) {
            pp5 pp5Var = tp5Var.g;
            yp5 yp5Var = this.a;
            yp5Var.z.x(mq2.C(pp5Var.t(8)));
            yp5Var.u.x(mq2.C(pp5Var.t(8)));
            yp5.y(yp5Var, tp5Var);
        }
        this.w = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
