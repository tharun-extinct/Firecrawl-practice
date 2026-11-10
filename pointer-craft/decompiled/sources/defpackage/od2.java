package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class od2 extends ri0 {
    public final View a;
    public int m;
    public int q;
    public final int[] w;

    public od2(View view) {
        super(0);
        this.w = new int[2];
        this.a = view;
    }

    @Override // defpackage.ri0
    public final cd2 a(yo5 yo5Var, cd2 cd2Var) {
        View view = this.a;
        int[] iArr = this.w;
        view.getLocationOnScreen(iArr);
        int i = this.m - iArr[1];
        this.q = i;
        view.setTranslationY(i);
        return cd2Var;
    }

    @Override // defpackage.ri0
    public final tp5 j(tp5 tp5Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yo5 yo5Var = (yo5) it.next();
            if ((yo5Var.g.n() & 8) != 0) {
                this.a.setTranslationY(qi.r(yo5Var.g.r(), this.q, 0));
                break;
            }
        }
        return tp5Var;
    }

    @Override // defpackage.ri0
    public final void l(yo5 yo5Var) {
        View view = this.a;
        int[] iArr = this.w;
        view.getLocationOnScreen(iArr);
        this.m = iArr[1];
    }

    @Override // defpackage.ri0
    public final void x(yo5 yo5Var) {
        this.a.setTranslationY(0.0f);
    }
}
