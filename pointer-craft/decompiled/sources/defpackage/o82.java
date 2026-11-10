package defpackage;

import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.hardware.SensorManager;
import android.net.Uri;
import android.view.textclassifier.TextClassification;
import io.appground.blek.R;
import java.util.ListIterator;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o82 implements my1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ o82(o75 o75Var, bj bjVar, rf rfVar) {
        this.j = (byte) 20;
        this.t = bjVar;
        this.a = rfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.my1
    public final Object g() throws PendingIntent.CanceledException {
        yo0 yo0Var;
        long j;
        k75 k75VarN;
        mt2 mt2Var;
        cj cjVar;
        byte b = this.j;
        byte b2 = 7;
        boolean z = true;
        Object[] objArr = 0;
        Object obj = null;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        og5 og5Var = og5.g;
        Object obj2 = this.a;
        Object obj3 = this.t;
        switch (b) {
            case 0:
                p82 p82Var = (p82) obj3;
                p82Var.j.g(p82Var, (pl4) ((u54) obj2).j);
                return og5Var;
            case 1:
                m50.T((ox0) obj3, null, new dy(obj2, (mu0) (objArr2 == true ? 1 : 0), (byte) 14), 3);
                return og5Var;
            case 2:
                ((xy1) obj3).a(((hm2) obj2).r);
                return og5Var;
            case 3:
                zf5 zf5Var = (zf5) obj2;
                ListIterator listIterator = ((st4) obj3).listIterator();
                while (true) {
                    tv2 tv2Var = (tv2) listIterator;
                    if (tv2Var.hasNext()) {
                        Object next = tv2Var.next();
                        if (((j63) next).g == zf5Var.x) {
                            obj = next;
                        }
                    }
                }
                return Boolean.valueOf(obj != null);
            case 4:
                return "KeyButton isSelected " + ((zf5) obj3) + " " + ((Boolean) ((bw4) obj2).getValue()).booleanValue();
            case 5:
                ao2 ao2Var = (ao2) obj3;
                ao2Var.getClass();
                ji0 ji0VarD = v70.d(ao2Var);
                x21 x21Var = na1.g;
                m50.T(ji0VarD, c21.a, new yn2(ao2Var, (sk2) obj2, objArr3 == true ? 1 : 0, objArr == true ? 1 : 0), 2);
                return og5Var;
            case 6:
                ((my1) obj3).g();
                ((my1) obj2).g();
                return og5Var;
            case 7:
                xo4 xo4Var = (xo4) obj3;
                ox0 ox0Var = (ox0) obj2;
                if (((Boolean) ((xy1) xo4Var.n.n).a(yo4.a)).booleanValue()) {
                    m50.T(ox0Var, null, new v63(xo4Var, objArr4 == true ? 1 : 0, b2), 3);
                }
                return Boolean.TRUE;
            case 8:
                ((ob3) obj2).setValue(Boolean.FALSE);
                ((b30) obj3).r.g.e();
                return og5Var;
            case 9:
                ((xy1) obj3).a(((lz3) obj2).g);
                return og5Var;
            case 10:
                CharSequence charSequence = (CharSequence) obj2;
                charSequence.getClass();
                Matcher matcher = ((y54) obj3).j.matcher(charSequence);
                matcher.getClass();
                return mq2.n(matcher, 0, charSequence);
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                gx3 gx3Var = (gx3) obj3;
                yv0 yv0Var = (yv0) obj2;
                Integer numValueOf = Integer.valueOf(R.string.premium_feature_fullscreen_mode);
                if ((2 & 6) != 0) {
                    numValueOf = null;
                }
                char c = (6 & 4) == 0 ? (char) 0 : (char) 1;
                gx3Var.getClass();
                if (c == 0 || gx3Var.g) {
                    m50.T(v70.d(yv0Var), null, new q(yv0Var, objArr5 == true ? 1 : 0, (byte) 21), 3);
                } else {
                    gx3Var.n.l("save_shared_layout", numValueOf);
                }
                return og5Var;
            case 12:
                xl2 xl2Var = (xl2) obj3;
                m50.T(v70.d(xl2Var), null, new qx(xl2Var, objArr6 == true ? 1 : 0, b2), 3);
                ((jd3) obj2).x();
                return og5Var;
            case 13:
                zj4 zj4Var = (zj4) obj2;
                SensorManager sensorManager = ((ak4) obj3).l;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(zj4Var);
                }
                return og5Var;
            case 14:
                ((xy1) obj3).a((xl4) obj2);
                return og5Var;
            case kq2.x /* 15 */:
                ((xy1) ((ob3) obj2).getValue()).a((zf5) obj3);
                return og5Var;
            case 16:
                wr4 wr4Var = (wr4) obj3;
                jn1 jn1Var = (jn1) obj2;
                if (!yf2.p(wr4Var, jn1Var.g)) {
                    hj0.b0(jn1Var.y, new ll2(wr4Var, (byte) 19));
                    u34 u34Var = jn1Var.r;
                    if (u34Var != null && (yo0Var = u34Var.g) != null) {
                        yo0Var.u(u34Var, null);
                    }
                }
                return og5Var;
            case 17:
                Context context = (Context) obj3;
                TextClassification textClassification = (TextClassification) obj2;
                String text = textClassification.getText();
                ih6.y(PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592));
                return og5Var;
            case 18:
                m50.T((ox0) obj3, null, new x55((xy1) obj2, objArr7 == true ? 1 : 0, z ? (byte) 1 : (byte) 0), 1);
                return og5Var;
            case 19:
                b65 b65Var = (b65) obj3;
                long j2 = ((qe2) ((ob3) obj2).getValue()).g;
                wi3 wi3VarL = b65Var.l();
                long jFloatToRawIntBits = 9205357640488583168L;
                if (wi3VarL != null) {
                    long j3 = wi3VarL.g;
                    cj cjVarM = b65Var.m();
                    if (cjVarM != null && cjVarM.t.length() != 0) {
                        p42 p42Var = (p42) b65Var.s.getValue();
                        int i = p42Var == null ? -1 : d65.g[p42Var.ordinal()];
                        if (i != -1) {
                            if (i == 1 || i == 2) {
                                long j4 = b65Var.q().y;
                                int i2 = u75.r;
                                j = j4 >> 32;
                            } else {
                                if (i != 3) {
                                    up.y();
                                    return null;
                                }
                                long j5 = b65Var.q().y;
                                int i3 = u75.r;
                                j = j5 & 4294967295L;
                            }
                            int i4 = (int) j;
                            mt2 mt2Var2 = b65Var.n;
                            if (mt2Var2 != null && (k75VarN = mt2Var2.n()) != null && (mt2Var = b65Var.n) != null && (cjVar = mt2Var.g.g) != null) {
                                int iW = xs2.w(b65Var.y.j(i4), 0, cjVar.t.length());
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (k75VarN.n(j3) >> 32));
                                j75 j75Var = k75VarN.g;
                                h93 h93Var = j75Var.y;
                                int iN = h93Var.n(iW);
                                float fV = j75Var.v(iN);
                                float fX = j75Var.x(iN);
                                float fQ = xs2.q(fIntBitsToFloat, Math.min(fV, fX), Math.max(fV, fX));
                                if (qe2.g(j2, 0L) || Math.abs(fIntBitsToFloat - fQ) <= ((int) (j2 >> 32)) / 2) {
                                    float fX2 = h93Var.x(iN);
                                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fQ)) << 32) | (((long) Float.floatToRawIntBits(((h93Var.y(iN) - fX2) / 2.0f) + fX2)) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                return new wi3(jFloatToRawIntBits);
            case 20:
                rf rfVar = (rf) obj2;
                ov2 ov2Var = (ov2) ((bj) obj3).g;
                if (ov2Var instanceof nv2) {
                    try {
                        String str = ((nv2) ov2Var).g;
                        rfVar.getClass();
                        try {
                            rfVar.g.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        } catch (ActivityNotFoundException e) {
                            throw new IllegalArgumentException(du4.i("Can't open ", str, "."), e);
                        }
                        break;
                    } catch (IllegalArgumentException unused) {
                    }
                }
                return og5Var;
            default:
                ((xy1) obj3).a((jj) obj2);
                return og5Var;
        }
    }

    public /* synthetic */ o82(Object obj, Object obj2, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
    }
}
