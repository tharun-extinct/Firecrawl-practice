package defpackage;

import android.net.Uri;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cc6 {
    public static int a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return 6;
        }
        l0.u(du4.w(i, "Could not convert ", " to NetworkType"));
        return 0;
    }

    public static int c(int i) {
        String str;
        int iD = du4.D(i);
        if (iD == 0) {
            return 0;
        }
        if (iD == 1) {
            return 1;
        }
        if (i != 1) {
            str = i != 2 ? "null" : "DROP_WORK_REQUEST";
        } else {
            str = "RUN_AS_NON_EXPEDITED_WORK_REQUEST";
        }
        up.l(str, " to int", "Could not convert ");
        return 0;
    }

    public static final void g(final boolean z, final xy1 xy1Var, j73 j73Var, boolean z2, td0 td0Var, h02 h02Var, final int i) {
        final j73 j73Var2;
        final boolean z3;
        final td0 td0Var2;
        td0 td0Var3;
        int i2;
        j73 j73Var3;
        boolean z4;
        my1 my1Var;
        boolean z5;
        h02Var.Z(-1406741137);
        int i3 = i | (h02Var.l(z) ? 4 : 2);
        if ((i & 48) == 0) {
            i3 |= h02Var.j(xy1Var) ? 32 : 16;
        }
        int i4 = i3 | 208256;
        if (h02Var.N(i4 & 1, (74899 & i4) != 74898)) {
            h02Var.S();
            if ((i & 1) == 0 || h02Var.k()) {
                rj0 rj0Var = (rj0) h02Var.a(tj0.g);
                td0Var3 = rj0Var.g0;
                if (td0Var3 == null) {
                    long jN = tj0.n(rj0Var, yd0.r);
                    long j = jj0.l;
                    sj0 sj0Var = yd0.g;
                    long jN2 = tj0.n(rj0Var, sj0Var);
                    sj0 sj0Var2 = yd0.y;
                    td0 td0Var4 = new td0(jN, j, jN2, j, jj0.y(0.38f, tj0.n(rj0Var, sj0Var2)), j, jj0.y(0.38f, tj0.n(rj0Var, sj0Var2)), tj0.n(rj0Var, sj0Var), tj0.n(rj0Var, yd0.x), jj0.y(0.38f, tj0.n(rj0Var, sj0Var2)), jj0.y(0.38f, tj0.n(rj0Var, yd0.v)), jj0.y(0.38f, tj0.n(rj0Var, sj0Var2)));
                    rj0Var.g0 = td0Var4;
                    td0Var3 = td0Var4;
                }
                i2 = i4 & (-57345);
                j73Var3 = g73.g;
                z4 = true;
            } else {
                h02Var.Q();
                i2 = i4 & (-57345);
                j73Var3 = j73Var;
                z4 = z2;
                td0Var3 = td0Var;
            }
            h02Var.s();
            float fFloor = (float) Math.floor(((j51) h02Var.a(hp0.j)).e(2.0f));
            ca5 ca5Var = z ? ca5.j : ca5.t;
            if (xy1Var != null) {
                h02Var.X(2066152950);
                boolean z6 = ((i2 & 112) == 32) | ((i2 & 14) == 4);
                Object objK = h02Var.K();
                if (z6 || objK == oo0.g) {
                    z5 = false;
                    objK = new ud0(xy1Var, z, (byte) 0);
                    h02Var.i0(objK);
                } else {
                    z5 = false;
                }
                my1Var = (my1) objK;
                h02Var.b(z5);
            } else {
                h02Var.X(2066218639);
                h02Var.b(false);
                my1Var = null;
            }
            r(ca5Var, my1Var, new by4(fFloor, 0.0f, 2, 0, 26), new by4(fFloor, 0.0f, 0, 0, 30), j73Var3, z4, td0Var3, h02Var, 12804096);
            j73Var2 = j73Var3;
            z3 = z4;
            td0Var2 = td0Var3;
        } else {
            h02Var.Q();
            j73Var2 = j73Var;
            z3 = z2;
            td0Var2 = td0Var;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: vd0
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    cc6.g(z, xy1Var, j73Var2, z3, td0Var2, (h02) obj, aq2.J(i | 1));
                    return og5.g;
                }
            };
        }
    }

    public static int i(hr5 hr5Var) {
        int iOrdinal = hr5Var.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    i = 4;
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return 5;
                        }
                        t94.r(hr5Var, " to int", "Could not convert ");
                        return 0;
                    }
                }
            }
        }
        return i;
    }

    public static j73 j(j73 j73Var, ja3 ja3Var) {
        return j73Var.n(new r72(ja3Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.ObjectOutputStream] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.ObjectOutputStream] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static byte[] l(du0 du0Var) {
        boolean zHasNext;
        HashSet hashSet = du0Var.g;
        HashSet hashSet2 = du0Var.g;
        ?? r1 = 0;
        r1 = 0;
        r1 = 0;
        if (hashSet.size() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                try {
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        try {
                            objectOutputStream.writeInt(hashSet2.size());
                            Iterator it = hashSet2.iterator();
                            while (true) {
                                zHasNext = it.hasNext();
                                if (!zHasNext) {
                                    break;
                                }
                                cu0 cu0Var = (cu0) it.next();
                                objectOutputStream.writeUTF(cu0Var.g.toString());
                                objectOutputStream.writeBoolean(cu0Var.y);
                            }
                            objectOutputStream.close();
                            r1 = zHasNext;
                        } catch (IOException e) {
                            e = e;
                            r1 = objectOutputStream;
                            e.printStackTrace();
                            if (r1 != 0) {
                                r1.close();
                                r1 = r1;
                            }
                            byteArrayOutputStream.close();
                            return byteArrayOutputStream.toByteArray();
                        } catch (Throwable th) {
                            th = th;
                            r1 = objectOutputStream;
                            if (r1 != 0) {
                                try {
                                    r1.close();
                                } catch (IOException e2) {
                                    e2.printStackTrace();
                                }
                            }
                            try {
                                byteArrayOutputStream.close();
                                throw th;
                            } catch (IOException e3) {
                                e3.printStackTrace();
                                throw th;
                            }
                        }
                        byteArrayOutputStream.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e5) {
                e = e5;
            }
        } catch (IOException e6) {
            e6.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static int m(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        l0.u(du4.w(i, "Could not convert ", " to OutOfQuotaPolicy"));
        return 0;
    }

    public static int n(int i) {
        String str;
        int iD = du4.D(i);
        if (iD == 0) {
            return 0;
        }
        if (iD == 1) {
            return 1;
        }
        if (i != 1) {
            str = i != 2 ? "null" : "LINEAR";
        } else {
            str = "EXPONENTIAL";
        }
        up.l(str, " to int", "Could not convert ");
        return 0;
    }

    public static hr5 q(int i) {
        if (i == 0) {
            return hr5.j;
        }
        if (i == 1) {
            return hr5.t;
        }
        if (i == 2) {
            return hr5.a;
        }
        if (i == 3) {
            return hr5.m;
        }
        if (i == 4) {
            return hr5.q;
        }
        if (i == 5) {
            return hr5.w;
        }
        l0.u(du4.w(i, "Could not convert ", " to State"));
        return null;
    }

    public static final void r(ca5 ca5Var, my1 my1Var, by4 by4Var, by4 by4Var2, j73 j73Var, boolean z, td0 td0Var, h02 h02Var, int i) {
        int i2;
        j73 kd5Var;
        h02Var.Z(-406243761);
        if ((i & 6) == 0) {
            i2 = (h02Var.n(ca5Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.j(my1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= h02Var.j(by4Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= h02Var.j(by4Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= h02Var.x(j73Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= h02Var.l(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= h02Var.x(td0Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= h02Var.x(null) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (h02Var.N(i3 & 1, (4793491 & i3) != 4793490)) {
            h02Var.S();
            if ((i & 1) != 0 && !h02Var.k()) {
                h02Var.Q();
            }
            h02Var.s();
            j73 j73Var2 = g73.g;
            if (my1Var != null) {
                m94 m94VarG = k94.g(yd0.n / 2.0f, 4, 0L, false);
                o94 o94Var = new o94(1);
                if (m94VarG != null) {
                    kd5Var = new kd5(ca5Var, null, m94VarG, z, o94Var, my1Var);
                } else {
                    kd5Var = m94VarG == null ? new kd5(ca5Var, null, null, z, o94Var, my1Var) : m50.F(j73Var2, new z95(m94VarG, ca5Var, z, o94Var, my1Var));
                }
            } else {
                kd5Var = j73Var2;
            }
            if (my1Var != null) {
                f72 f72Var = ye2.g;
                j73Var2 = c63.g;
            }
            int i4 = i3 << 6;
            y(z, ca5Var, ue5.e0(j73Var.n(j73Var2).n(kd5Var), 2.0f), td0Var, by4Var, by4Var2, h02Var, ((i3 >> 15) & 14) | ((i3 << 3) & 112) | ((i3 >> 9) & 7168) | (57344 & i4) | (i4 & 458752));
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new mz(ca5Var, my1Var, by4Var, by4Var2, j73Var, z, td0Var, i);
        }
    }

    public static int t(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        l0.u(du4.w(i, "Could not convert ", " to BackoffPolicy"));
        return 0;
    }

    public static void v(long j, c70 c70Var, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        ArrayList arrayList3;
        long j2;
        int i6;
        int i7 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 >= i3) {
            l0.u("Failed requirement.");
            return;
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (((fa0) arrayList4.get(i8)).y() < i7) {
                l0.u("Failed requirement.");
                return;
            }
        }
        fa0 fa0Var = (fa0) arrayList.get(i2);
        fa0 fa0Var2 = (fa0) arrayList4.get(i3 - 1);
        if (i7 == fa0Var.y()) {
            int iIntValue = ((Number) arrayList5.get(i2)).intValue();
            int i9 = i2 + 1;
            fa0 fa0Var3 = (fa0) arrayList4.get(i9);
            i4 = i9;
            i5 = iIntValue;
            fa0Var = fa0Var3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (fa0Var.v(i7) == fa0Var2.v(i7)) {
            int iMin = Math.min(fa0Var.y(), fa0Var2.y());
            int i10 = 0;
            for (int i11 = i7; i11 < iMin && fa0Var.v(i11) == fa0Var2.v(i11); i11++) {
                i10++;
            }
            long j3 = (c70Var.t / 4) + j + 2 + ((long) i10) + 1;
            c70Var.M(-i10);
            c70Var.M(i5);
            int i12 = i7 + i10;
            while (i7 < i12) {
                c70Var.M(fa0Var.v(i7) & 255);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i12 == ((fa0) arrayList4.get(i4)).y()) {
                    c70Var.M(((Number) arrayList5.get(i4)).intValue());
                    return;
                } else {
                    l0.z("Check failed.");
                    return;
                }
            }
            c70 c70Var2 = new c70();
            c70Var.M(((int) ((c70Var2.t / 4) + j3)) * (-1));
            v(j3, c70Var2, i12, arrayList4, i4, i3, arrayList5);
            c70Var.E(c70Var2);
            return;
        }
        int i13 = 1;
        for (int i14 = i4 + 1; i14 < i3; i14++) {
            if (((fa0) arrayList4.get(i14 - 1)).v(i7) != ((fa0) arrayList4.get(i14)).v(i7)) {
                i13++;
            }
        }
        long j4 = (c70Var.t / 4) + j + 2 + ((long) (i13 * 2));
        c70Var.M(i13);
        c70Var.M(i5);
        for (int i15 = i4; i15 < i3; i15++) {
            int iV = ((fa0) arrayList4.get(i15)).v(i7);
            if (i15 == i4 || iV != ((fa0) arrayList4.get(i15 - 1)).v(i7)) {
                c70Var.M(iV & 255);
            }
        }
        c70 c70Var3 = new c70();
        int i16 = i4;
        while (i16 < i3) {
            byte bV = ((fa0) arrayList4.get(i16)).v(i7);
            int i17 = i16 + 1;
            int i18 = i17;
            while (true) {
                if (i18 >= i3) {
                    i18 = i3;
                    break;
                } else if (bV != ((fa0) arrayList4.get(i18)).v(i7)) {
                    break;
                } else {
                    i18++;
                }
            }
            if (i17 == i18 && i7 + 1 == ((fa0) arrayList4.get(i16)).y()) {
                c70Var.M(((Number) arrayList5.get(i16)).intValue());
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i18;
            } else {
                c70Var.M(((int) ((c70Var3.t / 4) + j4)) * (-1));
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i18;
                v(j2, c70Var3, i7 + 1, arrayList, i16, i6, arrayList3);
                arrayList4 = arrayList;
            }
            j4 = j2;
            i16 = i6;
            arrayList5 = arrayList3;
        }
        c70Var.E(c70Var3);
    }

    public static int w(int i) {
        int iD = du4.D(i);
        if (iD == 0) {
            return 0;
        }
        int i2 = 1;
        if (iD != 1) {
            i2 = 2;
            if (iD != 2) {
                i2 = 3;
                if (iD != 3) {
                    i2 = 4;
                    if (iD != 4) {
                        if (Build.VERSION.SDK_INT >= 30 && i == 6) {
                            return 5;
                        }
                        up.l(fj.o(i), " to int", "Could not convert ");
                        return 0;
                    }
                }
            }
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static du0 x(byte[] bArr) throws Throwable {
        Throwable th;
        ObjectInputStream objectInputStream;
        IOException e;
        du0 du0Var = new du0();
        if (bArr != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ObjectInputStream objectInputStream2 = null;
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        for (int i = objectInputStream.readInt(); i > 0; i--) {
                            du0Var.g.add(new cu0(objectInputStream.readBoolean(), Uri.parse(objectInputStream.readUTF())));
                        }
                    } catch (IOException e2) {
                        e = e2;
                        e.printStackTrace();
                        if (objectInputStream != null) {
                        }
                        byteArrayInputStream.close();
                        return du0Var;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (0 != 0) {
                        try {
                            objectInputStream2.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    try {
                        byteArrayInputStream.close();
                        throw th;
                    } catch (IOException e4) {
                        e4.printStackTrace();
                        throw th;
                    }
                }
            } catch (IOException e5) {
                objectInputStream = null;
                e = e5;
            } catch (Throwable th3) {
                th = th3;
                if (0 != 0) {
                    objectInputStream2.close();
                }
                byteArrayInputStream.close();
                throw th;
            }
            try {
                objectInputStream.close();
            } catch (IOException e6) {
                e6.printStackTrace();
            }
            try {
                byteArrayInputStream.close();
            } catch (IOException e7) {
                e7.printStackTrace();
            }
        }
        return du0Var;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:105:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:109:0x01de  */
    /* JADX WARN: Code duplicated, block: B:111:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:116:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:119:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:120:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:122:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:124:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:126:0x0201  */
    /* JADX WARN: Code duplicated, block: B:127:0x0204  */
    /* JADX WARN: Code duplicated, block: B:129:0x0208  */
    /* JADX WARN: Code duplicated, block: B:130:0x020b  */
    /* JADX WARN: Code duplicated, block: B:132:0x020f  */
    /* JADX WARN: Code duplicated, block: B:133:0x0230  */
    /* JADX WARN: Code duplicated, block: B:135:0x0245  */
    /* JADX WARN: Code duplicated, block: B:137:0x024b  */
    /* JADX WARN: Code duplicated, block: B:139:0x024e  */
    /* JADX WARN: Code duplicated, block: B:142:0x0252  */
    /* JADX WARN: Code duplicated, block: B:144:0x0256  */
    /* JADX WARN: Code duplicated, block: B:145:0x0259  */
    /* JADX WARN: Code duplicated, block: B:146:0x025c  */
    /* JADX WARN: Code duplicated, block: B:148:0x0262  */
    /* JADX WARN: Code duplicated, block: B:150:0x0265  */
    /* JADX WARN: Code duplicated, block: B:152:0x0268  */
    /* JADX WARN: Code duplicated, block: B:153:0x026b  */
    /* JADX WARN: Code duplicated, block: B:155:0x026f  */
    /* JADX WARN: Code duplicated, block: B:156:0x0272  */
    /* JADX WARN: Code duplicated, block: B:158:0x0276  */
    /* JADX WARN: Code duplicated, block: B:159:0x0297  */
    /* JADX WARN: Code duplicated, block: B:163:0x02e3  */
    public static final void y(boolean z, ca5 ca5Var, j73 j73Var, td0 td0Var, by4 by4Var, by4 by4Var2, h02 h02Var, int i) {
        int i2;
        h02 h02Var2;
        float f;
        float f2;
        float f3;
        no1 zs4Var;
        hc5 hc5VarP;
        Object objK;
        l76 l76Var;
        pd0 pd0Var;
        long j;
        bw4 bw4VarG;
        h02 h02Var3;
        int iOrdinal;
        long j2;
        bw4 bw4VarQ;
        int iOrdinal2;
        long j3;
        bw4 bw4VarQ2;
        boolean zX;
        Object objK2;
        int iOrdinal3;
        int iOrdinal4;
        h02Var.Z(-891330208);
        if ((i & 6) == 0) {
            i2 = (h02Var.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.n(ca5Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= h02Var.x(j73Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= h02Var.x(td0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= h02Var.j(by4Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= h02Var.j(by4Var2) ? 131072 : 65536;
        }
        if (h02Var.N(i2 & 1, (74899 & i2) != 74898)) {
            nc5 nc5VarV = ra.V(ca5Var, null, h02Var, (i2 >> 3) & 14, 2);
            tp3 tp3Var = nc5VarV.n;
            g90 g90Var = nc5VarV.g;
            no1 no1VarF = jr2.F(f83.j, h02Var);
            te5 te5Var = m50.w;
            ca5 ca5Var2 = (ca5) g90Var.n();
            h02Var.X(-768316570);
            int iOrdinal5 = ca5Var2.ordinal();
            float f4 = 0.0f;
            if (iOrdinal5 == 0) {
                f = 1.0f;
            } else if (iOrdinal5 != 1) {
                if (iOrdinal5 != 2) {
                    up.y();
                    return;
                }
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            h02Var.b(false);
            Float fValueOf = Float.valueOf(f);
            ca5 ca5Var3 = (ca5) tp3Var.getValue();
            h02Var.X(-768316570);
            int iOrdinal6 = ca5Var3.ordinal();
            if (iOrdinal6 == 0) {
                f2 = 1.0f;
            } else if (iOrdinal6 != 1) {
                if (iOrdinal6 != 2) {
                    up.y();
                    return;
                }
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            h02Var.b(false);
            Float fValueOf2 = Float.valueOf(f2);
            fc5 fc5VarX = nc5VarV.x();
            h02Var.X(1780794470);
            Object objG = fc5VarX.g();
            ca5 ca5Var4 = ca5.t;
            no1 zs4Var2 = (objG != ca5Var4 && fc5VarX.r() == ca5Var4) ? new zs4(100) : no1VarF;
            h02Var.b(false);
            hc5 hc5VarP2 = ra.p(nc5VarV, fValueOf, fValueOf2, zs4Var2, te5Var, h02Var, 0);
            ca5 ca5Var5 = (ca5) g90Var.n();
            h02Var.X(1840054703);
            int iOrdinal7 = ca5Var5.ordinal();
            if (iOrdinal7 == 0 || iOrdinal7 == 1) {
                f3 = 0.0f;
            } else {
                if (iOrdinal7 != 2) {
                    up.y();
                    return;
                }
                f3 = 1.0f;
            }
            h02Var.b(false);
            Float fValueOf3 = Float.valueOf(f3);
            ca5 ca5Var6 = (ca5) tp3Var.getValue();
            h02Var.X(1840054703);
            int iOrdinal8 = ca5Var6.ordinal();
            if (iOrdinal8 != 0 && iOrdinal8 != 1) {
                if (iOrdinal8 != 2) {
                    up.y();
                    return;
                }
                f4 = 1.0f;
            }
            h02Var.b(false);
            Float fValueOf4 = Float.valueOf(f4);
            fc5 fc5VarX2 = nc5VarV.x();
            h02Var.X(630790831);
            if (fc5VarX2.g() == ca5Var4) {
                no1VarF = m50.a0();
            } else {
                if (fc5VarX2.r() == ca5Var4) {
                    zs4Var = new zs4(100);
                }
                h02Var.b(false);
                hc5VarP = ra.p(nc5VarV, fValueOf3, fValueOf4, zs4Var, te5Var, h02Var, 0);
                objK = h02Var.K();
                l76Var = oo0.g;
                if (objK == l76Var) {
                    objK = new pd0();
                    h02Var.i0(objK);
                }
                pd0Var = (pd0) objK;
                td0Var.getClass();
                if (ca5Var == ca5Var4) {
                    j = td0Var.y;
                } else {
                    j = td0Var.g;
                }
                bw4VarG = aq4.g(j, td0.g(ca5Var, h02Var), null, h02Var, 0, 12);
                h02Var3 = h02Var;
                if (z) {
                    iOrdinal4 = ca5Var.ordinal();
                    if (iOrdinal4 == 0) {
                        j2 = td0Var.r;
                    } else if (iOrdinal4 != 1) {
                        if (iOrdinal4 != 2) {
                            up.y();
                            return;
                        }
                        j2 = td0Var.r;
                    } else {
                        j2 = td0Var.n;
                    }
                } else {
                    iOrdinal = ca5Var.ordinal();
                    if (iOrdinal != 0) {
                        j2 = td0Var.v;
                    } else if (iOrdinal != 1) {
                        j2 = td0Var.x;
                    } else {
                        if (iOrdinal == 2) {
                            up.y();
                            return;
                        }
                        j2 = td0Var.l;
                    }
                }
                if (z) {
                    h02Var3.X(496051715);
                    bw4VarQ = aq4.g(j2, td0.g(ca5Var, h02Var3), null, h02Var, 0, 12);
                    h02Var3 = h02Var;
                    h02Var3.b(false);
                } else {
                    h02Var3.X(496141925);
                    bw4VarQ = kq2.Q(new jj0(j2), h02Var3);
                    h02Var3.b(false);
                }
                if (z) {
                    iOrdinal3 = ca5Var.ordinal();
                    if (iOrdinal3 == 0) {
                        j3 = td0Var.j;
                    } else if (iOrdinal3 != 1) {
                        if (iOrdinal3 != 2) {
                            up.y();
                            return;
                        }
                        j3 = td0Var.j;
                    } else {
                        j3 = td0Var.t;
                    }
                } else {
                    iOrdinal2 = ca5Var.ordinal();
                    if (iOrdinal2 != 0) {
                        j3 = td0Var.a;
                    } else if (iOrdinal2 != 1) {
                        j3 = td0Var.m;
                    } else {
                        if (iOrdinal2 == 2) {
                            up.y();
                            return;
                        }
                        j3 = td0Var.q;
                    }
                }
                if (z) {
                    h02Var3.X(633231558);
                    bw4VarQ2 = aq4.g(j3, td0.g(ca5Var, h02Var3), null, h02Var, 0, 12);
                    h02Var2 = h02Var;
                    h02Var2.b(false);
                } else {
                    long j4 = j3;
                    h02Var2 = h02Var3;
                    h02Var2.X(633321768);
                    bw4VarQ2 = kq2.Q(new jj0(j4), h02Var2);
                    h02Var2.b(false);
                }
                j73 j73VarX = mq4.x(mq4.i(j73Var, hi0.w, 2), 20.0f);
                zX = h02Var2.x(bw4VarQ) | h02Var2.x(bw4VarQ2) | h02Var2.j(by4Var2) | h02Var2.x(bw4VarG) | h02Var2.x(hc5VarP2) | h02Var2.x(hc5VarP) | h02Var2.j(by4Var);
                objK2 = h02Var2.K();
                if (zX || objK2 == l76Var) {
                    wd0 wd0Var = new wd0(bw4VarQ, bw4VarQ2, by4Var2, bw4VarG, hc5VarP2, hc5VarP, by4Var, pd0Var);
                    h02Var2.i0(wd0Var);
                    objK2 = wd0Var;
                }
                ue5.v(j73VarX, (xy1) objK2, h02Var2, 0);
            }
            zs4Var = no1VarF;
            h02Var.b(false);
            hc5VarP = ra.p(nc5VarV, fValueOf3, fValueOf4, zs4Var, te5Var, h02Var, 0);
            objK = h02Var.K();
            l76Var = oo0.g;
            if (objK == l76Var) {
                objK = new pd0();
                h02Var.i0(objK);
            }
            pd0Var = (pd0) objK;
            td0Var.getClass();
            if (ca5Var == ca5Var4) {
                j = td0Var.y;
            } else {
                j = td0Var.g;
            }
            bw4VarG = aq4.g(j, td0.g(ca5Var, h02Var), null, h02Var, 0, 12);
            h02Var3 = h02Var;
            if (z) {
                iOrdinal4 = ca5Var.ordinal();
                if (iOrdinal4 == 0) {
                    j2 = td0Var.r;
                } else if (iOrdinal4 != 1) {
                    if (iOrdinal4 != 2) {
                        up.y();
                        return;
                    }
                    j2 = td0Var.r;
                } else {
                    j2 = td0Var.n;
                }
            } else {
                iOrdinal = ca5Var.ordinal();
                if (iOrdinal != 0) {
                    j2 = td0Var.v;
                } else if (iOrdinal != 1) {
                    j2 = td0Var.x;
                } else {
                    if (iOrdinal == 2) {
                        up.y();
                        return;
                    }
                    j2 = td0Var.l;
                }
            }
            if (z) {
                h02Var3.X(496051715);
                bw4VarQ = aq4.g(j2, td0.g(ca5Var, h02Var3), null, h02Var, 0, 12);
                h02Var3 = h02Var;
                h02Var3.b(false);
            } else {
                h02Var3.X(496141925);
                bw4VarQ = kq2.Q(new jj0(j2), h02Var3);
                h02Var3.b(false);
            }
            if (z) {
                iOrdinal3 = ca5Var.ordinal();
                if (iOrdinal3 == 0) {
                    j3 = td0Var.j;
                } else if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        up.y();
                        return;
                    }
                    j3 = td0Var.j;
                } else {
                    j3 = td0Var.t;
                }
            } else {
                iOrdinal2 = ca5Var.ordinal();
                if (iOrdinal2 != 0) {
                    j3 = td0Var.a;
                } else if (iOrdinal2 != 1) {
                    j3 = td0Var.m;
                } else {
                    if (iOrdinal2 == 2) {
                        up.y();
                        return;
                    }
                    j3 = td0Var.q;
                }
            }
            if (z) {
                h02Var3.X(633231558);
                bw4VarQ2 = aq4.g(j3, td0.g(ca5Var, h02Var3), null, h02Var, 0, 12);
                h02Var2 = h02Var;
                h02Var2.b(false);
            } else {
                long j5 = j3;
                h02Var2 = h02Var3;
                h02Var2.X(633321768);
                bw4VarQ2 = kq2.Q(new jj0(j5), h02Var2);
                h02Var2.b(false);
            }
            j73 j73VarX2 = mq4.x(mq4.i(j73Var, hi0.w, 2), 20.0f);
            zX = h02Var2.x(bw4VarQ) | h02Var2.x(bw4VarQ2) | h02Var2.j(by4Var2) | h02Var2.x(bw4VarG) | h02Var2.x(hc5VarP2) | h02Var2.x(hc5VarP) | h02Var2.j(by4Var);
            objK2 = h02Var2.K();
            if (zX) {
                wd0 wd0Var2 = new wd0(bw4VarQ, bw4VarQ2, by4Var2, bw4VarG, hc5VarP2, hc5VarP, by4Var, pd0Var);
                h02Var2.i0(wd0Var2);
                objK2 = wd0Var2;
            } else {
                wd0 wd0Var3 = new wd0(bw4VarQ, bw4VarQ2, by4Var2, bw4VarG, hc5VarP2, hc5VarP, by4Var, pd0Var);
                h02Var2.i0(wd0Var3);
                objK2 = wd0Var3;
            }
            ue5.v(j73VarX2, (xy1) objK2, h02Var2, 0);
        } else {
            h02Var2 = h02Var;
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new xd0(z, ca5Var, j73Var, td0Var, by4Var, by4Var2, i);
        }
    }
}
