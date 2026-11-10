package defpackage;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class zi2 {
    public final File g;

    public zi2(Context context) {
        context.getClass();
        File file = new File(context.getFilesDir(), "custom_layouts");
        file.mkdirs();
        this.g = file;
    }

    public final to2 g(String str) {
        File file = new File(this.g, tx4.d0("custom:", str).concat(".pb"));
        if (!file.exists()) {
            return null;
        }
        try {
            return to2.z(ue5.j0(file));
        } catch (Exception unused) {
            return null;
        }
    }
}
