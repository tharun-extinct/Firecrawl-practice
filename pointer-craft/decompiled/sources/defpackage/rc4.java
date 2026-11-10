package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rc4 implements bz1 {
    public final /* synthetic */ byte j;

    public /* synthetic */ rc4(byte b) {
        this.j = b;
    }

    /* JADX WARN: Code duplicated, block: B:131:0x0483 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:132:0x0485 A[LOOP:2: B:119:0x043e->B:132:0x0485, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:141:0x0488 A[SYNTHETIC] */
    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        hj hjVar;
        Object objG;
        switch (this.j) {
            case 0:
                sc4 sc4Var = (sc4) obj2;
                Map map = sc4Var.j;
                hb3 hb3Var = sc4Var.t;
                Object[] objArr = hb3Var.y;
                Object[] objArr2 = hb3Var.r;
                long[] jArr = hb3Var.g;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    Object obj3 = objArr[i4];
                                    Map mapV = ((uc4) objArr2[i4]).v();
                                    if (mapV.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, mapV);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 == 8) {
                                if (i != length) {
                                    i++;
                                }
                            }
                        } else if (i != length) {
                            i++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 1:
                return obj2;
            case 2:
                cj cjVar = (cj) obj2;
                return pw5.l(cjVar.t, qd4.g(cjVar.j, qd4.g, (pc4) obj));
            case 3:
                return Integer.valueOf(((l45) obj2).g);
            case 4:
                n65 n65Var = (n65) obj2;
                return pw5.l(Float.valueOf(n65Var.g), Float.valueOf(n65Var.y));
            case 5:
                pc4 pc4Var = (pc4) obj;
                o65 o65Var = (o65) obj2;
                n85 n85Var = new n85(o65Var.g);
                pd4 pd4Var = qd4.o;
                return pw5.l(qd4.g(n85Var, pd4Var, pc4Var), qd4.g(new n85(o65Var.y), pd4Var, pc4Var));
            case 6:
                return Integer.valueOf(((qv1) obj2).j);
            case 7:
                nv2 nv2Var = (nv2) obj2;
                return pw5.l(nv2Var.r(), qd4.g(nv2Var.g(), qd4.t, (pc4) obj));
            case 8:
                return Float.valueOf(((ry) obj2).g);
            case 9:
                pc4 pc4Var2 = (pc4) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList.add(qd4.g((bj) list.get(i5), qd4.y, pc4Var2));
                }
                return arrayList;
            case 10:
                u75 u75Var = (u75) obj2;
                return pw5.l(Integer.valueOf((int) (u75Var.g >> 32)), Integer.valueOf((int) (u75Var.g & 4294967295L)));
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                pc4 pc4Var3 = (pc4) obj;
                ym4 ym4Var = (ym4) obj2;
                return pw5.l(qd4.g(new jj0(ym4Var.g), qd4.b, pc4Var3), qd4.g(new wi3(ym4Var.y), qd4.k, pc4Var3), Float.valueOf(ym4Var.r));
            case 12:
                return Integer.valueOf(((g35) obj2).g);
            case 13:
                return Integer.valueOf(((p45) obj2).g);
            case 14:
                return Integer.valueOf(((e92) obj2).g);
            case kq2.x /* 15 */:
                return Integer.valueOf(((lv1) obj2).g);
            case 16:
                return Integer.valueOf(((mv1) obj2).g);
            case 17:
                n85 n85Var2 = (n85) obj2;
                return n85Var2 != null ? n85.g(n85Var2.g, n85.r) : false ? Boolean.FALSE : pw5.l(Float.valueOf(n85.r(n85Var2.g)), qd4.g(new o85(n85.y(n85Var2.g)), qd4.f, (pc4) obj));
            case 18:
                mv2 mv2Var = (mv2) obj2;
                return pw5.l(mv2Var.r(), qd4.g(mv2Var.g(), qd4.t, (pc4) obj));
            case 19:
                long j2 = ((o85) obj2).g;
                if (o85.g(j2, 8589934592L)) {
                    return 0;
                }
                if (o85.g(j2, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 20:
                wi3 wi3Var = (wi3) obj2;
                return wi3Var != null ? wi3.y(wi3Var.g, 9205357640488583168L) : false ? Boolean.FALSE : pw5.l(Float.valueOf(Float.intBitsToFloat((int) (wi3Var.g >> 32))), Float.valueOf(Float.intBitsToFloat((int) (wi3Var.g & 4294967295L))));
            case 21:
                pc4 pc4Var4 = (pc4) obj;
                bj bjVar = (bj) obj2;
                Object obj4 = bjVar.g;
                if (obj4 instanceof lp3) {
                    hjVar = hj.j;
                } else if (obj4 instanceof ju4) {
                    hjVar = hj.t;
                } else if (obj4 instanceof ak5) {
                    hjVar = hj.a;
                } else if (obj4 instanceof wh5) {
                    hjVar = hj.m;
                } else if (obj4 instanceof nv2) {
                    hjVar = hj.q;
                } else if (obj4 instanceof mv2) {
                    hjVar = hj.w;
                } else {
                    if (!(obj4 instanceof qx4)) {
                        uo1.f();
                        return null;
                    }
                    hjVar = hj.c;
                }
                switch (hjVar.ordinal()) {
                    case 0:
                        obj4.getClass();
                        objG = qd4.g((lp3) obj4, qd4.l, pc4Var4);
                        break;
                    case 1:
                        obj4.getClass();
                        objG = qd4.g((ju4) obj4, qd4.j, pc4Var4);
                        break;
                    case 2:
                        obj4.getClass();
                        objG = qd4.g((ak5) obj4, qd4.r, pc4Var4);
                        break;
                    case 3:
                        obj4.getClass();
                        objG = qd4.g((wh5) obj4, qd4.n, pc4Var4);
                        break;
                    case 4:
                        obj4.getClass();
                        objG = qd4.g((nv2) obj4, qd4.v, pc4Var4);
                        break;
                    case 5:
                        obj4.getClass();
                        objG = qd4.g((mv2) obj4, qd4.x, pc4Var4);
                        break;
                    case 6:
                        obj4.getClass();
                        objG = ((qx4) obj4).y();
                        break;
                    default:
                        uo1.g();
                        return null;
                }
                return pw5.l(hjVar, objG, Integer.valueOf(bjVar.y), Integer.valueOf(bjVar.r), bjVar.n);
            case 22:
                pc4 pc4Var5 = (pc4) obj;
                List list2 = ((tx2) obj2).j;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    arrayList2.add(qd4.g((sx2) list2.get(i6), qd4.e, pc4Var5));
                }
                return arrayList2;
            case 23:
                return ((sx2) obj2).g.toLanguageTag();
            case 24:
                pc4 pc4Var6 = (pc4) obj;
                av2 av2Var = (av2) obj2;
                return pw5.l(qd4.g(new xu2(av2Var.g), qd4.B, pc4Var6), qd4.g(new zu2(av2Var.y), qd4.C, pc4Var6), qd4.g(new yu2(av2Var.r), qd4.D, pc4Var6));
            case 25:
                return Float.valueOf(((xu2) obj2).g);
            case 26:
                return Integer.valueOf(((zu2) obj2).g);
            case 27:
                return Integer.valueOf(((yu2) obj2).g);
            case 28:
                return ((ak5) obj2).g();
            default:
                pc4 pc4Var7 = (pc4) obj;
                lp3 lp3Var = (lp3) obj2;
                Object objG2 = qd4.g(new g35(lp3Var.g), qd4.s, pc4Var7);
                Object objG3 = qd4.g(new p45(lp3Var.y), qd4.p, pc4Var7);
                Object objG4 = qd4.g(new n85(lp3Var.r), qd4.o, pc4Var7);
                o65 o65Var2 = lp3Var.n;
                o65 o65Var3 = o65.r;
                Object objG5 = qd4.g(o65Var2, qd4.q, pc4Var7);
                Object objG6 = qd4.g(lp3Var.v, ae6.g, pc4Var7);
                av2 av2Var2 = lp3Var.x;
                av2 av2Var3 = av2.n;
                return pw5.l(objG2, objG3, objG4, objG5, objG6, qd4.g(av2Var2, qd4.A, pc4Var7), qd4.g(new vu2(lp3Var.l), ae6.r, pc4Var7), qd4.g(new e92(lp3Var.j), qd4.u, pc4Var7), qd4.g(lp3Var.t, ae6.n, pc4Var7));
        }
    }
}
