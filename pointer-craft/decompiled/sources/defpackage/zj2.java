package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zj2 extends nz1 implements cz1 {
    public static final zj2 i = new zj2(3, bv0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/appground/blek/databinding/ControlItemTouchpadBinding;", 0);

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        return bv0.g(layoutInflater, (ViewGroup) obj2, zBooleanValue);
    }
}
