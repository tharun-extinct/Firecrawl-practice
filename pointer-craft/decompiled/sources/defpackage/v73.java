package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import io.appground.blek.R;
import java.util.Calendar;

/* JADX INFO: loaded from: classes2.dex */
public final class v73 extends BaseAdapter {
    public static final int n = zh5.r(null).getMaximum(4);
    public static final int v = (zh5.r(null).getMaximum(7) + zh5.r(null).getMaximum(5)) - 1;
    public final u73 g;
    public final qa0 r;
    public q70 y;

    public v73(u73 u73Var, qa0 qa0Var) {
        this.g = u73Var;
        this.r = qa0Var;
        throw null;
    }

    public final int g(int i) {
        do {
            i++;
            if (i > x()) {
                return -1;
            }
        } while (!v(i));
        return i;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return v;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.g.m;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d  */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.y == null) {
            this.y = new q70(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iR = i - r();
        if (iR >= 0) {
            u73 u73Var = this.g;
            if (iR >= u73Var.q) {
                textView.setVisibility(8);
                textView.setEnabled(false);
            } else {
                textView.setTag(u73Var);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(iR + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
        }
        if (getItem(i) == null || textView == null) {
            return textView;
        }
        textView.getContext();
        zh5.y().getTimeInMillis();
        throw null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < r() || i > x()) {
            return null;
        }
        int iR = (i - r()) + 1;
        Calendar calendarG = zh5.g(this.g.j);
        calendarG.set(5, iR);
        return Long.valueOf(calendarG.getTimeInMillis());
    }

    public final int r() {
        int firstDayOfWeek = this.r.q;
        u73 u73Var = this.g;
        Calendar calendar = u73Var.j;
        int i = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i2 = i - firstDayOfWeek;
        return i2 < 0 ? i2 + u73Var.m : i2;
    }

    public final boolean v(int i) {
        Long item = getItem(i);
        if (item != null) {
            return item.longValue() >= this.r.a.j;
        }
        return false;
    }

    public final int x() {
        return (r() + this.g.q) - 1;
    }

    public final int y(int i) {
        do {
            i--;
            if (i < r()) {
                return -1;
            }
        } while (!v(i));
        return i;
    }
}
