package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class gi5 {
    public static final Pattern g = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static gi5 y;

    public gi5(hi0 hi0Var) {
    }

    public final boolean g(wu wuVar) {
        if (TextUtils.isEmpty(wuVar.y())) {
            return true;
        }
        return wuVar.r() + wuVar.j() < (System.currentTimeMillis() / 1000) + 3600;
    }
}
