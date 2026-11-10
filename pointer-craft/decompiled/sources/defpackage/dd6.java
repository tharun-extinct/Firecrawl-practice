package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dd6 {
    public static final StackTraceElement[] g = new StackTraceElement[0];

    public static final boolean g(g61 g61Var) {
        g61Var.getClass();
        return g61Var.f || g61Var.k || g61Var.m == 11 || g61Var.c == 0;
    }

    public static String r(l56 l56Var) {
        StringBuilder sb = new StringBuilder(l56Var.v());
        for (int i = 0; i < l56Var.v(); i++) {
            byte bG = l56Var.g(i);
            if (bG == 34) {
                sb.append("\\\"");
            } else if (bG == 39) {
                sb.append("\\'");
            } else if (bG != 92) {
                switch (bG) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bG < 32 || bG > 126) {
                            sb.append('\\');
                            sb.append((char) (((bG >>> 6) & 3) + 48));
                            sb.append((char) (((bG >>> 3) & 7) + 48));
                            sb.append((char) ((bG & 7) + 48));
                        } else {
                            sb.append((char) bG);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final void y(int i, int i2, jk4 jk4Var) {
        jk4Var.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(jk4Var.n(i4));
            }
            i3 >>>= 1;
        }
        String strG = jk4Var.g();
        strG.getClass();
        throw new e63(arrayList.size() == 1 ? "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + strG + "', but it was missing" : "Fields " + arrayList + " are required for type with serial name '" + strG + "', but they were missing", null);
    }
}
