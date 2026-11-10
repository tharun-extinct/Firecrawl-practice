package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class i44 implements fd4 {
    public final LinkedHashSet g = new LinkedHashSet();

    public i44(ji jiVar) {
        jiVar.T("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.fd4
    public final Bundle g() {
        Bundle bundleN = a11.n((fp3[]) Arrays.copyOf(new fp3[0], 0));
        aq2.B(bundleN, "classes_to_restore", cj0.F0(this.g));
        return bundleN;
    }

    public final void y(String str) {
        this.g.add(str);
    }
}
