package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class kh1 extends ue5 {
    public final /* synthetic */ lh1 f;

    public kh1(lh1 lh1Var) {
        this.f = lh1Var;
    }

    @Override // defpackage.ue5
    public final void Z(Throwable th) {
        this.f.g.x(th);
    }

    @Override // defpackage.ue5
    public final void c0(kb5 kb5Var) {
        lh1 lh1Var = this.f;
        lh1Var.r = kb5Var;
        kb5 kb5Var2 = lh1Var.r;
        ph1 ph1Var = lh1Var.g;
        lh1Var.y = new ro(kb5Var2, ph1Var.l, ph1Var.t, Build.VERSION.SDK_INT >= 34 ? vh1.g() : pw5.p());
        ph1 ph1Var2 = lh1Var.g;
        ArrayList arrayList = new ArrayList();
        ph1Var2.g.writeLock().lock();
        try {
            ph1Var2.r = (byte) 1;
            arrayList.addAll(ph1Var2.y);
            ph1Var2.y.clear();
            ph1Var2.g.writeLock().unlock();
            ph1Var2.n.post(new nh1(arrayList, ph1Var2.r, null));
        } catch (Throwable th) {
            ph1Var2.g.writeLock().unlock();
            throw th;
        }
    }
}
