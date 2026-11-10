package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kc6 {
    public static final v92 g = new v92((Object) new bi6(22), (byte) 19);

    public static final boolean g(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = pi1.j;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i = 0;
                while (i < size) {
                    i++;
                    Object obj2 = arrayList.get(i);
                    gj4 gj4Var = (gj4) obj2;
                    gj4 gj4Var2 = (gj4) obj;
                    arrayList2.add(new wi3((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (gj4Var2.l().y() >> 32)) - Float.intBitsToFloat((int) (gj4Var.l().y() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (gj4Var2.l().y() & 4294967295L)) - Float.intBitsToFloat((int) (gj4Var.l().y() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((wi3) cj0.j0(list)).g;
            } else {
                if (list.isEmpty()) {
                    tw2.r("Empty collection can't be reduced.");
                }
                Object objJ0 = cj0.j0(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i2 = 1;
                    while (true) {
                        objJ0 = new wi3(wi3.v(((wi3) objJ0).g, ((wi3) list.get(i2)).g));
                        if (i2 == size2) {
                            break;
                        }
                        i2++;
                    }
                }
                j = ((wi3) objJ0).g;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static final void n(m2 m2Var, gj4 gj4Var) {
        Object objL = gj4Var.m().j.l(kj4.x);
        if (objL == null) {
            objL = null;
        }
        bj0 bj0Var = (bj0) objL;
        if (bj0Var != null) {
            m2Var.A(k2.n(bj0Var.g, bj0Var.y, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object objL2 = gj4Var.m().j.l(kj4.v);
        if ((objL2 != null ? objL2 : null) != null) {
            List listT = gj4Var.t((4 & 1) != 0 ? !gj4Var.y : false, (4 & 2) == 0);
            int size = listT.size();
            for (int i = 0; i < size; i++) {
                gj4 gj4Var2 = (gj4) listT.get(i);
                if (gj4Var2.m().j.r(kj4.K)) {
                    arrayList.add(gj4Var2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zG = g(arrayList);
        m2Var.A(k2.n(zG ? 1 : arrayList.size(), zG ? arrayList.size() : 1, 0));
    }

    public static final boolean r(gj4 gj4Var) {
        Object objL = gj4Var.m().j.l(kj4.x);
        if (objL == null) {
            objL = null;
        }
        if (objL != null) {
            return true;
        }
        Object objL2 = gj4Var.m().j.l(kj4.v);
        return (objL2 != null ? objL2 : null) != null;
    }

    public static final void v(m2 m2Var, gj4 gj4Var) {
        Object objL = gj4Var.m().j.l(kj4.l);
        if (objL == null) {
            objL = null;
        }
        if (objL != null) {
            uo1.B();
            return;
        }
        gj4 gj4VarQ = gj4Var.q();
        if (gj4VarQ == null) {
            return;
        }
        Object objL2 = gj4VarQ.m().j.l(kj4.v);
        if (objL2 == null) {
            objL2 = null;
        }
        if (objL2 != null) {
            Object objL3 = gj4VarQ.m().j.l(kj4.x);
            bj0 bj0Var = (bj0) (objL3 != null ? objL3 : null);
            if (bj0Var == null || (bj0Var.g >= 0 && bj0Var.y >= 0)) {
                if (gj4Var.m().j.r(kj4.K)) {
                    ArrayList arrayList = new ArrayList();
                    List listT = gj4VarQ.t((4 & 1) != 0 ? !gj4VarQ.y : false, (4 & 2) == 0);
                    int size = listT.size();
                    int i = 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        gj4 gj4Var2 = (gj4) listT.get(i2);
                        if (gj4Var2.m().j.r(kj4.K)) {
                            arrayList.add(gj4Var2);
                            if (gj4Var2.r.f() < gj4Var.r.f()) {
                                i++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean zG = g(arrayList);
                    int i3 = zG ? 0 : i;
                    int i4 = zG ? i : 0;
                    Object objL4 = gj4Var.m().j.l(kj4.K);
                    if (objL4 == null) {
                        objL4 = Boolean.FALSE;
                    }
                    m2Var.B(l2.g(((Boolean) objL4).booleanValue(), i3, 1, i4, 1));
                }
            }
        }
    }

    public static int x(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static final Rect y(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        int i3 = i;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i3 - 1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i3 < i2) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i3, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i3, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i3, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i3, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i3 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i3, i2, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i3, i2, rect3);
        return rect3;
    }
}
