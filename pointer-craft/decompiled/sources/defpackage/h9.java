package defpackage;

import android.content.ClipboardManager;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class h9 implements ci0 {
    public final Context g;
    public ClipboardManager y;

    public h9(Context context) {
        this.g = context;
    }

    public final ClipboardManager g() {
        ClipboardManager clipboardManager = this.y;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        Object systemService = this.g.getSystemService("clipboard");
        systemService.getClass();
        ClipboardManager clipboardManager2 = (ClipboardManager) systemService;
        this.y = clipboardManager2;
        return clipboardManager2;
    }
}
