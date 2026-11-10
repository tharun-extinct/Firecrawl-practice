package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y51 extends yw4 {
    public static final Object j = new Object();
    public int l;
    public int n;
    public long r;
    public ta3 v;
    public Object x;

    public y51(long j2) {
        super(j2);
        ta3 ta3Var = mi3.g;
        ta3Var.getClass();
        this.v = ta3Var;
        this.x = j;
    }

    @Override // defpackage.yw4
    public final void g(yw4 yw4Var) {
        yw4Var.getClass();
        y51 y51Var = (y51) yw4Var;
        this.v = y51Var.v;
        this.x = y51Var.x;
        this.l = y51Var.l;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d8 A[PHI: r11
  0x00d8: PHI (r11v1 int) = (r11v0 int), (r11v2 int) binds: [B:30:0x00a9, B:40:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00de A[Catch: all -> 0x00cc, LOOP:3: B:29:0x009c->B:44:0x00de, LOOP_END, TryCatch #0 {all -> 0x00cc, blocks: (B:12:0x0025, B:15:0x0032, B:17:0x0041, B:19:0x004f, B:21:0x0059, B:24:0x0076, B:26:0x007a, B:29:0x009c, B:31:0x00ab, B:33:0x00b5, B:35:0x00bb, B:38:0x00cf, B:47:0x00f8, B:44:0x00de, B:46:0x00e8), top: B:74:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x014c A[LOOP:5: B:62:0x014a->B:63:0x014c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x00f8 A[EDGE_INSN: B:84:0x00f8->B:47:0x00f8 BREAK  A[LOOP:3: B:29:0x009c->B:44:0x00de], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [y51] */
    /* JADX WARN: Type inference failed for: r13v5, types: [yw4] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, yw4] */
    /* JADX WARN: Type inference failed for: r18v3, types: [int] */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [int] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    public final int n(z51 z51Var, at4 at4Var) {
        ta3 ta3Var;
        int iIdentityHashCode;
        Object[] objArr;
        int i;
        int i2;
        long[] jArr;
        int i3;
        Object[] objArr2;
        long[] jArr2;
        ?? r25;
        Object[] objArr3;
        long j2;
        long j3;
        int i4;
        ?? r26;
        ?? L;
        synchronized (it4.r) {
            ta3Var = this.v;
        }
        int i5 = 7;
        if (ta3Var.v == 0) {
            return 7;
        }
        rb3 rb3VarG = pt4.g();
        Object[] objArr4 = rb3VarG.j;
        int i6 = rb3VarG.a;
        boolean z = false;
        for (int i7 = 0; i7 < i6; i7++) {
            ((g02) objArr4[i7]).y();
        }
        try {
            Object[] objArr5 = ta3Var.y;
            int[] iArr = ta3Var.r;
            long[] jArr3 = ta3Var.g;
            int length = jArr3.length - 2;
            if (length >= 0) {
                iIdentityHashCode = 7;
                int i8 = 0;
                while (true) {
                    long j4 = jArr3[i8];
                    long j5 = -9187201950435737472L;
                    if ((((~j4) << i5) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8;
                        int i10 = 8 - ((~(i8 - length)) >>> 31);
                        i3 = i5;
                        ?? r3 = z;
                        while (r3 < i10) {
                            if ((j4 & 255) < 128) {
                                ?? r18 = (i8 << 3) + r3;
                                j3 = j5;
                                ww4 ww4Var = (ww4) objArr5[r18];
                                int i11 = i9;
                                if (iArr[r18] != 1) {
                                    jArr2 = jArr3;
                                    r25 = r3;
                                    objArr3 = objArr5;
                                    j2 = j4;
                                } else {
                                    if (ww4Var instanceof z51) {
                                        z51 z51Var2 = (z51) ww4Var;
                                        L = z51Var2.d((y51) it4.l(z51Var2.m, at4Var), at4Var, z, z51Var2.t);
                                        ta3 ta3Var2 = L.v;
                                        Object[] objArr6 = ta3Var2.y;
                                        long[] jArr4 = ta3Var2.g;
                                        int length2 = jArr4.length - 2;
                                        jArr2 = jArr3;
                                        r26 = r3;
                                        objArr3 = objArr5;
                                        if (length2 >= 0) {
                                            int i12 = 0;
                                            while (true) {
                                                long j6 = jArr4[i12];
                                                j2 = j4;
                                                int iIdentityHashCode2 = iIdentityHashCode;
                                                if ((((~j6) << i3) & j6 & j3) == j3) {
                                                    iIdentityHashCode = iIdentityHashCode2;
                                                    if (i12 != length2) {
                                                        break;
                                                        break;
                                                    }
                                                    i12++;
                                                    j4 = j2;
                                                    i11 = 8;
                                                } else {
                                                    int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                                    for (int i14 = 0; i14 < i13; i14++) {
                                                        if ((j6 & 255) < 128) {
                                                            iIdentityHashCode2 = (iIdentityHashCode2 * 31) + System.identityHashCode((ww4) objArr6[(i12 << 3) + i14]);
                                                        }
                                                        j6 >>= i11;
                                                    }
                                                    if (i13 != i11) {
                                                        iIdentityHashCode = iIdentityHashCode2;
                                                        break;
                                                    }
                                                    iIdentityHashCode = iIdentityHashCode2;
                                                    if (i12 != length2) {
                                                        break;
                                                    }
                                                    i12++;
                                                    j4 = j2;
                                                    i11 = 8;
                                                }
                                            }
                                        } else {
                                            j2 = j4;
                                        }
                                    } else {
                                        jArr2 = jArr3;
                                        r26 = r3;
                                        objArr3 = objArr5;
                                        j2 = j4;
                                        L = it4.l(ww4Var.n(), at4Var);
                                    }
                                    iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(L)) * 31) + Long.hashCode(L.g);
                                    r25 = r26;
                                }
                                i4 = 8;
                            } else {
                                jArr2 = jArr3;
                                r25 = r3;
                                objArr3 = objArr5;
                                j2 = j4;
                                j3 = j5;
                                i4 = i9;
                            }
                            j4 = j2 >> i4;
                            i9 = i4;
                            j5 = j3;
                            objArr5 = objArr3;
                            z = false;
                            r3 = r25 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        objArr2 = objArr5;
                        if (i10 != i9) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i3 = i5;
                        objArr2 = objArr5;
                    }
                    if (i8 != length) {
                        i8++;
                        i5 = i3;
                        jArr3 = jArr;
                        objArr5 = objArr2;
                        z = false;
                    } else {
                        i5 = iIdentityHashCode;
                    }
                }
                objArr = rb3VarG.j;
                i = rb3VarG.a;
                for (i2 = 0; i2 < i; i2++) {
                    ((g02) objArr[i2]).g();
                }
                return iIdentityHashCode;
            }
            iIdentityHashCode = i5;
            objArr = rb3VarG.j;
            i = rb3VarG.a;
            while (i2 < i) {
                ((g02) objArr[i2]).g();
            }
            return iIdentityHashCode;
        } catch (Throwable th) {
            Object[] objArr7 = rb3VarG.j;
            int i15 = rb3VarG.a;
            for (int i16 = 0; i16 < i15; i16++) {
                ((g02) objArr7[i16]).g();
            }
            throw th;
        }
    }

    public final boolean r(z51 z51Var, at4 at4Var) {
        boolean z;
        boolean z2;
        Object obj = it4.r;
        synchronized (obj) {
            z = true;
            z2 = (this.r == at4Var.l() && this.n == at4Var.j()) ? false : true;
        }
        if (this.x == j || (z2 && this.l != n(z51Var, at4Var))) {
            z = false;
        }
        if (!z || !z2) {
            return z;
        }
        synchronized (obj) {
            this.r = at4Var.l();
            this.n = at4Var.j();
        }
        return z;
    }
}
