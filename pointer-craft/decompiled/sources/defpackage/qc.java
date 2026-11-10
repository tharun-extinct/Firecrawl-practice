package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;
import io.appground.blek.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qc implements xy1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object w;

    public /* synthetic */ qc(jy0 jy0Var, aj3 aj3Var, k65 k65Var, mt2 mt2Var, cu4 cu4Var) {
        this.j = (byte) 10;
        this.a = jy0Var;
        this.m = aj3Var;
        this.t = k65Var;
        this.q = mt2Var;
        this.w = cu4Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) throws Exception {
        Toast toast;
        int i;
        Toast toast2;
        List listSubList;
        byte b = this.j;
        og5 og5Var = og5.g;
        Object obj2 = this.w;
        Object obj3 = this.q;
        Object obj4 = this.t;
        Object obj5 = this.m;
        Object obj6 = this.a;
        switch (b) {
            case 0:
                nt2 nt2Var = (nt2) obj;
                gt2 gt2Var = ((uc) obj6).g;
                nt2Var.j = (k65) obj4;
                nt2Var.t = (ma2) obj5;
                nt2Var.r = (q2) obj3;
                nt2Var.n = (xy1) obj2;
                nt2Var.v = gt2Var != null ? gt2Var.f : null;
                nt2Var.x = gt2Var != null ? gt2Var.k : null;
                nt2Var.l = gt2Var != null ? (bl5) v70.b(gt2Var, hp0.z) : null;
                return og5Var;
            case 1:
                sv3 sv3Var = (sv3) obj4;
                sv3Var.f.addView(sv3Var, sv3Var.k);
                sv3Var.i((my1) obj6, (wv3) obj5, (String) obj3, (fl2) obj2);
                return new kb(sv3Var, (byte) 1);
            case 2:
                bz1 bz1Var = (bz1) obj4;
                Context context = (Context) obj6;
                ob3 ob3Var = (ob3) obj5;
                ob3 ob3Var2 = (ob3) obj3;
                ob3 ob3Var3 = (ob3) obj2;
                String str = (String) obj;
                str.getClass();
                if (!((Boolean) ob3Var.getValue()).booleanValue() || !yf2.p((String) ob3Var2.getValue(), str)) {
                    bz1Var.l(str, ((Boolean) ob3Var3.getValue()).booleanValue() ? 66 : null);
                    context.getClass();
                    if (Build.VERSION.SDK_INT != 25) {
                        WeakReference weakReference = bi6.z;
                        if (weakReference != null && (toast = (Toast) weakReference.get()) != null) {
                            toast.cancel();
                        }
                        Toast toastMakeText = Toast.makeText(context.getApplicationContext(), str, 0);
                        toastMakeText.show();
                        bi6.z = new WeakReference(toastMakeText);
                    }
                }
                if (!((Boolean) ob3Var.getValue()).booleanValue()) {
                    str = "";
                }
                ob3Var2.setValue(str);
                return og5Var;
            case 3:
                o04 o04Var = (o04) obj;
                o04Var.getClass();
                xq2.E(o04Var, (Context) obj4, (yi2) obj6, (l62) obj5, (String) obj3, ((yy0) ((ob3) obj2).getValue()).n);
                return og5Var;
            case 4:
                s30 s30Var = (s30) obj4;
                my1 my1Var = (my1) obj6;
                Context context2 = (Context) obj5;
                ob3 ob3Var4 = (ob3) obj3;
                ob3 ob3Var5 = (ob3) obj2;
                jh0 jh0Var = (jh0) obj;
                jh0Var.getClass();
                if (jh0Var == jh0.a) {
                    ob3Var4.setValue(dc6.g((ih0) ob3Var4.getValue(), s30Var, 8));
                    my1Var.g();
                } else {
                    kh0 kh0VarT = dc6.t(context2);
                    ob3Var5.setValue(Boolean.valueOf(kh0VarT == kh0.t));
                    int i2 = kh0VarT == null ? -1 : o81.g[kh0VarT.ordinal()];
                    if (i2 == -1) {
                        i = R.string.message_error;
                    } else if (i2 == 1) {
                        i = R.string.classic_mode_setup_toast_locked;
                    } else {
                        if (i2 != 2) {
                            up.y();
                            return null;
                        }
                        i = R.string.classic_mode_setup_toast_unlocked;
                    }
                    if (Build.VERSION.SDK_INT != 25) {
                        WeakReference weakReference2 = bi6.z;
                        if (weakReference2 != null && (toast2 = (Toast) weakReference2.get()) != null) {
                            toast2.cancel();
                        }
                        Toast toastMakeText2 = Toast.makeText(context2.getApplicationContext(), i, 1);
                        toastMakeText2.show();
                        bi6.z = new WeakReference(toastMakeText2);
                    }
                }
                return og5Var;
            case 5:
                es2 es2Var = (es2) obj;
                es2Var.getClass();
                List list = (List) ((bw4) obj4).getValue();
                es2Var.H(list.size(), null, new wk0(list, (byte) 4), new nm0(2039820996, true, new c71(list, (ik1) obj6, (gx3) obj5, (bz1) obj3, (ob3) obj2, (byte) 1)));
                return og5Var;
            case 6:
                u83 u83Var = (u83) obj4;
                u54 u54Var = (u54) obj6;
                r54 r54Var = (r54) obj5;
                ng4 ng4Var = (ng4) obj3;
                q54 q54Var = (q54) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                q83 q83VarA = u83.a(u83Var.l);
                if (q83VarA != null) {
                    cd2 cd2Var = u83Var.v;
                    long j = q83VarA.y;
                    long j2 = q83VarA.g;
                    ((xj5) cd2Var.t).g(Float.intBitsToFloat((int) (j2 >> 32)), j);
                    ((xj5) cd2Var.a).g(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
                    q83 q83VarG = ((q83) u54Var.j).g(q83VarA);
                    u54Var.j = q83VarG;
                    float fA = ng4Var.a(ng4Var.x(q83VarG.g));
                    r54Var.j = fA;
                    q54Var.j = !fb6.v(fA - fFloatValue);
                }
                return Boolean.valueOf(q83VarA != null);
            case 7:
                ArrayList arrayList = (ArrayList) obj6;
                s54 s54Var = (s54) obj5;
                vc3 vc3Var = (vc3) obj3;
                Bundle bundle = (Bundle) obj2;
                mc3 mc3Var = (mc3) obj;
                mc3Var.getClass();
                ((q54) obj4).j = true;
                int iIndexOf = arrayList.indexOf(mc3Var);
                if (iIndexOf != -1) {
                    int i3 = iIndexOf + 1;
                    listSubList = arrayList.subList(s54Var.j, i3);
                    s54Var.j = i3;
                } else {
                    listSubList = pi1.j;
                }
                vc3Var.g(mc3Var.t, bundle, mc3Var, listSubList);
                return og5Var;
            case 8:
                b30 b30Var = (b30) obj4;
                String str2 = (String) obj6;
                UUID uuid = (UUID) obj5;
                ((wa1) obj).getClass();
                uuid.getClass();
                jz3[] jz3VarArr = (jz3[]) pr.W(new jz3[]{(jz3) ((ob3) obj3).getValue(), (jz3) ((ob3) obj2).getValue()}).toArray(new jz3[0]);
                jz3[] jz3VarArr2 = (jz3[]) Arrays.copyOf(jz3VarArr, jz3VarArr.length);
                b30Var.getClass();
                str2.getClass();
                new v92(b30Var.y).H(uuid, b30Var.r.g.z, str2, "dialog_v1", (jz3[]) Arrays.copyOf(jz3VarArr2, jz3VarArr2.length));
                return new ae((byte) 4);
            case 9:
                String[] strArr = (String[]) obj4;
                es2 es2Var2 = (es2) obj;
                es2Var2.getClass();
                es2Var2.H(strArr.length, null, new ce(strArr, (byte) 6), new nm0(1763000017, true, new c71(strArr, (xy1) obj2, (String[]) obj6, (hm3) obj5, (st4) obj3, (byte) 3)));
                return og5Var;
            default:
                aj3 aj3Var = (aj3) obj5;
                k65 k65Var = (k65) obj4;
                mt2 mt2Var = (mt2) obj3;
                cu4 cu4Var = (cu4) obj2;
                wm2 wm2Var = (wm2) obj;
                wm2Var.g();
                pb0 pb0Var = wm2Var.j;
                float fD = ((jy0) obj6).r.d();
                if (fD != 0.0f) {
                    long j3 = k65Var.y;
                    int i4 = u75.r;
                    int iJ = aj3Var.j((int) (j3 >> 32));
                    k75 k75VarN = mt2Var.n();
                    k44 k44VarR = k75VarN != null ? k75VarN.g.r(iJ) : new k44(0.0f, 0.0f, 0.0f, 0.0f);
                    float fFloor = (float) Math.floor(wm2Var.e(2.0f));
                    if (fFloor < 1.0f) {
                        fFloor = 1.0f;
                    }
                    float f = fFloor / 2.0f;
                    float f2 = k44VarR.g + f;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (pb0Var.n() >> 32)) - f;
                    if (f2 > fIntBitsToFloat) {
                        f2 = fIntBitsToFloat;
                    }
                    if (f2 >= f) {
                        f = f2;
                    }
                    float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f)) + 0.5f : (float) Math.rint(f);
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(k44VarR.y)) & 4294967295L);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(k44VarR.n)) & 4294967295L);
                    nb0 nb0Var = pb0Var.j.r;
                    cd cdVarP = pb0Var.m;
                    if (cdVarP == null) {
                        cdVarP = ue5.p();
                        cdVarP.w(1);
                        pb0Var.m = cdVarP;
                    }
                    Paint paint = (Paint) cdVarP.y;
                    cu4Var.g(fD, pb0Var.n(), cdVarP);
                    if (!yf2.p((m30) cdVarP.n, null)) {
                        cdVarP.l(null);
                    }
                    if (cdVarP.g != 3) {
                        cdVarP.v(3);
                    }
                    if (paint.getStrokeWidth() != fFloor) {
                        cdVarP.q(fFloor);
                    }
                    if (paint.getStrokeMiter() != 4.0f) {
                        paint.setStrokeMiter(4.0f);
                    }
                    if (cdVarP.y() != 0) {
                        cdVarP.a(0);
                    }
                    if (cdVarP.r() != 0) {
                        cdVarP.m(0);
                    }
                    if (!paint.isFilterBitmap()) {
                        cdVarP.j(1);
                    }
                    nb0Var.w(jFloatToRawIntBits, jFloatToRawIntBits2, cdVarP);
                }
                return og5Var;
        }
    }

    public /* synthetic */ qc(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
        this.m = obj3;
        this.q = obj4;
        this.w = obj5;
    }

    public /* synthetic */ qc(String[] strArr, xy1 xy1Var, String[] strArr2, hm3 hm3Var, st4 st4Var) {
        this.j = (byte) 9;
        this.t = strArr;
        this.w = xy1Var;
        this.a = strArr2;
        this.m = hm3Var;
        this.q = st4Var;
    }
}
