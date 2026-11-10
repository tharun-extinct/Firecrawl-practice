package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class o33 {
    public static final un4 g = new un4();
    public static Method r;
    public static boolean y;

    /* JADX WARN: Code duplicated, block: B:46:0x01aa  */
    public static final void g(Context context, boolean z, boolean z2, boolean z3, final boolean z4, nm0 nm0Var, h02 h02Var, final int i) {
        nm0 nm0Var2;
        final Context context2;
        final boolean z5;
        final boolean z6;
        final boolean z7;
        Context context3;
        boolean z8;
        boolean z9;
        boolean z10;
        Object objInvoke;
        rj0 rj0VarX;
        mf5 mf5Var;
        un4 un4Var;
        lu1 lu1Var;
        h02Var.Z(1166406812);
        int i2 = i | 3506;
        if (h02Var.N(i2 & 1, (599187 & i2) != 599186)) {
            h02Var.S();
            if ((i & 1) == 0 || h02Var.k()) {
                context3 = (Context) h02Var.a(sa.y);
                z8 = true;
                z9 = true;
                z10 = true;
            } else {
                h02Var.Q();
                context3 = context;
                z8 = z;
                z9 = z2;
                z10 = z3;
            }
            h02Var.s();
            Resources.Theme theme = context3.getTheme();
            theme.getClass();
            if (!y) {
                try {
                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("getKey", null);
                    declaredMethod.setAccessible(true);
                    r = declaredMethod;
                } catch (ReflectiveOperationException unused) {
                }
                y = true;
            }
            Method method = r;
            if (method != null) {
                try {
                    objInvoke = method.invoke(theme, null);
                } catch (ReflectiveOperationException unused2) {
                    objInvoke = og5.g;
                }
            } else {
                objInvoke = null;
            }
            if (objInvoke == null) {
                objInvoke = context3.getTheme();
            }
            fl2 fl2Var = (fl2) h02Var.a(hp0.c);
            boolean zX = h02Var.x(objInvoke);
            Object objK = h02Var.K();
            byte b = 2;
            if (zX || objK == oo0.g) {
                n51 n51VarL = k33.l(context3);
                fl2Var.getClass();
                TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(q24.g);
                typedArrayObtainStyledAttributes.getClass();
                if (!typedArrayObtainStyledAttributes.hasValue(38)) {
                    l0.u("createMdc3Theme requires the host context's theme to extend Theme.Material3");
                    return;
                }
                if (z8) {
                    boolean z11 = typedArrayObtainStyledAttributes.getBoolean(37, true);
                    long jY = t74.y(typedArrayObtainStyledAttributes, 18);
                    long jY2 = t74.y(typedArrayObtainStyledAttributes, 7);
                    long jY3 = t74.y(typedArrayObtainStyledAttributes, 20);
                    long jY4 = t74.y(typedArrayObtainStyledAttributes, 19);
                    long jY5 = t74.y(typedArrayObtainStyledAttributes, 8);
                    long jY6 = t74.y(typedArrayObtainStyledAttributes, 21);
                    long jY7 = t74.y(typedArrayObtainStyledAttributes, 9);
                    long jY8 = t74.y(typedArrayObtainStyledAttributes, 22);
                    long jY9 = t74.y(typedArrayObtainStyledAttributes, 10);
                    long jY10 = t74.y(typedArrayObtainStyledAttributes, 33);
                    long jY11 = t74.y(typedArrayObtainStyledAttributes, 14);
                    long jY12 = t74.y(typedArrayObtainStyledAttributes, 34);
                    long jY13 = t74.y(typedArrayObtainStyledAttributes, 15);
                    long jY14 = t74.y(typedArrayObtainStyledAttributes, 0);
                    long jY15 = t74.y(typedArrayObtainStyledAttributes, 4);
                    long jY16 = t74.y(typedArrayObtainStyledAttributes, 23);
                    long jY17 = t74.y(typedArrayObtainStyledAttributes, 11);
                    long jY18 = t74.y(typedArrayObtainStyledAttributes, 32);
                    long jY19 = t74.y(typedArrayObtainStyledAttributes, 13);
                    long jY20 = t74.y(typedArrayObtainStyledAttributes, 35);
                    long jY21 = t74.y(typedArrayObtainStyledAttributes, 31);
                    long jY22 = t74.y(typedArrayObtainStyledAttributes, 12);
                    long jY23 = t74.y(typedArrayObtainStyledAttributes, 16);
                    long jY24 = t74.y(typedArrayObtainStyledAttributes, 17);
                    long jY25 = t74.y(typedArrayObtainStyledAttributes, 2);
                    long jY26 = t74.y(typedArrayObtainStyledAttributes, 5);
                    long jY27 = t74.y(typedArrayObtainStyledAttributes, 3);
                    long jY28 = t74.y(typedArrayObtainStyledAttributes, 6);
                    long jY29 = t74.y(typedArrayObtainStyledAttributes, 39);
                    long jY30 = t74.y(typedArrayObtainStyledAttributes, 30);
                    long jY31 = t74.y(typedArrayObtainStyledAttributes, 24);
                    long jY32 = t74.y(typedArrayObtainStyledAttributes, 29);
                    long jY33 = t74.y(typedArrayObtainStyledAttributes, 28);
                    long jY34 = t74.y(typedArrayObtainStyledAttributes, 25);
                    long jY35 = t74.y(typedArrayObtainStyledAttributes, 26);
                    long jY36 = t74.y(typedArrayObtainStyledAttributes, 27);
                    rj0VarX = z11 ? tj0.x(jY, jY2, jY4, jY5, jY3, jY6, jY7, jY8, jY9, jY10, jY11, jY12, jY13, jY14, jY15, jY16, jY17, jY18, jY19, jY20, jY21, jY22, jY25, jY26, jY27, jY28, jY23, jY24, jY29, jY31, jY34, jY35, jY36, jY33, jY32, jY30, 0, 65520) : tj0.r(jY, jY2, jY4, jY5, jY3, jY6, jY7, jY8, jY9, jY10, jY11, jY12, jY13, jY14, jY15, jY16, jY17, jY18, jY19, jY20, jY21, jY22, jY25, jY26, jY27, jY28, jY23, jY24, jY29, jY31, jY34, jY35, jY36, jY33, jY32, jY30, 0, 65520);
                } else {
                    rj0VarX = null;
                }
                if (z9) {
                    if (z4) {
                        ou1 ou1VarN = t74.n(typedArrayObtainStyledAttributes, 36);
                        if (ou1VarN == null) {
                            ou1VarN = t74.n(typedArrayObtainStyledAttributes, 1);
                        }
                        if (ou1VarN != null) {
                            lu1Var = ou1VarN.g;
                        } else {
                            lu1Var = null;
                        }
                    } else {
                        lu1Var = null;
                    }
                    k85 k85VarX = t74.x(context3, mq2.m(typedArrayObtainStyledAttributes, 48), n51VarL, lu1Var);
                    k85 k85VarX2 = t74.x(context3, mq2.m(typedArrayObtainStyledAttributes, 49), n51VarL, lu1Var);
                    k85 k85VarX3 = t74.x(context3, mq2.m(typedArrayObtainStyledAttributes, 50), n51VarL, lu1Var);
                    k85 k85VarX4 = t74.x(context3, mq2.m(typedArrayObtainStyledAttributes, 51), n51VarL, lu1Var);
                    k85 k85VarX5 = t74.x(context3, mq2.m(typedArrayObtainStyledAttributes, 52), n51VarL, lu1Var);
                    k85 k85VarX6 = t74.x(context3, mq2.m(typedArrayObtainStyledAttributes, 53), n51VarL, lu1Var);
                    k85 k85VarX7 = t74.x(context3, mq2.m(typedArrayObtainStyledAttributes, 57), n51VarL, lu1Var);
                    k85 k85VarX8 = t74.x(context3, mq2.m(typedArrayObtainStyledAttributes, 58), n51VarL, lu1Var);
                    k85 k85VarX9 = t74.x(context3, mq2.m(typedArrayObtainStyledAttributes, 59), n51VarL, lu1Var);
                    k85 k85VarX10 = t74.x(context3, mq2.m(typedArrayObtainStyledAttributes, 45), n51VarL, lu1Var);
                    k85 k85VarX11 = t74.x(context3, mq2.m(typedArrayObtainStyledAttributes, 46), n51VarL, lu1Var);
                    k85 k85VarX12 = t74.x(context3, mq2.m(typedArrayObtainStyledAttributes, 47), n51VarL, lu1Var);
                    k85 k85VarX13 = t74.x(context3, mq2.m(typedArrayObtainStyledAttributes, 54), n51VarL, lu1Var);
                    k85 k85VarX14 = t74.x(context3, mq2.m(typedArrayObtainStyledAttributes, 55), n51VarL, lu1Var);
                    k85 k85VarX15 = t74.x(context3, mq2.m(typedArrayObtainStyledAttributes, 56), n51VarL, lu1Var);
                    mf5Var = new mf5(k85VarX, k85VarX2, k85VarX3, k85VarX4, k85VarX5, k85VarX6, k85VarX7, k85VarX8, k85VarX9, k85VarX10, k85VarX11, k85VarX12, k85VarX13, k85VarX14, k85VarX15, k85VarX, k85VarX2, k85VarX3, k85VarX4, k85VarX5, k85VarX6, k85VarX7, k85VarX8, k85VarX9, k85VarX10, k85VarX11, k85VarX12, k85VarX13, k85VarX14, k85VarX15);
                } else {
                    mf5Var = null;
                }
                if (z10) {
                    int iM = mq2.m(typedArrayObtainStyledAttributes, 41);
                    un4 un4Var2 = g;
                    un4Var = new un4(t74.v(context3, iM, fl2Var, un4Var2.g), t74.v(context3, mq2.m(typedArrayObtainStyledAttributes, 44), fl2Var, un4Var2.y), t74.v(context3, mq2.m(typedArrayObtainStyledAttributes, 43), fl2Var, un4Var2.r), t74.v(context3, mq2.m(typedArrayObtainStyledAttributes, 42), fl2Var, un4Var2.n), t74.v(context3, mq2.m(typedArrayObtainStyledAttributes, 40), fl2Var, un4Var2.v));
                } else {
                    un4Var = null;
                }
                s85 s85Var = new s85(rj0VarX, mf5Var, un4Var);
                typedArrayObtainStyledAttributes.recycle();
                h02Var.i0(s85Var);
                objK = s85Var;
            }
            s85 s85Var2 = (s85) objK;
            rj0 rj0Var = s85Var2.g;
            if (rj0Var == null) {
                h02Var.X(-69473305);
                rj0Var = (rj0) h02Var.a(tj0.g);
            } else {
                h02Var.X(-69474576);
            }
            h02Var.b(false);
            mf5 mf5Var2 = s85Var2.y;
            if (mf5Var2 == null) {
                h02Var.X(-69470938);
                mf5Var2 = (mf5) h02Var.a(of5.g);
            } else {
                h02Var.X(-69472178);
            }
            h02Var.b(false);
            mf5 mf5Var3 = mf5Var2;
            un4 un4Var3 = s85Var2.r;
            if (un4Var3 == null) {
                h02Var.X(-69468862);
                un4Var3 = (un4) h02Var.a(vn4.g);
            } else {
                h02Var.X(-69469978);
            }
            h02Var.b(false);
            nm0Var2 = nm0Var;
            j33.y(rj0Var, un4Var3, mf5Var3, ue5.m0(1530645064, new ws2(nm0Var2, b), h02Var), h02Var, 3072);
            context2 = context3;
            z5 = z8;
            z6 = z9;
            z7 = z10;
        } else {
            nm0Var2 = nm0Var;
            h02Var.Q();
            context2 = context;
            z5 = z;
            z6 = z2;
            z7 = z3;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            final nm0 nm0Var3 = nm0Var2;
            u34VarP.n = new bz1(context2, z5, z6, z7, z4, nm0Var3, i) { // from class: n33
                public final /* synthetic */ boolean a;
                public final /* synthetic */ Context j;
                public final /* synthetic */ boolean m;
                public final /* synthetic */ boolean q;
                public final /* synthetic */ boolean t;
                public final /* synthetic */ nm0 w;

                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(1794049);
                    o33.g(this.j, this.t, this.a, this.m, this.q, this.w, (h02) obj, iJ);
                    return og5.g;
                }
            };
        }
    }
}
