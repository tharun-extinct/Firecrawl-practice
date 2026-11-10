package defpackage;

import android.graphics.Bitmap;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class nc {
    public final Bitmap g;

    public nc(Bitmap bitmap) {
        this.g = bitmap;
    }

    public final int g() {
        Bitmap.Config config = this.g.getConfig();
        config.getClass();
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || config != Bitmap.Config.RGBA_F16) {
            return (i < 26 || config != Bitmap.Config.HARDWARE) ? 0 : 4;
        }
        return 3;
    }
}
