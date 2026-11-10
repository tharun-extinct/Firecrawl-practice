package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class a20 {
    public String g;
    public boolean r;
    public boolean y;

    public final b20 g() {
        boolean z = true;
        if (TextUtils.isEmpty(this.g) && TextUtils.isEmpty(null)) {
            z = false;
        }
        boolean zIsEmpty = TextUtils.isEmpty(null);
        if (z && !zIsEmpty) {
            l0.u("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
            return null;
        }
        if (!this.y && !z && zIsEmpty) {
            l0.u("Old SKU purchase information(token/id) or original external transaction id must be provided.");
            return null;
        }
        b20 b20Var = new b20();
        b20Var.g = this.g;
        b20Var.y = this.r;
        return b20Var;
    }

    public final void r() {
        this.r = true;
    }

    public final void y(String str) {
        this.g = str;
    }
}
