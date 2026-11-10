package defpackage;

import android.content.res.Configuration;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dt5 {
    public static gt5 g;
    public static final float[] y = new float[91];

    public static long a() {
        return fi2.f;
    }

    public static long b() {
        return fi2.u;
    }

    public static long c() {
        return fi2.F;
    }

    public static String g(da0 da0Var) {
        StringBuilder sb = new StringBuilder(da0Var.size());
        for (int i = 0; i < da0Var.size(); i++) {
            byte bG = da0Var.g(i);
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

    public static long i() {
        return fi2.E;
    }

    public static long j() {
        return fi2.n;
    }

    public static long l() {
        return fi2.l;
    }

    public static long m() {
        return fi2.r;
    }

    public static long n() {
        return fi2.j;
    }

    public static long q() {
        return fi2.y;
    }

    public static long r() {
        return fi2.g;
    }

    public static long s() {
        return fi2.p;
    }

    public static long t() {
        return fi2.z;
    }

    public static long v() {
        return fi2.v;
    }

    public static long w() {
        return fi2.G;
    }

    public static long x() {
        return fi2.x;
    }

    public static void y(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
            configuration3.colorMode |= configuration2.colorMode & 3;
        }
        if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
            configuration3.colorMode |= configuration2.colorMode & 12;
        }
    }
}
