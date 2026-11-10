package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y72 {
    public static final b52[] g;
    public static final Map y;

    static {
        b52 b52Var = new b52(b52.t, "");
        fa0 fa0Var = b52.x;
        b52 b52Var2 = new b52(fa0Var, "GET");
        b52 b52Var3 = new b52(fa0Var, "POST");
        fa0 fa0Var2 = b52.l;
        b52 b52Var4 = new b52(fa0Var2, "/");
        b52 b52Var5 = new b52(fa0Var2, "/index.html");
        fa0 fa0Var3 = b52.j;
        b52 b52Var6 = new b52(fa0Var3, "http");
        b52 b52Var7 = new b52(fa0Var3, "https");
        fa0 fa0Var4 = b52.v;
        b52[] b52VarArr = {b52Var, b52Var2, b52Var3, b52Var4, b52Var5, b52Var6, b52Var7, new b52(fa0Var4, "200"), new b52(fa0Var4, "204"), new b52(fa0Var4, "206"), new b52(fa0Var4, "304"), new b52(fa0Var4, "400"), new b52(fa0Var4, "404"), new b52(fa0Var4, "500"), new b52("accept-charset", ""), new b52("accept-encoding", "gzip, deflate"), new b52("accept-language", ""), new b52("accept-ranges", ""), new b52("accept", ""), new b52("access-control-allow-origin", ""), new b52("age", ""), new b52("allow", ""), new b52("authorization", ""), new b52("cache-control", ""), new b52("content-disposition", ""), new b52("content-encoding", ""), new b52("content-language", ""), new b52("content-length", ""), new b52("content-location", ""), new b52("content-range", ""), new b52("content-type", ""), new b52("cookie", ""), new b52("date", ""), new b52("etag", ""), new b52("expect", ""), new b52("expires", ""), new b52("from", ""), new b52("host", ""), new b52("if-match", ""), new b52("if-modified-since", ""), new b52("if-none-match", ""), new b52("if-range", ""), new b52("if-unmodified-since", ""), new b52("last-modified", ""), new b52("link", ""), new b52("location", ""), new b52("max-forwards", ""), new b52("proxy-authenticate", ""), new b52("proxy-authorization", ""), new b52("range", ""), new b52("referer", ""), new b52("refresh", ""), new b52("retry-after", ""), new b52("server", ""), new b52("set-cookie", ""), new b52("strict-transport-security", ""), new b52("transfer-encoding", ""), new b52("user-agent", ""), new b52("vary", ""), new b52("via", ""), new b52("www-authenticate", "")};
        g = b52VarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(b52VarArr[i].g)) {
                linkedHashMap.put(b52VarArr[i].g, Integer.valueOf(i));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        y = mapUnmodifiableMap;
    }

    public static void g(fa0 fa0Var) throws IOException {
        fa0Var.getClass();
        int iY = fa0Var.y();
        for (int i = 0; i < iY; i++) {
            byte bV = fa0Var.v(i);
            if (65 <= bV && bV < 91) {
                uo1.t("PROTOCOL_ERROR response malformed: mixed case name: ".concat(fa0Var.q()));
                return;
            }
        }
    }
}
