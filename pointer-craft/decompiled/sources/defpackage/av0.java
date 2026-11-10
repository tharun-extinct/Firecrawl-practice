package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.button.MaterialButton;
import io.appground.blek.R;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class av0 extends gy {
    public iv4 u0;
    public iv4 v0;
    public final uu0 w0 = new uu0(this);
    public final jw1 x0;
    public final f y0;

    public av0() {
        u4 u4Var = new u4((byte) 4);
        d5 d5Var = new d5(this, (byte) 2);
        q64 q64Var = new q64((Object) this, (byte) 19);
        if (this.j > 1) {
            uo1.l(this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).", "Fragment ");
            throw null;
        }
        AtomicReference atomicReference = new AtomicReference();
        iw1 iw1Var = new iw1(this, q64Var, atomicReference, u4Var, d5Var);
        if (this.j >= 0) {
            iw1Var.g();
        } else {
            this.f0.add(iw1Var);
        }
        this.x0 = new jw1(atomicReference);
        this.y0 = new f(this, (byte) 13);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x010d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r18v0, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r1v11, types: [iv4, nh2] */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [fx0, java.util.concurrent.CancellationException, mu0] */
    /* JADX WARN: Type inference failed for: r4v5 */
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
    public final void c0(ViewGroup viewGroup, LayoutInflater layoutInflater, p04 p04Var, s04 s04Var, String str, Map map) {
        ?? r10;
        FlexboxLayout flexboxLayout;
        int i;
        av0 av0Var = this;
        layoutInflater.getClass();
        p04Var.getClass();
        str.getClass();
        map.getClass();
        ?? r4 = 0;
        FlexboxLayout flexboxLayout2 = new FlexboxLayout(av0Var.N(), null);
        flexboxLayout2.setFlexDirection(p04Var.m);
        flexboxLayout2.setFlexWrap(p04Var.i);
        flexboxLayout2.setJustifyContent(p04Var.q);
        flexboxLayout2.setAlignItems(p04Var.w);
        flexboxLayout2.setAlignContent(p04Var.c);
        flexboxLayout2.setDividerDrawableVertical(av0Var.N().getDrawable(R.drawable.flexbox_divider));
        byte b = 2;
        flexboxLayout2.setShowDividerVertical(2);
        boolean z = false;
        flexboxLayout2.setLayoutDirection(0);
        r04[] r04VarArr = p04Var.a;
        r04VarArr.getClass();
        int length = r04VarArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            r04 r04Var = r04VarArr[i2];
            byte b2 = r04Var.t;
            byte b3 = 1;
            if (b2 == 1) {
                String str2 = str + ":" + r04Var.m;
                if (yf2.p(map.get(str2), Boolean.FALSE)) {
                    flexboxLayout = flexboxLayout2;
                    r10 = 0;
                } else {
                    p04 p04VarK = r04Var.k();
                    p04VarK.getClass();
                    s04 s04Var2 = r04Var.q;
                    FlexboxLayout flexboxLayout3 = flexboxLayout2;
                    r10 = 0;
                    av0Var.c0(flexboxLayout3, layoutInflater, p04VarK, s04Var2, str2, map);
                    flexboxLayout = flexboxLayout3;
                }
            } else if (b2 != b) {
                if (b2 == 3) {
                    bv0 bv0VarG = bv0.g(layoutInflater, viewGroup, z);
                    ?? r1 = av0Var.u0;
                    if (r1 != 0) {
                        r1.x(r4);
                    }
                    this.u0 = m50.T(mq2.a(av0Var.b()), r4, new zh(this, bv0VarG, r04Var, r4, (byte) 7), 3);
                    LinearLayout linearLayout = bv0VarG.g;
                    s04 s04Var3 = r04Var.q;
                    s04Var3.getClass();
                    flexboxLayout2.addView(linearLayout, rp2.m(s04Var3, N()));
                }
                r10 = r4;
                flexboxLayout = flexboxLayout2;
            } else {
                o04 o04VarZ = r04Var.z();
                MaterialButton materialButtonL = rp2.l(av0Var.N(), o04VarZ.c, o04VarZ.q);
                rp2.g(materialButtonL, r04Var);
                if (!r04Var.c || av0Var.X()) {
                    materialButtonL.setOnTouchListener(new qu0(av0Var.y0, b3));
                } else {
                    materialButtonL.setText("Unlock " + ((Object) materialButtonL.getText()));
                    materialButtonL.setOnClickListener(new su0(av0Var, b3));
                }
                String str3 = o04VarZ.m;
                str3.getClass();
                if (str3.length() == 0) {
                    n04[] n04VarArr = o04VarZ.t;
                    n04VarArr.getClass();
                    n04 n04Var = (n04) pr.X(n04VarArr);
                    i = (n04Var == null || n04Var.m.length() != 0) ? 0 : 4;
                }
                materialButtonL.setVisibility(i);
                s04 s04Var4 = r04Var.q;
                s04Var4.getClass();
                Context context = materialButtonL.getContext();
                context.getClass();
                flexboxLayout2.addView(materialButtonL, rp2.m(s04Var4, context));
                flexboxLayout = flexboxLayout2;
                r10 = 0;
            }
            i2++;
            flexboxLayout2 = flexboxLayout;
            r4 = r10;
            b = 2;
            z = false;
            av0Var = this;
        }
        FlexboxLayout flexboxLayout4 = flexboxLayout2;
        if (s04Var != null) {
            wp1 wp1Var = new wp1(-2);
            wp1Var.t = s04Var.a;
            wp1Var.m = s04Var.m;
            wp1Var.s = s04Var.t;
            viewGroup.addView(flexboxLayout4, wp1Var);
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        Context context2 = viewGroup.getContext();
        context2.getClass();
        int iT = rp2.t(context2, 4);
        layoutParams.setMargins(iT, iT, iT, iT);
        viewGroup.addView(flexboxLayout4, layoutParams);
    }

    public final void d0(LayoutInflater layoutInflater, ViewGroup viewGroup, p04 p04Var, String str) {
        layoutInflater.getClass();
        p04Var.getClass();
        iv4 iv4Var = this.v0;
        if (iv4Var != null) {
            iv4Var.x(null);
        }
        this.v0 = m50.T(mq2.a(b()), null, new xu0(this, p04Var, str, viewGroup, layoutInflater, null), 3);
    }
}
