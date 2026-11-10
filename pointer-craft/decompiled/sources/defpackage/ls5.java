package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import io.appground.blek.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class ls5 extends p44 {
    public final u23 r;

    public ls5(u23 u23Var) {
        this.r = u23Var;
    }

    @Override // defpackage.p44
    public final int g() {
        return this.r.l0.w;
    }

    @Override // defpackage.p44
    public final void n(n54 n54Var, int i) {
        u23 u23Var = this.r;
        int i2 = u23Var.l0.j.a + i;
        TextView textView = ((ks5) n54Var).h;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        Context context = textView.getContext();
        textView.setContentDescription(zh5.y().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        q70 q70Var = u23Var.o0;
        if (zh5.y().get(1) == i2) {
            Object obj = q70Var.m;
        } else {
            Object obj2 = q70Var.a;
        }
        throw null;
    }

    @Override // defpackage.p44
    public final n54 v(ViewGroup viewGroup, int i) {
        return new ks5((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
