package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import io.appground.blek.R;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class aq2 {
    public static final /* synthetic */ int g = 0;

    public static final ob3 A(Object obj, Object obj2, Object obj3, bz1 bz1Var, h02 h02Var, int i) {
        Object objK = h02Var.K();
        l76 l76Var = oo0.g;
        if (objK == l76Var) {
            objK = kq2.M(obj);
            h02Var.i0(objK);
        }
        ob3 ob3Var = (ob3) objK;
        boolean zJ = h02Var.j(bz1Var);
        Object objK2 = h02Var.K();
        if (zJ || objK2 == l76Var) {
            objK2 = new qt4(bz1Var, ob3Var, null, (byte) 1);
            h02Var.i0(objK2);
        }
        k33.s(obj2, obj3, (bz1) objK2, h02Var);
        return ob3Var;
    }

    public static final void B(Bundle bundle, String str, List list) {
        bundle.putStringArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
    }

    public static final Object[] C(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        pr.Q(objArr, objArr2, 0, i, 6);
        pr.O(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] D(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        pr.Q(objArr, objArr2, 0, i, 6);
        pr.O(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }

    public static final void I(x94 x94Var) {
        if (((AtomicBoolean) x94Var.l.m).get()) {
            l0.z("Database is closed");
        }
    }

    public static final int J(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    public static int K(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static final void a(final String str, final int i, final boolean z, h02 h02Var, final int i2) {
        boolean z2;
        char c;
        i75 i75Var;
        cj cjVar;
        h02Var.Z(-2120648028);
        int i3 = (i2 & 6) == 0 ? (h02Var.x(str) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= h02Var.n(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= h02Var.l(z) ? 256 : 128;
        }
        boolean z3 = true;
        if (h02Var.N(i3 & 1, (i3 & 147) != 146)) {
            j14 j14Var = tj0.g;
            long j = ((rj0) h02Var.a(j14Var)).g;
            long jY = jj0.y(0.4f, ((rj0) h02Var.a(j14Var)).u);
            boolean zV = ((i3 & 896) == 256) | ((i3 & 14) == 4) | ((i3 & 112) == 32) | h02Var.v(j) | h02Var.v(jY);
            Object objK = h02Var.K();
            Object obj = oo0.g;
            if (zV || objK == obj) {
                str.getClass();
                if (str.length() == 0) {
                    objK = new cj("");
                } else {
                    int length = str.length() - 1;
                    if (length < 0) {
                        length = 0;
                    }
                    int iW = (xs2.w(i, 0, length) / 500) * 500;
                    int i4 = iW + 1000;
                    int length2 = str.length();
                    if (i4 > length2) {
                        i4 = length2;
                    }
                    StringBuilder sb = new StringBuilder(i4 - iW);
                    int i5 = iW;
                    while (i5 < i4) {
                        if (z) {
                            z2 = z3;
                            c = 8226;
                        } else {
                            z2 = z3;
                            char cCharAt = str.charAt(i5);
                            c = cCharAt != '\t' ? cCharAt != '\n' ? cCharAt : (char) 9166 : (char) 8677;
                        }
                        sb.append(c);
                        i5++;
                        z3 = z2;
                    }
                    String string = sb.toString();
                    int iW2 = xs2.w((xs2.w(i, 0, str.length() - 1) + 1) - iW, 0, string.length());
                    StringBuilder sb2 = new StringBuilder(16);
                    new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    new ArrayList();
                    sb2.append(string);
                    int i6 = 8;
                    if (iW2 > 0) {
                        arrayList.add(new zi(new ju4(j, 0L, (qv1) null, (lv1) null, (mv1) null, (lu1) null, (String) null, 0L, (ry) null, (n65) null, (tx2) null, 0L, (l45) null, (ym4) null, 65534), 0, iW2, i6));
                    }
                    if (iW2 < string.length()) {
                        arrayList.add(new zi(new ju4(jY, 0L, (qv1) null, (lv1) null, (mv1) null, (lu1) null, (String) null, 0L, (ry) null, (n65) null, (tx2) null, 0L, (l45) null, (ym4) null, 65534), iW2, string.length(), i6));
                    }
                    String string2 = sb2.toString();
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    int size = arrayList.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        arrayList2.add(((zi) arrayList.get(i7)).y(sb2.length()));
                    }
                    objK = new cj(string2, arrayList2);
                }
                h02Var.i0(objK);
            }
            cj cjVar2 = (cj) objK;
            rf4 rf4VarO = gp4.O(h02Var);
            Object objK2 = h02Var.K();
            if (objK2 == obj) {
                objK2 = kq2.M(null);
                h02Var.i0(objK2);
            }
            ob3 ob3Var = (ob3) objK2;
            int length3 = str.length() - 1;
            if (length3 < 0) {
                length3 = 0;
            }
            int iW3 = (xs2.w(i, 0, length3) / 500) * 500;
            j75 j75Var = (j75) ob3Var.getValue();
            int i8 = i - iW3;
            qp3 qp3Var = rf4VarO.y;
            qp3 qp3Var2 = rf4VarO.x;
            int iD = qp3Var.d();
            int iD2 = qp3Var2.d();
            int length4 = (j75Var == null || (i75Var = j75Var.g) == null || (cjVar = i75Var.g) == null) ? 0 : cjVar.t.length();
            float fQ = (j75Var == null || length4 == 0) ? 0.0f : xs2.q(j75Var.y(xs2.w(i8, 0, length4 - 1)).r - (iD / 2.0f), 0.0f, iD2);
            h02Var.U(-2128218123, Integer.valueOf(iW3));
            float fFloatValue = ((Number) ug.y(fQ, m50.e0(120, 0, dg1.r, 2), "TextSnippetScroll", h02Var, 3072, 20).getValue()).floatValue();
            h02Var.b(false);
            Float fValueOf = Float.valueOf(fFloatValue);
            Integer numValueOf = Integer.valueOf(qp3Var2.d());
            boolean zX = h02Var.x(rf4VarO) | h02Var.r(fFloatValue);
            Object objK3 = h02Var.K();
            if (zX || objK3 == obj) {
                objK3 = new do0(rf4VarO, fFloatValue, null, (byte) 2);
                h02Var.i0(objK3);
            }
            k33.s(fValueOf, numValueOf, (bz1) objK3, h02Var);
            uz4.g(mq4.r(g73.g, 1.0f), na4.y(8.0f), ((rj0) h02Var.a(tj0.g)).p, 0L, 0.0f, 0.0f, null, ue5.m0(-798433793, new mm4(rf4VarO, cjVar2, ob3Var, (byte) 3), h02Var), h02Var, 12582918, 120);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: b85
                @Override // defpackage.bz1
                public final Object l(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    int iJ = aq2.J(i2 | 1);
                    aq2.a(str, i, z, (h02) obj2, iJ);
                    return og5.g;
                }
            };
        }
    }

    public static final String b(int i, h02 h02Var) {
        h02Var.a(sa.g);
        return ((Context) h02Var.a(sa.y)).getResources().getString(i);
    }

    public static final gu2 c(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            gu2 gu2Var = tag instanceof gu2 ? (gu2) tag : null;
            if (gu2Var != null) {
                return gu2Var;
            }
            Object objS = sp2.s(view);
            view = objS instanceof View ? (View) objS : null;
        }
        return null;
    }

    public static qw3 d(String str, y22 y22Var, zg2 zg2Var, int i) {
        if ((i & 2) != 0) {
            y22Var = null;
        }
        xy1 xy1Var = zg2Var;
        if ((i & 4) != 0) {
            xy1Var = vg.B;
        }
        x21 x21Var = na1.g;
        c21 c21Var = c21.a;
        yy4 yy4VarV = v13.v();
        c21Var.getClass();
        return new qw3(str, y22Var, xy1Var, k33.x(a11.k(c21Var, yy4VarV)));
    }

    public static final ob3 e(bz1 bz1Var, h02 h02Var, Object obj) {
        Object objK = h02Var.K();
        l76 l76Var = oo0.g;
        if (objK == l76Var) {
            objK = kq2.M(obj);
            h02Var.i0(objK);
        }
        ob3 ob3Var = (ob3) objK;
        boolean zJ = h02Var.j(bz1Var);
        Object objK2 = h02Var.K();
        if (zJ || objK2 == l76Var) {
            objK2 = new qt4(bz1Var, ob3Var, null, (byte) 0);
            h02Var.i0(objK2);
        }
        k33.b((bz1) objK2, h02Var, og5.g);
        return ob3Var;
    }

    public static final i73 f(o41 o41Var, int i) {
        i73 i73Var = ((i73) o41Var).j.w;
        if (i73Var == null || (i73Var.m & i) == 0) {
            return null;
        }
        while (i73Var != null) {
            int i2 = i73Var.a;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return i73Var;
            }
            i73Var = i73Var.w;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0040  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:85:0x0103  */
    /* JADX WARN: Code duplicated, block: B:87:0x0109  */
    /* JADX WARN: Code duplicated, block: B:90:0x011a  */
    /* JADX WARN: Code duplicated, block: B:92:0x011e  */
    /* JADX WARN: Code duplicated, block: B:95:0x016c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0180  */
    public static final void g(j73 j73Var, ss2 ss2Var, zn3 zn3Var, ar arVar, r6 r6Var, bq1 bq1Var, boolean z, tb tbVar, xy1 xy1Var, h02 h02Var, int i, int i2) {
        j73 j73Var2;
        int i3;
        ss2 ss2VarG;
        int i4;
        int i5;
        zn3 bo3Var;
        int i6;
        int i7;
        ar arVar2;
        int i8;
        r6 r6Var2;
        int i9;
        int i10;
        int i11;
        boolean z2;
        tb tbVar2;
        j73 j73Var3;
        ss2 ss2Var2;
        zn3 zn3Var2;
        ar arVar3;
        r6 r6Var3;
        bq1 bq1Var2;
        boolean z3;
        u34 u34VarP;
        j73 j73Var4;
        c11 c11VarG;
        boolean zX;
        Object objK;
        ar arVar4;
        r6 r6Var4;
        int i12;
        bq1 bq1Var3;
        zn3 zn3Var3;
        tb tbVarY;
        boolean z4;
        h02Var.Z(53695811);
        int i13 = i2 & 1;
        if (i13 != 0) {
            i3 = i | 6;
            j73Var2 = j73Var;
        } else if ((i & 6) == 0) {
            j73Var2 = j73Var;
            i3 = (h02Var.x(j73Var2) ? 4 : 2) | i;
        } else {
            j73Var2 = j73Var;
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            ss2VarG = ss2Var;
            int i14 = h02Var.x(ss2VarG) ? 32 : 16;
            i4 = i3 | i14;
            i5 = i2 & 4;
            if (i5 != 0) {
                if ((i & 384) == 0) {
                    bo3Var = zn3Var;
                    if (h02Var.x(bo3Var)) {
                        i6 = 256;
                    } else {
                        i6 = 128;
                    }
                    i4 |= i6;
                }
                i7 = i4 | 3072;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        arVar2 = arVar;
                        int i15 = h02Var.x(arVar2) ? 16384 : 8192;
                        i7 |= i15;
                    } else {
                        arVar2 = arVar;
                    }
                    i7 |= i15;
                } else {
                    arVar2 = arVar;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        r6Var2 = r6Var;
                        if (h02Var.x(r6Var2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i7 |= i9;
                    }
                    int i16 = i7 | 46661632;
                    if (h02Var.j(xy1Var)) {
                        i10 = 536870912;
                    } else {
                        i10 = 268435456;
                    }
                    i11 = i16 | i10;
                    if ((306783379 & i11) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (h02Var.N(i11 & 1, z2)) {
                        h02Var.S();
                        if ((i & 1) != 0 || h02Var.k()) {
                            if (i13 != 0) {
                                j73Var4 = g73.g;
                            } else {
                                j73Var4 = j73Var2;
                            }
                            if ((i2 & 2) != 0) {
                                i11 &= -113;
                                ss2VarG = us2.g(h02Var);
                            }
                            if (i5 != 0) {
                                bo3Var = new bo3(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                            if ((i2 & 16) != 0) {
                                i11 &= -57345;
                                arVar2 = v70.n;
                            }
                            if (i8 != 0) {
                                r6Var2 = hi0.h;
                            }
                            c11VarG = vu4.g(h02Var);
                            zX = h02Var.x(c11VarG);
                            objK = h02Var.K();
                            if (zX || objK == oo0.g) {
                                objK = new t11(c11VarG);
                                h02Var.i0(objK);
                            }
                            t11 t11Var = (t11) objK;
                            arVar4 = arVar2;
                            r6Var4 = r6Var2;
                            i12 = i11 & (-238551041);
                            bq1Var3 = t11Var;
                            zn3Var3 = bo3Var;
                            tbVarY = ln3.y(h02Var);
                            z4 = true;
                        } else {
                            h02Var.Q();
                            if ((i2 & 2) != 0) {
                                i11 &= -113;
                            }
                            if ((i2 & 16) != 0) {
                                i11 &= -57345;
                            }
                            int i17 = i11 & (-238551041);
                            bq1Var3 = bq1Var;
                            z4 = z;
                            arVar4 = arVar2;
                            r6Var4 = r6Var2;
                            i12 = i17;
                            j73Var4 = j73Var2;
                            zn3Var3 = bo3Var;
                            tbVarY = tbVar;
                        }
                        h02Var.s();
                        j73 j73Var5 = j73Var4;
                        ss2 ss2Var3 = ss2VarG;
                        bq1 bq1Var4 = bq1Var3;
                        js2.y(j73Var5, ss2Var3, zn3Var3, true, bq1Var4, z4, tbVarY, r6Var4, arVar4, null, null, xy1Var, h02Var, ((i12 << 12) & 1879048192) | (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | 1575936, ((i12 >> 12) & 14) | ((i12 >> 18) & 7168), 6400);
                        tb tbVar3 = tbVarY;
                        bq1Var2 = bq1Var4;
                        arVar3 = arVar4;
                        tbVar2 = tbVar3;
                        r6 r6Var5 = r6Var4;
                        z3 = z4;
                        r6Var3 = r6Var5;
                        zn3Var2 = zn3Var3;
                        ss2Var2 = ss2Var3;
                        j73Var3 = j73Var5;
                    } else {
                        h02Var.Q();
                        tbVar2 = tbVar;
                        j73Var3 = j73Var2;
                        ss2Var2 = ss2VarG;
                        zn3Var2 = bo3Var;
                        arVar3 = arVar2;
                        r6Var3 = r6Var2;
                        bq1Var2 = bq1Var;
                        z3 = z;
                    }
                    u34VarP = h02Var.p();
                    if (u34VarP != null) {
                        u34VarP.n = new j90(j73Var3, ss2Var2, zn3Var2, arVar3, r6Var3, bq1Var2, z3, tbVar2, xy1Var, i, i2);
                    }
                }
                i7 |= 196608;
                r6Var2 = r6Var;
                int i18 = i7 | 46661632;
                if (h02Var.j(xy1Var)) {
                    i10 = 536870912;
                } else {
                    i10 = 268435456;
                }
                i11 = i18 | i10;
                if ((306783379 & i11) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (h02Var.N(i11 & 1, z2)) {
                    h02Var.S();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            j73Var4 = g73.g;
                        } else {
                            j73Var4 = j73Var2;
                        }
                        if ((i2 & 2) != 0) {
                            i11 &= -113;
                            ss2VarG = us2.g(h02Var);
                        }
                        if (i5 != 0) {
                            bo3Var = new bo3(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i11 &= -57345;
                            arVar2 = v70.n;
                        }
                        if (i8 != 0) {
                            r6Var2 = hi0.h;
                        }
                        c11VarG = vu4.g(h02Var);
                        zX = h02Var.x(c11VarG);
                        objK = h02Var.K();
                        if (zX) {
                            objK = new t11(c11VarG);
                            h02Var.i0(objK);
                        } else {
                            objK = new t11(c11VarG);
                            h02Var.i0(objK);
                        }
                        t11 t11Var2 = (t11) objK;
                        arVar4 = arVar2;
                        r6Var4 = r6Var2;
                        i12 = i11 & (-238551041);
                        bq1Var3 = t11Var2;
                        zn3Var3 = bo3Var;
                        tbVarY = ln3.y(h02Var);
                        z4 = true;
                    } else {
                        if (i13 != 0) {
                            j73Var4 = g73.g;
                        } else {
                            j73Var4 = j73Var2;
                        }
                        if ((i2 & 2) != 0) {
                            i11 &= -113;
                            ss2VarG = us2.g(h02Var);
                        }
                        if (i5 != 0) {
                            bo3Var = new bo3(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i11 &= -57345;
                            arVar2 = v70.n;
                        }
                        if (i8 != 0) {
                            r6Var2 = hi0.h;
                        }
                        c11VarG = vu4.g(h02Var);
                        zX = h02Var.x(c11VarG);
                        objK = h02Var.K();
                        if (zX) {
                            objK = new t11(c11VarG);
                            h02Var.i0(objK);
                        } else {
                            objK = new t11(c11VarG);
                            h02Var.i0(objK);
                        }
                        t11 t11Var3 = (t11) objK;
                        arVar4 = arVar2;
                        r6Var4 = r6Var2;
                        i12 = i11 & (-238551041);
                        bq1Var3 = t11Var3;
                        zn3Var3 = bo3Var;
                        tbVarY = ln3.y(h02Var);
                        z4 = true;
                    }
                    h02Var.s();
                    j73 j73Var6 = j73Var4;
                    ss2 ss2Var4 = ss2VarG;
                    bq1 bq1Var5 = bq1Var3;
                    js2.y(j73Var6, ss2Var4, zn3Var3, true, bq1Var5, z4, tbVarY, r6Var4, arVar4, null, null, xy1Var, h02Var, ((i12 << 12) & 1879048192) | (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | 1575936, ((i12 >> 12) & 14) | ((i12 >> 18) & 7168), 6400);
                    tb tbVar4 = tbVarY;
                    bq1Var2 = bq1Var5;
                    arVar3 = arVar4;
                    tbVar2 = tbVar4;
                    r6 r6Var6 = r6Var4;
                    z3 = z4;
                    r6Var3 = r6Var6;
                    zn3Var2 = zn3Var3;
                    ss2Var2 = ss2Var4;
                    j73Var3 = j73Var6;
                } else {
                    h02Var.Q();
                    tbVar2 = tbVar;
                    j73Var3 = j73Var2;
                    ss2Var2 = ss2VarG;
                    zn3Var2 = bo3Var;
                    arVar3 = arVar2;
                    r6Var3 = r6Var2;
                    bq1Var2 = bq1Var;
                    z3 = z;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new j90(j73Var3, ss2Var2, zn3Var2, arVar3, r6Var3, bq1Var2, z3, tbVar2, xy1Var, i, i2);
                }
            }
            i4 |= 384;
            bo3Var = zn3Var;
            i7 = i4 | 3072;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    arVar2 = arVar;
                    if (h02Var.x(arVar2)) {
                    }
                    i7 |= i15;
                } else {
                    arVar2 = arVar;
                }
                i7 |= i15;
            } else {
                arVar2 = arVar;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    r6Var2 = r6Var;
                    if (h02Var.x(r6Var2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i7 |= i9;
                }
                int i19 = i7 | 46661632;
                if (h02Var.j(xy1Var)) {
                    i10 = 536870912;
                } else {
                    i10 = 268435456;
                }
                i11 = i19 | i10;
                if ((306783379 & i11) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (h02Var.N(i11 & 1, z2)) {
                    h02Var.S();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            j73Var4 = g73.g;
                        } else {
                            j73Var4 = j73Var2;
                        }
                        if ((i2 & 2) != 0) {
                            i11 &= -113;
                            ss2VarG = us2.g(h02Var);
                        }
                        if (i5 != 0) {
                            bo3Var = new bo3(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i11 &= -57345;
                            arVar2 = v70.n;
                        }
                        if (i8 != 0) {
                            r6Var2 = hi0.h;
                        }
                        c11VarG = vu4.g(h02Var);
                        zX = h02Var.x(c11VarG);
                        objK = h02Var.K();
                        if (zX) {
                            objK = new t11(c11VarG);
                            h02Var.i0(objK);
                        } else {
                            objK = new t11(c11VarG);
                            h02Var.i0(objK);
                        }
                        t11 t11Var4 = (t11) objK;
                        arVar4 = arVar2;
                        r6Var4 = r6Var2;
                        i12 = i11 & (-238551041);
                        bq1Var3 = t11Var4;
                        zn3Var3 = bo3Var;
                        tbVarY = ln3.y(h02Var);
                        z4 = true;
                    } else {
                        if (i13 != 0) {
                            j73Var4 = g73.g;
                        } else {
                            j73Var4 = j73Var2;
                        }
                        if ((i2 & 2) != 0) {
                            i11 &= -113;
                            ss2VarG = us2.g(h02Var);
                        }
                        if (i5 != 0) {
                            bo3Var = new bo3(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i11 &= -57345;
                            arVar2 = v70.n;
                        }
                        if (i8 != 0) {
                            r6Var2 = hi0.h;
                        }
                        c11VarG = vu4.g(h02Var);
                        zX = h02Var.x(c11VarG);
                        objK = h02Var.K();
                        if (zX) {
                            objK = new t11(c11VarG);
                            h02Var.i0(objK);
                        } else {
                            objK = new t11(c11VarG);
                            h02Var.i0(objK);
                        }
                        t11 t11Var5 = (t11) objK;
                        arVar4 = arVar2;
                        r6Var4 = r6Var2;
                        i12 = i11 & (-238551041);
                        bq1Var3 = t11Var5;
                        zn3Var3 = bo3Var;
                        tbVarY = ln3.y(h02Var);
                        z4 = true;
                    }
                    h02Var.s();
                    j73 j73Var7 = j73Var4;
                    ss2 ss2Var5 = ss2VarG;
                    bq1 bq1Var6 = bq1Var3;
                    js2.y(j73Var7, ss2Var5, zn3Var3, true, bq1Var6, z4, tbVarY, r6Var4, arVar4, null, null, xy1Var, h02Var, ((i12 << 12) & 1879048192) | (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | 1575936, ((i12 >> 12) & 14) | ((i12 >> 18) & 7168), 6400);
                    tb tbVar5 = tbVarY;
                    bq1Var2 = bq1Var6;
                    arVar3 = arVar4;
                    tbVar2 = tbVar5;
                    r6 r6Var7 = r6Var4;
                    z3 = z4;
                    r6Var3 = r6Var7;
                    zn3Var2 = zn3Var3;
                    ss2Var2 = ss2Var5;
                    j73Var3 = j73Var7;
                } else {
                    h02Var.Q();
                    tbVar2 = tbVar;
                    j73Var3 = j73Var2;
                    ss2Var2 = ss2VarG;
                    zn3Var2 = bo3Var;
                    arVar3 = arVar2;
                    r6Var3 = r6Var2;
                    bq1Var2 = bq1Var;
                    z3 = z;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new j90(j73Var3, ss2Var2, zn3Var2, arVar3, r6Var3, bq1Var2, z3, tbVar2, xy1Var, i, i2);
                }
            }
            i7 |= 196608;
            r6Var2 = r6Var;
            int i110 = i7 | 46661632;
            if (h02Var.j(xy1Var)) {
                i10 = 536870912;
            } else {
                i10 = 268435456;
            }
            i11 = i110 | i10;
            if ((306783379 & i11) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (h02Var.N(i11 & 1, z2)) {
                h02Var.S();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        j73Var4 = g73.g;
                    } else {
                        j73Var4 = j73Var2;
                    }
                    if ((i2 & 2) != 0) {
                        i11 &= -113;
                        ss2VarG = us2.g(h02Var);
                    }
                    if (i5 != 0) {
                        bo3Var = new bo3(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i11 &= -57345;
                        arVar2 = v70.n;
                    }
                    if (i8 != 0) {
                        r6Var2 = hi0.h;
                    }
                    c11VarG = vu4.g(h02Var);
                    zX = h02Var.x(c11VarG);
                    objK = h02Var.K();
                    if (zX) {
                        objK = new t11(c11VarG);
                        h02Var.i0(objK);
                    } else {
                        objK = new t11(c11VarG);
                        h02Var.i0(objK);
                    }
                    t11 t11Var6 = (t11) objK;
                    arVar4 = arVar2;
                    r6Var4 = r6Var2;
                    i12 = i11 & (-238551041);
                    bq1Var3 = t11Var6;
                    zn3Var3 = bo3Var;
                    tbVarY = ln3.y(h02Var);
                    z4 = true;
                } else {
                    if (i13 != 0) {
                        j73Var4 = g73.g;
                    } else {
                        j73Var4 = j73Var2;
                    }
                    if ((i2 & 2) != 0) {
                        i11 &= -113;
                        ss2VarG = us2.g(h02Var);
                    }
                    if (i5 != 0) {
                        bo3Var = new bo3(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i11 &= -57345;
                        arVar2 = v70.n;
                    }
                    if (i8 != 0) {
                        r6Var2 = hi0.h;
                    }
                    c11VarG = vu4.g(h02Var);
                    zX = h02Var.x(c11VarG);
                    objK = h02Var.K();
                    if (zX) {
                        objK = new t11(c11VarG);
                        h02Var.i0(objK);
                    } else {
                        objK = new t11(c11VarG);
                        h02Var.i0(objK);
                    }
                    t11 t11Var7 = (t11) objK;
                    arVar4 = arVar2;
                    r6Var4 = r6Var2;
                    i12 = i11 & (-238551041);
                    bq1Var3 = t11Var7;
                    zn3Var3 = bo3Var;
                    tbVarY = ln3.y(h02Var);
                    z4 = true;
                }
                h02Var.s();
                j73 j73Var8 = j73Var4;
                ss2 ss2Var6 = ss2VarG;
                bq1 bq1Var7 = bq1Var3;
                js2.y(j73Var8, ss2Var6, zn3Var3, true, bq1Var7, z4, tbVarY, r6Var4, arVar4, null, null, xy1Var, h02Var, ((i12 << 12) & 1879048192) | (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | 1575936, ((i12 >> 12) & 14) | ((i12 >> 18) & 7168), 6400);
                tb tbVar6 = tbVarY;
                bq1Var2 = bq1Var7;
                arVar3 = arVar4;
                tbVar2 = tbVar6;
                r6 r6Var8 = r6Var4;
                z3 = z4;
                r6Var3 = r6Var8;
                zn3Var2 = zn3Var3;
                ss2Var2 = ss2Var6;
                j73Var3 = j73Var8;
            } else {
                h02Var.Q();
                tbVar2 = tbVar;
                j73Var3 = j73Var2;
                ss2Var2 = ss2VarG;
                zn3Var2 = bo3Var;
                arVar3 = arVar2;
                r6Var3 = r6Var2;
                bq1Var2 = bq1Var;
                z3 = z;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new j90(j73Var3, ss2Var2, zn3Var2, arVar3, r6Var3, bq1Var2, z3, tbVar2, xy1Var, i, i2);
            }
        }
        ss2VarG = ss2Var;
        i4 = i3 | i14;
        i5 = i2 & 4;
        if (i5 != 0) {
            if ((i & 384) == 0) {
                bo3Var = zn3Var;
                if (h02Var.x(bo3Var)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            i7 = i4 | 3072;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    arVar2 = arVar;
                    if (h02Var.x(arVar2)) {
                    }
                    i7 |= i15;
                } else {
                    arVar2 = arVar;
                }
                i7 |= i15;
            } else {
                arVar2 = arVar;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    r6Var2 = r6Var;
                    if (h02Var.x(r6Var2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i7 |= i9;
                }
                int i111 = i7 | 46661632;
                if (h02Var.j(xy1Var)) {
                    i10 = 536870912;
                } else {
                    i10 = 268435456;
                }
                i11 = i111 | i10;
                if ((306783379 & i11) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (h02Var.N(i11 & 1, z2)) {
                    h02Var.S();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            j73Var4 = g73.g;
                        } else {
                            j73Var4 = j73Var2;
                        }
                        if ((i2 & 2) != 0) {
                            i11 &= -113;
                            ss2VarG = us2.g(h02Var);
                        }
                        if (i5 != 0) {
                            bo3Var = new bo3(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i11 &= -57345;
                            arVar2 = v70.n;
                        }
                        if (i8 != 0) {
                            r6Var2 = hi0.h;
                        }
                        c11VarG = vu4.g(h02Var);
                        zX = h02Var.x(c11VarG);
                        objK = h02Var.K();
                        if (zX) {
                            objK = new t11(c11VarG);
                            h02Var.i0(objK);
                        } else {
                            objK = new t11(c11VarG);
                            h02Var.i0(objK);
                        }
                        t11 t11Var8 = (t11) objK;
                        arVar4 = arVar2;
                        r6Var4 = r6Var2;
                        i12 = i11 & (-238551041);
                        bq1Var3 = t11Var8;
                        zn3Var3 = bo3Var;
                        tbVarY = ln3.y(h02Var);
                        z4 = true;
                    } else {
                        if (i13 != 0) {
                            j73Var4 = g73.g;
                        } else {
                            j73Var4 = j73Var2;
                        }
                        if ((i2 & 2) != 0) {
                            i11 &= -113;
                            ss2VarG = us2.g(h02Var);
                        }
                        if (i5 != 0) {
                            bo3Var = new bo3(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i11 &= -57345;
                            arVar2 = v70.n;
                        }
                        if (i8 != 0) {
                            r6Var2 = hi0.h;
                        }
                        c11VarG = vu4.g(h02Var);
                        zX = h02Var.x(c11VarG);
                        objK = h02Var.K();
                        if (zX) {
                            objK = new t11(c11VarG);
                            h02Var.i0(objK);
                        } else {
                            objK = new t11(c11VarG);
                            h02Var.i0(objK);
                        }
                        t11 t11Var9 = (t11) objK;
                        arVar4 = arVar2;
                        r6Var4 = r6Var2;
                        i12 = i11 & (-238551041);
                        bq1Var3 = t11Var9;
                        zn3Var3 = bo3Var;
                        tbVarY = ln3.y(h02Var);
                        z4 = true;
                    }
                    h02Var.s();
                    j73 j73Var9 = j73Var4;
                    ss2 ss2Var7 = ss2VarG;
                    bq1 bq1Var8 = bq1Var3;
                    js2.y(j73Var9, ss2Var7, zn3Var3, true, bq1Var8, z4, tbVarY, r6Var4, arVar4, null, null, xy1Var, h02Var, ((i12 << 12) & 1879048192) | (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | 1575936, ((i12 >> 12) & 14) | ((i12 >> 18) & 7168), 6400);
                    tb tbVar7 = tbVarY;
                    bq1Var2 = bq1Var8;
                    arVar3 = arVar4;
                    tbVar2 = tbVar7;
                    r6 r6Var9 = r6Var4;
                    z3 = z4;
                    r6Var3 = r6Var9;
                    zn3Var2 = zn3Var3;
                    ss2Var2 = ss2Var7;
                    j73Var3 = j73Var9;
                } else {
                    h02Var.Q();
                    tbVar2 = tbVar;
                    j73Var3 = j73Var2;
                    ss2Var2 = ss2VarG;
                    zn3Var2 = bo3Var;
                    arVar3 = arVar2;
                    r6Var3 = r6Var2;
                    bq1Var2 = bq1Var;
                    z3 = z;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new j90(j73Var3, ss2Var2, zn3Var2, arVar3, r6Var3, bq1Var2, z3, tbVar2, xy1Var, i, i2);
                }
            }
            i7 |= 196608;
            r6Var2 = r6Var;
            int i112 = i7 | 46661632;
            if (h02Var.j(xy1Var)) {
                i10 = 536870912;
            } else {
                i10 = 268435456;
            }
            i11 = i112 | i10;
            if ((306783379 & i11) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (h02Var.N(i11 & 1, z2)) {
                h02Var.S();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        j73Var4 = g73.g;
                    } else {
                        j73Var4 = j73Var2;
                    }
                    if ((i2 & 2) != 0) {
                        i11 &= -113;
                        ss2VarG = us2.g(h02Var);
                    }
                    if (i5 != 0) {
                        bo3Var = new bo3(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i11 &= -57345;
                        arVar2 = v70.n;
                    }
                    if (i8 != 0) {
                        r6Var2 = hi0.h;
                    }
                    c11VarG = vu4.g(h02Var);
                    zX = h02Var.x(c11VarG);
                    objK = h02Var.K();
                    if (zX) {
                        objK = new t11(c11VarG);
                        h02Var.i0(objK);
                    } else {
                        objK = new t11(c11VarG);
                        h02Var.i0(objK);
                    }
                    t11 t11Var10 = (t11) objK;
                    arVar4 = arVar2;
                    r6Var4 = r6Var2;
                    i12 = i11 & (-238551041);
                    bq1Var3 = t11Var10;
                    zn3Var3 = bo3Var;
                    tbVarY = ln3.y(h02Var);
                    z4 = true;
                } else {
                    if (i13 != 0) {
                        j73Var4 = g73.g;
                    } else {
                        j73Var4 = j73Var2;
                    }
                    if ((i2 & 2) != 0) {
                        i11 &= -113;
                        ss2VarG = us2.g(h02Var);
                    }
                    if (i5 != 0) {
                        bo3Var = new bo3(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i11 &= -57345;
                        arVar2 = v70.n;
                    }
                    if (i8 != 0) {
                        r6Var2 = hi0.h;
                    }
                    c11VarG = vu4.g(h02Var);
                    zX = h02Var.x(c11VarG);
                    objK = h02Var.K();
                    if (zX) {
                        objK = new t11(c11VarG);
                        h02Var.i0(objK);
                    } else {
                        objK = new t11(c11VarG);
                        h02Var.i0(objK);
                    }
                    t11 t11Var11 = (t11) objK;
                    arVar4 = arVar2;
                    r6Var4 = r6Var2;
                    i12 = i11 & (-238551041);
                    bq1Var3 = t11Var11;
                    zn3Var3 = bo3Var;
                    tbVarY = ln3.y(h02Var);
                    z4 = true;
                }
                h02Var.s();
                j73 j73Var10 = j73Var4;
                ss2 ss2Var8 = ss2VarG;
                bq1 bq1Var9 = bq1Var3;
                js2.y(j73Var10, ss2Var8, zn3Var3, true, bq1Var9, z4, tbVarY, r6Var4, arVar4, null, null, xy1Var, h02Var, ((i12 << 12) & 1879048192) | (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | 1575936, ((i12 >> 12) & 14) | ((i12 >> 18) & 7168), 6400);
                tb tbVar8 = tbVarY;
                bq1Var2 = bq1Var9;
                arVar3 = arVar4;
                tbVar2 = tbVar8;
                r6 r6Var10 = r6Var4;
                z3 = z4;
                r6Var3 = r6Var10;
                zn3Var2 = zn3Var3;
                ss2Var2 = ss2Var8;
                j73Var3 = j73Var10;
            } else {
                h02Var.Q();
                tbVar2 = tbVar;
                j73Var3 = j73Var2;
                ss2Var2 = ss2VarG;
                zn3Var2 = bo3Var;
                arVar3 = arVar2;
                r6Var3 = r6Var2;
                bq1Var2 = bq1Var;
                z3 = z;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new j90(j73Var3, ss2Var2, zn3Var2, arVar3, r6Var3, bq1Var2, z3, tbVar2, xy1Var, i, i2);
            }
        }
        i4 |= 384;
        bo3Var = zn3Var;
        i7 = i4 | 3072;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                arVar2 = arVar;
                if (h02Var.x(arVar2)) {
                }
                i7 |= i15;
            } else {
                arVar2 = arVar;
            }
            i7 |= i15;
        } else {
            arVar2 = arVar;
        }
        i8 = i2 & 32;
        if (i8 != 0) {
            if ((196608 & i) == 0) {
                r6Var2 = r6Var;
                if (h02Var.x(r6Var2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i7 |= i9;
            }
            int i113 = i7 | 46661632;
            if (h02Var.j(xy1Var)) {
                i10 = 536870912;
            } else {
                i10 = 268435456;
            }
            i11 = i113 | i10;
            if ((306783379 & i11) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (h02Var.N(i11 & 1, z2)) {
                h02Var.S();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        j73Var4 = g73.g;
                    } else {
                        j73Var4 = j73Var2;
                    }
                    if ((i2 & 2) != 0) {
                        i11 &= -113;
                        ss2VarG = us2.g(h02Var);
                    }
                    if (i5 != 0) {
                        bo3Var = new bo3(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i11 &= -57345;
                        arVar2 = v70.n;
                    }
                    if (i8 != 0) {
                        r6Var2 = hi0.h;
                    }
                    c11VarG = vu4.g(h02Var);
                    zX = h02Var.x(c11VarG);
                    objK = h02Var.K();
                    if (zX) {
                        objK = new t11(c11VarG);
                        h02Var.i0(objK);
                    } else {
                        objK = new t11(c11VarG);
                        h02Var.i0(objK);
                    }
                    t11 t11Var12 = (t11) objK;
                    arVar4 = arVar2;
                    r6Var4 = r6Var2;
                    i12 = i11 & (-238551041);
                    bq1Var3 = t11Var12;
                    zn3Var3 = bo3Var;
                    tbVarY = ln3.y(h02Var);
                    z4 = true;
                } else {
                    if (i13 != 0) {
                        j73Var4 = g73.g;
                    } else {
                        j73Var4 = j73Var2;
                    }
                    if ((i2 & 2) != 0) {
                        i11 &= -113;
                        ss2VarG = us2.g(h02Var);
                    }
                    if (i5 != 0) {
                        bo3Var = new bo3(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i11 &= -57345;
                        arVar2 = v70.n;
                    }
                    if (i8 != 0) {
                        r6Var2 = hi0.h;
                    }
                    c11VarG = vu4.g(h02Var);
                    zX = h02Var.x(c11VarG);
                    objK = h02Var.K();
                    if (zX) {
                        objK = new t11(c11VarG);
                        h02Var.i0(objK);
                    } else {
                        objK = new t11(c11VarG);
                        h02Var.i0(objK);
                    }
                    t11 t11Var13 = (t11) objK;
                    arVar4 = arVar2;
                    r6Var4 = r6Var2;
                    i12 = i11 & (-238551041);
                    bq1Var3 = t11Var13;
                    zn3Var3 = bo3Var;
                    tbVarY = ln3.y(h02Var);
                    z4 = true;
                }
                h02Var.s();
                j73 j73Var11 = j73Var4;
                ss2 ss2Var9 = ss2VarG;
                bq1 bq1Var10 = bq1Var3;
                js2.y(j73Var11, ss2Var9, zn3Var3, true, bq1Var10, z4, tbVarY, r6Var4, arVar4, null, null, xy1Var, h02Var, ((i12 << 12) & 1879048192) | (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | 1575936, ((i12 >> 12) & 14) | ((i12 >> 18) & 7168), 6400);
                tb tbVar9 = tbVarY;
                bq1Var2 = bq1Var10;
                arVar3 = arVar4;
                tbVar2 = tbVar9;
                r6 r6Var11 = r6Var4;
                z3 = z4;
                r6Var3 = r6Var11;
                zn3Var2 = zn3Var3;
                ss2Var2 = ss2Var9;
                j73Var3 = j73Var11;
            } else {
                h02Var.Q();
                tbVar2 = tbVar;
                j73Var3 = j73Var2;
                ss2Var2 = ss2VarG;
                zn3Var2 = bo3Var;
                arVar3 = arVar2;
                r6Var3 = r6Var2;
                bq1Var2 = bq1Var;
                z3 = z;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new j90(j73Var3, ss2Var2, zn3Var2, arVar3, r6Var3, bq1Var2, z3, tbVar2, xy1Var, i, i2);
            }
        }
        i7 |= 196608;
        r6Var2 = r6Var;
        int i114 = i7 | 46661632;
        if (h02Var.j(xy1Var)) {
            i10 = 536870912;
        } else {
            i10 = 268435456;
        }
        i11 = i114 | i10;
        if ((306783379 & i11) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (h02Var.N(i11 & 1, z2)) {
            h02Var.S();
            if ((i & 1) != 0) {
                if (i13 != 0) {
                    j73Var4 = g73.g;
                } else {
                    j73Var4 = j73Var2;
                }
                if ((i2 & 2) != 0) {
                    i11 &= -113;
                    ss2VarG = us2.g(h02Var);
                }
                if (i5 != 0) {
                    bo3Var = new bo3(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if ((i2 & 16) != 0) {
                    i11 &= -57345;
                    arVar2 = v70.n;
                }
                if (i8 != 0) {
                    r6Var2 = hi0.h;
                }
                c11VarG = vu4.g(h02Var);
                zX = h02Var.x(c11VarG);
                objK = h02Var.K();
                if (zX) {
                    objK = new t11(c11VarG);
                    h02Var.i0(objK);
                } else {
                    objK = new t11(c11VarG);
                    h02Var.i0(objK);
                }
                t11 t11Var14 = (t11) objK;
                arVar4 = arVar2;
                r6Var4 = r6Var2;
                i12 = i11 & (-238551041);
                bq1Var3 = t11Var14;
                zn3Var3 = bo3Var;
                tbVarY = ln3.y(h02Var);
                z4 = true;
            } else {
                if (i13 != 0) {
                    j73Var4 = g73.g;
                } else {
                    j73Var4 = j73Var2;
                }
                if ((i2 & 2) != 0) {
                    i11 &= -113;
                    ss2VarG = us2.g(h02Var);
                }
                if (i5 != 0) {
                    bo3Var = new bo3(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if ((i2 & 16) != 0) {
                    i11 &= -57345;
                    arVar2 = v70.n;
                }
                if (i8 != 0) {
                    r6Var2 = hi0.h;
                }
                c11VarG = vu4.g(h02Var);
                zX = h02Var.x(c11VarG);
                objK = h02Var.K();
                if (zX) {
                    objK = new t11(c11VarG);
                    h02Var.i0(objK);
                } else {
                    objK = new t11(c11VarG);
                    h02Var.i0(objK);
                }
                t11 t11Var15 = (t11) objK;
                arVar4 = arVar2;
                r6Var4 = r6Var2;
                i12 = i11 & (-238551041);
                bq1Var3 = t11Var15;
                zn3Var3 = bo3Var;
                tbVarY = ln3.y(h02Var);
                z4 = true;
            }
            h02Var.s();
            j73 j73Var12 = j73Var4;
            ss2 ss2Var10 = ss2VarG;
            bq1 bq1Var11 = bq1Var3;
            js2.y(j73Var12, ss2Var10, zn3Var3, true, bq1Var11, z4, tbVarY, r6Var4, arVar4, null, null, xy1Var, h02Var, ((i12 << 12) & 1879048192) | (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | 1575936, ((i12 >> 12) & 14) | ((i12 >> 18) & 7168), 6400);
            tb tbVar10 = tbVarY;
            bq1Var2 = bq1Var11;
            arVar3 = arVar4;
            tbVar2 = tbVar10;
            r6 r6Var12 = r6Var4;
            z3 = z4;
            r6Var3 = r6Var12;
            zn3Var2 = zn3Var3;
            ss2Var2 = ss2Var10;
            j73Var3 = j73Var12;
        } else {
            h02Var.Q();
            tbVar2 = tbVar;
            j73Var3 = j73Var2;
            ss2Var2 = ss2VarG;
            zn3Var2 = bo3Var;
            arVar3 = arVar2;
            r6Var3 = r6Var2;
            bq1Var2 = bq1Var;
            z3 = z;
        }
        u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new j90(j73Var3, ss2Var2, zn3Var2, arVar3, r6Var3, bq1Var2, z3, tbVar2, xy1Var, i, i2);
        }
    }

    public static final boolean h(um2 um2Var) {
        int iOrdinal = um2Var.N.n.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            uo1.g();
                            return false;
                        }
                        um2 um2VarO = um2Var.o();
                        if (um2VarO != null) {
                            return h(um2VarO);
                        }
                        l0.u("no parent for idle node");
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final ArrayList i(rf2 rf2Var) {
        rf2Var.getClass();
        um2 um2VarE0 = ((zy2) rf2Var).E0();
        boolean zH = h(um2VarE0);
        qb3 qb3Var = (qb3) um2VarE0.b();
        rb3 rb3Var = qb3Var.j;
        ArrayList arrayList = new ArrayList(rb3Var.a);
        int i = rb3Var.a;
        for (int i2 = 0; i2 < i; i2++) {
            um2 um2Var = (um2) qb3Var.get(i2);
            arrayList.add(zH ? um2Var.w() : um2Var.c());
        }
        return arrayList;
    }

    public static final void j(qr0 qr0Var, wm4 wm4Var, h02 h02Var, int i) {
        qr0Var.getClass();
        wm4Var.getClass();
        h02Var.Z(1516600612);
        int i2 = (h02Var.j(qr0Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= h02Var.j(wm4Var) ? 32 : 16;
        }
        byte b = 1;
        byte b2 = 0;
        if (h02Var.N(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) h02Var.a(sa.y);
            ob3 ob3VarJ = v13.j(wm4Var.l, h02Var);
            boolean zBooleanValue = ((Boolean) wm4Var.z.getValue()).booleanValue();
            ql4 ql4Var = (ql4) ob3VarJ.getValue();
            Object obj = oo0.g;
            mu0 mu0Var = null;
            if (ql4Var == null) {
                h02Var.X(-2006819422);
                h02Var.b(false);
            } else {
                h02Var.X(-2006819421);
                Boolean boolValueOf = Boolean.valueOf(ql4Var.z);
                boolean zJ = h02Var.j(context) | h02Var.j(ql4Var);
                Object objK = h02Var.K();
                if (zJ || objK == obj) {
                    objK = new v03(context, ql4Var, mu0Var, b2);
                    h02Var.i0(objK);
                }
                k33.s(context, boolValueOf, (bz1) objK, h02Var);
                Boolean boolValueOf2 = Boolean.valueOf(ql4Var.h);
                boolean zJ2 = h02Var.j(context) | h02Var.j(ql4Var);
                Object objK2 = h02Var.K();
                if (zJ2 || objK2 == obj) {
                    objK2 = new v03(context, ql4Var, mu0Var, b);
                    h02Var.i0(objK2);
                }
                k33.s(context, boolValueOf2, (bz1) objK2, h02Var);
                Boolean boolValueOf3 = Boolean.valueOf(ql4Var.u);
                boolean zJ3 = h02Var.j(ql4Var) | h02Var.j(context);
                Object objK3 = h02Var.K();
                byte b3 = 11;
                if (zJ3 || objK3 == obj) {
                    objK3 = new xf(ql4Var, context, b3);
                    h02Var.i0(objK3);
                }
                k33.j(boolValueOf3, (xy1) objK3, h02Var);
                String str = ql4Var.p;
                boolean zJ4 = ((i2 & 14) == 4 || h02Var.j(qr0Var)) | h02Var.j(ql4Var);
                Object objK4 = h02Var.K();
                if (zJ4 || objK4 == obj) {
                    objK4 = new ko(qr0Var, ql4Var, mu0Var, b3);
                    h02Var.i0(objK4);
                }
                k33.b((bz1) objK4, h02Var, str);
                h02Var.b(false);
            }
            if (zBooleanValue) {
                h02Var.X(-2006212782);
                Boolean bool = Boolean.TRUE;
                boolean zJ5 = h02Var.j(context) | ((i2 & 112) == 32 || h02Var.j(wm4Var));
                Object objK5 = h02Var.K();
                if (zJ5 || objK5 == obj) {
                    objK5 = new mt((Object) wm4Var, (Object) context, mu0Var, (byte) 12);
                    h02Var.i0(objK5);
                }
                k33.b((bz1) objK5, h02Var, bool);
                h02Var.b(false);
            } else {
                h02Var.X(-2006078242);
                h02Var.b(false);
            }
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new r03(b2, i, qr0Var, wm4Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:140:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:159:0x0439  */
    /* JADX WARN: Code duplicated, block: B:160:0x043e  */
    /* JADX WARN: Code duplicated, block: B:166:0x045a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:167:0x045c  */
    /* JADX WARN: Code duplicated, block: B:169:0x0463  */
    /* JADX WARN: Code duplicated, block: B:176:0x047c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:177:0x047e  */
    /* JADX WARN: Code duplicated, block: B:179:0x0485  */
    /* JADX WARN: Code duplicated, block: B:182:0x0495  */
    /* JADX WARN: Code duplicated, block: B:183:0x0498  */
    /* JADX WARN: Code duplicated, block: B:186:0x049e  */
    public static final cp3 k(int i, h02 h02Var) throws XmlPullParserException, IOException {
        TypedValue typedValue;
        long jN;
        int i2;
        int i3;
        byte b;
        int i4;
        int i5;
        int i6;
        bm bmVarS;
        int i7;
        Shader shader;
        z60 cu4Var;
        z60 z60Var;
        Shader shader2;
        z60 cu4Var2;
        z60 z60Var2;
        int i8;
        int i9;
        Context context = (Context) h02Var.a(sa.y);
        Resources resources = (Resources) h02Var.a(sa.r);
        q74 q74Var = (q74) h02Var.a(sa.v);
        synchronized (q74Var) {
            typedValue = (TypedValue) q74Var.g.y(i);
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i, typedValue, true);
                ha3 ha3Var = q74Var.g;
                int iN = ha3Var.n(i);
                Object[] objArr = ha3Var.r;
                Object obj = objArr[iN];
                ha3Var.y[iN] = i;
                objArr[iN] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        boolean z = false;
        if (charSequence == null || !tx4.S(charSequence, ".xml")) {
            h02Var.X(-1771643000);
            boolean zX = h02Var.x(context.getTheme()) | h02Var.x(charSequence) | h02Var.n(i);
            Object objK = h02Var.K();
            if (zX || objK == oo0.g) {
                try {
                    objK = kh6.v(resources, i);
                    h02Var.i0(objK);
                } catch (Exception e) {
                    throw new il0("Error attempting to load resource: " + ((Object) charSequence), e);
                }
            }
            c30 c30Var = new c30((nc) objK);
            h02Var.b(false);
            return c30Var;
        }
        h02Var.X(-1771798434);
        Resources.Theme theme = context.getTheme();
        int i10 = typedValue.changingConfigurations;
        ka2 ka2Var = (ka2) h02Var.a(sa.n);
        ja2 ja2Var = new ja2(theme, i);
        WeakReference weakReference = (WeakReference) ka2Var.g.get(ja2Var);
        ia2 ia2Var = weakReference != null ? (ia2) weakReference.get() : null;
        if (ia2Var == null) {
            XmlResourceParser xml = resources.getXml(i);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!yf2.p(xml.getName(), "vector")) {
                l0.u("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                return null;
            }
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            sf sfVar = new sf();
            sfVar.n = xml;
            sfVar.g = 0;
            q64 q64Var = new q64((byte) 28, z);
            q64Var.t = new float[64];
            sfVar.v = q64Var;
            TypedArray typedArrayO = xq2.o(resources, theme, attributeSetAsAttributeSet, a11.g);
            sfVar.n(typedArrayO.getChangingConfigurations());
            boolean z2 = !xq2.p(xml, "autoMirrored") ? false : typedArrayO.getBoolean(5, false);
            sfVar.n(typedArrayO.getChangingConfigurations());
            float fY = sfVar.y(typedArrayO, "viewportWidth", 7, 0.0f);
            float fY2 = sfVar.y(typedArrayO, "viewportHeight", 8, 0.0f);
            if (fY <= 0.0f) {
                throw new XmlPullParserException(typedArrayO.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
            }
            if (fY2 <= 0.0f) {
                throw new XmlPullParserException(typedArrayO.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
            }
            float dimension = typedArrayO.getDimension(3, 0.0f);
            sfVar.n(typedArrayO.getChangingConfigurations());
            float dimension2 = typedArrayO.getDimension(2, 0.0f);
            sfVar.n(typedArrayO.getChangingConfigurations());
            if (typedArrayO.hasValue(1)) {
                TypedValue typedValue2 = new TypedValue();
                typedArrayO.getValue(1, typedValue2);
                if (typedValue2.type == 2) {
                    jN = jj0.j;
                } else {
                    ColorStateList colorStateListB = xq2.b(typedArrayO, xml, theme);
                    sfVar.n(typedArrayO.getChangingConfigurations());
                    jN = colorStateListB != null ? ra.n(colorStateListB.getDefaultColor()) : jj0.j;
                }
            } else {
                jN = jj0.j;
            }
            long j = jN;
            int i11 = typedArrayO.getInt(6, -1);
            sfVar.n(typedArrayO.getChangingConfigurations());
            if (i11 == -1) {
                i2 = 5;
            } else if (i11 == 3) {
                i2 = 3;
            } else if (i11 == 5) {
                i2 = 5;
            } else if (i11 != 9) {
                switch (i11) {
                    case 14:
                        i2 = 13;
                        break;
                    case kq2.x /* 15 */:
                        i2 = 14;
                        break;
                    case 16:
                        i2 = 12;
                        break;
                    default:
                        i2 = 5;
                        break;
                }
            } else {
                i2 = 9;
            }
            float f = dimension / resources.getDisplayMetrics().density;
            float f2 = dimension2 / resources.getDisplayMetrics().density;
            typedArrayO.recycle();
            ga2 ga2Var = new ga2(null, f, f2, fY, fY2, j, i2, z2, 1);
            int i12 = 0;
            for (int i13 = 3; xml.getEventType() != 1 && (xml.getDepth() >= 1 || xml.getEventType() != i13); i13 = i4) {
                List listJ = pi1.j;
                XmlPullParser xmlPullParser = (XmlPullParser) sfVar.n;
                q64 q64Var2 = (q64) sfVar.v;
                XmlResourceParser xmlResourceParser = xml;
                int eventType = xmlPullParser.getEventType();
                int i14 = i10;
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (name != null) {
                        int iHashCode = name.hashCode();
                        if (iHashCode != -1649314686) {
                            i3 = i12;
                            if (iHashCode != 3433509) {
                                if (iHashCode == 98629247 && name.equals("group")) {
                                    TypedArray typedArrayO2 = xq2.o(resources, theme, attributeSetAsAttributeSet, a11.y);
                                    sfVar.n(typedArrayO2.getChangingConfigurations());
                                    float fY3 = sfVar.y(typedArrayO2, "rotation", 5, 0.0f);
                                    float f3 = typedArrayO2.getFloat(1, 0.0f);
                                    sfVar.n(typedArrayO2.getChangingConfigurations());
                                    float f4 = typedArrayO2.getFloat(2, 0.0f);
                                    sfVar.n(typedArrayO2.getChangingConfigurations());
                                    float fY4 = sfVar.y(typedArrayO2, "scaleX", 3, 1.0f);
                                    float fY5 = sfVar.y(typedArrayO2, "scaleY", 4, 1.0f);
                                    float fY6 = sfVar.y(typedArrayO2, "translateX", 6, 0.0f);
                                    float fY7 = sfVar.y(typedArrayO2, "translateY", 7, 0.0f);
                                    String string = typedArrayO2.getString(0);
                                    sfVar.n(typedArrayO2.getChangingConfigurations());
                                    String str = string == null ? "" : string;
                                    typedArrayO2.recycle();
                                    int i15 = fj5.g;
                                    if (ga2Var.m) {
                                        mc2.y("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    ga2Var.t.add(new fa2(str, fY3, f3, f4, fY4, fY5, fY6, fY7, listJ, 512));
                                    int[] iArrCopyOf = sfVar.y;
                                    if (iArrCopyOf == null) {
                                        iArrCopyOf = new int[4];
                                        sfVar.y = iArrCopyOf;
                                    } else if (sfVar.r >= iArrCopyOf.length) {
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
                                        sfVar.y = iArrCopyOf;
                                    }
                                    int i16 = sfVar.r;
                                    sfVar.r = i16 + 1;
                                    iArrCopyOf[i16] = i3;
                                    i12 = 0;
                                    b = -1;
                                    i4 = 3;
                                }
                            } else if (name.equals("path")) {
                                TypedArray typedArrayO3 = xq2.o(resources, theme, attributeSetAsAttributeSet, a11.r);
                                sfVar.n(typedArrayO3.getChangingConfigurations());
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                    l0.u("No path data available");
                                    return null;
                                }
                                String string2 = typedArrayO3.getString(0);
                                sfVar.n(typedArrayO3.getChangingConfigurations());
                                String str2 = string2 == null ? "" : string2;
                                String string3 = typedArrayO3.getString(2);
                                sfVar.n(typedArrayO3.getChangingConfigurations());
                                if (string3 == null) {
                                    int i17 = fj5.g;
                                } else {
                                    listJ = q64.j(q64Var2, string3);
                                }
                                List list = listJ;
                                bm bmVarS2 = xq2.s(typedArrayO3, (XmlPullParser) sfVar.n, theme, "fillColor", 1);
                                sfVar.n(typedArrayO3.getChangingConfigurations());
                                float fY8 = sfVar.y(typedArrayO3, "fillAlpha", 12, 1.0f);
                                int i18 = !xq2.p((XmlPullParser) sfVar.n, "strokeLineCap") ? -1 : typedArrayO3.getInt(8, -1);
                                sfVar.n(typedArrayO3.getChangingConfigurations());
                                if (i18 == 0) {
                                    i5 = 0;
                                } else if (i18 == 1) {
                                    i5 = 1;
                                } else if (i18 != 2) {
                                    i5 = 0;
                                } else {
                                    i5 = 2;
                                }
                                int i19 = !xq2.p((XmlPullParser) sfVar.n, "strokeLineJoin") ? -1 : typedArrayO3.getInt(9, -1);
                                sfVar.n(typedArrayO3.getChangingConfigurations());
                                if (i19 != 0) {
                                    if (i19 == 1) {
                                        i6 = 1;
                                    } else if (i19 == 2) {
                                        i6 = 2;
                                    }
                                    float fY9 = sfVar.y(typedArrayO3, "strokeMiterLimit", 10, 4.0f);
                                    bmVarS = xq2.s(typedArrayO3, (XmlPullParser) sfVar.n, theme, "strokeColor", 3);
                                    sfVar.n(typedArrayO3.getChangingConfigurations());
                                    float fY10 = sfVar.y(typedArrayO3, "strokeAlpha", 11, 1.0f);
                                    float fY11 = sfVar.y(typedArrayO3, "strokeWidth", 4, 1.0f);
                                    float fY12 = sfVar.y(typedArrayO3, "trimPathEnd", 6, 1.0f);
                                    float fY13 = sfVar.y(typedArrayO3, "trimPathOffset", 7, 0.0f);
                                    float fY14 = sfVar.y(typedArrayO3, "trimPathStart", 5, 0.0f);
                                    if (xq2.p((XmlPullParser) sfVar.n, "fillType")) {
                                        i7 = typedArrayO3.getInt(13, 0);
                                    } else {
                                        i7 = 0;
                                    }
                                    sfVar.n(typedArrayO3.getChangingConfigurations());
                                    typedArrayO3.recycle();
                                    shader = (Shader) bmVarS2.y;
                                    if (shader != null && bmVarS2.g == 0) {
                                        z60Var = null;
                                    } else {
                                        if (shader != null) {
                                            cu4Var = mz5.g(shader);
                                        } else {
                                            cu4Var = new cu4(ra.n(bmVarS2.g));
                                        }
                                        z60Var = cu4Var;
                                    }
                                    shader2 = (Shader) bmVarS.y;
                                    if (shader2 != null && bmVarS.g == 0) {
                                        z60Var2 = null;
                                    } else {
                                        if (shader2 != null) {
                                            cu4Var2 = mz5.g(shader2);
                                        } else {
                                            cu4Var2 = new cu4(ra.n(bmVarS.g));
                                        }
                                        z60Var2 = cu4Var2;
                                    }
                                    if (i7 == 0) {
                                        i8 = 0;
                                    } else {
                                        i8 = 1;
                                    }
                                    if (ga2Var.m) {
                                        mc2.y("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    ArrayList arrayList = ga2Var.t;
                                    ((fa2) arrayList.get(arrayList.size() - 1)).a.add(new ij5(str2, list, i8, z60Var, fY8, z60Var2, fY10, fY11, i5, i6, fY9, fY14, fY12, fY13));
                                    i4 = 3;
                                    i12 = i3;
                                    b = -1;
                                }
                                i6 = 0;
                                float fY15 = sfVar.y(typedArrayO3, "strokeMiterLimit", 10, 4.0f);
                                bmVarS = xq2.s(typedArrayO3, (XmlPullParser) sfVar.n, theme, "strokeColor", 3);
                                sfVar.n(typedArrayO3.getChangingConfigurations());
                                float fY16 = sfVar.y(typedArrayO3, "strokeAlpha", 11, 1.0f);
                                float fY17 = sfVar.y(typedArrayO3, "strokeWidth", 4, 1.0f);
                                float fY18 = sfVar.y(typedArrayO3, "trimPathEnd", 6, 1.0f);
                                float fY19 = sfVar.y(typedArrayO3, "trimPathOffset", 7, 0.0f);
                                float fY110 = sfVar.y(typedArrayO3, "trimPathStart", 5, 0.0f);
                                if (xq2.p((XmlPullParser) sfVar.n, "fillType")) {
                                    i7 = 0;
                                } else {
                                    i7 = typedArrayO3.getInt(13, 0);
                                }
                                sfVar.n(typedArrayO3.getChangingConfigurations());
                                typedArrayO3.recycle();
                                shader = (Shader) bmVarS2.y;
                                if (shader != null) {
                                    if (shader != null) {
                                        cu4Var = mz5.g(shader);
                                    } else {
                                        cu4Var = new cu4(ra.n(bmVarS2.g));
                                    }
                                    z60Var = cu4Var;
                                } else {
                                    z60Var = null;
                                }
                                shader2 = (Shader) bmVarS.y;
                                if (shader2 != null) {
                                    if (shader2 != null) {
                                        cu4Var2 = mz5.g(shader2);
                                    } else {
                                        cu4Var2 = new cu4(ra.n(bmVarS.g));
                                    }
                                    z60Var2 = cu4Var2;
                                } else {
                                    z60Var2 = null;
                                }
                                if (i7 == 0) {
                                    i8 = 0;
                                } else {
                                    i8 = 1;
                                }
                                if (ga2Var.m) {
                                    mc2.y("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                ArrayList arrayList2 = ga2Var.t;
                                ((fa2) arrayList2.get(arrayList2.size() - 1)).a.add(new ij5(str2, list, i8, z60Var, fY8, z60Var2, fY16, fY17, i5, i6, fY15, fY110, fY18, fY19));
                                i4 = 3;
                                i12 = i3;
                                b = -1;
                            }
                        } else {
                            i3 = i12;
                            b = -1;
                            i4 = 3;
                            if (name.equals("clip-path")) {
                                TypedArray typedArrayO4 = xq2.o(resources, theme, attributeSetAsAttributeSet, a11.n);
                                sfVar.n(typedArrayO4.getChangingConfigurations());
                                String string4 = typedArrayO4.getString(0);
                                sfVar.n(typedArrayO4.getChangingConfigurations());
                                String str3 = string4 == null ? "" : string4;
                                String string5 = typedArrayO4.getString(1);
                                sfVar.n(typedArrayO4.getChangingConfigurations());
                                if (string5 == null) {
                                    int i20 = fj5.g;
                                } else {
                                    listJ = q64.j(q64Var2, string5);
                                }
                                List list2 = listJ;
                                typedArrayO4.recycle();
                                if (ga2Var.m) {
                                    mc2.y("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                ga2Var.t.add(new fa2(str3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list2, 512));
                                i12 = i3 + 1;
                            } else {
                                i12 = i3;
                            }
                        }
                    } else {
                        i3 = i12;
                    }
                    b = -1;
                    i4 = 3;
                    i12 = i3;
                } else if (eventType == i13 && "group".equals(xmlPullParser.getName())) {
                    int i21 = i12 + 1;
                    for (int i22 = 0; i22 < i21; i22++) {
                        ArrayList arrayList3 = ga2Var.t;
                        if (ga2Var.m) {
                            mc2.y("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                        }
                        fa2 fa2Var = (fa2) arrayList3.remove(arrayList3.size() - 1);
                        ((fa2) arrayList3.get(arrayList3.size() - 1)).a.add(new ej5(fa2Var.g, fa2Var.y, fa2Var.r, fa2Var.n, fa2Var.v, fa2Var.x, fa2Var.l, fa2Var.j, fa2Var.t, fa2Var.a));
                    }
                    int[] iArr = sfVar.y;
                    if (iArr == null || (i9 = sfVar.r) == 0) {
                        i12 = 0;
                    } else {
                        int i23 = i9 - 1;
                        sfVar.r = i23;
                        i12 = iArr[i23];
                    }
                    b = -1;
                    i4 = 3;
                } else {
                    i3 = i12;
                    i4 = i13;
                    b = -1;
                    i12 = i3;
                }
                xmlResourceParser.next();
                xml = xmlResourceParser;
                i10 = i14;
            }
            ia2Var = new ia2(ga2Var.y(), i10 | sfVar.g);
            ka2Var.g.put(ja2Var, new WeakReference(ia2Var));
        }
        hj5 hj5VarK = zq2.k(ia2Var.g, h02Var);
        h02Var.b(false);
        return hj5VarK;
    }

    public static final void l(c85 c85Var, boolean z, h02 h02Var, int i) {
        boolean z2;
        h02Var.Z(-1060377025);
        int i2 = i | (h02Var.x(c85Var) ? 4 : 2) | (h02Var.l(z) ? 32 : 16);
        if (h02Var.N(i2 & 1, (i2 & 19) != 18)) {
            bw4 bw4VarY = ug.y(c85Var.n() != 0 ? xs2.q(c85Var.y() / c85Var.n(), 0.0f, 1.0f) : 0.0f, null, "TextSendProgress", h02Var, 3072, 22);
            g73 g73Var = g73.g;
            j73 j73VarR = mq4.r(g73Var, 1.0f);
            kb4 kb4VarG = jb4.g(v70.x, hi0.u, h02Var, 54);
            int iHashCode = Long.hashCode(h02Var.T);
            tr3 tr3VarQ = h02Var.q();
            j73 j73VarW = m50.W(h02Var, j73VarR);
            jo0.n.getClass();
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(um2.Z);
            } else {
                h02Var.l0();
            }
            xs2.E(tg1.w, h02Var, kb4VarG);
            xs2.E(tg1.q, h02Var, tr3VarQ);
            xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode));
            xs2.D(h02Var);
            xs2.E(tg1.m, h02Var, j73VarW);
            String strI = xs2.I(R.string.text_send_progress, h02Var);
            j14 j14Var = of5.g;
            g75.y(strI, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var.a(j14Var)).m, h02Var, 0, 0, 131070);
            g75.y(c85Var.y() + " / " + c85Var.n(), null, ((rj0) h02Var.a(tj0.g)).u, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var.a(j14Var)).c, h02Var, 0, 0, 131066);
            h02Var.b(true);
            if (c85Var.r().length() > 0) {
                h02Var.X(-206669154);
                z2 = z;
                a(c85Var.r(), c85Var.g(), z2, h02Var, (i2 << 3) & 896);
                h02Var.b(false);
            } else {
                z2 = z;
                h02Var.X(-206572093);
                h02Var.b(false);
            }
            boolean zX = h02Var.x(bw4VarY);
            Object objK = h02Var.K();
            if (zX || objK == oo0.g) {
                objK = new zs(bw4VarY, (byte) 7);
                h02Var.i0(objK);
            }
            b04.r((my1) objK, mq4.n(mq4.r(g73Var, 1.0f), 6.0f), 0L, 0L, 0, 0.0f, null, h02Var, 48, 124);
        } else {
            z2 = z;
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new db((Object) c85Var, z2, i, (byte) 8);
        }
    }

    public static final void m(int i, h02 h02Var) {
        h02Var.Z(1666174764);
        if (h02Var.N(i & 1, i != 0)) {
            g75.y(xs2.I(R.string.text_send_waiting, h02Var), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var.a(of5.g)).m, h02Var, 0, 0, 131070);
            b04.n(mq4.n(mq4.r(g73.g, 1.0f), 6.0f), 0L, 0L, 0, 0.0f, h02Var, 6);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new c75(i);
        }
    }

    public static final void n(Boolean bool, Object obj, gu2 gu2Var, xy1 xy1Var, h02 h02Var, int i) {
        int i2;
        h02Var.Z(696924721);
        if ((i & 6) == 0) {
            i2 = (h02Var.j(bool) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.j(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= h02Var.j(xy1Var) ? 2048 : 1024;
        }
        if (h02Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            h02Var.S();
            if ((i & 1) == 0 || h02Var.k()) {
                gu2Var = (gu2) h02Var.a(ix2.g);
            } else {
                h02Var.Q();
            }
            int i3 = i2 & (-897);
            h02Var.s();
            boolean zX = h02Var.x(bool) | h02Var.x(obj) | h02Var.x(gu2Var);
            Object objK = h02Var.K();
            if (zX || objK == oo0.g) {
                objK = new ou2(gu2Var.a());
                h02Var.i0(objK);
            }
            v(gu2Var, (ou2) objK, xy1Var, h02Var, (i3 >> 3) & 896);
        } else {
            h02Var.Q();
        }
        gu2 gu2Var2 = gu2Var;
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new ca2(bool, obj, gu2Var2, xy1Var, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0065  */
    /* JADX WARN: Code duplicated, block: B:21:0x0078  */
    /* JADX WARN: Code duplicated, block: B:22:0x0089  */
    /* JADX WARN: Code duplicated, block: B:24:0x008d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0097  */
    /* JADX WARN: Code duplicated, block: B:27:0x009b  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b3  */
    public static final fc3 o(String str, xy1 xy1Var) {
        Class<?> componentType;
        kc3 kc3Var = new kc3();
        xy1Var.a(kc3Var);
        ic3 ic3Var = kc3Var.g;
        de3 de3Var = (de3) ic3Var.r;
        if (de3Var == null) {
            Object obj = ic3Var.n;
            de3 de3VarM = hb6.m(obj);
            if (de3VarM != null) {
                de3Var = de3VarM;
            } else if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                de3Var = de3.m;
            } else {
                obj.getClass();
                if (obj.getClass().isArray()) {
                    Class<?> componentType2 = obj.getClass().getComponentType();
                    componentType2.getClass();
                    if (Parcelable.class.isAssignableFrom(componentType2)) {
                        Class<?> componentType3 = obj.getClass().getComponentType();
                        componentType3.getClass();
                        de3VarM = new zd3(componentType3);
                    } else if (obj.getClass().isArray()) {
                        componentType = obj.getClass().getComponentType();
                        componentType.getClass();
                        if (Serializable.class.isAssignableFrom(componentType)) {
                            Class<?> componentType4 = obj.getClass().getComponentType();
                            componentType4.getClass();
                            de3VarM = new be3(componentType4);
                        } else if (obj instanceof Parcelable) {
                            de3VarM = new ae3(obj.getClass());
                        } else if (obj instanceof Enum) {
                            de3VarM = new yd3(obj.getClass());
                        } else {
                            if (obj instanceof Serializable) {
                                l0.u(du4.i("Object of type ", obj.getClass().getName(), " is not supported for navigation arguments."));
                                return null;
                            }
                            de3VarM = new ce3(obj.getClass());
                        }
                    } else if (obj instanceof Parcelable) {
                        de3VarM = new ae3(obj.getClass());
                    } else if (obj instanceof Enum) {
                        de3VarM = new yd3(obj.getClass());
                    } else {
                        if (obj instanceof Serializable) {
                            l0.u(du4.i("Object of type ", obj.getClass().getName(), " is not supported for navigation arguments."));
                            return null;
                        }
                        de3VarM = new ce3(obj.getClass());
                    }
                } else if (obj.getClass().isArray()) {
                    componentType = obj.getClass().getComponentType();
                    componentType.getClass();
                    if (Serializable.class.isAssignableFrom(componentType)) {
                        Class<?> componentType5 = obj.getClass().getComponentType();
                        componentType5.getClass();
                        de3VarM = new be3(componentType5);
                    } else if (obj instanceof Parcelable) {
                        de3VarM = new ae3(obj.getClass());
                    } else if (obj instanceof Enum) {
                        de3VarM = new yd3(obj.getClass());
                    } else {
                        if (obj instanceof Serializable) {
                            l0.u(du4.i("Object of type ", obj.getClass().getName(), " is not supported for navigation arguments."));
                            return null;
                        }
                        de3VarM = new ce3(obj.getClass());
                    }
                } else if (obj instanceof Parcelable) {
                    de3VarM = new ae3(obj.getClass());
                } else if (obj instanceof Enum) {
                    de3VarM = new yd3(obj.getClass());
                } else {
                    if (obj instanceof Serializable) {
                        l0.u(du4.i("Object of type ", obj.getClass().getName(), " is not supported for navigation arguments."));
                        return null;
                    }
                    de3VarM = new ce3(obj.getClass());
                }
                de3Var = de3VarM;
            }
        }
        return new fc3(str, new jc3(de3Var, ic3Var.g, ic3Var.n, ic3Var.y));
    }

    public static final void r(vt2 vt2Var, gu2 gu2Var, my1 my1Var, h02 h02Var, int i) {
        h02Var.Z(-709389590);
        int i2 = i | 16 | (h02Var.j(my1Var) ? 256 : 128);
        if (h02Var.N(i2 & 1, (i2 & 147) != 146)) {
            h02Var.S();
            if ((i & 1) == 0 || h02Var.k()) {
                gu2Var = (gu2) h02Var.a(ix2.g);
            } else {
                h02Var.Q();
            }
            h02Var.s();
            if (vt2Var == vt2.ON_DESTROY) {
                l0.u("LifecycleEventEffect cannot be used to listen for Lifecycle.Event.ON_DESTROY, since Compose disposes of the composition before ON_DESTROY observers are invoked.");
                return;
            }
            ob3 ob3VarQ = kq2.Q(my1Var, h02Var);
            boolean zX = h02Var.x(ob3VarQ) | h02Var.j(gu2Var);
            Object objK = h02Var.K();
            if (zX || objK == oo0.g) {
                objK = new q2((Object) gu2Var, (Object) vt2Var, (Object) ob3VarQ, (byte) 16);
                h02Var.i0(objK);
            }
            k33.j(gu2Var, (xy1) objK, h02Var);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new r2(vt2Var, gu2Var, my1Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00be  */
    /* JADX WARN: Code duplicated, block: B:60:0x00de  */
    /* JADX WARN: Code duplicated, block: B:62:0x011a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0125  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    public static final void t(final e85 e85Var, final my1 my1Var, j73 j73Var, boolean z, h02 h02Var, final int i, final int i2) {
        int i3;
        j73 j73Var2;
        int i4;
        boolean z2;
        boolean z3;
        final j73 j73Var3;
        final boolean z4;
        u34 u34VarP;
        j73 j73Var4;
        final boolean z5;
        Object objK;
        final ob3 ob3Var;
        my1Var.getClass();
        h02Var.Z(1043259902);
        if ((i & 6) == 0) {
            i3 = (h02Var.x(e85Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= h02Var.j(my1Var) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 = i3 | 384;
            j73Var2 = j73Var;
        } else {
            j73Var2 = j73Var;
            i4 = i3 | (h02Var.x(j73Var2) ? 256 : 128);
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i4 |= h02Var.l(z2) ? 2048 : 1024;
            }
            if ((i4 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (h02Var.N(i4 & 1, z3)) {
                if (i5 != 0) {
                    j73Var4 = g73.g;
                } else {
                    j73Var4 = j73Var2;
                }
                if (i6 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                objK = h02Var.K();
                if (objK == oo0.g) {
                    objK = kq2.M(e85Var);
                    h02Var.i0(objK);
                }
                ob3Var = (ob3) objK;
                if (e85Var != null) {
                    ob3Var.setValue(e85Var);
                }
                j73 j73VarR = mq4.r(j73Var4, 1.0f);
                t33 t33VarR = z50.r(hi0.t, false);
                int iHashCode = Long.hashCode(h02Var.T);
                tr3 tr3VarQ = h02Var.q();
                j73 j73VarW = m50.W(h02Var, j73VarR);
                jo0.n.getClass();
                h02Var.b0();
                if (h02Var.S) {
                    h02Var.m(um2.Z);
                } else {
                    h02Var.l0();
                }
                xs2.E(tg1.w, h02Var, t33VarR);
                xs2.E(tg1.q, h02Var, tr3VarQ);
                xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode));
                xs2.D(h02Var);
                xs2.E(tg1.m, h02Var, j73VarW);
                gp4.n(e85Var != null, null, yj1.v(null, 3).g(yj1.n(null, 15)), yj1.x(null, 3).g(yj1.t(null, 15)), null, ue5.m0(561761244, new cz1() { // from class: z75
                    @Override // defpackage.cz1
                    public final Object x(Object obj, Object obj2, Object obj3) {
                        h02 h02Var2 = (h02) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((di) obj).getClass();
                        if (h02Var2.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                            fb6.g(ue5.z(ue5.e0(g73.g, 8.0f)), null, null, null, null, ue5.m0(-381705522, new om1((byte) 2, my1Var, ob3Var, z5), h02Var2), h02Var2, 196608, 30);
                        } else {
                            h02Var2.Q();
                        }
                        return og5.g;
                    }
                }, h02Var), h02Var, 200064, 18);
                h02Var.b(true);
                j73Var3 = j73Var4;
                z4 = z5;
            } else {
                h02Var.Q();
                j73Var3 = j73Var2;
                z4 = z2;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new bz1() { // from class: a85
                    @Override // defpackage.bz1
                    public final Object l(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        aq2.t(e85Var, my1Var, j73Var3, z4, (h02) obj, aq2.J(i | 1), i2);
                        return og5.g;
                    }
                };
            }
        }
        i4 |= 3072;
        z2 = z;
        if ((i4 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (h02Var.N(i4 & 1, z3)) {
            if (i5 != 0) {
                j73Var4 = g73.g;
            } else {
                j73Var4 = j73Var2;
            }
            if (i6 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            objK = h02Var.K();
            if (objK == oo0.g) {
                objK = kq2.M(e85Var);
                h02Var.i0(objK);
            }
            ob3Var = (ob3) objK;
            if (e85Var != null) {
                ob3Var.setValue(e85Var);
            }
            j73 j73VarR2 = mq4.r(j73Var4, 1.0f);
            t33 t33VarR2 = z50.r(hi0.t, false);
            int iHashCode2 = Long.hashCode(h02Var.T);
            tr3 tr3VarQ2 = h02Var.q();
            j73 j73VarW2 = m50.W(h02Var, j73VarR2);
            jo0.n.getClass();
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(um2.Z);
            } else {
                h02Var.l0();
            }
            xs2.E(tg1.w, h02Var, t33VarR2);
            xs2.E(tg1.q, h02Var, tr3VarQ2);
            xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode2));
            xs2.D(h02Var);
            xs2.E(tg1.m, h02Var, j73VarW2);
            if (e85Var != null) {
            }
            gp4.n(e85Var != null, null, yj1.v(null, 3).g(yj1.n(null, 15)), yj1.x(null, 3).g(yj1.t(null, 15)), null, ue5.m0(561761244, new cz1() { // from class: z75
                @Override // defpackage.cz1
                public final Object x(Object obj, Object obj2, Object obj3) {
                    h02 h02Var2 = (h02) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((di) obj).getClass();
                    if (h02Var2.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                        fb6.g(ue5.z(ue5.e0(g73.g, 8.0f)), null, null, null, null, ue5.m0(-381705522, new om1((byte) 2, my1Var, ob3Var, z5), h02Var2), h02Var2, 196608, 30);
                    } else {
                        h02Var2.Q();
                    }
                    return og5.g;
                }
            }, h02Var), h02Var, 200064, 18);
            h02Var.b(true);
            j73Var3 = j73Var4;
            z4 = z5;
        } else {
            h02Var.Q();
            j73Var3 = j73Var2;
            z4 = z2;
        }
        u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: a85
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    aq2.t(e85Var, my1Var, j73Var3, z4, (h02) obj, aq2.J(i | 1), i2);
                    return og5.g;
                }
            };
        }
    }

    public static final int u(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final void v(gu2 gu2Var, ou2 ou2Var, xy1 xy1Var, h02 h02Var, int i) {
        int i2;
        h02Var.Z(228371534);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = (h02Var.j(gu2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.j(ou2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= h02Var.j(xy1Var) ? 256 : 128;
        }
        if (h02Var.N(i2 & 1, (i2 & 147) != 146)) {
            boolean zJ = h02Var.j(ou2Var) | ((i2 & 896) == 256) | h02Var.j(gu2Var);
            Object objK = h02Var.K();
            if (zJ || objK == oo0.g) {
                objK = new bc(gu2Var, ou2Var, xy1Var, b);
                h02Var.i0(objK);
            }
            k33.t(gu2Var, ou2Var, (xy1) objK, h02Var);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new hg(gu2Var, ou2Var, xy1Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:244:0x05d1  */
    public static final void x(qr0 qr0Var, ao2 ao2Var, wm4 wm4Var, final gp gpVar, b30 b30Var, h02 h02Var, int i) {
        wm4 wm4Var2;
        h02 h02Var2;
        int i2;
        gp gpVar2;
        Context context;
        int i3;
        jd3 jd3Var;
        yh5 yh5Var;
        jd3 jd3Var2;
        gx3 gx3Var;
        final gp gpVar3;
        boolean z;
        int i4;
        es4 es4Var;
        int i5;
        b30 b30Var2;
        final gp gpVar4;
        boolean z2;
        Object tcVar;
        Integer num;
        h02 h02Var3;
        boolean z3;
        boolean z4;
        qr0 qr0Var2;
        boolean z5;
        boolean z6;
        Object objK;
        Object t03Var;
        qr0 qr0Var3 = qr0Var;
        qr0Var3.getClass();
        ao2Var.getClass();
        wm4Var.getClass();
        gpVar.getClass();
        b30Var.getClass();
        v20 v20Var = b30Var.r;
        h02Var.Z(-232928305);
        int i6 = i | (h02Var.j(qr0Var3) ? 4 : 2) | (h02Var.j(ao2Var) ? 32 : 16) | (h02Var.j(wm4Var) ? 256 : 128) | (h02Var.j(gpVar) ? 2048 : 1024) | (h02Var.j(b30Var) ? 16384 : 8192);
        byte b = 1;
        if (h02Var.N(i6 & 1, (i6 & 9363) != 9362)) {
            vf1 vf1Var = sa.y;
            Context context2 = (Context) h02Var.a(vf1Var);
            Context context3 = (Context) h02Var.a(vf1Var);
            Object[] objArrCopyOf = Arrays.copyOf(new sf3[0], 0);
            ji jiVar = new ji((Object) new on0((byte) 23), (Object) new iy1(context3, b), (byte) 29);
            boolean zJ = h02Var.j(context3);
            Object objK2 = h02Var.K();
            byte b2 = 7;
            l76 l76Var = oo0.g;
            if (zJ || objK2 == l76Var) {
                objK2 = new sn(context3, b2);
                h02Var.i0(objK2);
            }
            jd3 jd3Var3 = (jd3) xq2.d(objArrCopyOf, jiVar, (my1) objK2, h02Var, 0);
            Intent intent = (Intent) gpVar.n.getValue();
            ob3 ob3VarS = og0.s(gpVar.r, h02Var);
            ob3 ob3VarS2 = og0.s(b30Var.n, h02Var);
            Object objK3 = h02Var.K();
            if (objK3 == l76Var) {
                objK3 = new es4();
                h02Var.i0(objK3);
            }
            es4 es4Var2 = (es4) objK3;
            ob3 ob3VarJ = v13.j(wm4Var.l, h02Var);
            ip ipVarV = gpVar.v();
            h02Var.X(1500810210);
            gu2 gu2Var = (gu2) h02Var.a(ix2.g);
            ip ipVar = ipVarV;
            int i7 = i6 & 57344;
            boolean zJ2 = (i7 == 16384 || h02Var.j(b30Var)) | h02Var.j(context2) | h02Var.j(gu2Var);
            Object objK4 = h02Var.K();
            int i8 = i7;
            byte b3 = 6;
            if (zJ2 || objK4 == l76Var) {
                objK4 = new bc(gu2Var, b30Var, context2, b3);
                h02Var.i0(objK4);
            }
            int i9 = b30.l;
            k33.t(gu2Var, b30Var, (xy1) objK4, h02Var);
            h02Var.b(false);
            boolean zL = h02Var.l(((Boolean) ob3VarS.getValue()).booleanValue()) | h02Var.x((String) ob3VarS2.getValue());
            Object objK5 = h02Var.K();
            if (zL || objK5 == l76Var) {
                final byte b4 = 1;
                gx3 gx3Var2 = new gx3(((Boolean) ob3VarS.getValue()).booleanValue(), ((String) ob3VarS2.getValue()) != null, new my1() { // from class: s03
                    @Override // defpackage.my1
                    public final Object g() {
                        byte b5 = b4;
                        og5 og5Var = og5.g;
                        gp gpVar5 = gpVar;
                        switch (b5) {
                            case 0:
                                gpVar5.v.setValue(null);
                                break;
                            case 1:
                                gpVar5.x(ip.g(gpVar5.v(), null, false, true, 3));
                                break;
                            default:
                                gpVar5.x(ip.g(gpVar5.v(), null, false, false, 6));
                                break;
                        }
                        return og5Var;
                    }
                }, new f(gpVar, (byte) 22));
                h02Var.i0(gx3Var2);
                objK5 = gx3Var2;
            }
            gx3 gx3Var3 = (gx3) objK5;
            if (intent != null) {
                h02Var.X(1501947321);
                boolean zJ3 = h02Var.j(jd3Var3) | h02Var.j(intent) | h02Var.j(context2) | ((i6 & 14) == 4 || h02Var.j(qr0Var3)) | h02Var.j(gx3Var3) | ((i6 & 7168) == 2048 || h02Var.j(gpVar));
                Object objK6 = h02Var.K();
                if (zJ3 || objK6 == l76Var) {
                    i2 = i6;
                    context = context2;
                    jd3Var = jd3Var3;
                    i3 = 16384;
                    t03Var = new t03(context, intent, qr0Var3, jd3Var, gx3Var3, gpVar, null);
                    gpVar2 = gpVar;
                    h02Var.i0(t03Var);
                } else {
                    i2 = i6;
                    t03Var = objK6;
                    gpVar2 = gpVar;
                    context = context2;
                    i3 = 16384;
                    jd3Var = jd3Var3;
                }
                k33.b((bz1) t03Var, h02Var, intent);
                h02Var.b(false);
            } else {
                i2 = i6;
                gpVar2 = gpVar;
                context = context2;
                ipVar = ipVar;
                i8 = i8;
                i3 = 16384;
                jd3Var = jd3Var3;
                h02Var.X(1502556595);
                h02Var.b(false);
            }
            yh5 yh5Var2 = (yh5) cj0.l0((List) v13.l(v20Var.y, pi1.j, h02Var, 48, 2).getValue());
            if (yh5Var2 == null) {
                h02Var.X(1502677680);
                h02Var.b(false);
                context = context;
                jd3Var2 = jd3Var;
                gx3Var = gx3Var3;
                i8 = i8;
            } else {
                h02Var.X(1502677681);
                String strI = xs2.I(yh5Var2.y, h02Var);
                boolean zX = h02Var.x(strI) | (i8 == i3 || h02Var.j(b30Var)) | h02Var.j(yh5Var2);
                Object objK7 = h02Var.K();
                if (zX || objK7 == l76Var) {
                    jd3 jd3Var4 = jd3Var;
                    yh5Var = yh5Var2;
                    jd3Var2 = jd3Var4;
                    gx3Var = gx3Var3;
                    s3 s3Var = new s3(es4Var2, strI, b30Var, yh5Var, null, (byte) 15);
                    h02Var.i0(s3Var);
                    objK7 = s3Var;
                } else {
                    jd3Var2 = jd3Var;
                    gx3Var = gx3Var3;
                    yh5Var = yh5Var2;
                }
                k33.b((bz1) objK7, h02Var, yh5Var);
                h02Var.b(false);
            }
            if (ipVar.y) {
                h02Var.X(1503013411);
                WeakHashMap weakHashMap = yp5.k;
                boolean zBooleanValue = ((Boolean) v13.t(h02Var).r.n.getValue()).booleanValue();
                i4 = 2048;
                boolean zL2 = h02Var.l(zBooleanValue) | h02Var.j(context) | h02Var.j(jd3Var2) | ((i2 & 7168) == 2048 || h02Var.j(gpVar2));
                Object objK8 = h02Var.K();
                if (zL2 || objK8 == l76Var) {
                    gpVar3 = gpVar2;
                    u03 u03Var = new u03(zBooleanValue, context, jd3Var2, gpVar3, (mu0) null);
                    h02Var.i0(u03Var);
                    objK8 = u03Var;
                } else {
                    gpVar3 = gpVar2;
                }
                k33.b((bz1) objK8, h02Var, ipVar);
                z = false;
                h02Var.b(false);
            } else {
                gpVar3 = gpVar2;
                z = false;
                i4 = 2048;
                h02Var.X(1503305555);
                h02Var.b(false);
            }
            by3 by3Var = ipVar.g;
            if (by3Var == null) {
                h02Var.X(1503375955);
                h02Var.b(z);
                b30Var2 = b30Var;
                gpVar4 = gpVar3;
                es4Var = es4Var2;
                jd3Var2 = jd3Var2;
                i5 = i4;
            } else {
                h02Var.X(1503375956);
                if (by3Var.g() != null) {
                    h02Var.X(304150857);
                    String strI2 = xs2.I(by3Var.g().intValue(), h02Var);
                    String strI3 = xs2.I(R.string.button_upgrade, h02Var);
                    Integer numG = by3Var.g();
                    boolean zX2 = h02Var.x(strI2) | h02Var.x(strI3) | ((i2 & 7168) == i4 || h02Var.j(gpVar3)) | h02Var.j(by3Var);
                    Object objK9 = h02Var.K();
                    if (zX2 || objK9 == l76Var) {
                        num = numG;
                        i5 = i4;
                        tcVar = new tc(es4Var2, strI2, strI3, gpVar3, by3Var, null, (byte) 4);
                        es4Var = es4Var2;
                        h02Var.i0(tcVar);
                    } else {
                        num = numG;
                        tcVar = objK9;
                        es4Var = es4Var2;
                        i5 = i4;
                    }
                    k33.b((bz1) tcVar, h02Var, num);
                    z2 = false;
                    h02Var.b(false);
                    b30Var2 = b30Var;
                    gpVar4 = gpVar3;
                } else {
                    es4Var = es4Var2;
                    jd3Var2 = jd3Var2;
                    i5 = i4;
                    h02Var.X(304862772);
                    z14 z14VarL = gy3.l(b30Var);
                    boolean z7 = (i2 & 7168) == i5 || h02Var.j(gpVar3);
                    Object objK10 = h02Var.K();
                    if (z7 || objK10 == l76Var) {
                        final byte b5 = 2;
                        objK10 = new my1() { // from class: s03
                            @Override // defpackage.my1
                            public final Object g() {
                                byte b6 = b5;
                                og5 og5Var = og5.g;
                                gp gpVar5 = gpVar3;
                                switch (b6) {
                                    case 0:
                                        gpVar5.v.setValue(null);
                                        break;
                                    case 1:
                                        gpVar5.x(ip.g(gpVar5.v(), null, false, true, 3));
                                        break;
                                    default:
                                        gpVar5.x(ip.g(gpVar5.v(), null, false, false, 6));
                                        break;
                                }
                                return og5Var;
                            }
                        };
                        h02Var.i0(objK10);
                    }
                    b30Var2 = b30Var;
                    gpVar4 = gpVar;
                    m50.m((my1) objK10, ue5.m0(445391357, new ar2(b30Var, gpVar, z14VarL, by3Var, (byte) 2), h02Var), h02Var, 48);
                    z2 = false;
                    h02Var.b(false);
                }
                h02Var.b(z2);
            }
            String str = v20.r;
            v20Var.getClass();
            str.getClass();
            w10 w10Var = v20Var.g;
            w10Var.getClass();
            HashMap map = w10Var.h;
            Object obj = map.get(str);
            obj.getClass();
            byte b6 = 0;
            j10 j10Var = new j10((ew4) obj, b6);
            Object obj2 = map.get("premium_yearly");
            obj2.getClass();
            mu0 mu0Var = null;
            ob3 ob3VarL = v13.l(new qs1(j10Var, new j10((ew4) obj2, b6), new t20(3, mu0Var, (byte) 1), b6), Boolean.FALSE, h02Var, 48, 2);
            int i10 = i2 & 7168;
            boolean zX3 = (i10 == i5 || h02Var.x(gpVar4)) | h02Var.x(context);
            Object objK11 = h02Var.K();
            if (zX3 || objK11 == l76Var) {
                objK11 = new rg((Object) gpVar4, (Object) context, (byte) 15);
                h02Var.i0(objK11);
            }
            my1 my1Var = (my1) objK11;
            if (ipVar.r) {
                h02Var.X(1504999364);
                ob3 ob3VarS3 = og0.s(b30Var2.x, h02Var);
                Object objK12 = h02Var.K();
                if (objK12 == l76Var) {
                    objK12 = new q21((byte) 28);
                    h02Var.i0(objK12);
                }
                xy1 xy1VarP = kq2.P((xy1) objK12, h02Var);
                int i11 = i8;
                boolean z8 = i11 == 16384 || h02Var.j(b30Var2);
                Object objK13 = h02Var.K();
                if (z8 || objK13 == l76Var) {
                    objK13 = new qx(b30Var2, mu0Var, (byte) 8);
                    h02Var.i0(objK13);
                }
                k33.b((bz1) objK13, h02Var, og5.g);
                w14 w14Var = (w14) ob3VarS3.getValue();
                boolean z9 = i11 == 16384 || h02Var.j(b30Var2);
                Object objK14 = h02Var.K();
                byte b7 = 17;
                if (z9 || objK14 == l76Var) {
                    objK14 = new gf(b30Var2, b7);
                    h02Var.i0(objK14);
                }
                my1 my1Var2 = (my1) objK14;
                boolean zJ4 = h02Var.j(context);
                Object objK15 = h02Var.K();
                if (zJ4 || objK15 == l76Var) {
                    objK15 = new sn(context, (byte) 6);
                    h02Var.i0(objK15);
                }
                my1 my1Var3 = (my1) objK15;
                boolean zX4 = h02Var.x(xy1VarP) | h02Var.x(ob3VarS3);
                Object objK16 = h02Var.K();
                if (zX4 || objK16 == l76Var) {
                    objK16 = new rg((Object) xy1VarP, (Object) ob3VarS3, (byte) 16);
                    h02Var.i0(objK16);
                }
                my1 my1Var4 = (my1) objK16;
                boolean z10 = (i10 == 2048 || h02Var.j(gpVar4)) | (i11 == 16384 || h02Var.j(b30Var2));
                Object objK17 = h02Var.K();
                if (z10 || objK17 == l76Var) {
                    objK17 = new rg((Object) gpVar4, (Object) b30Var2, (byte) 17);
                    h02Var.i0(objK17);
                }
                z4 = true;
                ge6.y(w14Var, my1Var2, my1Var3, my1Var4, (my1) objK17, h02Var, 8);
                h02Var3 = h02Var;
                z3 = false;
                h02Var3.b(false);
            } else {
                h02Var3 = h02Var;
                z3 = false;
                z4 = true;
                h02Var3.X(1506213107);
                h02Var3.b(false);
            }
            String str2 = (String) gpVar4.v.getValue();
            if (str2 == null) {
                h02Var3.X(1506269309);
                h02Var3.b(z3);
                h02Var2 = h02Var3;
            } else {
                h02Var3.X(1506269310);
                boolean z11 = (i10 == 2048 || h02Var3.j(gpVar4)) ? z4 : false;
                Object objK18 = h02Var3.K();
                if (z11 || objK18 == l76Var) {
                    final byte b8 = 0;
                    objK18 = new my1() { // from class: s03
                        @Override // defpackage.my1
                        public final Object g() {
                            byte b9 = b8;
                            og5 og5Var = og5.g;
                            gp gpVar5 = gpVar4;
                            switch (b9) {
                                case 0:
                                    gpVar5.v.setValue(null);
                                    break;
                                case 1:
                                    gpVar5.x(ip.g(gpVar5.v(), null, false, true, 3));
                                    break;
                                default:
                                    gpVar5.x(ip.g(gpVar5.v(), null, false, false, 6));
                                    break;
                            }
                            return og5Var;
                        }
                    };
                    h02Var3.i0(objK18);
                }
                my1 my1Var5 = (my1) objK18;
                if ((i2 & 14) != 4) {
                    qr0Var2 = qr0Var;
                    if (!h02Var3.j(qr0Var2)) {
                        z5 = false;
                    }
                    boolean zX5 = z5 | h02Var3.x(str2);
                    if (i10 != 2048 && !h02Var3.j(gpVar4)) {
                        z4 = false;
                    }
                    z6 = zX5 | z4;
                    objK = h02Var3.K();
                    if (z6 || objK == l76Var) {
                        objK = new bc((Object) qr0Var2, (Object) str2, (Object) gpVar4, (byte) 7);
                        h02Var3.i0(objK);
                    }
                    xj4.y(str2, qr0Var2, my1Var5, (xy1) objK, h02Var3, ((i2 << 3) & 112) | 64);
                    h02Var2 = h02Var3;
                    h02Var2.b(false);
                } else {
                    qr0Var2 = qr0Var;
                }
                z5 = z4;
                boolean zX6 = z5 | h02Var3.x(str2);
                if (i10 != 2048) {
                    z4 = false;
                }
                z6 = zX6 | z4;
                objK = h02Var3.K();
                if (z6) {
                    objK = new bc((Object) qr0Var2, (Object) str2, (Object) gpVar4, (byte) 7);
                    h02Var3.i0(objK);
                } else {
                    objK = new bc((Object) qr0Var2, (Object) str2, (Object) gpVar4, (byte) 7);
                    h02Var3.i0(objK);
                }
                xj4.y(str2, qr0Var2, my1Var5, (xy1) objK, h02Var3, ((i2 << 3) & 112) | 64);
                h02Var2 = h02Var3;
                h02Var2.b(false);
            }
            m14[] m14VarArr = {gp0.y.g(gx3Var), gp0.r.g(es4Var), gp0.g.g((ql4) ob3VarJ.getValue()), gp0.v.g(my1Var)};
            qr0Var3 = qr0Var;
            wm4Var2 = wm4Var;
            og0.r(m14VarArr, ue5.m0(-1886154993, new go(qr0Var3, ao2Var, wm4Var2, jd3Var2, gpVar4, ob3VarL), h02Var2), h02Var2, 48);
            j(qr0Var3, wm4Var2, h02Var2, (i2 & 14) | 72 | ((i2 >> 3) & 112));
        } else {
            wm4Var2 = wm4Var;
            h02Var2 = h02Var;
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new fo(qr0Var3, ao2Var, wm4Var2, gpVar, b30Var, i, (byte) 4);
        }
    }

    public static final void y(ss2 ss2Var, final bo3 bo3Var, final xq xqVar, final j00 j00Var, bq1 bq1Var, boolean z, tb tbVar, final xy1 xy1Var, h02 h02Var, final int i) {
        final ss2 ss2Var2;
        final bq1 bq1Var2;
        final boolean z2;
        final tb tbVar2;
        tb tbVarY;
        int i2;
        ss2 ss2Var3;
        boolean z3;
        bq1 bq1Var3;
        h02Var.Z(-1884325601);
        g73 g73Var = g73.g;
        int i3 = i | (h02Var.x(g73Var) ? 4 : 2) | 46664720 | (h02Var.j(xy1Var) ? 536870912 : 268435456);
        if (h02Var.N(i3 & 1, (306783379 & i3) != 306783378)) {
            h02Var.S();
            if ((i & 1) == 0 || h02Var.k()) {
                ss2 ss2VarG = us2.g(h02Var);
                c11 c11VarG = vu4.g(h02Var);
                boolean zX = h02Var.x(c11VarG);
                Object objK = h02Var.K();
                if (zX || objK == oo0.g) {
                    objK = new t11(c11VarG);
                    h02Var.i0(objK);
                }
                tbVarY = ln3.y(h02Var);
                i2 = i3 & (-238551153);
                ss2Var3 = ss2VarG;
                z3 = true;
                bq1Var3 = (t11) objK;
            } else {
                h02Var.Q();
                bq1Var3 = bq1Var;
                z3 = z;
                tbVarY = tbVar;
                i2 = i3 & (-238551153);
                ss2Var3 = ss2Var;
            }
            h02Var.s();
            js2.y(g73Var, ss2Var3, bo3Var, false, bq1Var3, z3, tbVarY, null, null, j00Var, xqVar, xy1Var, h02Var, (i2 & 14) | 1600896, 432 | ((i2 >> 18) & 7168), 1792);
            ss2Var2 = ss2Var3;
            bq1Var2 = bq1Var3;
            z2 = z3;
            tbVar2 = tbVarY;
        } else {
            h02Var.Q();
            ss2Var2 = ss2Var;
            bq1Var2 = bq1Var;
            z2 = z;
            tbVar2 = tbVar;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1(bo3Var, xqVar, j00Var, bq1Var2, z2, tbVar2, xy1Var, i) { // from class: zp2
                public final /* synthetic */ xq a;
                public final /* synthetic */ tb c;
                public final /* synthetic */ xy1 i;
                public final /* synthetic */ j00 m;
                public final /* synthetic */ bq1 q;
                public final /* synthetic */ bo3 t;
                public final /* synthetic */ boolean w;

                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(221569);
                    aq2.y(this.j, this.t, this.a, this.m, this.q, this.w, this.c, this.i, (h02) obj, iJ);
                    return og5.g;
                }
            };
        }
    }

    public static final Object[] z(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        pr.Q(objArr, objArr2, 0, i, 6);
        pr.O(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public abstract void F(boolean z);

    public abstract void G(int i);

    public abstract void H(int i);

    public abstract void p();

    public abstract String q(byte[] bArr, int i, int i2);

    public abstract int s();

    public abstract int w(String str, byte[] bArr, int i, int i2);

    public void E(boolean z) {
    }
}
