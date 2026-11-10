package defpackage;

import io.appground.blek.R;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class je5 extends le5 {
    public static final je5 g = new je5();
    public static final List y = pw5.d(nj.n, nj.y, nj.r);

    @Override // defpackage.le5
    public final int g() {
        return 8;
    }

    @Override // defpackage.le5
    public final me5 n(jj jjVar) {
        if (jjVar.equals(nj.n)) {
            return ce5.a;
        }
        if (jjVar.equals(nj.y)) {
            return ce5.j;
        }
        return jjVar.equals(nj.r) ? ce5.v : this;
    }

    @Override // defpackage.le5
    public final int r() {
        return R.string.question_screen_locked;
    }

    @Override // defpackage.le5
    public final List y() {
        return y;
    }
}
