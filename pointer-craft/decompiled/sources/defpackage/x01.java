package defpackage;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import io.appground.blek.R;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class x01 extends BaseAdapter {
    public static final int n;
    public final Calendar g;
    public final int r;
    public final int y;

    static {
        n = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public x01() {
        Calendar calendarR = zh5.r(null);
        this.g = calendarR;
        this.y = calendarR.getMaximum(7);
        this.r = calendarR.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.y;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i2 = this.y;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.r;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i2 = i + this.r;
        int i3 = this.y;
        if (i2 > i3) {
            i2 -= i3;
        }
        Calendar calendar = this.g;
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, n, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public x01(int i) {
        Calendar calendarR = zh5.r(null);
        this.g = calendarR;
        this.y = calendarR.getMaximum(7);
        this.r = i;
    }
}
