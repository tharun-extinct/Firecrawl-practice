package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.widget.TextView;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes.dex */
public abstract class mq2 {
    public static final int A(ga3 ga3Var) {
        int iR;
        int i = ga3Var.y;
        int iR2 = ga3Var.r(0);
        while (ga3Var.y != 0 && ga3Var.r(0) == iR2) {
            ga3Var.x(0, ga3Var.n());
            ga3Var.v(ga3Var.y - 1);
            int i2 = ga3Var.y;
            int i3 = i2 >>> 1;
            int i4 = 0;
            while (i4 < i3) {
                int iR3 = ga3Var.r(i4);
                int i5 = (i4 + 1) * 2;
                int i6 = i5 - 1;
                int iR4 = ga3Var.r(i6);
                if (i5 < i2 && (iR = ga3Var.r(i5)) > iR4) {
                    if (iR <= iR3) {
                        break;
                    }
                    ga3Var.x(i4, iR);
                    ga3Var.x(i5, iR3);
                    i4 = i5;
                } else {
                    if (iR4 <= iR3) {
                        break;
                    }
                    ga3Var.x(i4, iR4);
                    ga3Var.x(i6, iR3);
                    i4 = i6;
                }
            }
        }
        return iR2;
    }

    public static final long B(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final xd2 C(nd2 nd2Var) {
        return new xd2(nd2Var.g, nd2Var.y, nd2Var.r, nd2Var.n);
    }

    public static ActionMode.Callback D(ActionMode.Callback callback) {
        return (!(callback instanceof p85) || Build.VERSION.SDK_INT < 26) ? callback : ((p85) callback).g();
    }

    public static ActionMode.Callback E(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof p85) || callback == null) ? callback : new p85(callback, textView);
    }

    public static final xt2 a(gu2 gu2Var) {
        gu2Var.getClass();
        ju2 ju2VarA = gu2Var.a();
        ju2VarA.getClass();
        y22 y22Var = ju2VarA.g;
        while (true) {
            xt2 xt2Var = (xt2) ((AtomicReference) y22Var.t).get();
            if (xt2Var != null) {
                return xt2Var;
            }
            yy4 yy4VarV = v13.v();
            x21 x21Var = na1.g;
            xt2 xt2Var2 = new xt2(ju2VarA, a11.k(yy4VarV, p03.g.w));
            AtomicReference atomicReference = (AtomicReference) y22Var.t;
            do {
                mu0 mu0Var = null;
                if (atomicReference.compareAndSet(null, xt2Var2)) {
                    x21 x21Var2 = na1.g;
                    m50.T(xt2Var2, p03.g.w, new ko((Object) xt2Var2, mu0Var, (byte) 10), 2);
                    return xt2Var2;
                }
            } while (atomicReference.get() == null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(i73 i73Var, my1 my1Var) {
        ui3 ui3Var = i73Var.c;
        if (ui3Var == null) {
            ui3Var = new ui3((ti3) i73Var);
            i73Var.c = ui3Var;
        }
        sn3 snapshotObserver = ((ba) k33.W(i73Var)).getSnapshotObserver();
        snapshotObserver.g.n(ui3Var, ui3.t, my1Var);
    }

    public static final int c(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static void d(TextView textView, int i) {
        xs2.j(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void e(TextView textView, int i) {
        xs2.j(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public static TypedValue f(View view, int i) {
        return o(i, view.getContext(), view.getClass().getCanonicalName());
    }

    public static final void g(List list, vt2 vt2Var, h02 h02Var, int i) {
        h02Var.Z(1533427666);
        byte b = 2;
        byte b2 = 19;
        if ((((h02Var.j(list) ? 4 : 2) | i | 48) & 19) == 18 && h02Var.e()) {
            h02Var.Q();
        } else {
            vt2Var = vt2.ON_RESUME;
            h02Var.X(-67706430);
            boolean zX = h02Var.x(list);
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (zX || objK == l76Var) {
                objK = new ol0(vt2Var, list, b);
                h02Var.i0(objK);
            }
            du2 du2Var = (du2) objK;
            h02Var.b(false);
            ju2 ju2VarA = ((gu2) h02Var.a(ix2.g)).a();
            h02Var.X(-67685064);
            boolean zJ = h02Var.j(ju2VarA) | h02Var.j(du2Var);
            Object objK2 = h02Var.K();
            if (zJ || objK2 == l76Var) {
                objK2 = new xf(ju2VarA, du2Var, (byte) 21);
                h02Var.i0(objK2);
            }
            h02Var.b(false);
            k33.t(ju2VarA, du2Var, (xy1) objK2, h02Var);
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new vn(b2, i, list, vt2Var);
        }
    }

    public static int h(Context context, int i, int i2) {
        TypedValue typedValueU = u(context.getTheme(), i);
        return (typedValueU == null || typedValueU.type != 16) ? i2 : typedValueU.data;
    }

    public static final u33 i(fb4 fb4Var, int i, int i2, int i3, int i4, int i5, v33 v33Var, List list, us3[] us3VarArr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        float f;
        int i10;
        int i11;
        int i12;
        List list2 = list;
        long j = i5;
        int i13 = i7 - i6;
        int[] iArr2 = new int[i13];
        int i14 = i6;
        int iMax = 0;
        int i15 = 0;
        int i16 = 0;
        int iMin = 0;
        float f2 = 0.0f;
        while (i14 < i7) {
            p33 p33Var = (p33) list2.get(i14);
            float fH = kq2.H(kq2.E(p33Var));
            if (fH > 0.0f) {
                f2 += fH;
                i15++;
                i10 = i14;
            } else {
                int i17 = i3 - i16;
                us3 us3VarV = us3VarArr[i14];
                if (us3VarV == null) {
                    if (i3 == Integer.MAX_VALUE) {
                        i10 = i14;
                        i11 = i15;
                        i12 = Integer.MAX_VALUE;
                    } else {
                        i10 = i14;
                        i11 = i15;
                        i12 = i17 < 0 ? 0 : i17;
                    }
                    us3VarV = p33Var.v(fb4Var.l(0, i12, i4, false));
                } else {
                    i10 = i14;
                    i11 = i15;
                }
                us3 us3Var = us3VarV;
                int iT = fb4Var.t(us3Var);
                int iJ = fb4Var.j(us3Var);
                iArr2[i10 - i6] = iT;
                int i18 = i17 - iT;
                if (i18 < 0) {
                    i18 = 0;
                }
                iMin = Math.min(i5, i18);
                i16 += iT + iMin;
                iMax = Math.max(iMax, iJ);
                us3VarArr[i10] = us3Var;
                i15 = i11;
            }
            i14 = i10 + 1;
            j = j;
        }
        long j2 = j;
        int i19 = i15;
        if (i19 == 0) {
            i16 -= iMin;
            i9 = 0;
        } else {
            long j3 = ((long) (i19 - 1)) * j2;
            long jRound = ((long) ((i3 != Integer.MAX_VALUE ? i3 : i) - i16)) - j3;
            if (jRound < 0) {
                jRound = 0;
            }
            float f3 = jRound / f2;
            for (int i20 = i6; i20 < i7; i20++) {
                jRound -= (long) Math.round(kq2.H(kq2.E((p33) list2.get(i20))) * f3);
            }
            int i21 = i6;
            int i22 = iMax;
            int i23 = 0;
            while (i21 < i7) {
                if (us3VarArr[i21] == null) {
                    p33 p33Var2 = (p33) list2.get(i21);
                    f = f3;
                    gb4 gb4VarE = kq2.E(p33Var2);
                    float fH2 = kq2.H(gb4VarE);
                    if (fH2 <= 0.0f) {
                        kc2.y("All weights <= 0 should have placeables");
                    }
                    int iSignum = Long.signum(jRound);
                    long j4 = jRound - ((long) iSignum);
                    int iMax2 = Math.max(0, Math.round(fH2 * f) + iSignum);
                    us3 us3VarV2 = p33Var2.v(fb4Var.l((!(gb4VarE != null ? gb4VarE.y : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i4, true));
                    int iT2 = fb4Var.t(us3VarV2);
                    int iJ2 = fb4Var.j(us3VarV2);
                    iArr2[i21 - i6] = iT2;
                    i23 += iT2;
                    int iMax3 = Math.max(i22, iJ2);
                    us3VarArr[i21] = us3VarV2;
                    i22 = iMax3;
                    jRound = j4;
                } else {
                    f = f3;
                }
                i21++;
                list2 = list;
                f3 = f;
            }
            i9 = (int) (((long) i23) + j3);
            int i24 = i3 - i16;
            if (i9 < 0) {
                i9 = 0;
            }
            if (i9 > i24) {
                i9 = i24;
            }
            iMax = i22;
        }
        int i25 = i9 + i16;
        if (i25 < 0) {
            i25 = 0;
        }
        int iMax4 = Math.max(i25, i);
        int iMax5 = Math.max(iMax, Math.max(i2, 0));
        int[] iArr3 = new int[i13];
        fb4Var.x(iMax4, iArr2, iArr3, v33Var);
        return fb4Var.a(us3VarArr, v33Var, iArr3, iMax4, iMax5, iArr, i8, i6, i7);
    }

    public static void k(TextView textView, int i) {
        xs2.j(i);
        if (Build.VERSION.SDK_INT >= 28) {
            ym.q(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static bk4 l(ad3 ad3Var) {
        ad3Var.getClass();
        return dk4.L(ad3Var, new pc3((byte) 4));
    }

    public static final int m(TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            return typedArray.getResourceId(i, 0);
        }
        l0.u("Attribute not defined in set.");
        return 0;
    }

    public static final c23 n(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new c23(matcher, charSequence);
        }
        return null;
    }

    public static TypedValue o(int i, Context context, String str) {
        TypedValue typedValueU = u(context.getTheme(), i);
        if (typedValueU != null) {
            return typedValueU;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static w53 p(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            uo1.t("Cannot read metadata.");
            return null;
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = byteBufferDuplicate.getInt();
                long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    byteBufferDuplicate.position((int) (j3 + j));
                    w53 w53Var = new w53();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    w53Var.m = byteBufferDuplicate;
                    w53Var.j = iPosition;
                    int i6 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    w53Var.t = i6;
                    w53Var.a = ((ByteBuffer) w53Var.m).getShort(i6);
                    return w53Var;
                }
            }
        }
        uo1.t("Cannot read metadata.");
        return null;
    }

    public static final lg5 q(h02 h02Var) {
        WeakHashMap weakHashMap = yp5.k;
        return new lg5(v13.t(h02Var).l, v13.t(h02Var).y);
    }

    public static final void r(ga3 ga3Var, int i) {
        if (ga3Var.y == 0 || !(ga3Var.r(0) == i || ga3Var.r(ga3Var.y - 1) == i)) {
            int i2 = ga3Var.y;
            ga3Var.g(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int iR = ga3Var.r(i3);
                if (i <= iR) {
                    break;
                }
                ga3Var.x(i2, iR);
                i2 = i3;
            }
            ga3Var.x(i2, i);
        }
    }

    public static PorterDuff.Mode s(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case kq2.x /* 15 */:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static TypedValue u(Resources.Theme theme, int i) {
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static final long v(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static yv3 w(en enVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new yv3(ym.t(enVar));
        }
        aq3 aq3Var = new aq3(new TextPaint(enVar.getPaint()));
        aq3Var.w(enVar.getBreakStrategy());
        aq3Var.c(enVar.getHyphenationFrequency());
        if (enVar.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i < 28 || (enVar.getInputType() & 15) != 3) {
            boolean z = enVar.getLayoutDirection() == 1;
            switch (enVar.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    textDirectionHeuristic = !z ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(ym.n(by5.v(enVar.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        aq3Var.i(textDirectionHeuristic);
        return aq3Var.g();
    }

    public static String x(jq jqVar, int i) {
        jqVar.getClass();
        if (i <= 16777215) {
            return String.valueOf(i);
        }
        try {
            Context context = jqVar.j;
            context.getClass();
            String resourceName = context.getResources().getResourceName(i);
            resourceName.getClass();
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i);
        }
    }

    public static final void y(h02 h02Var, j73 j73Var) {
        y50 y50Var = y50.x;
        int iHashCode = Long.hashCode(h02Var.T);
        j73 j73VarW = m50.W(h02Var, j73Var);
        tr3 tr3VarQ = h02Var.q();
        jo0.n.getClass();
        h02Var.b0();
        if (h02Var.S) {
            h02Var.m(um2.Z);
        } else {
            h02Var.l0();
        }
        xs2.E(tg1.w, h02Var, y50Var);
        xs2.E(tg1.q, h02Var, tr3VarQ);
        xs2.D(h02Var);
        xs2.E(tg1.m, h02Var, j73VarW);
        xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode));
        h02Var.b(true);
    }

    public static boolean z(Resources.Theme theme, int i, boolean z) {
        TypedValue typedValueU = u(theme, i);
        if (typedValueU == null || typedValueU.type != 18) {
            return z;
        }
        return typedValueU.data != 0;
    }

    public abstract bm j();

    public Object t(int i) {
        Object objA;
        of2 of2VarN = j().n(i);
        int i2 = i - of2VarN.g;
        xy1 key = of2VarN.r.getKey();
        return (key == null || (objA = key.a(Integer.valueOf(i2))) == null) ? new l21(i) : objA;
    }
}
