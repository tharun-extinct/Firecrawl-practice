package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.gu2;
import defpackage.ic2;
import defpackage.jq;
import defpackage.ju2;
import defpackage.ph1;
import defpackage.qh1;
import defpackage.ro;
import defpackage.zu1;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements ic2 {
    @Override // defpackage.ic2
    public final List g() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.ic2
    public final Object y(Context context) {
        Object objW;
        jq jqVar = new jq();
        jqVar.j = context.getApplicationContext();
        zu1 zu1Var = new zu1(jqVar);
        zu1Var.y = true;
        if (ph1.m == null) {
            synchronized (ph1.a) {
                try {
                    if (ph1.m == null) {
                        ph1.m = new ph1(zu1Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ro roVarA = ro.A(context);
        roVarA.getClass();
        synchronized (ro.w) {
            try {
                objW = ((HashMap) roVarA.t).get(ProcessLifecycleInitializer.class);
                if (objW == null) {
                    objW = roVarA.w(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ju2 ju2VarA = ((gu2) objW).a();
        ju2VarA.g(new qh1(this, ju2VarA));
        return Boolean.TRUE;
    }
}
