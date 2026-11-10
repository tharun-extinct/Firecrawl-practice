package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final class tl2 extends pw1 implements s02 {
    public yk5 j0;
    public volatile vw1 l0;
    public xl2 o0;
    public RecyclerView p0;
    public yw1 q0;
    public iv4 r0;
    public ActionMode t0;
    public wg2 v0;
    public boolean k0 = false;
    public final Object m0 = new Object();
    public boolean n0 = false;
    public final o05 s0 = new o05(new kl2(this, 2));
    public boolean u0 = true;
    public final rl2 w0 = new rl2(this, 0);
    public final pl2 x0 = new pl2(this);
    public final int y0 = -1;
    public bz1 z0 = new vq0((byte) 5);
    public xy1 A0 = new m92((byte) 3);

    @Override // defpackage.pw1
    public final View B(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.getClass();
        byte b = 0;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_layout_edit, viewGroup, false);
        int i = R.id.color_button;
        MaterialButton materialButton = (MaterialButton) br2.i(viewInflate, R.id.color_button);
        if (materialButton != null) {
            i = R.id.component_bar;
            ComposeView composeView = (ComposeView) br2.i(viewInflate, R.id.component_bar);
            if (composeView != null) {
                i = R.id.contained_button;
                if (((MaterialButton) br2.i(viewInflate, R.id.contained_button)) != null) {
                    i = R.id.edit_bar;
                    FrameLayout frameLayout = (FrameLayout) br2.i(viewInflate, R.id.edit_bar);
                    if (frameLayout != null) {
                        i = R.id.group;
                        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) br2.i(viewInflate, R.id.group);
                        if (materialButtonToggleGroup != null) {
                            i = R.id.grow_button;
                            MaterialButton materialButton2 = (MaterialButton) br2.i(viewInflate, R.id.grow_button);
                            if (materialButton2 != null) {
                                i = R.id.grow_group;
                                MaterialButtonToggleGroup materialButtonToggleGroup2 = (MaterialButtonToggleGroup) br2.i(viewInflate, R.id.grow_group);
                                if (materialButtonToggleGroup2 != null) {
                                    i = R.id.height_bigger_button;
                                    MaterialButton materialButton3 = (MaterialButton) br2.i(viewInflate, R.id.height_bigger_button);
                                    if (materialButton3 != null) {
                                        i = R.id.height_smaller_button;
                                        MaterialButton materialButton4 = (MaterialButton) br2.i(viewInflate, R.id.height_smaller_button);
                                        if (materialButton4 != null) {
                                            i = R.id.outline_button;
                                            if (((MaterialButton) br2.i(viewInflate, R.id.outline_button)) != null) {
                                                i = R.id.recyclerView;
                                                RecyclerView recyclerView = (RecyclerView) br2.i(viewInflate, R.id.recyclerView);
                                                if (recyclerView != null) {
                                                    i = R.id.style_group;
                                                    MaterialButtonToggleGroup materialButtonToggleGroup3 = (MaterialButtonToggleGroup) br2.i(viewInflate, R.id.style_group);
                                                    if (materialButtonToggleGroup3 != null) {
                                                        i = R.id.text_button;
                                                        if (((MaterialButton) br2.i(viewInflate, R.id.text_button)) != null) {
                                                            i = R.id.wrap_button;
                                                            MaterialButton materialButton5 = (MaterialButton) br2.i(viewInflate, R.id.wrap_button);
                                                            if (materialButton5 != null) {
                                                                this.q0 = new yw1((CoordinatorLayout) viewInflate, materialButton, composeView, frameLayout, materialButtonToggleGroup, materialButton2, materialButtonToggleGroup2, materialButton3, materialButton4, recyclerView, materialButtonToggleGroup3, materialButton5);
                                                                this.p0 = recyclerView;
                                                                composeView.setContent(new nm0(355112199, true, new jl2(this, b)));
                                                                T();
                                                                yw1 yw1Var = this.q0;
                                                                yw1Var.getClass();
                                                                CoordinatorLayout coordinatorLayout = yw1Var.g;
                                                                coordinatorLayout.getClass();
                                                                return coordinatorLayout;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        l0.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.pw1
    public final void C() {
        this.M = true;
        ActionMode actionMode = this.t0;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.t0 = null;
        RecyclerView recyclerView = this.p0;
        if (recyclerView != null) {
            if (recyclerView == null) {
                yf2.Y("recyclerView");
                throw null;
            }
            recyclerView.setAdapter(null);
        }
        this.q0 = null;
    }

    @Override // defpackage.pw1
    public final LayoutInflater E(Bundle bundle) {
        LayoutInflater layoutInflaterE = super.E(bundle);
        return layoutInflaterE.cloneInContext(new yk5(layoutInflaterE, this));
    }

    @Override // defpackage.pw1
    public final void I(View view) {
        view.getClass();
        n23 n23Var = new n23() { // from class: ml2
            @Override // defpackage.n23
            public final void g(int i, boolean z) {
                wk2 wk2VarR;
                r04 r04VarL;
                tl2 tl2Var = this.g;
                if (!tl2Var.u0 || (wk2VarR = tl2Var.R()) == null || (r04VarL = wk2VarR.l()) == null) {
                    return;
                }
                if (i == R.id.wrap_button) {
                    s04 s04Var = r04VarL.q;
                    if (s04Var.t == z) {
                        return;
                    } else {
                        s04Var.t = z;
                    }
                } else if (i == R.id.grow_button) {
                    float f = z ? 1.0f : 0.0f;
                    s04 s04Var2 = r04VarL.q;
                    if (s04Var2.a == f) {
                        return;
                    } else {
                        s04Var2.a = f;
                    }
                } else {
                    if (i != R.id.contained_button && i != R.id.outline_button && i != R.id.text_button) {
                        return;
                    }
                    int i2 = 1;
                    if (i != R.id.contained_button) {
                        if (i == R.id.outline_button) {
                            i2 = 2;
                        } else if (i == R.id.text_button) {
                            i2 = 3;
                        }
                    }
                    if (r04VarL.z().c == i2) {
                        return;
                    } else {
                        r04VarL.z().c = i2;
                    }
                }
                wk2VarR.g.y();
            }
        };
        yw1 yw1Var = this.q0;
        yw1Var.getClass();
        yw1Var.v.z.add(n23Var);
        yw1 yw1Var2 = this.q0;
        yw1Var2.getClass();
        yw1Var2.l.z.add(n23Var);
        yw1 yw1Var3 = this.q0;
        yw1Var3.getClass();
        yw1Var3.a.z.add(n23Var);
        yw1 yw1Var4 = this.q0;
        yw1Var4.getClass();
        final byte b = 0;
        yw1Var4.y.setOnClickListener(new View.OnClickListener(this) { // from class: nl2
            public final /* synthetic */ tl2 t;

            {
                this.t = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b2 = b;
                int i = 48;
                final tl2 tl2Var = this.t;
                switch (b2) {
                    case 0:
                        final kj0 kj0Var = new kj0(tl2Var.N());
                        d23 d23Var = new d23(tl2Var.N());
                        String string = tl2Var.c().getString(R.string.title_button_color);
                        y5 y5Var = (y5) d23Var.y;
                        y5Var.n = string;
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: ol2
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                r04 r04VarL;
                                wk2 wk2VarR = tl2Var.R();
                                if (wk2VarR == null || (r04VarL = wk2VarR.l()) == null) {
                                    return;
                                }
                                r04VarL.z().q = ((n5) kj0Var.g.get(i2)).g;
                                wk2VarR.g.y();
                            }
                        };
                        y5Var.m = kj0Var;
                        y5Var.q = onClickListener;
                        d23Var.c();
                        break;
                    case 1:
                        wk2 wk2VarR = tl2Var.R();
                        if (wk2VarR != null) {
                            r04 r04VarL = wk2VarR.l();
                            if (r04VarL != null) {
                                s04 s04Var = r04VarL.q;
                                int i2 = s04Var.w;
                                if (i2 == 0) {
                                    s04Var.w = 48;
                                } else {
                                    i = i2;
                                }
                                s04Var.w = i + 16;
                            }
                            wk2VarR.g.y();
                        }
                        break;
                    default:
                        wk2 wk2VarR2 = tl2Var.R();
                        if (wk2VarR2 != null) {
                            r04 r04VarL2 = wk2VarR2.l();
                            if (r04VarL2 != null) {
                                s04 s04Var2 = r04VarL2.q;
                                int i3 = s04Var2.w - 16;
                                s04Var2.w = i3;
                                if (i3 < 48) {
                                    s04Var2.w = 0;
                                }
                            }
                            wk2VarR2.g.y();
                        }
                        break;
                }
            }
        });
        yw1 yw1Var5 = this.q0;
        yw1Var5.getClass();
        final byte b2 = 1;
        yw1Var5.j.setOnClickListener(new View.OnClickListener(this) { // from class: nl2
            public final /* synthetic */ tl2 t;

            {
                this.t = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b3 = b2;
                int i = 48;
                final tl2 tl2Var = this.t;
                switch (b3) {
                    case 0:
                        final kj0 kj0Var = new kj0(tl2Var.N());
                        d23 d23Var = new d23(tl2Var.N());
                        String string = tl2Var.c().getString(R.string.title_button_color);
                        y5 y5Var = (y5) d23Var.y;
                        y5Var.n = string;
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: ol2
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                r04 r04VarL;
                                wk2 wk2VarR = tl2Var.R();
                                if (wk2VarR == null || (r04VarL = wk2VarR.l()) == null) {
                                    return;
                                }
                                r04VarL.z().q = ((n5) kj0Var.g.get(i2)).g;
                                wk2VarR.g.y();
                            }
                        };
                        y5Var.m = kj0Var;
                        y5Var.q = onClickListener;
                        d23Var.c();
                        break;
                    case 1:
                        wk2 wk2VarR = tl2Var.R();
                        if (wk2VarR != null) {
                            r04 r04VarL = wk2VarR.l();
                            if (r04VarL != null) {
                                s04 s04Var = r04VarL.q;
                                int i2 = s04Var.w;
                                if (i2 == 0) {
                                    s04Var.w = 48;
                                } else {
                                    i = i2;
                                }
                                s04Var.w = i + 16;
                            }
                            wk2VarR.g.y();
                        }
                        break;
                    default:
                        wk2 wk2VarR2 = tl2Var.R();
                        if (wk2VarR2 != null) {
                            r04 r04VarL2 = wk2VarR2.l();
                            if (r04VarL2 != null) {
                                s04 s04Var2 = r04VarL2.q;
                                int i3 = s04Var2.w - 16;
                                s04Var2.w = i3;
                                if (i3 < 48) {
                                    s04Var2.w = 0;
                                }
                            }
                            wk2VarR2.g.y();
                        }
                        break;
                }
            }
        });
        yw1 yw1Var6 = this.q0;
        yw1Var6.getClass();
        final byte b3 = 2;
        yw1Var6.t.setOnClickListener(new View.OnClickListener(this) { // from class: nl2
            public final /* synthetic */ tl2 t;

            {
                this.t = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b4 = b3;
                int i = 48;
                final tl2 tl2Var = this.t;
                switch (b4) {
                    case 0:
                        final kj0 kj0Var = new kj0(tl2Var.N());
                        d23 d23Var = new d23(tl2Var.N());
                        String string = tl2Var.c().getString(R.string.title_button_color);
                        y5 y5Var = (y5) d23Var.y;
                        y5Var.n = string;
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: ol2
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                r04 r04VarL;
                                wk2 wk2VarR = tl2Var.R();
                                if (wk2VarR == null || (r04VarL = wk2VarR.l()) == null) {
                                    return;
                                }
                                r04VarL.z().q = ((n5) kj0Var.g.get(i2)).g;
                                wk2VarR.g.y();
                            }
                        };
                        y5Var.m = kj0Var;
                        y5Var.q = onClickListener;
                        d23Var.c();
                        break;
                    case 1:
                        wk2 wk2VarR = tl2Var.R();
                        if (wk2VarR != null) {
                            r04 r04VarL = wk2VarR.l();
                            if (r04VarL != null) {
                                s04 s04Var = r04VarL.q;
                                int i2 = s04Var.w;
                                if (i2 == 0) {
                                    s04Var.w = 48;
                                } else {
                                    i = i2;
                                }
                                s04Var.w = i + 16;
                            }
                            wk2VarR.g.y();
                        }
                        break;
                    default:
                        wk2 wk2VarR2 = tl2Var.R();
                        if (wk2VarR2 != null) {
                            r04 r04VarL2 = wk2VarR2.l();
                            if (r04VarL2 != null) {
                                s04 s04Var2 = r04VarL2.q;
                                int i3 = s04Var2.w - 16;
                                s04Var2.w = i3;
                                if (i3 < 48) {
                                    s04Var2.w = 0;
                                }
                            }
                            wk2VarR2.g.y();
                        }
                        break;
                }
            }
        });
        yw1 yw1Var7 = this.q0;
        yw1Var7.getClass();
        zy5.y(yw1Var7.x, i(R.string.control_layout_tooltip_expand_width));
        yw1 yw1Var8 = this.q0;
        yw1Var8.getClass();
        zy5.y(yw1Var8.m, i(R.string.control_layout_tooltip_newline));
        yw1 yw1Var9 = this.q0;
        yw1Var9.getClass();
        zy5.y(yw1Var9.y, i(R.string.title_button_color));
    }

    public final wk2 R() {
        RecyclerView recyclerView = this.p0;
        if (recyclerView != null) {
            return (wk2) recyclerView.getAdapter();
        }
        yf2.Y("recyclerView");
        throw null;
    }

    public final void S() {
        if (this.j0 == null) {
            this.j0 = new yk5(super.m(), this);
            this.k0 = cg6.y(super.m());
        }
    }

    public final void T() {
        iv4 iv4Var = this.r0;
        mu0 mu0Var = null;
        if (iv4Var != null) {
            iv4Var.x(null);
        }
        this.r0 = m50.T(mq2.a(b()), null, new sl2(this, mu0Var, (byte) 1), 3);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    @Override // defpackage.pw1
    public final void d(Activity activity) {
        boolean z;
        this.M = true;
        Context baseContext = this.j0;
        if (baseContext != null) {
            while ((baseContext instanceof ContextWrapper) && !(baseContext instanceof Activity)) {
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            if (baseContext == activity) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        js2.v(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        S();
        if (this.n0) {
            return;
        }
        this.n0 = true;
        ((ul2) n()).getClass();
    }

    @Override // defpackage.pw1
    public final void e(Bundle bundle) {
        super.e(bundle);
        if (!this.K) {
            this.K = true;
            if (!u() || z()) {
                return;
            }
            this.B.A.invalidateOptionsMenu();
        }
    }

    @Override // defpackage.pw1
    public final void k(yk ykVar) {
        super.k(ykVar);
        S();
        if (this.n0) {
            return;
        }
        this.n0 = true;
        ((ul2) n()).getClass();
    }

    @Override // defpackage.pw1
    public final Context m() {
        if (super.m() == null && !this.k0) {
            return null;
        }
        S();
        return this.j0;
    }

    @Override // defpackage.r02
    public final Object n() {
        if (this.l0 == null) {
            synchronized (this.m0) {
                try {
                    if (this.l0 == null) {
                        this.l0 = new vw1(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.l0.n();
    }

    @Override // defpackage.pw1, defpackage.a52
    public final tl5 x() {
        tl5 tl5VarX = super.x();
        ji jiVarG = ((mz0) ((d41) a11.u(d41.class, this))).g();
        return new u62((yp2) jiVarG.t, tl5VarX, (q64) jiVarG.a);
    }
}
