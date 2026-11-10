package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vy3 implements xy1 {
    public final /* synthetic */ byte j;

    public /* synthetic */ vy3(byte b) {
        this.j = b;
    }

    /* JADX WARN: Code duplicated, block: B:144:0x033a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0157  */
    @Override // defpackage.xy1
    public final Object a(Object obj) {
        String str;
        int iOffsetByCodePoints;
        p75 p75VarG;
        ju4 ju4Var;
        byte b = this.j;
        og5 og5Var = og5.g;
        di1 di1Var = null;
        di1Var = null;
        switch (b) {
            case 0:
                Context context = (Context) obj;
                List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList = new ArrayList(listQueryIntentActivities.size());
                int size = listQueryIntentActivities.size();
                for (int i = 0; i < size; i++) {
                    ResolveInfo resolveInfo = listQueryIntentActivities.get(i);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (context.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        arrayList.add(resolveInfo);
                    } else {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                            arrayList.add(resolveInfo);
                        }
                    }
                }
                return arrayList;
            case 1:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                Boolean bool = obj2 != null ? (Boolean) obj2 : null;
                bool.getClass();
                boolean zBooleanValue = bool.booleanValue();
                Object obj3 = list.get(1);
                boolean zP = yf2.p(obj3, Boolean.FALSE);
                ji jiVar = ae6.y;
                if (!zP && obj3 != null) {
                    di1Var = (di1) ((xy1) jiVar.a).a(obj3);
                }
                di1Var.getClass();
                return new jt3(di1Var.g, zBooleanValue);
            case 2:
                obj.getClass();
                return new di1(((Integer) obj).intValue());
            case 3:
                obj.getClass();
                return new vu2(((Integer) obj).intValue());
            case 4:
                obj.getClass();
                List list2 = (List) obj;
                Object obj4 = list2.get(0);
                r75 r75Var = (yf2.p(obj4, Boolean.FALSE) || obj4 == null) ? null : (r75) ((xy1) ae6.v.a).a(obj4);
                r75Var.getClass();
                int i2 = r75Var.g;
                Object obj5 = list2.get(1);
                Boolean bool2 = obj5 != null ? (Boolean) obj5 : null;
                bool2.getClass();
                return new s75(i2, bool2.booleanValue());
            case 5:
                obj.getClass();
                return new r75(((Integer) obj).intValue());
            case 6:
                return Integer.valueOf(((ef4) obj).y);
            case 7:
                return Integer.valueOf(((ef4) obj).r.y());
            case 8:
                ci2[] ci2VarArr = lj4.g;
                ((nj4) obj).g(kj4.v, og5Var);
                return og5Var;
            case 9:
                wi3 wi3Var = (wi3) obj;
                long j = wi3Var.g;
                return (9223372034707292159L & j) != 9205357640488583168L ? new si(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (wi3Var.g & 4294967295L))) : ti4.g;
            case 10:
                si siVar = (si) obj;
                return new wi3((((long) Float.floatToRawIntBits(siVar.g)) << 32) | (((long) Float.floatToRawIntBits(siVar.y)) & 4294967295L));
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return Boolean.valueOf(obj == null);
            case 12:
                ((Context) obj).getClass();
                return Boolean.FALSE;
            case 13:
                String str2 = (String) obj;
                str2.getClass();
                return str2;
            case 14:
                CharSequence charSequence = (CharSequence) obj;
                charSequence.getClass();
                return charSequence.toString();
            case kq2.x /* 15 */:
                return og5Var;
            case 16:
                return og5Var;
            case 17:
                ((Float) obj).getClass();
                return og5Var;
            case 18:
                ((Integer) obj).intValue();
                return v45.g;
            case 19:
                n55 n55Var = (n55) obj;
                String str3 = n55Var.l.t;
                long j2 = n55Var.x;
                int i3 = u75.r;
                int i4 = (int) (j2 & 4294967295L);
                if (i4 > 0) {
                    ph1 ph1VarN = rg6.n();
                    if (ph1VarN != null) {
                        int iY = ph1VarN.y(str3, i4 - 1);
                        if (iY >= 0) {
                            iOffsetByCodePoints = iY;
                        } else if (i4 <= 0) {
                            iOffsetByCodePoints = -1;
                        } else {
                            iOffsetByCodePoints = Character.offsetByCodePoints(str3, i4, -1);
                        }
                    } else if (i4 <= 0) {
                        iOffsetByCodePoints = -1;
                    } else {
                        iOffsetByCodePoints = Character.offsetByCodePoints(str3, i4, -1);
                    }
                } else {
                    iOffsetByCodePoints = -1;
                }
                if (iOffsetByCodePoints == -1) {
                    return null;
                }
                return new e51(((int) (n55Var.x & 4294967295L)) - iOffsetByCodePoints, 0);
            case 20:
                n55 n55Var2 = (n55) obj;
                String str4 = n55Var2.l.t;
                long j3 = n55Var2.x;
                int i5 = u75.r;
                int iY2 = rg6.y(str4, (int) (j3 & 4294967295L));
                if (iY2 != -1) {
                    return new e51(0, iY2 - ((int) (n55Var2.x & 4294967295L)));
                }
                return null;
            case 21:
                n55 n55Var3 = (n55) obj;
                Integer numV = n55Var3.v();
                if (numV == null) {
                    return null;
                }
                int iIntValue = numV.intValue();
                long j4 = n55Var3.x;
                int i6 = u75.r;
                return new e51(((int) (j4 & 4294967295L)) - iIntValue, 0);
            case 22:
                n55 n55Var4 = (n55) obj;
                Integer numN = n55Var4.n();
                if (numN == null) {
                    return null;
                }
                int iIntValue2 = numN.intValue();
                long j5 = n55Var4.x;
                int i7 = u75.r;
                return new e51(0, iIntValue2 - ((int) (j5 & 4294967295L)));
            case 23:
                n55 n55Var5 = (n55) obj;
                Integer numR = n55Var5.r();
                if (numR == null) {
                    return null;
                }
                int iIntValue3 = numR.intValue();
                long j6 = n55Var5.x;
                int i8 = u75.r;
                return new e51(((int) (j6 & 4294967295L)) - iIntValue3, 0);
            case 24:
                n55 n55Var6 = (n55) obj;
                Integer numY = n55Var6.y();
                if (numY == null) {
                    return null;
                }
                int iIntValue4 = numY.intValue();
                long j7 = n55Var6.x;
                int i9 = u75.r;
                return new e51(0, iIntValue4 - ((int) (j7 & 4294967295L)));
            case 25:
                List list3 = (List) obj;
                Object obj6 = list3.get(1);
                obj6.getClass();
                um3 um3Var = ((Boolean) obj6).booleanValue() ? um3.j : um3.t;
                Object obj7 = list3.get(0);
                obj7.getClass();
                return new s55(um3Var, ((Float) obj7).floatValue());
            case 26:
                return og5Var;
            case 27:
                return og5Var;
            case 28:
                return og5Var;
            default:
                bj bjVar = (bj) obj;
                Object obj8 = bjVar.g;
                if (!(obj8 instanceof ov2) || (p75VarG = ((ov2) obj8).g()) == null || (p75VarG.g == null && p75VarG.y == null && p75VarG.r == null && p75VarG.n == null)) {
                    return pw5.l(bjVar);
                }
                Object obj9 = bjVar.g;
                obj9.getClass();
                p75 p75VarG2 = ((ov2) obj9).g();
                if (p75VarG2 == null || (ju4Var = p75VarG2.g) == null) {
                    ju4Var = new ju4(0L, 0L, (qv1) null, (lv1) null, (mv1) null, (lu1) null, (String) null, 0L, (ry) null, (n65) null, (tx2) null, 0L, (l45) null, (ym4) null, 65535);
                }
                return pw5.l(bjVar, new bj(bjVar.y, bjVar.r, ju4Var));
        }
    }
}
