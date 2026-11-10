package defpackage;

import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cz5 {
    public static final nm0 g = new nm0(636288403, false, new vm0(0));
    public static final nm0 y = new nm0(-1357803046, false, new vm0(1));

    public static final void g(final vv3 vv3Var, final nm0 nm0Var, ya5 ya5Var, final boolean z, final nm0 nm0Var2, h02 h02Var, final int i, final int i2) {
        int i3;
        ob3 ob3Var;
        boolean z2;
        boolean z3;
        ya5 ya5Var2 = ya5Var;
        h02 h02Var2 = h02Var;
        h02Var2.Z(-1221877520);
        if ((i & 6) == 0) {
            i3 = (h02Var2.x(vv3Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= h02Var2.j(nm0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? h02Var2.x(ya5Var2) : h02Var2.j(ya5Var2) ? 256 : 128;
        }
        int i4 = i & 3072;
        g73 g73Var = g73.g;
        if (i4 == 0) {
            i3 |= h02Var2.x(g73Var) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= h02Var2.j(null) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= h02Var2.l(false) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= h02Var2.l(z) ? 1048576 : 524288;
        }
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= h02Var2.l(false) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= h02Var2.j(nm0Var2) ? 67108864 : 33554432;
        }
        int i5 = i3;
        if (h02Var2.N(i5 & 1, (38347923 & i5) != 38347922)) {
            Object objK = h02Var2.K();
            l76 l76Var = oo0.g;
            if (objK == l76Var) {
                objK = k33.E(h02Var2);
                h02Var2.i0(objK);
            }
            ox0 ox0Var = (ox0) objK;
            Object objK2 = h02Var2.K();
            if (objK2 == l76Var) {
                objK2 = kq2.M(Boolean.FALSE);
                h02Var2.i0(objK2);
            }
            ob3 ob3Var2 = (ob3) objK2;
            t33 t33VarR = z50.r(hi0.t, false);
            int iS = pw5.s(h02Var2);
            tr3 tr3VarQ = h02Var2.q();
            j73 j73VarW = m50.W(h02Var2, g73Var);
            jo0.n.getClass();
            h02Var2.b0();
            if (h02Var2.S) {
                h02Var2.m(um2.Z);
            } else {
                h02Var2.l0();
            }
            xs2.E(tg1.w, h02Var2, t33VarR);
            xs2.E(tg1.q, h02Var2, tr3VarQ);
            on0 on0Var = tg1.c;
            if (h02Var2.S || !yf2.p(h02Var2.K(), Integer.valueOf(iS))) {
                du4.f(iS, h02Var2, iS, on0Var);
            }
            xs2.E(tg1.m, h02Var2, j73VarW);
            if (ya5Var2.isVisible()) {
                h02Var2.X(-1891243071);
                z3 = true;
                y(vv3Var, ya5Var2, null, ox0Var, false, ob3Var2, nm0Var, h02Var, (i5 & 14) | 196608 | ((i5 >> 3) & 112) | ((i5 >> 6) & 896) | ((i5 << 15) & 3670016));
                ob3Var = ob3Var2;
                h02Var2 = h02Var;
                z2 = false;
                h02Var2.b(false);
            } else {
                ob3Var = ob3Var2;
                z2 = false;
                z3 = true;
                h02Var2.X(-1890863476);
                h02Var2.b(false);
            }
            ya5Var2 = ya5Var;
            n(z, ya5Var2, ob3Var, false, nm0Var2, h02Var2, ((i5 >> 18) & 14) | 384 | ((i5 >> 3) & 112) | ((i5 >> 12) & 7168) | (57344 & (i5 << 3)) | ((i5 >> 9) & 458752));
            h02Var2.b(z3);
            if ((i5 & 896) != 256 && ((i5 & 512) == 0 || !h02Var2.j(ya5Var2))) {
                z3 = z2;
            }
            Object objK3 = h02Var2.K();
            if (z3 || objK3 == l76Var) {
                objK3 = new h((Object) ya5Var2, (byte) 10);
                h02Var2.i0(objK3);
            }
            k33.j(ya5Var2, (xy1) objK3, h02Var2);
        } else {
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            final ya5 ya5Var3 = ya5Var2;
            u34VarP.n = new bz1() { // from class: lz
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    cz5.g(vv3Var, nm0Var, ya5Var3, z, nm0Var2, (h02) obj, aq2.J(i | 1), i2);
                    return og5.g;
                }
            };
        }
    }

    public static final void n(final boolean z, final ya5 ya5Var, final ob3 ob3Var, final boolean z2, final nm0 nm0Var, h02 h02Var, final int i) {
        int i2;
        h02Var.Z(1873232064);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = (h02Var.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? h02Var.x(ya5Var) : h02Var.j(ya5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= h02Var.x(ob3Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= h02Var.l(z2) ? 2048 : 1024;
        }
        int i3 = i & 24576;
        j73 j73VarN = g73.g;
        if (i3 == 0) {
            i2 |= h02Var.x(j73VarN) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= h02Var.j(nm0Var) ? 131072 : 65536;
        }
        byte b2 = 0;
        byte b3 = 1;
        if (h02Var.N(i2 & 1, (74899 & i2) != 74898)) {
            Object objK = h02Var.K();
            if (objK == oo0.g) {
                objK = k33.E(h02Var);
                h02Var.i0(objK);
            }
            ox0 ox0Var = (ox0) objK;
            String strI = xs2.I(R.string.tooltip_label, h02Var);
            if (z) {
                j73VarN = b05.g(b05.g(j73VarN, ya5Var, new uz(ya5Var, b2)), ya5Var, new uz(ya5Var, b3));
            }
            if (z) {
                j73VarN = j73VarN.n(new xp3(new q2(strI, ox0Var, ya5Var, b)));
            }
            if (z) {
                j73VarN = ic6.n(lb6.y(j73VarN, new m(ox0Var, ya5Var, (byte) 10)), new wz(ya5Var, ob3Var, z2));
            } else {
                ob3Var.setValue(Boolean.FALSE);
            }
            t33 t33VarR = z50.r(hi0.t, false);
            int iS = pw5.s(h02Var);
            tr3 tr3VarQ = h02Var.q();
            j73 j73VarW = m50.W(h02Var, j73VarN);
            jo0.n.getClass();
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(um2.Z);
            } else {
                h02Var.l0();
            }
            xs2.E(tg1.w, h02Var, t33VarR);
            xs2.E(tg1.q, h02Var, tr3VarQ);
            on0 on0Var = tg1.c;
            if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS))) {
                du4.f(iS, h02Var, iS, on0Var);
            }
            xs2.E(tg1.m, h02Var, j73VarW);
            du4.h((i2 >> 15) & 14, nm0Var, h02Var, true);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: nz
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    cz5.n(z, ya5Var, ob3Var, z2, nm0Var, (h02) obj, aq2.J(i | 1));
                    return og5.g;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:103:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:104:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:107:0x05f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:110:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:113:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:115:0x06af  */
    /* JADX WARN: Code duplicated, block: B:118:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:119:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:122:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:126:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:45:0x027f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0287  */
    /* JADX WARN: Code duplicated, block: B:50:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:51:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:54:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:57:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:58:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:62:0x036e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0376  */
    /* JADX WARN: Code duplicated, block: B:67:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:68:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:71:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:74:0x03af  */
    /* JADX WARN: Code duplicated, block: B:75:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:79:0x045c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0464  */
    /* JADX WARN: Code duplicated, block: B:84:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:85:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:88:0x04fa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x0502  */
    /* JADX WARN: Code duplicated, block: B:94:0x057f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0587  */
    /* JADX WARN: Code duplicated, block: B:99:0x05c2  */
    public static final void r(r04 r04Var, xy1 xy1Var, h02 h02Var, int i) {
        sx1 sx1Var;
        l76 l76Var;
        ob3 ob3Var;
        l76 l76Var2;
        ob3 ob3Var2;
        sx1 sx1Var2;
        sx1 sx1Var3;
        boolean z;
        Object objK;
        l76 l76Var3;
        ob3 ob3Var3;
        l76 l76Var4;
        ob3 ob3Var4;
        sx1 sx1Var4;
        sx1 sx1Var5;
        boolean z2;
        Object objK2;
        l76 l76Var5;
        ob3 ob3Var5;
        char c;
        ob3 ob3Var6;
        sx1 sx1Var6;
        sx1 sx1Var7;
        sx1 sx1Var8;
        boolean z3;
        Object objK3;
        ob3 ob3Var7;
        ob3 ob3Var8;
        sx1 sx1Var9;
        boolean z4;
        Object objK4;
        ob3 ob3Var9;
        ob3 ob3Var10;
        sx1 sx1Var10;
        boolean z5;
        Object objK5;
        Object obj = xy1Var;
        h02 h02Var2 = h02Var;
        obj.getClass();
        h02Var2.Z(-328434643);
        int i2 = i | (h02Var2.j(r04Var) ? 4 : 2) | (h02Var2.j(obj) ? 32 : 16);
        if (h02Var2.N(i2 & 1, (i2 & 19) != 18)) {
            Object objK6 = h02Var2.K();
            l76 l76Var6 = oo0.g;
            if (objK6 == l76Var6) {
                tp3 tp3Var = new tp3(r04Var, hi0.B);
                h02Var2.i0(tp3Var);
                objK6 = tp3Var;
            }
            ob3 ob3Var11 = (ob3) objK6;
            g73 g73Var = g73.g;
            j73 j73VarE0 = ue5.e0(g73Var, 16.0f);
            ek0 ek0VarG = ck0.g(new yq(8.0f, true, new l0((byte) 2)), hi0.h, h02Var2, 6);
            int iHashCode = Long.hashCode(h02Var2.T);
            tr3 tr3VarQ = h02Var2.q();
            j73 j73VarW = m50.W(h02Var2, j73VarE0);
            jo0.n.getClass();
            h02Var2.b0();
            boolean z6 = h02Var2.S;
            sx1 sx1Var11 = um2.Z;
            if (z6) {
                h02Var2.m(sx1Var11);
            } else {
                h02Var2.l0();
            }
            on0 on0Var = tg1.w;
            xs2.E(on0Var, h02Var2, ek0VarG);
            on0 on0Var2 = tg1.q;
            xs2.E(on0Var2, h02Var2, tr3VarQ);
            Integer numValueOf = Integer.valueOf(iHashCode);
            on0 on0Var3 = tg1.c;
            xs2.E(on0Var3, h02Var2, numValueOf);
            xs2.D(h02Var2);
            on0 on0Var4 = tg1.m;
            xs2.E(on0Var4, h02Var2, j73VarW);
            g75.y(xs2.I(R.string.component_touch_pad, h02Var2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var2).l, h02Var, 0, 0, 131070);
            m50.p(null, 0.0f, 0L, h02Var, 0, 7);
            g75.y(xs2.I(R.string.mouse_settings_mouse_buttons, h02Var), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).j, h02Var, 0, 0, 131070);
            wq wqVar = v70.y;
            j00 j00Var = hi0.p;
            kb4 kb4VarG = jb4.g(wqVar, j00Var, h02Var, 0);
            int iHashCode2 = Long.hashCode(h02Var.T);
            tr3 tr3VarQ2 = h02Var.q();
            j73 j73VarW2 = m50.W(h02Var, g73Var);
            h02Var.b0();
            if (h02Var.S) {
                sx1Var = sx1Var11;
                h02Var.m(sx1Var);
            } else {
                sx1Var = sx1Var11;
                h02Var.l0();
            }
            xs2.E(on0Var, h02Var, kb4VarG);
            xs2.E(on0Var2, h02Var, tr3VarQ2);
            du4.k(iHashCode2, h02Var, on0Var3, h02Var);
            xs2.E(on0Var4, h02Var, j73VarW2);
            j00 j00Var2 = hi0.u;
            j73 j73VarE1 = ue5.e0(g73Var, 4.0f);
            kb4 kb4VarG2 = jb4.g(wqVar, j00Var2, h02Var, 48);
            int iHashCode3 = Long.hashCode(h02Var.T);
            tr3 tr3VarQ3 = h02Var.q();
            j73 j73VarW3 = m50.W(h02Var, j73VarE1);
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(sx1Var);
            } else {
                h02Var.l0();
            }
            xs2.E(on0Var, h02Var, kb4VarG2);
            xs2.E(on0Var2, h02Var, tr3VarQ3);
            du4.k(iHashCode3, h02Var, on0Var3, h02Var);
            xs2.E(on0Var4, h02Var, j73VarW3);
            boolean z7 = ((r04) ob3Var11.getValue()).d().q;
            int i3 = i2 & 112;
            boolean z8 = i3 == 32;
            Object objK7 = h02Var.K();
            if (z8) {
                l76Var = l76Var6;
            } else {
                l76Var = l76Var6;
                if (objK7 != l76Var) {
                    ob3Var = ob3Var11;
                }
                l76Var2 = l76Var;
                cc6.g(z7, (xy1) objK7, null, false, null, h02Var, 0);
                ob3Var2 = ob3Var;
                sx1Var2 = sx1Var;
                g75.y(xs2.H(R.array.mouse_buttons_options, h02Var)[0], null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).m, h02Var, 0, 0, 131070);
                h02Var.b(true);
                j73 j73VarE2 = ue5.e0(g73Var, 4.0f);
                kb4 kb4VarG3 = jb4.g(wqVar, j00Var2, h02Var, 48);
                int iHashCode4 = Long.hashCode(h02Var.T);
                tr3 tr3VarQ4 = h02Var.q();
                j73 j73VarW4 = m50.W(h02Var, j73VarE2);
                h02Var.b0();
                if (h02Var.S) {
                    sx1Var3 = sx1Var2;
                    h02Var.m(sx1Var3);
                } else {
                    sx1Var3 = sx1Var2;
                    h02Var.l0();
                }
                xs2.E(on0Var, h02Var, kb4VarG3);
                xs2.E(on0Var2, h02Var, tr3VarQ4);
                du4.k(iHashCode4, h02Var, on0Var3, h02Var);
                xs2.E(on0Var4, h02Var, j73VarW4);
                boolean z9 = ((r04) ob3Var2.getValue()).d().w;
                if (i3 == 32) {
                    z = true;
                } else {
                    z = false;
                }
                objK = h02Var.K();
                if (z) {
                    l76Var3 = l76Var2;
                } else {
                    l76Var3 = l76Var2;
                    if (objK == l76Var3) {
                        ob3Var3 = ob3Var2;
                    }
                    l76Var4 = l76Var3;
                    cc6.g(z9, (xy1) objK, null, false, null, h02Var, 0);
                    ob3Var4 = ob3Var3;
                    sx1Var4 = sx1Var3;
                    g75.y(xs2.H(R.array.mouse_buttons_options, h02Var)[1], null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).m, h02Var, 0, 0, 131070);
                    h02Var.b(true);
                    j73 j73VarE3 = ue5.e0(g73Var, 4.0f);
                    kb4 kb4VarG4 = jb4.g(wqVar, j00Var2, h02Var, 48);
                    int iHashCode5 = Long.hashCode(h02Var.T);
                    tr3 tr3VarQ5 = h02Var.q();
                    j73 j73VarW5 = m50.W(h02Var, j73VarE3);
                    h02Var.b0();
                    if (h02Var.S) {
                        sx1Var5 = sx1Var4;
                        h02Var.m(sx1Var5);
                    } else {
                        sx1Var5 = sx1Var4;
                        h02Var.l0();
                    }
                    xs2.E(on0Var, h02Var, kb4VarG4);
                    xs2.E(on0Var2, h02Var, tr3VarQ5);
                    du4.k(iHashCode5, h02Var, on0Var3, h02Var);
                    xs2.E(on0Var4, h02Var, j73VarW5);
                    boolean z10 = ((r04) ob3Var4.getValue()).d().c;
                    if (i3 == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objK2 = h02Var.K();
                    if (z2) {
                        l76Var5 = l76Var4;
                    } else {
                        l76Var5 = l76Var4;
                        if (objK2 == l76Var5) {
                            ob3Var5 = ob3Var4;
                            c = 5;
                        }
                        l76 l76Var7 = l76Var5;
                        cc6.g(z10, (xy1) objK2, null, false, null, h02Var, 0);
                        ob3Var6 = ob3Var5;
                        sx1Var6 = sx1Var5;
                        g75.y(xs2.H(R.array.mouse_buttons_options, h02Var)[2], null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).m, h02Var, 0, 0, 131070);
                        h02Var.b(true);
                        h02Var.b(true);
                        kb4 kb4VarG5 = jb4.g(wqVar, j00Var2, h02Var, 48);
                        int iHashCode6 = Long.hashCode(h02Var.T);
                        tr3 tr3VarQ6 = h02Var.q();
                        j73 j73VarW6 = m50.W(h02Var, g73Var);
                        h02Var.b0();
                        if (h02Var.S) {
                            sx1Var7 = sx1Var6;
                            h02Var.m(sx1Var7);
                        } else {
                            sx1Var7 = sx1Var6;
                            h02Var.l0();
                        }
                        xs2.E(on0Var, h02Var, kb4VarG5);
                        xs2.E(on0Var2, h02Var, tr3VarQ6);
                        du4.k(iHashCode6, h02Var, on0Var3, h02Var);
                        xs2.E(on0Var4, h02Var, j73VarW6);
                        sx1Var8 = sx1Var7;
                        g75.y(xs2.I(R.string.mouse_settings_show_buttons_above, h02Var), ue5.i0(g73Var, 0.0f, 0.0f, 16.0f, 0.0f, 11).n(new tp2(1.0f, true)), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var, 0, 0, 262140);
                        boolean z11 = ((r04) ob3Var6.getValue()).d().t;
                        if (i3 == 32) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        objK3 = h02Var.K();
                        if (!z3 || objK3 == l76Var7) {
                            ob3Var7 = ob3Var6;
                            objK3 = new d80((byte) 6, xy1Var, ob3Var7);
                            h02Var.i0(objK3);
                        } else {
                            ob3Var7 = ob3Var6;
                        }
                        k05.g(z11, (xy1) objK3, null, null, false, null, h02Var, 0, 124);
                        h02Var.b(true);
                        ob3Var8 = ob3Var7;
                        g75.y(xs2.I(R.string.mouse_settings_scroll_bar, h02Var), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).j, h02Var, 0, 0, 131070);
                        kb4 kb4VarG6 = jb4.g(wqVar, j00Var, h02Var, 0);
                        int iHashCode7 = Long.hashCode(h02Var.T);
                        tr3 tr3VarQ7 = h02Var.q();
                        j73 j73VarW7 = m50.W(h02Var, g73Var);
                        h02Var.b0();
                        if (h02Var.S) {
                            sx1Var9 = sx1Var8;
                            h02Var.m(sx1Var9);
                        } else {
                            sx1Var9 = sx1Var8;
                            h02Var.l0();
                        }
                        xs2.E(on0Var, h02Var, kb4VarG6);
                        xs2.E(on0Var2, h02Var, tr3VarQ7);
                        du4.k(iHashCode7, h02Var, on0Var3, h02Var);
                        xs2.E(on0Var4, h02Var, j73VarW7);
                        j73 j73VarE4 = ue5.e0(g73Var, 4.0f);
                        kb4 kb4VarG7 = jb4.g(wqVar, j00Var2, h02Var, 48);
                        int iHashCode8 = Long.hashCode(h02Var.T);
                        tr3 tr3VarQ8 = h02Var.q();
                        j73 j73VarW8 = m50.W(h02Var, j73VarE4);
                        h02Var.b0();
                        if (h02Var.S) {
                            h02Var.m(sx1Var9);
                        } else {
                            h02Var.l0();
                        }
                        xs2.E(on0Var, h02Var, kb4VarG7);
                        xs2.E(on0Var2, h02Var, tr3VarQ8);
                        du4.k(iHashCode8, h02Var, on0Var3, h02Var);
                        xs2.E(on0Var4, h02Var, j73VarW8);
                        boolean z12 = ((r04) ob3Var8.getValue()).d().i;
                        if (i3 == 32) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        objK4 = h02Var.K();
                        if (!z4 || objK4 == l76Var7) {
                            ob3Var9 = ob3Var8;
                            objK4 = new d80((byte) 7, xy1Var, ob3Var9);
                            h02Var.i0(objK4);
                        } else {
                            ob3Var9 = ob3Var8;
                        }
                        cc6.g(z12, (xy1) objK4, null, false, null, h02Var, 0);
                        ob3Var10 = ob3Var9;
                        sx1Var10 = sx1Var9;
                        g75.y(xs2.H(R.array.horizontal_position_options, h02Var)[0], null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).m, h02Var, 0, 0, 131070);
                        h02Var.b(true);
                        j73 j73VarE5 = ue5.e0(g73Var, 4.0f);
                        kb4 kb4VarG8 = jb4.g(wqVar, j00Var2, h02Var, 48);
                        int iHashCode9 = Long.hashCode(h02Var.T);
                        tr3 tr3VarQ9 = h02Var.q();
                        j73 j73VarW9 = m50.W(h02Var, j73VarE5);
                        h02Var.b0();
                        if (h02Var.S) {
                            h02Var.m(sx1Var10);
                        } else {
                            h02Var.l0();
                        }
                        xs2.E(on0Var, h02Var, kb4VarG8);
                        xs2.E(on0Var2, h02Var, tr3VarQ9);
                        du4.k(iHashCode9, h02Var, on0Var3, h02Var);
                        xs2.E(on0Var4, h02Var, j73VarW9);
                        boolean z13 = ((r04) ob3Var10.getValue()).d().b;
                        if (i3 == 32) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        objK5 = h02Var.K();
                        if (z5 || objK5 == l76Var7) {
                            objK5 = new d80((byte) 8, xy1Var, ob3Var10);
                            h02Var.i0(objK5);
                        }
                        cc6.g(z13, (xy1) objK5, null, false, null, h02Var, 0);
                        obj = xy1Var;
                        g75.y(xs2.H(R.array.horizontal_position_options, h02Var)[1], null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).m, h02Var, 0, 0, 131070);
                        h02Var2 = h02Var;
                        h02Var2.b(true);
                        h02Var2.b(true);
                        h02Var2.b(true);
                    }
                    ob3Var5 = ob3Var4;
                    c = 5;
                    objK2 = new d80((byte) 5, xy1Var, ob3Var5);
                    h02Var.i0(objK2);
                    l76 l76Var8 = l76Var5;
                    cc6.g(z10, (xy1) objK2, null, false, null, h02Var, 0);
                    ob3Var6 = ob3Var5;
                    sx1Var6 = sx1Var5;
                    g75.y(xs2.H(R.array.mouse_buttons_options, h02Var)[2], null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).m, h02Var, 0, 0, 131070);
                    h02Var.b(true);
                    h02Var.b(true);
                    kb4 kb4VarG9 = jb4.g(wqVar, j00Var2, h02Var, 48);
                    int iHashCode10 = Long.hashCode(h02Var.T);
                    tr3 tr3VarQ10 = h02Var.q();
                    j73 j73VarW10 = m50.W(h02Var, g73Var);
                    h02Var.b0();
                    if (h02Var.S) {
                        sx1Var7 = sx1Var6;
                        h02Var.m(sx1Var7);
                    } else {
                        sx1Var7 = sx1Var6;
                        h02Var.l0();
                    }
                    xs2.E(on0Var, h02Var, kb4VarG9);
                    xs2.E(on0Var2, h02Var, tr3VarQ10);
                    du4.k(iHashCode10, h02Var, on0Var3, h02Var);
                    xs2.E(on0Var4, h02Var, j73VarW10);
                    sx1Var8 = sx1Var7;
                    g75.y(xs2.I(R.string.mouse_settings_show_buttons_above, h02Var), ue5.i0(g73Var, 0.0f, 0.0f, 16.0f, 0.0f, 11).n(new tp2(1.0f, true)), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var, 0, 0, 262140);
                    boolean z14 = ((r04) ob3Var6.getValue()).d().t;
                    if (i3 == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objK3 = h02Var.K();
                    if (z3) {
                        ob3Var7 = ob3Var6;
                        objK3 = new d80((byte) 6, xy1Var, ob3Var7);
                        h02Var.i0(objK3);
                    } else {
                        ob3Var7 = ob3Var6;
                        objK3 = new d80((byte) 6, xy1Var, ob3Var7);
                        h02Var.i0(objK3);
                    }
                    k05.g(z14, (xy1) objK3, null, null, false, null, h02Var, 0, 124);
                    h02Var.b(true);
                    ob3Var8 = ob3Var7;
                    g75.y(xs2.I(R.string.mouse_settings_scroll_bar, h02Var), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).j, h02Var, 0, 0, 131070);
                    kb4 kb4VarG10 = jb4.g(wqVar, j00Var, h02Var, 0);
                    int iHashCode11 = Long.hashCode(h02Var.T);
                    tr3 tr3VarQ11 = h02Var.q();
                    j73 j73VarW11 = m50.W(h02Var, g73Var);
                    h02Var.b0();
                    if (h02Var.S) {
                        sx1Var9 = sx1Var8;
                        h02Var.m(sx1Var9);
                    } else {
                        sx1Var9 = sx1Var8;
                        h02Var.l0();
                    }
                    xs2.E(on0Var, h02Var, kb4VarG10);
                    xs2.E(on0Var2, h02Var, tr3VarQ11);
                    du4.k(iHashCode11, h02Var, on0Var3, h02Var);
                    xs2.E(on0Var4, h02Var, j73VarW11);
                    j73 j73VarE6 = ue5.e0(g73Var, 4.0f);
                    kb4 kb4VarG11 = jb4.g(wqVar, j00Var2, h02Var, 48);
                    int iHashCode12 = Long.hashCode(h02Var.T);
                    tr3 tr3VarQ12 = h02Var.q();
                    j73 j73VarW12 = m50.W(h02Var, j73VarE6);
                    h02Var.b0();
                    if (h02Var.S) {
                        h02Var.m(sx1Var9);
                    } else {
                        h02Var.l0();
                    }
                    xs2.E(on0Var, h02Var, kb4VarG11);
                    xs2.E(on0Var2, h02Var, tr3VarQ12);
                    du4.k(iHashCode12, h02Var, on0Var3, h02Var);
                    xs2.E(on0Var4, h02Var, j73VarW12);
                    boolean z15 = ((r04) ob3Var8.getValue()).d().i;
                    if (i3 == 32) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objK4 = h02Var.K();
                    if (z4) {
                        ob3Var9 = ob3Var8;
                        objK4 = new d80((byte) 7, xy1Var, ob3Var9);
                        h02Var.i0(objK4);
                    } else {
                        ob3Var9 = ob3Var8;
                        objK4 = new d80((byte) 7, xy1Var, ob3Var9);
                        h02Var.i0(objK4);
                    }
                    cc6.g(z15, (xy1) objK4, null, false, null, h02Var, 0);
                    ob3Var10 = ob3Var9;
                    sx1Var10 = sx1Var9;
                    g75.y(xs2.H(R.array.horizontal_position_options, h02Var)[0], null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).m, h02Var, 0, 0, 131070);
                    h02Var.b(true);
                    j73 j73VarE7 = ue5.e0(g73Var, 4.0f);
                    kb4 kb4VarG12 = jb4.g(wqVar, j00Var2, h02Var, 48);
                    int iHashCode13 = Long.hashCode(h02Var.T);
                    tr3 tr3VarQ13 = h02Var.q();
                    j73 j73VarW13 = m50.W(h02Var, j73VarE7);
                    h02Var.b0();
                    if (h02Var.S) {
                        h02Var.m(sx1Var10);
                    } else {
                        h02Var.l0();
                    }
                    xs2.E(on0Var, h02Var, kb4VarG12);
                    xs2.E(on0Var2, h02Var, tr3VarQ13);
                    du4.k(iHashCode13, h02Var, on0Var3, h02Var);
                    xs2.E(on0Var4, h02Var, j73VarW13);
                    boolean z16 = ((r04) ob3Var10.getValue()).d().b;
                    if (i3 == 32) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objK5 = h02Var.K();
                    if (z5) {
                        objK5 = new d80((byte) 8, xy1Var, ob3Var10);
                        h02Var.i0(objK5);
                    } else {
                        objK5 = new d80((byte) 8, xy1Var, ob3Var10);
                        h02Var.i0(objK5);
                    }
                    cc6.g(z16, (xy1) objK5, null, false, null, h02Var, 0);
                    obj = xy1Var;
                    g75.y(xs2.H(R.array.horizontal_position_options, h02Var)[1], null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).m, h02Var, 0, 0, 131070);
                    h02Var2 = h02Var;
                    h02Var2.b(true);
                    h02Var2.b(true);
                    h02Var2.b(true);
                }
                ob3Var3 = ob3Var2;
                objK = new d80((byte) 4, xy1Var, ob3Var3);
                h02Var.i0(objK);
                l76Var4 = l76Var3;
                cc6.g(z9, (xy1) objK, null, false, null, h02Var, 0);
                ob3Var4 = ob3Var3;
                sx1Var4 = sx1Var3;
                g75.y(xs2.H(R.array.mouse_buttons_options, h02Var)[1], null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).m, h02Var, 0, 0, 131070);
                h02Var.b(true);
                j73 j73VarE8 = ue5.e0(g73Var, 4.0f);
                kb4 kb4VarG13 = jb4.g(wqVar, j00Var2, h02Var, 48);
                int iHashCode14 = Long.hashCode(h02Var.T);
                tr3 tr3VarQ14 = h02Var.q();
                j73 j73VarW14 = m50.W(h02Var, j73VarE8);
                h02Var.b0();
                if (h02Var.S) {
                    sx1Var5 = sx1Var4;
                    h02Var.m(sx1Var5);
                } else {
                    sx1Var5 = sx1Var4;
                    h02Var.l0();
                }
                xs2.E(on0Var, h02Var, kb4VarG13);
                xs2.E(on0Var2, h02Var, tr3VarQ14);
                du4.k(iHashCode14, h02Var, on0Var3, h02Var);
                xs2.E(on0Var4, h02Var, j73VarW14);
                boolean z17 = ((r04) ob3Var4.getValue()).d().c;
                if (i3 == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objK2 = h02Var.K();
                if (z2) {
                    l76Var5 = l76Var4;
                    if (objK2 == l76Var5) {
                        ob3Var5 = ob3Var4;
                        c = 5;
                    }
                    l76 l76Var9 = l76Var5;
                    cc6.g(z17, (xy1) objK2, null, false, null, h02Var, 0);
                    ob3Var6 = ob3Var5;
                    sx1Var6 = sx1Var5;
                    g75.y(xs2.H(R.array.mouse_buttons_options, h02Var)[2], null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).m, h02Var, 0, 0, 131070);
                    h02Var.b(true);
                    h02Var.b(true);
                    kb4 kb4VarG14 = jb4.g(wqVar, j00Var2, h02Var, 48);
                    int iHashCode15 = Long.hashCode(h02Var.T);
                    tr3 tr3VarQ15 = h02Var.q();
                    j73 j73VarW15 = m50.W(h02Var, g73Var);
                    h02Var.b0();
                    if (h02Var.S) {
                        sx1Var7 = sx1Var6;
                        h02Var.m(sx1Var7);
                    } else {
                        sx1Var7 = sx1Var6;
                        h02Var.l0();
                    }
                    xs2.E(on0Var, h02Var, kb4VarG14);
                    xs2.E(on0Var2, h02Var, tr3VarQ15);
                    du4.k(iHashCode15, h02Var, on0Var3, h02Var);
                    xs2.E(on0Var4, h02Var, j73VarW15);
                    sx1Var8 = sx1Var7;
                    g75.y(xs2.I(R.string.mouse_settings_show_buttons_above, h02Var), ue5.i0(g73Var, 0.0f, 0.0f, 16.0f, 0.0f, 11).n(new tp2(1.0f, true)), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var, 0, 0, 262140);
                    boolean z18 = ((r04) ob3Var6.getValue()).d().t;
                    if (i3 == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objK3 = h02Var.K();
                    if (z3) {
                        ob3Var7 = ob3Var6;
                        objK3 = new d80((byte) 6, xy1Var, ob3Var7);
                        h02Var.i0(objK3);
                    } else {
                        ob3Var7 = ob3Var6;
                        objK3 = new d80((byte) 6, xy1Var, ob3Var7);
                        h02Var.i0(objK3);
                    }
                    k05.g(z18, (xy1) objK3, null, null, false, null, h02Var, 0, 124);
                    h02Var.b(true);
                    ob3Var8 = ob3Var7;
                    g75.y(xs2.I(R.string.mouse_settings_scroll_bar, h02Var), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).j, h02Var, 0, 0, 131070);
                    kb4 kb4VarG15 = jb4.g(wqVar, j00Var, h02Var, 0);
                    int iHashCode16 = Long.hashCode(h02Var.T);
                    tr3 tr3VarQ16 = h02Var.q();
                    j73 j73VarW16 = m50.W(h02Var, g73Var);
                    h02Var.b0();
                    if (h02Var.S) {
                        sx1Var9 = sx1Var8;
                        h02Var.m(sx1Var9);
                    } else {
                        sx1Var9 = sx1Var8;
                        h02Var.l0();
                    }
                    xs2.E(on0Var, h02Var, kb4VarG15);
                    xs2.E(on0Var2, h02Var, tr3VarQ16);
                    du4.k(iHashCode16, h02Var, on0Var3, h02Var);
                    xs2.E(on0Var4, h02Var, j73VarW16);
                    j73 j73VarE9 = ue5.e0(g73Var, 4.0f);
                    kb4 kb4VarG16 = jb4.g(wqVar, j00Var2, h02Var, 48);
                    int iHashCode17 = Long.hashCode(h02Var.T);
                    tr3 tr3VarQ17 = h02Var.q();
                    j73 j73VarW17 = m50.W(h02Var, j73VarE9);
                    h02Var.b0();
                    if (h02Var.S) {
                        h02Var.m(sx1Var9);
                    } else {
                        h02Var.l0();
                    }
                    xs2.E(on0Var, h02Var, kb4VarG16);
                    xs2.E(on0Var2, h02Var, tr3VarQ17);
                    du4.k(iHashCode17, h02Var, on0Var3, h02Var);
                    xs2.E(on0Var4, h02Var, j73VarW17);
                    boolean z19 = ((r04) ob3Var8.getValue()).d().i;
                    if (i3 == 32) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objK4 = h02Var.K();
                    if (z4) {
                        ob3Var9 = ob3Var8;
                        objK4 = new d80((byte) 7, xy1Var, ob3Var9);
                        h02Var.i0(objK4);
                    } else {
                        ob3Var9 = ob3Var8;
                        objK4 = new d80((byte) 7, xy1Var, ob3Var9);
                        h02Var.i0(objK4);
                    }
                    cc6.g(z19, (xy1) objK4, null, false, null, h02Var, 0);
                    ob3Var10 = ob3Var9;
                    sx1Var10 = sx1Var9;
                    g75.y(xs2.H(R.array.horizontal_position_options, h02Var)[0], null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).m, h02Var, 0, 0, 131070);
                    h02Var.b(true);
                    j73 j73VarE10 = ue5.e0(g73Var, 4.0f);
                    kb4 kb4VarG17 = jb4.g(wqVar, j00Var2, h02Var, 48);
                    int iHashCode18 = Long.hashCode(h02Var.T);
                    tr3 tr3VarQ18 = h02Var.q();
                    j73 j73VarW18 = m50.W(h02Var, j73VarE10);
                    h02Var.b0();
                    if (h02Var.S) {
                        h02Var.m(sx1Var10);
                    } else {
                        h02Var.l0();
                    }
                    xs2.E(on0Var, h02Var, kb4VarG17);
                    xs2.E(on0Var2, h02Var, tr3VarQ18);
                    du4.k(iHashCode18, h02Var, on0Var3, h02Var);
                    xs2.E(on0Var4, h02Var, j73VarW18);
                    boolean z110 = ((r04) ob3Var10.getValue()).d().b;
                    if (i3 == 32) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objK5 = h02Var.K();
                    if (z5) {
                        objK5 = new d80((byte) 8, xy1Var, ob3Var10);
                        h02Var.i0(objK5);
                    } else {
                        objK5 = new d80((byte) 8, xy1Var, ob3Var10);
                        h02Var.i0(objK5);
                    }
                    cc6.g(z110, (xy1) objK5, null, false, null, h02Var, 0);
                    obj = xy1Var;
                    g75.y(xs2.H(R.array.horizontal_position_options, h02Var)[1], null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).m, h02Var, 0, 0, 131070);
                    h02Var2 = h02Var;
                    h02Var2.b(true);
                    h02Var2.b(true);
                    h02Var2.b(true);
                } else {
                    l76Var5 = l76Var4;
                }
                ob3Var5 = ob3Var4;
                c = 5;
                objK2 = new d80((byte) 5, xy1Var, ob3Var5);
                h02Var.i0(objK2);
                l76 l76Var10 = l76Var5;
                cc6.g(z17, (xy1) objK2, null, false, null, h02Var, 0);
                ob3Var6 = ob3Var5;
                sx1Var6 = sx1Var5;
                g75.y(xs2.H(R.array.mouse_buttons_options, h02Var)[2], null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).m, h02Var, 0, 0, 131070);
                h02Var.b(true);
                h02Var.b(true);
                kb4 kb4VarG18 = jb4.g(wqVar, j00Var2, h02Var, 48);
                int iHashCode19 = Long.hashCode(h02Var.T);
                tr3 tr3VarQ19 = h02Var.q();
                j73 j73VarW19 = m50.W(h02Var, g73Var);
                h02Var.b0();
                if (h02Var.S) {
                    sx1Var7 = sx1Var6;
                    h02Var.m(sx1Var7);
                } else {
                    sx1Var7 = sx1Var6;
                    h02Var.l0();
                }
                xs2.E(on0Var, h02Var, kb4VarG18);
                xs2.E(on0Var2, h02Var, tr3VarQ19);
                du4.k(iHashCode19, h02Var, on0Var3, h02Var);
                xs2.E(on0Var4, h02Var, j73VarW19);
                sx1Var8 = sx1Var7;
                g75.y(xs2.I(R.string.mouse_settings_show_buttons_above, h02Var), ue5.i0(g73Var, 0.0f, 0.0f, 16.0f, 0.0f, 11).n(new tp2(1.0f, true)), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var, 0, 0, 262140);
                boolean z111 = ((r04) ob3Var6.getValue()).d().t;
                if (i3 == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objK3 = h02Var.K();
                if (z3) {
                    ob3Var7 = ob3Var6;
                    objK3 = new d80((byte) 6, xy1Var, ob3Var7);
                    h02Var.i0(objK3);
                } else {
                    ob3Var7 = ob3Var6;
                    objK3 = new d80((byte) 6, xy1Var, ob3Var7);
                    h02Var.i0(objK3);
                }
                k05.g(z111, (xy1) objK3, null, null, false, null, h02Var, 0, 124);
                h02Var.b(true);
                ob3Var8 = ob3Var7;
                g75.y(xs2.I(R.string.mouse_settings_scroll_bar, h02Var), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).j, h02Var, 0, 0, 131070);
                kb4 kb4VarG19 = jb4.g(wqVar, j00Var, h02Var, 0);
                int iHashCode110 = Long.hashCode(h02Var.T);
                tr3 tr3VarQ110 = h02Var.q();
                j73 j73VarW110 = m50.W(h02Var, g73Var);
                h02Var.b0();
                if (h02Var.S) {
                    sx1Var9 = sx1Var8;
                    h02Var.m(sx1Var9);
                } else {
                    sx1Var9 = sx1Var8;
                    h02Var.l0();
                }
                xs2.E(on0Var, h02Var, kb4VarG19);
                xs2.E(on0Var2, h02Var, tr3VarQ110);
                du4.k(iHashCode110, h02Var, on0Var3, h02Var);
                xs2.E(on0Var4, h02Var, j73VarW110);
                j73 j73VarE11 = ue5.e0(g73Var, 4.0f);
                kb4 kb4VarG110 = jb4.g(wqVar, j00Var2, h02Var, 48);
                int iHashCode111 = Long.hashCode(h02Var.T);
                tr3 tr3VarQ111 = h02Var.q();
                j73 j73VarW111 = m50.W(h02Var, j73VarE11);
                h02Var.b0();
                if (h02Var.S) {
                    h02Var.m(sx1Var9);
                } else {
                    h02Var.l0();
                }
                xs2.E(on0Var, h02Var, kb4VarG110);
                xs2.E(on0Var2, h02Var, tr3VarQ111);
                du4.k(iHashCode111, h02Var, on0Var3, h02Var);
                xs2.E(on0Var4, h02Var, j73VarW111);
                boolean z112 = ((r04) ob3Var8.getValue()).d().i;
                if (i3 == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objK4 = h02Var.K();
                if (z4) {
                    ob3Var9 = ob3Var8;
                    objK4 = new d80((byte) 7, xy1Var, ob3Var9);
                    h02Var.i0(objK4);
                } else {
                    ob3Var9 = ob3Var8;
                    objK4 = new d80((byte) 7, xy1Var, ob3Var9);
                    h02Var.i0(objK4);
                }
                cc6.g(z112, (xy1) objK4, null, false, null, h02Var, 0);
                ob3Var10 = ob3Var9;
                sx1Var10 = sx1Var9;
                g75.y(xs2.H(R.array.horizontal_position_options, h02Var)[0], null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).m, h02Var, 0, 0, 131070);
                h02Var.b(true);
                j73 j73VarE12 = ue5.e0(g73Var, 4.0f);
                kb4 kb4VarG111 = jb4.g(wqVar, j00Var2, h02Var, 48);
                int iHashCode112 = Long.hashCode(h02Var.T);
                tr3 tr3VarQ112 = h02Var.q();
                j73 j73VarW112 = m50.W(h02Var, j73VarE12);
                h02Var.b0();
                if (h02Var.S) {
                    h02Var.m(sx1Var10);
                } else {
                    h02Var.l0();
                }
                xs2.E(on0Var, h02Var, kb4VarG111);
                xs2.E(on0Var2, h02Var, tr3VarQ112);
                du4.k(iHashCode112, h02Var, on0Var3, h02Var);
                xs2.E(on0Var4, h02Var, j73VarW112);
                boolean z113 = ((r04) ob3Var10.getValue()).d().b;
                if (i3 == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objK5 = h02Var.K();
                if (z5) {
                    objK5 = new d80((byte) 8, xy1Var, ob3Var10);
                    h02Var.i0(objK5);
                } else {
                    objK5 = new d80((byte) 8, xy1Var, ob3Var10);
                    h02Var.i0(objK5);
                }
                cc6.g(z113, (xy1) objK5, null, false, null, h02Var, 0);
                obj = xy1Var;
                g75.y(xs2.H(R.array.horizontal_position_options, h02Var)[1], null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).m, h02Var, 0, 0, 131070);
                h02Var2 = h02Var;
                h02Var2.b(true);
                h02Var2.b(true);
                h02Var2.b(true);
            }
            ob3Var = ob3Var11;
            objK7 = new d80((byte) 3, xy1Var, ob3Var);
            h02Var.i0(objK7);
            l76Var2 = l76Var;
            cc6.g(z7, (xy1) objK7, null, false, null, h02Var, 0);
            ob3Var2 = ob3Var;
            sx1Var2 = sx1Var;
            g75.y(xs2.H(R.array.mouse_buttons_options, h02Var)[0], null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).m, h02Var, 0, 0, 131070);
            h02Var.b(true);
            j73 j73VarE13 = ue5.e0(g73Var, 4.0f);
            kb4 kb4VarG20 = jb4.g(wqVar, j00Var2, h02Var, 48);
            int iHashCode20 = Long.hashCode(h02Var.T);
            tr3 tr3VarQ20 = h02Var.q();
            j73 j73VarW20 = m50.W(h02Var, j73VarE13);
            h02Var.b0();
            if (h02Var.S) {
                sx1Var3 = sx1Var2;
                h02Var.m(sx1Var3);
            } else {
                sx1Var3 = sx1Var2;
                h02Var.l0();
            }
            xs2.E(on0Var, h02Var, kb4VarG20);
            xs2.E(on0Var2, h02Var, tr3VarQ20);
            du4.k(iHashCode20, h02Var, on0Var3, h02Var);
            xs2.E(on0Var4, h02Var, j73VarW20);
            boolean z20 = ((r04) ob3Var2.getValue()).d().w;
            if (i3 == 32) {
                z = true;
            } else {
                z = false;
            }
            objK = h02Var.K();
            if (z) {
                l76Var3 = l76Var2;
                if (objK == l76Var3) {
                    ob3Var3 = ob3Var2;
                }
                l76Var4 = l76Var3;
                cc6.g(z20, (xy1) objK, null, false, null, h02Var, 0);
                ob3Var4 = ob3Var3;
                sx1Var4 = sx1Var3;
                g75.y(xs2.H(R.array.mouse_buttons_options, h02Var)[1], null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).m, h02Var, 0, 0, 131070);
                h02Var.b(true);
                j73 j73VarE14 = ue5.e0(g73Var, 4.0f);
                kb4 kb4VarG112 = jb4.g(wqVar, j00Var2, h02Var, 48);
                int iHashCode113 = Long.hashCode(h02Var.T);
                tr3 tr3VarQ113 = h02Var.q();
                j73 j73VarW113 = m50.W(h02Var, j73VarE14);
                h02Var.b0();
                if (h02Var.S) {
                    sx1Var5 = sx1Var4;
                    h02Var.m(sx1Var5);
                } else {
                    sx1Var5 = sx1Var4;
                    h02Var.l0();
                }
                xs2.E(on0Var, h02Var, kb4VarG112);
                xs2.E(on0Var2, h02Var, tr3VarQ113);
                du4.k(iHashCode113, h02Var, on0Var3, h02Var);
                xs2.E(on0Var4, h02Var, j73VarW113);
                boolean z114 = ((r04) ob3Var4.getValue()).d().c;
                if (i3 == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objK2 = h02Var.K();
                if (z2) {
                    l76Var5 = l76Var4;
                    if (objK2 == l76Var5) {
                        ob3Var5 = ob3Var4;
                        c = 5;
                    }
                    l76 l76Var11 = l76Var5;
                    cc6.g(z114, (xy1) objK2, null, false, null, h02Var, 0);
                    ob3Var6 = ob3Var5;
                    sx1Var6 = sx1Var5;
                    g75.y(xs2.H(R.array.mouse_buttons_options, h02Var)[2], null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).m, h02Var, 0, 0, 131070);
                    h02Var.b(true);
                    h02Var.b(true);
                    kb4 kb4VarG113 = jb4.g(wqVar, j00Var2, h02Var, 48);
                    int iHashCode114 = Long.hashCode(h02Var.T);
                    tr3 tr3VarQ114 = h02Var.q();
                    j73 j73VarW114 = m50.W(h02Var, g73Var);
                    h02Var.b0();
                    if (h02Var.S) {
                        sx1Var7 = sx1Var6;
                        h02Var.m(sx1Var7);
                    } else {
                        sx1Var7 = sx1Var6;
                        h02Var.l0();
                    }
                    xs2.E(on0Var, h02Var, kb4VarG113);
                    xs2.E(on0Var2, h02Var, tr3VarQ114);
                    du4.k(iHashCode114, h02Var, on0Var3, h02Var);
                    xs2.E(on0Var4, h02Var, j73VarW114);
                    sx1Var8 = sx1Var7;
                    g75.y(xs2.I(R.string.mouse_settings_show_buttons_above, h02Var), ue5.i0(g73Var, 0.0f, 0.0f, 16.0f, 0.0f, 11).n(new tp2(1.0f, true)), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var, 0, 0, 262140);
                    boolean z115 = ((r04) ob3Var6.getValue()).d().t;
                    if (i3 == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objK3 = h02Var.K();
                    if (z3) {
                        ob3Var7 = ob3Var6;
                        objK3 = new d80((byte) 6, xy1Var, ob3Var7);
                        h02Var.i0(objK3);
                    } else {
                        ob3Var7 = ob3Var6;
                        objK3 = new d80((byte) 6, xy1Var, ob3Var7);
                        h02Var.i0(objK3);
                    }
                    k05.g(z115, (xy1) objK3, null, null, false, null, h02Var, 0, 124);
                    h02Var.b(true);
                    ob3Var8 = ob3Var7;
                    g75.y(xs2.I(R.string.mouse_settings_scroll_bar, h02Var), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).j, h02Var, 0, 0, 131070);
                    kb4 kb4VarG114 = jb4.g(wqVar, j00Var, h02Var, 0);
                    int iHashCode115 = Long.hashCode(h02Var.T);
                    tr3 tr3VarQ115 = h02Var.q();
                    j73 j73VarW115 = m50.W(h02Var, g73Var);
                    h02Var.b0();
                    if (h02Var.S) {
                        sx1Var9 = sx1Var8;
                        h02Var.m(sx1Var9);
                    } else {
                        sx1Var9 = sx1Var8;
                        h02Var.l0();
                    }
                    xs2.E(on0Var, h02Var, kb4VarG114);
                    xs2.E(on0Var2, h02Var, tr3VarQ115);
                    du4.k(iHashCode115, h02Var, on0Var3, h02Var);
                    xs2.E(on0Var4, h02Var, j73VarW115);
                    j73 j73VarE15 = ue5.e0(g73Var, 4.0f);
                    kb4 kb4VarG115 = jb4.g(wqVar, j00Var2, h02Var, 48);
                    int iHashCode116 = Long.hashCode(h02Var.T);
                    tr3 tr3VarQ116 = h02Var.q();
                    j73 j73VarW116 = m50.W(h02Var, j73VarE15);
                    h02Var.b0();
                    if (h02Var.S) {
                        h02Var.m(sx1Var9);
                    } else {
                        h02Var.l0();
                    }
                    xs2.E(on0Var, h02Var, kb4VarG115);
                    xs2.E(on0Var2, h02Var, tr3VarQ116);
                    du4.k(iHashCode116, h02Var, on0Var3, h02Var);
                    xs2.E(on0Var4, h02Var, j73VarW116);
                    boolean z116 = ((r04) ob3Var8.getValue()).d().i;
                    if (i3 == 32) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objK4 = h02Var.K();
                    if (z4) {
                        ob3Var9 = ob3Var8;
                        objK4 = new d80((byte) 7, xy1Var, ob3Var9);
                        h02Var.i0(objK4);
                    } else {
                        ob3Var9 = ob3Var8;
                        objK4 = new d80((byte) 7, xy1Var, ob3Var9);
                        h02Var.i0(objK4);
                    }
                    cc6.g(z116, (xy1) objK4, null, false, null, h02Var, 0);
                    ob3Var10 = ob3Var9;
                    sx1Var10 = sx1Var9;
                    g75.y(xs2.H(R.array.horizontal_position_options, h02Var)[0], null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).m, h02Var, 0, 0, 131070);
                    h02Var.b(true);
                    j73 j73VarE16 = ue5.e0(g73Var, 4.0f);
                    kb4 kb4VarG116 = jb4.g(wqVar, j00Var2, h02Var, 48);
                    int iHashCode117 = Long.hashCode(h02Var.T);
                    tr3 tr3VarQ117 = h02Var.q();
                    j73 j73VarW117 = m50.W(h02Var, j73VarE16);
                    h02Var.b0();
                    if (h02Var.S) {
                        h02Var.m(sx1Var10);
                    } else {
                        h02Var.l0();
                    }
                    xs2.E(on0Var, h02Var, kb4VarG116);
                    xs2.E(on0Var2, h02Var, tr3VarQ117);
                    du4.k(iHashCode117, h02Var, on0Var3, h02Var);
                    xs2.E(on0Var4, h02Var, j73VarW117);
                    boolean z117 = ((r04) ob3Var10.getValue()).d().b;
                    if (i3 == 32) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objK5 = h02Var.K();
                    if (z5) {
                        objK5 = new d80((byte) 8, xy1Var, ob3Var10);
                        h02Var.i0(objK5);
                    } else {
                        objK5 = new d80((byte) 8, xy1Var, ob3Var10);
                        h02Var.i0(objK5);
                    }
                    cc6.g(z117, (xy1) objK5, null, false, null, h02Var, 0);
                    obj = xy1Var;
                    g75.y(xs2.H(R.array.horizontal_position_options, h02Var)[1], null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).m, h02Var, 0, 0, 131070);
                    h02Var2 = h02Var;
                    h02Var2.b(true);
                    h02Var2.b(true);
                    h02Var2.b(true);
                } else {
                    l76Var5 = l76Var4;
                }
                ob3Var5 = ob3Var4;
                c = 5;
                objK2 = new d80((byte) 5, xy1Var, ob3Var5);
                h02Var.i0(objK2);
                l76 l76Var12 = l76Var5;
                cc6.g(z114, (xy1) objK2, null, false, null, h02Var, 0);
                ob3Var6 = ob3Var5;
                sx1Var6 = sx1Var5;
                g75.y(xs2.H(R.array.mouse_buttons_options, h02Var)[2], null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).m, h02Var, 0, 0, 131070);
                h02Var.b(true);
                h02Var.b(true);
                kb4 kb4VarG117 = jb4.g(wqVar, j00Var2, h02Var, 48);
                int iHashCode118 = Long.hashCode(h02Var.T);
                tr3 tr3VarQ118 = h02Var.q();
                j73 j73VarW118 = m50.W(h02Var, g73Var);
                h02Var.b0();
                if (h02Var.S) {
                    sx1Var7 = sx1Var6;
                    h02Var.m(sx1Var7);
                } else {
                    sx1Var7 = sx1Var6;
                    h02Var.l0();
                }
                xs2.E(on0Var, h02Var, kb4VarG117);
                xs2.E(on0Var2, h02Var, tr3VarQ118);
                du4.k(iHashCode118, h02Var, on0Var3, h02Var);
                xs2.E(on0Var4, h02Var, j73VarW118);
                sx1Var8 = sx1Var7;
                g75.y(xs2.I(R.string.mouse_settings_show_buttons_above, h02Var), ue5.i0(g73Var, 0.0f, 0.0f, 16.0f, 0.0f, 11).n(new tp2(1.0f, true)), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var, 0, 0, 262140);
                boolean z118 = ((r04) ob3Var6.getValue()).d().t;
                if (i3 == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objK3 = h02Var.K();
                if (z3) {
                    ob3Var7 = ob3Var6;
                    objK3 = new d80((byte) 6, xy1Var, ob3Var7);
                    h02Var.i0(objK3);
                } else {
                    ob3Var7 = ob3Var6;
                    objK3 = new d80((byte) 6, xy1Var, ob3Var7);
                    h02Var.i0(objK3);
                }
                k05.g(z118, (xy1) objK3, null, null, false, null, h02Var, 0, 124);
                h02Var.b(true);
                ob3Var8 = ob3Var7;
                g75.y(xs2.I(R.string.mouse_settings_scroll_bar, h02Var), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).j, h02Var, 0, 0, 131070);
                kb4 kb4VarG118 = jb4.g(wqVar, j00Var, h02Var, 0);
                int iHashCode119 = Long.hashCode(h02Var.T);
                tr3 tr3VarQ119 = h02Var.q();
                j73 j73VarW119 = m50.W(h02Var, g73Var);
                h02Var.b0();
                if (h02Var.S) {
                    sx1Var9 = sx1Var8;
                    h02Var.m(sx1Var9);
                } else {
                    sx1Var9 = sx1Var8;
                    h02Var.l0();
                }
                xs2.E(on0Var, h02Var, kb4VarG118);
                xs2.E(on0Var2, h02Var, tr3VarQ119);
                du4.k(iHashCode119, h02Var, on0Var3, h02Var);
                xs2.E(on0Var4, h02Var, j73VarW119);
                j73 j73VarE17 = ue5.e0(g73Var, 4.0f);
                kb4 kb4VarG119 = jb4.g(wqVar, j00Var2, h02Var, 48);
                int iHashCode1110 = Long.hashCode(h02Var.T);
                tr3 tr3VarQ1110 = h02Var.q();
                j73 j73VarW1110 = m50.W(h02Var, j73VarE17);
                h02Var.b0();
                if (h02Var.S) {
                    h02Var.m(sx1Var9);
                } else {
                    h02Var.l0();
                }
                xs2.E(on0Var, h02Var, kb4VarG119);
                xs2.E(on0Var2, h02Var, tr3VarQ1110);
                du4.k(iHashCode1110, h02Var, on0Var3, h02Var);
                xs2.E(on0Var4, h02Var, j73VarW1110);
                boolean z119 = ((r04) ob3Var8.getValue()).d().i;
                if (i3 == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objK4 = h02Var.K();
                if (z4) {
                    ob3Var9 = ob3Var8;
                    objK4 = new d80((byte) 7, xy1Var, ob3Var9);
                    h02Var.i0(objK4);
                } else {
                    ob3Var9 = ob3Var8;
                    objK4 = new d80((byte) 7, xy1Var, ob3Var9);
                    h02Var.i0(objK4);
                }
                cc6.g(z119, (xy1) objK4, null, false, null, h02Var, 0);
                ob3Var10 = ob3Var9;
                sx1Var10 = sx1Var9;
                g75.y(xs2.H(R.array.horizontal_position_options, h02Var)[0], null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).m, h02Var, 0, 0, 131070);
                h02Var.b(true);
                j73 j73VarE18 = ue5.e0(g73Var, 4.0f);
                kb4 kb4VarG1110 = jb4.g(wqVar, j00Var2, h02Var, 48);
                int iHashCode1111 = Long.hashCode(h02Var.T);
                tr3 tr3VarQ1111 = h02Var.q();
                j73 j73VarW1111 = m50.W(h02Var, j73VarE18);
                h02Var.b0();
                if (h02Var.S) {
                    h02Var.m(sx1Var10);
                } else {
                    h02Var.l0();
                }
                xs2.E(on0Var, h02Var, kb4VarG1110);
                xs2.E(on0Var2, h02Var, tr3VarQ1111);
                du4.k(iHashCode1111, h02Var, on0Var3, h02Var);
                xs2.E(on0Var4, h02Var, j73VarW1111);
                boolean z1110 = ((r04) ob3Var10.getValue()).d().b;
                if (i3 == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objK5 = h02Var.K();
                if (z5) {
                    objK5 = new d80((byte) 8, xy1Var, ob3Var10);
                    h02Var.i0(objK5);
                } else {
                    objK5 = new d80((byte) 8, xy1Var, ob3Var10);
                    h02Var.i0(objK5);
                }
                cc6.g(z1110, (xy1) objK5, null, false, null, h02Var, 0);
                obj = xy1Var;
                g75.y(xs2.H(R.array.horizontal_position_options, h02Var)[1], null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).m, h02Var, 0, 0, 131070);
                h02Var2 = h02Var;
                h02Var2.b(true);
                h02Var2.b(true);
                h02Var2.b(true);
            } else {
                l76Var3 = l76Var2;
            }
            ob3Var3 = ob3Var2;
            objK = new d80((byte) 4, xy1Var, ob3Var3);
            h02Var.i0(objK);
            l76Var4 = l76Var3;
            cc6.g(z20, (xy1) objK, null, false, null, h02Var, 0);
            ob3Var4 = ob3Var3;
            sx1Var4 = sx1Var3;
            g75.y(xs2.H(R.array.mouse_buttons_options, h02Var)[1], null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).m, h02Var, 0, 0, 131070);
            h02Var.b(true);
            j73 j73VarE19 = ue5.e0(g73Var, 4.0f);
            kb4 kb4VarG1111 = jb4.g(wqVar, j00Var2, h02Var, 48);
            int iHashCode1112 = Long.hashCode(h02Var.T);
            tr3 tr3VarQ1112 = h02Var.q();
            j73 j73VarW1112 = m50.W(h02Var, j73VarE19);
            h02Var.b0();
            if (h02Var.S) {
                sx1Var5 = sx1Var4;
                h02Var.m(sx1Var5);
            } else {
                sx1Var5 = sx1Var4;
                h02Var.l0();
            }
            xs2.E(on0Var, h02Var, kb4VarG1111);
            xs2.E(on0Var2, h02Var, tr3VarQ1112);
            du4.k(iHashCode1112, h02Var, on0Var3, h02Var);
            xs2.E(on0Var4, h02Var, j73VarW1112);
            boolean z1111 = ((r04) ob3Var4.getValue()).d().c;
            if (i3 == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            objK2 = h02Var.K();
            if (z2) {
                l76Var5 = l76Var4;
                if (objK2 == l76Var5) {
                    ob3Var5 = ob3Var4;
                    c = 5;
                }
                l76 l76Var13 = l76Var5;
                cc6.g(z1111, (xy1) objK2, null, false, null, h02Var, 0);
                ob3Var6 = ob3Var5;
                sx1Var6 = sx1Var5;
                g75.y(xs2.H(R.array.mouse_buttons_options, h02Var)[2], null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).m, h02Var, 0, 0, 131070);
                h02Var.b(true);
                h02Var.b(true);
                kb4 kb4VarG1112 = jb4.g(wqVar, j00Var2, h02Var, 48);
                int iHashCode1113 = Long.hashCode(h02Var.T);
                tr3 tr3VarQ1113 = h02Var.q();
                j73 j73VarW1113 = m50.W(h02Var, g73Var);
                h02Var.b0();
                if (h02Var.S) {
                    sx1Var7 = sx1Var6;
                    h02Var.m(sx1Var7);
                } else {
                    sx1Var7 = sx1Var6;
                    h02Var.l0();
                }
                xs2.E(on0Var, h02Var, kb4VarG1112);
                xs2.E(on0Var2, h02Var, tr3VarQ1113);
                du4.k(iHashCode1113, h02Var, on0Var3, h02Var);
                xs2.E(on0Var4, h02Var, j73VarW1113);
                sx1Var8 = sx1Var7;
                g75.y(xs2.I(R.string.mouse_settings_show_buttons_above, h02Var), ue5.i0(g73Var, 0.0f, 0.0f, 16.0f, 0.0f, 11).n(new tp2(1.0f, true)), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var, 0, 0, 262140);
                boolean z1112 = ((r04) ob3Var6.getValue()).d().t;
                if (i3 == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objK3 = h02Var.K();
                if (z3) {
                    ob3Var7 = ob3Var6;
                    objK3 = new d80((byte) 6, xy1Var, ob3Var7);
                    h02Var.i0(objK3);
                } else {
                    ob3Var7 = ob3Var6;
                    objK3 = new d80((byte) 6, xy1Var, ob3Var7);
                    h02Var.i0(objK3);
                }
                k05.g(z1112, (xy1) objK3, null, null, false, null, h02Var, 0, 124);
                h02Var.b(true);
                ob3Var8 = ob3Var7;
                g75.y(xs2.I(R.string.mouse_settings_scroll_bar, h02Var), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).j, h02Var, 0, 0, 131070);
                kb4 kb4VarG1113 = jb4.g(wqVar, j00Var, h02Var, 0);
                int iHashCode1114 = Long.hashCode(h02Var.T);
                tr3 tr3VarQ1114 = h02Var.q();
                j73 j73VarW1114 = m50.W(h02Var, g73Var);
                h02Var.b0();
                if (h02Var.S) {
                    sx1Var9 = sx1Var8;
                    h02Var.m(sx1Var9);
                } else {
                    sx1Var9 = sx1Var8;
                    h02Var.l0();
                }
                xs2.E(on0Var, h02Var, kb4VarG1113);
                xs2.E(on0Var2, h02Var, tr3VarQ1114);
                du4.k(iHashCode1114, h02Var, on0Var3, h02Var);
                xs2.E(on0Var4, h02Var, j73VarW1114);
                j73 j73VarE110 = ue5.e0(g73Var, 4.0f);
                kb4 kb4VarG1114 = jb4.g(wqVar, j00Var2, h02Var, 48);
                int iHashCode1115 = Long.hashCode(h02Var.T);
                tr3 tr3VarQ1115 = h02Var.q();
                j73 j73VarW1115 = m50.W(h02Var, j73VarE110);
                h02Var.b0();
                if (h02Var.S) {
                    h02Var.m(sx1Var9);
                } else {
                    h02Var.l0();
                }
                xs2.E(on0Var, h02Var, kb4VarG1114);
                xs2.E(on0Var2, h02Var, tr3VarQ1115);
                du4.k(iHashCode1115, h02Var, on0Var3, h02Var);
                xs2.E(on0Var4, h02Var, j73VarW1115);
                boolean z1113 = ((r04) ob3Var8.getValue()).d().i;
                if (i3 == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objK4 = h02Var.K();
                if (z4) {
                    ob3Var9 = ob3Var8;
                    objK4 = new d80((byte) 7, xy1Var, ob3Var9);
                    h02Var.i0(objK4);
                } else {
                    ob3Var9 = ob3Var8;
                    objK4 = new d80((byte) 7, xy1Var, ob3Var9);
                    h02Var.i0(objK4);
                }
                cc6.g(z1113, (xy1) objK4, null, false, null, h02Var, 0);
                ob3Var10 = ob3Var9;
                sx1Var10 = sx1Var9;
                g75.y(xs2.H(R.array.horizontal_position_options, h02Var)[0], null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).m, h02Var, 0, 0, 131070);
                h02Var.b(true);
                j73 j73VarE111 = ue5.e0(g73Var, 4.0f);
                kb4 kb4VarG1115 = jb4.g(wqVar, j00Var2, h02Var, 48);
                int iHashCode1116 = Long.hashCode(h02Var.T);
                tr3 tr3VarQ1116 = h02Var.q();
                j73 j73VarW1116 = m50.W(h02Var, j73VarE111);
                h02Var.b0();
                if (h02Var.S) {
                    h02Var.m(sx1Var10);
                } else {
                    h02Var.l0();
                }
                xs2.E(on0Var, h02Var, kb4VarG1115);
                xs2.E(on0Var2, h02Var, tr3VarQ1116);
                du4.k(iHashCode1116, h02Var, on0Var3, h02Var);
                xs2.E(on0Var4, h02Var, j73VarW1116);
                boolean z1114 = ((r04) ob3Var10.getValue()).d().b;
                if (i3 == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objK5 = h02Var.K();
                if (z5) {
                    objK5 = new d80((byte) 8, xy1Var, ob3Var10);
                    h02Var.i0(objK5);
                } else {
                    objK5 = new d80((byte) 8, xy1Var, ob3Var10);
                    h02Var.i0(objK5);
                }
                cc6.g(z1114, (xy1) objK5, null, false, null, h02Var, 0);
                obj = xy1Var;
                g75.y(xs2.H(R.array.horizontal_position_options, h02Var)[1], null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).m, h02Var, 0, 0, 131070);
                h02Var2 = h02Var;
                h02Var2.b(true);
                h02Var2.b(true);
                h02Var2.b(true);
            } else {
                l76Var5 = l76Var4;
            }
            ob3Var5 = ob3Var4;
            c = 5;
            objK2 = new d80((byte) 5, xy1Var, ob3Var5);
            h02Var.i0(objK2);
            l76 l76Var14 = l76Var5;
            cc6.g(z1111, (xy1) objK2, null, false, null, h02Var, 0);
            ob3Var6 = ob3Var5;
            sx1Var6 = sx1Var5;
            g75.y(xs2.H(R.array.mouse_buttons_options, h02Var)[2], null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).m, h02Var, 0, 0, 131070);
            h02Var.b(true);
            h02Var.b(true);
            kb4 kb4VarG1116 = jb4.g(wqVar, j00Var2, h02Var, 48);
            int iHashCode1117 = Long.hashCode(h02Var.T);
            tr3 tr3VarQ1117 = h02Var.q();
            j73 j73VarW1117 = m50.W(h02Var, g73Var);
            h02Var.b0();
            if (h02Var.S) {
                sx1Var7 = sx1Var6;
                h02Var.m(sx1Var7);
            } else {
                sx1Var7 = sx1Var6;
                h02Var.l0();
            }
            xs2.E(on0Var, h02Var, kb4VarG1116);
            xs2.E(on0Var2, h02Var, tr3VarQ1117);
            du4.k(iHashCode1117, h02Var, on0Var3, h02Var);
            xs2.E(on0Var4, h02Var, j73VarW1117);
            sx1Var8 = sx1Var7;
            g75.y(xs2.I(R.string.mouse_settings_show_buttons_above, h02Var), ue5.i0(g73Var, 0.0f, 0.0f, 16.0f, 0.0f, 11).n(new tp2(1.0f, true)), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var, 0, 0, 262140);
            boolean z1115 = ((r04) ob3Var6.getValue()).d().t;
            if (i3 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            objK3 = h02Var.K();
            if (z3) {
                ob3Var7 = ob3Var6;
                objK3 = new d80((byte) 6, xy1Var, ob3Var7);
                h02Var.i0(objK3);
            } else {
                ob3Var7 = ob3Var6;
                objK3 = new d80((byte) 6, xy1Var, ob3Var7);
                h02Var.i0(objK3);
            }
            k05.g(z1115, (xy1) objK3, null, null, false, null, h02Var, 0, 124);
            h02Var.b(true);
            ob3Var8 = ob3Var7;
            g75.y(xs2.I(R.string.mouse_settings_scroll_bar, h02Var), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).j, h02Var, 0, 0, 131070);
            kb4 kb4VarG1117 = jb4.g(wqVar, j00Var, h02Var, 0);
            int iHashCode1118 = Long.hashCode(h02Var.T);
            tr3 tr3VarQ1118 = h02Var.q();
            j73 j73VarW1118 = m50.W(h02Var, g73Var);
            h02Var.b0();
            if (h02Var.S) {
                sx1Var9 = sx1Var8;
                h02Var.m(sx1Var9);
            } else {
                sx1Var9 = sx1Var8;
                h02Var.l0();
            }
            xs2.E(on0Var, h02Var, kb4VarG1117);
            xs2.E(on0Var2, h02Var, tr3VarQ1118);
            du4.k(iHashCode1118, h02Var, on0Var3, h02Var);
            xs2.E(on0Var4, h02Var, j73VarW1118);
            j73 j73VarE112 = ue5.e0(g73Var, 4.0f);
            kb4 kb4VarG1118 = jb4.g(wqVar, j00Var2, h02Var, 48);
            int iHashCode1119 = Long.hashCode(h02Var.T);
            tr3 tr3VarQ1119 = h02Var.q();
            j73 j73VarW1119 = m50.W(h02Var, j73VarE112);
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(sx1Var9);
            } else {
                h02Var.l0();
            }
            xs2.E(on0Var, h02Var, kb4VarG1118);
            xs2.E(on0Var2, h02Var, tr3VarQ1119);
            du4.k(iHashCode1119, h02Var, on0Var3, h02Var);
            xs2.E(on0Var4, h02Var, j73VarW1119);
            boolean z1116 = ((r04) ob3Var8.getValue()).d().i;
            if (i3 == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            objK4 = h02Var.K();
            if (z4) {
                ob3Var9 = ob3Var8;
                objK4 = new d80((byte) 7, xy1Var, ob3Var9);
                h02Var.i0(objK4);
            } else {
                ob3Var9 = ob3Var8;
                objK4 = new d80((byte) 7, xy1Var, ob3Var9);
                h02Var.i0(objK4);
            }
            cc6.g(z1116, (xy1) objK4, null, false, null, h02Var, 0);
            ob3Var10 = ob3Var9;
            sx1Var10 = sx1Var9;
            g75.y(xs2.H(R.array.horizontal_position_options, h02Var)[0], null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).m, h02Var, 0, 0, 131070);
            h02Var.b(true);
            j73 j73VarE113 = ue5.e0(g73Var, 4.0f);
            kb4 kb4VarG1119 = jb4.g(wqVar, j00Var2, h02Var, 48);
            int iHashCode11110 = Long.hashCode(h02Var.T);
            tr3 tr3VarQ11110 = h02Var.q();
            j73 j73VarW11110 = m50.W(h02Var, j73VarE113);
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(sx1Var10);
            } else {
                h02Var.l0();
            }
            xs2.E(on0Var, h02Var, kb4VarG1119);
            xs2.E(on0Var2, h02Var, tr3VarQ11110);
            du4.k(iHashCode11110, h02Var, on0Var3, h02Var);
            xs2.E(on0Var4, h02Var, j73VarW11110);
            boolean z1117 = ((r04) ob3Var10.getValue()).d().b;
            if (i3 == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            objK5 = h02Var.K();
            if (z5) {
                objK5 = new d80((byte) 8, xy1Var, ob3Var10);
                h02Var.i0(objK5);
            } else {
                objK5 = new d80((byte) 8, xy1Var, ob3Var10);
                h02Var.i0(objK5);
            }
            cc6.g(z1117, (xy1) objK5, null, false, null, h02Var, 0);
            obj = xy1Var;
            g75.y(xs2.H(R.array.horizontal_position_options, h02Var)[1], null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jr2.e(h02Var).m, h02Var, 0, 0, 131070);
            h02Var2 = h02Var;
            h02Var2.b(true);
            h02Var2.b(true);
            h02Var2.b(true);
        } else {
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new jp4((byte) 5, i, r04Var, obj);
        }
    }

    public static final boolean v(k44 k44Var, float f, float f2) {
        float f3 = k44Var.g;
        if (f > k44Var.r || f3 > f) {
            return false;
        }
        return f2 <= k44Var.n && k44Var.y <= f2;
    }

    public static final void y(vv3 vv3Var, ya5 ya5Var, my1 my1Var, ox0 ox0Var, boolean z, ob3 ob3Var, nm0 nm0Var, h02 h02Var, int i) {
        int i2;
        h02Var.Z(-1413720282);
        if ((i & 6) == 0) {
            i2 = (h02Var.x(vv3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? h02Var.x(ya5Var) : h02Var.j(ya5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= h02Var.j(my1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= h02Var.j(ox0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= h02Var.l(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= h02Var.x(ob3Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= h02Var.j(nm0Var) ? 1048576 : 524288;
        }
        byte b = 1;
        if (h02Var.N(i2 & 1, (599187 & i2) != 599186)) {
            String strI = xs2.I(R.string.tooltip_description, h02Var);
            boolean zJ = ((i2 & 112) == 32 || ((i2 & 64) != 0 && h02Var.j(ya5Var))) | ((i2 & 896) == 256) | h02Var.j(ox0Var) | ((458752 & i2) == 131072);
            Object objK = h02Var.K();
            if (zJ || objK == oo0.g) {
                objK = new jb(my1Var, ya5Var, ox0Var, ob3Var);
                h02Var.i0(objK);
            }
            de.g(vv3Var, (my1) objK, new wv3(z), ue5.m0(-1287705660, new k6(strI, nm0Var, b), h02Var), h02Var, (i2 & 14) | 3072, 0);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new mz(vv3Var, ya5Var, my1Var, ox0Var, z, ob3Var, nm0Var, i);
        }
    }
}
