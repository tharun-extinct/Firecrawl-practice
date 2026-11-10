package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import io.appground.blek.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jg1 implements Runnable {
    public final /* synthetic */ v05 a;
    public final /* synthetic */ sg1 j;
    public final /* synthetic */ MainActivity m;
    public final /* synthetic */ View q;
    public final /* synthetic */ v05 t;

    public /* synthetic */ jg1(sg1 sg1Var, v05 v05Var, v05 v05Var2, MainActivity mainActivity, View view) {
        this.j = sg1Var;
        this.t = v05Var;
        this.a = v05Var2;
        this.m = mainActivity;
        this.q = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Window window = this.m.getWindow();
        window.getClass();
        v05 v05Var = this.t;
        xy1 xy1Var = v05Var.r;
        View view = this.q;
        Resources resources = view.getResources();
        resources.getClass();
        boolean zBooleanValue = ((Boolean) xy1Var.a(resources)).booleanValue();
        v05 v05Var2 = this.a;
        xy1 xy1Var2 = v05Var2.r;
        Resources resources2 = view.getResources();
        resources2.getClass();
        this.j.y(v05Var, v05Var2, window, view, zBooleanValue, ((Boolean) xy1Var2.a(resources2)).booleanValue());
    }
}
