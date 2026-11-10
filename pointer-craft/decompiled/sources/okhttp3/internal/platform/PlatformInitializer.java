package okhttp3.internal.platform;

import android.content.Context;
import defpackage.fu0;
import defpackage.ic2;
import defpackage.pi1;
import defpackage.ys3;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PlatformInitializer implements ic2 {
    @Override // defpackage.ic2
    public final List g() {
        return pi1.j;
    }

    @Override // defpackage.ic2
    public final Object y(Context context) {
        context.getClass();
        ys3 ys3Var = ys3.g;
        Object obj = ys3.g;
        fu0 fu0Var = obj != null ? (fu0) obj : null;
        if (fu0Var != null) {
            fu0Var.g(context);
        }
        return ys3.g;
    }
}
