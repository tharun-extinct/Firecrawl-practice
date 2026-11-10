package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class y5 {
    public k43 a;
    public final ContextThemeWrapper g;
    public g91 j;
    public CharSequence l;
    public ListAdapter m;
    public CharSequence n;
    public DialogInterface.OnClickListener q;
    public Drawable r;
    public View v;
    public boolean w;
    public String x;
    public final LayoutInflater y;
    public int c = -1;
    public boolean t = true;

    public y5(ContextThemeWrapper contextThemeWrapper) {
        this.g = contextThemeWrapper;
        this.y = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
    }
}
