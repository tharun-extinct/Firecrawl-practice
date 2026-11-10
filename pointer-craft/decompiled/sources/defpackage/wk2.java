package defpackage;

import android.R;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.button.MaterialButton;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class wk2 extends p44 {
    public final cd2 n;
    public final p04 r;
    public d31 v;
    public wg2 x;

    public wk2(p04 p04Var, cd2 cd2Var) {
        this.r = p04Var;
        this.n = cd2Var;
        if (this.g.g()) {
            l0.z("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            throw null;
        }
        this.y = true;
    }

    @Override // defpackage.p44
    public final int g() {
        return this.r.a.length;
    }

    public final r04 l() {
        try {
            hi4 hi4Var = x().g;
            hi4Var.getClass();
            Long l = (Long) cj0.i0(hi4Var);
            r04[] r04VarArr = this.r.a;
            r04VarArr.getClass();
            for (r04 r04Var : r04VarArr) {
                long j = r04Var.m;
                if (l != null && j == l.longValue()) {
                    return r04Var;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    @Override // defpackage.p44
    public final void n(n54 n54Var, int i) {
        final vk2 vk2Var = (vk2) n54Var;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: tk2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wk2 wk2VarR;
                int iR = vk2Var.r();
                if (iR != -1) {
                    cd2 cd2Var = this.n;
                    r04[] r04VarArr = ((p04) cd2Var.t).a;
                    r04VarArr.getClass();
                    r04 r04Var = (r04) pr.a0(iR, r04VarArr);
                    if (r04Var == null) {
                        return;
                    }
                    tl2 tl2Var = (tl2) cd2Var.a;
                    xl2 xl2Var = tl2Var.o0;
                    if (xl2Var != null) {
                        xl2Var.j = r04Var;
                    }
                    byte b = r04Var.t;
                    if (b != 2) {
                        if (b == 3 && (wk2VarR = tl2Var.R()) != null) {
                            wk2VarR.x().m(Long.valueOf(r04Var.m));
                            return;
                        }
                        return;
                    }
                    wk2 wk2VarR2 = tl2Var.R();
                    if (wk2VarR2 != null) {
                        wk2VarR2.x().m(Long.valueOf(r04Var.m));
                    }
                }
            }
        };
        r04 r04Var = this.r.a[i];
        final boolean zContains = x().g.contains(Long.valueOf(r04Var.m));
        vk2Var.g.setOnTouchListener(new View.OnTouchListener() { // from class: uk2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                wg2 wg2Var;
                if (!zContains || motionEvent.getAction() != 0 || (wg2Var = this.x) == null) {
                    return false;
                }
                ld1 ld1Var = wg2Var.w;
                RecyclerView recyclerView = wg2Var.p;
                vk2 vk2Var2 = vk2Var;
                ld1Var.v(recyclerView, vk2Var2);
                if ((ld1.y(983055, recyclerView.getLayoutDirection()) & 16711680) == 0) {
                    Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
                    return false;
                }
                if (vk2Var2.g.getParent() != wg2Var.p) {
                    Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
                    return false;
                }
                VelocityTracker velocityTracker = wg2Var.z;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                wg2Var.z = VelocityTracker.obtain();
                wg2Var.t = 0.0f;
                wg2Var.j = 0.0f;
                wg2Var.b(vk2Var2, 2);
                return false;
            }
        });
        switch (vk2Var.o) {
            case 0:
                if (r04Var.t == 2) {
                    MaterialButton materialButton = (MaterialButton) vk2Var.f;
                    materialButton.setOnClickListener(onClickListener);
                    rp2.g(materialButton, r04Var);
                    s04 s04Var = r04Var.q;
                    s04Var.getClass();
                    Context context = materialButton.getContext();
                    context.getClass();
                    materialButton.setLayoutParams(rp2.a(s04Var, context));
                    materialButton.setActivated(zContains);
                }
                break;
            default:
                ik5 ik5Var = (ik5) vk2Var.f;
                View view = vk2Var.g;
                byte b = r04Var.t;
                if (b == 1) {
                    view.setOnClickListener(onClickListener);
                    FlexboxLayout flexboxLayout = ((fm2) ik5Var).y;
                    flexboxLayout.removeAllViews();
                    r04[] r04VarArr = r04Var.k().a;
                    r04VarArr.getClass();
                    for (r04 r04Var2 : r04VarArr) {
                        Context context2 = flexboxLayout.getContext();
                        context2.getClass();
                        MaterialButton materialButtonL = rp2.l(context2, r04Var2.z().c, r04Var2.z().q);
                        materialButtonL.setClickable(false);
                        materialButtonL.setRippleColorResource(R.color.transparent);
                        rp2.g(materialButtonL, r04Var2);
                        s04 s04Var2 = r04Var2.q;
                        s04Var2.getClass();
                        Context context3 = materialButtonL.getContext();
                        context3.getClass();
                        flexboxLayout.addView(materialButtonL, rp2.m(s04Var2, context3));
                    }
                    break;
                } else if (b == 3) {
                    view.setOnClickListener(onClickListener);
                    view.setActivated(zContains);
                    s04 s04Var3 = r04Var.q;
                    s04Var3.getClass();
                    Context context4 = view.getContext();
                    context4.getClass();
                    view.setLayoutParams(rp2.a(s04Var3, context4));
                    bv0 bv0Var = ik5Var instanceof bv0 ? (bv0) ik5Var : null;
                    if (bv0Var != null) {
                        v04 v04VarD = r04Var.d();
                        j83 j83Var = bv0Var.v;
                        j83Var.g.setVisibility((v04VarD.t && (v04VarD.q || v04VarD.w || v04VarD.c)) ? 0 : 8);
                        MaterialButton materialButton2 = j83Var.y;
                        materialButton2.setVisibility(v04VarD.q ? 0 : 8);
                        materialButton2.setClickable(false);
                        materialButton2.setRippleColorResource(R.color.transparent);
                        MaterialButton materialButton3 = j83Var.r;
                        materialButton3.setVisibility(v04VarD.w ? 0 : 8);
                        materialButton3.setClickable(false);
                        materialButton3.setRippleColorResource(R.color.transparent);
                        MaterialButton materialButton4 = j83Var.n;
                        materialButton4.setVisibility(v04VarD.c ? 0 : 8);
                        materialButton4.setClickable(false);
                        materialButton4.setRippleColorResource(R.color.transparent);
                        j83 j83Var2 = bv0Var.n;
                        j83Var2.g.setVisibility((v04VarD.t || !(v04VarD.q || v04VarD.w || v04VarD.c)) ? 8 : 0);
                        MaterialButton materialButton5 = j83Var2.y;
                        materialButton5.setVisibility(v04VarD.q ? 0 : 8);
                        materialButton5.setClickable(false);
                        materialButton5.setRippleColorResource(R.color.transparent);
                        MaterialButton materialButton6 = j83Var2.r;
                        materialButton6.setVisibility(v04VarD.w ? 0 : 8);
                        materialButton6.setClickable(false);
                        materialButton6.setRippleColorResource(R.color.transparent);
                        MaterialButton materialButton7 = j83Var2.n;
                        materialButton7.setVisibility(v04VarD.c ? 0 : 8);
                        materialButton7.setClickable(false);
                        materialButton7.setRippleColorResource(R.color.transparent);
                        bv0Var.x.setVisibility(v04VarD.i ? 0 : 8);
                        bv0Var.l.setVisibility(v04VarD.b ? 0 : 8);
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.p44
    public final int r(int i) {
        r04 r04Var = this.r.a[i];
        byte b = r04Var.t;
        return b == 2 ? r04Var.z().q : b;
    }

    public final d31 x() {
        d31 d31Var = this.v;
        if (d31Var != null) {
            return d31Var;
        }
        yf2.Y("selectionTracker");
        throw null;
    }

    @Override // defpackage.p44
    public final long y(int i) {
        return this.r.a[i].m;
    }
}
