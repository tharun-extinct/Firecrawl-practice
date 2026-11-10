package defpackage;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class x26 {
    public final sa0 g = new sa0();
    public volatile Logger r;
    public final String y;

    public x26(Class cls) {
        this.y = cls.getName();
    }

    public final Logger g() {
        Logger logger = this.r;
        if (logger != null) {
            return logger;
        }
        synchronized (this.g) {
            try {
                Logger logger2 = this.r;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.y);
                this.r = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
