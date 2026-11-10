package defpackage;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ts5 {
    public static final Logger g = Logger.getLogger("okio.Okio");

    public static final boolean g(AssertionError assertionError) {
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? tx4.Q(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }
}
