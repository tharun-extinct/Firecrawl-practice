package defpackage;

import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class sf1 implements tf1 {
    public Long g;

    @Override // defpackage.tf1
    public final boolean y() {
        Long l = this.g;
        if (l == null) {
            try {
                Method declaredMethod = Build.class.getDeclaredMethod("getLong", String.class);
                declaredMethod.setAccessible(true);
                l = (Long) declaredMethod.invoke(null, "ro.build.version.oneui");
                l.longValue();
                this.g = l;
            } catch (Exception unused) {
                l = -1L;
                this.g = l;
            }
        }
        return l.longValue() >= 40100;
    }
}
