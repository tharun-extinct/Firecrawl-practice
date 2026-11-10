package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class kg1 extends View {
    public final /* synthetic */ jg1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg1(jg1 jg1Var, Context context) {
        super(context);
        this.j = jg1Var;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        this.j.run();
    }
}
