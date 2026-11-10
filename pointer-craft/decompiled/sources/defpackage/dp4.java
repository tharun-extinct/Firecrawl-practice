package defpackage;

import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class dp4 implements Callable {
    public final /* synthetic */ String g;
    public final /* synthetic */ ShortcutInfoCompatSaverImpl y;

    public dp4(ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, String str) {
        this.y = shortcutInfoCompatSaverImpl;
        this.g = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return (hp4) this.y.y.get(this.g);
    }
}
