package defpackage;

import android.content.ClipDescription;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import io.appground.blek.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ea extends y22 {
    public final /* synthetic */ ia w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea(ia iaVar) {
        super((byte) 3);
        this.w = iaVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:153:0x0258  */
    /* JADX WARN: Code duplicated, block: B:265:0x0433  */
    /* JADX WARN: Code duplicated, block: B:266:0x0435  */
    /* JADX WARN: Code duplicated, block: B:269:0x043a  */
    /* JADX WARN: Code duplicated, block: B:270:0x043c  */
    /* JADX WARN: Code duplicated, block: B:273:0x0442  */
    /* JADX WARN: Code duplicated, block: B:274:0x0444  */
    /* JADX WARN: Code duplicated, block: B:277:0x044a  */
    /* JADX WARN: Code duplicated, block: B:278:0x044c  */
    /* JADX WARN: Code duplicated, block: B:281:0x0452  */
    /* JADX WARN: Code duplicated, block: B:282:0x0454  */
    /* JADX WARN: Code duplicated, block: B:285:0x045a  */
    /* JADX WARN: Code duplicated, block: B:286:0x045c  */
    /* JADX WARN: Code duplicated, block: B:293:0x0468  */
    /* JADX WARN: Code duplicated, block: B:300:0x0475  */
    /* JADX WARN: Code duplicated, block: B:303:0x047b  */
    /* JADX WARN: Code duplicated, block: B:305:0x0483  */
    /* JADX WARN: Code duplicated, block: B:308:0x048f  */
    /* JADX WARN: Code duplicated, block: B:311:0x0495  */
    /* JADX WARN: Code duplicated, block: B:313:0x0499  */
    /* JADX WARN: Code duplicated, block: B:315:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:316:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:320:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:323:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:326:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:328:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:330:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:334:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:336:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:339:0x04fb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:379:0x0577  */
    /* JADX WARN: Code duplicated, block: B:381:0x057f  */
    /* JADX WARN: Code duplicated, block: B:384:0x0585 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:386:0x0589  */
    /* JADX WARN: Code duplicated, block: B:387:0x058e  */
    /* JADX WARN: Code duplicated, block: B:389:0x0596 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:390:0x0598  */
    /* JADX WARN: Code duplicated, block: B:393:0x059f  */
    /* JADX WARN: Code duplicated, block: B:395:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:402:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:404:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:406:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:407:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:409:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:411:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:412:0x05df  */
    /* JADX WARN: Code duplicated, block: B:415:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:512:0x0724  */
    /* JADX WARN: Code duplicated, block: B:514:0x072e  */
    /* JADX WARN: Code duplicated, block: B:521:0x0740  */
    /* JADX WARN: Code duplicated, block: B:522:0x0748  */
    /* JADX WARN: Code duplicated, block: B:90:0x0134  */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x01ac, code lost:
    
        r1 = null;
     */
    @Override // defpackage.y22
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(int r23, int r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instruction units count: 2174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ea.k(int, int, android.os.Bundle):boolean");
    }

    @Override // defpackage.y22
    public final void n(int i, m2 m2Var, String str, Bundle bundle) {
        this.w.a(i, m2Var, str, bundle);
    }

    @Override // defpackage.y22
    public final m2 p(int i) {
        ia iaVar = this.w;
        if (i != 1) {
            if (i == 2) {
                return w(iaVar.p);
            }
            l0.u(xi3.j("Unknown focus type: ", i));
            return null;
        }
        int i2 = iaVar.u;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return w(i2);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0061  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v213 */
    /* JADX WARN: Type inference failed for: r2v64 */
    /* JADX WARN: Type inference failed for: r2v65, types: [boolean, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.y22
    public final m2 w(int i) {
        SpannableString spannableString;
        int i2;
        boolean z;
        gj4 gj4VarQ;
        ?? r2;
        Bundle bundle;
        m2 m2VarS;
        dg dgVarN;
        boolean zBooleanValue;
        boolean zP;
        gj4 gj4VarY;
        ia iaVar = this.w;
        AccessibilityManager accessibilityManager = iaVar.c;
        ba baVar = iaVar.m;
        if (baVar.getComposeViewContext().n().a().t != wt2.j) {
            ij4 ij4Var = (ij4) iaVar.u().y(i);
            if (ij4Var != null) {
                gj4 gj4VarY2 = ij4Var.y();
                Object objL = gj4VarY2.m().j.l(kj4.i);
                if (objL == null) {
                    objL = null;
                }
                boolean zP2 = yf2.p(objL, Boolean.TRUE);
                if (!zP2 || ag6.y(accessibilityManager)) {
                    m2 m2VarS2 = m2.s();
                    m2VarS2.p(zP2);
                    if (i == -1) {
                        Object parentForAccessibility = baVar.getParentForAccessibility();
                        m2VarS2.U(parentForAccessibility instanceof View ? (View) parentForAccessibility : null);
                    } else {
                        gj4 gj4VarQ2 = gj4VarY2.q();
                        Integer numValueOf = gj4VarQ2 != null ? Integer.valueOf(gj4VarQ2.x) : null;
                        if (numValueOf == null) {
                            mc2.r("semanticsNode " + i + " has null parent");
                            l0.x();
                            return null;
                        }
                        int iIntValue = numValueOf.intValue();
                        if (iIntValue == baVar.getSemanticsOwner().g().x) {
                            iIntValue = -1;
                        }
                        m2VarS2.V(baVar, iIntValue);
                    }
                    m2VarS2.d0(baVar, i);
                    m2VarS2.o(iaVar.m(ij4Var));
                    fa3 fa3Var = iaVar.Q;
                    nu4 nu4Var = iaVar.e;
                    Resources resources = baVar.getContext().getResources();
                    m2VarS2.d("android.view.View");
                    aj4 aj4Var = gj4VarY2.n;
                    hb3 hb3Var = aj4Var.j;
                    if (hb3Var.r(kj4.G)) {
                        m2VarS2.d("android.widget.EditText");
                    }
                    if (hb3Var.r(kj4.C)) {
                        m2VarS2.d("android.widget.TextView");
                    }
                    Object objL2 = hb3Var.l(kj4.e);
                    if (objL2 == null) {
                        objL2 = null;
                    }
                    o94 o94Var = (o94) objL2;
                    if (o94Var != null) {
                        byte b = o94Var.g;
                        if (gj4VarY2.c() || gj4VarY2.t((4 & 1) != 0 ? !gj4VarY2.y : false, (4 & 2) == 0).isEmpty()) {
                            if (b == 4) {
                                m2VarS2.Y(resources.getString(R.string.tab));
                            } else if (b == 2) {
                                m2VarS2.Y(resources.getString(R.string.switch_role));
                            } else {
                                String strV = sf6.v(b);
                                if (b != 5 || sg6.p(gj4VarY2) || aj4Var.a) {
                                    m2VarS2.d(strV);
                                }
                            }
                        }
                    }
                    m2VarS2.S(baVar.getContext().getPackageName());
                    m2VarS2.M(fe6.j(gj4VarY2));
                    boolean zY = ag6.y(accessibilityManager);
                    List listT = gj4VarY2.t((4 & 1) != 0 ? !gj4VarY2.y : false, (4 & 2) == 0);
                    int size = listT.size();
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < size) {
                        boolean z2 = zY;
                        gj4 gj4Var = (gj4) listT.get(i3);
                        List list = listT;
                        he2 he2VarU = iaVar.u();
                        int i5 = size;
                        int i6 = gj4Var.x;
                        if (he2VarU.g(i6)) {
                            dg dgVar = baVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(gj4Var.r);
                            if (i6 != -1) {
                                if (dgVar != null) {
                                    m2VarS2.r(dgVar);
                                } else {
                                    ij4 ij4Var2 = (ij4) iaVar.u().y(i6);
                                    if (ij4Var2 == null || (gj4VarY = ij4Var2.y()) == null) {
                                        zP = false;
                                    } else {
                                        Object objL3 = gj4VarY.m().j.l(kj4.i);
                                        if (objL3 == null) {
                                            objL3 = null;
                                        }
                                        zP = yf2.p(objL3, Boolean.TRUE);
                                    }
                                    if (z2 || !zP) {
                                        m2VarS2.n(baVar, i6);
                                    }
                                }
                                fa3Var.x(i6, i4);
                                i4++;
                            }
                        }
                        i3++;
                        listT = list;
                        zY = z2;
                        size = i5;
                    }
                    if (i == iaVar.p) {
                        m2VarS2.u(true);
                        m2VarS2.y(f2.l);
                    } else {
                        m2VarS2.u(false);
                        m2VarS2.y(f2.x);
                    }
                    cj cjVarB = sg6.b(gj4VarY2);
                    if (cjVarB != null) {
                        baVar.getFontFamilyResolver();
                        spannableString = (SpannableString) ia.P(kg6.n(cjVarB, baVar.getDensity(), iaVar.M));
                    } else {
                        spannableString = null;
                    }
                    m2VarS2.f0(spannableString);
                    mj4 mj4Var = kj4.O;
                    if (hb3Var.r(mj4Var)) {
                        m2VarS2.D();
                        Object objL4 = hb3Var.l(mj4Var);
                        if (objL4 == null) {
                            objL4 = null;
                        }
                        m2VarS2.H((CharSequence) objL4);
                    }
                    m2VarS2.e0(sg6.i(gj4VarY2, resources));
                    m2VarS2.f(sg6.c(gj4VarY2));
                    Object objL5 = hb3Var.l(kj4.L);
                    if (objL5 == null) {
                        objL5 = null;
                    }
                    ca5 ca5Var = (ca5) objL5;
                    if (ca5Var != null) {
                        if (ca5Var == ca5.j) {
                            m2VarS2.k(true);
                        } else if (ca5Var == ca5.t) {
                            m2VarS2.k(false);
                        }
                    }
                    Object objL6 = hb3Var.l(kj4.K);
                    if (objL6 == null) {
                        objL6 = null;
                    }
                    Boolean bool = (Boolean) objL6;
                    if (bool != null) {
                        boolean zBooleanValue2 = bool.booleanValue();
                        if (o94Var == null) {
                            i2 = 4;
                        } else {
                            i2 = 4;
                            if (o94Var.g == 4) {
                                m2VarS2.b0(zBooleanValue2);
                            }
                        }
                        m2VarS2.k(zBooleanValue2);
                    } else {
                        i2 = 4;
                    }
                    if (!aj4Var.a || gj4VarY2.t((4 & 1) != 0 ? !gj4VarY2.y : false, (4 & 2) == 0).isEmpty()) {
                        Object objL7 = hb3Var.l(kj4.g);
                        if (objL7 == null) {
                            objL7 = null;
                        }
                        List list2 = (List) objL7;
                        m2VarS2.C(list2 != null ? (String) cj0.l0(list2) : null);
                    }
                    Object objL8 = hb3Var.l(kj4.A);
                    if (objL8 == null) {
                        objL8 = null;
                    }
                    String str = (String) objL8;
                    if (str != null) {
                        gj4 gj4VarQ3 = gj4VarY2;
                        while (true) {
                            if (gj4VarQ3 == null) {
                                zBooleanValue = false;
                                break;
                            }
                            aj4 aj4Var2 = gj4VarQ3.n;
                            hb3 hb3Var2 = aj4Var2.j;
                            mj4 mj4Var2 = ge6.g;
                            if (hb3Var2.r(mj4Var2)) {
                                zBooleanValue = ((Boolean) aj4Var2.y(mj4Var2)).booleanValue();
                                break;
                            }
                            gj4VarQ3 = gj4VarQ3.q();
                        }
                        if (zBooleanValue) {
                            m2VarS2.m0(str);
                        }
                    }
                    Object objL9 = hb3Var.l(kj4.j);
                    if (objL9 == null) {
                        objL9 = null;
                    }
                    if (((og5) objL9) != null) {
                        m2VarS2.K(true);
                    }
                    Object objL10 = hb3Var.l(kj4.t);
                    if (objL10 == null) {
                        objL10 = null;
                    }
                    if (((og5) objL10) != null) {
                        m2VarS2.g0();
                    }
                    if (i != -1) {
                        int iN = fa3Var.n(gj4VarY2.x);
                        if (iN != -1) {
                            m2VarS2.E(iN);
                        } else {
                            Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                        }
                    }
                    m2VarS2.W(hb3Var.r(kj4.N));
                    Object objL11 = hb3Var.l(kj4.Q);
                    if (objL11 == null) {
                        objL11 = null;
                    }
                    Boolean bool2 = Boolean.TRUE;
                    m2VarS2.F(yf2.p(objL11, bool2));
                    Object objL12 = hb3Var.l(kj4.R);
                    if (objL12 == null) {
                        objL12 = null;
                    }
                    Integer num = (Integer) objL12;
                    m2VarS2.Q(num != null ? num.intValue() : -1);
                    m2VarS2.G(sg6.y(gj4VarY2));
                    mj4 mj4Var3 = kj4.q;
                    m2VarS2.I(hb3Var.r(mj4Var3));
                    if (m2VarS2.i()) {
                        m2VarS2.J(((Boolean) aj4Var.y(mj4Var3)).booleanValue());
                        if (m2VarS2.b()) {
                            m2VarS2.g(2);
                            iaVar.u = i;
                            z = true;
                        } else {
                            z = true;
                            m2VarS2.g(1);
                        }
                    } else {
                        z = true;
                    }
                    m2VarS2.n0(fe6.l(gj4VarY2) ^ z);
                    if (gj4VarY2.c()) {
                        gj4VarQ = gj4VarY2.q();
                        gj4VarQ.getClass();
                    } else {
                        gj4VarQ = gj4VarY2;
                    }
                    if (gj4VarQ.w().x()) {
                        r2 = 0;
                        m2VarS2.n0(false);
                    } else {
                        r2 = 0;
                    }
                    Object objL13 = hb3Var.l(kj4.m);
                    if (objL13 == null) {
                        objL13 = null;
                    }
                    fx2 fx2Var = (fx2) objL13;
                    if (fx2Var != null) {
                        int iR = fx2Var.r();
                        m2VarS2.O((!fx2.y(iR, r2) && fx2.y(iR, 1)) ? 2 : 1);
                    }
                    m2VarS2.e(r2);
                    Object objL14 = hb3Var.l(yi4.y);
                    if (objL14 == null) {
                        objL14 = null;
                    }
                    p1 p1Var = (p1) objL14;
                    if (p1Var != null) {
                        Object objL15 = hb3Var.l(kj4.K);
                        if (objL15 == null) {
                            objL15 = null;
                        }
                        boolean zP3 = yf2.p(objL15, bool2);
                        boolean z3 = (o94Var != null && o94Var.g == 4) || (o94Var != null && o94Var.g == 3);
                        m2VarS2.e(!z3 || (z3 && !zP3));
                        if (sg6.y(gj4VarY2) && m2VarS2.c()) {
                            m2VarS2.y(new f2(p1Var.g, 16));
                        }
                    }
                    m2VarS2.P(false);
                    Object objL16 = hb3Var.l(yi4.r);
                    if (objL16 == null) {
                        objL16 = null;
                    }
                    p1 p1Var2 = (p1) objL16;
                    if (p1Var2 != null) {
                        m2VarS2.P(true);
                        if (sg6.y(gj4VarY2)) {
                            m2VarS2.y(new f2(p1Var2.g, 32));
                        }
                    }
                    Object objL17 = hb3Var.l(yi4.s);
                    if (objL17 == null) {
                        objL17 = null;
                    }
                    p1 p1Var3 = (p1) objL17;
                    if (p1Var3 != null) {
                        m2VarS2.y(new f2(p1Var3.g, 16384));
                    }
                    if (sg6.y(gj4VarY2)) {
                        Object objL18 = hb3Var.l(yi4.m);
                        if (objL18 == null) {
                            objL18 = null;
                        }
                        p1 p1Var4 = (p1) objL18;
                        if (p1Var4 != null) {
                            m2VarS2.y(new f2(p1Var4.g, 2097152));
                        }
                        Object objL19 = hb3Var.l(yi4.b);
                        if (objL19 == null) {
                            objL19 = null;
                        }
                        p1 p1Var5 = (p1) objL19;
                        if (p1Var5 != null) {
                            m2VarS2.y(new f2(p1Var5.g, android.R.id.accessibilityActionImeEnter));
                        }
                        Object objL20 = hb3Var.l(yi4.p);
                        if (objL20 == null) {
                            objL20 = null;
                        }
                        p1 p1Var6 = (p1) objL20;
                        if (p1Var6 != null) {
                            m2VarS2.y(new f2(p1Var6.g, 65536));
                        }
                        Object objL21 = hb3Var.l(yi4.u);
                        if (objL21 == null) {
                            objL21 = null;
                        }
                        p1 p1Var7 = (p1) objL21;
                        if (p1Var7 != null && m2VarS2.b()) {
                            ClipDescription primaryClipDescription = ((h9) baVar.getClipboardManager()).g().getPrimaryClipDescription();
                            if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                                m2VarS2.y(new f2(p1Var7.g, 32768));
                            }
                        }
                    }
                    String strZ = ia.z(gj4VarY2);
                    if (strZ != null && strZ.length() != 0) {
                        m2VarS2.h0(iaVar.p(gj4VarY2), iaVar.s(gj4VarY2));
                        Object objL22 = hb3Var.l(yi4.a);
                        if (objL22 == null) {
                            objL22 = null;
                        }
                        p1 p1Var8 = (p1) objL22;
                        m2VarS2.y(new f2(p1Var8 != null ? p1Var8.g : null, 131072));
                        m2VarS2.g(256);
                        m2VarS2.g(512);
                        m2VarS2.R(11);
                        Object objL23 = hb3Var.l(kj4.g);
                        if (objL23 == null) {
                            objL23 = null;
                        }
                        List list3 = (List) objL23;
                        if ((list3 == null || list3.isEmpty()) && hb3Var.r(yi4.g) && !sg6.r(gj4VarY2)) {
                            m2VarS2.R(m2VarS2.q() | 20);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add("androidx.compose.ui.semantics.id");
                        CharSequence charSequenceW = m2VarS2.w();
                        if (charSequenceW != null && charSequenceW.length() != 0 && hb3Var.r(yi4.g)) {
                            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                        }
                        if (hb3Var.r(kj4.A)) {
                            arrayList.add("androidx.compose.ui.semantics.testTag");
                        }
                        if (hb3Var.r(kj4.S)) {
                            arrayList.add("androidx.compose.ui.semantics.shapeType");
                            arrayList.add("androidx.compose.ui.semantics.shapeRect");
                            arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                            arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                        }
                        m2VarS2.z(arrayList);
                    }
                    Object objL24 = hb3Var.l(kj4.r);
                    if (objL24 == null) {
                        objL24 = null;
                    }
                    rz3 rz3Var = (rz3) objL24;
                    if (rz3Var != null) {
                        float f = rz3Var.g;
                        ki0 ki0Var = rz3Var.y;
                        mj4 mj4Var4 = yi4.t;
                        if (hb3Var.r(mj4Var4)) {
                            m2VarS2.d("android.widget.SeekBar");
                        } else {
                            m2VarS2.d("android.widget.ProgressBar");
                        }
                        if (rz3Var != rz3.r) {
                            m2VarS2.X(k2.r(ki0Var.g, ki0Var.y, f));
                        }
                        if (hb3Var.r(mj4Var4) && sg6.y(gj4VarY2)) {
                            float f2 = ki0Var.y;
                            float f3 = ki0Var.g;
                            if (f2 < f3) {
                                f2 = f3;
                            }
                            if (f < f2) {
                                m2VarS2.y(f2.j);
                            }
                            float f4 = ki0Var.y;
                            if (f3 > f4) {
                                f3 = f4;
                            }
                            if (f > f3) {
                                m2VarS2.y(f2.t);
                            }
                        }
                    }
                    qg6.g(m2VarS2, gj4VarY2);
                    kc6.n(m2VarS2, gj4VarY2);
                    kc6.v(m2VarS2, gj4VarY2);
                    Object objL25 = hb3Var.l(kj4.o);
                    if (objL25 == null) {
                        objL25 = null;
                    }
                    cf4 cf4Var = (cf4) objL25;
                    Object objL26 = hb3Var.l(yi4.n);
                    if (objL26 == null) {
                        objL26 = null;
                    }
                    p1 p1Var9 = (p1) objL26;
                    if (cf4Var != null && p1Var9 != null) {
                        if (!kc6.r(gj4VarY2)) {
                            m2VarS2.d("android.widget.HorizontalScrollView");
                        }
                        if (((Number) cf4Var.y.g()).floatValue() > 0.0f) {
                            m2VarS2.a0(true);
                        }
                        if (sg6.y(gj4VarY2)) {
                            if (ia.e(cf4Var)) {
                                m2VarS2.y(f2.j);
                                m2VarS2.y(!sg6.l(gj4VarY2) ? f2.b : f2.c);
                            }
                            if (ia.d(cf4Var)) {
                                m2VarS2.y(f2.t);
                                m2VarS2.y(!sg6.l(gj4VarY2) ? f2.c : f2.b);
                            }
                        }
                    }
                    Object objL27 = hb3Var.l(kj4.f);
                    if (objL27 == null) {
                        objL27 = null;
                    }
                    cf4 cf4Var2 = (cf4) objL27;
                    if (cf4Var2 != null && p1Var9 != null) {
                        if (!kc6.r(gj4VarY2)) {
                            m2VarS2.d("android.widget.ScrollView");
                        }
                        if (((Number) cf4Var2.y.g()).floatValue() > 0.0f) {
                            m2VarS2.a0(true);
                        }
                        if (sg6.y(gj4VarY2)) {
                            if (ia.e(cf4Var2)) {
                                m2VarS2.y(f2.j);
                                m2VarS2.y(f2.i);
                            }
                            if (ia.d(cf4Var2)) {
                                m2VarS2.y(f2.t);
                                m2VarS2.y(f2.w);
                            }
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        rg6.g(m2VarS2, gj4VarY2);
                    }
                    Object objL28 = hb3Var.l(kj4.n);
                    if (objL28 == null) {
                        objL28 = null;
                    }
                    m2VarS2.T((CharSequence) objL28);
                    if (sg6.y(gj4VarY2)) {
                        Object objL29 = hb3Var.l(yi4.z);
                        if (objL29 == null) {
                            objL29 = null;
                        }
                        p1 p1Var10 = (p1) objL29;
                        if (p1Var10 != null) {
                            m2VarS2.y(new f2(p1Var10.g, 262144));
                        }
                        Object objL30 = hb3Var.l(yi4.h);
                        if (objL30 == null) {
                            objL30 = null;
                        }
                        p1 p1Var11 = (p1) objL30;
                        if (p1Var11 != null) {
                            m2VarS2.y(new f2(p1Var11.g, 524288));
                        }
                        Object objL31 = hb3Var.l(yi4.o);
                        if (objL31 == null) {
                            objL31 = null;
                        }
                        p1 p1Var12 = (p1) objL31;
                        if (p1Var12 != null) {
                            m2VarS2.y(new f2(p1Var12.g, 1048576));
                        }
                        mj4 mj4Var5 = yi4.k;
                        if (hb3Var.r(mj4Var5)) {
                            List list4 = (List) aj4Var.y(mj4Var5);
                            int size2 = list4.size();
                            ga3 ga3Var = ia.U;
                            int i7 = ga3Var.y;
                            if (size2 >= i7) {
                                l0.z(du4.w(i7, "Can't have more than ", " custom actions for one widget"));
                                return null;
                            }
                            nu4 nu4Var2 = new nu4(0);
                            ta3 ta3Var = mi3.g;
                            ta3 ta3Var2 = new ta3();
                            if (nu4Var.j) {
                                c93.e(nu4Var);
                            }
                            if (og0.m(nu4Var.m, i, nu4Var.t) >= 0) {
                                ta3 ta3Var3 = (ta3) c93.o(nu4Var, i);
                                int[] iArr = ga3Var.g;
                                int i8 = ga3Var.y;
                                int i9 = 0;
                                int[] iArrCopyOf = new int[16];
                                int i10 = 0;
                                while (i10 < i8) {
                                    int i11 = iArr[i10];
                                    int i12 = i10;
                                    int i13 = i9 + 1;
                                    int i14 = i8;
                                    if (iArrCopyOf.length < i13) {
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i13, (iArrCopyOf.length * 3) / 2));
                                    }
                                    iArrCopyOf[i9] = i11;
                                    i9 = i13;
                                    i10 = i12 + 1;
                                    i8 = i14;
                                }
                                ArrayList arrayList2 = new ArrayList();
                                if (list4.size() > 0) {
                                    fj.w(list4.get(0));
                                    ta3Var3.getClass();
                                    throw null;
                                }
                                if (arrayList2.size() > 0) {
                                    fj.w(arrayList2.get(0));
                                    if (i9 > 0) {
                                        int i15 = iArrCopyOf[0];
                                        throw null;
                                    }
                                    cf6.t("Index must be between 0 and size");
                                    throw null;
                                }
                            } else if (list4.size() > 0) {
                                fj.w(list4.get(0));
                                ga3Var.r(0);
                                throw null;
                            }
                            iaVar.d.n(i, nu4Var2);
                            nu4Var.n(i, ta3Var2);
                        }
                    }
                    m2VarS2.Z(sg6.s(gj4VarY2, resources));
                    int iN2 = iaVar.I.n(i);
                    if (iN2 != -1) {
                        dg dgVarN2 = sf6.n(baVar.getAndroidViewsHandler$ui(), iN2);
                        if (dgVarN2 != null) {
                            m2VarS2.k0(dgVarN2);
                        } else {
                            m2VarS2.l0(baVar, iN2);
                        }
                        bundle = null;
                        iaVar.a(i, m2VarS2, iaVar.K, null);
                    } else {
                        bundle = null;
                    }
                    int iN3 = iaVar.J.n(i);
                    if (iN3 != -1 && (dgVarN = sf6.n(baVar.getAndroidViewsHandler$ui(), iN3)) != null) {
                        m2VarS2.i0(dgVarN);
                        iaVar.a(i, m2VarS2, iaVar.L, bundle);
                    }
                    Object objL32 = hb3Var.l(ge6.y);
                    String str2 = (String) (objL32 == null ? null : objL32);
                    if (str2 != null) {
                        m2VarS2.d(str2);
                    }
                    m2VarS = m2VarS2;
                } else {
                    m2VarS = null;
                }
            } else if (accessibilityManager.isEnabled()) {
                m2VarS = null;
            } else {
                m2VarS = m2.s();
            }
        } else if (accessibilityManager.isEnabled()) {
            m2VarS = null;
        } else {
            m2VarS = m2.s();
        }
        if (iaVar.o) {
            if (i == iaVar.p) {
                iaVar.z = m2VarS;
            }
            if (i == iaVar.u) {
                iaVar.h = m2VarS;
            }
        }
        return m2VarS;
    }
}
