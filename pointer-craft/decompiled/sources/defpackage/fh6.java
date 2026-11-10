package defpackage;

import android.view.ViewConfiguration;
import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fh6 {
    public static final String g(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / 1000000000) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / 1000000) + " ms";
        } else if (j <= 0) {
            str = ((j - 500) / 1000) + " µs";
        } else if (j < 999500) {
            str = ((j + 500) / 1000) + " µs";
        } else if (j < 999500000) {
            str = ((j + 500000) / 1000000) + " ms";
        } else {
            str = ((j + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static final v92 n(fg4 fg4Var) {
        return new v92((Object) ViewConfiguration.get(c93.D(fg4Var).getContext()), (byte) 3);
    }

    public static final boolean r(String str) {
        str.getClass();
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static final void y(Logger logger, u25 u25Var, a35 a35Var, String str) {
        logger.fine(a35Var.y + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + u25Var.g);
    }
}
