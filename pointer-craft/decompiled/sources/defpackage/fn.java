package defpackage;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class fn extends gn {
    @Override // defpackage.gn
    public void g(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // defpackage.gn
    public boolean y(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
