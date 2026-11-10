package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class u05 {
    public final s05 g;
    public nd2 n;
    public nd2 r;
    public int v;
    public final ArrayList y = new ArrayList();

    public u05(ViewGroup viewGroup) {
        View childAt;
        nd2 nd2Var = nd2.v;
        this.r = nd2Var;
        this.n = nd2Var;
        Drawable background = viewGroup.getBackground();
        this.v = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        s05 s05Var = new s05(this, viewGroup.getContext(), viewGroup);
        this.g = s05Var;
        s05Var.setVisibility(8);
        s05Var.setWillNotDraw(true);
        gc0 gc0Var = new gc0((Object) this, (byte) 7);
        WeakHashMap weakHashMap = xk5.g;
        pk5.r(s05Var, gc0Var);
        yo5.g(s05Var, new t05(this));
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                childAt = null;
                break;
            }
            childAt = viewGroup.getChildAt(childCount);
            if (childAt.isAttachedToWindow() != viewGroup.isAttachedToWindow()) {
                break;
            } else {
                childCount--;
            }
        }
        if (childAt == null) {
            viewGroup.addView(s05Var, 0);
        } else {
            childAt.addOnAttachStateChangeListener(new zw1(viewGroup, s05Var));
        }
    }
}
