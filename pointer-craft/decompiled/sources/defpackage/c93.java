package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentContainerView;
import io.appground.blek.R;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class c93 {
    public static final oo A;
    public static final oo B;
    public static final oo C;
    public static final oo D;
    public static ha2 E;
    public static final /* synthetic */ int F = 0;
    public static final oo d;
    public static final oo e;
    public static final l76 h;
    public static final oo k;
    public static final ji o;
    public static final ri g = new ri(Float.POSITIVE_INFINITY);
    public static final si y = new si(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final ti r = new ti(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final ui n = new ui(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final ri v = new ri(Float.NEGATIVE_INFINITY);
    public static final si x = new si(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final ti l = new ti(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final ui j = new ui(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final in4 t = in4.q;
    public static final float a = 8.0f;
    public static final float m = 1.0f;
    public static final nm0 q = new nm0(1550266165, false, new xm0(23));
    public static final k14 w = new k14();
    public static final ky2 c = new ky2("REMOVED_TASK", (byte) 2);
    public static final ky2 i = new ky2("CLOSED_EMPTY", (byte) 2);
    public static final fn5 b = new fn5(0.31006f, 0.31616f);
    public static final fn5 s = new fn5(0.34567f, 0.3585f);
    public static final fn5 p = new fn5(0.32168f, 0.33767f);
    public static final fn5 u = new fn5(0.31271f, 0.32902f);
    public static final float[] z = {0.964212f, 1.0f, 0.825188f};
    public static final Object f = new Object();

    static {
        byte b2 = 12;
        h = new l76(b2);
        byte b3 = 1;
        o = new ji((Object) new rc4(b3), (Object) new rn3((byte) 19), (byte) 29);
        byte b4 = 4;
        k = new oo(b3, 2, b4);
        byte b5 = 5;
        d = new oo(3, b4, b5);
        byte b6 = 6;
        e = new oo(b4, b5, b6);
        byte b7 = 7;
        A = new oo(b6, b7, b7);
        byte b8 = 8;
        B = new oo(b7, b8, b8);
        byte b9 = 9;
        C = new oo(b8, b9, b9);
        D = new oo(11, b2, (byte) 10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A(wd1 wd1Var) {
        if (((i73) wd1Var).j.h) {
            k33.T(wd1Var, 1).g1();
        }
    }

    public static final void B(lm2 lm2Var) {
        k33.V(lm2Var).G();
    }

    public static float C(float f2, float[] fArr, float[] fArr2) {
        float f3;
        float f4;
        float f5;
        float fAbs = Math.abs(f2);
        float fSignum = Math.signum(f2);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i2 = -(iBinarySearch + 1);
        int i3 = i2 - 1;
        float f6 = 0.0f;
        if (i3 >= fArr.length - 1) {
            float f7 = fArr[fArr.length - 1];
            float f8 = fArr2[fArr.length - 1];
            if (f7 == 0.0f) {
                return 0.0f;
            }
            return (f8 / f7) * f2;
        }
        if (i3 == -1) {
            f3 = fArr[0];
            f4 = fArr2[0];
            f5 = 0.0f;
        } else {
            float f9 = fArr[i3];
            f3 = fArr[i2];
            f6 = fArr2[i3];
            f4 = fArr2[i2];
            f5 = f9;
        }
        return uz5.g(f6, f4, f5, f3, fAbs) * fSignum;
    }

    public static final View D(o41 o41Var) {
        if (!((i73) o41Var).j.h) {
            mc2.y("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) xm2.g(k33.V(o41Var));
    }

    public static final ne2 E(k44 k44Var) {
        return new ne2(Math.round(k44Var.g), Math.round(k44Var.y), Math.round(k44Var.r), Math.round(k44Var.n));
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
  (r0v0 int) from 0x0007: SWITCH (r0v0 int)
 case -1811142716: goto B:118:0x0130
 case -1811142715: goto B:113:0x0123
 case -1811142714: goto B:108:0x0116
 case -1811142713: goto B:103:0x0109
 case -1811142712: goto B:98:0x00fc
 case -1811142711: goto B:93:0x00ef
 case -1811142710: goto B:88:0x00e2
 case -1811142709: goto B:83:0x00d5
 case -1811142708: goto B:78:0x00c8
 case -1811142707: goto B:73:0x00bb
 default: goto B:5:0x000a A[RegionRef:SW:4] (LINE:8)
  (r0v0 int) from 0x000a: SWITCH (r0v0 int)
 case -1811142685: goto B:68:0x00ae
 case -1811142684: goto B:63:0x00a1
 case -1811142683: goto B:58:0x0094
 default: goto B:6:0x000d A[RegionRef:SW:5] (LINE:11)
  (r0v0 int) from 0x000d: SWITCH (r0v0 int)
 case 80123371: goto B:53:0x0087
 case 80123372: goto B:48:0x007a
 case 80123373: goto B:43:0x006d
 case 80123374: goto B:38:0x0060
 case 80123375: goto B:33:0x0053
 case 80123376: goto B:28:0x0046
 case 80123377: goto B:23:0x0039
 case 80123378: goto B:18:0x002c
 case 80123379: goto B:13:0x001f
 case 80123380: goto B:8:0x0012
 default: goto B:313:? A[RegionRef:SW:6] (LINE:14)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String F(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "Companion";
            case "java.lang.Integer":
                return "Int";
            case "java.lang.Cloneable":
                return "Cloneable";
            case "java.lang.annotation.Annotation":
                return "Annotation";
            case "java.lang.Comparable":
                return "Comparable";
            case "java.util.Map":
                return "Map";
            case "java.util.Set":
                return "Set";
            case "double":
                return "Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "Companion";
            case "java.lang.CharSequence":
                return "CharSequence";
            case "java.util.Collection":
                return "Collection";
            case "java.lang.Float":
                return "Float";
            case "java.lang.Short":
                return "Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "Companion";
            case "java.util.Map$Entry":
                return "Entry";
            case "int":
                return "Int";
            case "byte":
                return "Byte";
            case "char":
                return "Char";
            case "long":
                return "Long";
            case "boolean":
                return "Boolean";
            case "java.util.List":
                return "List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "Companion";
            case "float":
                return "Float";
            case "short":
                return "Short";
            case "java.lang.Character":
                return "Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "Companion";
            case "java.lang.Boolean":
                return "Boolean";
            case "java.lang.Byte":
                return "Byte";
            case "java.lang.Enum":
                return "Enum";
            case "java.lang.Long":
                return "Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "Companion";
            case "java.util.Iterator":
                return "Iterator";
            case "java.util.ListIterator":
                return "ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "Companion";
            case "java.lang.Double":
                return "Double";
            case "java.lang.Number":
                return "Number";
            case "java.lang.Object":
                return "Any";
            case "java.lang.String":
                return "String";
            case "java.lang.Iterable":
                return "Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "Companion";
            case "java.lang.Throwable":
                return "Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static String G(int i2) {
        if (i2 == -1) {
            return "Unspecified";
        }
        if (i2 == 0) {
            return "None";
        }
        if (i2 == 1) {
            return "Characters";
        }
        if (i2 == 2) {
            return "Words";
        }
        return i2 == 3 ? "Sentences" : "Invalid";
    }

    public static final void H(int i2, int i3) {
        if (i2 <= 0 || i3 <= 0) {
            pc2.g("both minLines " + i2 + " and maxLines " + i3 + " must be greater than zero");
        }
        if (i2 <= i3) {
            return;
        }
        pc2.g("minLines " + i2 + " must be less than or equal to maxLines " + i3);
    }

    public static final void a(qk4 qk4Var, es4 es4Var, my1 my1Var, h02 h02Var, int i2) {
        h02Var.Z(-706246262);
        int i3 = (h02Var.n(qk4Var == null ? -1 : qk4Var.ordinal()) ? 4 : 2) | i2 | (h02Var.x(es4Var) ? 32 : 16) | (h02Var.j(my1Var) ? 256 : 128);
        if (!h02Var.N(i3 & 1, (i3 & 147) != 146)) {
            h02Var.Q();
        } else if (qk4Var == null) {
            h02Var.X(1262562921);
            h02Var.b(false);
        } else {
            h02Var.X(1262562922);
            String strI = xs2.I(R.string.error_text_input, h02Var);
            boolean zN = ((i3 & 112) == 32) | h02Var.n(qk4Var.ordinal()) | h02Var.x(strI) | ((i3 & 896) == 256);
            Object objK = h02Var.K();
            if (zN || objK == oo0.g) {
                Object s3Var = new s3(qk4Var, es4Var, strI, my1Var, (mu0) null);
                h02Var.i0(s3Var);
                objK = s3Var;
            }
            k33.b((bz1) objK, h02Var, qk4Var);
            h02Var.b(false);
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new nn(qk4Var, es4Var, my1Var, i2, (byte) 1);
        }
    }

    public static final void b(Context context, List list, h02 h02Var, int i2) {
        h02Var.Z(2006478778);
        int i3 = (h02Var.j(context) ? 4 : 2) | i2 | (h02Var.x(list) ? 32 : 16);
        byte b2 = 0;
        if (h02Var.N(i3 & 1, (i3 & 19) != 18)) {
            boolean zJ = h02Var.j(context) | ((i3 & 112) == 32);
            Object objK = h02Var.K();
            if (zJ || objK == oo0.g) {
                objK = new fp(context, list, null, b2);
                h02Var.i0(objK);
            }
            k33.b((bz1) objK, h02Var, list);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new vn((byte) 3, i2, context, list);
        }
    }

    public static final void c(int i2, my1 my1Var, h02 h02Var, j73 j73Var) {
        h02 h02Var2 = h02Var;
        my1Var.getClass();
        h02Var2.Z(-2097852404);
        int i3 = i2 | (h02Var.x(j73Var) ? 32 : 16);
        if (h02Var2.N(i3 & 1, (i3 & 19) != 18)) {
            Object objK = h02Var2.K();
            l76 l76Var = oo0.g;
            if (objK == l76Var) {
                objK = k33.E(h02Var2);
                h02Var2.i0(objK);
            }
            ox0 ox0Var = (ox0) objK;
            List listD = pw5.d(new kk3(R.drawable.ic_control, Integer.valueOf(R.string.onboarding_title_1), R.string.onboarding_message_1), new kk3(R.drawable.ic_tv_remote, null, R.string.onboarding_message_3), new kk3(R.drawable.ic_bluetooth_devices, null, R.string.onboarding_message_2));
            j73 j73VarA = og0.a(j73Var.n(mq4.r), ((rj0) h02Var2.a(tj0.g)).c, yf2.b);
            ek0 ek0VarG = ck0.g(v70.n, hi0.h, h02Var2, 0);
            int iHashCode = Long.hashCode(h02Var2.T);
            tr3 tr3VarQ = h02Var2.q();
            j73 j73VarW = m50.W(h02Var2, j73VarA);
            jo0.n.getClass();
            h02Var2.b0();
            if (h02Var2.S) {
                h02Var2.m(um2.Z);
            } else {
                h02Var2.l0();
            }
            xs2.E(tg1.w, h02Var2, ek0VarG);
            xs2.E(tg1.q, h02Var2, tr3VarQ);
            xs2.E(tg1.c, h02Var2, Integer.valueOf(iHashCode));
            xs2.D(h02Var2);
            xs2.E(tg1.m, h02Var2, j73VarW);
            boolean zX = h02Var2.x(listD);
            Object objK2 = h02Var2.K();
            if (zX || objK2 == l76Var) {
                objK2 = new gf((Object) listD, (byte) 23);
                h02Var2.i0(objK2);
            }
            my1 my1Var2 = (my1) objK2;
            yo3 yo3Var = zo3.g;
            Object[] objArr = new Object[0];
            ji jiVar = u21.G;
            boolean zN = h02Var2.n(0) | h02Var2.r(0.0f) | h02Var2.x(my1Var2);
            Object objK3 = h02Var2.K();
            if (zN || objK3 == l76Var) {
                objK3 = new gf((Object) my1Var2, (byte) 24);
                h02Var2.i0(objK3);
            }
            u21 u21Var = (u21) xq2.d(objArr, jiVar, (my1) objK3, h02Var2, 0);
            u21Var.F.setValue(my1Var2);
            g73 g73Var = g73.g;
            js2.g(u21Var, mq4.r(gk0.g(g73Var, 4.0f), 1.0f), null, null, null, null, false, null, null, null, ue5.m0(1777630403, new jd(listD, (byte) 4), h02Var2), h02Var, 0);
            Boolean boolValueOf = Boolean.valueOf(u21Var.m() == listD.size() - 1);
            i00 i00Var = hi0.o;
            y94.y(boolValueOf, new d72(i00Var), null, null, null, null, ue5.m0(-1330709499, new ua4((Object) my1Var, (Object) ox0Var, (Object) u21Var, (byte) 4), h02Var), h02Var, 1572864, 60);
            h02Var2 = h02Var;
            j(listD.size(), u21Var.m(), ue5.i0(g73Var, 0.0f, 32.0f, 0.0f, 16.0f, 5).n(new d72(i00Var)), 0L, 0.0f, 0.0f, 0.0f, 0L, h02Var2, 0);
            h02Var2.b(true);
        } else {
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new hy1(my1Var, j73Var, i2);
        }
    }

    public static final hx0 d(Executor executor) {
        return new bm1(executor);
    }

    public static final void e(nu4 nu4Var) {
        int i2 = nu4Var.m;
        int[] iArr = nu4Var.t;
        Object[] objArr = nu4Var.a;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        nu4Var.j = false;
        nu4Var.m = i3;
    }

    public static int f(Comparable comparable, Comparable comparable2) {
        if (comparable == null) {
            return comparable2 == null ? 0 : -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final void g(final Class cls, j73 j73Var, final qx1 qx1Var, final wt2 wt2Var, xy1 xy1Var, h02 h02Var, int i2) {
        j73 j73Var2;
        wt2 wt2Var2;
        Object obj;
        final ww1 ww1Var;
        final kx1 kx1Var;
        Object obj2 = Bundle.EMPTY;
        h02Var.Z(1148251591);
        int i3 = i2 | (h02Var.j(cls) ? 4 : 2) | (h02Var.x(qx1Var) ? 256 : 128) | (h02Var.j(obj2) ? 2048 : 1024) | (h02Var.n(wt2Var == null ? -1 : wt2Var.ordinal()) ? 16384 : 8192);
        if ((i2 & 196608) == 0) {
            i3 |= h02Var.j(xy1Var) ? 131072 : 65536;
        }
        int i4 = i3;
        if (h02Var.N(i4 & 1, (74899 & i4) != 74898)) {
            h02Var.S();
            if ((i2 & 1) != 0 && !h02Var.k()) {
                h02Var.Q();
            }
            h02Var.s();
            final ob3 ob3VarQ = kq2.Q(xy1Var, h02Var);
            final int iS = pw5.s(h02Var);
            View view = (View) h02Var.a(sa.x);
            boolean zX = h02Var.x(view);
            Object objK = h02Var.K();
            Object obj3 = oo0.g;
            if (zX || objK == obj3) {
                objK = kx1.F(view);
                h02Var.i0(objK);
            }
            kx1 kx1Var2 = (kx1) objK;
            final Context context = (Context) h02Var.a(sa.y);
            Object objK2 = h02Var.K();
            if (objK2 == obj3) {
                objK2 = new ww1(iS);
                h02Var.i0(objK2);
            }
            ww1 ww1Var2 = (ww1) objK2;
            j73Var2 = j73Var;
            k33.y(ww1Var2, j73Var2, null, h02Var, 48);
            Object[] objArr = {kx1Var2, ww1Var2, cls, qx1Var};
            boolean zJ = h02Var.j(kx1Var2) | h02Var.j(ww1Var2) | h02Var.j(context) | h02Var.j(cls);
            boolean zJ2 = h02Var.j(obj2) | ((((i4 & 896) ^ 384) > 256 && h02Var.x(qx1Var)) || (i4 & 384) == 256) | zJ | h02Var.n(iS);
            int i5 = (57344 & i4) ^ 24576;
            boolean zX2 = zJ2 | ((i5 > 16384 && h02Var.n(wt2Var.ordinal())) || (i4 & 24576) == 16384) | h02Var.x(ob3VarQ);
            Object objK3 = h02Var.K();
            if (zX2 || objK3 == obj3) {
                ww1Var = ww1Var2;
                kx1Var = kx1Var2;
                obj = new xy1() { // from class: ac
                    {
                        Bundle bundle = Bundle.EMPTY;
                    }

                    @Override // defpackage.xy1
                    public final Object a(Object obj4) {
                        Bundle bundle;
                        Bundle bundle2 = Bundle.EMPTY;
                        q54 q54Var = new q54();
                        ww1 ww1Var3 = ww1Var;
                        int id = ww1Var3.n().getId();
                        kx1 kx1Var3 = kx1Var;
                        pw1 pw1VarD = kx1Var3.D(id);
                        qx1 qx1Var2 = qx1Var;
                        if (pw1VarD == null) {
                            ex1 ex1VarK = kx1Var3.K();
                            context.getClassLoader();
                            pw1VarD = ex1VarK.g(cls.getName());
                            ow1 ow1Var = (ow1) qx1Var2.g.getValue();
                            if (pw1VarD.A != null) {
                                l0.z("Fragment already added");
                                return null;
                            }
                            if (ow1Var == null || (bundle = ow1Var.j) == null) {
                                bundle = null;
                            }
                            pw1VarD.t = bundle;
                            pw1VarD.Q(bundle2);
                            fw fwVar = new fw(kx1Var3);
                            fwVar.i = true;
                            FragmentContainerView fragmentContainerViewN = ww1Var3.n();
                            String strValueOf = String.valueOf(iS);
                            pw1VarD.N = fragmentContainerViewN;
                            pw1VarD.f = true;
                            fwVar.x(fragmentContainerViewN.getId(), pw1VarD, strValueOf, 1);
                            wt2 wt2Var3 = wt2.a;
                            wt2 wt2Var4 = wt2Var;
                            if (wt2Var4.compareTo(wt2Var3) >= 0) {
                                fwVar.t(pw1VarD, wt2Var4);
                            }
                            boolean zS = kx1Var3.S();
                            kx1 kx1Var4 = fwVar.s;
                            if (zS) {
                                q54Var.j = true;
                                pw1VarD.X.g(new ec(q54Var, pw1VarD, (byte) 0));
                                if (fwVar.l) {
                                    l0.z("This transaction is already being added to the back stack");
                                    return null;
                                }
                                kx1Var4.B(fwVar, true);
                            } else {
                                if (fwVar.l) {
                                    l0.z("This transaction is already being added to the back stack");
                                    return null;
                                }
                                kx1Var4.B(fwVar, false);
                            }
                        }
                        kx1Var3.V(ww1Var3.n());
                        ((xy1) ob3VarQ.getValue()).a(pw1VarD);
                        return new dc(kx1Var3, pw1VarD, qx1Var2, q54Var);
                    }
                };
                wt2Var2 = wt2Var;
                h02Var.i0(obj);
            } else {
                wt2Var2 = wt2Var;
                obj = objK3;
                ww1Var = ww1Var2;
                kx1Var = kx1Var2;
            }
            k33.a(objArr, (xy1) obj, h02Var);
            boolean zJ3 = h02Var.j(kx1Var) | h02Var.j(ww1Var) | ((i5 > 16384 && h02Var.n(wt2Var2.ordinal())) || (i4 & 24576) == 16384);
            Object objK4 = h02Var.K();
            if (zJ3 || objK4 == obj3) {
                objK4 = new bc((Object) kx1Var, (Object) ww1Var, (Object) wt2Var2, (byte) 0);
                h02Var.i0(objK4);
            }
            k33.j(wt2Var2, (xy1) objK4, h02Var);
        } else {
            j73Var2 = j73Var;
            wt2Var2 = wt2Var;
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new cc(cls, j73Var2, qx1Var, wt2Var2, xy1Var, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(cc4 cc4Var, Throwable th) {
        boolean zIsTerminated;
        if (cc4Var != 0) {
            if (th != null) {
                try {
                    du4.A(cc4Var);
                    return;
                } catch (Throwable th2) {
                    kf6.g(th, th2);
                    return;
                }
            }
            if (cc4Var instanceof AutoCloseable) {
                cc4Var.close();
                return;
            }
            if (!(cc4Var instanceof ExecutorService)) {
                if (cc4Var instanceof TypedArray) {
                    ((TypedArray) cc4Var).recycle();
                    return;
                }
                if (cc4Var instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) cc4Var).release();
                    return;
                } else if (cc4Var instanceof MediaDrm) {
                    ((MediaDrm) cc4Var).release();
                    return;
                } else {
                    t94.g();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) cc4Var;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z2 = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z2) {
                        executorService.shutdownNow();
                        z2 = true;
                    }
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static final void i(my1 my1Var, j73 j73Var, boolean z2, cn4 cn4Var, a80 a80Var, z40 z40Var, zn3 zn3Var, nm0 nm0Var, h02 h02Var, int i2, int i3) {
        int i4;
        a80 a80VarR;
        z40 z40Var2;
        j73 j73Var2;
        boolean z3;
        zn3 zn3Var2;
        a80 a80Var2;
        z40 z40Var3;
        cn4 cn4Var2;
        j73 j73Var3;
        int i5;
        z40 z40VarX;
        a80 a80Var3;
        cn4 cn4Var3;
        boolean z4;
        h02Var.Z(399974542);
        if ((i2 & 6) == 0) {
            i4 = (h02Var.j(my1Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= h02Var.x(j73Var) ? 32 : 16;
        }
        int i7 = i4 | 384;
        if ((i2 & 3072) == 0) {
            i7 = i4 | 1408;
        }
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                a80VarR = a80Var;
                int i8 = h02Var.x(a80VarR) ? 16384 : 8192;
                i7 |= i8;
            } else {
                a80VarR = a80Var;
            }
            i7 |= i8;
        } else {
            a80VarR = a80Var;
        }
        int i9 = i7 | 196608;
        if ((1572864 & i2) == 0) {
            if ((i3 & 64) == 0) {
                z40Var2 = z40Var;
                int i10 = h02Var.x(z40Var2) ? 1048576 : 524288;
                i9 |= i10;
            } else {
                z40Var2 = z40Var;
            }
            i9 |= i10;
        } else {
            z40Var2 = z40Var;
        }
        int i11 = i9 | 113246208;
        if ((805306368 & i2) == 0) {
            i11 |= h02Var.j(nm0Var) ? 536870912 : 268435456;
        }
        if (h02Var.N(i11 & 1, (306783379 & i11) != 306783378)) {
            h02Var.S();
            if ((i2 & 1) == 0 || h02Var.k()) {
                j73Var3 = i6 != 0 ? g73.g : j73Var;
                bo3 bo3Var = b80.g;
                cn4 cn4VarY = vn4.y(t, h02Var);
                i5 = i11 & (-7169);
                if ((i3 & 16) != 0) {
                    a80VarR = b80.r((rj0) h02Var.a(tj0.g));
                    i5 = i11 & (-64513);
                }
                if ((i3 & 64) != 0) {
                    h02Var.X(-112346942);
                    long jV = tj0.v(gp4.D, h02Var);
                    h02Var.b(false);
                    z40VarX = gp4.x(m, jV);
                    i5 &= -3670017;
                } else {
                    z40VarX = z40Var2;
                }
                z40Var3 = z40VarX;
                zn3Var2 = b80.g;
                a80Var3 = a80VarR;
                cn4Var3 = cn4VarY;
                z4 = true;
            } else {
                h02Var.Q();
                int i12 = i11 & (-7169);
                if ((i3 & 16) != 0) {
                    i12 = i11 & (-64513);
                }
                if ((i3 & 64) != 0) {
                    i12 &= -3670017;
                }
                z4 = z2;
                cn4Var3 = cn4Var;
                zn3Var2 = zn3Var;
                i5 = i12;
                z40Var3 = z40Var2;
                j73Var3 = j73Var;
                a80Var3 = a80VarR;
            }
            h02Var.s();
            x(my1Var, j73Var3, z4, cn4Var3, a80Var3, null, z40Var3, zn3Var2, nm0Var, h02Var, i5 & 2147483646, 0);
            a80Var2 = a80Var3;
            cn4Var2 = cn4Var3;
            z3 = z4;
            j73Var2 = j73Var3;
        } else {
            h02Var.Q();
            j73Var2 = j73Var;
            z3 = z2;
            zn3Var2 = zn3Var;
            a80Var2 = a80VarR;
            z40Var3 = z40Var2;
            cn4Var2 = cn4Var;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new l90(my1Var, j73Var2, z3, cn4Var2, a80Var2, z40Var3, zn3Var2, nm0Var, i2, i3);
        }
    }

    public static final void j(final int i2, final int i3, final j73 j73Var, long j2, float f2, float f3, float f4, long j3, h02 h02Var, final int i4) {
        final long j4;
        final float f5;
        final float f6;
        final float f7;
        final long j5;
        long j6;
        float f8;
        float f9;
        long j7;
        float f10;
        h02Var.Z(-2054094320);
        byte b2 = 2;
        int i5 = i4 | (h02Var.n(i2) ? 4 : 2) | (h02Var.n(i3) ? 32 : 16) | (h02Var.x(j73Var) ? 256 : 128) | 106652672;
        if (h02Var.N(i5 & 1, (38347923 & i5) != 38347922)) {
            h02Var.S();
            if ((i4 & 1) == 0 || h02Var.k()) {
                vf1 vf1Var = tj0.g;
                j6 = ((rj0) h02Var.a(vf1Var)).g;
                long j8 = ((rj0) h02Var.a(vf1Var)).p;
                f8 = 4.0f;
                f9 = 8.0f;
                j7 = j8;
                f10 = 4.0f;
            } else {
                h02Var.Q();
                j6 = j2;
                f9 = f2;
                f8 = f3;
                f10 = f4;
                j7 = j3;
            }
            h02Var.s();
            kb4 kb4VarG = jb4.g(new yq(f8, true, new l0(b2)), hi0.p, h02Var, 0);
            float f11 = f10;
            int iHashCode = Long.hashCode(h02Var.T);
            tr3 tr3VarQ = h02Var.q();
            j73 j73VarW = m50.W(h02Var, j73Var);
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
            h02Var.X(798403753);
            int i6 = 0;
            while (i6 < i2) {
                z50.g(y94.s(og0.a(mq4.j(g73.g, f9), i6 == i3 ? j6 : j7, na4.y(f11)), 0.0f, j7, na4.y(f11)), h02Var, 0);
                i6++;
            }
            h02Var.b(false);
            h02Var.b(true);
            f6 = f8;
            j4 = j6;
            f7 = f11;
            f5 = f9;
            j5 = j7;
        } else {
            h02Var.Q();
            j4 = j2;
            f5 = f2;
            f6 = f3;
            f7 = f4;
            j5 = j3;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1(i2, i3, j73Var, j4, f5, f6, f7, j5, i4) { // from class: lk3
                public final /* synthetic */ j73 a;
                public final /* synthetic */ float c;
                public final /* synthetic */ long i;
                public final /* synthetic */ int j;
                public final /* synthetic */ long m;
                public final /* synthetic */ float q;
                public final /* synthetic */ int t;
                public final /* synthetic */ float w;

                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(1);
                    c93.j(this.j, this.t, this.a, this.m, this.q, this.w, this.c, this.i, (h02) obj, iJ);
                    return og5.g;
                }
            };
        }
    }

    public static final int k(float f2, float f3, float f4, int i2, int i3) {
        if (i2 == i3) {
            return -1;
        }
        int i4 = i2 - 2;
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = i2 - 1;
        return k33.Z((f4 * (i5 <= 1 ? i5 : 1)) + (f3 * i4) + f2);
    }

    public static final void l(final boolean z2, h02 h02Var, final int i2) {
        h02 h02Var2;
        h02Var.Z(1481834636);
        int i3 = (h02Var.l(z2) ? 4 : 2) | i2;
        if (h02Var.N(i3 & 1, (i3 & 3) != 2)) {
            h02Var2 = h02Var;
            y94.l(Boolean.valueOf(z2), null, null, "LinearProgressIndicator", m50.x, h02Var2, (i3 & 14) | 27648, 6);
        } else {
            h02Var2 = h02Var;
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1(z2, i2) { // from class: to
                public final /* synthetic */ boolean j;

                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(1);
                    c93.l(this.j, (h02) obj, iJ);
                    return og5.g;
                }
            };
        }
    }

    public static final void m(String str, my1 my1Var, h02 h02Var, int i2) {
        String str2;
        h02 h02Var2;
        h02Var.Z(1479090132);
        byte b2 = 2;
        int i3 = (h02Var.x(str) ? 4 : 2) | i2 | (h02Var.j(my1Var) ? 32 : 16);
        byte b3 = 1;
        if (h02Var.N(i3 & 1, (i3 & 19) != 18)) {
            str2 = str;
            h02Var2 = h02Var;
            ra.y(str2, 0L, ue5.m0(1799965218, new ab4(my1Var, b2), h02Var), h02Var2, (i3 & 14) | 384, 2);
        } else {
            str2 = str;
            h02Var2 = h02Var;
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new vn(b3, i2, str2, my1Var);
        }
    }

    public static final void n(final nk nkVar, final boolean z2, final qr0 qr0Var, final nm0 nm0Var, final nm0 nm0Var2, h02 h02Var, final int i2) {
        long j2;
        ob3 ob3Var;
        int i3;
        nkVar.getClass();
        qr0Var.getClass();
        h02Var.Z(-436657821);
        byte b2 = 2;
        int i4 = i2 | (h02Var.j(nkVar) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i4 |= h02Var.l(z2) ? 32 : 16;
        }
        int i5 = i4 | (h02Var.j(qr0Var) ? 256 : 128);
        if (h02Var.N(i5 & 1, (i5 & 9363) != 9362)) {
            j14 j14Var = sa.y;
            Context context = (Context) h02Var.a(j14Var);
            ob3 ob3VarJ = v13.j(qr0Var.m, h02Var);
            ob3 ob3VarL = v13.l(qr0Var.q, pi1.j, h02Var, 48, 2);
            boolean zX = h02Var.x((List) ob3VarL.getValue());
            Object objK = h02Var.K();
            Object obj = oo0.g;
            if (zX || objK == obj) {
                objK = pt4.y(new ln(ob3VarL, b2));
                h02Var.i0(objK);
            }
            final bw4 bw4Var = (bw4) objK;
            qq0 qq0VarA = qr0Var.a();
            final ob3 ob3VarJ2 = v13.j(qr0Var.c, h02Var);
            final ob3 ob3VarJ3 = v13.j(qr0Var.i, h02Var);
            if (nkVar.r) {
                h02Var.X(1278655594);
                j2 = ((rj0) h02Var.a(tj0.g)).b;
            } else {
                h02Var.X(1278656845);
                j2 = ((rj0) h02Var.a(tj0.g)).c;
            }
            h02Var.b(false);
            final bw4 bw4VarG = aq4.g(j2, null, null, h02Var, 0, 14);
            final nf3 nf3Var = (nf3) h02Var.a(nx2.g);
            es4 es4Var = (es4) h02Var.a(gp0.r);
            final ob3 ob3VarJ4 = v13.j(qr0Var.A, h02Var);
            yl0 yl0VarF = gp4.F((Context) h02Var.a(j14Var));
            final ob3 ob3VarJ5 = v13.j(((wm4) js2.A(v54.g(wm4.class), yl0VarF, gp4.N(xs2.d(yl0VarF), h02Var), xs2.k(yl0VarF), h02Var)).l, h02Var);
            qk4 qk4Var = (qk4) ob3VarJ3.getValue();
            int i6 = i5 & 896;
            boolean z3 = i6 == 256 || h02Var.j(qr0Var);
            Object objK2 = h02Var.K();
            if (z3 || objK2 == obj) {
                objK2 = new rn(qr0Var, (byte) 4);
                h02Var.i0(objK2);
            }
            a(qk4Var, es4Var, (my1) objK2, h02Var, 0);
            if (qq0VarA.y != null) {
                h02Var.X(984155788);
                t32 t32Var = qq0VarA.y;
                ob3Var = ob3VarJ;
                boolean zJ = h02Var.j(qq0VarA) | (i6 == 256 || h02Var.j(qr0Var)) | h02Var.x(ob3Var) | h02Var.j(nf3Var);
                Object objK3 = h02Var.K();
                if (zJ || objK3 == obj) {
                    Object dpVar = new dp(qq0VarA, qr0Var, ob3Var, nf3Var, (mu0) null);
                    h02Var.i0(dpVar);
                    objK3 = dpVar;
                }
                k33.b((bz1) objK3, h02Var, t32Var);
                i3 = 0;
                h02Var.b(false);
            } else {
                qq0VarA = qq0VarA;
                nf3Var = nf3Var;
                ob3Var = ob3VarJ;
                i3 = 0;
                h02Var.X(984450815);
                h02Var.b(false);
            }
            b(context, (List) bw4Var.getValue(), h02Var, i3);
            final ob3 ob3Var2 = ob3Var;
            nm0 nm0VarM0 = ue5.m0(-572142809, new bz1() { // from class: zo
                @Override // defpackage.bz1
                public final Object l(Object obj2, Object obj3) {
                    h02 h02Var2 = (h02) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    byte b3 = 0;
                    if (h02Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                        ex4 ex4Var = (ex4) ob3VarJ2.getValue();
                        long j3 = ((jj0) bw4VarG.getValue()).g;
                        g61 g61Var = (g61) ob3Var2.getValue();
                        List list = (List) bw4Var.getValue();
                        my1 my1Var = nf3Var.g;
                        qr0 qr0Var2 = qr0Var;
                        boolean zJ2 = h02Var2.j(qr0Var2);
                        Object objK4 = h02Var2.K();
                        if (zJ2 || objK4 == oo0.g) {
                            objK4 = new cp(qr0Var2, b3);
                            h02Var2.i0(objK4);
                        }
                        c93.v(nkVar, ex4Var, nm0Var, j3, g61Var, list, my1Var, (xy1) objK4, h02Var2, 8);
                    } else {
                        h02Var2.Q();
                    }
                    return og5.g;
                }
            }, h02Var);
            nm0 nm0VarM1 = ue5.m0(-1979868759, new f(es4Var, (byte) 6), h02Var);
            long j3 = ((jj0) bw4VarG.getValue()).g;
            lg5 lg5VarQ = mq2.q(h02Var);
            WeakHashMap weakHashMap = yp5.k;
            final qq0 qq0Var = qq0VarA;
            kq2.v(null, nm0VarM0, null, nm0VarM1, null, 0, j3, 0L, new lg5(lg5VarQ, v13.t(h02Var).r), ue5.m0(1462415282, new cz1() { // from class: ap
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // defpackage.cz1
                public final Object x(Object obj2, Object obj3, Object obj4) {
                    g61 g61Var;
                    g61 g61Var2;
                    zn3 zn3Var = (zn3) obj2;
                    h02 h02Var2 = (h02) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    zn3Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= h02Var2.x(zn3Var) ? 4 : 2;
                    }
                    boolean z4 = false;
                    if (h02Var2.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                        g73 g73Var = g73.g;
                        j73 j73VarD0 = ue5.d0(g73Var, zn3Var);
                        ho1 ho1Var = mq4.r;
                        j73 j73VarN = j73VarD0.n(ho1Var);
                        t33 t33VarR = z50.r(hi0.t, false);
                        int iHashCode = Long.hashCode(h02Var2.T);
                        tr3 tr3VarQ = h02Var2.q();
                        j73 j73VarW = m50.W(h02Var2, j73VarN);
                        jo0.n.getClass();
                        h02Var2.b0();
                        boolean z5 = h02Var2.S;
                        sx1 sx1Var = um2.Z;
                        if (z5) {
                            h02Var2.m(sx1Var);
                        } else {
                            h02Var2.l0();
                        }
                        on0 on0Var = tg1.w;
                        xs2.E(on0Var, h02Var2, t33VarR);
                        on0 on0Var2 = tg1.q;
                        xs2.E(on0Var2, h02Var2, tr3VarQ);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        on0 on0Var3 = tg1.c;
                        xs2.E(on0Var3, h02Var2, numValueOf);
                        xs2.D(h02Var2);
                        on0 on0Var4 = tg1.m;
                        xs2.E(on0Var4, h02Var2, j73VarW);
                        ek0 ek0VarG = ck0.g(v70.n, hi0.h, h02Var2, 0);
                        int iHashCode2 = Long.hashCode(h02Var2.T);
                        tr3 tr3VarQ2 = h02Var2.q();
                        j73 j73VarW2 = m50.W(h02Var2, ho1Var);
                        h02Var2.b0();
                        if (h02Var2.S) {
                            h02Var2.m(sx1Var);
                        } else {
                            h02Var2.l0();
                        }
                        xs2.E(on0Var, h02Var2, ek0VarG);
                        xs2.E(on0Var2, h02Var2, tr3VarQ2);
                        du4.k(iHashCode2, h02Var2, on0Var3, h02Var2);
                        xs2.E(on0Var4, h02Var2, j73VarW2);
                        boolean z6 = nkVar.n;
                        bw4 bw4Var2 = ob3Var2;
                        c93.l(z6 && (((g61Var = (g61) bw4Var2.getValue()) != null && g61Var.c == 1) || (((g61Var2 = (g61) bw4Var2.getValue()) != null && g61Var2.m == 11) || yf2.p((ex4) ob3VarJ2.getValue(), dx4.y))) && ((qk4) ob3VarJ3.getValue()) == null, h02Var2, 0);
                        byte b3 = 6;
                        nm0Var2.x(gk0.g, h02Var2, 6);
                        h02Var2.b(true);
                        boolean z7 = z2;
                        qr0 qr0Var2 = qr0Var;
                        if (z7) {
                            h02Var2.X(1444742620);
                            m50.h(qr0Var2, (g61) bw4Var2.getValue(), h02Var2, 8);
                            m50.a(qr0Var2, h02Var2, 8);
                            h02Var2.b(false);
                        } else {
                            h02Var2.X(1445044374);
                            h02Var2.b(false);
                        }
                        String str = qq0Var.g;
                        boolean zJ2 = h02Var2.j(qr0Var2);
                        Object objK4 = h02Var2.K();
                        l76 l76Var = oo0.g;
                        if (zJ2 || objK4 == l76Var) {
                            objK4 = new rn(qr0Var2, (byte) 5);
                            h02Var2.i0(objK4);
                        }
                        c93.m(str, (my1) objK4, h02Var2, 0);
                        e85 e85Var = (e85) ob3VarJ4.getValue();
                        boolean zJ3 = h02Var2.j(qr0Var2);
                        Object objK5 = h02Var2.K();
                        if (zJ3 || objK5 == l76Var) {
                            objK5 = new rn(qr0Var2, b3);
                            h02Var2.i0(objK5);
                        }
                        my1 my1Var = (my1) objK5;
                        j73 j73VarG = e60.g.g(g73Var, hi0.b);
                        ql4 ql4Var = (ql4) ob3VarJ5.getValue();
                        if (ql4Var != null && ql4Var.E) {
                            z4 = true;
                        }
                        aq2.t(e85Var, my1Var, j73VarG, z4, h02Var2, 0, 0);
                        h02Var2.b(true);
                    } else {
                        h02Var2.Q();
                    }
                    return og5.g;
                }
            }, h02Var), h02Var, 805309488, 181);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: bp
                @Override // defpackage.bz1
                public final Object l(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    c93.n(nkVar, z2, qr0Var, nm0Var, nm0Var2, (h02) obj2, aq2.J(i2 | 1));
                    return og5.g;
                }
            };
        }
    }

    public static final Object o(nu4 nu4Var, int i2) {
        Object obj;
        nu4Var.getClass();
        int iM = og0.m(nu4Var.m, i2, nu4Var.t);
        if (iM < 0 || (obj = nu4Var.a[iM]) == f) {
            return null;
        }
        return obj;
    }

    public static final ne2 q(long j2, long j3) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        return new ne2(i2, i3, ((int) (j3 >> 32)) + i2, ((int) (j3 & 4294967295L)) + i3);
    }

    public static final void r(boolean z2, my1 my1Var, h02 h02Var, int i2) {
        h02Var.Z(-1493116746);
        int i3 = (h02Var.l(z2) ? 4 : 2) | i2 | (h02Var.j(my1Var) ? 32 : 16);
        byte b2 = 0;
        byte b3 = 1;
        if (h02Var.N(i3 & 1, (i3 & 19) != 18)) {
            y94.y(Boolean.valueOf(z2), null, null, null, "NavigationIcon", null, ue5.m0(-951776941, new jd(my1Var, b3), h02Var), h02Var, (i3 & 14) | 1597440, 46);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new xo(z2, my1Var, i2, b2);
        }
    }

    public static final void s(final my1 my1Var, j73 j73Var, boolean z2, cn4 cn4Var, a80 a80Var, zn3 zn3Var, final cz1 cz1Var, h02 h02Var, final int i2, final int i3) {
        int i4;
        a80 a80Var2;
        final j73 j73Var2;
        final cn4 cn4Var2;
        final zn3 zn3Var2;
        final a80 a80Var3;
        final boolean z3;
        int i5;
        a80 a80VarN;
        a80 a80Var4;
        zn3 zn3Var3;
        boolean z4;
        cn4 cn4Var3;
        j73 j73Var3;
        h02Var.Z(-1061374109);
        if ((i2 & 6) == 0) {
            i4 = (h02Var.j(my1Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= h02Var.x(j73Var) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= h02Var.l(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= 1024;
        }
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                a80Var2 = a80Var;
                int i8 = h02Var.x(a80Var2) ? 16384 : 8192;
                i4 |= i8;
            } else {
                a80Var2 = a80Var;
            }
            i4 |= i8;
        } else {
            a80Var2 = a80Var;
        }
        int i9 = i4 | 115015680;
        if ((805306368 & i2) == 0) {
            i9 |= h02Var.j(cz1Var) ? 536870912 : 268435456;
        }
        if (h02Var.N(i9 & 1, (306783379 & i9) != 306783378)) {
            h02Var.S();
            if ((i2 & 1) == 0 || h02Var.k()) {
                if (i6 != 0) {
                    j73Var = g73.g;
                }
                if (i7 != 0) {
                    z2 = true;
                }
                bo3 bo3Var = b80.g;
                cn4 cn4VarY = vn4.y(t, h02Var);
                int i10 = i9 & (-7169);
                if ((i3 & 16) != 0) {
                    a80VarN = b80.n((rj0) h02Var.a(tj0.g));
                    i5 = i9 & (-64513);
                } else {
                    i5 = i10;
                    a80VarN = a80Var2;
                }
                a80Var4 = a80VarN;
                zn3Var3 = b80.y;
                z4 = z2;
                cn4Var3 = cn4VarY;
                j73Var3 = j73Var;
            } else {
                h02Var.Q();
                int i11 = i9 & (-7169);
                if ((i3 & 16) != 0) {
                    i11 = i9 & (-64513);
                }
                z4 = z2;
                zn3Var3 = zn3Var;
                i5 = i11;
                a80Var4 = a80Var2;
                j73Var3 = j73Var;
                cn4Var3 = cn4Var;
            }
            h02Var.s();
            x(my1Var, j73Var3, z4, cn4Var3, a80Var4, null, null, zn3Var3, cz1Var, h02Var, i5 & 2147483646, 0);
            a80Var3 = a80Var4;
            zn3Var2 = zn3Var3;
            cn4Var2 = cn4Var3;
            z3 = z4;
            j73Var2 = j73Var3;
        } else {
            h02Var.Q();
            j73Var2 = j73Var;
            cn4Var2 = cn4Var;
            zn3Var2 = zn3Var;
            a80Var3 = a80Var2;
            z3 = z2;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: k90
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    c93.s(my1Var, j73Var2, z3, cn4Var2, a80Var3, zn3Var2, cz1Var, (h02) obj, aq2.J(i2 | 1), i3);
                    return og5.g;
                }
            };
        }
    }

    public static final void t(my1 my1Var, j73 j73Var, boolean z2, cn4 cn4Var, a80 a80Var, e90 e90Var, zn3 zn3Var, nm0 nm0Var, h02 h02Var, int i2) {
        int i3;
        boolean z3;
        e90 e90Var2;
        int i4;
        boolean z4;
        e90 e90Var3;
        h02Var.Z(-102343472);
        if ((i2 & 6) == 0) {
            i3 = (h02Var.j(my1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= h02Var.x(j73Var) ? 32 : 16;
        }
        int i5 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i5 |= h02Var.x(cn4Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= h02Var.x(a80Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= 65536;
        }
        int i6 = i5 | 1572864;
        if ((12582912 & i2) == 0) {
            i6 |= h02Var.x(zn3Var) ? 8388608 : 4194304;
        }
        int i7 = i6 | 100663296;
        if ((805306368 & i2) == 0) {
            i7 |= h02Var.j(nm0Var) ? 536870912 : 268435456;
        }
        if (h02Var.N(i7 & 1, (306783379 & i7) != 306783378)) {
            h02Var.S();
            if ((i2 & 1) == 0 || h02Var.k()) {
                bo3 bo3Var = b80.g;
                i4 = i7 & (-458753);
                z4 = true;
                e90Var3 = new e90(jb6.r());
            } else {
                h02Var.Q();
                i4 = i7 & (-458753);
                z4 = z2;
                e90Var3 = e90Var;
            }
            h02Var.s();
            x(my1Var, j73Var, z4, cn4Var, a80Var, e90Var3, null, zn3Var, nm0Var, h02Var, i4 & 2147483646, 0);
            z3 = z4;
            e90Var2 = e90Var3;
        } else {
            h02Var.Q();
            z3 = z2;
            e90Var2 = e90Var;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new i90(my1Var, j73Var, z3, cn4Var, a80Var, e90Var2, zn3Var, nm0Var, i2);
        }
    }

    public static er1 u(er1 er1Var, int i2) {
        f70 f70Var;
        if (i2 < 0 && i2 != -2 && i2 != -1) {
            l0.t(xi3.j("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", i2));
            return null;
        }
        if (i2 == -1) {
            i2 = 0;
            f70Var = f70.t;
        } else {
            f70Var = f70.j;
        }
        boolean z2 = er1Var instanceof b02;
        ni1 ni1Var = ni1.j;
        return z2 ? ((b02) er1Var).y(ni1Var, i2, f70Var) : new ed0(er1Var, ni1Var, i2, f70Var);
    }

    public static final void v(final nk nkVar, final ex4 ex4Var, final nm0 nm0Var, final long j2, final g61 g61Var, final List list, final my1 my1Var, final xy1 xy1Var, h02 h02Var, final int i2) {
        h02Var.Z(1976327924);
        int i3 = i2 | (h02Var.j(nkVar) ? 4 : 2) | (h02Var.j(ex4Var) ? 32 : 16) | (h02Var.j(nm0Var) ? 256 : 128) | (h02Var.v(j2) ? 2048 : 1024) | (h02Var.j(g61Var) ? 16384 : 8192) | (h02Var.x(list) ? 131072 : 65536) | (h02Var.j(my1Var) ? 1048576 : 524288) | (h02Var.j(xy1Var) ? 8388608 : 4194304);
        if (h02Var.N(i3 & 1, (4793491 & i3) != 4793490)) {
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (objK == l76Var) {
                objK = k33.E(h02Var);
                h02Var.i0(objK);
            }
            ox0 ox0Var = (ox0) objK;
            ob3 ob3VarQ = kq2.Q(h02Var.a(sa.y), h02Var);
            ob3 ob3VarQ2 = kq2.Q(h02Var.a(gp0.n), h02Var);
            WeakHashMap weakHashMap = yp5.k;
            Boolean bool = (Boolean) v13.t(h02Var).r.n.getValue();
            bool.getClass();
            ob3 ob3VarQ3 = kq2.Q(bool, h02Var);
            Object objK2 = h02Var.K();
            if (objK2 == l76Var) {
                re1 re1Var = new re1((Object) ox0Var, (Object) ob3VarQ3, (Object) ob3VarQ, (Object) ob3VarQ2, (byte) 0);
                h02Var.i0(re1Var);
                objK2 = re1Var;
            }
            final my1 my1Var2 = (my1) objK2;
            ra.a(48, ue5.m0(1357119832, new cz1() { // from class: uo
                @Override // defpackage.cz1
                public final Object x(Object obj, Object obj2, Object obj3) {
                    h02 h02Var2 = (h02) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((di) obj).getClass();
                    if (h02Var2.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                        nk nkVar2 = nkVar;
                        nm0 nm0VarM0 = ue5.m0(-551776228, new go(nkVar2, ex4Var, g61Var, list, my1Var, xy1Var), h02Var2);
                        nm0 nm0VarM1 = ue5.m0(2069601182, new vn(nkVar2, my1Var2, (byte) 2), h02Var2);
                        long j3 = jj0.j;
                        bb5 bb5VarO = jr2.o((rj0) h02Var2.a(tj0.g));
                        long j4 = j2;
                        if (j4 == 16) {
                            j4 = bb5VarO.g;
                        }
                        long j5 = j4;
                        long j6 = j3 != 16 ? j3 : bb5VarO.y;
                        long j7 = j3 != 16 ? j3 : bb5VarO.r;
                        long j8 = j3 != 16 ? j3 : bb5VarO.n;
                        long j9 = j3 != 16 ? j3 : bb5VarO.v;
                        if (j3 == 16) {
                            j3 = bb5VarO.x;
                        }
                        mk.y(nm0VarM0, null, nm0VarM1, nm0Var, 0.0f, null, new bb5(j5, j6, j7, j8, j9, j3), h02Var2, 390, 178);
                    } else {
                        h02Var2.Q();
                    }
                    return og5.g;
                }
            }, h02Var), h02Var, !nkVar.r);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1(ex4Var, nm0Var, j2, g61Var, list, my1Var, xy1Var, i2) { // from class: vo
                public final /* synthetic */ nm0 a;
                public final /* synthetic */ my1 c;
                public final /* synthetic */ xy1 i;
                public final /* synthetic */ long m;
                public final /* synthetic */ g61 q;
                public final /* synthetic */ ex4 t;
                public final /* synthetic */ List w;

                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(9);
                    c93.v(this.j, this.t, this.a, this.m, this.q, this.w, this.c, this.i, (h02) obj, iJ);
                    return og5.g;
                }
            };
        }
    }

    public static final void w(kk3 kk3Var, h02 h02Var, int i2) {
        g73 g73Var;
        kk3 kk3Var2 = kk3Var;
        h02 h02Var2 = h02Var;
        kk3Var2.getClass();
        h02Var2.Z(-559857390);
        int i3 = i2 | (h02Var2.x(kk3Var2) ? 4 : 2);
        if (h02Var2.N(i3 & 1, (i3 & 3) != 2)) {
            j73 j73VarE0 = ue5.e0(mq4.r, 32.0f);
            ek0 ek0VarG = ck0.g(v70.n, hi0.h, h02Var2, 0);
            int iHashCode = Long.hashCode(h02Var2.T);
            tr3 tr3VarQ = h02Var2.q();
            j73 j73VarW = m50.W(h02Var2, j73VarE0);
            jo0.n.getClass();
            h02Var2.b0();
            if (h02Var2.S) {
                h02Var2.m(um2.Z);
            } else {
                h02Var2.l0();
            }
            xs2.E(tg1.w, h02Var2, ek0VarG);
            xs2.E(tg1.q, h02Var2, tr3VarQ);
            xs2.E(tg1.c, h02Var2, Integer.valueOf(iHashCode));
            xs2.D(h02Var2);
            xs2.E(tg1.m, h02Var2, j73VarW);
            m50.u(aq2.k(kk3Var2.g, h02Var2), ue5.i0(mq4.r(new tp2(1.0f, true), 1.0f), 0.0f, 0.0f, 0.0f, 16.0f, 7), null, wt0.g, 0.0f, h02Var2, 24632, 104);
            Integer num = kk3Var2.y;
            g73 g73Var2 = g73.g;
            if (num == null) {
                h02Var2.X(1605215031);
                h02Var2.b(false);
                g73Var = g73Var2;
            } else {
                h02Var2.X(1605215032);
                g73Var = g73Var2;
                g75.y(xs2.I(num.intValue(), h02Var2), ue5.i0(mq4.r(g73Var2, 1.0f), 0.0f, 0.0f, 0.0f, 24.0f, 7), 0L, 0L, null, null, 0L, new g35(3), 0L, 0, false, 0, 0, null, ((mf5) h02Var2.a(of5.g)).x, h02Var, 48, 0, 130044);
                h02Var2 = h02Var;
                h02Var2.b(false);
                kk3Var2 = kk3Var;
            }
            g75.y(xs2.I(kk3Var2.r, h02Var2), ue5.i0(mq4.r(g73Var, 1.0f), 0.0f, 0.0f, 0.0f, 56.0f, 7), 0L, 0L, null, null, 0L, new g35(3), kq2.O(1.5f, 8589934592L), 0, false, 0, 0, null, ((mf5) h02Var2.a(of5.g)).m, h02Var, 48, 48, 127996);
            h02Var2 = h02Var;
            h02Var2.b(true);
        } else {
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new f(kk3Var2, i2, (byte) 24);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0110  */
    /* JADX WARN: Code duplicated, block: B:104:0x0120  */
    /* JADX WARN: Code duplicated, block: B:105:0x0122  */
    /* JADX WARN: Code duplicated, block: B:108:0x012b  */
    /* JADX WARN: Code duplicated, block: B:110:0x0138  */
    /* JADX WARN: Code duplicated, block: B:124:0x0159 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x015b  */
    /* JADX WARN: Code duplicated, block: B:127:0x0160  */
    /* JADX WARN: Code duplicated, block: B:130:0x0165  */
    /* JADX WARN: Code duplicated, block: B:133:0x0174  */
    /* JADX WARN: Code duplicated, block: B:136:0x0189  */
    /* JADX WARN: Code duplicated, block: B:137:0x0196  */
    /* JADX WARN: Code duplicated, block: B:139:0x0199  */
    /* JADX WARN: Code duplicated, block: B:141:0x019c  */
    /* JADX WARN: Code duplicated, block: B:142:0x019f  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:153:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:156:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:157:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:159:0x0204  */
    /* JADX WARN: Code duplicated, block: B:162:0x021e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:165:0x0225  */
    /* JADX WARN: Code duplicated, block: B:168:0x023e  */
    /* JADX WARN: Code duplicated, block: B:169:0x0240  */
    /* JADX WARN: Code duplicated, block: B:177:0x0251  */
    /* JADX WARN: Code duplicated, block: B:178:0x026a  */
    /* JADX WARN: Code duplicated, block: B:181:0x0287  */
    /* JADX WARN: Code duplicated, block: B:183:0x028d  */
    /* JADX WARN: Code duplicated, block: B:189:0x029d  */
    /* JADX WARN: Code duplicated, block: B:191:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:197:0x02b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:200:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:203:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:204:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:207:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:209:0x0345  */
    /* JADX WARN: Code duplicated, block: B:212:0x0356  */
    /* JADX WARN: Code duplicated, block: B:214:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x0095  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:97:0x0107  */
    /* JADX WARN: Code duplicated, block: B:99:0x010d  */
    public static final void x(my1 my1Var, j73 j73Var, boolean z2, cn4 cn4Var, a80 a80Var, e90 e90Var, z40 z40Var, zn3 zn3Var, cz1 cz1Var, h02 h02Var, int i2, int i3) {
        int i4;
        j73 j73Var2;
        int i5;
        boolean z3;
        int i6;
        cn4 cn4VarY;
        a80 a80VarY;
        e90 e90Var2;
        int i7;
        z40 z40Var2;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z4;
        j73 j73Var3;
        z40 z40Var3;
        boolean z5;
        cn4 cn4Var2;
        a80 a80Var2;
        e90 e90Var3;
        zn3 zn3Var2;
        u34 u34VarP;
        e90 e90Var4;
        zn3 zn3Var3;
        zn3 zn3Var4;
        a80 a80Var3;
        cn4 cn4Var3;
        boolean z6;
        Object objK;
        Object obj;
        ja3 ja3Var;
        long j2;
        long j3;
        Object objK2;
        st4 st4Var;
        ja3 ja3Var2;
        boolean zX;
        Object objK3;
        ue2 ue2Var;
        float f2;
        Object objK4;
        qg qgVar;
        boolean zJ;
        Object objK5;
        e90 e90Var5;
        pi piVar;
        float f3;
        Object objK6;
        int i12;
        h02Var.Z(-1310015664);
        if ((i2 & 6) == 0) {
            i4 = (h02Var.j(my1Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i13 = i3 & 2;
        if (i13 == 0) {
            if ((i2 & 48) == 0) {
                j73Var2 = j73Var;
                i4 |= h02Var.x(j73Var2) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 384) == 0) {
                    z3 = z2;
                    if (h02Var.l(z3)) {
                        i6 = 256;
                    } else {
                        i6 = 128;
                    }
                    i4 |= i6;
                }
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        cn4VarY = cn4Var;
                        int i14 = h02Var.x(cn4VarY) ? 2048 : 1024;
                        i4 |= i14;
                    } else {
                        cn4VarY = cn4Var;
                    }
                    i4 |= i14;
                } else {
                    cn4VarY = cn4Var;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        a80VarY = a80Var;
                        int i15 = h02Var.x(a80VarY) ? 16384 : 8192;
                        i4 |= i15;
                    } else {
                        a80VarY = a80Var;
                    }
                    i4 |= i15;
                } else {
                    a80VarY = a80Var;
                }
                if ((196608 & i2) == 0) {
                    if ((i3 & 32) == 0) {
                        e90Var2 = e90Var;
                        int i16 = h02Var.x(e90Var2) ? 131072 : 65536;
                        i4 |= i16;
                    } else {
                        e90Var2 = e90Var;
                    }
                    i4 |= i16;
                } else {
                    e90Var2 = e90Var;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                    z40Var2 = z40Var;
                } else {
                    z40Var2 = z40Var;
                    if ((i2 & 1572864) == 0) {
                        if (h02Var.x(z40Var2)) {
                            i8 = 1048576;
                        } else {
                            i8 = 524288;
                        }
                        i4 |= i8;
                    }
                }
                i9 = i3 & 128;
                if (i9 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (h02Var.x(zn3Var)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i4 |= i10;
                }
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (h02Var.x(null)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i4 |= i11;
                }
                if ((i2 & 805306368) == 0) {
                    if (h02Var.j(cz1Var)) {
                        i12 = 536870912;
                    } else {
                        i12 = 268435456;
                    }
                    i4 |= i12;
                }
                if ((i4 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (h02Var.N(i4 & 1, z4)) {
                    h02Var.S();
                    if ((i2 & 1) != 0 || h02Var.k()) {
                        if (i13 != 0) {
                            j73Var2 = g73.g;
                        }
                        if (i5 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 8) != 0) {
                            bo3 bo3Var = b80.g;
                            i4 &= -7169;
                            cn4VarY = vn4.y(t, h02Var);
                        }
                        if ((i3 & 16) != 0) {
                            bo3 bo3Var2 = b80.g;
                            i4 &= -57345;
                            a80VarY = b80.y((rj0) h02Var.a(tj0.g));
                        }
                        if ((i3 & 32) != 0) {
                            bo3 bo3Var3 = b80.g;
                            e90Var4 = new e90(v70.s);
                            i4 &= -458753;
                        } else {
                            e90Var4 = e90Var2;
                        }
                        if (i7 != 0) {
                            z40Var2 = null;
                        }
                        if (i9 != 0) {
                            zn3Var3 = b80.g;
                        } else {
                            zn3Var3 = zn3Var;
                        }
                        zn3Var4 = zn3Var3;
                        e90Var2 = e90Var4;
                    } else {
                        h02Var.Q();
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                        }
                        zn3Var4 = zn3Var;
                    }
                    a80Var3 = a80VarY;
                    cn4Var3 = cn4VarY;
                    z6 = z3;
                    h02Var.s();
                    h02Var.X(1691738187);
                    objK = h02Var.K();
                    obj = oo0.g;
                    if (objK == obj) {
                        objK = du4.n(h02Var);
                    }
                    ja3Var = (ja3) objK;
                    h02Var.b(false);
                    if (z6) {
                        j2 = a80Var3.g;
                    } else {
                        j2 = a80Var3.r;
                    }
                    long j4 = j2;
                    if (z6) {
                        j3 = a80Var3.y;
                    } else {
                        j3 = a80Var3.n;
                    }
                    if (e90Var2 == null) {
                        h02Var.X(1691921830);
                        h02Var.b(false);
                        zn3Var4 = zn3Var4;
                        i4 = i4;
                        e90Var5 = e90Var2;
                        ja3Var2 = ja3Var;
                        piVar = null;
                        cn4Var3 = cn4Var3;
                    } else {
                        h02Var.X(-499611205);
                        int i17 = ((i4 >> 6) & 14) | ((i4 >> 9) & 896);
                        objK2 = h02Var.K();
                        if (objK2 == obj) {
                            objK2 = new st4();
                            h02Var.i0(objK2);
                        }
                        st4Var = (st4) objK2;
                        ja3Var2 = ja3Var;
                        zX = h02Var.x(ja3Var2);
                        objK3 = h02Var.K();
                        if (zX || objK3 == obj) {
                            objK3 = new op(ja3Var2, st4Var, null, (byte) 1);
                            h02Var.i0(objK3);
                        }
                        k33.b((bz1) objK3, h02Var, ja3Var2);
                        ue2Var = (ue2) cj0.s0(st4Var);
                        if (z6 || (ue2Var instanceof mx3) || !(ue2Var instanceof p72)) {
                            f2 = 0.0f;
                        } else {
                            f2 = e90Var2.g;
                        }
                        objK4 = h02Var.K();
                        if (objK4 == obj) {
                            objK4 = new qg(new vb1(f2), m50.i, null, 12);
                            h02Var.i0(objK4);
                        }
                        qgVar = (qg) objK4;
                        vb1 vb1Var = new vb1(f2);
                        zJ = h02Var.j(qgVar) | h02Var.r(f2) | ((((i17 & 14) ^ 6) <= 4 && h02Var.l(z6)) || (i17 & 6) == 4) | ((((i17 & 896) ^ 384) <= 256 && h02Var.x(e90Var2)) || (i17 & 384) == 256) | h02Var.j(ue2Var);
                        objK5 = h02Var.K();
                        if (!zJ || objK5 == obj) {
                            e90 e90Var6 = e90Var2;
                            objK5 = new d90(qgVar, f2, z6, e90Var6, ue2Var, null);
                            e90Var5 = e90Var6;
                            h02Var.i0(objK5);
                        } else {
                            e90Var5 = e90Var2;
                        }
                        k33.b((bz1) objK5, h02Var, vb1Var);
                        piVar = qgVar.r;
                        h02Var.b(false);
                    }
                    if (piVar != null) {
                        f3 = ((vb1) piVar.t.getValue()).j;
                    } else {
                        f3 = 0.0f;
                    }
                    objK6 = h02Var.K();
                    if (objK6 == obj) {
                        objK6 = new l1((byte) 23);
                        h02Var.i0(objK6);
                    }
                    zn3 zn3Var5 = zn3Var4;
                    int i18 = i4;
                    cn4 cn4Var4 = cn4Var3;
                    z40 z40Var4 = z40Var2;
                    uz4.n(my1Var, dj4.g(j73Var2, false, (xy1) objK6), z6, cn4Var4, j4, j3, 0.0f, f3, z40Var4, ja3Var2, ue5.m0(-535639973, new n90(j3, zn3Var5, cz1Var), h02Var), h02Var, ((i18 << 6) & 234881024) | (i18 & 8078), 64);
                    j73 j73Var4 = j73Var2;
                    e90Var3 = e90Var5;
                    j73Var3 = j73Var4;
                    zn3Var2 = zn3Var5;
                    z5 = z6;
                    cn4Var2 = cn4Var4;
                    z40Var3 = z40Var4;
                    a80Var2 = a80Var3;
                } else {
                    h02Var.Q();
                    j73Var3 = j73Var2;
                    z40Var3 = z40Var2;
                    z5 = z3;
                    cn4Var2 = cn4VarY;
                    a80Var2 = a80VarY;
                    e90Var3 = e90Var2;
                    zn3Var2 = zn3Var;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new j90(my1Var, j73Var3, z5, cn4Var2, a80Var2, e90Var3, z40Var3, zn3Var2, cz1Var, i2, i3);
                }
            }
            i4 |= 384;
            z3 = z2;
            if ((i2 & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    cn4VarY = cn4Var;
                    if (h02Var.x(cn4VarY)) {
                    }
                    i4 |= i14;
                } else {
                    cn4VarY = cn4Var;
                }
                i4 |= i14;
            } else {
                cn4VarY = cn4Var;
            }
            if ((i2 & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    a80VarY = a80Var;
                    if (h02Var.x(a80VarY)) {
                    }
                    i4 |= i15;
                } else {
                    a80VarY = a80Var;
                }
                i4 |= i15;
            } else {
                a80VarY = a80Var;
            }
            if ((196608 & i2) == 0) {
                if ((i3 & 32) == 0) {
                    e90Var2 = e90Var;
                    if (h02Var.x(e90Var2)) {
                    }
                    i4 |= i16;
                } else {
                    e90Var2 = e90Var;
                }
                i4 |= i16;
            } else {
                e90Var2 = e90Var;
            }
            i7 = i3 & 64;
            if (i7 != 0) {
                i4 |= 1572864;
                z40Var2 = z40Var;
            } else {
                z40Var2 = z40Var;
                if ((i2 & 1572864) == 0) {
                    if (h02Var.x(z40Var2)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i4 |= i8;
                }
            }
            i9 = i3 & 128;
            if (i9 != 0) {
                i4 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (h02Var.x(zn3Var)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i4 |= i10;
            }
            if ((i3 & 256) != 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (h02Var.x(null)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i4 |= i11;
            }
            if ((i2 & 805306368) == 0) {
                if (h02Var.j(cz1Var)) {
                    i12 = 536870912;
                } else {
                    i12 = 268435456;
                }
                i4 |= i12;
            }
            if ((i4 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (h02Var.N(i4 & 1, z4)) {
                h02Var.S();
                if ((i2 & 1) != 0) {
                    if (i13 != 0) {
                        j73Var2 = g73.g;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 8) != 0) {
                        bo3 bo3Var4 = b80.g;
                        i4 &= -7169;
                        cn4VarY = vn4.y(t, h02Var);
                    }
                    if ((i3 & 16) != 0) {
                        bo3 bo3Var5 = b80.g;
                        i4 &= -57345;
                        a80VarY = b80.y((rj0) h02Var.a(tj0.g));
                    }
                    if ((i3 & 32) != 0) {
                        bo3 bo3Var6 = b80.g;
                        e90Var4 = new e90(v70.s);
                        i4 &= -458753;
                    } else {
                        e90Var4 = e90Var2;
                    }
                    if (i7 != 0) {
                        z40Var2 = null;
                    }
                    if (i9 != 0) {
                        zn3Var3 = b80.g;
                    } else {
                        zn3Var3 = zn3Var;
                    }
                    zn3Var4 = zn3Var3;
                    e90Var2 = e90Var4;
                } else {
                    if (i13 != 0) {
                        j73Var2 = g73.g;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 8) != 0) {
                        bo3 bo3Var7 = b80.g;
                        i4 &= -7169;
                        cn4VarY = vn4.y(t, h02Var);
                    }
                    if ((i3 & 16) != 0) {
                        bo3 bo3Var8 = b80.g;
                        i4 &= -57345;
                        a80VarY = b80.y((rj0) h02Var.a(tj0.g));
                    }
                    if ((i3 & 32) != 0) {
                        bo3 bo3Var9 = b80.g;
                        e90Var4 = new e90(v70.s);
                        i4 &= -458753;
                    } else {
                        e90Var4 = e90Var2;
                    }
                    if (i7 != 0) {
                        z40Var2 = null;
                    }
                    if (i9 != 0) {
                        zn3Var3 = b80.g;
                    } else {
                        zn3Var3 = zn3Var;
                    }
                    zn3Var4 = zn3Var3;
                    e90Var2 = e90Var4;
                }
                a80Var3 = a80VarY;
                cn4Var3 = cn4VarY;
                z6 = z3;
                h02Var.s();
                h02Var.X(1691738187);
                objK = h02Var.K();
                obj = oo0.g;
                if (objK == obj) {
                    objK = du4.n(h02Var);
                }
                ja3Var = (ja3) objK;
                h02Var.b(false);
                if (z6) {
                    j2 = a80Var3.g;
                } else {
                    j2 = a80Var3.r;
                }
                long j5 = j2;
                if (z6) {
                    j3 = a80Var3.y;
                } else {
                    j3 = a80Var3.n;
                }
                if (e90Var2 == null) {
                    h02Var.X(1691921830);
                    h02Var.b(false);
                    zn3Var4 = zn3Var4;
                    i4 = i4;
                    e90Var5 = e90Var2;
                    ja3Var2 = ja3Var;
                    piVar = null;
                    cn4Var3 = cn4Var3;
                } else {
                    h02Var.X(-499611205);
                    int i19 = ((i4 >> 6) & 14) | ((i4 >> 9) & 896);
                    objK2 = h02Var.K();
                    if (objK2 == obj) {
                        objK2 = new st4();
                        h02Var.i0(objK2);
                    }
                    st4Var = (st4) objK2;
                    ja3Var2 = ja3Var;
                    zX = h02Var.x(ja3Var2);
                    objK3 = h02Var.K();
                    if (zX) {
                        objK3 = new op(ja3Var2, st4Var, null, (byte) 1);
                        h02Var.i0(objK3);
                    } else {
                        objK3 = new op(ja3Var2, st4Var, null, (byte) 1);
                        h02Var.i0(objK3);
                    }
                    k33.b((bz1) objK3, h02Var, ja3Var2);
                    ue2Var = (ue2) cj0.s0(st4Var);
                    if (z6) {
                        f2 = 0.0f;
                    } else {
                        f2 = e90Var2.g;
                    }
                    objK4 = h02Var.K();
                    if (objK4 == obj) {
                        objK4 = new qg(new vb1(f2), m50.i, null, 12);
                        h02Var.i0(objK4);
                    }
                    qgVar = (qg) objK4;
                    vb1 vb1Var2 = new vb1(f2);
                    zJ = h02Var.j(qgVar) | h02Var.r(f2) | ((((i19 & 14) ^ 6) <= 4 && h02Var.l(z6)) || (i19 & 6) == 4) | ((((i19 & 896) ^ 384) <= 256 && h02Var.x(e90Var2)) || (i19 & 384) == 256) | h02Var.j(ue2Var);
                    objK5 = h02Var.K();
                    if (zJ) {
                        e90 e90Var7 = e90Var2;
                        objK5 = new d90(qgVar, f2, z6, e90Var7, ue2Var, null);
                        e90Var5 = e90Var7;
                        h02Var.i0(objK5);
                    } else {
                        e90 e90Var8 = e90Var2;
                        objK5 = new d90(qgVar, f2, z6, e90Var8, ue2Var, null);
                        e90Var5 = e90Var8;
                        h02Var.i0(objK5);
                    }
                    k33.b((bz1) objK5, h02Var, vb1Var2);
                    piVar = qgVar.r;
                    h02Var.b(false);
                }
                if (piVar != null) {
                    f3 = ((vb1) piVar.t.getValue()).j;
                } else {
                    f3 = 0.0f;
                }
                objK6 = h02Var.K();
                if (objK6 == obj) {
                    objK6 = new l1((byte) 23);
                    h02Var.i0(objK6);
                }
                zn3 zn3Var6 = zn3Var4;
                int i110 = i4;
                cn4 cn4Var5 = cn4Var3;
                z40 z40Var5 = z40Var2;
                uz4.n(my1Var, dj4.g(j73Var2, false, (xy1) objK6), z6, cn4Var5, j5, j3, 0.0f, f3, z40Var5, ja3Var2, ue5.m0(-535639973, new n90(j3, zn3Var6, cz1Var), h02Var), h02Var, ((i110 << 6) & 234881024) | (i110 & 8078), 64);
                j73 j73Var5 = j73Var2;
                e90Var3 = e90Var5;
                j73Var3 = j73Var5;
                zn3Var2 = zn3Var6;
                z5 = z6;
                cn4Var2 = cn4Var5;
                z40Var3 = z40Var5;
                a80Var2 = a80Var3;
            } else {
                h02Var.Q();
                j73Var3 = j73Var2;
                z40Var3 = z40Var2;
                z5 = z3;
                cn4Var2 = cn4VarY;
                a80Var2 = a80VarY;
                e90Var3 = e90Var2;
                zn3Var2 = zn3Var;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new j90(my1Var, j73Var3, z5, cn4Var2, a80Var2, e90Var3, z40Var3, zn3Var2, cz1Var, i2, i3);
            }
        }
        i4 |= 48;
        j73Var2 = j73Var;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i2 & 384) == 0) {
                z3 = z2;
                if (h02Var.l(z3)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            if ((i2 & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    cn4VarY = cn4Var;
                    if (h02Var.x(cn4VarY)) {
                    }
                    i4 |= i14;
                } else {
                    cn4VarY = cn4Var;
                }
                i4 |= i14;
            } else {
                cn4VarY = cn4Var;
            }
            if ((i2 & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    a80VarY = a80Var;
                    if (h02Var.x(a80VarY)) {
                    }
                    i4 |= i15;
                } else {
                    a80VarY = a80Var;
                }
                i4 |= i15;
            } else {
                a80VarY = a80Var;
            }
            if ((196608 & i2) == 0) {
                if ((i3 & 32) == 0) {
                    e90Var2 = e90Var;
                    if (h02Var.x(e90Var2)) {
                    }
                    i4 |= i16;
                } else {
                    e90Var2 = e90Var;
                }
                i4 |= i16;
            } else {
                e90Var2 = e90Var;
            }
            i7 = i3 & 64;
            if (i7 != 0) {
                i4 |= 1572864;
                z40Var2 = z40Var;
            } else {
                z40Var2 = z40Var;
                if ((i2 & 1572864) == 0) {
                    if (h02Var.x(z40Var2)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i4 |= i8;
                }
            }
            i9 = i3 & 128;
            if (i9 != 0) {
                i4 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (h02Var.x(zn3Var)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i4 |= i10;
            }
            if ((i3 & 256) != 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (h02Var.x(null)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i4 |= i11;
            }
            if ((i2 & 805306368) == 0) {
                if (h02Var.j(cz1Var)) {
                    i12 = 536870912;
                } else {
                    i12 = 268435456;
                }
                i4 |= i12;
            }
            if ((i4 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (h02Var.N(i4 & 1, z4)) {
                h02Var.S();
                if ((i2 & 1) != 0) {
                    if (i13 != 0) {
                        j73Var2 = g73.g;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 8) != 0) {
                        bo3 bo3Var10 = b80.g;
                        i4 &= -7169;
                        cn4VarY = vn4.y(t, h02Var);
                    }
                    if ((i3 & 16) != 0) {
                        bo3 bo3Var11 = b80.g;
                        i4 &= -57345;
                        a80VarY = b80.y((rj0) h02Var.a(tj0.g));
                    }
                    if ((i3 & 32) != 0) {
                        bo3 bo3Var12 = b80.g;
                        e90Var4 = new e90(v70.s);
                        i4 &= -458753;
                    } else {
                        e90Var4 = e90Var2;
                    }
                    if (i7 != 0) {
                        z40Var2 = null;
                    }
                    if (i9 != 0) {
                        zn3Var3 = b80.g;
                    } else {
                        zn3Var3 = zn3Var;
                    }
                    zn3Var4 = zn3Var3;
                    e90Var2 = e90Var4;
                } else {
                    if (i13 != 0) {
                        j73Var2 = g73.g;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 8) != 0) {
                        bo3 bo3Var13 = b80.g;
                        i4 &= -7169;
                        cn4VarY = vn4.y(t, h02Var);
                    }
                    if ((i3 & 16) != 0) {
                        bo3 bo3Var14 = b80.g;
                        i4 &= -57345;
                        a80VarY = b80.y((rj0) h02Var.a(tj0.g));
                    }
                    if ((i3 & 32) != 0) {
                        bo3 bo3Var15 = b80.g;
                        e90Var4 = new e90(v70.s);
                        i4 &= -458753;
                    } else {
                        e90Var4 = e90Var2;
                    }
                    if (i7 != 0) {
                        z40Var2 = null;
                    }
                    if (i9 != 0) {
                        zn3Var3 = b80.g;
                    } else {
                        zn3Var3 = zn3Var;
                    }
                    zn3Var4 = zn3Var3;
                    e90Var2 = e90Var4;
                }
                a80Var3 = a80VarY;
                cn4Var3 = cn4VarY;
                z6 = z3;
                h02Var.s();
                h02Var.X(1691738187);
                objK = h02Var.K();
                obj = oo0.g;
                if (objK == obj) {
                    objK = du4.n(h02Var);
                }
                ja3Var = (ja3) objK;
                h02Var.b(false);
                if (z6) {
                    j2 = a80Var3.g;
                } else {
                    j2 = a80Var3.r;
                }
                long j6 = j2;
                if (z6) {
                    j3 = a80Var3.y;
                } else {
                    j3 = a80Var3.n;
                }
                if (e90Var2 == null) {
                    h02Var.X(1691921830);
                    h02Var.b(false);
                    zn3Var4 = zn3Var4;
                    i4 = i4;
                    e90Var5 = e90Var2;
                    ja3Var2 = ja3Var;
                    piVar = null;
                    cn4Var3 = cn4Var3;
                } else {
                    h02Var.X(-499611205);
                    int i111 = ((i4 >> 6) & 14) | ((i4 >> 9) & 896);
                    objK2 = h02Var.K();
                    if (objK2 == obj) {
                        objK2 = new st4();
                        h02Var.i0(objK2);
                    }
                    st4Var = (st4) objK2;
                    ja3Var2 = ja3Var;
                    zX = h02Var.x(ja3Var2);
                    objK3 = h02Var.K();
                    if (zX) {
                        objK3 = new op(ja3Var2, st4Var, null, (byte) 1);
                        h02Var.i0(objK3);
                    } else {
                        objK3 = new op(ja3Var2, st4Var, null, (byte) 1);
                        h02Var.i0(objK3);
                    }
                    k33.b((bz1) objK3, h02Var, ja3Var2);
                    ue2Var = (ue2) cj0.s0(st4Var);
                    if (z6) {
                        f2 = 0.0f;
                    } else {
                        f2 = e90Var2.g;
                    }
                    objK4 = h02Var.K();
                    if (objK4 == obj) {
                        objK4 = new qg(new vb1(f2), m50.i, null, 12);
                        h02Var.i0(objK4);
                    }
                    qgVar = (qg) objK4;
                    vb1 vb1Var3 = new vb1(f2);
                    zJ = h02Var.j(qgVar) | h02Var.r(f2) | ((((i111 & 14) ^ 6) <= 4 && h02Var.l(z6)) || (i111 & 6) == 4) | ((((i111 & 896) ^ 384) <= 256 && h02Var.x(e90Var2)) || (i111 & 384) == 256) | h02Var.j(ue2Var);
                    objK5 = h02Var.K();
                    if (zJ) {
                        e90 e90Var9 = e90Var2;
                        objK5 = new d90(qgVar, f2, z6, e90Var9, ue2Var, null);
                        e90Var5 = e90Var9;
                        h02Var.i0(objK5);
                    } else {
                        e90 e90Var10 = e90Var2;
                        objK5 = new d90(qgVar, f2, z6, e90Var10, ue2Var, null);
                        e90Var5 = e90Var10;
                        h02Var.i0(objK5);
                    }
                    k33.b((bz1) objK5, h02Var, vb1Var3);
                    piVar = qgVar.r;
                    h02Var.b(false);
                }
                if (piVar != null) {
                    f3 = ((vb1) piVar.t.getValue()).j;
                } else {
                    f3 = 0.0f;
                }
                objK6 = h02Var.K();
                if (objK6 == obj) {
                    objK6 = new l1((byte) 23);
                    h02Var.i0(objK6);
                }
                zn3 zn3Var7 = zn3Var4;
                int i112 = i4;
                cn4 cn4Var6 = cn4Var3;
                z40 z40Var6 = z40Var2;
                uz4.n(my1Var, dj4.g(j73Var2, false, (xy1) objK6), z6, cn4Var6, j6, j3, 0.0f, f3, z40Var6, ja3Var2, ue5.m0(-535639973, new n90(j3, zn3Var7, cz1Var), h02Var), h02Var, ((i112 << 6) & 234881024) | (i112 & 8078), 64);
                j73 j73Var6 = j73Var2;
                e90Var3 = e90Var5;
                j73Var3 = j73Var6;
                zn3Var2 = zn3Var7;
                z5 = z6;
                cn4Var2 = cn4Var6;
                z40Var3 = z40Var6;
                a80Var2 = a80Var3;
            } else {
                h02Var.Q();
                j73Var3 = j73Var2;
                z40Var3 = z40Var2;
                z5 = z3;
                cn4Var2 = cn4VarY;
                a80Var2 = a80VarY;
                e90Var3 = e90Var2;
                zn3Var2 = zn3Var;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new j90(my1Var, j73Var3, z5, cn4Var2, a80Var2, e90Var3, z40Var3, zn3Var2, cz1Var, i2, i3);
            }
        }
        i4 |= 384;
        z3 = z2;
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                cn4VarY = cn4Var;
                if (h02Var.x(cn4VarY)) {
                }
                i4 |= i14;
            } else {
                cn4VarY = cn4Var;
            }
            i4 |= i14;
        } else {
            cn4VarY = cn4Var;
        }
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                a80VarY = a80Var;
                if (h02Var.x(a80VarY)) {
                }
                i4 |= i15;
            } else {
                a80VarY = a80Var;
            }
            i4 |= i15;
        } else {
            a80VarY = a80Var;
        }
        if ((196608 & i2) == 0) {
            if ((i3 & 32) == 0) {
                e90Var2 = e90Var;
                if (h02Var.x(e90Var2)) {
                }
                i4 |= i16;
            } else {
                e90Var2 = e90Var;
            }
            i4 |= i16;
        } else {
            e90Var2 = e90Var;
        }
        i7 = i3 & 64;
        if (i7 != 0) {
            i4 |= 1572864;
            z40Var2 = z40Var;
        } else {
            z40Var2 = z40Var;
            if ((i2 & 1572864) == 0) {
                if (h02Var.x(z40Var2)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i4 |= i8;
            }
        }
        i9 = i3 & 128;
        if (i9 != 0) {
            i4 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            if (h02Var.x(zn3Var)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i4 |= i10;
        }
        if ((i3 & 256) != 0) {
            i4 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            if (h02Var.x(null)) {
                i11 = 67108864;
            } else {
                i11 = 33554432;
            }
            i4 |= i11;
        }
        if ((i2 & 805306368) == 0) {
            if (h02Var.j(cz1Var)) {
                i12 = 536870912;
            } else {
                i12 = 268435456;
            }
            i4 |= i12;
        }
        if ((i4 & 306783379) != 306783378) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (h02Var.N(i4 & 1, z4)) {
            h02Var.S();
            if ((i2 & 1) != 0) {
                if (i13 != 0) {
                    j73Var2 = g73.g;
                }
                if (i5 != 0) {
                    z3 = true;
                }
                if ((i3 & 8) != 0) {
                    bo3 bo3Var16 = b80.g;
                    i4 &= -7169;
                    cn4VarY = vn4.y(t, h02Var);
                }
                if ((i3 & 16) != 0) {
                    bo3 bo3Var17 = b80.g;
                    i4 &= -57345;
                    a80VarY = b80.y((rj0) h02Var.a(tj0.g));
                }
                if ((i3 & 32) != 0) {
                    bo3 bo3Var18 = b80.g;
                    e90Var4 = new e90(v70.s);
                    i4 &= -458753;
                } else {
                    e90Var4 = e90Var2;
                }
                if (i7 != 0) {
                    z40Var2 = null;
                }
                if (i9 != 0) {
                    zn3Var3 = b80.g;
                } else {
                    zn3Var3 = zn3Var;
                }
                zn3Var4 = zn3Var3;
                e90Var2 = e90Var4;
            } else {
                if (i13 != 0) {
                    j73Var2 = g73.g;
                }
                if (i5 != 0) {
                    z3 = true;
                }
                if ((i3 & 8) != 0) {
                    bo3 bo3Var19 = b80.g;
                    i4 &= -7169;
                    cn4VarY = vn4.y(t, h02Var);
                }
                if ((i3 & 16) != 0) {
                    bo3 bo3Var110 = b80.g;
                    i4 &= -57345;
                    a80VarY = b80.y((rj0) h02Var.a(tj0.g));
                }
                if ((i3 & 32) != 0) {
                    bo3 bo3Var111 = b80.g;
                    e90Var4 = new e90(v70.s);
                    i4 &= -458753;
                } else {
                    e90Var4 = e90Var2;
                }
                if (i7 != 0) {
                    z40Var2 = null;
                }
                if (i9 != 0) {
                    zn3Var3 = b80.g;
                } else {
                    zn3Var3 = zn3Var;
                }
                zn3Var4 = zn3Var3;
                e90Var2 = e90Var4;
            }
            a80Var3 = a80VarY;
            cn4Var3 = cn4VarY;
            z6 = z3;
            h02Var.s();
            h02Var.X(1691738187);
            objK = h02Var.K();
            obj = oo0.g;
            if (objK == obj) {
                objK = du4.n(h02Var);
            }
            ja3Var = (ja3) objK;
            h02Var.b(false);
            if (z6) {
                j2 = a80Var3.g;
            } else {
                j2 = a80Var3.r;
            }
            long j7 = j2;
            if (z6) {
                j3 = a80Var3.y;
            } else {
                j3 = a80Var3.n;
            }
            if (e90Var2 == null) {
                h02Var.X(1691921830);
                h02Var.b(false);
                zn3Var4 = zn3Var4;
                i4 = i4;
                e90Var5 = e90Var2;
                ja3Var2 = ja3Var;
                piVar = null;
                cn4Var3 = cn4Var3;
            } else {
                h02Var.X(-499611205);
                int i113 = ((i4 >> 6) & 14) | ((i4 >> 9) & 896);
                objK2 = h02Var.K();
                if (objK2 == obj) {
                    objK2 = new st4();
                    h02Var.i0(objK2);
                }
                st4Var = (st4) objK2;
                ja3Var2 = ja3Var;
                zX = h02Var.x(ja3Var2);
                objK3 = h02Var.K();
                if (zX) {
                    objK3 = new op(ja3Var2, st4Var, null, (byte) 1);
                    h02Var.i0(objK3);
                } else {
                    objK3 = new op(ja3Var2, st4Var, null, (byte) 1);
                    h02Var.i0(objK3);
                }
                k33.b((bz1) objK3, h02Var, ja3Var2);
                ue2Var = (ue2) cj0.s0(st4Var);
                if (z6) {
                    f2 = 0.0f;
                } else {
                    f2 = e90Var2.g;
                }
                objK4 = h02Var.K();
                if (objK4 == obj) {
                    objK4 = new qg(new vb1(f2), m50.i, null, 12);
                    h02Var.i0(objK4);
                }
                qgVar = (qg) objK4;
                vb1 vb1Var4 = new vb1(f2);
                zJ = h02Var.j(qgVar) | h02Var.r(f2) | ((((i113 & 14) ^ 6) <= 4 && h02Var.l(z6)) || (i113 & 6) == 4) | ((((i113 & 896) ^ 384) <= 256 && h02Var.x(e90Var2)) || (i113 & 384) == 256) | h02Var.j(ue2Var);
                objK5 = h02Var.K();
                if (zJ) {
                    e90 e90Var11 = e90Var2;
                    objK5 = new d90(qgVar, f2, z6, e90Var11, ue2Var, null);
                    e90Var5 = e90Var11;
                    h02Var.i0(objK5);
                } else {
                    e90 e90Var12 = e90Var2;
                    objK5 = new d90(qgVar, f2, z6, e90Var12, ue2Var, null);
                    e90Var5 = e90Var12;
                    h02Var.i0(objK5);
                }
                k33.b((bz1) objK5, h02Var, vb1Var4);
                piVar = qgVar.r;
                h02Var.b(false);
            }
            if (piVar != null) {
                f3 = ((vb1) piVar.t.getValue()).j;
            } else {
                f3 = 0.0f;
            }
            objK6 = h02Var.K();
            if (objK6 == obj) {
                objK6 = new l1((byte) 23);
                h02Var.i0(objK6);
            }
            zn3 zn3Var8 = zn3Var4;
            int i114 = i4;
            cn4 cn4Var7 = cn4Var3;
            z40 z40Var7 = z40Var2;
            uz4.n(my1Var, dj4.g(j73Var2, false, (xy1) objK6), z6, cn4Var7, j7, j3, 0.0f, f3, z40Var7, ja3Var2, ue5.m0(-535639973, new n90(j3, zn3Var8, cz1Var), h02Var), h02Var, ((i114 << 6) & 234881024) | (i114 & 8078), 64);
            j73 j73Var7 = j73Var2;
            e90Var3 = e90Var5;
            j73Var3 = j73Var7;
            zn3Var2 = zn3Var8;
            z5 = z6;
            cn4Var2 = cn4Var7;
            z40Var3 = z40Var7;
            a80Var2 = a80Var3;
        } else {
            h02Var.Q();
            j73Var3 = j73Var2;
            z40Var3 = z40Var2;
            z5 = z3;
            cn4Var2 = cn4VarY;
            a80Var2 = a80VarY;
            e90Var3 = e90Var2;
            zn3Var2 = zn3Var;
        }
        u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new j90(my1Var, j73Var3, z5, cn4Var2, a80Var2, e90Var3, z40Var3, zn3Var2, cz1Var, i2, i3);
        }
    }

    public static qg y(float f2) {
        return new qg(Float.valueOf(f2), m50.w, Float.valueOf(0.01f), 8);
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
  (r0v0 int) from 0x0007: SWITCH (r0v0 int)
 case -1811142716: goto B:118:0x0130
 case -1811142715: goto B:113:0x0123
 case -1811142714: goto B:108:0x0116
 case -1811142713: goto B:103:0x0109
 case -1811142712: goto B:98:0x00fc
 case -1811142711: goto B:93:0x00ef
 case -1811142710: goto B:88:0x00e2
 case -1811142709: goto B:83:0x00d5
 case -1811142708: goto B:78:0x00c8
 case -1811142707: goto B:73:0x00bb
 default: goto B:5:0x000a A[RegionRef:SW:4] (LINE:8)
  (r0v0 int) from 0x000a: SWITCH (r0v0 int)
 case -1811142685: goto B:68:0x00ae
 case -1811142684: goto B:63:0x00a1
 case -1811142683: goto B:58:0x0094
 default: goto B:6:0x000d A[RegionRef:SW:5] (LINE:11)
  (r0v0 int) from 0x000d: SWITCH (r0v0 int)
 case 80123371: goto B:53:0x0087
 case 80123372: goto B:48:0x007a
 case 80123373: goto B:43:0x006d
 case 80123374: goto B:38:0x0060
 case 80123375: goto B:33:0x0053
 case 80123376: goto B:28:0x0046
 case 80123377: goto B:23:0x0039
 case 80123378: goto B:18:0x002c
 case 80123379: goto B:13:0x001f
 case 80123380: goto B:8:0x0012
 default: goto B:331:? A[RegionRef:SW:6] (LINE:14)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String z(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "kotlin.Double.Companion";
            case "java.lang.Integer":
                return "kotlin.Int";
            case "java.lang.Cloneable":
                return "kotlin.Cloneable";
            case "java.lang.annotation.Annotation":
                return "kotlin.Annotation";
            case "java.lang.Comparable":
                return "kotlin.Comparable";
            case "java.util.Map":
                return "kotlin.collections.Map";
            case "java.util.Set":
                return "kotlin.collections.Set";
            case "double":
                return "kotlin.Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "kotlin.Byte.Companion";
            case "java.lang.CharSequence":
                return "kotlin.CharSequence";
            case "java.util.Collection":
                return "kotlin.collections.Collection";
            case "java.lang.Float":
                return "kotlin.Float";
            case "java.lang.Short":
                return "kotlin.Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "kotlin.Char.Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "kotlin.Long.Companion";
            case "java.util.Map$Entry":
                return "kotlin.collections.Map.Entry";
            case "int":
                return "kotlin.Int";
            case "byte":
                return "kotlin.Byte";
            case "char":
                return "kotlin.Char";
            case "long":
                return "kotlin.Long";
            case "boolean":
                return "kotlin.Boolean";
            case "java.util.List":
                return "kotlin.collections.List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "kotlin.Short.Companion";
            case "float":
                return "kotlin.Float";
            case "short":
                return "kotlin.Short";
            case "java.lang.Character":
                return "kotlin.Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "kotlin.Enum.Companion";
            case "java.lang.Boolean":
                return "kotlin.Boolean";
            case "java.lang.Byte":
                return "kotlin.Byte";
            case "java.lang.Enum":
                return "kotlin.Enum";
            case "java.lang.Long":
                return "kotlin.Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "kotlin.Float.Companion";
            case "java.util.Iterator":
                return "kotlin.collections.Iterator";
            case "java.util.ListIterator":
                return "kotlin.collections.ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "kotlin.String.Companion";
            case "java.lang.Double":
                return "kotlin.Double";
            case "java.lang.Number":
                return "kotlin.Number";
            case "java.lang.Object":
                return "kotlin.Any";
            case "java.lang.String":
                return "kotlin.String";
            case "java.lang.Iterable":
                return "kotlin.collections.Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "kotlin.Boolean.Companion";
            case "java.lang.Throwable":
                return "kotlin.Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "kotlin.Int.Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public int p(int i2, int i3, fl2 fl2Var) {
        return Math.round((1.0f - 1.0f) * ((i2 - i3) / 2.0f));
    }
}
