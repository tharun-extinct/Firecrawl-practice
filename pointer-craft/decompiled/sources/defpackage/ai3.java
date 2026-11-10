package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class ai3 {
    public final NotificationManager g;

    static {
        new HashSet();
    }

    public ai3(Context context) {
        this.g = (NotificationManager) context.getSystemService("notification");
    }

    public static ai3 y(Context context) {
        return new ai3(context);
    }

    public final boolean g() {
        return this.g.areNotificationsEnabled();
    }
}
