package defpackage;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class vc {
    public static final CopyOnWriteArraySet g = new CopyOnWriteArraySet();
    public static final Map y;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = hj3.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(hj3.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(g82.class.getName(), "okhttp.Http2");
        linkedHashMap.put(b35.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        y = v13.J(linkedHashMap);
    }

    public static void g(String str, int i, String str2, Throwable th) {
        int iMin;
        String strN0 = (String) y.get(str);
        if (strN0 == null) {
            strN0 = tx4.n0(str, 23);
        }
        if (Log.isLoggable(strN0, i)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i2 = 0;
            while (i2 < length) {
                int iV = tx4.V(str2, '\n', i2, 4);
                if (iV == -1) {
                    iV = length;
                }
                while (true) {
                    iMin = Math.min(iV, i2 + 4000);
                    Log.println(i, strN0, str2.substring(i2, iMin));
                    if (iMin >= iV) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }

    public static void y(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (g.add(logger)) {
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else {
                level = Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(wc.g);
        }
    }
}
