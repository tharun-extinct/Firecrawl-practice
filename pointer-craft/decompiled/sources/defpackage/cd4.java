package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class cd4 implements fd4 {
    public final ji g;
    public final o05 n;
    public Bundle r;
    public boolean y;

    public cd4(ji jiVar, wl5 wl5Var) {
        jiVar.getClass();
        this.g = jiVar;
        this.n = new o05(new gf(wl5Var, (byte) 29));
    }

    @Override // defpackage.fd4
    public final Bundle g() {
        Bundle bundleN = a11.n((fp3[]) Arrays.copyOf(new fp3[0], 0));
        Bundle bundle = this.r;
        if (bundle != null) {
            bundleN.putAll(bundle);
        }
        for (Map.Entry entry : ((dd4) this.n.getValue()).y.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleG = ((rl0) ((yc4) entry.getValue()).y.q).g();
            if (!bundleG.isEmpty()) {
                str.getClass();
                bundleN.putBundle(str, bundleG);
            }
        }
        this.y = false;
        return bundleN;
    }

    public final void y() {
        if (this.y) {
            return;
        }
        Bundle bundleA = this.g.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleN = a11.n((fp3[]) Arrays.copyOf(new fp3[0], 0));
        Bundle bundle = this.r;
        if (bundle != null) {
            bundleN.putAll(bundle);
        }
        if (bundleA != null) {
            bundleN.putAll(bundleA);
        }
        this.r = bundleN;
        this.y = true;
    }
}
