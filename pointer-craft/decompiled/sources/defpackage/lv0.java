package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.button.MaterialButton;
import io.appground.blek.R;
import io.appground.blek.utils.PointerPathView;

/* JADX INFO: loaded from: classes2.dex */
public final class lv0 extends FrameLayout {
    public final LayoutInflater j;
    public bv0 t;

    public lv0(Context context) {
        super(context, null, 0);
        this.j = LayoutInflater.from(context);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x015f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r18v0, types: [lv0] */
    /* JADX WARN: Type inference failed for: r19v0, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r8v2 */
    public final void g(ViewGroup viewGroup, p04 p04Var, sv0 sv0Var, s04 s04Var) {
        ?? r12;
        final byte b;
        int i;
        FlexboxLayout flexboxLayout = new FlexboxLayout(viewGroup.getContext(), null);
        flexboxLayout.setFlexDirection(p04Var.m);
        flexboxLayout.setFlexWrap(p04Var.i);
        flexboxLayout.setJustifyContent(p04Var.q);
        flexboxLayout.setAlignItems(p04Var.w);
        flexboxLayout.setAlignContent(p04Var.c);
        flexboxLayout.setDividerDrawableVertical(flexboxLayout.getContext().getDrawable(R.drawable.flexbox_divider));
        byte b2 = 2;
        flexboxLayout.setShowDividerVertical(2);
        r04[] r04VarArr = p04Var.a;
        r04VarArr.getClass();
        final ?? r8 = 0;
        int i2 = 0;
        for (int length = r04VarArr.length; i2 < length; length = length) {
            r04 r04Var = r04VarArr[i2];
            byte b3 = r04Var.t;
            byte b4 = 1;
            if (b3 == 1) {
                r12 = r8;
                b = b2;
                p04 p04VarK = r04Var.k();
                p04VarK.getClass();
                g(flexboxLayout, p04VarK, sv0Var, r04Var.q);
            } else if (b3 == b2) {
                b = b2;
                o04 o04VarZ = r04Var.z();
                Context context = viewGroup.getContext();
                context.getClass();
                MaterialButton materialButtonL = rp2.l(context, o04VarZ.c, o04VarZ.q);
                rp2.g(materialButtonL, r04Var);
                r12 = 0;
                materialButtonL.setOnTouchListener(new hv0(sv0Var.x, (byte) 0));
                String str = o04VarZ.m;
                str.getClass();
                if (str.length() == 0) {
                    n04[] n04VarArr = o04VarZ.t;
                    n04VarArr.getClass();
                    n04 n04Var = (n04) pr.X(n04VarArr);
                    if (n04Var == null || n04Var.m.length() != 0) {
                        i = 0;
                    } else {
                        i = 4;
                    }
                } else {
                    i = 0;
                }
                materialButtonL.setVisibility(i);
                s04 s04Var2 = r04Var.q;
                s04Var2.getClass();
                Context context2 = materialButtonL.getContext();
                context2.getClass();
                flexboxLayout.addView(materialButtonL, rp2.m(s04Var2, context2));
            } else if (b3 != 3) {
                r12 = r8;
                b = b2;
            } else {
                bv0 bv0VarG = bv0.g(this.j, viewGroup, r8);
                j83 j83Var = bv0VarG.v;
                j83 j83Var2 = bv0VarG.n;
                PointerPathView pointerPathView = bv0VarG.j;
                sv0Var.getClass();
                final nv0 nv0Var = new nv0(sv0Var, b4);
                j83Var2.y.setOnTouchListener(new View.OnTouchListener() { // from class: jv0
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        byte b5 = r8;
                        nv0 nv0Var2 = nv0Var;
                        switch (b5) {
                            case 0:
                                nv0Var2.l(view, motionEvent);
                                break;
                            case 1:
                                nv0Var2.l(view, motionEvent);
                                break;
                            case 2:
                                nv0Var2.l(view, motionEvent);
                                break;
                            case 3:
                                nv0Var2.l(view, motionEvent);
                                break;
                            case 4:
                                nv0Var2.l(view, motionEvent);
                                break;
                            default:
                                nv0Var2.l(view, motionEvent);
                                break;
                        }
                        return Boolean.FALSE.booleanValue();
                    }
                });
                final byte b5 = 1;
                j83Var.y.setOnTouchListener(new View.OnTouchListener() { // from class: jv0
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        byte b6 = b5;
                        nv0 nv0Var2 = nv0Var;
                        switch (b6) {
                            case 0:
                                nv0Var2.l(view, motionEvent);
                                break;
                            case 1:
                                nv0Var2.l(view, motionEvent);
                                break;
                            case 2:
                                nv0Var2.l(view, motionEvent);
                                break;
                            case 3:
                                nv0Var2.l(view, motionEvent);
                                break;
                            case 4:
                                nv0Var2.l(view, motionEvent);
                                break;
                            default:
                                nv0Var2.l(view, motionEvent);
                                break;
                        }
                        return Boolean.FALSE.booleanValue();
                    }
                });
                final nv0 nv0Var2 = new nv0(sv0Var, (byte) 4);
                b = 2;
                j83Var2.r.setOnTouchListener(new View.OnTouchListener() { // from class: jv0
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        byte b6 = b;
                        nv0 nv0Var3 = nv0Var2;
                        switch (b6) {
                            case 0:
                                nv0Var3.l(view, motionEvent);
                                break;
                            case 1:
                                nv0Var3.l(view, motionEvent);
                                break;
                            case 2:
                                nv0Var3.l(view, motionEvent);
                                break;
                            case 3:
                                nv0Var3.l(view, motionEvent);
                                break;
                            case 4:
                                nv0Var3.l(view, motionEvent);
                                break;
                            default:
                                nv0Var3.l(view, motionEvent);
                                break;
                        }
                        return Boolean.FALSE.booleanValue();
                    }
                });
                final byte b6 = 3;
                j83Var.r.setOnTouchListener(new View.OnTouchListener() { // from class: jv0
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        byte b7 = b6;
                        nv0 nv0Var3 = nv0Var;
                        switch (b7) {
                            case 0:
                                nv0Var3.l(view, motionEvent);
                                break;
                            case 1:
                                nv0Var3.l(view, motionEvent);
                                break;
                            case 2:
                                nv0Var3.l(view, motionEvent);
                                break;
                            case 3:
                                nv0Var3.l(view, motionEvent);
                                break;
                            case 4:
                                nv0Var3.l(view, motionEvent);
                                break;
                            default:
                                nv0Var3.l(view, motionEvent);
                                break;
                        }
                        return Boolean.FALSE.booleanValue();
                    }
                });
                final nv0 nv0Var3 = new nv0(sv0Var, b);
                MaterialButton materialButton = j83Var2.n;
                final byte b7 = 4;
                materialButton.setOnTouchListener(new View.OnTouchListener() { // from class: jv0
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        byte b8 = b7;
                        nv0 nv0Var4 = nv0Var3;
                        switch (b8) {
                            case 0:
                                nv0Var4.l(view, motionEvent);
                                break;
                            case 1:
                                nv0Var4.l(view, motionEvent);
                                break;
                            case 2:
                                nv0Var4.l(view, motionEvent);
                                break;
                            case 3:
                                nv0Var4.l(view, motionEvent);
                                break;
                            case 4:
                                nv0Var4.l(view, motionEvent);
                                break;
                            default:
                                nv0Var4.l(view, motionEvent);
                                break;
                        }
                        return Boolean.FALSE.booleanValue();
                    }
                });
                final byte b8 = 5;
                j83Var.n.setOnTouchListener(new View.OnTouchListener() { // from class: jv0
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        byte b9 = b8;
                        nv0 nv0Var4 = nv0Var;
                        switch (b9) {
                            case 0:
                                nv0Var4.l(view, motionEvent);
                                break;
                            case 1:
                                nv0Var4.l(view, motionEvent);
                                break;
                            case 2:
                                nv0Var4.l(view, motionEvent);
                                break;
                            case 3:
                                nv0Var4.l(view, motionEvent);
                                break;
                            case 4:
                                nv0Var4.l(view, motionEvent);
                                break;
                            default:
                                nv0Var4.l(view, motionEvent);
                                break;
                        }
                        return Boolean.FALSE.booleanValue();
                    }
                });
                bv0VarG.y.setOnTouchListener(new hv0(new mv0(sv0Var, (byte) 1), (byte) 1));
                o83 o83Var = sv0Var.l;
                pointerPathView.setOnTouchListener(o83Var);
                pointerPathView.setOnHoverListener(o83Var);
                if (Build.VERSION.SDK_INT >= 26) {
                    o83Var.getClass();
                    pointerPathView.setOnCapturedPointerListener(new m83(o83Var));
                }
                pointerPathView.setOnPointerCaptureChange(new kv0(bv0VarG, (byte) 0));
                bv0VarG.r.setOnClickListener(new iv0(bv0VarG, (byte) 0));
                LinearLayout linearLayout = bv0VarG.g;
                s04 s04Var3 = r04Var.q;
                s04Var3.getClass();
                Context context3 = viewGroup.getContext();
                context3.getClass();
                flexboxLayout.addView(linearLayout, rp2.m(s04Var3, context3));
                this.t = bv0VarG;
                r12 = 0;
            }
            i2++;
            b2 = b;
            r8 = r12;
            r04VarArr = r04VarArr;
        }
        if (s04Var != null) {
            wp1 wp1Var = new wp1(-2);
            wp1Var.t = s04Var.a;
            wp1Var.m = s04Var.m;
            wp1Var.s = s04Var.t;
            viewGroup.addView(flexboxLayout, wp1Var);
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        Context context4 = viewGroup.getContext();
        context4.getClass();
        int iT = rp2.t(context4, 4);
        layoutParams.setMargins(iT, iT, iT, iT);
        viewGroup.addView(flexboxLayout, layoutParams);
    }
}
