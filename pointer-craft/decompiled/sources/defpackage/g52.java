package defpackage;

import android.content.Context;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class g52 {
    public final ah2 g;
    public static final rw3 y = new rw3("fire-global");
    public static final rw3 r = new rw3("fire-count");
    public static final rw3 n = new rw3("last-used-date");

    public g52(Context context, String str) {
        this.g = new ah2(context, "FirebaseHeartBeat".concat(str));
    }

    public static void n(db3 db3Var, String str) {
        rw3 rw3VarR = r(db3Var, str);
        if (rw3VarR == null) {
            return;
        }
        HashSet hashSet = new HashSet((Collection) m50.O(db3Var, rw3VarR, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            db3Var.n(rw3VarR);
        } else {
            db3Var.x(rw3VarR, hashSet);
        }
    }

    public static rw3 r(db3 db3Var, String str) {
        for (Map.Entry entry : db3Var.g().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        String str2 = ((rw3) entry.getKey()).g;
                        str2.getClass();
                        return new rw3(str2);
                    }
                }
            }
        }
        return null;
    }

    public static String y(long j) {
        if (Build.VERSION.SDK_INT < 26) {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
        }
        Instant instant = new Date(j).toInstant();
        ZoneOffset unused = ZoneOffset.UTC;
        LocalDateTime localDateTime = instant.atOffset(ZoneOffset.UTC).toLocalDateTime();
        DateTimeFormatter unused2 = DateTimeFormatter.ISO_LOCAL_DATE;
        return localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public final synchronized ArrayList g() {
        try {
            ArrayList arrayList = new ArrayList();
            String strY = y(System.currentTimeMillis());
            for (Map.Entry entry : ((Map) v70.N(ni1.j, new dy((Object) this.g, (mu0) null, (byte) 15))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strY);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(lu.g(((rw3) entry.getKey()).g, new ArrayList(hashSet)));
                    }
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.g.g(new eb(jCurrentTimeMillis, (byte) 2));
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized boolean v(rw3 rw3Var, long j) {
        if (y(((Long) this.g.y(rw3Var, -1L)).longValue()).equals(y(j))) {
            return false;
        }
        return true;
    }
}
