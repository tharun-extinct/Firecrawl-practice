package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes.dex */
public final class wl {
    public static wl r;
    public static final PorterDuff.Mode y = PorterDuff.Mode.SRC_IN;
    public s74 g;

    public static synchronized wl g() {
        try {
            if (r == null) {
                n();
            }
        } catch (Throwable th) {
            throw th;
        }
        return r;
    }

    public static synchronized void n() {
        if (r == null) {
            wl wlVar = new wl();
            r = wlVar;
            wlVar.g = s74.y();
            s74 s74Var = r.g;
            vl vlVar = new vl();
            vlVar.g = new int[]{2131230838, 2131230836, 2131230762};
            vlVar.y = new int[]{2131230786, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
            vlVar.r = new int[]{2131230835, 2131230837, 2131230779, R.drawable.abc_text_cursor_material, 2131230832, 2131230833, 2131230834};
            vlVar.n = new int[]{2131230811, R.drawable.abc_cab_background_internal_bg, 2131230810};
            vlVar.v = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
            vlVar.x = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
            synchronized (s74Var) {
                s74Var.v = vlVar;
            }
        }
    }

    public static synchronized PorterDuffColorFilter r(int i, PorterDuff.Mode mode) {
        return s74.v(i, mode);
    }

    public final synchronized Drawable y(Context context, int i) {
        return this.g.r(context, i);
    }
}
