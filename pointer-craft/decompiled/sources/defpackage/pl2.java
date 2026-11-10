package defpackage;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import io.appground.blek.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class pl2 implements ActionMode.Callback {
    public final /* synthetic */ tl2 g;

    public pl2(tl2 tl2Var) {
        this.g = tl2Var;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) throws jg2 {
        wk2 wk2VarR;
        r04 r04VarL;
        r04 r04Var = null;
        Integer numValueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
        tl2 tl2Var = this.g;
        if (numValueOf != null && numValueOf.intValue() == R.id.action_delete) {
            wk2 wk2VarR2 = tl2Var.R();
            if (wk2VarR2 != null) {
                p04 p04Var = wk2VarR2.r;
                r04[] r04VarArr = p04Var.a;
                r04VarArr.getClass();
                ArrayList arrayListK0 = pr.k0(r04VarArr);
                int iIndexOf = arrayListK0.indexOf(wk2VarR2.l());
                if (iIndexOf > -1) {
                    wk2VarR2.x().g();
                    arrayListK0.remove(iIndexOf);
                    p04Var.a = (r04[]) arrayListK0.toArray(new r04[0]);
                    wk2VarR2.g.x(iIndexOf);
                    return true;
                }
            }
        } else {
            if (numValueOf == null || numValueOf.intValue() != R.id.action_copy) {
                if (numValueOf != null && numValueOf.intValue() == R.id.action_edit && (wk2VarR = tl2Var.R()) != null && (r04VarL = wk2VarR.l()) != null) {
                    byte b = r04VarL.t;
                    if (b == 2) {
                        wk2 wk2VarR3 = tl2Var.R();
                        if (wk2VarR3 != null) {
                            r04[] r04VarArr2 = wk2VarR3.r.a;
                            r04VarArr2.getClass();
                            tl2Var.z0.l(new int[]{pr.b0(r04VarArr2, wk2VarR3.l())}, Boolean.FALSE);
                            ActionMode actionMode2 = tl2Var.t0;
                            if (actionMode2 != null) {
                                actionMode2.finish();
                            }
                        }
                    } else if (b == 3) {
                        tl2Var.A0.a(Integer.valueOf(r04VarL.m));
                        return true;
                    }
                }
                return false;
            }
            wk2 wk2VarR4 = tl2Var.R();
            if (wk2VarR4 != null) {
                p04 p04Var2 = wk2VarR4.r;
                r04[] r04VarArr3 = p04Var2.a;
                r04VarArr3.getClass();
                ArrayList arrayListK1 = pr.k0(r04VarArr3);
                int iIndexOf2 = arrayListK1.indexOf(wk2VarR4.l());
                r04 r04VarL2 = wk2VarR4.l();
                if (r04VarL2 != null) {
                    byte[] bArrT = np3.t(r04VarL2);
                    np3 np3Var = (np3) r04.class.getDeclaredConstructor(null).newInstance(null);
                    np3.l(np3Var, bArrT);
                    r04Var = (r04) np3Var;
                    z0 z0Var = w24.j;
                    r04Var.m = w24.j.g().nextInt(32767);
                }
                if (r04Var != null) {
                    arrayListK1.add(iIndexOf2, r04Var);
                    p04Var2.a = (r04[]) arrayListK1.toArray(new r04[0]);
                    wk2VarR4.g.v(iIndexOf2);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        MenuInflater menuInflater;
        if (actionMode == null || (menuInflater = actionMode.getMenuInflater()) == null) {
            return true;
        }
        menuInflater.inflate(R.menu.context_menu, menu);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        tl2 tl2Var = this.g;
        wk2 wk2VarR = tl2Var.R();
        if (wk2VarR != null) {
            wk2VarR.x().g();
        }
        xl2 xl2Var = tl2Var.o0;
        if (xl2Var != null) {
            xl2Var.j = null;
        }
        tl2Var.t0 = null;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        MenuItem menuItemFindItem;
        r04 r04VarL;
        o04 o04VarZ;
        n04[] n04VarArr;
        n04 n04Var;
        wk2 wk2VarR = this.g.R();
        boolean z = (wk2VarR == null || (r04VarL = wk2VarR.l()) == null || (o04VarZ = r04VarL.z()) == null || (n04VarArr = o04VarZ.t) == null || (n04Var = (n04) pr.X(n04VarArr)) == null || n04Var.t != 5) ? false : true;
        if (menu != null && (menuItemFindItem = menu.findItem(R.id.action_edit)) != null) {
            menuItemFindItem.setVisible(!z);
        }
        return false;
    }
}
