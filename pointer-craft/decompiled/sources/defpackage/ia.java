package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import io.appground.blek.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ia extends s1 implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final ga3 U;
    public int A;
    public Integer B;
    public final or C;
    public final m70 D;
    public boolean E;
    public fa F;
    public ha3 G;
    public final ia3 H;
    public final fa3 I;
    public final fa3 J;
    public final String K;
    public final String L;
    public final ro M;
    public final ha3 N;
    public hj4 O;
    public boolean P;
    public final fa3 Q;
    public final k R;
    public final ArrayList S;
    public final ca T;
    public List b;
    public final AccessibilityManager c;
    public final nu4 d;
    public final nu4 e;
    public final ha3 f;
    public m2 h;
    public long i;
    public final ha3 k;
    public final ba m;
    public boolean o;
    public int p;
    public final ea s;
    public int u;
    public m2 z;
    public int q = Integer.MIN_VALUE;
    public final ca w = new ca(this, 0);

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        ga3 ga3Var = ge2.g;
        ga3 ga3Var2 = new ga3(32);
        int i = ga3Var2.y;
        if (i < 0) {
            cf6.t("");
            throw null;
        }
        int i2 = i + 32;
        ga3Var2.y(i2);
        int[] iArr2 = ga3Var2.g;
        int i3 = ga3Var2.y;
        if (i != i3) {
            pr.M(i2, i, i3, iArr2, iArr2);
        }
        pr.P(i, 0, 12, iArr, iArr2);
        ga3Var2.y += 32;
        U = ga3Var2;
    }

    public ia(ba baVar) {
        this.m = baVar;
        Object systemService = baVar.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.c = (AccessibilityManager) systemService;
        this.i = 100L;
        new Handler(Looper.getMainLooper());
        this.s = new ea(this);
        this.p = Integer.MIN_VALUE;
        this.u = Integer.MIN_VALUE;
        this.f = new ha3();
        this.k = new ha3();
        this.d = new nu4(0);
        this.e = new nu4(0);
        this.A = -1;
        this.C = new or(0);
        byte b = 1;
        this.D = v70.y(1, 6, null);
        this.E = true;
        ha3 ha3Var = ie2.g;
        ha3Var.getClass();
        this.G = ha3Var;
        this.H = new ia3();
        this.I = new fa3();
        this.J = new fa3();
        this.K = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.L = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.M = new ro((byte) 29);
        this.N = new ha3();
        this.O = new hj4(baVar.getSemanticsOwner().g(), ha3Var);
        int i = de2.g;
        this.Q = new fa3();
        baVar.addOnAttachStateChangeListener(this);
        this.R = new k(this, b);
        this.S = new ArrayList();
        this.T = new ca(this, b);
    }

    public static /* synthetic */ void E(ia iaVar, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        iaVar.D(i, i2, num, null);
    }

    public static Rect L(br2 br2Var, float f, float f2) {
        if (!(br2Var instanceof ym3) && !(br2Var instanceof zm3)) {
            return null;
        }
        k44 k44VarP = br2Var.p();
        return new Rect((int) (k44VarP.g + f), (int) (k44VarP.y + f2), (int) (k44VarP.r + f), (int) (k44VarP.n + f2));
    }

    public static float[] N(br2 br2Var) {
        if (!(br2Var instanceof zm3)) {
            return null;
        }
        ha4 ha4Var = ((zm3) br2Var).n;
        long j = ha4Var.j;
        long j2 = ha4Var.l;
        long j3 = ha4Var.x;
        long j4 = ha4Var.v;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    public static Region O(br2 br2Var, float f, float f2) {
        if (br2Var instanceof xm3) {
            xm3 xm3Var = (xm3) br2Var;
            k44 k44VarJ = xm3Var.p().j(f, f2);
            Region region = new Region(new Rect((int) (k44VarJ.g + 0.0f), (int) (k44VarJ.y + 0.0f), (int) (k44VarJ.r + 0.0f), (int) (k44VarJ.n + 0.0f)));
            Region region2 = new Region();
            ld ldVar = xm3Var.n;
            if (ldVar instanceof ld) {
                Path path = ldVar.g;
                path.offset(f, f2);
                region2.setPath(path, region);
                return region2;
            }
            uo1.u("Unable to obtain android.graphics.Path");
        }
        return null;
    }

    public static CharSequence P(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i);
                charSequenceSubSequence.getClass();
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    public static final boolean d(cf4 cf4Var) {
        my1 my1Var = cf4Var.g;
        if (((Number) my1Var.g()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) my1Var.g()).floatValue();
        ((Number) cf4Var.y.g()).floatValue();
        return false;
    }

    public static final boolean e(cf4 cf4Var) {
        my1 my1Var = cf4Var.g;
        if (((Number) my1Var.g()).floatValue() < ((Number) cf4Var.y.g()).floatValue()) {
            return true;
        }
        ((Number) my1Var.g()).floatValue();
        return false;
    }

    public static final boolean k(cf4 cf4Var, float f) {
        my1 my1Var = cf4Var.g;
        if (f >= 0.0f || ((Number) my1Var.g()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) my1Var.g()).floatValue() < ((Number) cf4Var.y.g()).floatValue();
        }
        return true;
    }

    public static String z(gj4 gj4Var) {
        cj cjVar;
        if (gj4Var != null) {
            aj4 aj4Var = gj4Var.n;
            hb3 hb3Var = aj4Var.j;
            mj4 mj4Var = kj4.g;
            if (hb3Var.r(mj4Var)) {
                return tw2.g((List) aj4Var.y(mj4Var), ",", null, 62);
            }
            mj4 mj4Var2 = kj4.G;
            if (hb3Var.r(mj4Var2)) {
                Object objL = hb3Var.l(mj4Var2);
                if (objL == null) {
                    objL = null;
                }
                cj cjVar2 = (cj) objL;
                if (cjVar2 != null) {
                    return cjVar2.t;
                }
            } else {
                Object objL2 = hb3Var.l(kj4.C);
                if (objL2 == null) {
                    objL2 = null;
                }
                List list = (List) objL2;
                if (list != null && (cjVar = (cj) cj0.l0(list)) != null) {
                    return cjVar.t;
                }
            }
        }
        return null;
    }

    public final int A(int i) {
        if (i == this.m.getSemanticsOwner().g().x) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0088 A[LOOP:1: B:15:0x004c->B:28:0x0088, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x008b A[EDGE_INSN: B:44:0x008b->B:29:0x008b BREAK  A[LOOP:1: B:15:0x004c->B:28:0x0088], SYNTHETIC] */
    public final void B(gj4 gj4Var, hj4 hj4Var) {
        int[] iArr = pe2.g;
        ia3 ia3Var = new ia3();
        List listT = gj4Var.t((4 & 1) != 0 ? !gj4Var.y : false, (4 & 2) == 0);
        um2 um2Var = gj4Var.r;
        int size = listT.size();
        for (int i = 0; i < size; i++) {
            gj4 gj4Var2 = (gj4) listT.get(i);
            he2 he2VarU = u();
            int i2 = gj4Var2.x;
            if (he2VarU.g(i2)) {
                if (!hj4Var.y.r(i2)) {
                    f(um2Var);
                    return;
                }
                ia3Var.g(i2);
            }
        }
        ia3 ia3Var2 = hj4Var.y;
        int[] iArr2 = ia3Var2.y;
        long[] jArr = ia3Var2.g;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && !ia3Var.r(iArr2[(i3 << 3) + i5])) {
                            f(um2Var);
                            return;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        List listT2 = gj4Var.t((4 & 1) != 0 ? !gj4Var.y : false, (4 & 2) == 0);
        int size2 = listT2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            gj4 gj4Var3 = (gj4) listT2.get(i6);
            hj4 hj4Var2 = (hj4) this.N.y(gj4Var3.x);
            if (hj4Var2 != null && u().g(gj4Var3.x)) {
                B(gj4Var3, hj4Var2);
            }
        }
    }

    public final boolean C(AccessibilityEvent accessibilityEvent) {
        if (!o()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.o = true;
        }
        try {
            return ((Boolean) this.w.a(accessibilityEvent)).booleanValue();
        } finally {
            this.o = false;
        }
    }

    public final boolean D(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !o()) {
            return false;
        }
        AccessibilityEvent accessibilityEventI = i(i, i2);
        if (num != null) {
            accessibilityEventI.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventI.setContentDescription(tw2.g(list, ",", null, 62));
        }
        return C(accessibilityEventI);
    }

    public final void F(int i, int i2, String str) {
        AccessibilityEvent accessibilityEventI = i(A(i), 32);
        accessibilityEventI.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventI.getText().add(str);
        }
        C(accessibilityEventI);
    }

    public final void G(int i) {
        fa faVar = this.F;
        if (faVar != null) {
            if (i != faVar.n().x) {
                return;
            }
            if (SystemClock.uptimeMillis() - faVar.x() <= 1000) {
                AccessibilityEvent accessibilityEventI = i(A(faVar.n().x), 131072);
                accessibilityEventI.setFromIndex(faVar.y());
                accessibilityEventI.setToIndex(faVar.v());
                accessibilityEventI.setAction(faVar.g());
                accessibilityEventI.setMovementGranularity(faVar.r());
                accessibilityEventI.getText().add(z(faVar.n()));
                C(accessibilityEventI);
            }
        }
        this.F = null;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0284  */
    /* JADX WARN: Code duplicated, block: B:104:0x0298  */
    /* JADX WARN: Code duplicated, block: B:105:0x02af  */
    /* JADX WARN: Code duplicated, block: B:107:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:109:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:111:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:115:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:118:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:122:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:125:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:126:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:130:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:133:0x030b A[LOOP:4: B:128:0x02fa->B:133:0x030b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:138:0x0319  */
    /* JADX WARN: Code duplicated, block: B:141:0x032d A[LOOP:5: B:136:0x0315->B:141:0x032d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:148:0x0353  */
    /* JADX WARN: Code duplicated, block: B:153:0x035e  */
    /* JADX WARN: Code duplicated, block: B:158:0x0389  */
    /* JADX WARN: Code duplicated, block: B:161:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:167:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:170:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:171:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:173:0x040a  */
    /* JADX WARN: Code duplicated, block: B:175:0x0410  */
    /* JADX WARN: Code duplicated, block: B:183:0x045c  */
    /* JADX WARN: Code duplicated, block: B:187:0x0470  */
    /* JADX WARN: Code duplicated, block: B:236:0x052e  */
    /* JADX WARN: Code duplicated, block: B:239:0x0541  */
    /* JADX WARN: Code duplicated, block: B:242:0x0550  */
    /* JADX WARN: Code duplicated, block: B:246:0x055e  */
    /* JADX WARN: Code duplicated, block: B:265:0x0614  */
    /* JADX WARN: Code duplicated, block: B:287:0x0312 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x0314 A[EDGE_INSN: B:288:0x0314->B:135:0x0314 BREAK  A[LOOP:4: B:128:0x02fa->B:133:0x030b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:0x0330 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:0x0332 A[EDGE_INSN: B:290:0x0332->B:143:0x0332 BREAK  A[LOOP:5: B:136:0x0315->B:141:0x032d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0124  */
    /* JADX WARN: Code duplicated, block: B:49:0x012c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0139  */
    /* JADX WARN: Code duplicated, block: B:52:0x013d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0145  */
    /* JADX WARN: Code duplicated, block: B:55:0x0158  */
    /* JADX WARN: Code duplicated, block: B:57:0x0164  */
    /* JADX WARN: Code duplicated, block: B:59:0x017d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0185  */
    /* JADX WARN: Code duplicated, block: B:62:0x0195  */
    /* JADX WARN: Code duplicated, block: B:64:0x019d  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:77:0x01de  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x020b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0219  */
    /* JADX WARN: Code duplicated, block: B:88:0x022c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0233  */
    /* JADX WARN: Code duplicated, block: B:92:0x023b  */
    /* JADX WARN: Code duplicated, block: B:94:0x023e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0243  */
    /* JADX WARN: Code duplicated, block: B:98:0x0250  */
    public final void H(he2 he2Var) {
        Integer num;
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        int i;
        Integer num2;
        int i2;
        int i3;
        Integer num3;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i4;
        int i5;
        int i6;
        int i7;
        Integer num4;
        aj4 aj4Var;
        gj4 gj4Var;
        int i8;
        boolean zA;
        hb3 hb3Var;
        um2 um2Var;
        int i9;
        ArrayList arrayList3;
        long j;
        int i10;
        aj4 aj4Var2;
        boolean z;
        mj4 mj4Var;
        mj4 mj4Var2;
        gj4 gj4Var2;
        mj4 mj4Var3;
        String str;
        Integer num5;
        mj4 mj4Var4;
        of4 of4VarG;
        Object objL;
        Object objL2;
        boolean z2;
        int i11;
        Object objL3;
        cj cjVar;
        String str2;
        Integer num6;
        Object objL4;
        cj cjVar2;
        Object objL5;
        CharSequence charSequence;
        CharSequence charSequenceP;
        int length;
        int length2;
        Integer num7;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean zR;
        boolean z3;
        boolean z4;
        Integer num8;
        AccessibilityEvent accessibilityEventB;
        Object objL6;
        o94 o94Var;
        Object objL7;
        um2 um2Var2;
        AccessibilityEvent accessibilityEventI;
        Object objL8;
        String strG;
        Object objL9;
        List list;
        String strG2;
        String str3;
        boolean zR2;
        int i18;
        ia iaVar = this;
        he2 he2Var2 = he2Var;
        Integer num9 = 64;
        ArrayList arrayList4 = iaVar.S;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr3 = he2Var2.y;
        long[] jArr3 = he2Var2.g;
        int i19 = 2;
        int length3 = jArr3.length - 2;
        int i20 = 0;
        Integer num10 = 0;
        if (length3 < 0) {
            return;
        }
        int i21 = 0;
        while (true) {
            long j2 = jArr3[i21];
            int i22 = i19;
            int i23 = length3;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i24 = 8;
                int i25 = 8 - ((~(i21 - i23)) >>> 31);
                long j3 = j2;
                int i26 = i20;
                while (i26 < i25) {
                    if ((j3 & 255) < 128) {
                        int i27 = iArr3[(i21 << 3) + i26];
                        hj4 hj4Var = (hj4) iaVar.N.y(i27);
                        if (hj4Var == null) {
                            i3 = i26;
                            num3 = num9;
                            arrayList2 = arrayList5;
                            iArr2 = iArr3;
                            jArr2 = jArr3;
                            i4 = i24;
                            i5 = i25;
                            i6 = i20;
                            i7 = i21;
                            num4 = num10;
                        } else {
                            aj4 aj4Var3 = hj4Var.g;
                            hb3 hb3Var2 = aj4Var3.j;
                            ij4 ij4Var = (ij4) he2Var2.y(i27);
                            gj4 gj4VarY = ij4Var != null ? ij4Var.y() : null;
                            if (gj4VarY == null) {
                                mc2.r("no value for specified key");
                                l0.x();
                                return;
                            }
                            int i28 = i24;
                            um2 um2Var3 = gj4VarY.r;
                            aj4 aj4Var4 = gj4VarY.n;
                            iArr2 = iArr3;
                            int i29 = gj4VarY.x;
                            jArr2 = jArr3;
                            hb3 hb3Var3 = aj4Var4.j;
                            i7 = i21;
                            Object[] objArr = hb3Var3.y;
                            Object[] objArr2 = hb3Var3.r;
                            long[] jArr4 = hb3Var3.g;
                            i3 = i26;
                            int length4 = jArr4.length - 2;
                            if (length4 >= 0) {
                                um2 um2Var4 = um2Var3;
                                i5 = i25;
                                int i30 = 0;
                                zA = false;
                                while (true) {
                                    long j4 = jArr4[i30];
                                    gj4 gj4Var3 = gj4VarY;
                                    int i31 = i30;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i32 = 8 - ((~(i31 - length4)) >>> 31);
                                        int i33 = 0;
                                        while (i33 < i32) {
                                            if ((j4 & 255) < 128) {
                                                int i34 = (i31 << 3) + i33;
                                                Object obj = objArr[i34];
                                                int i35 = length4;
                                                Object obj2 = objArr2[i34];
                                                aj4Var2 = aj4Var3;
                                                mj4 mj4Var5 = (mj4) obj;
                                                j = j4;
                                                mj4 mj4Var6 = kj4.o;
                                                if (yf2.p(mj4Var5, mj4Var6) || yf2.p(mj4Var5, kj4.f)) {
                                                    of4 of4VarG2 = sf6.g(i27, arrayList5);
                                                    if (of4VarG2 != null) {
                                                        z = false;
                                                    } else {
                                                        of4VarG2 = new of4(i27, arrayList4);
                                                        z = true;
                                                    }
                                                    arrayList4.add(of4VarG2);
                                                } else {
                                                    z = false;
                                                }
                                                if (z) {
                                                    mj4Var = kj4.n;
                                                    if (yf2.p(mj4Var5, mj4Var)) {
                                                        obj2.getClass();
                                                        str3 = (String) obj2;
                                                        zR2 = hb3Var2.r(mj4Var);
                                                        i18 = i28;
                                                        if (zR2) {
                                                            iaVar.F(i27, i18, str3);
                                                        }
                                                    } else if (yf2.p(mj4Var5, kj4.y)) {
                                                        E(iaVar, iaVar.A(i27), 2048, num9, 8);
                                                        E(iaVar, iaVar.A(i27), 2048, num10, 8);
                                                    } else {
                                                        arrayList3 = arrayList5;
                                                        if (yf2.p(mj4Var5, kj4.L)) {
                                                            E(iaVar, iaVar.A(i27), 2048, 8192, 8);
                                                            E(iaVar, iaVar.A(i27), 2048, num10, 8);
                                                        } else if (yf2.p(mj4Var5, kj4.O)) {
                                                            E(iaVar, iaVar.A(i27), 2048, 3072, 8);
                                                        } else if (yf2.p(mj4Var5, kj4.r)) {
                                                            E(iaVar, iaVar.A(i27), 2048, num9, 8);
                                                            E(iaVar, iaVar.A(i27), 2048, num10, 8);
                                                        } else {
                                                            mj4Var2 = kj4.K;
                                                            if (yf2.p(mj4Var5, mj4Var2)) {
                                                                objL6 = hb3Var3.l(kj4.e);
                                                                if (objL6 == null) {
                                                                    objL6 = null;
                                                                }
                                                                o94Var = (o94) objL6;
                                                                if (o94Var == null && o94Var.g == 4) {
                                                                    objL7 = hb3Var3.l(mj4Var2);
                                                                    if (objL7 == null) {
                                                                        objL7 = null;
                                                                    }
                                                                    if (yf2.p(objL7, Boolean.TRUE)) {
                                                                        accessibilityEventI = iaVar.i(iaVar.A(i27), 4);
                                                                        gj4Var2 = gj4Var3;
                                                                        um2 um2Var5 = um2Var4;
                                                                        gj4 gj4Var4 = new gj4(gj4Var2.g, true, um2Var5, aj4Var4);
                                                                        objL8 = gj4Var4.m().j.l(kj4.g);
                                                                        if (objL8 == null) {
                                                                            objL8 = null;
                                                                        }
                                                                        List list2 = (List) objL8;
                                                                        um2Var2 = um2Var5;
                                                                        strG = list2 != null ? tw2.g(list2, ",", null, 62) : null;
                                                                        objL9 = gj4Var4.m().j.l(kj4.C);
                                                                        if (objL9 == null) {
                                                                            objL9 = null;
                                                                        }
                                                                        list = (List) objL9;
                                                                        if (list != null) {
                                                                            strG2 = tw2.g(list, ",", null, 62);
                                                                        } else {
                                                                            strG2 = null;
                                                                        }
                                                                        if (strG != null) {
                                                                            accessibilityEventI.setContentDescription(strG);
                                                                        }
                                                                        if (strG2 != null) {
                                                                            accessibilityEventI.getText().add(strG2);
                                                                        }
                                                                        iaVar.C(accessibilityEventI);
                                                                    } else {
                                                                        um2Var2 = um2Var4;
                                                                        gj4Var2 = gj4Var3;
                                                                        E(iaVar, iaVar.A(i27), 2048, num10, 8);
                                                                    }
                                                                } else {
                                                                    um2Var2 = um2Var4;
                                                                    gj4Var2 = gj4Var3;
                                                                    E(iaVar, iaVar.A(i27), 2048, num9, 8);
                                                                    E(iaVar, iaVar.A(i27), 2048, num10, 8);
                                                                }
                                                                um2Var4 = um2Var2;
                                                            } else {
                                                                um2Var4 = um2Var4;
                                                                gj4Var2 = gj4Var3;
                                                                i32 = i32;
                                                                i33 = i33;
                                                                if (yf2.p(mj4Var5, kj4.g)) {
                                                                    int iA = iaVar.A(i27);
                                                                    obj2.getClass();
                                                                    iaVar.D(iA, 2048, 4, (List) obj2);
                                                                } else {
                                                                    mj4Var3 = kj4.G;
                                                                    str = "";
                                                                    if (yf2.p(mj4Var5, mj4Var3)) {
                                                                        if (hb3Var3.r(yi4.m)) {
                                                                            objL4 = hb3Var2.l(mj4Var3);
                                                                            if (objL4 == null) {
                                                                                objL4 = null;
                                                                            }
                                                                            cjVar2 = (cj) objL4;
                                                                            if (cjVar2 == null) {
                                                                                cjVar2 = "";
                                                                            }
                                                                            objL5 = hb3Var3.l(mj4Var3);
                                                                            if (objL5 == null) {
                                                                                objL5 = null;
                                                                            }
                                                                            charSequence = (cj) objL5;
                                                                            if (charSequence == null) {
                                                                                charSequence = "";
                                                                            }
                                                                            charSequenceP = P(charSequence);
                                                                            length = cjVar2.length();
                                                                            length2 = charSequence.length();
                                                                            num7 = num10;
                                                                            if (length > length2) {
                                                                                i12 = length2;
                                                                            } else {
                                                                                i12 = length;
                                                                            }
                                                                            num9 = num9;
                                                                            i13 = 0;
                                                                            while (true) {
                                                                                i14 = i12;
                                                                                if (i13 < i12) {
                                                                                    i15 = length;
                                                                                    break;
                                                                                }
                                                                                i15 = length;
                                                                                if (cjVar2.charAt(i13) != charSequence.charAt(i13)) {
                                                                                    break;
                                                                                }
                                                                                i13++;
                                                                                i12 = i14;
                                                                                length = i15;
                                                                            }
                                                                            i16 = 0;
                                                                            while (true) {
                                                                                if (i16 < i14 - i13) {
                                                                                    i17 = i16;
                                                                                    break;
                                                                                }
                                                                                i17 = i16;
                                                                                if (cjVar2.charAt((i15 - 1) - i16) != charSequence.charAt((length2 - 1) - i17)) {
                                                                                    break;
                                                                                } else {
                                                                                    i16 = i17 + 1;
                                                                                }
                                                                            }
                                                                            int i36 = (i15 - i17) - i13;
                                                                            int i37 = (length2 - i17) - i13;
                                                                            mj4 mj4Var7 = kj4.N;
                                                                            boolean zR3 = hb3Var2.r(mj4Var7);
                                                                            boolean zR4 = hb3Var3.r(mj4Var7);
                                                                            zR = hb3Var2.r(kj4.G);
                                                                            if (zR || zR3 || !zR4) {
                                                                                z3 = false;
                                                                            } else {
                                                                                z3 = true;
                                                                            }
                                                                            if (zR || !zR3 || zR4) {
                                                                                z4 = false;
                                                                            } else {
                                                                                z4 = true;
                                                                            }
                                                                            if (!z3 || z4) {
                                                                                i27 = i27;
                                                                                num8 = num7;
                                                                                accessibilityEventB = iaVar.b(iaVar.A(i27), num8, num7, Integer.valueOf(length2), charSequenceP);
                                                                            } else {
                                                                                accessibilityEventB = iaVar.i(iaVar.A(i27), 16);
                                                                                accessibilityEventB.setFromIndex(i13);
                                                                                accessibilityEventB.setRemovedCount(i36);
                                                                                accessibilityEventB.setAddedCount(i37);
                                                                                accessibilityEventB.setBeforeText(cjVar2);
                                                                                accessibilityEventB.getText().add(charSequenceP);
                                                                                i27 = i27;
                                                                                num8 = num7;
                                                                            }
                                                                            accessibilityEventB.setClassName("android.widget.EditText");
                                                                            if (Build.VERSION.SDK_INT >= 37) {
                                                                                da.y(gj4Var2, accessibilityEventB);
                                                                            }
                                                                            iaVar.C(accessibilityEventB);
                                                                            if (!z3 || z4) {
                                                                                num6 = num8;
                                                                                long j5 = ((u75) aj4Var4.y(kj4.H)).g;
                                                                                accessibilityEventB.setFromIndex((int) (j5 >> 32));
                                                                                accessibilityEventB.setToIndex((int) (j5 & 4294967295L));
                                                                                iaVar.C(accessibilityEventB);
                                                                            } else {
                                                                                num6 = num8;
                                                                            }
                                                                        } else {
                                                                            num6 = num10;
                                                                            hb3Var2 = hb3Var2;
                                                                            num9 = num9;
                                                                            aj4Var2 = aj4Var2;
                                                                            i27 = i27;
                                                                            E(iaVar, iaVar.A(i27), 2048, Integer.valueOf(i22), 8);
                                                                        }
                                                                        gj4Var3 = gj4Var2;
                                                                        hb3Var2 = hb3Var2;
                                                                        i10 = i35;
                                                                        num10 = num6;
                                                                    } else {
                                                                        num5 = num10;
                                                                        hb3Var2 = hb3Var2;
                                                                        num9 = num9;
                                                                        aj4Var2 = aj4Var2;
                                                                        i27 = i27;
                                                                        mj4Var4 = kj4.H;
                                                                        if (yf2.p(mj4Var5, mj4Var4)) {
                                                                            objL3 = hb3Var3.l(mj4Var3);
                                                                            if (objL3 == null) {
                                                                                objL3 = null;
                                                                            }
                                                                            cjVar = (cj) objL3;
                                                                            if (cjVar != null && (str2 = cjVar.t) != null) {
                                                                                str = str2;
                                                                            }
                                                                            long j6 = ((u75) aj4Var4.y(mj4Var4)).g;
                                                                            gj4Var3 = gj4Var2;
                                                                            i10 = i35;
                                                                            num10 = num5;
                                                                            iaVar = this;
                                                                            iaVar.C(iaVar.b(iaVar.A(i27), Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) (j6 & 4294967295L)), Integer.valueOf(str.length()), P(str)));
                                                                            iaVar.G(i29);
                                                                            hb3Var2 = hb3Var2;
                                                                        } else {
                                                                            gj4Var3 = gj4Var2;
                                                                            i10 = i35;
                                                                            num10 = num5;
                                                                            if (!yf2.p(mj4Var5, mj4Var6) || yf2.p(mj4Var5, kj4.f)) {
                                                                                iaVar.f(um2Var4);
                                                                                of4VarG = sf6.g(i27, arrayList4);
                                                                                of4VarG.getClass();
                                                                                objL = hb3Var3.l(mj4Var6);
                                                                                if (objL == null) {
                                                                                    objL = null;
                                                                                }
                                                                                of4VarG.g((cf4) objL);
                                                                                objL2 = hb3Var3.l(kj4.f);
                                                                                if (objL2 == null) {
                                                                                    objL2 = null;
                                                                                }
                                                                                of4VarG.y((cf4) objL2);
                                                                                if (of4VarG.A()) {
                                                                                    iaVar.m.getSnapshotObserver().g.n(of4VarG, iaVar.T, new p2(of4VarG, iaVar, (byte) 3));
                                                                                }
                                                                            } else if (yf2.p(mj4Var5, kj4.q)) {
                                                                                obj2.getClass();
                                                                                if (((Boolean) obj2).booleanValue()) {
                                                                                    i11 = 8;
                                                                                    iaVar.C(iaVar.i(iaVar.A(i29), 8));
                                                                                } else {
                                                                                    i11 = 8;
                                                                                }
                                                                                E(iaVar, iaVar.A(i29), 2048, num10, i11);
                                                                            } else {
                                                                                mj4 mj4Var8 = yi4.k;
                                                                                if (yf2.p(mj4Var5, mj4Var8)) {
                                                                                    List list3 = (List) aj4Var4.y(mj4Var8);
                                                                                    Object objL10 = hb3Var2.l(mj4Var8);
                                                                                    if (objL10 == null) {
                                                                                        objL10 = null;
                                                                                    }
                                                                                    List list4 = (List) objL10;
                                                                                    if (list4 != null) {
                                                                                        ib3 ib3Var = fe4.g;
                                                                                        ib3 ib3Var2 = new ib3();
                                                                                        if (list3.size() > 0) {
                                                                                            fj.w(list3.get(0));
                                                                                            throw null;
                                                                                        }
                                                                                        ib3 ib3Var3 = new ib3();
                                                                                        if (list4.size() > 0) {
                                                                                            fj.w(list4.get(0));
                                                                                            throw null;
                                                                                        }
                                                                                        z2 = zA || !ib3Var2.equals(ib3Var3);
                                                                                    } else {
                                                                                        z2 = zA || !list3.isEmpty();
                                                                                    }
                                                                                    zA = z2;
                                                                                } else if (zA || !(obj2 instanceof p1)) {
                                                                                    zA = true;
                                                                                } else {
                                                                                    p1 p1Var = (p1) obj2;
                                                                                    Object objL11 = hb3Var2.l(mj4Var5);
                                                                                    if (objL11 == null) {
                                                                                        objL11 = null;
                                                                                    }
                                                                                    if (sg6.g(p1Var, objL11)) {
                                                                                        zA = false;
                                                                                    } else {
                                                                                        zA = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            i27 = i27;
                                                            gj4Var3 = gj4Var2;
                                                            i10 = i35;
                                                        }
                                                        i10 = i35;
                                                        aj4Var2 = aj4Var2;
                                                    }
                                                    arrayList3 = arrayList5;
                                                    i10 = i35;
                                                    aj4Var2 = aj4Var2;
                                                } else {
                                                    Object objL12 = hb3Var2.l(mj4Var5);
                                                    if (objL12 == null) {
                                                        objL12 = null;
                                                    }
                                                    if (yf2.p(obj2, objL12)) {
                                                        arrayList3 = arrayList5;
                                                        i10 = i35;
                                                        aj4Var2 = aj4Var2;
                                                    } else {
                                                        mj4Var = kj4.n;
                                                        if (yf2.p(mj4Var5, mj4Var)) {
                                                            obj2.getClass();
                                                            str3 = (String) obj2;
                                                            zR2 = hb3Var2.r(mj4Var);
                                                            i18 = i28;
                                                            if (zR2) {
                                                                iaVar.F(i27, i18, str3);
                                                            }
                                                        } else if (yf2.p(mj4Var5, kj4.y)) {
                                                            E(iaVar, iaVar.A(i27), 2048, num9, 8);
                                                            E(iaVar, iaVar.A(i27), 2048, num10, 8);
                                                        } else {
                                                            arrayList3 = arrayList5;
                                                            if (yf2.p(mj4Var5, kj4.L)) {
                                                                E(iaVar, iaVar.A(i27), 2048, 8192, 8);
                                                                E(iaVar, iaVar.A(i27), 2048, num10, 8);
                                                            } else if (yf2.p(mj4Var5, kj4.O)) {
                                                                E(iaVar, iaVar.A(i27), 2048, 3072, 8);
                                                            } else if (yf2.p(mj4Var5, kj4.r)) {
                                                                E(iaVar, iaVar.A(i27), 2048, num9, 8);
                                                                E(iaVar, iaVar.A(i27), 2048, num10, 8);
                                                            } else {
                                                                mj4Var2 = kj4.K;
                                                                if (yf2.p(mj4Var5, mj4Var2)) {
                                                                    objL6 = hb3Var3.l(kj4.e);
                                                                    if (objL6 == null) {
                                                                        objL6 = null;
                                                                    }
                                                                    o94Var = (o94) objL6;
                                                                    if (o94Var == null) {
                                                                        um2Var2 = um2Var4;
                                                                        gj4Var2 = gj4Var3;
                                                                        E(iaVar, iaVar.A(i27), 2048, num9, 8);
                                                                        E(iaVar, iaVar.A(i27), 2048, num10, 8);
                                                                    } else {
                                                                        objL7 = hb3Var3.l(mj4Var2);
                                                                        if (objL7 == null) {
                                                                            objL7 = null;
                                                                        }
                                                                        if (yf2.p(objL7, Boolean.TRUE)) {
                                                                            accessibilityEventI = iaVar.i(iaVar.A(i27), 4);
                                                                            gj4Var2 = gj4Var3;
                                                                            um2 um2Var6 = um2Var4;
                                                                            gj4 gj4Var5 = new gj4(gj4Var2.g, true, um2Var6, aj4Var4);
                                                                            objL8 = gj4Var5.m().j.l(kj4.g);
                                                                            if (objL8 == null) {
                                                                                objL8 = null;
                                                                            }
                                                                            List list5 = (List) objL8;
                                                                            um2Var2 = um2Var6;
                                                                            if (list5 != null) {
                                                                            }
                                                                            objL9 = gj4Var5.m().j.l(kj4.C);
                                                                            if (objL9 == null) {
                                                                                objL9 = null;
                                                                            }
                                                                            list = (List) objL9;
                                                                            if (list != null) {
                                                                                strG2 = tw2.g(list, ",", null, 62);
                                                                            } else {
                                                                                strG2 = null;
                                                                            }
                                                                            if (strG != null) {
                                                                                accessibilityEventI.setContentDescription(strG);
                                                                            }
                                                                            if (strG2 != null) {
                                                                                accessibilityEventI.getText().add(strG2);
                                                                            }
                                                                            iaVar.C(accessibilityEventI);
                                                                        } else {
                                                                            um2Var2 = um2Var4;
                                                                            gj4Var2 = gj4Var3;
                                                                            E(iaVar, iaVar.A(i27), 2048, num10, 8);
                                                                        }
                                                                    }
                                                                    um2Var4 = um2Var2;
                                                                } else {
                                                                    um2Var4 = um2Var4;
                                                                    gj4Var2 = gj4Var3;
                                                                    i32 = i32;
                                                                    i33 = i33;
                                                                    if (yf2.p(mj4Var5, kj4.g)) {
                                                                        int iA2 = iaVar.A(i27);
                                                                        obj2.getClass();
                                                                        iaVar.D(iA2, 2048, 4, (List) obj2);
                                                                    } else {
                                                                        mj4Var3 = kj4.G;
                                                                        str = "";
                                                                        if (yf2.p(mj4Var5, mj4Var3)) {
                                                                            if (hb3Var3.r(yi4.m)) {
                                                                                objL4 = hb3Var2.l(mj4Var3);
                                                                                if (objL4 == null) {
                                                                                    objL4 = null;
                                                                                }
                                                                                cjVar2 = (cj) objL4;
                                                                                if (cjVar2 == null) {
                                                                                    cjVar2 = "";
                                                                                }
                                                                                objL5 = hb3Var3.l(mj4Var3);
                                                                                if (objL5 == null) {
                                                                                    objL5 = null;
                                                                                }
                                                                                charSequence = (cj) objL5;
                                                                                if (charSequence == null) {
                                                                                    charSequence = "";
                                                                                }
                                                                                charSequenceP = P(charSequence);
                                                                                length = cjVar2.length();
                                                                                length2 = charSequence.length();
                                                                                num7 = num10;
                                                                                if (length > length2) {
                                                                                    i12 = length2;
                                                                                } else {
                                                                                    i12 = length;
                                                                                }
                                                                                num9 = num9;
                                                                                i13 = 0;
                                                                                while (true) {
                                                                                    i14 = i12;
                                                                                    if (i13 < i12) {
                                                                                        i15 = length;
                                                                                        break;
                                                                                    }
                                                                                    i15 = length;
                                                                                    if (cjVar2.charAt(i13) != charSequence.charAt(i13)) {
                                                                                        break;
                                                                                        break;
                                                                                    } else {
                                                                                        i13++;
                                                                                        i12 = i14;
                                                                                        length = i15;
                                                                                    }
                                                                                }
                                                                                i16 = 0;
                                                                                while (true) {
                                                                                    if (i16 < i14 - i13) {
                                                                                        i17 = i16;
                                                                                        break;
                                                                                    }
                                                                                    i17 = i16;
                                                                                    if (cjVar2.charAt((i15 - 1) - i16) != charSequence.charAt((length2 - 1) - i17)) {
                                                                                        break;
                                                                                        break;
                                                                                    }
                                                                                    i16 = i17 + 1;
                                                                                }
                                                                                int i38 = (i15 - i17) - i13;
                                                                                int i39 = (length2 - i17) - i13;
                                                                                mj4 mj4Var9 = kj4.N;
                                                                                boolean zR5 = hb3Var2.r(mj4Var9);
                                                                                boolean zR6 = hb3Var3.r(mj4Var9);
                                                                                zR = hb3Var2.r(kj4.G);
                                                                                if (zR) {
                                                                                    z3 = false;
                                                                                } else {
                                                                                    z3 = false;
                                                                                }
                                                                                if (zR) {
                                                                                    z4 = false;
                                                                                } else {
                                                                                    z4 = false;
                                                                                }
                                                                                if (z3) {
                                                                                    i27 = i27;
                                                                                    num8 = num7;
                                                                                    accessibilityEventB = iaVar.b(iaVar.A(i27), num8, num7, Integer.valueOf(length2), charSequenceP);
                                                                                } else {
                                                                                    i27 = i27;
                                                                                    num8 = num7;
                                                                                    accessibilityEventB = iaVar.b(iaVar.A(i27), num8, num7, Integer.valueOf(length2), charSequenceP);
                                                                                }
                                                                                accessibilityEventB.setClassName("android.widget.EditText");
                                                                                if (Build.VERSION.SDK_INT >= 37) {
                                                                                    da.y(gj4Var2, accessibilityEventB);
                                                                                }
                                                                                iaVar.C(accessibilityEventB);
                                                                                if (z3) {
                                                                                    num6 = num8;
                                                                                    long j7 = ((u75) aj4Var4.y(kj4.H)).g;
                                                                                    accessibilityEventB.setFromIndex((int) (j7 >> 32));
                                                                                    accessibilityEventB.setToIndex((int) (j7 & 4294967295L));
                                                                                    iaVar.C(accessibilityEventB);
                                                                                } else {
                                                                                    num6 = num8;
                                                                                    long j8 = ((u75) aj4Var4.y(kj4.H)).g;
                                                                                    accessibilityEventB.setFromIndex((int) (j8 >> 32));
                                                                                    accessibilityEventB.setToIndex((int) (j8 & 4294967295L));
                                                                                    iaVar.C(accessibilityEventB);
                                                                                }
                                                                            } else {
                                                                                num6 = num10;
                                                                                hb3Var2 = hb3Var2;
                                                                                num9 = num9;
                                                                                aj4Var2 = aj4Var2;
                                                                                i27 = i27;
                                                                                E(iaVar, iaVar.A(i27), 2048, Integer.valueOf(i22), 8);
                                                                            }
                                                                            gj4Var3 = gj4Var2;
                                                                            hb3Var2 = hb3Var2;
                                                                            i10 = i35;
                                                                            num10 = num6;
                                                                        } else {
                                                                            num5 = num10;
                                                                            hb3Var2 = hb3Var2;
                                                                            num9 = num9;
                                                                            aj4Var2 = aj4Var2;
                                                                            i27 = i27;
                                                                            mj4Var4 = kj4.H;
                                                                            if (yf2.p(mj4Var5, mj4Var4)) {
                                                                                objL3 = hb3Var3.l(mj4Var3);
                                                                                if (objL3 == null) {
                                                                                    objL3 = null;
                                                                                }
                                                                                cjVar = (cj) objL3;
                                                                                if (cjVar != null) {
                                                                                    str = str2;
                                                                                }
                                                                                long j9 = ((u75) aj4Var4.y(mj4Var4)).g;
                                                                                gj4Var3 = gj4Var2;
                                                                                i10 = i35;
                                                                                num10 = num5;
                                                                                iaVar = this;
                                                                                iaVar.C(iaVar.b(iaVar.A(i27), Integer.valueOf((int) (j9 >> 32)), Integer.valueOf((int) (j9 & 4294967295L)), Integer.valueOf(str.length()), P(str)));
                                                                                iaVar.G(i29);
                                                                                hb3Var2 = hb3Var2;
                                                                            } else {
                                                                                gj4Var3 = gj4Var2;
                                                                                i10 = i35;
                                                                                num10 = num5;
                                                                                if (yf2.p(mj4Var5, mj4Var6)) {
                                                                                    iaVar.f(um2Var4);
                                                                                    of4VarG = sf6.g(i27, arrayList4);
                                                                                    of4VarG.getClass();
                                                                                    objL = hb3Var3.l(mj4Var6);
                                                                                    if (objL == null) {
                                                                                        objL = null;
                                                                                    }
                                                                                    of4VarG.g((cf4) objL);
                                                                                    objL2 = hb3Var3.l(kj4.f);
                                                                                    if (objL2 == null) {
                                                                                        objL2 = null;
                                                                                    }
                                                                                    of4VarG.y((cf4) objL2);
                                                                                    if (of4VarG.A()) {
                                                                                        iaVar.m.getSnapshotObserver().g.n(of4VarG, iaVar.T, new p2(of4VarG, iaVar, (byte) 3));
                                                                                    }
                                                                                } else {
                                                                                    iaVar.f(um2Var4);
                                                                                    of4VarG = sf6.g(i27, arrayList4);
                                                                                    of4VarG.getClass();
                                                                                    objL = hb3Var3.l(mj4Var6);
                                                                                    if (objL == null) {
                                                                                        objL = null;
                                                                                    }
                                                                                    of4VarG.g((cf4) objL);
                                                                                    objL2 = hb3Var3.l(kj4.f);
                                                                                    if (objL2 == null) {
                                                                                        objL2 = null;
                                                                                    }
                                                                                    of4VarG.y((cf4) objL2);
                                                                                    if (of4VarG.A()) {
                                                                                        iaVar.m.getSnapshotObserver().g.n(of4VarG, iaVar.T, new p2(of4VarG, iaVar, (byte) 3));
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                i27 = i27;
                                                                gj4Var3 = gj4Var2;
                                                                i10 = i35;
                                                            }
                                                            i10 = i35;
                                                            aj4Var2 = aj4Var2;
                                                        }
                                                        arrayList3 = arrayList5;
                                                        i10 = i35;
                                                        aj4Var2 = aj4Var2;
                                                    }
                                                }
                                                int i40 = i33 + 1;
                                                hb3Var2 = hb3Var2;
                                                i27 = i27;
                                                um2Var4 = um2Var4;
                                                num10 = num10;
                                                j4 = j >> 8;
                                                i32 = i32;
                                                gj4Var3 = gj4Var3;
                                                num9 = num9;
                                                i28 = 8;
                                                aj4Var3 = aj4Var2;
                                                i33 = i40;
                                                length4 = i10;
                                                arrayList5 = arrayList3;
                                            } else {
                                                num9 = num9;
                                                arrayList3 = arrayList5;
                                                j = j4;
                                                i10 = length4;
                                                aj4Var2 = aj4Var3;
                                            }
                                            hb3Var2 = hb3Var2;
                                            int i41 = i33 + 1;
                                            hb3Var2 = hb3Var2;
                                            i27 = i27;
                                            um2Var4 = um2Var4;
                                            num10 = num10;
                                            j4 = j >> 8;
                                            i32 = i32;
                                            gj4Var3 = gj4Var3;
                                            num9 = num9;
                                            i28 = 8;
                                            aj4Var3 = aj4Var2;
                                            i33 = i41;
                                            length4 = i10;
                                            arrayList5 = arrayList3;
                                        }
                                        aj4Var = aj4Var3;
                                        num3 = num9;
                                        arrayList2 = arrayList5;
                                        int i42 = i32;
                                        um2Var = um2Var4;
                                        gj4Var = gj4Var3;
                                        i9 = length4;
                                        num4 = num10;
                                        i8 = i27;
                                        hb3Var = hb3Var2;
                                        i6 = 0;
                                        if (i42 != i28) {
                                            break;
                                        }
                                    } else {
                                        num4 = num10;
                                        aj4Var = aj4Var3;
                                        hb3Var = hb3Var2;
                                        num3 = num9;
                                        arrayList2 = arrayList5;
                                        um2Var = um2Var4;
                                        gj4Var = gj4Var3;
                                        i6 = 0;
                                        i9 = length4;
                                        i8 = i27;
                                    }
                                    if (i31 == i9) {
                                        break;
                                    }
                                    hb3Var2 = hb3Var;
                                    i27 = i8;
                                    um2Var4 = um2Var;
                                    num10 = num4;
                                    aj4Var3 = aj4Var;
                                    gj4VarY = gj4Var;
                                    num9 = num3;
                                    i28 = 8;
                                    i30 = i31 + 1;
                                    length4 = i9;
                                    arrayList5 = arrayList2;
                                }
                            } else {
                                aj4Var = aj4Var3;
                                num3 = num9;
                                arrayList2 = arrayList5;
                                i5 = i25;
                                gj4Var = gj4VarY;
                                i6 = 0;
                                num4 = num10;
                                i8 = i27;
                                zA = false;
                            }
                            if (!zA) {
                                zA = sg6.a(gj4Var, aj4Var);
                            }
                            if (zA) {
                                i4 = 8;
                                E(iaVar, iaVar.A(i8), 2048, num4, 8);
                            } else {
                                i4 = 8;
                            }
                        }
                    } else {
                        i3 = i26;
                        num3 = num9;
                        arrayList2 = arrayList5;
                        iArr2 = iArr3;
                        jArr2 = jArr3;
                        i4 = i24;
                        i5 = i25;
                        i6 = i20;
                        i7 = i21;
                        num4 = num10;
                    }
                    j3 >>= i4;
                    i26 = i3 + 1;
                    he2Var2 = he2Var;
                    i24 = i4;
                    num10 = num4;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i21 = i7;
                    i25 = i5;
                    arrayList5 = arrayList2;
                    num9 = num3;
                    i20 = i6;
                }
                num = num9;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                i = i20;
                int i43 = i21;
                num2 = num10;
                if (i25 != i24) {
                    return;
                } else {
                    i2 = i43;
                }
            } else {
                num = num9;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                i = i20;
                num2 = num10;
                i2 = i21;
            }
            if (i2 == i23) {
                return;
            }
            i21 = i2 + 1;
            he2Var2 = he2Var;
            length3 = i23;
            num10 = num2;
            i19 = i22;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList5 = arrayList;
            num9 = num;
            i20 = i;
        }
    }

    public final void I(um2 um2Var, ia3 ia3Var) {
        aj4 aj4VarK;
        if (um2Var.J() && !this.m.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(um2Var)) {
            um2 um2Var2 = null;
            if (!um2Var.M.r(8)) {
                um2Var = um2Var.o();
                while (true) {
                    if (um2Var == null) {
                        um2Var = null;
                        break;
                    } else if (um2Var.M.r(8)) {
                        break;
                    } else {
                        um2Var = um2Var.o();
                    }
                }
            }
            if (um2Var == null || (aj4VarK = um2Var.k()) == null) {
                return;
            }
            if (!aj4VarK.a) {
                for (um2 um2VarO = um2Var.o(); um2VarO != null; um2VarO = um2VarO.o()) {
                    aj4 aj4VarK2 = um2VarO.k();
                    if (aj4VarK2 != null && aj4VarK2.a) {
                        um2Var2 = um2VarO;
                        break;
                    }
                }
                if (um2Var2 != null) {
                    um2Var = um2Var2;
                }
            }
            int i = um2Var.t;
            if (ia3Var.g(i)) {
                E(this, A(i), 2048, 1, 8);
            }
        }
    }

    public final void J(um2 um2Var) {
        if (um2Var.J() && !this.m.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(um2Var)) {
            int i = um2Var.t;
            cf4 cf4Var = (cf4) this.f.y(i);
            cf4 cf4Var2 = (cf4) this.k.y(i);
            if (cf4Var == null && cf4Var2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventI = i(i, 4096);
            if (cf4Var != null) {
                accessibilityEventI.setScrollX((int) ((Number) cf4Var.g.g()).floatValue());
                accessibilityEventI.setMaxScrollX((int) ((Number) cf4Var.y.g()).floatValue());
            }
            if (cf4Var2 != null) {
                accessibilityEventI.setScrollY((int) ((Number) cf4Var2.g.g()).floatValue());
                accessibilityEventI.setMaxScrollY((int) ((Number) cf4Var2.y.g()).floatValue());
            }
            C(accessibilityEventI);
        }
    }

    public final boolean K(gj4 gj4Var, int i, int i2, boolean z) {
        String strZ;
        aj4 aj4Var = gj4Var.n;
        int i3 = gj4Var.x;
        mj4 mj4Var = yi4.a;
        if (aj4Var.j.r(mj4Var) && sg6.y(gj4Var)) {
            cz1 cz1Var = (cz1) ((p1) aj4Var.y(mj4Var)).y;
            if (cz1Var != null) {
                return ((Boolean) cz1Var.x(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.A) && (strZ = z(gj4Var)) != null) {
            if (i < 0 || i != i2 || i2 > strZ.length()) {
                i = -1;
            }
            this.A = i;
            boolean z2 = strZ.length() > 0;
            C(b(A(i3), z2 ? Integer.valueOf(this.A) : null, z2 ? Integer.valueOf(this.A) : null, z2 ? Integer.valueOf(strZ.length()) : null, strZ));
            G(i3);
            return true;
        }
        return false;
    }

    public final Rect M(float f, float f2, float f3, float f4) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f);
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f2)) & 4294967295L;
        ba baVar = this.m;
        long jK = baVar.k(jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
        long jK2 = baVar.k((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (jK >> 32);
        int i2 = (int) (jK2 >> 32);
        int i3 = (int) (jK & 4294967295L);
        int i4 = (int) (jK2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    /* JADX WARN: Code duplicated, block: B:20:0x0071  */
    /* JADX WARN: Code duplicated, block: B:23:0x007e  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void Q() {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        int iNumberOfTrailingZeros;
        char c2;
        hj4 hj4Var;
        ia3 ia3Var = new ia3();
        ia3 ia3Var2 = this.H;
        int[] iArr = ia3Var2.y;
        long[] jArr3 = ia3Var2.g;
        int length = jArr3.length - 2;
        ha3 ha3Var = this.N;
        int i2 = 8;
        if (length >= 0) {
            int i3 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j5 = jArr3[i3];
                char c3 = 7;
                j3 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j5 & 255) < 128) {
                            int i6 = iArr[(i3 << 3) + i5];
                            c2 = c3;
                            ij4 ij4Var = (ij4) u().y(i6);
                            Object obj = null;
                            gj4 gj4VarY = ij4Var != null ? ij4Var.y() : null;
                            if (gj4VarY != null) {
                                if (!gj4VarY.n.j.r(kj4.n)) {
                                    ia3Var.g(i6);
                                    hj4Var = (hj4) ha3Var.y(i6);
                                    if (hj4Var != null) {
                                        Object objL = hj4Var.g.j.l(kj4.n);
                                        obj = (String) (objL != null ? objL : null);
                                    }
                                    F(i6, 32, obj);
                                }
                            } else {
                                ia3Var.g(i6);
                                hj4Var = (hj4) ha3Var.y(i6);
                                if (hj4Var != null) {
                                    Object objL2 = hj4Var.g.j.l(kj4.n);
                                    obj = (String) (objL2 != null ? objL2 : null);
                                }
                                F(i6, 32, obj);
                            }
                        } else {
                            c2 = c3;
                        }
                        j5 >>= 8;
                        i5++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i4 != 8) {
                        break;
                    }
                } else {
                    c = 7;
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
        }
        int[] iArr2 = ia3Var.y;
        long[] jArr4 = ia3Var.g;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i7 = 0;
            while (true) {
                long j6 = jArr4[i7];
                if ((((~j6) << c) & j6 & j3) != j3) {
                    int i8 = 8 - ((~(i7 - length2)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j6 & j2) < j) {
                            int i10 = iArr2[(i7 << 3) + i9];
                            int iHashCode = Integer.hashCode(i10) * (-862048943);
                            int i11 = iHashCode ^ (iHashCode << 16);
                            int i12 = i11 & 127;
                            int i13 = ia3Var2.r;
                            int i14 = (i11 >>> 7) & i13;
                            i = i2;
                            int i15 = 0;
                            while (true) {
                                long[] jArr5 = ia3Var2.g;
                                int i16 = i14 >> 3;
                                jArr2 = jArr4;
                                int i17 = (i14 & 7) << 3;
                                j4 = j6;
                                long j7 = (jArr5[i16] >>> i17) | ((jArr5[i16 + 1] << (64 - i17)) & ((-i17) >> 63));
                                int i18 = i13;
                                long j8 = (((long) i12) * 72340172838076673L) ^ j7;
                                long j9 = (j8 - 72340172838076673L) & (~j8) & j3;
                                while (j9 != 0) {
                                    iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j9) >> 3)) & i18;
                                    int i19 = i18;
                                    if (ia3Var2.y[iNumberOfTrailingZeros] == i10) {
                                        break;
                                    }
                                    j9 &= j9 - 1;
                                    i18 = i19;
                                }
                                int i20 = i18;
                                if ((j7 & ((~j7) << 6) & j3) != 0) {
                                    iNumberOfTrailingZeros = -1;
                                    break;
                                }
                                i15 += 8;
                                i14 = (i14 + i15) & i20;
                                jArr4 = jArr2;
                                i13 = i20;
                                j6 = j4;
                            }
                            int i21 = iNumberOfTrailingZeros;
                            if (i21 >= 0) {
                                ia3Var2.j(i21);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j6;
                            i = i2;
                        }
                        j6 = j4 >> i;
                        i9++;
                        i2 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i8 != i2) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i7 == length2) {
                    break;
                }
                i7++;
                jArr4 = jArr;
                i2 = 8;
            }
        }
        ha3Var.r();
        he2 he2VarU = u();
        int[] iArr3 = he2VarU.y;
        Object[] objArr = he2VarU.r;
        long[] jArr6 = he2VarU.g;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i22 = 0;
            while (true) {
                long j10 = jArr6[i22];
                if ((((~j10) << c) & j10 & j3) != j3) {
                    int i23 = 8 - ((~(i22 - length3)) >>> 31);
                    for (int i24 = 0; i24 < i23; i24++) {
                        if ((j10 & j2) < j) {
                            int i25 = (i22 << 3) + i24;
                            int i26 = iArr3[i25];
                            ij4 ij4Var2 = (ij4) objArr[i25];
                            aj4 aj4Var = ij4Var2.y().n;
                            mj4 mj4Var = kj4.n;
                            if (aj4Var.j.r(mj4Var) && ia3Var2.g(i26)) {
                                F(i26, 16, (String) ij4Var2.y().n.y(mj4Var));
                            }
                            ha3Var.t(i26, new hj4(ij4Var2.y(), u()));
                        }
                        j10 >>= 8;
                    }
                    if (i23 != 8) {
                        break;
                    }
                }
                if (i22 == length3) {
                    break;
                } else {
                    i22++;
                }
            }
        }
        this.O = new hj4(this.m.getSemanticsOwner().g(), u());
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bf  */
    public final void a(int i, m2 m2Var, String str, Bundle bundle) {
        gj4 gj4VarY;
        RectF[] rectFArr;
        int i2;
        ij4 ij4Var = (ij4) u().y(i);
        if (ij4Var == null || (gj4VarY = ij4Var.y()) == null) {
            return;
        }
        um2 um2Var = gj4VarY.r;
        aj4 aj4Var = gj4VarY.n;
        hb3 hb3Var = aj4Var.j;
        String strZ = z(gj4VarY);
        if (yf2.p(str, this.K)) {
            int iN = this.I.n(i);
            if (iN != -1) {
                m2Var.m().putInt(str, iN);
                return;
            }
            return;
        }
        if (yf2.p(str, this.L)) {
            int iN2 = this.J.n(i);
            if (iN2 != -1) {
                m2Var.m().putInt(str, iN2);
                return;
            }
            return;
        }
        boolean zR = hb3Var.r(yi4.g);
        ba baVar = this.m;
        int i3 = 0;
        if (zR && bundle != null && yf2.p(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i5 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i5 > 0 && i4 >= 0) {
                if (i4 < (strZ != null ? strZ.length() : Integer.MAX_VALUE)) {
                    j75 j75VarR = sf6.r(aj4Var);
                    if (j75VarR == null) {
                        rectFArr = null;
                    } else {
                        sc2 sc2Var = um2Var.M.r;
                        if (!sc2Var.j0.h) {
                            sc2Var = null;
                        }
                        if (sc2Var != null) {
                            long jN = sc2Var.N(0L);
                            k44 k44VarL = gj4VarY.l();
                            RectF[] rectFArr2 = new RectF[i5];
                            while (i3 < i5) {
                                int i6 = i4 + i3;
                                if (i6 >= j75VarR.g.g.t.length()) {
                                    i2 = i3;
                                } else {
                                    k44 k44VarT = j75VarR.y(i6).t(jN);
                                    k44 k44VarV = k44VarT.l(k44VarL) ? k44VarT.v(k44VarL) : null;
                                    if (k44VarV != null) {
                                        i2 = i3;
                                        long jK = baVar.k((((long) Float.floatToRawIntBits(k44VarV.g)) << 32) | (((long) Float.floatToRawIntBits(k44VarV.y)) & 4294967295L));
                                        long jK2 = baVar.k((((long) Float.floatToRawIntBits(k44VarV.n)) & 4294967295L) | (((long) Float.floatToRawIntBits(k44VarV.r)) << 32));
                                        int i7 = (int) (jK >> 32);
                                        int i8 = (int) (jK2 >> 32);
                                        int i9 = (int) (jK & 4294967295L);
                                        int i10 = (int) (jK2 & 4294967295L);
                                        rectFArr2[i2] = new RectF(Math.min(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8)), Math.min(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)), Math.max(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8)), Math.max(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)));
                                    } else {
                                        i2 = i3;
                                    }
                                }
                                i3 = i2 + 1;
                                j75VarR = j75VarR;
                                k44VarL = k44VarL;
                                i4 = i4;
                                i5 = i5;
                            }
                            rectFArr = rectFArr2;
                        } else {
                            rectFArr = null;
                        }
                    }
                    if (rectFArr == null) {
                        return;
                    }
                    m2Var.m().putParcelableArray(str, rectFArr);
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        mj4 mj4Var = kj4.A;
        if (hb3Var.r(mj4Var) && bundle != null && yf2.p(str, "androidx.compose.ui.semantics.testTag")) {
            Object objL = hb3Var.l(mj4Var);
            String str2 = (String) (objL == null ? null : objL);
            if (str2 != null) {
                m2Var.m().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (yf2.p(str, "androidx.compose.ui.semantics.id")) {
            m2Var.m().putInt(str, gj4VarY.x);
            return;
        }
        if (yf2.p(str, "androidx.compose.ui.semantics.shapeType")) {
            Object objL2 = hb3Var.l(kj4.S);
            cn4 cn4Var = (cn4) (objL2 == null ? null : objL2);
            if (cn4Var != null) {
                Rect rect = new Rect();
                m2Var.t(rect);
                k44 k44VarH = h(gj4VarY, rect, cn4Var);
                float f = k44VarH.y;
                float f2 = k44VarH.g;
                br2 br2VarG = cn4Var.g(k44VarH.r(), um2Var.G, baVar.getDensity());
                if (br2VarG instanceof ym3) {
                    m2Var.m().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    m2Var.m().putParcelable("androidx.compose.ui.semantics.shapeRect", L(br2VarG, f2, f));
                    return;
                } else if (br2VarG instanceof zm3) {
                    m2Var.m().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    m2Var.m().putParcelable("androidx.compose.ui.semantics.shapeRect", L(br2VarG, f2, f));
                    m2Var.m().putFloatArray("androidx.compose.ui.semantics.shapeCorners", N(br2VarG));
                    return;
                } else if (!(br2VarG instanceof xm3)) {
                    uo1.g();
                    return;
                } else {
                    m2Var.m().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    m2Var.m().putParcelable("androidx.compose.ui.semantics.shapeRegion", O(br2VarG, f2, f));
                    return;
                }
            }
            return;
        }
        if (yf2.p(str, "androidx.compose.ui.semantics.shapeRect")) {
            Object objL3 = hb3Var.l(kj4.S);
            cn4 cn4Var2 = (cn4) (objL3 == null ? null : objL3);
            if (cn4Var2 != null) {
                Rect rect2 = new Rect();
                m2Var.t(rect2);
                k44 k44VarH2 = h(gj4VarY, rect2, cn4Var2);
                Rect rectL = L(cn4Var2.g(k44VarH2.r(), um2Var.G, baVar.getDensity()), k44VarH2.g, k44VarH2.y);
                if (rectL != null) {
                    m2Var.m().putParcelable("androidx.compose.ui.semantics.shapeRect", rectL);
                    return;
                }
                return;
            }
            return;
        }
        if (yf2.p(str, "androidx.compose.ui.semantics.shapeCorners")) {
            Object objL4 = hb3Var.l(kj4.S);
            cn4 cn4Var3 = (cn4) (objL4 == null ? null : objL4);
            if (cn4Var3 != null) {
                Rect rect3 = new Rect();
                m2Var.t(rect3);
                float[] fArrN = N(cn4Var3.g(h(gj4VarY, rect3, cn4Var3).r(), um2Var.G, baVar.getDensity()));
                if (fArrN != null) {
                    m2Var.m().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrN);
                    return;
                }
                return;
            }
            return;
        }
        if (yf2.p(str, "androidx.compose.ui.semantics.shapeRegion")) {
            Object objL5 = hb3Var.l(kj4.S);
            cn4 cn4Var4 = (cn4) (objL5 == null ? null : objL5);
            if (cn4Var4 != null) {
                Rect rect4 = new Rect();
                m2Var.t(rect4);
                k44 k44VarH3 = h(gj4VarY, rect4, cn4Var4);
                Region regionO = O(cn4Var4.g(k44VarH3.r(), um2Var.G, baVar.getDensity()), k44VarH3.g, k44VarH3.y);
                if (regionO != null) {
                    m2Var.m().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionO);
                }
            }
        }
    }

    public final AccessibilityEvent b(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventI = i(i, 8192);
        if (num != null) {
            accessibilityEventI.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventI.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventI.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventI.getText().add(charSequence);
        }
        return accessibilityEventI;
    }

    public final void c() {
        Trace.beginSection("Compose:semantics:sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (o()) {
                B(this.m.getSemanticsOwner().g(), this.O);
            }
            Trace.endSection();
            Trace.beginSection("Compose:semantics:sendSemanticsPropertyChangeEvents");
            try {
                H(u());
                Trace.endSection();
                Trace.beginSection("Compose:semantics:updateSemanticsNodesCopyAndPanes");
                try {
                    Q();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final void f(um2 um2Var) {
        if (this.C.add(um2Var)) {
            this.D.z(og5.g);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0075 A[LOOP:0: B:4:0x0014->B:36:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x0078 A[EDGE_INSN: B:47:0x0078->B:37:0x0078 BREAK  A[LOOP:0: B:4:0x0014->B:36:0x0075], SYNTHETIC] */
    public final k44 h(gj4 gj4Var, Rect rect, cn4 cn4Var) {
        ha haVar = new ha(cn4Var);
        um2 um2Var = gj4Var.r;
        i73 i73Var = um2Var.M.x;
        o41 o41Var = null;
        if ((i73Var.m & 8) != 0) {
            loop0: while (i73Var != null) {
                if ((i73Var.a & 8) == 0) {
                    if ((i73Var.m & 8) != 0) {
                        break;
                        break;
                    }
                    i73Var = i73Var.w;
                } else {
                    i73 i73VarQ = i73Var;
                    rb3 rb3Var = null;
                    while (i73VarQ != null) {
                        if (i73VarQ instanceof ej4) {
                            ((ej4) i73VarQ).l0(haVar);
                            if (haVar.y()) {
                                o41Var = i73VarQ;
                                break loop0;
                            }
                        } else if ((i73VarQ.a & 8) != 0 && (i73VarQ instanceof p41)) {
                            int i = 0;
                            for (i73 i73Var2 = ((p41) i73VarQ).f; i73Var2 != null; i73Var2 = i73Var2.w) {
                                if ((i73Var2.a & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        i73VarQ = i73Var2;
                                    } else {
                                        if (rb3Var == null) {
                                            rb3Var = new rb3(new i73[16]);
                                        }
                                        if (i73VarQ != null) {
                                            rb3Var.y(i73VarQ);
                                            i73VarQ = null;
                                        }
                                        rb3Var.y(i73Var2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        i73VarQ = k33.Q(rb3Var);
                    }
                    if ((i73Var.m & 8) != 0) {
                        break;
                    }
                    i73Var = i73Var.w;
                }
            }
        }
        o41 o41Var2 = (ej4) o41Var;
        if (o41Var2 == null || !((i73) o41Var2).j.h) {
            return m50.E(um2Var.M.n, false);
        }
        gh3 gh3VarU = k33.U(o41Var2);
        k44 k44VarH = m50.K(gh3VarU).H(gh3VarU, false);
        Rect rectM = M(k44VarH.g, k44VarH.y, k44VarH.r, k44VarH.n);
        float f = rectM.left - rect.left;
        float f2 = rectM.top - rect.top;
        return new k44(f, f2, rectM.width() + f, rectM.height() + f2);
    }

    public final AccessibilityEvent i(int i, int i2) {
        ij4 ij4Var;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        ba baVar = this.m;
        accessibilityEventObtain.setPackageName(baVar.getContext().getPackageName());
        accessibilityEventObtain.setSource(baVar, i);
        if (o() && (ij4Var = (ij4) u().y(i)) != null) {
            accessibilityEventObtain.setPassword(ij4Var.y().n.j.r(kj4.N));
            Object objL = ij4Var.y().n.j.l(kj4.i);
            if (objL == null) {
                objL = null;
            }
            tf6.y(accessibilityEventObtain, yf2.p(objL, Boolean.TRUE));
        }
        return accessibilityEventObtain;
    }

    public final Rect m(ij4 ij4Var) {
        ne2 ne2VarG = ij4Var.g();
        return M(ne2VarG.g, ne2VarG.y, ne2VarG.r, ne2VarG.n);
    }

    public final boolean o() {
        AccessibilityManager accessibilityManager = this.c;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.b;
        if (enabledAccessibilityServiceList == null) {
            enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.b = enabledAccessibilityServiceList;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.b = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.b = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.c;
        if (accessibilityManager.isEnabled()) {
            this.b = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.m.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.R);
        AccessibilityManager accessibilityManager = this.c;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final int p(gj4 gj4Var) {
        aj4 aj4Var = gj4Var.n;
        if (!aj4Var.j.r(kj4.g)) {
            mj4 mj4Var = kj4.H;
            if (aj4Var.j.r(mj4Var)) {
                return (int) (((u75) aj4Var.y(mj4Var)).g >> 32);
            }
        }
        return this.A;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:30:0x0070 A[Catch: all -> 0x0032, TryCatch #1 {all -> 0x0032, blocks: (B:13:0x002c, B:24:0x0056, B:28:0x0068, B:30:0x0070, B:32:0x0079, B:39:0x0097, B:42:0x00a6, B:43:0x00ae, B:44:0x00b1, B:45:0x00b2, B:20:0x0040, B:23:0x0047, B:33:0x007e, B:35:0x0083, B:38:0x0094), top: B:54:0x0022, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0079 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #1 {all -> 0x0032, blocks: (B:13:0x002c, B:24:0x0056, B:28:0x0068, B:30:0x0070, B:32:0x0079, B:39:0x0097, B:42:0x00a6, B:43:0x00ae, B:44:0x00b1, B:45:0x00b2, B:20:0x0040, B:23:0x0047, B:33:0x007e, B:35:0x0083, B:38:0x0094), top: B:54:0x0022, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0083 A[Catch: all -> 0x0092, LOOP:0: B:34:0x0081->B:35:0x0083, LOOP_END, TryCatch #0 {all -> 0x0092, blocks: (B:33:0x007e, B:35:0x0083, B:38:0x0094), top: B:52:0x007e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cb, code lost:
    
        if (defpackage.yf2.e(r7, r0) == r5) goto L47;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00cb -> B:14:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(defpackage.ou0 r11) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ia.q(ou0):java.lang.Object");
    }

    public final int s(gj4 gj4Var) {
        aj4 aj4Var = gj4Var.n;
        if (!aj4Var.j.r(kj4.g)) {
            mj4 mj4Var = kj4.H;
            if (aj4Var.j.r(mj4Var)) {
                return (int) (((u75) aj4Var.y(mj4Var)).g & 4294967295L);
            }
        }
        return this.A;
    }

    public final he2 u() {
        if (this.E) {
            this.E = false;
            ba baVar = this.m;
            this.G = fe6.r(baVar.getSemanticsOwner(), new m9((byte) 1));
            if (o()) {
                sg6.m(this.G, this.I, this.J, baVar.getContext().getResources());
            }
        }
        return this.G;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00fd  */
    public final boolean w(int i, long j, boolean z) {
        mj4 mj4Var;
        int i2;
        if (yf2.p(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            he2 he2VarU = u();
            if (!wi3.y(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                if (z) {
                    mj4Var = kj4.f;
                } else {
                    if (z) {
                        uo1.g();
                        return false;
                    }
                    mj4Var = kj4.o;
                }
                Object[] objArr = he2VarU.r;
                long[] jArr = he2VarU.g;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    boolean z2 = false;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((255 & j2) < 128) {
                                    ij4 ij4Var = (ij4) objArr[(i3 << 3) + i6];
                                    ne2 ne2VarG = ij4Var.g();
                                    float f = ne2VarG.g;
                                    i2 = i4;
                                    float f2 = ne2VarG.y;
                                    float f3 = ne2VarG.r;
                                    float f4 = ne2VarG.n;
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                    if ((fIntBitsToFloat2 < f4) & (fIntBitsToFloat >= f) & (fIntBitsToFloat < f3) & (fIntBitsToFloat2 >= f2)) {
                                        Object objL = ij4Var.y().n.j.l(mj4Var);
                                        if (objL == null) {
                                            objL = null;
                                        }
                                        cf4 cf4Var = (cf4) objL;
                                        if (cf4Var != null) {
                                            my1 my1Var = cf4Var.g;
                                            if (i < 0) {
                                                if (((Number) my1Var.g()).floatValue() > 0.0f) {
                                                    z2 = true;
                                                }
                                            } else if (((Number) my1Var.g()).floatValue() < ((Number) cf4Var.y.g()).floatValue()) {
                                                z2 = true;
                                            }
                                        }
                                    }
                                } else {
                                    i2 = i4;
                                }
                                j2 >>= i2;
                                i6++;
                                i4 = i2;
                            }
                            if (i5 != i4) {
                                return z2;
                            }
                        }
                        if (i3 == length) {
                            return z2;
                        }
                        i3++;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.s1
    public final y22 y(View view) {
        return this.s;
    }
}
