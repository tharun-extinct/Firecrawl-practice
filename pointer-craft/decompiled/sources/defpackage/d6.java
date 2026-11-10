package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import io.appground.blek.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class d6 extends em0 implements DialogInterface, dl {
    public final b6 c;
    public tl q;
    public final ul w;

    /* JADX WARN: Type inference failed for: r2v2, types: [ul] */
    public d6(ContextThemeWrapper contextThemeWrapper, int i) {
        int i2;
        int iT = t(contextThemeWrapper, i);
        if (iT == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = iT;
        }
        super(contextThemeWrapper, i2);
        this.w = new li2() { // from class: ul
            @Override // defpackage.li2
            public final boolean v(KeyEvent keyEvent) {
                return this.j.q(keyEvent);
            }
        };
        kl klVarL = l();
        if (iT == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            iT = typedValue2.resourceId;
        }
        ((tl) klVarL).Y = iT;
        klVarL.r();
        this.c = new b6(getContext(), this, getWindow());
    }

    public static int t(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.em0, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        tl tlVar = (tl) l();
        tlVar.o();
        ((ViewGroup) tlVar.G.findViewById(android.R.id.content)).addView(view, layoutParams);
        tlVar.z.g(tlVar.u.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        l().n();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return ix5.y(this.w, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        tl tlVar = (tl) l();
        tlVar.o();
        return tlVar.u.findViewById(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        tl tlVar = (tl) l();
        if (tlVar.h != null) {
            tlVar.d();
            tlVar.h.getClass();
            tlVar.e(0);
        }
    }

    public final void j(Bundle bundle) {
        l().g();
        super.onCreate(bundle);
        l().r();
    }

    public final kl l() {
        tl tlVar = this.q;
        if (tlVar != null) {
            return tlVar;
        }
        jl jlVar = kl.j;
        tl tlVar2 = new tl(getContext(), getWindow(), this, this);
        this.q = tlVar2;
        return tlVar2;
    }

    public final void m(CharSequence charSequence) {
        super.setTitle(charSequence);
        l().m(charSequence);
    }

    @Override // defpackage.em0, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        j(bundle);
        b6 b6Var = this.c;
        b6Var.y.setContentView(b6Var.z);
        Context context = b6Var.g;
        Window window = b6Var.r;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupG = b6.g(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupG2 = b6.g(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupG3 = b6.g(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        b6Var.q = nestedScrollView;
        nestedScrollView.setFocusable(false);
        b6Var.q.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupG2.findViewById(android.R.id.message);
        b6Var.b = textView;
        if (textView != null) {
            String str = b6Var.v;
            if (str != null) {
                textView.setText(str);
            } else {
                textView.setVisibility(8);
                b6Var.q.removeView(b6Var.b);
                if (b6Var.x != null) {
                    ViewGroup viewGroup2 = (ViewGroup) b6Var.q.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(b6Var.q);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(b6Var.x, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupG2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupG3.findViewById(android.R.id.button1);
        b6Var.l = button;
        l3 l3Var = b6Var.e;
        button.setOnClickListener(l3Var);
        boolean zIsEmpty = TextUtils.isEmpty(b6Var.j);
        Button button2 = b6Var.l;
        if (zIsEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText(b6Var.j);
            b6Var.l.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) viewGroupG3.findViewById(android.R.id.button2);
        b6Var.a = button3;
        button3.setOnClickListener(l3Var);
        boolean zIsEmpty2 = TextUtils.isEmpty(null);
        Button button4 = b6Var.a;
        if (zIsEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText((CharSequence) null);
            b6Var.a.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) viewGroupG3.findViewById(android.R.id.button3);
        b6Var.m = button5;
        button5.setOnClickListener(l3Var);
        boolean zIsEmpty3 = TextUtils.isEmpty(null);
        Button button6 = b6Var.m;
        if (zIsEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText((CharSequence) null);
            b6Var.m.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button7 = b6Var.l;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button8 = b6Var.a;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button9 = b6Var.m;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupG3.setVisibility(8);
        }
        if (b6Var.s != null) {
            viewGroupG.addView(b6Var.s, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            b6Var.c = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(b6Var.n) || !b6Var.k) {
                window.findViewById(R.id.title_template).setVisibility(8);
                b6Var.c.setVisibility(8);
                viewGroupG.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                b6Var.i = textView2;
                textView2.setText(b6Var.n);
                Drawable drawable = b6Var.w;
                if (drawable != null) {
                    b6Var.c.setImageDrawable(drawable);
                } else {
                    b6Var.i.setPadding(b6Var.c.getPaddingLeft(), b6Var.c.getPaddingTop(), b6Var.c.getPaddingRight(), b6Var.c.getPaddingBottom());
                    b6Var.c.setVisibility(8);
                }
            }
        }
        boolean z = viewGroup.getVisibility() != 8;
        int i2 = (viewGroupG == null || viewGroupG.getVisibility() == 8) ? 0 : 1;
        boolean z2 = viewGroupG3.getVisibility() != 8;
        if (!z2 && (viewFindViewById = viewGroupG2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = b6Var.q;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (b6Var.v == null && b6Var.x == null) ? null : viewGroupG.findViewById(R.id.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupG2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = b6Var.x;
        if (alertController$RecycleListView != null && (!z2 || i2 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.j, alertController$RecycleListView.getPaddingRight(), z2 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.t);
        }
        if (!z) {
            View view = b6Var.x;
            if (view == null) {
                view = b6Var.q;
            }
            if (view != null) {
                int i3 = z2 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = xk5.g;
                view.setScrollIndicators(i2 | i3, 3);
                if (viewFindViewById11 != null) {
                    viewGroupG2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupG2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = b6Var.x;
        if (alertController$RecycleListView2 == null || (listAdapter = b6Var.p) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = b6Var.u;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.c.q;
        if (nestedScrollView == null || !nestedScrollView.t(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.c.q;
        if (nestedScrollView == null || !nestedScrollView.t(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.em0, android.app.Dialog
    public final void onStop() {
        super.onStop();
        tl tlVar = (tl) l();
        tlVar.d();
        no5 no5Var = tlVar.h;
        if (no5Var != null) {
            no5Var.m(false);
        }
    }

    public final boolean q(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.em0, android.app.Dialog
    public final void setContentView(int i) {
        v();
        l().l(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        m(charSequence);
        b6 b6Var = this.c;
        b6Var.n = charSequence;
        TextView textView = b6Var.i;
        if (textView != null) {
            textView.setText(charSequence);
        }
        b6Var.r.setTitle(charSequence);
    }

    @Override // defpackage.em0, android.app.Dialog
    public final void setContentView(View view) {
        v();
        l().t(view);
    }

    @Override // defpackage.em0, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        l().a(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        l().m(getContext().getString(i));
    }
}
