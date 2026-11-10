package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class t74 {
    public static final ThreadLocal g = new ThreadLocal();

    public static final qv1 g(int i) {
        if (i >= 0 && i < 150) {
            qv1 qv1Var = qv1.t;
            return qv1.t;
        }
        if (150 <= i && i < 250) {
            qv1 qv1Var2 = qv1.t;
            return qv1.a;
        }
        if (250 <= i && i < 350) {
            qv1 qv1Var3 = qv1.t;
            return qv1.m;
        }
        if (350 <= i && i < 450) {
            qv1 qv1Var4 = qv1.t;
            return qv1.q;
        }
        if (450 <= i && i < 550) {
            qv1 qv1Var5 = qv1.t;
            return qv1.w;
        }
        if (550 <= i && i < 650) {
            qv1 qv1Var6 = qv1.t;
            return qv1.c;
        }
        if (650 <= i && i < 750) {
            qv1 qv1Var7 = qv1.t;
            return qv1.i;
        }
        if (750 <= i && i < 850) {
            qv1 qv1Var8 = qv1.t;
            return qv1.b;
        }
        if (850 > i || i >= 1000) {
            qv1 qv1Var9 = qv1.t;
            return qv1.q;
        }
        qv1 qv1Var10 = qv1.t;
        return qv1.s;
    }

    public static final long l(TypedArray typedArray, int i, j51 j51Var, long j) {
        ThreadLocal threadLocal = g;
        Object typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        TypedValue typedValue2 = (TypedValue) typedValue;
        if (!typedArray.getValue(i, typedValue2) || typedValue2.type != 5) {
            return j;
        }
        int complexUnit = typedValue2.getComplexUnit();
        if (complexUnit != 1) {
            return complexUnit != 2 ? j51Var.s0(typedArray.getDimension(i, 0.0f)) : kq2.O(TypedValue.complexToFloat(typedValue2.data), 4294967296L);
        }
        return kq2.O(TypedValue.complexToFloat(typedValue2.data), 8589934592L);
    }

    public static final ou1 n(TypedArray typedArray, int i) {
        qu1 qu1Var;
        ThreadLocal threadLocal = g;
        Object obj = threadLocal.get();
        Object obj2 = obj;
        if (obj == null) {
            TypedValue typedValue = new TypedValue();
            threadLocal.set(typedValue);
            obj2 = typedValue;
        }
        TypedValue typedValue2 = (TypedValue) obj2;
        if (typedArray.getValue(i, typedValue2) && typedValue2.type == 3) {
            CharSequence charSequence = typedValue2.string;
            boolean zP = yf2.p(charSequence, "sans-serif");
            g12 g12Var = lu1.t;
            if (zP) {
                return new ou1(g12Var);
            }
            if (yf2.p(charSequence, "sans-serif-thin")) {
                return new ou1(g12Var, qv1.p);
            }
            if (yf2.p(charSequence, "sans-serif-light")) {
                return new ou1(g12Var, qv1.u);
            }
            if (yf2.p(charSequence, "sans-serif-medium")) {
                return new ou1(g12Var, qv1.h);
            }
            if (yf2.p(charSequence, "sans-serif-black")) {
                return new ou1(g12Var, qv1.k);
            }
            if (yf2.p(charSequence, "serif")) {
                return new ou1(lu1.a);
            }
            if (yf2.p(charSequence, "cursive")) {
                return new ou1(lu1.q);
            }
            if (yf2.p(charSequence, "monospace")) {
                return new ou1(lu1.m);
            }
            if (typedValue2.resourceId != 0) {
                CharSequence charSequence2 = typedValue2.string;
                charSequence2.getClass();
                if (tx4.j0(charSequence2, "res/")) {
                    CharSequence charSequence3 = typedValue2.string;
                    charSequence3.getClass();
                    if (!tx4.S(charSequence3, ".xml")) {
                        List listAsList = Arrays.asList(yf2.c(typedValue2.resourceId, null, 0, 14));
                        listAsList.getClass();
                        return new ou1(new qu1(listAsList));
                    }
                    Resources resources = typedArray.getResources();
                    resources.getClass();
                    XmlResourceParser xml = resources.getXml(typedValue2.resourceId);
                    xml.getClass();
                    try {
                        ev1 ev1VarO = k33.O(xml, resources);
                        if (ev1VarO instanceof fv1) {
                            gv1[] gv1VarArr = ((fv1) ev1VarO).g;
                            gv1VarArr.getClass();
                            ArrayList arrayList = new ArrayList(gv1VarArr.length);
                            for (gv1 gv1Var : gv1VarArr) {
                                arrayList.add(yf2.c(gv1Var.x, g(gv1Var.y), gv1Var.r ? 1 : 0, 8));
                            }
                            qu1Var = new qu1(arrayList);
                            xml.close();
                        } else {
                            xml.close();
                            qu1Var = null;
                        }
                        if (qu1Var != null) {
                            return new ou1(qu1Var);
                        }
                    } catch (Throwable th) {
                        xml.close();
                        throw th;
                    }
                }
            }
        }
        return null;
    }

    public static final cx0 r(TypedArray typedArray, int i) {
        ThreadLocal threadLocal = g;
        Object typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        TypedValue typedValue2 = (TypedValue) typedValue;
        if (!typedArray.getValue(i, typedValue2)) {
            return null;
        }
        int i2 = typedValue2.type;
        if (i2 != 5) {
            if (i2 != 6) {
                return null;
            }
            return new b24(typedValue2.getFraction(1.0f, 1.0f));
        }
        int complexUnit = typedValue2.getComplexUnit();
        if (complexUnit != 0) {
            return complexUnit != 1 ? v70.r(typedArray.getDimensionPixelSize(i, 0)) : new wb1(TypedValue.complexToFloat(typedValue2.data));
        }
        return new b24(TypedValue.complexToFloat(typedValue2.data));
    }

    public static final zw0 v(Context context, int i, fl2 fl2Var, zw0 zw0Var) {
        zw0 ma4Var;
        zw0Var.getClass();
        cx0 cx0Var = zw0Var.n;
        cx0 cx0Var2 = zw0Var.r;
        cx0 cx0Var3 = zw0Var.y;
        cx0 cx0Var4 = zw0Var.g;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, q24.y);
        typedArrayObtainStyledAttributes.getClass();
        cx0 cx0VarR = r(typedArrayObtainStyledAttributes, 1);
        cx0 cx0VarR2 = r(typedArrayObtainStyledAttributes, 4);
        cx0 cx0VarR3 = r(typedArrayObtainStyledAttributes, 5);
        cx0 cx0VarR4 = r(typedArrayObtainStyledAttributes, 2);
        cx0 cx0VarR5 = r(typedArrayObtainStyledAttributes, 3);
        boolean z = fl2Var == fl2.t;
        cx0 cx0Var5 = z ? cx0VarR3 : cx0VarR2;
        if (!z) {
            cx0VarR2 = cx0VarR3;
        }
        cx0 cx0Var6 = z ? cx0VarR5 : cx0VarR4;
        if (!z) {
            cx0VarR4 = cx0VarR5;
        }
        int i2 = typedArrayObtainStyledAttributes.getInt(0, 0);
        if (i2 == 0) {
            if (cx0Var5 != null) {
                cx0Var4 = cx0Var5;
            } else if (cx0VarR != null) {
                cx0Var4 = cx0VarR;
            }
            if (cx0VarR2 != null) {
                cx0Var3 = cx0VarR2;
            } else if (cx0VarR != null) {
                cx0Var3 = cx0VarR;
            }
            if (cx0VarR4 != null) {
                cx0Var2 = cx0VarR4;
            } else if (cx0VarR != null) {
                cx0Var2 = cx0VarR;
            }
            if (cx0Var6 != null) {
                cx0Var = cx0Var6;
            } else if (cx0VarR != null) {
                cx0Var = cx0VarR;
            }
            ma4Var = new ma4(cx0Var4, cx0Var3, cx0Var2, cx0Var);
        } else {
            if (i2 != 1) {
                l0.u("Unknown cornerFamily set in ShapeAppearance");
                return null;
            }
            if (cx0Var5 != null) {
                cx0Var4 = cx0Var5;
            } else if (cx0VarR != null) {
                cx0Var4 = cx0VarR;
            }
            if (cx0VarR2 != null) {
                cx0Var3 = cx0VarR2;
            } else if (cx0VarR != null) {
                cx0Var3 = cx0VarR;
            }
            if (cx0VarR4 != null) {
                cx0Var2 = cx0VarR4;
            } else if (cx0VarR != null) {
                cx0Var2 = cx0VarR;
            }
            if (cx0Var6 != null) {
                cx0Var = cx0Var6;
            } else if (cx0VarR != null) {
                cx0Var = cx0VarR;
            }
            ma4Var = new zy0(cx0Var4, cx0Var3, cx0Var2, cx0Var);
        }
        typedArrayObtainStyledAttributes.recycle();
        return ma4Var;
    }

    public static final k85 x(Context context, int i, j51 j51Var, lu1 lu1Var) {
        lu1 lu1Var2;
        qv1 qv1Var;
        ym4 ym4Var;
        lu1 lu1Var3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, q24.r);
        typedArrayObtainStyledAttributes.getClass();
        int i2 = typedArrayObtainStyledAttributes.getInt(2, -1);
        int i3 = typedArrayObtainStyledAttributes.getInt(13, -1);
        int i4 = typedArrayObtainStyledAttributes.getInt(1, -1);
        ou1 ou1VarN = n(typedArrayObtainStyledAttributes, 14);
        if (ou1VarN == null) {
            ou1VarN = n(typedArrayObtainStyledAttributes, 8);
        }
        long j = jj0.j;
        long j2 = n85.r;
        long jL = l(typedArrayObtainStyledAttributes, 0, j51Var, j2);
        long jL2 = l(typedArrayObtainStyledAttributes, 15, j51Var, l(typedArrayObtainStyledAttributes, 12, j51Var, j2));
        if (lu1Var == null) {
            if (ou1VarN != null) {
                lu1Var3 = ou1VarN.g;
            } else if (i4 == 1) {
                lu1Var3 = lu1.t;
            } else if (i4 == 2) {
                lu1Var3 = lu1.a;
            } else if (i4 == 3) {
                lu1Var3 = lu1.m;
            } else {
                lu1Var2 = null;
            }
            lu1Var2 = lu1Var3;
        } else {
            lu1Var2 = lu1Var;
        }
        int i5 = (i2 & 2) != 0 ? 1 : 0;
        if (i3 >= 0 && i3 < 150) {
            qv1Var = qv1.t;
        } else if (150 <= i3 && i3 < 250) {
            qv1Var = qv1.a;
        } else if (250 <= i3 && i3 < 350) {
            qv1Var = qv1.m;
        } else if (350 <= i3 && i3 < 450) {
            qv1Var = qv1.q;
        } else if (450 <= i3 && i3 < 550) {
            qv1Var = qv1.w;
        } else if (550 <= i3 && i3 < 650) {
            qv1Var = qv1.c;
        } else if (650 <= i3 && i3 < 750) {
            qv1Var = qv1.i;
        } else if (750 <= i3 && i3 < 850) {
            qv1Var = qv1.b;
        } else if (850 <= i3 && i3 < 1000) {
            qv1Var = qv1.s;
        } else if ((i2 & 1) != 0) {
            qv1Var = qv1.f;
        } else {
            qv1Var = ou1VarN != null ? ou1VarN.y : null;
        }
        String string = typedArrayObtainStyledAttributes.getString(10);
        long jY = y(typedArrayObtainStyledAttributes, 4);
        if (tf5.g(jY, j)) {
            ym4Var = null;
        } else {
            ym4Var = new ym4(jY, (((long) Float.floatToRawIntBits(typedArrayObtainStyledAttributes.getFloat(5, 0.0f))) << 32) | (((long) Float.floatToRawIntBits(typedArrayObtainStyledAttributes.getFloat(6, 0.0f))) & 4294967295L), typedArrayObtainStyledAttributes.getFloat(7, 0.0f));
        }
        k85 k85Var = new k85(j, jL, qv1Var, new lv1(i5), lu1Var2, string, typedArrayObtainStyledAttributes.hasValue(9) ? kq2.O(typedArrayObtainStyledAttributes.getFloat(9, 0.0f), 8589934592L) : kq2.O(0.0f, 8589934592L), ym4Var, 0, jL2, 16637712);
        typedArrayObtainStyledAttributes.recycle();
        return k85Var;
    }

    public static long y(TypedArray typedArray, int i) {
        long j = jj0.j;
        if (!typedArray.hasValue(i)) {
            return j;
        }
        if (typedArray.hasValue(i)) {
            return ra.n(typedArray.getColor(i, 0));
        }
        l0.u("Attribute not defined in set.");
        return 0L;
    }
}
