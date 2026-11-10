package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class br5 extends z53 {
    public final Context n;
    public final /* synthetic */ byte r = 1;

    public br5(Context context) {
        super(9, 10);
        this.n = context;
    }

    @Override // defpackage.z53
    public final void g(zx1 zx1Var) {
        byte b = this.r;
        Context context = this.n;
        switch (b) {
            case 0:
                if (this.y >= 10) {
                    zx1Var.i(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    context.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                zx1Var.w("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    zx1Var.y();
                    try {
                        zx1Var.i(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                        zx1Var.i(new Object[]{"reschedule_needed", Long.valueOf(j2)});
                        sharedPreferences.edit().clear().apply();
                        zx1Var.u();
                        zx1Var.a();
                    } catch (Throwable th) {
                        zx1Var.a();
                        throw th;
                    }
                }
                v92.J(context, zx1Var);
                return;
        }
    }

    public br5(Context context, int i, int i2) {
        super(i, i2);
        this.n = context;
    }
}
