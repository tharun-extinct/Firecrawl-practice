package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import io.appground.blek.R;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class fc0 extends x43 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public int A;
    public int B;
    public boolean D;
    public e53 E;
    public ViewTreeObserver F;
    public PopupWindow.OnDismissListener G;
    public boolean H;
    public final int a;
    public final Handler c;
    public boolean d;
    public boolean e;
    public View f;
    public int k;
    public final int m;
    public View o;
    public final int q;
    public final Context t;
    public final boolean w;
    public final ArrayList i = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final km s = new km(this, 2);
    public final cc0 p = new cc0(this, 0);
    public final v92 u = new v92((Object) this, (byte) 7);
    public int z = 0;
    public int h = 0;
    public boolean C = false;

    public fc0(Context context, View view, int i, int i2, boolean z) {
        this.t = context;
        this.o = view;
        this.m = i;
        this.q = i2;
        this.w = z;
        this.k = view.getLayoutDirection() != 1 ? (byte) 1 : (byte) 0;
        Resources resources = context.getResources();
        this.a = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.c = new Handler();
    }

    @Override // defpackage.f53
    public final boolean a(ly4 ly4Var) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ec0 ec0Var = (ec0) obj;
            if (ly4Var == ec0Var.y) {
                ec0Var.g.a.requestFocus();
                return true;
            }
        }
        if (!ly4Var.hasVisibleItems()) {
            return false;
        }
        q(ly4Var);
        e53 e53Var = this.E;
        if (e53Var != null) {
            e53Var.d(ly4Var);
        }
        return true;
    }

    @Override // defpackage.x43
    public final void b(int i) {
        if (this.z != i) {
            this.z = i;
            this.h = Gravity.getAbsoluteGravity(i, this.o.getLayoutDirection());
        }
    }

    @Override // defpackage.x43
    public final void c(View view) {
        if (this.o != view) {
            this.o = view;
            this.h = Gravity.getAbsoluteGravity(this.z, view.getLayoutDirection());
        }
    }

    @Override // defpackage.mp4
    public final void dismiss() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        if (size > 0) {
            ec0[] ec0VarArr = (ec0[]) arrayList.toArray(new ec0[size]);
            for (int i = size - 1; i >= 0; i--) {
                ec0 ec0Var = ec0VarArr[i];
                if (ec0Var.g.G.isShowing()) {
                    ec0Var.g.dismiss();
                }
            }
        }
    }

    @Override // defpackage.mp4
    public final boolean g() {
        ArrayList arrayList = this.b;
        return arrayList.size() > 0 && ((ec0) arrayList.get(0)).g.G.isShowing();
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0164  */
    /* JADX WARN: Code duplicated, block: B:70:0x0168  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void h(i43 i43Var) {
        boolean z;
        int i;
        View childAt;
        ec0 ec0Var;
        int i2;
        int i3;
        int i4;
        int width;
        MenuItem item;
        f43 f43Var;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.t;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        f43 f43Var2 = new f43(i43Var, layoutInflaterFrom, this.w, R.layout.abc_cascading_menu_item_layout);
        if (!g() && this.C) {
            f43Var2.r = true;
        } else if (g()) {
            int size = i43Var.x.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    z = false;
                    break;
                }
                MenuItem item2 = i43Var.getItem(i5);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z = true;
                    break;
                }
                i5++;
            }
            f43Var2.r = z;
        }
        int iW = x43.w(f43Var2, context, this.a);
        b53 b53Var = new b53(context, null, this.m, this.q);
        b53Var.J = this.u;
        b53Var.f = this;
        em emVar = b53Var.G;
        emVar.setOnDismissListener(this);
        b53Var.o = this.o;
        b53Var.u = this.h;
        b53Var.F = true;
        emVar.setFocusable(true);
        emVar.setInputMethodMode(2);
        b53Var.b(f43Var2);
        b53Var.p(iW);
        b53Var.u = this.h;
        ArrayList arrayList = this.b;
        if (arrayList.size() > 0) {
            ec0Var = (ec0) arrayList.get(arrayList.size() - 1);
            i43 i43Var2 = ec0Var.y;
            int size2 = i43Var2.x.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size2) {
                    i = 0;
                    item = null;
                    break;
                }
                item = i43Var2.getItem(i6);
                if (item.hasSubMenu()) {
                    i = 0;
                    if (i43Var == item.getSubMenu()) {
                        break;
                    }
                }
                i6++;
            }
            if (item == null) {
                childAt = null;
            } else {
                ef1 ef1Var = ec0Var.g.a;
                ListAdapter adapter = ef1Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    f43Var = (f43) headerViewListAdapter.getWrappedAdapter();
                } else {
                    f43Var = (f43) adapter;
                    headersCount = i;
                }
                int count = f43Var.getCount();
                int i7 = i;
                while (true) {
                    if (i7 >= count) {
                        i7 = -1;
                        break;
                    } else if (item == f43Var.getItem(i7)) {
                        break;
                    } else {
                        i7++;
                    }
                }
                childAt = (i7 != -1 && (firstVisiblePosition = (i7 + headersCount) - ef1Var.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < ef1Var.getChildCount()) ? ef1Var.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            i = 0;
            childAt = null;
            ec0Var = null;
        }
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = b53.K;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[i] = Boolean.FALSE;
                        method.invoke(emVar, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                sj.z(emVar);
            }
            emVar.setEnterTransition(null);
            ef1 ef1Var2 = ((ec0) arrayList.get(arrayList.size() - 1)).g.a;
            int[] iArr = new int[2];
            ef1Var2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.f.getWindowVisibleDisplayFrame(rect);
            if (this.k == 1) {
                if (ef1Var2.getWidth() + iArr[i] + iW > rect.right) {
                    i2 = i;
                } else {
                    i2 = 1;
                }
            } else if (iArr[i] - iW < 0) {
                i2 = 1;
            } else {
                i2 = i;
            }
            int i8 = i2 == 1 ? 1 : i;
            this.k = i2;
            if (Build.VERSION.SDK_INT >= 26) {
                b53Var.o = childAt;
                i4 = i;
                i3 = i4;
            } else {
                int[] iArr2 = new int[2];
                this.o.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.h & 7) == 5) {
                    iArr2[i] = this.o.getWidth() + iArr2[i];
                    iArr3[i] = childAt.getWidth() + iArr3[i];
                }
                i3 = iArr3[i] - iArr2[i];
                i4 = iArr3[1] - iArr2[1];
            }
            if ((this.h & 5) == 5) {
                width = i8 != 0 ? i3 + iW : i3 - childAt.getWidth();
            } else {
                width = i8 != 0 ? i3 + childAt.getWidth() : i3 - iW;
            }
            b53Var.w = width;
            b53Var.p = true;
            b53Var.s = true;
            b53Var.l(i4);
        } else {
            if (this.d) {
                b53Var.w = this.A;
            }
            if (this.e) {
                b53Var.l(this.B);
            }
            Rect rect2 = this.j;
            b53Var.E = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new ec0(b53Var, i43Var, this.k));
        b53Var.r();
        ef1 ef1Var3 = b53Var.a;
        ef1Var3.setOnKeyListener(this);
        if (ec0Var == null && this.D && i43Var.w != null) {
            boolean z2 = i;
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, ef1Var3, z2);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(z2);
            textView.setText(i43Var.w);
            ef1Var3.addHeaderView(frameLayout, null, z2);
            b53Var.r();
        }
    }

    @Override // defpackage.x43
    public final void i(boolean z) {
        this.C = z;
    }

    @Override // defpackage.mp4
    public final ef1 j() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((ec0) arrayList.get(arrayList.size() - 1)).g.a;
    }

    @Override // defpackage.f53
    public final void l() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((ec0) obj).g.a.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((f43) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.f53
    public final boolean m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ec0 ec0Var;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                ec0Var = null;
                break;
            }
            ec0Var = (ec0) arrayList.get(i);
            if (!ec0Var.g.G.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (ec0Var != null) {
            ec0Var.y.n(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.x43
    public final void p(PopupWindow.OnDismissListener onDismissListener) {
        this.G = onDismissListener;
    }

    @Override // defpackage.x43
    public final void q(i43 i43Var) {
        i43Var.r(this, this.t);
        if (g()) {
            h(i43Var);
        } else {
            this.i.add(i43Var);
        }
    }

    @Override // defpackage.mp4
    public final void r() {
        if (g()) {
            return;
        }
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            h((i43) obj);
        }
        arrayList.clear();
        View view = this.o;
        this.f = view;
        if (view != null) {
            boolean z = this.F == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.F = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.s);
            }
            this.f.addOnAttachStateChangeListener(this.p);
        }
    }

    @Override // defpackage.x43
    public final void s(int i) {
        this.d = true;
        this.A = i;
    }

    @Override // defpackage.x43
    public final void u(boolean z) {
        this.D = z;
    }

    @Override // defpackage.f53
    public final void v(e53 e53Var) {
        this.E = e53Var;
    }

    @Override // defpackage.f53
    public final void y(i43 i43Var, boolean z) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (i43Var == ((ec0) arrayList.get(i)).y) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((ec0) arrayList.get(i2)).y.n(false);
        }
        ec0 ec0Var = (ec0) arrayList.remove(i);
        i43 i43Var2 = ec0Var.y;
        b53 b53Var = ec0Var.g;
        em emVar = b53Var.G;
        i43Var2.u(this);
        if (this.H) {
            emVar.setExitTransition(null);
            emVar.setAnimationStyle(0);
        }
        b53Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.k = ((ec0) arrayList.get(size2 - 1)).r;
        } else {
            this.k = this.o.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((ec0) arrayList.get(0)).y.n(false);
                return;
            }
            return;
        }
        dismiss();
        e53 e53Var = this.E;
        if (e53Var != null) {
            e53Var.y(i43Var, true);
        }
        ViewTreeObserver viewTreeObserver = this.F;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.F.removeGlobalOnLayoutListener(this.s);
            }
            this.F = null;
        }
        this.f.removeOnAttachStateChangeListener(this.p);
        this.G.onDismiss();
    }

    @Override // defpackage.x43
    public final void z(int i) {
        this.e = true;
        this.B = i;
    }
}
