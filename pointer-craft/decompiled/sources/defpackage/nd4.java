package defpackage;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nd4 implements xy1 {
    public final /* synthetic */ byte j;

    public /* synthetic */ nd4(byte b) {
        this.j = b;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        bj bjVar;
        byte b = this.j;
        og5 og5Var = og5.g;
        int i = 0;
        switch (b) {
            case 0:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                String str = obj2 != null ? (String) obj2 : null;
                str.getClass();
                Object obj3 = list.get(1);
                return new nv2(str, (yf2.p(obj3, Boolean.FALSE) || obj3 == null) ? null : (p75) ((xy1) qd4.t.a).a(obj3), i);
            case 1:
                obj.getClass();
                return new p45(((Integer) obj).intValue());
            case 2:
                obj.getClass();
                return new e92(((Integer) obj).intValue());
            case 3:
                obj.getClass();
                List list2 = (List) obj;
                ArrayList arrayList = new ArrayList(list2.size());
                int size = list2.size();
                while (i < size) {
                    Object obj4 = list2.get(i);
                    bj bjVar2 = (yf2.p(obj4, Boolean.FALSE) || obj4 == null) ? null : (bj) ((xy1) qd4.y.a).a(obj4);
                    bjVar2.getClass();
                    arrayList.add(bjVar2);
                    i++;
                }
                return arrayList;
            case 4:
                obj.getClass();
                return new lv1(((Integer) obj).intValue());
            case 5:
                obj.getClass();
                return new mv1(((Integer) obj).intValue());
            case 6:
                Boolean bool = Boolean.FALSE;
                if (yf2.p(obj, bool)) {
                    return new n85(n85.r);
                }
                obj.getClass();
                List list3 = (List) obj;
                Object obj5 = list3.get(0);
                Float f = obj5 != null ? (Float) obj5 : null;
                f.getClass();
                float fFloatValue = f.floatValue();
                Object obj6 = list3.get(1);
                pd4 pd4Var = qd4.f;
                yf2.p(obj6, bool);
                o85 o85Var = obj6 != null ? (o85) pd4Var.t.a(obj6) : null;
                o85Var.getClass();
                return new n85(kq2.O(fFloatValue, o85Var.g));
            case 7:
                if (yf2.p(obj, 0)) {
                    return new o85(8589934592L);
                }
                return yf2.p(obj, 1) ? new o85(4294967296L) : new o85(0L);
            case 8:
                if (yf2.p(obj, Boolean.FALSE)) {
                    return new wi3(9205357640488583168L);
                }
                obj.getClass();
                List list4 = (List) obj;
                Object obj7 = list4.get(0);
                Float f2 = obj7 != null ? (Float) obj7 : null;
                f2.getClass();
                float fFloatValue2 = f2.floatValue();
                Object obj8 = list4.get(1);
                Float f3 = obj8 != null ? (Float) obj8 : null;
                f3.getClass();
                return new wi3((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f3.floatValue())) & 4294967295L));
            case 9:
                obj.getClass();
                List list5 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list5.size());
                int size2 = list5.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Object obj9 = list5.get(i2);
                    sx2 sx2Var = (yf2.p(obj9, Boolean.FALSE) || obj9 == null) ? null : (sx2) ((xy1) qd4.e.a).a(obj9);
                    sx2Var.getClass();
                    arrayList2.add(sx2Var);
                }
                return new tx2(arrayList2);
            case 10:
                obj.getClass();
                return new sx2(mz5.y((String) obj));
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                obj.getClass();
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                String str2 = obj10 != null ? (String) obj10 : null;
                str2.getClass();
                Object obj11 = list6.get(1);
                return new mv2(str2, (yf2.p(obj11, Boolean.FALSE) || obj11 == null) ? null : (p75) ((xy1) qd4.t.a).a(obj11));
            case 12:
                obj.getClass();
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                float f4 = xu2.y;
                pd4 pd4Var2 = qd4.B;
                Boolean bool2 = Boolean.FALSE;
                yf2.p(obj12, bool2);
                xu2 xu2Var = obj12 != null ? (xu2) pd4Var2.t.a(obj12) : null;
                xu2Var.getClass();
                float f5 = xu2Var.g;
                Object obj13 = list7.get(1);
                pd4 pd4Var3 = qd4.C;
                yf2.p(obj13, bool2);
                zu2 zu2Var = obj13 != null ? (zu2) pd4Var3.t.a(obj13) : null;
                zu2Var.getClass();
                int i3 = zu2Var.g;
                Object obj14 = list7.get(2);
                pd4 pd4Var4 = qd4.D;
                yf2.p(obj14, bool2);
                yu2 yu2Var = obj14 != null ? (yu2) pd4Var4.t.a(obj14) : null;
                yu2Var.getClass();
                return new av2(f5, i3, yu2Var.g);
            case 13:
                obj.getClass();
                float fFloatValue3 = ((Float) obj).floatValue();
                xu2.g(fFloatValue3);
                return new xu2(fFloatValue3);
            case 14:
                obj.getClass();
                return new zu2(((Integer) obj).intValue());
            case kq2.x /* 15 */:
                obj.getClass();
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                hj hjVar = obj15 != null ? (hj) obj15 : null;
                hjVar.getClass();
                Object obj16 = list8.get(2);
                Integer num = obj16 != null ? (Integer) obj16 : null;
                num.getClass();
                int iIntValue = num.intValue();
                Object obj17 = list8.get(3);
                Integer num2 = obj17 != null ? (Integer) obj17 : null;
                num2.getClass();
                int iIntValue2 = num2.intValue();
                Object obj18 = list8.get(4);
                String str3 = obj18 != null ? (String) obj18 : null;
                str3.getClass();
                switch (hjVar.ordinal()) {
                    case 0:
                        Object obj19 = list8.get(1);
                        lp3 lp3Var = (yf2.p(obj19, Boolean.FALSE) || obj19 == null) ? null : (lp3) ((xy1) qd4.l.a).a(obj19);
                        lp3Var.getClass();
                        bjVar = new bj(iIntValue, iIntValue2, lp3Var, str3);
                        break;
                    case 1:
                        Object obj20 = list8.get(1);
                        ju4 ju4Var = (yf2.p(obj20, Boolean.FALSE) || obj20 == null) ? null : (ju4) ((xy1) qd4.j.a).a(obj20);
                        ju4Var.getClass();
                        bjVar = new bj(iIntValue, iIntValue2, ju4Var, str3);
                        break;
                    case 2:
                        Object obj21 = list8.get(1);
                        ak5 ak5Var = (yf2.p(obj21, Boolean.FALSE) || obj21 == null) ? null : (ak5) ((xy1) qd4.r.a).a(obj21);
                        ak5Var.getClass();
                        bjVar = new bj(iIntValue, iIntValue2, ak5Var, str3);
                        break;
                    case 3:
                        Object obj22 = list8.get(1);
                        wh5 wh5Var = (yf2.p(obj22, Boolean.FALSE) || obj22 == null) ? null : (wh5) ((xy1) qd4.n.a).a(obj22);
                        wh5Var.getClass();
                        bjVar = new bj(iIntValue, iIntValue2, wh5Var, str3);
                        break;
                    case 4:
                        Object obj23 = list8.get(1);
                        nv2 nv2Var = (yf2.p(obj23, Boolean.FALSE) || obj23 == null) ? null : (nv2) ((xy1) qd4.v.a).a(obj23);
                        nv2Var.getClass();
                        bjVar = new bj(iIntValue, iIntValue2, nv2Var, str3);
                        break;
                    case 5:
                        Object obj24 = list8.get(1);
                        mv2 mv2Var = (yf2.p(obj24, Boolean.FALSE) || obj24 == null) ? null : (mv2) ((xy1) qd4.x.a).a(obj24);
                        mv2Var.getClass();
                        bjVar = new bj(iIntValue, iIntValue2, mv2Var, str3);
                        break;
                    case 6:
                        Object obj25 = list8.get(1);
                        String str4 = obj25 != null ? (String) obj25 : null;
                        str4.getClass();
                        bjVar = new bj(iIntValue, iIntValue2, qx4.g(str4), str3);
                        break;
                    default:
                        uo1.g();
                        return null;
                }
                return bjVar;
            case 16:
                obj.getClass();
                return new yu2(((Integer) obj).intValue());
            case 17:
                String str5 = obj != null ? (String) obj : null;
                str5.getClass();
                return new ak5(str5);
            case 18:
                String str6 = obj != null ? (String) obj : null;
                str6.getClass();
                return new wh5(str6);
            case 19:
                obj.getClass();
                List list9 = (List) obj;
                Object obj26 = list9.get(0);
                pd4 pd4Var5 = qd4.s;
                Boolean bool3 = Boolean.FALSE;
                yf2.p(obj26, bool3);
                g35 g35Var = obj26 != null ? (g35) pd4Var5.t.a(obj26) : null;
                g35Var.getClass();
                int i4 = g35Var.g;
                Object obj27 = list9.get(1);
                pd4 pd4Var6 = qd4.p;
                yf2.p(obj27, bool3);
                p45 p45Var = obj27 != null ? (p45) pd4Var6.t.a(obj27) : null;
                p45Var.getClass();
                int i5 = p45Var.g;
                Object obj28 = list9.get(2);
                o85[] o85VarArr = n85.y;
                pd4 pd4Var7 = qd4.o;
                yf2.p(obj28, bool3);
                n85 n85Var = obj28 != null ? (n85) pd4Var7.t.a(obj28) : null;
                n85Var.getClass();
                long j = n85Var.g;
                Object obj29 = list9.get(3);
                o65 o65Var = o65.r;
                o65 o65Var2 = (yf2.p(obj29, bool3) || obj29 == null) ? null : (o65) ((xy1) qd4.q.a).a(obj29);
                Object obj30 = list9.get(4);
                jt3 jt3Var = (yf2.p(obj30, bool3) || obj30 == null) ? null : (jt3) ((xy1) ae6.g.a).a(obj30);
                Object obj31 = list9.get(5);
                av2 av2Var = av2.n;
                av2 av2Var2 = (yf2.p(obj31, bool3) || obj31 == null) ? null : (av2) ((xy1) qd4.A.a).a(obj31);
                Object obj32 = list9.get(6);
                vu2 vu2Var = (yf2.p(obj32, bool3) || obj32 == null) ? null : (vu2) ((xy1) ae6.r.a).a(obj32);
                vu2Var.getClass();
                int i6 = vu2Var.g;
                Object obj33 = list9.get(7);
                pd4 pd4Var8 = qd4.u;
                yf2.p(obj33, bool3);
                e92 e92Var = obj33 != null ? (e92) pd4Var8.t.a(obj33) : null;
                e92Var.getClass();
                int i7 = e92Var.g;
                Object obj34 = list9.get(8);
                return new lp3(i4, i5, j, o65Var2, jt3Var, av2Var2, i6, i7, (yf2.p(obj34, bool3) || obj34 == null) ? null : (s75) ((xy1) ae6.n.a).a(obj34));
            case 20:
                obj.getClass();
                List list10 = (List) obj;
                Object obj35 = list10.get(0);
                int i8 = jj0.t;
                Boolean bool4 = Boolean.FALSE;
                yf2.p(obj35, bool4);
                jj0 jj0Var = obj35 != null ? yf2.p(obj35, Boolean.FALSE) ? new jj0(jj0.j) : new jj0(ra.n(((Integer) obj35).intValue())) : null;
                jj0Var.getClass();
                long j2 = jj0Var.g;
                Object obj36 = list10.get(1);
                o85[] o85VarArr2 = n85.y;
                xy1 xy1Var = qd4.o.t;
                yf2.p(obj36, bool4);
                n85 n85Var2 = obj36 != null ? (n85) xy1Var.a(obj36) : null;
                n85Var2.getClass();
                long j3 = n85Var2.g;
                Object obj37 = list10.get(2);
                qv1 qv1Var = qv1.t;
                qv1 qv1Var2 = (yf2.p(obj37, bool4) || obj37 == null) ? null : (qv1) ((xy1) qd4.w.a).a(obj37);
                Object obj38 = list10.get(3);
                lv1 lv1Var = (yf2.p(obj38, bool4) || obj38 == null) ? null : (lv1) ((xy1) qd4.z.a).a(obj38);
                Object obj39 = list10.get(4);
                mv1 mv1Var = (yf2.p(obj39, bool4) || obj39 == null) ? null : (mv1) ((xy1) qd4.h.a).a(obj39);
                Object obj40 = list10.get(6);
                String str7 = obj40 != null ? (String) obj40 : null;
                Object obj41 = list10.get(7);
                yf2.p(obj41, bool4);
                n85 n85Var3 = obj41 != null ? (n85) xy1Var.a(obj41) : null;
                n85Var3.getClass();
                long j4 = n85Var3.g;
                Object obj42 = list10.get(8);
                ry ryVar = (yf2.p(obj42, bool4) || obj42 == null) ? null : (ry) ((xy1) qd4.c.a).a(obj42);
                Object obj43 = list10.get(9);
                n65 n65Var = (yf2.p(obj43, bool4) || obj43 == null) ? null : (n65) ((xy1) qd4.m.a).a(obj43);
                Object obj44 = list10.get(10);
                tx2 tx2Var = tx2.a;
                tx2 tx2Var2 = (yf2.p(obj44, bool4) || obj44 == null) ? null : (tx2) ((xy1) qd4.d.a).a(obj44);
                Object obj45 = list10.get(11);
                yf2.p(obj45, bool4);
                jj0 jj0Var2 = obj45 != null ? yf2.p(obj45, Boolean.FALSE) ? new jj0(jj0.j) : new jj0(ra.n(((Integer) obj45).intValue())) : null;
                jj0Var2.getClass();
                long j5 = jj0Var2.g;
                Object obj46 = list10.get(12);
                l45 l45Var = (yf2.p(obj46, bool4) || obj46 == null) ? null : (l45) ((xy1) qd4.a.a).a(obj46);
                Object obj47 = list10.get(13);
                ym4 ym4Var = ym4.n;
                return new ju4(j2, j3, qv1Var2, lv1Var, mv1Var, (lu1) null, str7, j4, ryVar, n65Var, tx2Var2, j5, l45Var, (yf2.p(obj47, bool4) || obj47 == null) ? null : (ym4) ((xy1) qd4.i.a).a(obj47), 49184);
            case 21:
                return new rf4(((Integer) obj).intValue());
            case 22:
                return og5Var;
            case 23:
                return og5Var;
            case 24:
                ci2[] ci2VarArr = lj4.g;
                mj4 mj4Var = kj4.w;
                ci2 ci2Var = lj4.g[5];
                Boolean bool5 = Boolean.TRUE;
                mj4Var.getClass();
                ((nj4) obj).g(mj4Var, bool5);
                return og5Var;
            case 25:
                Resources resources = (Resources) obj;
                resources.getClass();
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 26:
                return og5Var;
            case 27:
                return og5Var;
            case 28:
                return og5Var;
            default:
                cc4 cc4Var = (cc4) obj;
                cc4Var.getClass();
                return Boolean.valueOf(cc4Var.H());
        }
    }
}
