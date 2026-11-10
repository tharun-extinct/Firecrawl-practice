package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ap1 {
    public static final ap1 a;
    public static final ap1 b;
    public static final ap1 c;
    public static final ap1 h;
    public static final ap1 i;
    public static final t32 j;
    public static final ap1 m;
    public static final /* synthetic */ ap1[] o;
    public static final ap1 p;
    public static final ap1 q;
    public static final ap1 s;
    public static final ap1 t;
    public static final ap1 u;
    public static final ap1 w;
    public static final ap1 z;

    static {
        ap1 ap1Var = new ap1("OK", 0);
        t = ap1Var;
        ap1 ap1Var2 = new ap1("CANCELLED", 1);
        a = ap1Var2;
        ap1 ap1Var3 = new ap1("UNKNOWN", 2);
        m = ap1Var3;
        ap1 ap1Var4 = new ap1("INVALID_ARGUMENT", 3);
        q = ap1Var4;
        ap1 ap1Var5 = new ap1("DEADLINE_EXCEEDED", 4);
        w = ap1Var5;
        ap1 ap1Var6 = new ap1("NOT_FOUND", 5);
        c = ap1Var6;
        ap1 ap1Var7 = new ap1("ALREADY_EXISTS", 6);
        ap1 ap1Var8 = new ap1("PERMISSION_DENIED", 7);
        i = ap1Var8;
        ap1 ap1Var9 = new ap1("RESOURCE_EXHAUSTED", 8);
        b = ap1Var9;
        ap1 ap1Var10 = new ap1("FAILED_PRECONDITION", 9);
        ap1 ap1Var11 = new ap1("ABORTED", 10);
        s = ap1Var11;
        ap1 ap1Var12 = new ap1("OUT_OF_RANGE", 11);
        ap1 ap1Var13 = new ap1("UNIMPLEMENTED", 12);
        p = ap1Var13;
        ap1 ap1Var14 = new ap1("INTERNAL", 13);
        u = ap1Var14;
        ap1 ap1Var15 = new ap1("UNAVAILABLE", 14);
        z = ap1Var15;
        ap1 ap1Var16 = new ap1("DATA_LOSS", 15);
        ap1 ap1Var17 = new ap1("UNAUTHENTICATED", 16);
        h = ap1Var17;
        o = new ap1[]{ap1Var, ap1Var2, ap1Var3, ap1Var4, ap1Var5, ap1Var6, ap1Var7, ap1Var8, ap1Var9, ap1Var10, ap1Var11, ap1Var12, ap1Var13, ap1Var14, ap1Var15, ap1Var16, ap1Var17};
        j = new t32((byte) 20);
        SparseArray sparseArray = new SparseArray();
        for (ap1 ap1Var18 : values()) {
            ap1 ap1Var19 = (ap1) sparseArray.get(ap1Var18.ordinal());
            if (ap1Var19 != null) {
                StringBuilder sb = new StringBuilder("Code value duplication between ");
                sb.append(ap1Var19);
                String strName = ap1Var18.name();
                sb.append('&');
                sb.append(strName);
                throw new IllegalStateException(sb.toString().toString());
            }
            sparseArray.put(ap1Var18.ordinal(), ap1Var18);
        }
    }

    public static ap1 valueOf(String str) {
        return (ap1) Enum.valueOf(ap1.class, str);
    }

    public static ap1[] values() {
        return (ap1[]) o.clone();
    }
}
