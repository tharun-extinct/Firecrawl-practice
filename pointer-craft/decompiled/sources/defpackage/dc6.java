package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dc6 {
    public static final t32 g = new t32((byte) 22);

    public static final long a(long j) {
        return zs0.g(ws0.m(j), ws0.t(j), ws0.a(j), ws0.j(j));
    }

    public static ih0 g(ih0 ih0Var, s30 s30Var, int i) {
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 8) == 0;
        ih0Var.getClass();
        s30Var.getClass();
        ih0 ih0Var2 = ih0.t;
        if (z) {
            return ih0Var2;
        }
        ih0 ih0Var3 = ih0.j;
        s30 s30Var2 = s30.m;
        if (z2 && s30Var == s30Var2) {
            return ih0Var3;
        }
        ih0 ih0Var4 = ih0.a;
        if (ih0Var == ih0Var2 && (s30Var == s30.t || s30Var == s30.q)) {
            return ih0Var4;
        }
        return (ih0Var == ih0Var4 && s30Var == s30Var2) ? ih0Var3 : ih0Var;
    }

    public static final boolean j(Context context) {
        context.getClass();
        return Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
    }

    public static long l(int i, long j) {
        return zs0.g(0, ws0.t(j), (i & 4) != 0 ? ws0.a(j) : 0, ws0.j(j));
    }

    public static final jh0 n(boolean z, boolean z2) {
        if (z2) {
            return jh0.a;
        }
        return z ? jh0.t : jh0.j;
    }

    public static boolean r(boolean z, boolean z2) {
        String str = Build.MANUFACTURER;
        str.getClass();
        return z && !z2 && Build.VERSION.SDK_INT >= 36 && str.equalsIgnoreCase("motorola");
    }

    public static final kh0 t(Context context) {
        kh0 kh0Var = kh0.j;
        context.getClass();
        boolean zJ = j(context);
        try {
            context.startActivity(y(zJ).addFlags(268435456));
            return zJ ? kh0.t : kh0Var;
        } catch (ActivityNotFoundException | SecurityException unused) {
            if (!zJ) {
                return null;
            }
            try {
                context.startActivity(y(false).addFlags(268435456));
                return kh0Var;
            } catch (ActivityNotFoundException | SecurityException unused2) {
                return null;
            }
        }
    }

    public static long x(long j, jn2 jn2Var) {
        jn2 jn2Var2 = jn2.j;
        return zs0.g(jn2Var == jn2Var2 ? ws0.m(j) : ws0.a(j), jn2Var == jn2Var2 ? ws0.t(j) : ws0.j(j), jn2Var == jn2Var2 ? ws0.a(j) : ws0.m(j), jn2Var == jn2Var2 ? ws0.j(j) : ws0.t(j));
    }

    public static final Intent y(boolean z) {
        if (!z) {
            return new Intent("android.settings.DEVICE_INFO_SETTINGS");
        }
        Intent intent = new Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS");
        intent.putExtra(":settings:fragment_args_key", "bluetooth_hid_device_profile");
        Bundle bundle = new Bundle();
        bundle.putString(":settings:fragment_args_key", "bluetooth_hid_device_profile");
        intent.putExtra(":settings:show_fragment_args", bundle);
        return intent;
    }

    public abstract void v(IOException iOException);
}
