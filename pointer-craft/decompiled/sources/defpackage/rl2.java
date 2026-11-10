package defpackage;

import android.view.ActionMode;
import com.google.android.material.button.MaterialButtonToggleGroup;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final class rl2 extends xi4 {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object y;

    public /* synthetic */ rl2(Object obj, byte b) {
        this.g = b;
        this.y = obj;
    }

    @Override // defpackage.xi4
    public void g(Object obj, boolean z) {
        p04 p04Var;
        r04[] r04VarArr;
        r04 r04Var;
        switch (this.g) {
            case 0:
                long jLongValue = ((Number) obj).longValue();
                tl2 tl2Var = (tl2) this.y;
                if (z) {
                    wk2 wk2VarR = tl2Var.R();
                    if (wk2VarR != null && (p04Var = wk2VarR.r) != null && (r04VarArr = p04Var.a) != null) {
                        int length = r04VarArr.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                r04Var = r04VarArr[i];
                                if (r04Var.m != jLongValue) {
                                    i++;
                                }
                            } else {
                                r04Var = null;
                            }
                        }
                        if (r04Var != null) {
                            if (tl2Var.t0 == null) {
                                rw1 rw1Var = tl2Var.B;
                                yk ykVar = rw1Var == null ? null : rw1Var.f;
                                tl2Var.t0 = ykVar != null ? ykVar.startActionMode(tl2Var.x0) : null;
                                yw1 yw1Var = tl2Var.q0;
                                yw1Var.getClass();
                                yw1Var.r.setVisibility(8);
                                yw1 yw1Var2 = tl2Var.q0;
                                yw1Var2.getClass();
                                yw1Var2.n.setVisibility(0);
                            }
                            ActionMode actionMode = tl2Var.t0;
                            if (actionMode != null) {
                                actionMode.setTitle(R.string.control_layout_key_edit);
                            }
                            ActionMode actionMode2 = tl2Var.t0;
                            if (actionMode2 != null) {
                                actionMode2.invalidate();
                            }
                            tl2Var.u0 = false;
                            yw1 yw1Var3 = tl2Var.q0;
                            yw1Var3.getClass();
                            MaterialButtonToggleGroup materialButtonToggleGroup = yw1Var3.v;
                            s04 s04Var = r04Var.q;
                            if (s04Var != null ? s04Var.t : false) {
                                materialButtonToggleGroup.q(R.id.wrap_button, true);
                            } else {
                                materialButtonToggleGroup.q(R.id.wrap_button, false);
                            }
                            yw1 yw1Var4 = tl2Var.q0;
                            yw1Var4.getClass();
                            MaterialButtonToggleGroup materialButtonToggleGroup2 = yw1Var4.l;
                            s04 s04Var2 = r04Var.q;
                            Float fValueOf = s04Var2 != null ? Float.valueOf(s04Var2.a) : null;
                            if (fValueOf == null || fValueOf.floatValue() != 1.0f) {
                                materialButtonToggleGroup2.q(R.id.grow_button, false);
                            } else {
                                materialButtonToggleGroup2.q(R.id.grow_button, true);
                            }
                            if (r04Var.t == 2) {
                                int i2 = r04Var.z().c;
                                int i3 = R.id.contained_button;
                                if (i2 != 1) {
                                    if (i2 == 2) {
                                        i3 = R.id.outline_button;
                                    } else if (i2 == 3) {
                                        i3 = R.id.text_button;
                                    }
                                }
                                yw1 yw1Var5 = tl2Var.q0;
                                yw1Var5.getClass();
                                yw1Var5.a.q(i3, true);
                            }
                            tl2Var.u0 = true;
                        }
                    }
                    ActionMode actionMode3 = tl2Var.t0;
                    if (actionMode3 != null) {
                        actionMode3.finish();
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.xi4
    public void r() {
        switch (this.g) {
            case 1:
                ((q70) this.y).h();
                break;
        }
    }

    @Override // defpackage.xi4
    public void y() {
        r04 r04VarL;
        switch (this.g) {
            case 0:
                tl2 tl2Var = (tl2) this.y;
                wk2 wk2VarR = tl2Var.R();
                hi4 hi4Var = wk2VarR != null ? wk2VarR.x().g : null;
                if (hi4Var != null && hi4Var.isEmpty()) {
                    ActionMode actionMode = tl2Var.t0;
                    if (actionMode != null) {
                        actionMode.finish();
                    }
                    yw1 yw1Var = tl2Var.q0;
                    if (yw1Var != null) {
                        yw1Var.r.setVisibility(0);
                    }
                    yw1 yw1Var2 = tl2Var.q0;
                    if (yw1Var2 != null) {
                        yw1Var2.n.setVisibility(8);
                    }
                } else {
                    yw1 yw1Var3 = tl2Var.q0;
                    if (yw1Var3 != null) {
                        wk2 wk2VarR2 = tl2Var.R();
                        boolean z = (wk2VarR2 == null || (r04VarL = wk2VarR2.l()) == null || r04VarL.t != 2) ? false : true;
                        yw1Var3.y.setVisibility(z ? 0 : 8);
                        yw1Var3.v.setVisibility(z ? 0 : 8);
                        yw1Var3.l.setVisibility(z ? 0 : 8);
                    }
                }
                break;
        }
    }
}
