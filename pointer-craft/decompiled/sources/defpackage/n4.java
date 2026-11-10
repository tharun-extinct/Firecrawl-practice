package defpackage;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
@rf3("activity")
public class n4 extends sf3 {
    public final Activity r;

    public n4(Context context) {
        context.getClass();
        for (Object obj : dk4.L(context, new l1((byte) 3))) {
            if (((Context) obj) instanceof Activity) {
                this.r = (Activity) obj;
            }
        }
        obj = null;
        this.r = (Activity) obj;
    }

    @Override // defpackage.sf3
    public final ad3 g() {
        return new m4(this);
    }

    @Override // defpackage.sf3
    public final ad3 r(ad3 ad3Var) {
        throw new IllegalStateException(du4.w(((m4) ad3Var).t.g, "Destination ", " does not have an Intent set.").toString());
    }

    @Override // defpackage.sf3
    public final boolean x() {
        Activity activity = this.r;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
