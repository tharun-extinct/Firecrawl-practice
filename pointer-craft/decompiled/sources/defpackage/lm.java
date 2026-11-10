package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: loaded from: classes2.dex */
public final class lm implements rm, DialogInterface.OnClickListener {
    public CharSequence a;
    public d6 j;
    public final /* synthetic */ sm m;
    public mm t;

    public lm(sm smVar) {
        this.m = smVar;
    }

    @Override // defpackage.rm
    public final void a(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.rm
    public final void b(ListAdapter listAdapter) {
        this.t = (mm) listAdapter;
    }

    @Override // defpackage.rm
    public final int c() {
        return 0;
    }

    @Override // defpackage.rm
    public final void dismiss() {
        d6 d6Var = this.j;
        if (d6Var != null) {
            d6Var.dismiss();
            this.j = null;
        }
    }

    @Override // defpackage.rm
    public final boolean g() {
        d6 d6Var = this.j;
        if (d6Var != null) {
            return d6Var.isShowing();
        }
        return false;
    }

    @Override // defpackage.rm
    public final CharSequence i() {
        return this.a;
    }

    @Override // defpackage.rm
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.rm
    public final void m(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.rm
    public final Drawable n() {
        return null;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        sm smVar = this.m;
        smVar.setSelection(i);
        if (smVar.getOnItemClickListener() != null) {
            smVar.performItemClick(null, i, this.t.getItemId(i));
        }
        dismiss();
    }

    @Override // defpackage.rm
    public final void q(int i, int i2) {
        if (this.t == null) {
            return;
        }
        sm smVar = this.m;
        c6 c6Var = new c6(smVar.getPopupContext());
        y5 y5Var = (y5) c6Var.y;
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            y5Var.n = charSequence;
        }
        mm mmVar = this.t;
        int selectedItemPosition = smVar.getSelectedItemPosition();
        y5Var.m = mmVar;
        y5Var.q = this;
        y5Var.c = selectedItemPosition;
        y5Var.w = true;
        d6 d6VarV = c6Var.v();
        this.j = d6VarV;
        AlertController$RecycleListView alertController$RecycleListView = d6VarV.c.x;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.j.show();
    }

    @Override // defpackage.rm
    public final void v(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // defpackage.rm
    public final void x(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.rm
    public final int y() {
        return 0;
    }
}
