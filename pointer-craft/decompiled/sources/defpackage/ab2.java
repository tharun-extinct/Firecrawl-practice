package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ab2 extends he1 {
    public dj5 f;
    public kf0 h;
    public vv o;

    /* JADX WARN: Code duplicated, block: B:52:0x00f4  */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        dj5 dj5Var;
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.u)) {
            xi xiVar = this.a;
            qf0 qf0Var = this.t;
            if (xiVar != null && Settings.Global.getFloat(this.j.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && (dj5Var = this.f) != null) {
                dj5Var.setBounds(getBounds());
                this.f.setTint(qf0Var.v[0]);
                this.f.draw(canvas);
                return;
            }
            canvas.save();
            kf0 kf0Var = this.h;
            Rect bounds = getBounds();
            float fY = y();
            ObjectAnimator objectAnimator = this.m;
            boolean z = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.q;
            kf0Var.y(canvas, bounds, fY, z, objectAnimator2 != null && objectAnimator2.isRunning());
            int i2 = qf0Var.t;
            int i3 = this.p;
            boolean z2 = (qf0Var instanceof qf0) && qf0Var.h;
            boolean z3 = z2 && i2 == 0 && !qf0Var.g(false);
            Paint paint = this.s;
            if (!z3) {
                if (z2) {
                    ye1 ye1Var = (ye1) ((ArrayList) this.o.y).get(0);
                    ArrayList arrayList = (ArrayList) this.o.y;
                    ye1 ye1Var2 = (ye1) arrayList.get(arrayList.size() - 1);
                    canvas.save();
                    canvas.rotate(ye1Var2.x);
                    i = i2;
                    this.h.x(canvas, paint, ye1Var2.y, ye1Var.g + 1.0f, qf0Var.x, i3, i);
                    canvas.restore();
                }
                for (int i4 = 0; i4 < ((ArrayList) this.o.y).size(); i4++) {
                    ye1 ye1Var3 = (ye1) ((ArrayList) this.o.y).get(i4);
                    ye1Var3.v = r();
                    this.h.v(canvas, paint, ye1Var3, this.p);
                    if (i4 <= 0 && !z3 && z2) {
                        this.h.x(canvas, paint, ((ye1) ((ArrayList) this.o.y).get(i4 - 1)).y, ye1Var3.g, qf0Var.x, i3, i);
                    }
                }
                canvas.restore();
            }
            this.h.x(canvas, paint, 0.0f, 1.0f, qf0Var.x, i3, 0);
            i = i2;
            while (i4 < ((ArrayList) this.o.y).size()) {
                ye1 ye1Var4 = (ye1) ((ArrayList) this.o.y).get(i4);
                ye1Var4.v = r();
                this.h.v(canvas, paint, ye1Var4, this.p);
                if (i4 <= 0) {
                }
            }
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.h.l();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.h.l();
    }

    @Override // defpackage.he1
    public final boolean v(boolean z, boolean z2, boolean z3) {
        dj5 dj5Var;
        boolean zV = super.v(z, z2, z3);
        if (this.a != null && Settings.Global.getFloat(this.j.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && (dj5Var = this.f) != null) {
            return dj5Var.setVisible(z, z2);
        }
        if (!isRunning()) {
            this.o.g();
        }
        if (z && z3) {
            this.o.m();
        }
        return zV;
    }
}
