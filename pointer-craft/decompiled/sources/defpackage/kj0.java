package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import io.appground.blek.R;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kj0 extends BaseAdapter {
    public final List g = pw5.d(new n5("Default", 0), new n5("Red", Color.parseColor("#f44336")), new n5("Pink", Color.parseColor("#e91e63")), new n5("Purple", Color.parseColor("#9c27b0")), new n5("Deep Purple", Color.parseColor("#673ab7")), new n5("Indigo", Color.parseColor("#3f51b5")), new n5("Blue", Color.parseColor("#2196f3")), new n5("Light Blue", Color.parseColor("#03a9f4")), new n5("Cyan", Color.parseColor("#00bcd4")), new n5("Teal", Color.parseColor("#009688")), new n5("Green", Color.parseColor("#4caf50")), new n5("Light Green", Color.parseColor("#8bc34a")), new n5("Lime", Color.parseColor("#cddc39")), new n5("Yellow", Color.parseColor("#ffeb3b")), new n5("Amber", Color.parseColor("#ffc107")), new n5("Orange", Color.parseColor("#ff9800")), new n5("Deep Orange", Color.parseColor("#ff5722")), new n5("Brown", Color.parseColor("#795548")), new n5("Grey", Color.parseColor("#9e9e9e")), new n5("Blue Grey", Color.parseColor("#607d8b")));
    public final LayoutInflater y;

    public kj0(Context context) {
        this.y = LayoutInflater.from(context);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.g.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.g.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        n5 n5Var = (n5) this.g.get(i);
        if (view == null) {
            view = this.y.inflate(R.layout.list_color_item, viewGroup, false);
            view.getClass();
        }
        view.findViewById(R.id.color).setBackgroundColor(n5Var.g);
        ((TextView) view.findViewById(R.id.text)).setText(n5Var.y);
        return view;
    }
}
