package defpackage;

import io.appground.blek.R;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class he5 extends le5 {
    public static final he5 g = new he5();
    public static final List y = pw5.d(mj.r, mj.y);

    @Override // defpackage.le5
    public final int g() {
        return 7;
    }

    @Override // defpackage.le5
    public final me5 n(jj jjVar) {
        if (jjVar.equals(mj.r)) {
            return je5.g;
        }
        return jjVar.equals(mj.y) ? ce5.l : this;
    }

    @Override // defpackage.le5
    public final int r() {
        return R.string.question_devices_restarted;
    }

    @Override // defpackage.le5
    public final List y() {
        return y;
    }
}
