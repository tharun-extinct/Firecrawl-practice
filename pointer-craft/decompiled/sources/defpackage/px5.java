package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.widget.TextView;
import java.text.Bidi;

/* JADX INFO: loaded from: classes2.dex */
public abstract class px5 {
    public static final int g = 9;
    public static final int r = 12;
    public static final int y = 10;

    public static final void g(ql4 ql4Var, boolean z, bz1 bz1Var, bz1 bz1Var2, h02 h02Var, int i) {
        Object qcVar;
        bz1Var.getClass();
        bz1Var2.getClass();
        h02Var.Z(1726601105);
        int i2 = i | (h02Var.j(ql4Var) ? 4 : 2) | (h02Var.l(z) ? 32 : 16) | (h02Var.j(bz1Var) ? 256 : 128) | (h02Var.j(bz1Var2) ? 2048 : 1024);
        byte b = 1;
        if (h02Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            Object objK = h02Var.K();
            Object obj = oo0.g;
            if (objK == obj) {
                objK = kq2.M(Boolean.valueOf(ql4Var.e));
                h02Var.i0(objK);
            }
            ob3 ob3Var = (ob3) objK;
            Object objK2 = h02Var.K();
            if (objK2 == obj) {
                objK2 = kq2.M(Boolean.valueOf(ql4Var.A));
                h02Var.i0(objK2);
            }
            ob3 ob3Var2 = (ob3) objK2;
            Object objK3 = h02Var.K();
            if (objK3 == obj) {
                objK3 = kq2.M(Boolean.valueOf(ql4Var.B));
                h02Var.i0(objK3);
            }
            ob3 ob3Var3 = (ob3) objK3;
            Object objK4 = h02Var.K();
            if (objK4 == obj) {
                objK4 = kq2.M("");
                h02Var.i0(objK4);
            }
            ob3 ob3Var4 = (ob3) objK4;
            Context context = (Context) h02Var.a(sa.y);
            Object objK5 = h02Var.K();
            if (objK5 == obj) {
                objK5 = k33.E(h02Var);
                h02Var.i0(objK5);
            }
            ox0 ox0Var = (ox0) objK5;
            boolean zJ = h02Var.j(context) | ((i2 & 7168) == 2048);
            Object objK6 = h02Var.K();
            if (zJ || objK6 == obj) {
                qcVar = new qc(bz1Var2, context, ob3Var3, ob3Var4, ob3Var, (byte) 2);
                context = context;
                h02Var.i0(qcVar);
            } else {
                qcVar = objK6;
            }
            xy1 xy1Var = (xy1) qcVar;
            boolean zJ2 = h02Var.j(context);
            Object objK7 = h02Var.K();
            if (zJ2 || objK7 == obj) {
                objK7 = new jt(context, b);
                h02Var.i0(objK7);
            }
            da3 da3VarX = x(xy1Var, (xy1) objK7, h02Var);
            Boolean bool = (Boolean) ob3Var2.getValue();
            bool.getClass();
            boolean zX = h02Var.x(da3VarX);
            Object objK8 = h02Var.K();
            if (zX || objK8 == obj) {
                objK8 = new mt(da3VarX, ob3Var2, (mu0) null, b);
                h02Var.i0(objK8);
            }
            k33.b((bz1) objK8, h02Var, bool);
            uz4.g(mq4.r, null, ((rj0) h02Var.a(tj0.g)).c, 0L, 0.0f, 0.0f, null, ue5.m0(-1557355476, new xw(ox0Var, da3VarX, z, ob3Var, bz1Var, ob3Var2, ob3Var3), h02Var), h02Var, 12582918, 122);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new yw(ql4Var, z, bz1Var, bz1Var2, i, (byte) 0);
        }
    }

    public static final int[] n(h75 h75Var, Layout layout, cp1 cp1Var, RectF rectF, int i, ed edVar) {
        oh4 u32Var;
        int i2;
        if (i == 1) {
            u32Var = new rk4((Object) h75Var.x.getText(), (Object) h75Var.m(), (byte) 24);
        } else {
            CharSequence text = h75Var.x.getText();
            u32Var = Build.VERSION.SDK_INT >= 29 ? new u32(text, h75Var.g) : new v32(text);
        }
        oh4 oh4Var = u32Var;
        int lineForVertical = layout.getLineForVertical((int) rectF.top);
        if (rectF.top > h75Var.n(lineForVertical) && (lineForVertical = lineForVertical + 1) >= h75Var.l) {
            return null;
        }
        int i3 = lineForVertical;
        int lineForVertical2 = layout.getLineForVertical((int) rectF.bottom);
        if (lineForVertical2 == 0 && rectF.bottom < h75Var.j(0)) {
            return null;
        }
        int iV = v(h75Var, layout, cp1Var, i3, rectF, oh4Var, edVar, true);
        while (true) {
            i2 = i3;
            if (iV != -1 || i2 >= lineForVertical2) {
                break;
            }
            i3 = i2 + 1;
            iV = v(h75Var, layout, cp1Var, i3, rectF, oh4Var, edVar, true);
        }
        if (iV == -1) {
            return null;
        }
        int iV2 = v(h75Var, layout, cp1Var, lineForVertical2, rectF, oh4Var, edVar, false);
        while (iV2 == -1 && i2 < lineForVertical2) {
            int i4 = lineForVertical2 - 1;
            iV2 = v(h75Var, layout, cp1Var, i4, rectF, oh4Var, edVar, false);
            lineForVertical2 = i4;
        }
        if (iV2 == -1) {
            return null;
        }
        return new int[]{oh4Var.y(iV + 1), oh4Var.n(iV2 - 1)};
    }

    public static final float r(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    /* JADX WARN: Code duplicated, block: B:144:0x025e A[EDGE_INSN: B:144:0x025e->B:171:0x02ba BREAK  A[LOOP:5: B:154:0x027a->B:206:0x027a]] */
    /* JADX WARN: Code duplicated, block: B:86:0x01a6  */
    public static final int v(h75 h75Var, Layout layout, cp1 cp1Var, int i, RectF rectF, oh4 oh4Var, ed edVar, boolean z) {
        am2[] am2VarArr;
        am2[] am2VarArr2;
        int i2;
        int iN;
        int i3;
        int i4;
        int iY;
        Bidi bidiCreateLineBidi;
        float fG;
        float fG2;
        float fG3;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i5 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i5];
        Layout layout2 = h75Var.x;
        int lineStart2 = layout2.getLineStart(i);
        int iV = h75Var.v(i);
        if (i5 < (iV - lineStart2) * 2) {
            nc2.g("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        g72 g72Var = new g72(h75Var);
        boolean z2 = false;
        boolean z3 = layout2.getParagraphDirection(i) == 1;
        int i6 = 0;
        while (lineStart2 < iV) {
            boolean zIsRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z3 && !zIsRtlCharAt) {
                fG = g72Var.g(lineStart2, z2, z2, true);
                fG3 = g72Var.g(lineStart2 + 1, true, true, true);
            } else if (z3 && zIsRtlCharAt) {
                fG3 = g72Var.g(lineStart2, false, false, false);
                fG = g72Var.g(lineStart2 + 1, true, true, false);
            } else {
                if (zIsRtlCharAt) {
                    fG2 = g72Var.g(lineStart2, false, false, true);
                    fG = g72Var.g(lineStart2 + 1, true, true, true);
                } else {
                    fG = g72Var.g(lineStart2, false, false, false);
                    fG2 = g72Var.g(lineStart2 + 1, true, true, false);
                }
                fG3 = fG2;
            }
            fArr[i6] = fG;
            fArr[i6 + 1] = fG3;
            i6 += 2;
            lineStart2++;
            z3 = z3;
            z2 = false;
        }
        Layout layout3 = (Layout) cp1Var.g;
        int lineStart3 = layout3.getLineStart(i);
        int lineEnd2 = layout3.getLineEnd(i);
        int iX = cp1Var.x(lineStart3, false);
        int iL = cp1Var.l(iX);
        int i7 = lineStart3 - iL;
        int i8 = lineEnd2 - iL;
        Bidi bidiG = cp1Var.g(iX);
        if (bidiG == null || (bidiCreateLineBidi = bidiG.createLineBidi(i7, i8)) == null) {
            am2VarArr = new am2[]{new am2(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = bidiCreateLineBidi.getRunCount();
            am2VarArr = new am2[runCount];
            int i9 = 0;
            while (i9 < runCount) {
                int i10 = runCount;
                am2VarArr[i9] = new am2(bidiCreateLineBidi.getRunStart(i9) + lineStart3, bidiCreateLineBidi.getRunLimit(i9) + lineStart3, bidiCreateLineBidi.getRunLevel(i9) % 2 == 1);
                i9++;
                runCount = i10;
            }
        }
        ke2 me2Var = z ? new me2(0, am2VarArr.length - 1, 1) : new ke2(am2VarArr.length - 1, 0, -1);
        int i11 = me2Var.j;
        int i12 = me2Var.t;
        int i13 = me2Var.a;
        if ((i13 <= 0 || i11 > i12) && (i13 >= 0 || i12 > i11)) {
            return -1;
        }
        while (true) {
            am2 am2Var = am2VarArr[i11];
            boolean z4 = am2Var.r;
            int iL2 = am2Var.g;
            int iM = am2Var.y;
            float f = z4 ? fArr[((iM - 1) - lineStart) * 2] : fArr[(iL2 - lineStart) * 2];
            float fR = z4 ? r(iL2, lineStart, fArr) : r(iM - 1, lineStart, fArr);
            float f2 = rectF.left;
            int i14 = i13;
            if (!z) {
                am2VarArr2 = am2VarArr;
                if (fR < f2) {
                    iM = -1;
                    break;
                }
                float f3 = rectF.right;
                if (f <= f3) {
                    if ((z4 || f3 < fR) && (!z4 || f2 > f)) {
                        int i15 = iM;
                        int i16 = iL2;
                        while (i15 - i16 > 1) {
                            int i17 = (i15 + i16) / 2;
                            float f4 = fArr[(i17 - lineStart) * 2];
                            int i18 = i15;
                            if ((z4 || f4 <= rectF.right) && (!z4 || f4 >= rectF.left)) {
                                i15 = i18;
                                i16 = i17;
                            } else {
                                i15 = i17;
                            }
                        }
                        i2 = z4 ? i15 : i16;
                    } else {
                        i2 = iM - 1;
                    }
                    int iY2 = oh4Var.y(i2 + 1);
                    if (iY2 == -1 || (iN = oh4Var.n(iY2)) <= iL2) {
                        iM = -1;
                        break;
                    }
                    if (iY2 < iL2) {
                        iY2 = iL2;
                    }
                    if (iN <= iM) {
                        iM = iN;
                    }
                    RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                    int iY3 = iY2;
                    while (true) {
                        rectF2.left = z4 ? fArr[((iM - 1) - lineStart) * 2] : fArr[(iY3 - lineStart) * 2];
                        rectF2.right = z4 ? r(iY3, lineStart, fArr) : r(iM - 1, lineStart, fArr);
                        if (((Boolean) edVar.l(rectF2, rectF)).booleanValue()) {
                            break;
                        }
                        iM = oh4Var.m(iM);
                        if (iM == -1 || iM <= iL2) {
                            iM = -1;
                            break;
                        }
                        iY3 = oh4Var.y(iM);
                        if (iY3 < iL2) {
                            iY3 = iL2;
                        }
                    }
                } else {
                    iM = -1;
                    break;
                }
                iL2 = iM;
            } else {
                if (fR < f2) {
                    am2VarArr2 = am2VarArr;
                    iL2 = -1;
                    break;
                }
                float f5 = rectF.right;
                if (f <= f5) {
                    if ((z4 || f2 > f) && (!z4 || f5 < fR)) {
                        int i19 = iM;
                        int i20 = iL2;
                        while (true) {
                            i3 = i19;
                            if (i19 - i20 <= 1) {
                                break;
                            }
                            int i21 = (i3 + i20) / 2;
                            float f6 = fArr[(i21 - lineStart) * 2];
                            if ((z4 || f6 <= rectF.left) && (!z4 || f6 >= rectF.right)) {
                                i19 = i3;
                                i20 = i21;
                            } else {
                                i19 = i21;
                            }
                        }
                        i4 = z4 ? i3 : i20;
                    } else {
                        i4 = iL2;
                    }
                    int iN2 = oh4Var.n(i4);
                    if (iN2 != -1 && (iY = oh4Var.y(iN2)) < iM) {
                        if (iY >= iL2) {
                            iL2 = iY;
                        }
                        if (iN2 > iM) {
                            iN2 = iM;
                        }
                        am2VarArr2 = am2VarArr;
                        RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                        int iN3 = iN2;
                        while (true) {
                            rectF3.left = z4 ? fArr[((iN3 - 1) - lineStart) * 2] : fArr[(iL2 - lineStart) * 2];
                            rectF3.right = z4 ? r(iL2, lineStart, fArr) : r(iN3 - 1, lineStart, fArr);
                            if (((Boolean) edVar.l(rectF3, rectF)).booleanValue()) {
                                break;
                            }
                            iL2 = oh4Var.l(iL2);
                            if (iL2 != -1 && iL2 < iM) {
                                iN3 = oh4Var.n(iL2);
                                if (iN3 > iM) {
                                    iN3 = iM;
                                }
                            }
                        }
                    } else {
                        am2VarArr2 = am2VarArr;
                    }
                    iL2 = -1;
                    break;
                } else {
                    am2VarArr2 = am2VarArr;
                    iL2 = -1;
                    break;
                }
            }
            if (iL2 >= 0) {
                return iL2;
            }
            if (i11 == i12) {
                return -1;
            }
            i11 += i14;
            i13 = i14;
            am2VarArr = am2VarArr2;
        }
    }

    public static final da3 x(xy1 xy1Var, xy1 xy1Var2, h02 h02Var) {
        xy1Var.getClass();
        xy1Var2.getClass();
        Context context = (Context) h02Var.a(sa.y);
        ob3 ob3VarQ = kq2.Q(xy1Var, h02Var);
        ob3 ob3VarQ2 = kq2.Q(xy1Var2, h02Var);
        boolean zX = h02Var.x(context);
        Object objK = h02Var.K();
        if (zX || objK == oo0.g) {
            objK = new da3(context, new ff(ob3VarQ, (byte) 2), new ff(ob3VarQ2, (byte) 3));
            h02Var.i0(objK);
        }
        return (da3) objK;
    }

    public static StaticLayout y(CharSequence charSequence, Layout.Alignment alignment, int i, int i2, TextView textView, TextPaint textPaint, gn gnVar) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
        StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i2);
        try {
            gnVar.g(builderObtain, textView);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return builderObtain.build();
    }
}
