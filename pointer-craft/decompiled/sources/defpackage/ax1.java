package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;

/* JADX INFO: loaded from: classes.dex */
public final class ax1 implements LayoutInflater.Factory2 {
    public final kx1 j;

    public ax1(kx1 kx1Var) {
        this.j = kx1Var;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        tx1 tx1VarJ;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        kx1 kx1Var = this.j;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, kx1Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m24.g);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = pw1.class.isAssignableFrom(ex1.y(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    pw1 pw1VarD = resourceId != -1 ? kx1Var.D(resourceId) : null;
                    if (pw1VarD == null && string != null) {
                        pw1VarD = kx1Var.E(string);
                    }
                    if (pw1VarD == null && id != -1) {
                        pw1VarD = kx1Var.D(id);
                    }
                    if (pw1VarD == null) {
                        ex1 ex1VarK = kx1Var.K();
                        context.getClassLoader();
                        pw1VarD = ex1VarK.g(attributeValue);
                        pw1VarD.h = true;
                        pw1VarD.E = resourceId != 0 ? resourceId : id;
                        pw1VarD.F = id;
                        pw1VarD.G = string;
                        pw1VarD.o = true;
                        pw1VarD.A = kx1Var;
                        rw1 rw1Var = kx1Var.f;
                        pw1VarD.B = rw1Var;
                        yk ykVar = rw1Var.k;
                        pw1VarD.M = true;
                        if ((rw1Var == null ? null : rw1Var.f) != null) {
                            pw1VarD.M = true;
                        }
                        tx1VarJ = kx1Var.g(pw1VarD);
                        if (kx1.N(2)) {
                            Log.v("FragmentManager", "Fragment " + pw1VarD + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (pw1VarD.o) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        pw1VarD.o = true;
                        pw1VarD.A = kx1Var;
                        rw1 rw1Var2 = kx1Var.f;
                        pw1VarD.B = rw1Var2;
                        yk ykVar2 = rw1Var2.k;
                        pw1VarD.M = true;
                        if ((rw1Var2 == null ? null : rw1Var2.f) != null) {
                            pw1VarD.M = true;
                        }
                        tx1VarJ = kx1Var.j(pw1VarD);
                        if (kx1.N(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + pw1VarD + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    vx1.n(pw1VarD, viewGroup);
                    pw1VarD.N = viewGroup;
                    tx1VarJ.m();
                    tx1VarJ.a();
                    View view2 = pw1VarD.O;
                    if (view2 == null) {
                        l0.z(du4.i("Fragment ", attributeValue, " did not create a view."));
                        return null;
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (pw1VarD.O.getTag() == null) {
                        pw1VarD.O.setTag(string);
                    }
                    pw1VarD.O.addOnAttachStateChangeListener(new zw1(this, tx1VarJ));
                    return pw1VarD.O;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
