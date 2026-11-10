package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mf1 implements Comparable {
    public static final aj6 j = new aj6(17);
    public static final long t = ye6.r(4611686018427387903L);
    public static final long a = ye6.r(-4611686018427387903L);

    public static final long a(long j2) {
        long j3 = ((-(j2 >> 1)) << 1) + ((long) (((int) j2) & 1));
        int i = of1.g;
        return j3;
    }

    public static final long g(long j2, long j3) {
        long j4 = j3 / 1000000;
        long jG = ye6.g(j2, j4);
        if (-4611686018426L > jG || jG >= 4611686018427L) {
            return ye6.r(jG);
        }
        long j5 = ((jG * 1000000) + (j3 - (j4 * 1000000))) << 1;
        int i = of1.g;
        return j5;
    }

    public static final long j(long j2, pf1 pf1Var) {
        if (j2 == t) {
            return Long.MAX_VALUE;
        }
        if (j2 == a) {
            return Long.MIN_VALUE;
        }
        return pf1Var.j.convert(j2 >> 1, ((((int) j2) & 1) == 0 ? pf1.NANOSECONDS : pf1.MILLISECONDS).j);
    }

    public static final long l(long j2, long j3) {
        int i = ((int) j2) & 1;
        if (i != (((int) j3) & 1)) {
            return i == 1 ? g(j2 >> 1, j3 >> 1) : g(j3 >> 1, j2 >> 1);
        }
        if (i == 0) {
            long j4 = (j2 >> 1) + (j3 >> 1);
            if (-4611686018426999999L > j4 || j4 >= 4611686018427000000L) {
                return ye6.r(j4 / 1000000);
            }
            long j5 = j4 << 1;
            int i2 = of1.g;
            return j5;
        }
        long jG = ye6.g(j2 >> 1, j3 >> 1);
        if (jG == 9223372036854759646L) {
            l0.u("Summing infinite durations of different signs yields an undefined result.");
            return 0L;
        }
        if (jG == 4611686018427387903L || jG == -4611686018427387903L) {
            return ye6.r(jG);
        }
        if (-4611686018426L > jG || jG >= 4611686018427L) {
            return ye6.r(xs2.c(jG, -4611686018427387903L, 4611686018427387903L));
        }
        long j6 = (jG * 1000000) << 1;
        int i3 = of1.g;
        return j6;
    }

    public static final long n(long j2) {
        return ((((int) j2) & 1) != 1 || v(j2)) ? j(j2, pf1.MILLISECONDS) : j2 >> 1;
    }

    public static int r(long j2, long j3) {
        long j4 = j2 ^ j3;
        if (j4 < 0 || (((int) j4) & 1) == 0) {
            return yf2.k(j2, j3);
        }
        int i = (((int) j2) & 1) - (((int) j3) & 1);
        return j2 < 0 ? -i : i;
    }

    public static String t(long j2) {
        int i;
        if (j2 == 0) {
            return "0s";
        }
        if (j2 == t) {
            return "Infinity";
        }
        if (j2 == a) {
            return "-Infinity";
        }
        int i2 = 0;
        boolean z = j2 < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (j2 < 0) {
            j2 = a(j2);
        }
        long j3 = j(j2, pf1.DAYS);
        int iJ = v(j2) ? 0 : (int) (j(j2, pf1.HOURS) % 24);
        int iJ2 = v(j2) ? 0 : (int) (j(j2, pf1.MINUTES) % 60);
        int iJ3 = v(j2) ? 0 : (int) (j(j2, pf1.SECONDS) % 60);
        if (v(j2)) {
            i = 0;
        } else {
            i = (int) ((((int) j2) & 1) == 1 ? ((j2 >> 1) % 1000) * 1000000 : (j2 >> 1) % 1000000000);
        }
        boolean z2 = j3 != 0;
        boolean z3 = iJ != 0;
        boolean z4 = iJ2 != 0;
        boolean z5 = (iJ3 == 0 && i == 0) ? false : true;
        if (z2) {
            sb.append(j3);
            sb.append('d');
            i2 = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i3 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(iJ);
            sb.append('h');
            i2 = i3;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i4 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(iJ2);
            sb.append('m');
            i2 = i4;
        }
        if (z5) {
            int i5 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            if (iJ3 != 0 || z2 || z3 || z4) {
                y(sb, iJ3, i, 9, "s", false);
            } else if (i >= 1000000) {
                y(sb, i / 1000000, i % 1000000, 6, "ms", false);
            } else if (i >= 1000) {
                y(sb, i / 1000, i % 1000, 3, "us", false);
            } else {
                sb.append(i);
                sb.append("ns");
            }
            i2 = i5;
        }
        if (z && i2 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final boolean v(long j2) {
        return j2 == t || j2 == a;
    }

    public static final boolean x(long j2) {
        return j2 > 0;
    }

    public static final void y(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strB0 = tx4.b0(String.valueOf(i2), i3);
            int i4 = -1;
            int length = strB0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strB0.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) strB0, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strB0, 0, i6);
            }
        }
        sb.append(str);
    }
}
