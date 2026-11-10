package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* JADX INFO: loaded from: classes.dex */
public final class d15 {
    public static final String y = iy2.v("SystemJobInfoConverter");
    public final ComponentName g;

    public d15(Context context) {
        this.g = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
