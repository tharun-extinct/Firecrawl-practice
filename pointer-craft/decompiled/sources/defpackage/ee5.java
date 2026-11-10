package defpackage;

import io.appground.blek.R;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ee5 extends le5 {
    public static final ee5 g = new ee5();
    public static final List y = pw5.d(ij.n, ij.r, ij.y, ij.v);

    @Override // defpackage.le5
    public final int g() {
        return 6;
    }

    @Override // defpackage.le5
    public final me5 n(jj jjVar) {
        if (jjVar.equals(ij.n)) {
            return he5.g;
        }
        if (jjVar.equals(ij.r)) {
            return ce5.y;
        }
        if (jjVar.equals(ij.y)) {
            return je5.g;
        }
        return jjVar.equals(ij.v) ? ce5.t : this;
    }

    @Override // defpackage.le5
    public final int r() {
        return R.string.question_connection_issue;
    }

    @Override // defpackage.le5
    public final List y() {
        return y;
    }
}
