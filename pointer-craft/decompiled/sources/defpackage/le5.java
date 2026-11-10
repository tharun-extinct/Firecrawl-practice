package defpackage;

import io.appground.blek.R;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class le5 extends me5 {
    public int g() {
        return 3;
    }

    public me5 n(jj jjVar) {
        if (jjVar.equals(nj.n)) {
            return ke5.g;
        }
        if (jjVar.equals(nj.y)) {
            return ce5.n;
        }
        return jjVar.equals(nj.r) ? ce5.x : this;
    }

    public int r() {
        return R.string.question_bluetooth_enabled;
    }

    public List y() {
        return de5.y;
    }
}
