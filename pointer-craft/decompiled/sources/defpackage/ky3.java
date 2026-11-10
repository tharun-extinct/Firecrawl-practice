package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class ky3 implements gu2 {
    public static final ky3 b = new ky3();
    public int j;
    public Handler q;
    public int t;
    public boolean a = true;
    public boolean m = true;
    public final ju2 w = new ju2(this, true);
    public final k c = new k(this, 6);
    public final jy3 i = new jy3(this);

    @Override // defpackage.gu2
    public final ju2 a() {
        return this.w;
    }

    public final void g() {
        int i = this.t + 1;
        this.t = i;
        if (i == 1) {
            if (this.a) {
                this.w.n(vt2.ON_RESUME);
                this.a = false;
            } else {
                Handler handler = this.q;
                handler.getClass();
                handler.removeCallbacks(this.c);
            }
        }
    }
}
