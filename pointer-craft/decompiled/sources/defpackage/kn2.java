package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.view.MotionEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kn2 implements xy1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ kn2(Object obj, Object obj2, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00e2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [mu0] */
    /* JADX WARN: Type inference failed for: r15v12 */
    @Override // defpackage.xy1
    public final Object a(Object obj) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        byte[] bArr;
        p75 p75VarG;
        p75 p75VarG2;
        p75 p75VarG3;
        j75 j75Var;
        ld ldVarT;
        i75 i75Var;
        byte b = this.j;
        byte b2 = 20;
        byte b3 = 3;
        byte b4 = 2;
        int i = 0;
        byte[] bArr2 = 0;
        ju4VarR = null;
        ju4 ju4VarR = null;
        og5 og5Var = og5.g;
        Object obj2 = this.a;
        Object obj3 = this.t;
        switch (b) {
            case 0:
                ao2 ao2Var = (ao2) obj3;
                sk2 sk2VarG = sk2.g((sk2) obj2, 0, (String) obj, null, null, null, null, 253);
                ao2Var.getClass();
                ji0 ji0VarD = v70.d(ao2Var);
                x21 x21Var = na1.g;
                m50.T(ji0VarD, c21.a, new yn2(ao2Var, sk2VarG, bArr2, b4), 2);
                return og5Var;
            case 1:
                Context context = (Context) obj3;
                Uri uri = (Uri) obj;
                sk2 sk2Var = (sk2) ((ob3) obj2).getValue();
                if (sk2Var != null) {
                    bArr = sk2Var.j;
                }
                if (uri != null && bArr2 != 0) {
                    try {
                        ContentResolver contentResolver = context.getContentResolver();
                        if (contentResolver != null && (parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "w")) != null) {
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                                try {
                                    fileOutputStream.write(bArr2);
                                    fileOutputStream.close();
                                    parcelFileDescriptorOpenFileDescriptor.close();
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        gp4.C(fileOutputStream, th);
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th3) {
                                try {
                                    throw th3;
                                } catch (Throwable th4) {
                                    gp4.C(parcelFileDescriptorOpenFileDescriptor, th3);
                                    throw th4;
                                }
                            }
                        }
                    } catch (FileNotFoundException | IOException unused) {
                    }
                }
                bArr2 = bArr;
                return og5Var;
            case 2:
                ts3 ts3Var = (ts3) obj;
                ArrayList arrayListE = pw5.e((List) obj3, (my1) ((rv2) obj2).y);
                if (arrayListE != null) {
                    int size = arrayListE.size();
                    while (i < size) {
                        fp3 fp3Var = (fp3) arrayListE.get(i);
                        us3 us3Var = (us3) fp3Var.j;
                        my1 my1Var = (my1) fp3Var.t;
                        ts3.a(ts3Var, us3Var, my1Var != null ? ((je2) my1Var.g()).g : 0L);
                        i++;
                    }
                }
                return og5Var;
            case 3:
                qg qgVar = (qg) obj2;
                o84 o84Var = (o84) obj;
                float fD = ((pp3) ((xo4) obj3).n.q).d();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (o84Var.d & 4294967295L));
                if (!Float.isNaN(fD) && !Float.isNaN(fIntBitsToFloat) && fIntBitsToFloat != 0.0f) {
                    float fFloatValue = ((Number) qgVar.n()).floatValue();
                    o84Var.j(b73.n(o84Var, fFloatValue));
                    o84Var.t(b73.v(o84Var, fFloatValue));
                    o84Var.c(xs2.r(0.5f, (fD + fIntBitsToFloat) / fIntBitsToFloat));
                }
                return og5Var;
            case 4:
                nj4 nj4Var = (nj4) obj;
                lj4.w(nj4Var, 1.0f);
                lj4.n(nj4Var, (String) obj3);
                nj4Var.g(yi4.y, new p1(null, new ss((my1) obj2, (byte) 5)));
                return og5Var;
            case 5:
                ((n93) obj3).u((wj4) obj2, obj);
                return og5Var;
            case 6:
                ad3 ad3Var = (ad3) obj3;
                vc3 vc3Var = ((jd3) obj2).y;
                xd3 xd3Var = (xd3) obj;
                xd3Var.getClass();
                vd3 vd3Var = xd3Var.g;
                vd3Var.l = 0;
                vd3Var.j = 0;
                if (ad3Var instanceof dd3) {
                    int i2 = ad3.q;
                    for (ad3 ad3Var2 : mq2.l(ad3Var)) {
                        ad3 ad3VarJ = vc3Var.j();
                        if (yf2.p(ad3Var2, ad3VarJ != null ? ad3VarJ.a : null)) {
                        }
                    }
                    int i3 = dd3.c;
                    xd3Var.g(((ad3) dk4.N(dk4.L(vc3Var.t(), new m92(b2)))).t.g);
                    xd3Var.x = false;
                    xd3Var.l = true;
                }
                return og5Var;
            case 7:
                bj3 bj3Var = (bj3) obj3;
                us3 us3Var2 = (us3) obj2;
                ts3 ts3Var2 = (ts3) obj;
                boolean z = bj3Var.f;
                float f = bj3Var.o;
                if (z) {
                    ts3.m(ts3Var2, us3Var2, ts3Var2.V(f), ts3Var2.V(0.0f));
                } else {
                    ts3Var2.j(us3Var2, ts3Var2.V(f), ts3Var2.V(0.0f), 0.0f);
                }
                return og5Var;
            case 8:
                ((bz1) obj3).l(Integer.valueOf(((dx3) obj).g), Integer.valueOf(((ro) obj2).D().y));
                return og5Var;
            case 9:
                kb5 kb5Var = (kb5) obj3;
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                wf wfVar = ((yu3) obj2).g;
                if (actionMasked == 0) {
                    if (wfVar == null) {
                        yf2.Y("onTouchEvent");
                        throw null;
                    }
                    kb5Var.t = ((Boolean) wfVar.a(motionEvent)).booleanValue() ? wu3.t : wu3.a;
                } else {
                    if (wfVar == null) {
                        yf2.Y("onTouchEvent");
                        throw null;
                    }
                    wfVar.a(motionEvent);
                }
                return og5Var;
            case 10:
                bw4 bw4Var = (bw4) obj3;
                bw4 bw4Var2 = (bw4) obj2;
                xd1 xd1Var = (xd1) obj;
                float fE = xd1Var.e(2.0f);
                float f2 = fE / 2.0f;
                xd1.F(xd1Var, ((jj0) bw4Var.getValue()).g, xd1Var.e(vd6.r / 2.0f) - f2, 0L, new by4(fE, 0.0f, 0, 0, 30), 108);
                if (vb1.g(((vb1) bw4Var2.getValue()).j, 0.0f) > 0) {
                    xd1.F(xd1Var, ((jj0) bw4Var.getValue()).g, xd1Var.e(((vb1) bw4Var2.getValue()).j) - f2, 0L, go1.g, 108);
                }
                return og5Var;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                ((wa1) obj).getClass();
                ((yv0) obj3).x(null, (String) obj2);
                return new ae((byte) 6);
            case 12:
                lg4 lg4Var = (lg4) obj3;
                ng4 ng4Var = (ng4) obj2;
                lc1 lc1Var = (lc1) obj;
                float f3 = lc1Var.y ? -1.0f : 1.0f;
                long j = lc1Var.g;
                lg4Var.g(1, wi3.x(f3, ng4Var.n == um3.t ? wi3.g(j, 0.0f, 1) : wi3.g(j, 0.0f, 2)));
                return og5Var;
            case 13:
                ((xy1) obj3).a((String) obj2);
                return og5Var;
            case 14:
                String str = (String) obj;
                str.getClass();
                return ((String[]) obj2)[pr.b0((String[]) obj3, str)];
            case kq2.x /* 15 */:
                st4 st4Var = (st4) obj3;
                xy1 xy1Var = (xy1) obj2;
                zf5 zf5Var = (zf5) obj;
                zf5Var.getClass();
                if (st4Var.contains(zf5Var)) {
                    st4Var.remove(zf5Var);
                } else {
                    st4Var.add(zf5Var);
                }
                xy1Var.a(st4Var);
                return og5Var;
            case 16:
                ob3 ob3Var = (ob3) obj3;
                ob3 ob3Var2 = (ob3) obj2;
                j75 j75Var2 = (j75) obj;
                j75Var2.getClass();
                if (((int) (j75Var2.r >> 32)) < j75Var2.y.n) {
                    k85 k85Var = (k85) ob3Var.getValue();
                    long j2 = ((k85) ob3Var.getValue()).g.y;
                    kq2.p(j2);
                    ob3Var.setValue(k85.g(k85Var, 0L, kq2.O((float) (((double) n85.r(j2)) * 0.87d), 1095216660480L & j2), null, null, 0L, 0L, null, 16777213));
                } else {
                    ob3Var2.setValue(Boolean.TRUE);
                }
                return og5Var;
            case 17:
                ((Integer) obj).getClass();
                return ((Parcel) obj3).readValue((ClassLoader) obj2);
            case 18:
                ob3 ob3Var3 = (ob3) obj2;
                cq4 cq4Var = (cq4) obj;
                float fFloatValue2 = ((Number) ((bw4) obj3).getValue()).floatValue();
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (cq4Var.g >> 32)) * fFloatValue2;
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (cq4Var.g & 4294967295L)) * fFloatValue2;
                if (Float.intBitsToFloat((int) (((cq4) ob3Var3.getValue()).g >> 32)) != fIntBitsToFloat2 || Float.intBitsToFloat((int) (((cq4) ob3Var3.getValue()).g & 4294967295L)) != fIntBitsToFloat3) {
                    ob3Var3.setValue(new cq4((((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32)));
                }
                return og5Var;
            case 19:
                ja0 ja0Var = (ja0) obj;
                return ja0Var.g(new h((Object) new kn2(((cn4) obj3).g(ja0Var.j.n(), ja0Var.j.getLayoutDirection(), ja0Var), (oj0) obj2, b2), (byte) 12));
            case 20:
                jr2.b((xd1) obj, (br2) obj3, ((oj0) obj2).g());
                return og5Var;
            case 21:
                return new bw((ob3) obj3, (ja3) obj2, b3);
            case 22:
                my1 my1Var2 = (my1) obj2;
                h45 h45Var = (h45) obj;
                ((my1) obj3).g();
                if (my1Var2 != null ? ((Boolean) my1Var2.g()).booleanValue() : true) {
                    h45Var.close();
                }
                return og5Var;
            case 23:
                bj bjVar = (bj) obj3;
                qp3 qp3Var = ((pv2) obj2).y;
                n35 n35Var = (n35) obj;
                ov2 ov2Var = (ov2) bjVar.g;
                p75 p75VarG4 = ov2Var.g();
                ju4 ju4Var = p75VarG4 != null ? p75VarG4.g : null;
                ju4 ju4VarR2 = ((qp3Var.d() & 1) == 0 || (p75VarG3 = ov2Var.g()) == null) ? null : p75VarG3.y;
                if (ju4Var != null) {
                    ju4VarR2 = ju4Var.r(ju4VarR2);
                }
                ju4 ju4VarR3 = ((qp3Var.d() & 2) == 0 || (p75VarG2 = ov2Var.g()) == null) ? null : p75VarG2.r;
                if (ju4VarR2 != null) {
                    ju4VarR3 = ju4VarR2.r(ju4VarR3);
                }
                if ((qp3Var.d() & 4) != 0 && (p75VarG = ov2Var.g()) != null) {
                    ju4VarR = p75VarG.n;
                }
                if (ju4VarR3 != null) {
                    ju4VarR = ju4VarR3.r(ju4VarR);
                }
                n35Var.y = n35Var.g.y(new q2((Object) new q54(), (Object) bjVar, (Object) ju4VarR, (byte) 26));
                return og5Var;
            case 24:
                o75 o75Var = (o75) obj3;
                bj bjVar2 = (bj) obj2;
                o84 o84Var2 = (o84) obj;
                cj cjVar = o75Var.y;
                tp3 tp3Var = o75Var.g;
                j75 j75Var3 = (j75) tp3Var.getValue();
                if (yf2.p(cjVar, (j75Var3 == null || (i75Var = j75Var3.g) == null) ? null : i75Var.g) && (j75Var = (j75) tp3Var.getValue()) != null) {
                    h93 h93Var = j75Var.y;
                    bj bjVarR = o75.r(bjVar2, j75Var);
                    if (bjVarR == null) {
                        ldVarT = null;
                    } else {
                        int i4 = bjVarR.r;
                        int i5 = bjVarR.y;
                        ldVarT = j75Var.t(i5, i4);
                        k44 k44VarY = j75Var.y(i5);
                        int i6 = i4 - 1;
                        ldVarT.t(((((long) Float.floatToRawIntBits(h93Var.n(i5) == h93Var.n(i6) ? Math.min(j75Var.y(i6).g, k44VarY.g) : 0.0f)) << 32) | (((long) Float.floatToRawIntBits(k44VarY.y)) & 4294967295L)) ^ (-9223372034707292160L));
                    }
                } else {
                    ldVarT = null;
                }
                n75 n75Var = ldVarT != null ? new n75(ldVarT) : null;
                if (n75Var != null) {
                    o84Var2.m(n75Var);
                    o84Var2.x(true);
                }
                return og5Var;
            case 25:
                List list = (List) obj3;
                List list2 = (List) obj2;
                ts3 ts3Var3 = (ts3) obj;
                if (list != null) {
                    int size2 = list.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        fp3 fp3Var2 = (fp3) list.get(i7);
                        ts3.a(ts3Var3, (us3) fp3Var2.j, ((je2) fp3Var2.t).g);
                    }
                }
                if (list2 != null) {
                    int size3 = list2.size();
                    while (i < size3) {
                        fp3 fp3Var3 = (fp3) list2.get(i);
                        us3 us3Var3 = (us3) fp3Var3.j;
                        my1 my1Var3 = (my1) fp3Var3.t;
                        ts3.a(ts3Var3, us3Var3, my1Var3 != null ? ((je2) my1Var3.g()).g : 0L);
                        i++;
                    }
                }
                return og5Var;
            case 26:
                oh5 oh5Var = (oh5) obj3;
                ((Long) obj).getClass();
                float f4 = oh5Var.v;
                oh5Var.v = 0.0f;
                ((xy1) obj2).a(Float.valueOf(f4));
                return og5Var;
            case 27:
                List list3 = (List) obj3;
                es2 es2Var = (es2) obj;
                es2Var.getClass();
                es2Var.H(list3.size(), null, new wk0(list3, (byte) 9), new nm0(2039820996, true, new xk0(list3, (st4) obj2, b3)));
                return og5Var;
            case 28:
                List list4 = (List) obj;
                list4.getClass();
                ((bz1) obj3).l((String) obj2, list4);
                return og5Var;
            default:
                ((ts3) obj).j((us3) obj3, 0, 0, ((qs5) obj2).o);
                return og5Var;
        }
    }

    public /* synthetic */ kn2(Object obj, Object obj2, Object obj3, byte b) {
        this.j = b;
        this.t = obj2;
        this.a = obj3;
    }
}
