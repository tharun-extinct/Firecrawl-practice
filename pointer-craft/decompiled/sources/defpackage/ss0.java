package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class ss0 {
    public static final String x = iy2.v("ConstraintTracker");
    public final zl5 g;
    public Object v;
    public final Context y;
    public final Object r = new Object();
    public final LinkedHashSet n = new LinkedHashSet();

    public ss0(Context context, zl5 zl5Var) {
        this.y = context.getApplicationContext();
        this.g = zl5Var;
    }

    public Object g() {
        Intent intentRegisterReceiver = this.y.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            iy2.r().y(d00.t, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        return Boolean.valueOf(intExtra == 2 || intExtra == 5);
    }

    public abstract void n();

    public final void r(Object obj) {
        synchronized (this.r) {
            try {
                Object obj2 = this.v;
                if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    this.v = obj;
                    ((mc4) this.g.r).execute(new i26((byte) 6, this, new ArrayList(this.n), false));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void v();

    public final void y(cs0 cs0Var) {
        synchronized (this.r) {
            try {
                if (this.n.remove(cs0Var) && this.n.isEmpty()) {
                    v();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
