package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lt implements my1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object t;

    public /* synthetic */ lt(ox0 ox0Var, Context context, xy1 xy1Var) {
        this.j = (byte) 15;
        this.a = ox0Var;
        this.t = context;
        this.m = xy1Var;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00df  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e8  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.my1
    public final Object g() throws Exception {
        k44 k44Var;
        z14 z14Var;
        pi1 pi1Var;
        Collection collectionK;
        byte b = this.j;
        byte b2 = 3;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        og5 og5Var = og5.g;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object obj = this.m;
        Object obj2 = this.a;
        Object obj3 = this.t;
        switch (b) {
            case 0:
                rt rtVar = (rt) obj3;
                m50.T(rtVar.y, null, new b8(rtVar, new ns((ox0) obj2, (da3) obj, i == true ? (byte) 1 : (byte) 0), objArr == true ? 1 : 0, b2), 3);
                return og5Var;
            case 1:
                p60 p60Var = (p60) obj3;
                k44 k44VarQ0 = p60.Q0(p60Var, (gh3) obj2, (p2) obj);
                if (k44VarQ0 == null) {
                    return null;
                }
                qt0 qt0Var = p60Var.o;
                if (qe2.g(qt0Var.C, -1L)) {
                    pc2.r("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return k44VarQ0.t(qt0Var.U0(k44VarQ0, qt0Var.R0(), 0L) ^ (-9223372034707292160L));
            case 2:
                hb6 hb6Var = ((jc0) obj3).y;
                hb6Var.getClass();
                return hb6Var.g(((t5) obj).t.n, ((v42) obj2).g());
            case 3:
                qt0 qt0Var2 = (qt0) obj3;
                oh5 oh5Var = (oh5) obj2;
                s60 s60Var = (s60) obj;
                q64 q64Var = qt0Var2.A;
                while (true) {
                    rb3 rb3Var = (rb3) q64Var.t;
                    int i3 = rb3Var.a;
                    if (i3 != 0) {
                        if (i3 == 0) {
                            l0.s("MutableVector is empty.");
                            return null;
                        }
                        k44 k44Var2 = (k44) ((ot0) rb3Var.j[i3 - 1]).g.g();
                        if (k44Var2 == null ? true : qt0.S0(qt0Var2, k44Var2, 0L, 0L, 3)) {
                            rb3 rb3Var2 = (rb3) q64Var.t;
                            ((ot0) rb3Var2.w(rb3Var2.a - 1)).y.j(og5Var);
                        }
                    }
                }
                if (qt0Var2.B && (k44Var = (k44) qt0Var2.e.g()) != null && qt0.S0(qt0Var2, k44Var, 0L, 0L, 3)) {
                    qt0Var2.B = false;
                }
                oh5Var.v = qt0Var2.Q0(s60Var, 0L);
                return og5Var;
            case 4:
                yl0 yl0Var = (yl0) obj3;
                x03 x03Var = (x03) obj2;
                ob3 ob3Var = (ob3) obj;
                ob3Var.setValue(Boolean.valueOf(ue5.D(yl0Var, "android.permission.POST_NOTIFICATIONS") == 0));
                if (!((Boolean) ob3Var.getValue()).booleanValue() && !yl0Var.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
                    x03Var.g("android.permission.POST_NOTIFICATIONS");
                }
                return og5Var;
            case 5:
                String str = (String) obj3;
                xy1 xy1Var = (xy1) obj2;
                ob3 ob3Var2 = (ob3) obj;
                if (yf2.p(str, "Clear")) {
                    ob3Var2.setValue("");
                    xy1Var.a((String) ob3Var2.getValue());
                } else if (yf2.p(str, "Back")) {
                    if (((String) ob3Var2.getValue()).length() > 0) {
                        String str2 = (String) ob3Var2.getValue();
                        str2.getClass();
                        int length = str2.length() - 1;
                        ob3Var2.setValue(tx4.n0(str2, length >= 0 ? length : 0));
                        xy1Var.a((String) ob3Var2.getValue());
                    }
                } else if (((String) ob3Var2.getValue()).length() < 12) {
                    ob3Var2.setValue(((String) ob3Var2.getValue()) + str);
                    xy1Var.a((String) ob3Var2.getValue());
                }
                return og5Var;
            case 6:
                h02 h02Var = (h02) obj3;
                vc0 vc0Var = (vc0) obj2;
                lr4 lr4Var = (lr4) obj;
                po0 po0Var = h02Var.M;
                vc0 vc0Var2 = po0Var.y;
                try {
                    po0Var.y = vc0Var;
                    lr4 lr4Var2 = h02Var.G;
                    int[] iArr = h02Var.i;
                    ha3 ha3Var = h02Var.o;
                    h02Var.i = null;
                    h02Var.o = null;
                    try {
                        h02Var.G = lr4Var;
                        boolean z2 = po0Var.v;
                        try {
                            po0Var.v = false;
                            h02Var.B(null, null);
                            po0Var.v = z2;
                            h02Var.G = lr4Var2;
                            h02Var.i = iArr;
                            h02Var.o = ha3Var;
                            po0Var.y = vc0Var2;
                            return og5Var;
                        } catch (Throwable th) {
                            po0Var.v = z2;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        h02Var.G = lr4Var2;
                        h02Var.i = iArr;
                        h02Var.o = ha3Var;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    po0Var.y = vc0Var2;
                    throw th3;
                }
            case 7:
                rf4 rf4Var = (rf4) obj3;
                bw4 bw4Var = (bw4) obj;
                if (!((Boolean) ((ob3) obj2).getValue()).booleanValue() && !rf4Var.j.y() && ((Number) bw4Var.getValue()).floatValue() <= 0.0f) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                bz1 bz1Var = (bz1) obj2;
                BluetoothAdapter bluetoothAdapter = (BluetoothAdapter) obj;
                BluetoothProfile bluetoothProfile = (BluetoothProfile) ((AtomicReference) obj3).getAndSet(null);
                if (bluetoothProfile != null) {
                    try {
                        bluetoothAdapter.closeProfileProxy(19, bluetoothProfile);
                        break;
                    } catch (Throwable unused) {
                    }
                }
                bz1Var.l("profile", "close");
                return og5Var;
            case 9:
                xy1 xy1Var2 = (xy1) obj3;
                my1 my1Var = (my1) obj2;
                String str3 = (String) ((ob3) obj).getValue();
                xy1Var2.a(tx4.Y(str3) ? null : str3);
                my1Var.g();
                return og5Var;
            case 10:
                bz1 bz1Var2 = (bz1) obj3;
                Object obj4 = (i72) obj;
                zy2 zy2Var = (zy2) ((u54) obj2).j;
                hb3 hb3Var = zy2Var.z;
                if (hb3Var == null) {
                    long[] jArr = ee4.g;
                    hb3Var = new hb3();
                    zy2Var.z = hb3Var;
                }
                Object objL = hb3Var.l(obj4);
                if (objL == null) {
                    objL = new xy2(zy2Var);
                    hb3Var.c(obj4, objL);
                }
                xy2 xy2Var = (xy2) objL;
                xy2Var.j = false;
                bz1Var2.l(xy2Var, obj4);
                return og5Var;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                ox0 ox0Var = (ox0) obj2;
                xo4 xo4Var = (xo4) obj;
                if (((Boolean) ((xy1) ((xo4) obj3).n.n).a(yo4.t)).booleanValue()) {
                    m50.T(ox0Var, null, new v63(xo4Var, objArr2 == true ? 1 : 0, (byte) 6), 3);
                }
                return Boolean.TRUE;
            case 12:
                c02 c02Var = (c02) obj3;
                pr4 pr4Var = (pr4) obj2;
                cm3 cm3Var = (cm3) obj;
                if (c02Var != null) {
                    pr4Var.g(pr4Var.r(c02Var) - pr4Var.z);
                }
                List listN = xc6.n(pr4Var, null, pr4Var.z, null);
                io0 io0Var = (io0) cj0.s0(listN);
                Integer num = io0Var != null ? io0Var.y : null;
                List listN2 = cm3Var.n(num);
                if (num != null && !listN2.isEmpty()) {
                    listN2 = cj0.w0(pw5.k(new io0(((io0) cj0.j0(listN2)).g, null, num)), cj0.g0(listN2));
                }
                return new go0(cj0.w0(listN, listN2), cm3Var.l());
            case 13:
                z14 z14Var2 = (z14) obj3;
                ob3 ob3Var3 = (ob3) obj;
                jz3 jz3Var = (jz3) ((ob3) obj2).getValue();
                lz3 lz3VarY = jz3Var != null ? de6.y(jz3Var) : null;
                jz3 jz3Var2 = (jz3) ob3Var3.getValue();
                lz3 lz3VarY2 = jz3Var2 != null ? de6.y(jz3Var2) : null;
                long j = lz3VarY != null ? lz3VarY.v : 0L;
                long j2 = lz3VarY2 != null ? lz3VarY2.v : 0L;
                int iOrdinal = z14Var2.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    z14Var = z14.j;
                    pi1Var = pi1.j;
                    if (z14Var2 == z14Var) {
                        if (lz3VarY != null) {
                            collectionK = pw5.k(lz3VarY);
                        } else {
                            collectionK = pi1Var;
                        }
                    } else if (lz3VarY2 != null) {
                        collectionK = pw5.k(lz3VarY2);
                    } else {
                        collectionK = pi1Var;
                    }
                } else {
                    if (iOrdinal != 2) {
                        up.y();
                        return null;
                    }
                    if (j > j2 * 1.5d) {
                        collectionK = pr.W(new lz3[]{lz3VarY2, lz3VarY});
                    } else {
                        z14Var = z14.j;
                        pi1Var = pi1.j;
                        if (z14Var2 == z14Var) {
                            if (lz3VarY != null) {
                                collectionK = pw5.k(lz3VarY);
                            } else {
                                collectionK = pi1Var;
                            }
                        } else if (lz3VarY2 != null) {
                            collectionK = pw5.k(lz3VarY2);
                        } else {
                            collectionK = pi1Var;
                        }
                    }
                }
                return (lz3[]) collectionK.toArray(new lz3[0]);
            case 14:
                xl2 xl2Var = (xl2) obj3;
                jd3 jd3Var = (jd3) obj2;
                ob3 ob3Var4 = (ob3) obj;
                q04 q04Var = ((vl2) xl2Var.v.getValue()).g;
                if (q04Var != null ? !Arrays.equals(np3.t(q04Var), xl2Var.l) : false) {
                    ob3Var4.setValue(Boolean.TRUE);
                } else {
                    jd3Var.x();
                }
                return og5Var;
            case kq2.x /* 15 */:
                m50.T((ox0) obj2, null, new mt(obj3, obj, (mu0) (objArr3 == true ? 1 : 0), (byte) 17), 3);
                return og5Var;
            default:
                xy1 xy1Var3 = (xy1) obj3;
                st4 st4Var = (st4) obj;
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : (List) obj2) {
                    int i4 = i2 + 1;
                    if (i2 < 0) {
                        pw5.R();
                        throw null;
                    }
                    if (((Boolean) st4Var.get(i2)).booleanValue()) {
                        arrayList.add(obj5);
                    }
                    i2 = i4;
                }
                xy1Var3.a(arrayList);
                return og5Var;
        }
    }

    public /* synthetic */ lt(h02 h02Var, vc0 vc0Var, lr4 lr4Var, w83 w83Var) {
        this.j = (byte) 6;
        this.t = h02Var;
        this.a = vc0Var;
        this.m = lr4Var;
    }

    public /* synthetic */ lt(Object obj, Object obj2, Object obj3, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
        this.m = obj3;
    }

    public /* synthetic */ lt(AtomicReference atomicReference, bz1 bz1Var, ez3 ez3Var, BluetoothAdapter bluetoothAdapter) {
        this.j = (byte) 8;
        this.t = atomicReference;
        this.a = bz1Var;
        this.m = bluetoothAdapter;
    }
}
