package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wm0 implements xy1 {
    public final /* synthetic */ byte j;

    public /* synthetic */ wm0(byte b) {
        this.j = b;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) throws Exception {
        byte b = this.j;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                ((String) obj).getClass();
                return og5Var;
            case 1:
                ((String) obj).getClass();
                return og5Var;
            case 2:
                ((String) obj).getClass();
                return og5Var;
            case 3:
                ((String) obj).getClass();
                return og5Var;
            case 4:
                ((Boolean) obj).getClass();
                return og5Var;
            case 5:
                ((String) obj).getClass();
                return og5Var;
            case 6:
                ((String) obj).getClass();
                return og5Var;
            case 7:
                ((String) obj).getClass();
                return og5Var;
            case 8:
                ((String) obj).getClass();
                return og5Var;
            case 9:
                ((Boolean) obj).getClass();
                return og5Var;
            case 10:
                ((Boolean) obj).getClass();
                return og5Var;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                ((g61) obj).getClass();
                return og5Var;
            case 12:
                ((g61) obj).getClass();
                return og5Var;
            case 13:
                ((Long) obj).getClass();
                return og5Var;
            case 14:
                lv0 lv0Var = (lv0) obj;
                lv0Var.getClass();
                Log.d("ControlLayout", "onReset ");
                lv0Var.removeAllViews();
                lv0Var.t = null;
                return og5Var;
            case kq2.x /* 15 */:
                lv0 lv0Var2 = (lv0) obj;
                lv0Var2.getClass();
                Log.d("ControlLayout", "onRelease ");
                lv0Var2.removeAllViews();
                lv0Var2.t = null;
                return og5Var;
            case 16:
                xt1 xt1Var = (xt1) obj;
                xt1Var.getClass();
                Log.d("ControlLayout", "onFocusChanged: " + xt1Var.y());
                return og5Var;
            case 17:
                return og5Var;
            case 18:
                tb4 tb4Var = (tb4) obj;
                tb4Var.getClass();
                cc4 cc4VarO = tb4Var.O("SELECT * FROM DeviceConfig");
                try {
                    int iZ = jr2.z(cc4VarO, "macAddress");
                    int iZ2 = jr2.z(cc4VarO, "mousePointerSpeed");
                    int iZ3 = jr2.z(cc4VarO, "airMouseSpeed");
                    int iZ4 = jr2.z(cc4VarO, "scrollSpeed");
                    int iZ5 = jr2.z(cc4VarO, "mouseJiggleMode");
                    int iZ6 = jr2.z(cc4VarO, "layoutScreen");
                    int iZ7 = jr2.z(cc4VarO, "layoutScreenLayoutId");
                    int iZ8 = jr2.z(cc4VarO, "keyboardLanguageLayout");
                    int iZ9 = jr2.z(cc4VarO, "lastUsedDate");
                    int iZ10 = jr2.z(cc4VarO, "addedDate");
                    ArrayList arrayList = new ArrayList();
                    while (cc4VarO.H()) {
                        String strQ = cc4VarO.q(iZ);
                        int i = (int) cc4VarO.getLong(iZ2);
                        int i2 = (int) cc4VarO.getLong(iZ3);
                        int i3 = iZ3;
                        int i4 = (int) cc4VarO.getLong(iZ4);
                        String strQ2 = cc4VarO.q(iZ5);
                        int i5 = iZ2;
                        int i6 = (int) cc4VarO.getLong(iZ6);
                        int i7 = (int) cc4VarO.getLong(iZ7);
                        String strQ3 = cc4VarO.q(iZ8);
                        Date dateE = bi6.e(cc4VarO.isNull(iZ9) ? null : Long.valueOf(cc4VarO.getLong(iZ9)));
                        if (dateE == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                        }
                        Date dateE2 = bi6.e(cc4VarO.isNull(iZ10) ? null : Long.valueOf(cc4VarO.getLong(iZ10)));
                        if (dateE2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                        }
                        arrayList.add(new h61(strQ, i, i2, i4, strQ2, i6, i7, strQ3, dateE, dateE2));
                        iZ2 = i5;
                        iZ3 = i3;
                    }
                    cc4VarO.close();
                    return arrayList;
                } catch (Throwable th) {
                    cc4VarO.close();
                    throw th;
                }
            case 19:
                g61 g61Var = (g61) obj;
                g61Var.getClass();
                return g61Var.t;
            case 20:
                ((jh0) obj).getClass();
                return og5Var;
            case 21:
                return Boolean.TRUE;
            case 22:
                return og5Var;
            case 23:
                return og5Var;
            case 24:
                nj4 nj4Var = (nj4) obj;
                nj4Var.getClass();
                lj4.q(nj4Var);
                return og5Var;
            case 25:
                nj4 nj4Var2 = (nj4) obj;
                nj4Var2.getClass();
                lj4.w(nj4Var2, -1.0f);
                return og5Var;
            case 26:
                db3 db3Var = (db3) obj;
                rw3 rw3Var = g52.r;
                long j = 0;
                for (Map.Entry entry : db3Var.g().entrySet()) {
                    if (entry.getValue() instanceof Set) {
                        rw3 rw3Var2 = (rw3) entry.getKey();
                        Set set = (Set) entry.getValue();
                        String strY = g52.y(System.currentTimeMillis());
                        if (set.contains(strY)) {
                            Object[] objArr = {strY};
                            HashSet hashSet = new HashSet(1);
                            Object obj2 = objArr[0];
                            Objects.requireNonNull(obj2);
                            if (!hashSet.add(obj2)) {
                                l0.m(obj2, "duplicate element: ");
                                return null;
                            }
                            db3Var.v(rw3Var2, Collections.unmodifiableSet(hashSet));
                            j++;
                        } else {
                            db3Var.n(rw3Var2);
                        }
                    }
                }
                if (j == 0) {
                    db3Var.n(rw3Var);
                } else {
                    db3Var.v(rw3Var, Long.valueOf(j));
                }
                return null;
            case 27:
                ((be5) obj).getClass();
                return og5Var;
            case 28:
                ((o72) obj).getClass();
                return Boolean.TRUE;
            default:
                lj4.t((nj4) obj, 1);
                return og5Var;
        }
    }

    public /* synthetic */ wm0(Object obj, byte b) {
        this.j = b;
    }
}
