package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class s05 extends View {
    public final /* synthetic */ ViewGroup j;
    public final /* synthetic */ u05 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s05(u05 u05Var, Context context, ViewGroup viewGroup) {
        super(context);
        this.t = u05Var;
        this.j = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        u05 u05Var = this.t;
        ArrayList arrayList = u05Var.y;
        Drawable background = this.j.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        if (u05Var.v != color) {
            u05Var.v = color;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((j04) arrayList.get(size)).y(color);
            }
        }
    }
}
