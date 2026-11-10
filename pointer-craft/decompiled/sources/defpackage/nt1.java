package defpackage;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class nt1 implements lt1 {
    public final ba g;
    public cu1 j;
    public final jt1 n;
    public na3 x;
    public final ba y;
    public final cu1 r = new cu1(2, null, 14);
    public final mt1 v = new mt1(this);
    public final xa3 l = new xa3(1);

    public nt1(ba baVar, ba baVar2) {
        this.g = baVar;
        this.y = baVar2;
        this.n = new jt1(this, baVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r21v3, types: [int] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    public final boolean a(KeyEvent keyEvent) {
        int iNumberOfTrailingZeros;
        boolean z;
        long j;
        int iNumberOfTrailingZeros2;
        long[] jArr;
        int i;
        long jR = mx5.r(keyEvent);
        int iN = mx5.n(keyEvent);
        int i2 = -862048943;
        long j2 = 0;
        char c = '\b';
        int i3 = 0;
        boolean z2 = true;
        if (!lx5.y(iN, 2)) {
            if (!lx5.y(iN, 1)) {
                return true;
            }
            na3 na3Var = this.x;
            if (na3Var == null || !na3Var.g(jR)) {
                return false;
            }
            na3 na3Var2 = this.x;
            if (na3Var2 != null) {
                int iHashCode = Long.hashCode(jR) * (-862048943);
                int i4 = iHashCode ^ (iHashCode << 16);
                int i5 = i4 & 127;
                int i6 = na3Var2.r;
                int i7 = i4 >>> 7;
                loop5: while (true) {
                    int i8 = i7 & i6;
                    long[] jArr2 = na3Var2.g;
                    int i9 = i8 >> 3;
                    int i10 = (i8 & 7) << 3;
                    long j3 = ((jArr2[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr2[i9] >>> i10);
                    long j4 = (((long) i5) * 72340172838076673L) ^ j3;
                    for (long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                        iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i8) & i6;
                        if (na3Var2.y[iNumberOfTrailingZeros] == jR) {
                            break loop5;
                        }
                    }
                    if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                        iNumberOfTrailingZeros = -1;
                        break;
                    }
                    i3 += 8;
                    i7 = i8 + i3;
                }
                if (iNumberOfTrailingZeros >= 0) {
                    na3Var2.n--;
                    long[] jArr3 = na3Var2.g;
                    int i11 = na3Var2.r;
                    int i12 = iNumberOfTrailingZeros >> 3;
                    int i13 = (iNumberOfTrailingZeros & 7) << 3;
                    long j6 = (jArr3[i12] & (~(255 << i13))) | (254 << i13);
                    jArr3[i12] = j6;
                    jArr3[(((iNumberOfTrailingZeros - 7) & i11) + (i11 & 7)) >> 3] = j6;
                    return true;
                }
            }
            return true;
        }
        na3 na3Var3 = this.x;
        if (na3Var3 == null) {
            na3Var3 = new na3(3);
            this.x = na3Var3;
        }
        na3 na3Var4 = na3Var3;
        int iHashCode2 = Long.hashCode(jR) * (-862048943);
        int i14 = iHashCode2 ^ (iHashCode2 << 16);
        int i15 = i14 >>> 7;
        int i16 = i14 & 127;
        int i17 = na3Var4.r;
        int i18 = i15 & i17;
        int i19 = 0;
        loop0: while (true) {
            long[] jArr4 = na3Var4.g;
            int i20 = i18 >> 3;
            int i21 = (i18 & 7) << 3;
            long j7 = (jArr4[i20] >>> i21) | ((jArr4[i20 + 1] << (64 - i21)) & ((-i21) >> 63));
            int i22 = i2;
            long j8 = i16;
            long j9 = j7 ^ (j8 * 72340172838076673L);
            long j10 = (j9 - 72340172838076673L) & (~j9) & (-9187201950435737472L);
            while (j10 != j2) {
                iNumberOfTrailingZeros2 = (i18 + (Long.numberOfTrailingZeros(j10) >> 3)) & i17;
                long j11 = j2;
                if (na3Var4.y[iNumberOfTrailingZeros2] == jR) {
                    z = true;
                    break loop0;
                }
                j10 &= j10 - 1;
                j2 = j11;
            }
            long j12 = j2;
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != j12) {
                int iY = na3Var4.y(i15);
                if (na3Var4.v != 0 || ((na3Var4.g[iY >> 3] >> ((iY & 7) << 3)) & 255) == 254) {
                    z = true;
                    j = 128;
                } else {
                    int i23 = na3Var4.r;
                    if (i23 <= 8 || Long.compare((((long) na3Var4.n) * 32) ^ Long.MIN_VALUE, (((long) i23) * 25) ^ Long.MIN_VALUE) > 0) {
                        z = true;
                        j = 128;
                        int iY2 = ee4.y(na3Var4.r);
                        long[] jArr5 = na3Var4.g;
                        long[] jArr6 = na3Var4.y;
                        int i24 = na3Var4.r;
                        na3Var4.r(iY2);
                        long[] jArr7 = na3Var4.g;
                        long[] jArr8 = na3Var4.y;
                        int i25 = na3Var4.r;
                        int i26 = 0;
                        while (i26 < i24) {
                            if (((jArr5[i26 >> 3] >> ((i26 & 7) << 3)) & 255) < 128) {
                                long j13 = jArr6[i26];
                                int iHashCode3 = Long.hashCode(j13) * i22;
                                int i27 = iHashCode3 ^ (iHashCode3 << 16);
                                jArr = jArr7;
                                int iY3 = na3Var4.y(i27 >>> 7);
                                long j14 = i27 & 127;
                                int i28 = iY3 >> 3;
                                int i29 = (iY3 & 7) << 3;
                                long j15 = (jArr[i28] & (~(255 << i29))) | (j14 << i29);
                                jArr[i28] = j15;
                                jArr[(((iY3 - 7) & i25) + (i25 & 7)) >> 3] = j15;
                                jArr8[iY3] = j13;
                            } else {
                                jArr = jArr7;
                            }
                            i26++;
                            jArr7 = jArr;
                            jArr5 = jArr5;
                            jArr6 = jArr6;
                        }
                    } else {
                        long[] jArr9 = na3Var4.g;
                        int i30 = na3Var4.r;
                        long[] jArr10 = na3Var4.y;
                        int i31 = (i30 + 7) >> 3;
                        int i32 = 0;
                        while (i32 < i31) {
                            long j16 = jArr9[i32] & (-9187201950435737472L);
                            jArr9[i32] = ((~j16) + (j16 >>> 7)) & (-72340172838076674L);
                            i32++;
                            c = c;
                            i30 = i30;
                        }
                        char c2 = c;
                        int i33 = i30;
                        j = 128;
                        int iZ = pr.Z(jArr9);
                        int i34 = iZ - 1;
                        long j17 = 72057594037927935L;
                        jArr9[i34] = (jArr9[i34] & 72057594037927935L) | (-72057594037927936L);
                        jArr9[iZ] = jArr9[0];
                        int i35 = i33;
                        int i36 = 0;
                        while (i36 != i35) {
                            int i37 = i36 >> 3;
                            int i38 = (i36 & 7) << 3;
                            long j18 = (jArr9[i37] >> i38) & 255;
                            if (j18 != 128 && j18 == 254) {
                                int iHashCode4 = Long.hashCode(jArr10[i36]) * i22;
                                int i39 = iHashCode4 ^ (iHashCode4 << 16);
                                long j19 = j17;
                                int i40 = i39 >>> 7;
                                int iY4 = na3Var4.y(i40);
                                int i41 = i40 & i35;
                                char c3 = c2;
                                if (((iY4 - i41) & i35) / 8 == ((i36 - i41) & i35) / 8) {
                                    jArr9[i37] = ((~(255 << i38)) & jArr9[i37]) | (((long) (i39 & 127)) << i38);
                                    jArr9[jArr9.length - 1] = (jArr9[0] & j19) | Long.MIN_VALUE;
                                    i36++;
                                } else {
                                    int i42 = iY4 >> 3;
                                    long j20 = jArr9[i42];
                                    int i43 = (iY4 & 7) << 3;
                                    if (((j20 >> i43) & 255) == 128) {
                                        int i44 = i36;
                                        jArr9[i42] = (j20 & (~(255 << i43))) | (((long) (i39 & 127)) << i43);
                                        jArr9[i37] = (jArr9[i37] & (~(255 << i38))) | (128 << i38);
                                        jArr10[iY4] = jArr10[i44];
                                        jArr10[i44] = j12;
                                        i = i44;
                                    } else {
                                        int i45 = i36;
                                        jArr9[i42] = (j20 & (~(255 << i43))) | (((long) (i39 & 127)) << i43);
                                        long j21 = jArr10[iY4];
                                        jArr10[iY4] = jArr10[i45];
                                        jArr10[i45] = j21;
                                        i = i45 - 1;
                                    }
                                    jArr9[jArr9.length - 1] = (jArr9[0] & j19) | Long.MIN_VALUE;
                                    i36 = i + 1;
                                    i35 = i35;
                                }
                                j17 = j19;
                                c2 = c3;
                                z2 = z2;
                            } else {
                                i36++;
                            }
                        }
                        z = z2;
                        na3Var4.v = ee4.g(na3Var4.r) - na3Var4.n;
                    }
                    iY = na3Var4.y(i15);
                }
                iNumberOfTrailingZeros2 = iY;
                na3Var4.n++;
                int i46 = na3Var4.v;
                long[] jArr11 = na3Var4.g;
                int i47 = iNumberOfTrailingZeros2 >> 3;
                long j22 = jArr11[i47];
                int i48 = (iNumberOfTrailingZeros2 & 7) << 3;
                na3Var4.v = i46 - (((j22 >> i48) & 255) == j ? z : 0);
                int i49 = na3Var4.r;
                long j23 = (j22 & (~(255 << i48))) | (j8 << i48);
                jArr11[i47] = j23;
                jArr11[(((iNumberOfTrailingZeros2 - 7) & i49) + (i49 & 7)) >> 3] = j23;
                break;
            }
            i19 += 8;
            i18 = (i18 + i19) & i17;
            i2 = i22;
            j2 = j12;
        }
        na3Var4.y[iNumberOfTrailingZeros2] = jR;
        return z;
    }

    public final boolean g(boolean z) {
        ah3 ah3Var;
        if (x() != null) {
            cu1 cu1VarX = x();
            t(null);
            if (cu1VarX != null) {
                xt1 xt1Var = xt1.j;
                xt1 xt1Var2 = xt1.a;
                cu1VarX.R0(xt1Var, xt1Var2);
                if (!cu1VarX.j.h) {
                    mc2.y("visitAncestors called on an unattached node");
                }
                i73 i73Var = cu1VarX.j.q;
                um2 um2VarV = k33.V(cu1VarX);
                while (um2VarV != null) {
                    if ((um2VarV.M.x.m & 1024) != 0) {
                        while (i73Var != null) {
                            if ((i73Var.a & 1024) != 0) {
                                i73 i73VarQ = i73Var;
                                rb3 rb3Var = null;
                                while (i73VarQ != null) {
                                    if (i73VarQ instanceof cu1) {
                                        ((cu1) i73VarQ).R0(xt1.t, xt1Var2);
                                    } else if ((i73VarQ.a & 1024) != 0 && (i73VarQ instanceof p41)) {
                                        int i = 0;
                                        for (i73 i73Var2 = ((p41) i73VarQ).f; i73Var2 != null; i73Var2 = i73Var2.w) {
                                            if ((i73Var2.a & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    i73VarQ = i73Var2;
                                                } else {
                                                    if (rb3Var == null) {
                                                        rb3Var = new rb3(new i73[16]);
                                                    }
                                                    if (i73VarQ != null) {
                                                        rb3Var.y(i73VarQ);
                                                        i73VarQ = null;
                                                    }
                                                    rb3Var.y(i73Var2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    i73VarQ = k33.Q(rb3Var);
                                }
                            }
                            i73Var = i73Var.q;
                        }
                    }
                    um2VarV = um2VarV.o();
                    i73Var = (um2VarV == null || (ah3Var = um2VarV.M) == null) ? null : ah3Var.v;
                }
            }
        }
        return true;
    }

    public final boolean j(int i) {
        if (!y(i, false, false)) {
            return false;
        }
        Boolean boolV = v(i, null, new i30(i, (byte) 5));
        boolean zBooleanValue = boolV != null ? boolV.booleanValue() : false;
        if (!zBooleanValue) {
            r();
        }
        return zBooleanValue;
    }

    public final boolean l(int i, boolean z) {
        cu1 cu1VarX = x();
        ba baVar = this.g;
        if (cu1VarX == null || !cu1VarX.o || !baVar.A(i)) {
            u54 u54Var = new u54();
            u54Var.j = Boolean.FALSE;
            cu1 cu1VarX2 = x();
            Boolean boolV = v(i, baVar.getEmbeddedViewFocusRect(), new v2(u54Var, i, (byte) 3));
            if (!yf2.p(boolV, Boolean.TRUE) || cu1VarX2 == x()) {
                if (boolV != null && u54Var.j != null) {
                    if (!boolV.booleanValue() || !((Boolean) u54Var.j).booleanValue()) {
                        if (yf6.w(i) && z && y(i, false, false)) {
                            Boolean boolV2 = v(i, null, new i30(i, (byte) 6));
                            if (boolV2 != null ? boolV2.booleanValue() : false) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0151 A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x015f A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0164  */
    /* JADX WARN: Code duplicated, block: B:316:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:323:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x005b A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:336:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x0158 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:345:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x0143 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0061 A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x006c A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0076 A[ADDED_TO_REGION, LOOP:12: B:39:0x0076->B:67:0x00c2, LOOP_START, PHI: r6
  0x0076: PHI (r6v27 i73) = (r6v22 i73), (r6v28 i73) binds: [B:38:0x0074, B:67:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x0078 A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082 A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0087 A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9 A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x00df A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5 A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f2 A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x00fc A[ADDED_TO_REGION, LOOP:16: B:85:0x00fc->B:113:0x0148, LOOP_START, PHI: r12
  0x00fc: PHI (r12v13 i73) = (r12v8 i73), (r12v14 i73) binds: [B:84:0x00fa, B:113:0x0148] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x00fe A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0104  */
    /* JADX WARN: Code duplicated, block: B:90:0x0108 A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x010d A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0113 A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v20, types: [rb3] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [rb3] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r12v23, types: [i73] */
    /* JADX WARN: Type inference failed for: r12v24, types: [i73] */
    /* JADX WARN: Type inference failed for: r12v28, types: [i73] */
    /* JADX WARN: Type inference failed for: r12v29, types: [i73] */
    /* JADX WARN: Type inference failed for: r12v33, types: [i73] */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v42, types: [i73] */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r12v63 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [rb3] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6, types: [rb3] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r6v37 */
    public final boolean n(KeyEvent keyEvent, my1 my1Var) {
        i73 i73Var;
        um2 um2VarV;
        Object obj;
        Object obj2;
        i73 i73Var2;
        ah3 ah3Var;
        i73 i73VarQ;
        rb3 rb3Var;
        i73 i73Var3;
        um2 um2VarV2;
        Object obj3;
        Object obj4;
        ah3 ah3Var2;
        rb3 rb3Var2;
        i73 i73VarQ2;
        int size;
        ah3 ah3Var3;
        boolean z;
        cu1 cu1Var = this.r;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.n.v) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                Trace.endSection();
                return false;
            }
            if (!a(keyEvent)) {
                Trace.endSection();
                return false;
            }
            cu1 cu1VarH = og0.h(cu1Var);
            if (cu1VarH != null) {
                if (!cu1VarH.j.h) {
                    mc2.y("visitLocalDescendants called on an unattached node");
                }
                i73 i73Var4 = cu1VarH.j;
                if ((i73Var4.m & 9216) != 0) {
                    i73Var2 = null;
                    for (i73 i73Var5 = i73Var4.w; i73Var5 != null; i73Var5 = i73Var5.w) {
                        int i = i73Var5.a;
                        if ((i & 9216) != 0) {
                            if ((i & 1024) != 0) {
                                break;
                            }
                            i73Var2 = i73Var5;
                        }
                    }
                } else {
                    i73Var2 = null;
                }
                if (i73Var2 == null) {
                    if (cu1VarH == null) {
                        if (!cu1Var.j.h) {
                            mc2.y("visitAncestors called on an unattached node");
                        }
                        i73Var = cu1Var.j.q;
                        um2VarV = k33.V(cu1Var);
                        loop15: while (true) {
                            if (um2VarV != null) {
                                obj = null;
                                break;
                            }
                            if ((um2VarV.M.x.m & 8192) != 0) {
                                while (i73Var != null) {
                                    if ((i73Var.a & 8192) != 0) {
                                        i73VarQ = i73Var;
                                        rb3Var = null;
                                        while (i73VarQ != null) {
                                            if (i73VarQ instanceof oi2) {
                                                obj = i73VarQ;
                                                break loop15;
                                            }
                                            if ((i73VarQ.a & 8192) == 0) {
                                            }
                                            i73VarQ = k33.Q(rb3Var);
                                        }
                                    }
                                    i73Var = i73Var.q;
                                }
                            }
                            um2VarV = um2VarV.o();
                            if (um2VarV != null) {
                            }
                        }
                        obj2 = (oi2) obj;
                        if (obj2 != null) {
                            i73Var2 = ((i73) obj2).j;
                        } else {
                            i73Var2 = null;
                        }
                    } else {
                        if (!cu1VarH.j.h) {
                            mc2.y("visitAncestors called on an unattached node");
                        }
                        i73Var3 = cu1VarH.j;
                        um2VarV2 = k33.V(cu1VarH);
                        loop11: while (true) {
                            if (um2VarV2 != null) {
                                obj3 = null;
                                break;
                            }
                            if ((um2VarV2.M.x.m & 8192) != 0) {
                                while (i73Var3 != null) {
                                    if ((i73Var3.a & 8192) != 0) {
                                        rb3Var2 = null;
                                        i73VarQ2 = i73Var3;
                                        while (i73VarQ2 != null) {
                                            if (i73VarQ2 instanceof oi2) {
                                                obj3 = i73VarQ2;
                                                break loop11;
                                            }
                                            if ((i73VarQ2.a & 8192) == 0) {
                                            }
                                            i73VarQ2 = k33.Q(rb3Var2);
                                        }
                                    }
                                    i73Var3 = i73Var3.q;
                                }
                            }
                            um2VarV2 = um2VarV2.o();
                            if (um2VarV2 != null) {
                            }
                        }
                        obj4 = (oi2) obj3;
                        if (obj4 != null) {
                            i73Var2 = ((i73) obj4).j;
                        } else {
                            if (!cu1Var.j.h) {
                                mc2.y("visitAncestors called on an unattached node");
                            }
                            i73Var = cu1Var.j.q;
                            um2VarV = k33.V(cu1Var);
                            loop15: while (true) {
                                if (um2VarV != null) {
                                    obj = null;
                                    break;
                                }
                                if ((um2VarV.M.x.m & 8192) != 0) {
                                    while (i73Var != null) {
                                        if ((i73Var.a & 8192) != 0) {
                                            i73VarQ = i73Var;
                                            rb3Var = null;
                                            while (i73VarQ != null) {
                                                if (i73VarQ instanceof oi2) {
                                                    obj = i73VarQ;
                                                    break loop15;
                                                }
                                                if ((i73VarQ.a & 8192) == 0) {
                                                }
                                                i73VarQ = k33.Q(rb3Var);
                                            }
                                        }
                                        i73Var = i73Var.q;
                                    }
                                }
                                um2VarV = um2VarV.o();
                                if (um2VarV != null) {
                                }
                            }
                            obj2 = (oi2) obj;
                            if (obj2 != null) {
                                i73Var2 = ((i73) obj2).j;
                            } else {
                                i73Var2 = null;
                            }
                        }
                    }
                }
            } else if (cu1VarH == null) {
                if (!cu1Var.j.h) {
                    mc2.y("visitAncestors called on an unattached node");
                }
                i73Var = cu1Var.j.q;
                um2VarV = k33.V(cu1Var);
                loop15: while (true) {
                    if (um2VarV != null) {
                        obj = null;
                        break;
                    }
                    if ((um2VarV.M.x.m & 8192) != 0) {
                        while (i73Var != null) {
                            if ((i73Var.a & 8192) != 0) {
                                i73VarQ = i73Var;
                                rb3Var = null;
                                while (i73VarQ != null) {
                                    if (i73VarQ instanceof oi2) {
                                        obj = i73VarQ;
                                        break loop15;
                                    }
                                    if ((i73VarQ.a & 8192) == 0 && (i73VarQ instanceof p41)) {
                                        i73 i73Var6 = ((p41) i73VarQ).f;
                                        int i2 = 0;
                                        while (i73Var6 != null) {
                                            if ((i73Var6.a & 8192) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    i73VarQ = i73VarQ;
                                                    rb3Var = rb3Var;
                                                    rb3Var = rb3Var;
                                                    i73VarQ = i73Var6;
                                                } else {
                                                    if (rb3Var == null) {
                                                        rb3Var = new rb3(new i73[16]);
                                                    }
                                                    if (i73VarQ != null) {
                                                        rb3Var.y(i73VarQ);
                                                        i73VarQ = null;
                                                    }
                                                    rb3Var.y(i73Var6);
                                                }
                                            } else {
                                                i73VarQ = i73VarQ;
                                                rb3Var = rb3Var;
                                            }
                                            i73Var6 = i73Var6.w;
                                            i73VarQ = i73VarQ;
                                            rb3Var = rb3Var;
                                        }
                                        if (i2 == 1) {
                                            i73VarQ = i73VarQ;
                                            rb3Var = rb3Var;
                                        } else {
                                            i73VarQ = i73VarQ;
                                            rb3Var = rb3Var;
                                        }
                                    }
                                    i73VarQ = k33.Q(rb3Var);
                                }
                            }
                            i73Var = i73Var.q;
                        }
                    }
                    um2VarV = um2VarV.o();
                    i73Var = (um2VarV != null || (ah3Var = um2VarV.M) == null) ? null : ah3Var.v;
                }
                obj2 = (oi2) obj;
                if (obj2 != null) {
                    i73Var2 = ((i73) obj2).j;
                } else {
                    i73Var2 = null;
                }
            } else {
                if (!cu1VarH.j.h) {
                    mc2.y("visitAncestors called on an unattached node");
                }
                i73Var3 = cu1VarH.j;
                um2VarV2 = k33.V(cu1VarH);
                loop11: while (true) {
                    if (um2VarV2 != null) {
                        obj3 = null;
                        break;
                    }
                    if ((um2VarV2.M.x.m & 8192) != 0) {
                        while (i73Var3 != null) {
                            if ((i73Var3.a & 8192) != 0) {
                                rb3Var2 = null;
                                i73VarQ2 = i73Var3;
                                while (i73VarQ2 != null) {
                                    if (i73VarQ2 instanceof oi2) {
                                        obj3 = i73VarQ2;
                                        break loop11;
                                    }
                                    if ((i73VarQ2.a & 8192) == 0 && (i73VarQ2 instanceof p41)) {
                                        i73 i73Var7 = ((p41) i73VarQ2).f;
                                        int i3 = 0;
                                        while (i73Var7 != null) {
                                            if ((i73Var7.a & 8192) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    i73VarQ2 = i73VarQ2;
                                                    rb3Var2 = rb3Var2;
                                                    rb3Var2 = rb3Var2;
                                                    i73VarQ2 = i73Var7;
                                                } else {
                                                    if (rb3Var2 == null) {
                                                        rb3Var2 = new rb3(new i73[16]);
                                                    }
                                                    if (i73VarQ2 != null) {
                                                        rb3Var2.y(i73VarQ2);
                                                        i73VarQ2 = null;
                                                    }
                                                    rb3Var2.y(i73Var7);
                                                }
                                            } else {
                                                i73VarQ2 = i73VarQ2;
                                                rb3Var2 = rb3Var2;
                                            }
                                            i73Var7 = i73Var7.w;
                                            i73VarQ2 = i73VarQ2;
                                            rb3Var2 = rb3Var2;
                                        }
                                        if (i3 == 1) {
                                            i73VarQ2 = i73VarQ2;
                                            rb3Var2 = rb3Var2;
                                        } else {
                                            i73VarQ2 = i73VarQ2;
                                            rb3Var2 = rb3Var2;
                                        }
                                    }
                                    i73VarQ2 = k33.Q(rb3Var2);
                                }
                            }
                            i73Var3 = i73Var3.q;
                        }
                    }
                    um2VarV2 = um2VarV2.o();
                    i73Var3 = (um2VarV2 != null || (ah3Var2 = um2VarV2.M) == null) ? null : ah3Var2.v;
                }
                obj4 = (oi2) obj3;
                if (obj4 != null) {
                    i73Var2 = ((i73) obj4).j;
                } else {
                    if (!cu1Var.j.h) {
                        mc2.y("visitAncestors called on an unattached node");
                    }
                    i73Var = cu1Var.j.q;
                    um2VarV = k33.V(cu1Var);
                    loop15: while (true) {
                        if (um2VarV != null) {
                            obj = null;
                            break;
                        }
                        if ((um2VarV.M.x.m & 8192) != 0) {
                            while (i73Var != null) {
                                if ((i73Var.a & 8192) != 0) {
                                    i73VarQ = i73Var;
                                    rb3Var = null;
                                    while (i73VarQ != null) {
                                        if (i73VarQ instanceof oi2) {
                                            obj = i73VarQ;
                                            break loop15;
                                        }
                                        if ((i73VarQ.a & 8192) == 0) {
                                        }
                                        i73VarQ = k33.Q(rb3Var);
                                    }
                                }
                                i73Var = i73Var.q;
                            }
                        }
                        um2VarV = um2VarV.o();
                        if (um2VarV != null) {
                        }
                    }
                    obj2 = (oi2) obj;
                    if (obj2 != null) {
                        i73Var2 = ((i73) obj2).j;
                    } else {
                        i73Var2 = null;
                    }
                }
            }
            if (i73Var2 != null) {
                if (!i73Var2.j.h) {
                    mc2.y("visitAncestors called on an unattached node");
                }
                i73 i73Var8 = i73Var2.j.q;
                um2 um2VarV3 = k33.V(i73Var2);
                ArrayList arrayList = null;
                while (um2VarV3 != null) {
                    if ((um2VarV3.M.x.m & 8192) != 0) {
                        while (i73Var8 != null) {
                            if ((i73Var8.a & 8192) != 0) {
                                i73 i73VarQ3 = i73Var8;
                                rb3 rb3Var3 = null;
                                while (i73VarQ3 != null) {
                                    if (i73VarQ3 instanceof oi2) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(i73VarQ3);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (i73VarQ3.a & 8192) != 0 && (i73VarQ3 instanceof p41)) {
                                        int i4 = 0;
                                        for (i73 i73Var9 = ((p41) i73VarQ3).f; i73Var9 != null; i73Var9 = i73Var9.w) {
                                            if ((i73Var9.a & 8192) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    i73VarQ3 = i73Var9;
                                                } else {
                                                    if (rb3Var3 == null) {
                                                        rb3Var3 = new rb3(new i73[16]);
                                                    }
                                                    if (i73VarQ3 != null) {
                                                        rb3Var3.y(i73VarQ3);
                                                        i73VarQ3 = null;
                                                    }
                                                    rb3Var3.y(i73Var9);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    i73VarQ3 = k33.Q(rb3Var3);
                                }
                            }
                            i73Var8 = i73Var8.q;
                        }
                    }
                    um2VarV3 = um2VarV3.o();
                    i73Var8 = (um2VarV3 == null || (ah3Var3 = um2VarV3.M) == null) ? null : ah3Var3.v;
                }
                if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                    while (true) {
                        int i5 = size - 1;
                        if (((oi2) arrayList.get(size)).q(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                        if (i5 < 0) {
                            break;
                        }
                        size = i5;
                    }
                }
                ?? Q = i73Var2.j;
                ?? rb3Var4 = 0;
                while (Q != 0) {
                    if (Q instanceof oi2) {
                        if (((oi2) Q).q(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((Q.a & 8192) != 0 && (Q instanceof p41)) {
                        i73 i73Var10 = ((p41) Q).f;
                        int i6 = 0;
                        while (i73Var10 != null) {
                            if ((i73Var10.a & 8192) != 0) {
                                i6++;
                                if (i6 == 1) {
                                    rb3Var4 = rb3Var4;
                                    Q = Q;
                                    rb3Var4 = rb3Var4;
                                    Q = i73Var10;
                                } else {
                                    if (rb3Var4 == 0) {
                                        rb3Var4 = new rb3(new i73[16]);
                                    }
                                    if (Q != 0) {
                                        rb3Var4.y(Q);
                                        Q = 0;
                                    }
                                    rb3Var4.y(i73Var10);
                                }
                            } else {
                                rb3Var4 = rb3Var4;
                                Q = Q;
                            }
                            i73Var10 = i73Var10.w;
                            rb3Var4 = rb3Var4;
                            Q = Q;
                        }
                        if (i6 == 1) {
                            rb3Var4 = rb3Var4;
                            Q = Q;
                        } else {
                            rb3Var4 = rb3Var4;
                            Q = Q;
                        }
                    }
                    Q = k33.Q(rb3Var4);
                }
                if (((Boolean) my1Var.g()).booleanValue()) {
                    Trace.endSection();
                    return true;
                }
                ?? Q2 = i73Var2.j;
                ?? rb3Var5 = 0;
                while (Q2 != 0) {
                    if (Q2 instanceof oi2) {
                        if (((oi2) Q2).Z(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((Q2.a & 8192) != 0 && (Q2 instanceof p41)) {
                        i73 i73Var11 = ((p41) Q2).f;
                        int i7 = 0;
                        while (i73Var11 != null) {
                            if ((i73Var11.a & 8192) != 0) {
                                i7++;
                                if (i7 == 1) {
                                    Q2 = Q2;
                                    rb3Var5 = rb3Var5;
                                    rb3Var5 = rb3Var5;
                                    Q2 = i73Var11;
                                } else {
                                    if (rb3Var5 == 0) {
                                        rb3Var5 = new rb3(new i73[16]);
                                    }
                                    if (Q2 != 0) {
                                        rb3Var5.y(Q2);
                                        Q2 = 0;
                                    }
                                    rb3Var5.y(i73Var11);
                                }
                            } else {
                                Q2 = Q2;
                                rb3Var5 = rb3Var5;
                            }
                            i73Var11 = i73Var11.w;
                            Q2 = Q2;
                            rb3Var5 = rb3Var5;
                        }
                        if (i7 == 1) {
                            Q2 = Q2;
                            rb3Var5 = rb3Var5;
                        } else {
                            Q2 = Q2;
                            rb3Var5 = rb3Var5;
                        }
                    }
                    Q2 = k33.Q(rb3Var5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        if (((oi2) arrayList.get(i8)).Z(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    }
                }
            }
            Trace.endSection();
            return false;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void r() {
        ba baVar = this.g;
        if (baVar.isFocused() || baVar.hasFocus()) {
            baVar.clearFocus();
        } else if (baVar.hasFocus()) {
            View viewFindFocus = baVar.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            baVar.clearFocus();
        }
    }

    public final void t(cu1 cu1Var) {
        cu1 cu1Var2 = this.j;
        this.j = cu1Var;
        xa3 xa3Var = this.l;
        Object[] objArr = xa3Var.g;
        int i = xa3Var.y;
        for (int i2 = 0; i2 < i; i2++) {
            ((kt1) objArr[i2]).g(cu1Var2, cu1Var);
        }
    }

    public final Boolean v(int i, k44 k44Var, xy1 xy1Var) {
        cu1 cu1Var;
        ah3 ah3Var;
        cu1 cu1Var2 = this.r;
        cu1 cu1VarH = og0.h(cu1Var2);
        int i2 = 4;
        byte b = 2;
        ba baVar = this.y;
        boolean zBooleanValue = false;
        if (cu1VarH != null) {
            fl2 layoutDirection = baVar.getLayoutDirection();
            pt1 pt1VarS0 = cu1VarH.S0();
            rt1 rt1Var = pt1VarS0.j;
            rt1 rt1Var2 = pt1VarS0.t;
            if (i == 1) {
                rt1Var = pt1VarS0.y;
            } else if (i == 2) {
                rt1Var = pt1VarS0.r;
            } else if (i == 5) {
                rt1Var = pt1VarS0.n;
            } else if (i == 6) {
                rt1Var = pt1VarS0.v;
            } else if (i == 3) {
                int iOrdinal = layoutDirection.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        uo1.g();
                        return null;
                    }
                    rt1Var = rt1Var2;
                }
                if (rt1Var == rt1.y) {
                    rt1Var = null;
                }
                if (rt1Var == null) {
                    rt1Var = pt1VarS0.x;
                }
            } else if (i == 4) {
                int iOrdinal2 = layoutDirection.ordinal();
                if (iOrdinal2 == 0) {
                    rt1Var = rt1Var2;
                } else if (iOrdinal2 != 1) {
                    uo1.g();
                    return null;
                }
                if (rt1Var == rt1.y) {
                    rt1Var = null;
                }
                if (rt1Var == null) {
                    rt1Var = pt1VarS0.l;
                }
            } else {
                if (i != 7 && i != 8) {
                    l0.z("invalid FocusDirection");
                    return null;
                }
                db0 db0Var = new db0(i);
                nt1 nt1Var = (nt1) ((ba) k33.W(cu1VarH)).getFocusOwner();
                cu1 cu1VarX = nt1Var.x();
                if (i == 7) {
                    pt1VarS0.a.a(db0Var);
                } else {
                    pt1VarS0.m.a(db0Var);
                }
                rt1Var = db0Var.r() ? rt1.r : cu1VarX != nt1Var.x() ? rt1.n : rt1.y;
            }
            rt1 rt1Var3 = rt1.r;
            if (!yf2.p(rt1Var, rt1Var3)) {
                if (yf2.p(rt1Var, rt1.n)) {
                    cu1 cu1VarH2 = og0.h(cu1Var2);
                    if (cu1VarH2 != null) {
                        return (Boolean) xy1Var.a(cu1VarH2);
                    }
                } else {
                    rt1 rt1Var4 = rt1.y;
                    if (!yf2.p(rt1Var, rt1Var4)) {
                        if (rt1Var == rt1Var4) {
                            l0.z("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        if (rt1Var == rt1Var3) {
                            l0.z("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        rb3 rb3Var = rt1Var.g;
                        int i3 = rb3Var.a;
                        if (i3 == 0) {
                            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                        } else {
                            Object[] objArr = rb3Var.j;
                            boolean z = false;
                            for (int i4 = 0; i4 < i3; i4++) {
                                Object obj = (tt1) objArr[i4];
                                if (!((i73) obj).j.h) {
                                    mc2.y("visitChildren called on an unattached node");
                                }
                                rb3 rb3Var2 = new rb3(new i73[16]);
                                i73 i73Var = ((i73) obj).j;
                                i73 i73Var2 = i73Var.w;
                                if (i73Var2 == null) {
                                    k33.o(rb3Var2, i73Var);
                                } else {
                                    rb3Var2.y(i73Var2);
                                }
                                while (true) {
                                    int i5 = rb3Var2.a;
                                    if (i5 == 0) {
                                        break;
                                    }
                                    i73 i73VarQ = (i73) rb3Var2.w(i5 - 1);
                                    if ((i73VarQ.m & 1024) == 0) {
                                        k33.o(rb3Var2, i73VarQ);
                                    } else {
                                        while (i73VarQ != null) {
                                            if ((i73VarQ.a & 1024) != 0) {
                                                rb3 rb3Var3 = null;
                                                while (i73VarQ != null) {
                                                    if (i73VarQ instanceof cu1) {
                                                        if (((Boolean) xy1Var.a((cu1) i73VarQ)).booleanValue()) {
                                                            z = true;
                                                            break;
                                                        }
                                                    } else if ((i73VarQ.a & 1024) != 0 && (i73VarQ instanceof p41)) {
                                                        int i6 = 0;
                                                        for (i73 i73Var3 = ((p41) i73VarQ).f; i73Var3 != null; i73Var3 = i73Var3.w) {
                                                            if ((i73Var3.a & 1024) != 0) {
                                                                i6++;
                                                                if (i6 == 1) {
                                                                    i73VarQ = i73Var3;
                                                                } else {
                                                                    if (rb3Var3 == null) {
                                                                        rb3Var3 = new rb3(new i73[16]);
                                                                    }
                                                                    if (i73VarQ != null) {
                                                                        rb3Var3.y(i73VarQ);
                                                                        i73VarQ = null;
                                                                    }
                                                                    rb3Var3.y(i73Var3);
                                                                }
                                                            }
                                                        }
                                                        if (i6 == 1) {
                                                        }
                                                    }
                                                    i73VarQ = k33.Q(rb3Var3);
                                                }
                                                break;
                                            }
                                            i73VarQ = i73VarQ.w;
                                        }
                                    }
                                }
                            }
                            zBooleanValue = z;
                        }
                        return Boolean.valueOf(zBooleanValue);
                    }
                }
            }
            return null;
        }
        cu1VarH = null;
        fl2 layoutDirection2 = baVar.getLayoutDirection();
        bc bcVar = new bc(cu1VarH, this, xy1Var, b);
        if (i == 1 || i == 2) {
            return Boolean.valueOf(rb6.t(cu1Var2, i, bcVar));
        }
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return kq2.X(i, bcVar, cu1Var2, k44Var);
        }
        if (i == 7) {
            int iOrdinal3 = layoutDirection2.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    uo1.g();
                    return null;
                }
                i2 = 3;
            }
            cu1 cu1VarH3 = og0.h(cu1Var2);
            if (cu1VarH3 != null) {
                return kq2.X(i2, bcVar, cu1VarH3, k44Var);
            }
            return null;
        }
        if (i != 8) {
            throw new IllegalStateException("Focus search invoked with invalid FocusDirection ".concat(bt1.g(i)).toString());
        }
        cu1 cu1VarH4 = og0.h(cu1Var2);
        if (cu1VarH4 == null) {
            cu1Var = null;
            break;
        }
        if (!cu1VarH4.j.h) {
            mc2.y("visitAncestors called on an unattached node");
        }
        i73 i73Var4 = cu1VarH4.j.q;
        um2 um2VarV = k33.V(cu1VarH4);
        loop5: while (true) {
            if (um2VarV == null) {
                cu1Var = null;
                break;
            }
            if ((um2VarV.M.x.m & 1024) != 0) {
                while (i73Var4 != null) {
                    if ((i73Var4.a & 1024) != 0) {
                        i73 i73VarQ2 = i73Var4;
                        rb3 rb3Var4 = null;
                        while (i73VarQ2 != null) {
                            if (i73VarQ2 instanceof cu1) {
                                cu1 cu1Var3 = (cu1) i73VarQ2;
                                if (cu1Var3.S0().g) {
                                    cu1Var = cu1Var3;
                                    break loop5;
                                }
                            } else if ((i73VarQ2.a & 1024) != 0 && (i73VarQ2 instanceof p41)) {
                                int i7 = 0;
                                for (i73 i73Var5 = ((p41) i73VarQ2).f; i73Var5 != null; i73Var5 = i73Var5.w) {
                                    if ((i73Var5.a & 1024) != 0) {
                                        i7++;
                                        if (i7 == 1) {
                                            i73VarQ2 = i73Var5;
                                        } else {
                                            if (rb3Var4 == null) {
                                                rb3Var4 = new rb3(new i73[16]);
                                            }
                                            if (i73VarQ2 != null) {
                                                rb3Var4.y(i73VarQ2);
                                                i73VarQ2 = null;
                                            }
                                            rb3Var4.y(i73Var5);
                                        }
                                    }
                                }
                                if (i7 != 1) {
                                    i73VarQ2 = k33.Q(rb3Var4);
                                }
                            }
                            i73VarQ2 = k33.Q(rb3Var4);
                        }
                    }
                    i73Var4 = i73Var4.q;
                }
            }
            um2VarV = um2VarV.o();
            i73Var4 = (um2VarV == null || (ah3Var = um2VarV.M) == null) ? null : ah3Var.v;
        }
        if (cu1Var != null && cu1Var != cu1Var2) {
            zBooleanValue = ((Boolean) bcVar.a(cu1Var)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public final cu1 x() {
        cu1 cu1Var = this.j;
        if (cu1Var == null || !cu1Var.h) {
            return null;
        }
        return cu1Var;
    }

    public final boolean y(int i, boolean z, boolean z2) {
        int iOrdinal;
        boolean z3 = true;
        if (z || (iOrdinal = v70.G(this.r, i).ordinal()) == 0) {
            g(z);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                uo1.g();
                return false;
            }
            z3 = false;
        }
        if (z3 && z2) {
            r();
        }
        return z3;
    }
}
