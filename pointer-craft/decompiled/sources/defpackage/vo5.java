package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vo5 extends WindowInsetsAnimation$Callback {
    public final ri0 g;
    public final HashMap n;
    public ArrayList r;
    public List y;

    public vo5(ri0 ri0Var) {
        super(ri0Var.j);
        this.n = new HashMap();
        this.g = ri0Var;
    }

    public final yo5 g(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.n;
        yo5 yo5Var = (yo5) map.get(windowInsetsAnimation);
        if (yo5Var != null) {
            return yo5Var;
        }
        yo5 yo5Var2 = new yo5(0, null, 0L);
        yo5Var2.g = new wo5(windowInsetsAnimation);
        map.put(windowInsetsAnimation, yo5Var2);
        return yo5Var2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.g.x(g(windowInsetsAnimation));
        this.n.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.g.l(g(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.r;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.r = arrayList2;
            this.y = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationM = c2.m(list.get(size));
            yo5 yo5VarG = g(windowInsetsAnimationM);
            yo5VarG.g.v(windowInsetsAnimationM.getFraction());
            this.r.add(yo5VarG);
        }
        return this.g.j(tp5.l(null, windowInsets), this.y).x();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        return this.g.a(g(windowInsetsAnimation), cd2.N(bounds)).M();
    }
}
