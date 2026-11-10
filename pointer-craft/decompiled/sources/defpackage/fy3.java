package defpackage;

import android.os.SystemClock;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class fy3 implements va1 {
    public final /* synthetic */ b30 g;
    public final /* synthetic */ String n;
    public final /* synthetic */ long r;
    public final /* synthetic */ ob3 v;
    public final /* synthetic */ ob3 x;
    public final /* synthetic */ UUID y;

    public fy3(b30 b30Var, UUID uuid, long j, String str, ob3 ob3Var, ob3 ob3Var2) {
        this.g = b30Var;
        this.y = uuid;
        this.r = j;
        this.n = str;
        this.v = ob3Var;
        this.x = ob3Var2;
    }

    @Override // defpackage.va1
    public final void g() {
        if (((Boolean) this.v.getValue()).booleanValue() || ((Boolean) this.x.getValue()).booleanValue()) {
            return;
        }
        b30 b30Var = this.g;
        this.y.getClass();
        UUID uuid = this.y;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.r;
        String str = this.n;
        b30Var.getClass();
        uuid.getClass();
        str.getClass();
        v20 v20Var = b30Var.r;
        v20Var.getClass();
        w10 w10Var = v20Var.g;
        w10Var.getClass();
        String strName = ((fz3) w10Var.E.getValue()).name();
        Locale locale = Locale.ROOT;
        locale.getClass();
        String lowerCase = strName.toLowerCase(locale);
        lowerCase.getClass();
        m50.T(w10Var.t, null, new s10(w10Var.s, w10Var, uuid, lowerCase, jElapsedRealtime, str, (mu0) null), 3);
    }
}
