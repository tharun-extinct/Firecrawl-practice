package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class gt4 implements Iterable, vh2 {
    public static final gt4 q = new gt4(0, 0, 0, null);
    public final long a;
    public final long j;
    public final long[] m;
    public final long t;

    public gt4(long j, long j2, long j3, long[] jArr) {
        this.j = j;
        this.t = j2;
        this.a = j3;
        this.m = jArr;
    }

    public final gt4 g(gt4 gt4Var) {
        long[] jArr;
        gt4 gt4VarY = this;
        gt4 gt4Var2 = q;
        if (gt4Var == gt4Var2) {
            return gt4VarY;
        }
        if (gt4VarY == gt4Var2) {
            return gt4Var2;
        }
        long j = gt4Var.a;
        long j2 = gt4Var.a;
        long[] jArr2 = gt4Var.m;
        long j3 = gt4Var.t;
        long j4 = gt4Var.j;
        long j5 = gt4VarY.a;
        if (j == j5 && jArr2 == (jArr = gt4VarY.m)) {
            return new gt4(gt4VarY.j & (~j4), gt4VarY.t & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                gt4VarY = gt4VarY.y(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    gt4VarY = gt4VarY.y(((long) i) + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    gt4VarY = gt4VarY.y(((long) i2) + j2 + 64);
                }
            }
        }
        return gt4VarY;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ek4(new ft4(this, null), (byte) 0).iterator();
    }

    public final boolean n(long j) {
        long[] jArr;
        long j2 = j - this.a;
        if (yf2.k(j2, 0L) >= 0 && yf2.k(j2, 64L) < 0) {
            return ((1 << ((int) j2)) & this.t) != 0;
        }
        if (yf2.k(j2, 64L) < 0 || yf2.k(j2, 128L) >= 0) {
            return yf2.k(j2, 0L) <= 0 && (jArr = this.m) != null && sp2.v(jArr, j) >= 0;
        }
        return ((1 << (((int) j2) + (-64))) & this.j) != 0;
    }

    public final String toString() {
        String string = super.toString();
        ArrayList arrayList = new ArrayList(dj0.Y(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) obj.toString());
            }
        }
        sb.append((CharSequence) "");
        return string + " [" + sb.toString() + "]";
    }

    public final gt4 v(gt4 gt4Var) {
        gt4 gt4VarX;
        long[] jArr;
        gt4 gt4VarX2 = this;
        gt4 gt4Var2 = q;
        if (gt4Var == gt4Var2) {
            return gt4VarX2;
        }
        if (gt4VarX2 == gt4Var2) {
            return gt4Var;
        }
        long j = gt4Var.a;
        long j2 = gt4Var.a;
        long[] jArr2 = gt4Var.m;
        long j3 = gt4Var.t;
        long j4 = gt4Var.j;
        long j5 = gt4VarX2.a;
        long j6 = gt4VarX2.t;
        long j7 = gt4VarX2.j;
        if (j == j5 && jArr2 == (jArr = gt4VarX2.m)) {
            return new gt4(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = gt4VarX2.m;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    gt4VarX2 = gt4VarX2.x(j8);
                }
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        gt4VarX2 = gt4VarX2.x(((long) i2) + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        gt4VarX2 = gt4VarX2.x(((long) i) + j2 + 64);
                    }
                    i++;
                }
            }
            return gt4VarX2;
        }
        if (jArr3 != null) {
            gt4VarX = gt4Var;
            for (long j9 : jArr3) {
                gt4VarX = gt4VarX.x(j9);
            }
        } else {
            gt4VarX = gt4Var;
        }
        long j10 = gt4VarX2.a;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    gt4VarX = gt4VarX.x(((long) i3) + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    gt4VarX = gt4VarX.x(((long) i) + j10 + 64);
                }
                i++;
            }
        }
        return gt4VarX;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00fa  */
    public final gt4 x(long j) {
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4 = this.a;
        long j5 = j - j4;
        long j6 = 0;
        int iK = yf2.k(j5, 0L);
        long j7 = this.t;
        if (iK < 0 || yf2.k(j5, 64L) >= 0) {
            int iK2 = yf2.k(j5, 64L);
            long j8 = this.j;
            int i2 = 64;
            if (iK2 < 0 || yf2.k(j5, 128L) >= 0) {
                int iK3 = yf2.k(j5, 128L);
                long[] jArr3 = this.m;
                if (iK3 < 0) {
                    if (jArr3 == null) {
                        return new gt4(this.j, this.t, this.a, new long[]{j});
                    }
                    int iV = sp2.v(jArr3, j);
                    if (iV < 0) {
                        int i3 = -(iV + 1);
                        int length = jArr3.length;
                        long[] jArr4 = new long[length + 1];
                        pr.N(jArr3, jArr4, 0, 0, i3);
                        pr.N(jArr3, jArr4, i3 + 1, i3, length);
                        jArr4[i3] = j;
                        return new gt4(this.j, this.t, this.a, jArr4);
                    }
                } else if (!n(j)) {
                    long j9 = ((j + 1) / 64) * 64;
                    if (yf2.k(j9, 0L) < 0) {
                        j9 = 9223372036854775680L;
                    }
                    long j10 = j8;
                    jy3 jy3Var = null;
                    while (true) {
                        if (yf2.k(j4, j9) >= 0) {
                            j2 = j4;
                            j3 = j7;
                            break;
                        }
                        if (j7 != j6) {
                            if (jy3Var == null) {
                                jy3Var = new jy3(jArr3);
                            }
                            int i4 = 0;
                            i = i2;
                            while (i4 < i) {
                                if ((j7 & (1 << i4)) != j6) {
                                    ((la3) jy3Var.j).g(((long) i4) + j4);
                                }
                                i4++;
                                j6 = j6;
                            }
                        } else {
                            i = i2;
                        }
                        long j11 = j6;
                        if (j10 == j11) {
                            j2 = j9;
                            j3 = j11;
                            break;
                        }
                        j4 += 64;
                        j6 = j11;
                        j7 = j10;
                        i2 = i;
                        j10 = j6;
                    }
                    if (jy3Var == null) {
                        jArr = jArr3;
                    } else {
                        la3 la3Var = (la3) jy3Var.j;
                        int i5 = la3Var.y;
                        if (i5 == 0) {
                            jArr2 = null;
                        } else {
                            long[] jArr5 = new long[i5];
                            long[] jArr6 = la3Var.g;
                            for (int i6 = 0; i6 < i5; i6++) {
                                jArr5[i6] = jArr6[i6];
                            }
                            jArr2 = jArr5;
                        }
                        if (jArr2 == null) {
                            jArr = jArr3;
                        } else {
                            jArr = jArr2;
                        }
                    }
                    return new gt4(j10, j3, j2, jArr).x(j);
                }
            } else {
                long j12 = 1 << (((int) j5) - 64);
                if ((j8 & j12) == 0) {
                    return new gt4(j8 | j12, this.t, this.a, this.m);
                }
            }
        } else {
            long j13 = 1 << ((int) j5);
            if ((j7 & j13) == 0) {
                return new gt4(this.j, j7 | j13, this.a, this.m);
            }
        }
        return this;
    }

    public final gt4 y(long j) {
        long[] jArr;
        int iV;
        long[] jArr2;
        long j2 = j - this.a;
        if (yf2.k(j2, 0L) >= 0 && yf2.k(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.t;
            if ((j4 & j3) != 0) {
                return new gt4(this.j, j4 & (~j3), this.a, this.m);
            }
        } else if (yf2.k(j2, 64L) >= 0 && yf2.k(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.j;
            if ((j6 & j5) != 0) {
                return new gt4(j6 & (~j5), this.t, this.a, this.m);
            }
        } else if (yf2.k(j2, 0L) < 0 && (jArr = this.m) != null && (iV = sp2.v(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (iV > 0) {
                    pr.N(jArr, jArr3, 0, 0, iV);
                }
                if (iV < i) {
                    pr.N(jArr, jArr3, iV, iV + 1, length);
                }
                jArr2 = jArr3;
            }
            return new gt4(this.j, this.t, this.a, jArr2);
        }
        return this;
    }
}
