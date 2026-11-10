package defpackage;

import android.content.Context;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class io4 {
    public static final ll0 y;
    public final Context g;

    static {
        kl0 kl0VarG = ll0.g(io4.class);
        kl0VarG.g(p51.g(f63.class));
        kl0VarG.g(p51.g(Context.class));
        kl0VarG.x = l76.i;
        y = kl0VarG.y();
    }

    public io4(Context context) {
        this.g = context;
    }

    public final synchronized String g() {
        String string = this.g.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        this.g.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", string2).apply();
        return string2;
    }
}
