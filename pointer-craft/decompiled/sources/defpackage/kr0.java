package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class kr0 implements gr1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ kr0(Object obj, Object obj2, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:178:0x0319  */
    /* JADX WARN: Code duplicated, block: B:198:0x0367  */
    /* JADX WARN: Code duplicated, block: B:223:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:9:0x002f  */
    @Override // defpackage.gr1
    public final Object c(Object obj, mu0 mu0Var) {
        vv0 vv0Var;
        zr1 zr1Var;
        js1 js1Var;
        t13 t13Var;
        nx3 nx3Var;
        lx3 lx3Var;
        Object nx3Var2;
        tn5 tn5Var;
        Object g84Var;
        BluetoothDevice remoteDevice;
        Object obj2 = obj;
        byte b = this.j;
        int i = 0;
        px0 px0Var = px0.j;
        int i2 = 1;
        og5 og5Var = og5.g;
        Object obj3 = this.t;
        Object obj4 = this.a;
        switch (b) {
            case 0:
                return y((s30) obj2, mu0Var);
            case 1:
                if (mu0Var instanceof vv0) {
                    vv0Var = (vv0) mu0Var;
                    int i3 = vv0Var.q;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        vv0Var.q = i3 - Integer.MIN_VALUE;
                    } else {
                        vv0Var = new vv0(this, mu0Var);
                    }
                } else {
                    vv0Var = new vv0(this, mu0Var);
                }
                Object obj5 = vv0Var.m;
                int i4 = vv0Var.q;
                if (i4 != 0) {
                    if (i4 == 1) {
                        js2.o(obj5);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj5);
                gr1 gr1Var = (gr1) obj3;
                sk2 sk2Var = (sk2) obj2;
                if (sk2Var == null) {
                    uo1.b();
                    return null;
                }
                ((yv0) obj4).r.getClass();
                q04 q04VarV = tg1.v(sk2Var);
                p04 p04VarZ = q04VarV.z();
                p04VarZ.getClass();
                p04 p04VarJ = rp2.j(p04VarZ);
                q04VarV.t = (byte) 6;
                q04VarV.a = p04VarJ;
                vv0Var.q = 1;
                if (gr1Var.c(q04VarV, vv0Var) == px0Var) {
                    return px0Var;
                }
                return og5Var;
            case 2:
                ky0 ky0Var = (ky0) obj3;
                q04 q04Var = ky0Var.E0;
                if (q04Var != null) {
                    ky0Var.f0((ViewGroup) obj4, q04Var);
                }
                return og5Var;
            case 3:
                ((ce4) obj3).g.e(lr2.e(0.0f, ((r54) obj4).j, jw3.g.g(((sv) obj2).r)));
                return og5Var;
            case 4:
                if (mu0Var instanceof zr1) {
                    zr1Var = (zr1) mu0Var;
                    int i5 = zr1Var.w;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        zr1Var.w = i5 - Integer.MIN_VALUE;
                    } else {
                        zr1Var = new zr1(this, mu0Var);
                    }
                } else {
                    zr1Var = new zr1(this, mu0Var);
                }
                Object obj6 = zr1Var.m;
                int i6 = zr1Var.w;
                if (i6 == 0) {
                    js2.o(obj6);
                    s54 s54Var = (s54) obj3;
                    int i7 = s54Var.j;
                    if (i7 >= 1) {
                        zr1Var.w = 1;
                        if (((gr1) obj4).c(obj2, zr1Var) == px0Var) {
                            return px0Var;
                        }
                    } else {
                        s54Var.j = i7 + 1;
                    }
                } else {
                    if (i6 != 1) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj6);
                }
                return og5Var;
            case 5:
                if (mu0Var instanceof js1) {
                    js1Var = (js1) mu0Var;
                    int i8 = js1Var.q;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        js1Var.q = i8 - Integer.MIN_VALUE;
                    } else {
                        js1Var = new js1(this, mu0Var);
                    }
                } else {
                    js1Var = new js1(this, mu0Var);
                }
                Object objL = js1Var.m;
                int i9 = js1Var.q;
                if (i9 == 0) {
                    js2.o(objL);
                    js1Var.c = obj2;
                    js1Var.q = 1;
                    objL = ((bz1) obj3).l(obj2, js1Var);
                    if (objL == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (i9 != 1) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = js1Var.c;
                    js2.o(objL);
                }
                if (!((Boolean) objL).booleanValue()) {
                    return og5Var;
                }
                ((u54) obj4).j = obj2;
                throw new r(this);
            case 6:
                ue2 ue2Var = (ue2) obj2;
                ArrayList arrayList = (ArrayList) obj3;
                if (ue2Var instanceof gt1) {
                    arrayList.add(ue2Var);
                } else if (ue2Var instanceof ht1) {
                    arrayList.remove(((ht1) ue2Var).g);
                }
                ((ob3) obj4).setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return og5Var;
            case 7:
                ue2 ue2Var2 = (ue2) obj2;
                ArrayList arrayList2 = (ArrayList) obj3;
                if (ue2Var2 instanceof gt1) {
                    arrayList2.add(ue2Var2);
                } else if (ue2Var2 instanceof ht1) {
                    arrayList2.remove(((ht1) ue2Var2).g);
                }
                boolean z = !arrayList2.isEmpty();
                kb2 kb2Var = (kb2) obj4;
                if (z != kb2Var.C) {
                    kb2Var.C = z;
                    kb2Var.T0();
                }
                return og5Var;
            case 8:
                ue2 ue2Var3 = (ue2) obj2;
                pv2 pv2Var = (pv2) obj4;
                xa3 xa3Var = (xa3) obj3;
                if ((ue2Var3 instanceof p72) || (ue2Var3 instanceof gt1) || (ue2Var3 instanceof mx3)) {
                    xa3Var.g(ue2Var3);
                } else if (ue2Var3 instanceof q72) {
                    xa3Var.m(((q72) ue2Var3).g);
                } else if (ue2Var3 instanceof ht1) {
                    xa3Var.m(((ht1) ue2Var3).g);
                } else if (ue2Var3 instanceof nx3) {
                    xa3Var.m(((nx3) ue2Var3).g);
                } else if (ue2Var3 instanceof lx3) {
                    xa3Var.m(((lx3) ue2Var3).g);
                }
                Object[] objArr = xa3Var.g;
                int i10 = xa3Var.y;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    ue2 ue2Var4 = (ue2) objArr[i12];
                    if (ue2Var4 instanceof p72) {
                        pv2Var.getClass();
                        i11 |= 2;
                    } else if (ue2Var4 instanceof gt1) {
                        pv2Var.getClass();
                        i11 |= 1;
                    } else if (ue2Var4 instanceof mx3) {
                        pv2Var.getClass();
                        i11 |= 4;
                    }
                }
                pv2Var.y.e(i11);
                return og5Var;
            case 9:
                u13 u13Var = (u13) obj4;
                LinkedHashMap linkedHashMap = u13Var.y;
                if (mu0Var instanceof t13) {
                    t13Var = (t13) mu0Var;
                    int i13 = t13Var.q;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        t13Var.q = i13 - Integer.MIN_VALUE;
                    } else {
                        t13Var = new t13(this, mu0Var);
                    }
                } else {
                    t13Var = new t13(this, mu0Var);
                }
                Object obj7 = t13Var.m;
                int i14 = t13Var.q;
                if (i14 == 0) {
                    js2.o(obj7);
                    gr1 gr1Var2 = (gr1) obj3;
                    ue2 ue2Var5 = (ue2) obj2;
                    if (ue2Var5 instanceof mx3) {
                        mx3 mx3Var = new mx3(wi3.n(((mx3) ue2Var5).g, u13Var.g));
                        linkedHashMap.put(ue2Var5, mx3Var);
                        nx3Var2 = mx3Var;
                    } else if (ue2Var5 instanceof lx3) {
                        lx3Var = (lx3) ue2Var5;
                        mx3 mx3Var2 = (mx3) linkedHashMap.remove(lx3Var.g);
                        if (mx3Var2 != null) {
                            nx3Var2 = lx3Var;
                            nx3Var2 = new lx3(mx3Var2);
                        }
                    } else if (ue2Var5 instanceof nx3) {
                        nx3Var = (nx3) ue2Var5;
                        mx3 mx3Var3 = (mx3) linkedHashMap.remove(nx3Var.g);
                        if (mx3Var3 != null) {
                            nx3Var2 = ue2Var5;
                            nx3Var2 = nx3Var;
                            nx3Var2 = new nx3(mx3Var3);
                        }
                    }
                    nx3Var2 = ue2Var5;
                    nx3Var2 = nx3Var;
                    nx3Var2 = ue2Var5;
                    nx3Var2 = lx3Var;
                    t13Var.q = 1;
                    if (gr1Var2.c(nx3Var2, t13Var) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (i14 != 1) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj7);
                }
                return og5Var;
            case 10:
                wi3 wi3Var = (wi3) obj2;
                long j = wi3Var.g;
                qg qgVar = (qg) obj3;
                if ((((wi3) qgVar.n()).g & 9223372034707292159L) == 9205357640488583168L || (j & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (((wi3) qgVar.n()).g & 4294967295L)) == Float.intBitsToFloat((int) (j & 4294967295L))) {
                    Object objV = qgVar.v(mu0Var, wi3Var);
                    return objV == px0Var ? objV : og5Var;
                }
                m50.T((ox0) obj4, null, new cg(qgVar, j, null, (byte) 2), 3);
                return og5Var;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return g(((Number) obj2).intValue(), mu0Var);
            case 12:
                ue2 ue2Var6 = (ue2) obj2;
                s54 s54Var2 = (s54) obj3;
                if (ue2Var6 instanceof mx3) {
                    s54Var2.j++;
                } else if ((ue2Var6 instanceof nx3) || (ue2Var6 instanceof lx3)) {
                    s54Var2.j--;
                }
                boolean z2 = s54Var2.j > 0;
                i95 i95Var = (i95) obj4;
                if (i95Var.d != z2) {
                    i95Var.d = z2;
                    c93.B(i95Var);
                }
                return og5Var;
            default:
                un5 un5Var = (un5) obj4;
                Context context = un5Var.r;
                if (mu0Var instanceof tn5) {
                    tn5Var = (tn5) mu0Var;
                    int i15 = tn5Var.q;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        tn5Var.q = i15 - Integer.MIN_VALUE;
                    } else {
                        tn5Var = new tn5(this, mu0Var);
                    }
                } else {
                    tn5Var = new tn5(this, mu0Var);
                }
                Object obj8 = tn5Var.m;
                int i16 = tn5Var.q;
                if (i16 == 0) {
                    js2.o(obj8);
                    gr1 gr1Var3 = (gr1) obj3;
                    List list = (List) obj2;
                    Set<String> setKeySet = context.getSharedPreferences("paired_devices", 0).getAll().keySet();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj9 : list) {
                        if (setKeySet.contains(((h61) obj9).g)) {
                            arrayList3.add(obj9);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(dj0.Y(arrayList3, 10));
                    int size = arrayList3.size();
                    int i17 = 0;
                    while (i17 < size) {
                        int i18 = i17 + 1;
                        String str = ((h61) arrayList3.get(i17)).g;
                        SharedPreferences sharedPreferences = context.getSharedPreferences("device_names", i);
                        String string = sharedPreferences.getString(str, null);
                        if (string == null || tx4.Y(string)) {
                            if (ue5.D(context, "android.permission.BLUETOOTH_CONNECT") == 0) {
                                try {
                                    BluetoothAdapter bluetoothAdapter = un5Var.v;
                                    g84Var = (bluetoothAdapter != null && (remoteDevice = bluetoothAdapter.getRemoteDevice(str)) != null) ? remoteDevice.getName() : null;
                                } catch (Throwable th) {
                                    g84Var = new g84(th);
                                }
                                if (g84Var instanceof g84) {
                                    g84Var = null;
                                }
                                string = (String) g84Var;
                                if (string == null) {
                                    string = du4.i("Unnamed device (", tx4.o0(str, 5), ")");
                                } else {
                                    if (tx4.Y(string)) {
                                        string = null;
                                    }
                                    if (string != null) {
                                        sharedPreferences.edit().putString(str, string).apply();
                                    } else {
                                        string = du4.i("Unnamed device (", tx4.o0(str, 5), ")");
                                    }
                                }
                            } else {
                                string = du4.i("Unnamed device (", tx4.o0(str, 5), ")");
                            }
                            break;
                        }
                        arrayList4.add(new qp0(str, string));
                        i17 = i18;
                        i = 0;
                        i2 = 1;
                    }
                    tn5Var.q = i2;
                    if (gr1Var3.c(arrayList4, tn5Var) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (i16 != 1) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj8);
                }
                return og5Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(int i, mu0 mu0Var) {
        qv4 qv4Var;
        if (mu0Var instanceof qv4) {
            qv4Var = (qv4) mu0Var;
            int i2 = qv4Var.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qv4Var.w = i2 - Integer.MIN_VALUE;
            } else {
                qv4Var = new qv4(this, mu0Var);
            }
        } else {
            qv4Var = new qv4(this, mu0Var);
        }
        Object obj = qv4Var.m;
        int i3 = qv4Var.w;
        og5 og5Var = og5.g;
        if (i3 != 0) {
            if (i3 == 1) {
                js2.o(obj);
                return og5Var;
            }
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        js2.o(obj);
        if (i > 0) {
            q54 q54Var = (q54) this.t;
            if (!q54Var.j) {
                q54Var.j = true;
                gr1 gr1Var = (gr1) this.a;
                qv4Var.w = 1;
                Object objC = gr1Var.c(qo4.j, qv4Var);
                px0 px0Var = px0.j;
                if (objC == px0Var) {
                    return px0Var;
                }
            }
        }
        return og5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (r6 != 4) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object y(defpackage.s30 r7, defpackage.mu0 r8) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.a
            qr0 r0 = (defpackage.qr0) r0
            java.lang.Object r1 = r6.t
            q54 r1 = (defpackage.q54) r1
            boolean r2 = r8 instanceof defpackage.jr0
            if (r2 == 0) goto L1b
            r2 = r8
            jr0 r2 = (defpackage.jr0) r2
            int r3 = r2.w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.w = r3
            goto L20
        L1b:
            jr0 r2 = new jr0
            r2.<init>(r6, r8)
        L20:
            java.lang.Object r6 = r2.m
            int r8 = r2.w
            r3 = 0
            og5 r4 = defpackage.og5.g
            r5 = 1
            if (r8 == 0) goto L36
            if (r8 != r5) goto L30
            defpackage.js2.o(r6)
            goto L62
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r6)
            return r3
        L36:
            defpackage.js2.o(r6)
            int r6 = r7.ordinal()
            if (r6 == r5) goto L6e
            r7 = 3
            r8 = 4
            if (r6 == r7) goto L46
            if (r6 == r8) goto L6e
            goto L6d
        L46:
            boolean r6 = r1.j
            if (r6 != 0) goto L4b
            goto L6d
        L4b:
            r6 = 0
            r1.j = r6
            x21 r6 = defpackage.na1.g
            c21 r6 = defpackage.c21.a
            fr0 r7 = new fr0
            r7.<init>(r0, r3, r8)
            r2.w = r5
            java.lang.Object r6 = defpackage.m50.f0(r6, r7, r2)
            px0 r7 = defpackage.px0.j
            if (r6 != r7) goto L62
            return r7
        L62:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L6d
            r0.u()
        L6d:
            return r4
        L6e:
            r1.j = r5
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kr0.y(s30, mu0):java.lang.Object");
    }
}
