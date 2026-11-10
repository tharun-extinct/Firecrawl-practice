package defpackage;

import android.view.View;
import android.view.ViewGroup;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class hs5 {
    public static final ViewGroup.LayoutParams g = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final es5 g(d dVar, mo0 mo0Var, nm0 nm0Var) {
        ba baVar;
        es5 es5Var;
        Object[] objArr = 0;
        if (e32.g.compareAndSet(false, true)) {
            m70 m70VarY = v70.y(1, 6, null);
            m50.T(k33.x((fx0) nf.z.getValue()), null, new zh(m70VarY, objArr == true ? 1 : 0, (byte) 12), 3);
            z6 z6Var = new z6(m70VarY, (byte) 16);
            synchronized (it4.r) {
                it4.t = cj0.x0(it4.t, z6Var);
            }
            it4.r();
        }
        if (dVar.getChildCount() > 0) {
            View childAt = dVar.getChildAt(0);
            baVar = childAt instanceof ba ? (ba) childAt : null;
            if (baVar != null) {
                baVar.setComposeViewContext(mo0Var);
            }
            if (baVar == null) {
                baVar = new ba(dVar.getContext(), mo0Var);
                dVar.addView(baVar.getView(), g);
            }
            baVar.setComposeViewContext(mo0Var);
            if (dVar.getComposeViewContext$ui() != null) {
                mo0Var.v();
                baVar.setComposeViewContextIncrementedDuringInit$ui(true);
            }
            Object tag = baVar.getTag(R.id.wrapped_composition_tag);
            es5Var = tag instanceof es5 ? (es5) tag : null;
            if (es5Var == null) {
                es5Var = new es5(baVar, new yo0(mo0Var.r(), new wf5(baVar.getRoot())));
                baVar.setTag(R.id.wrapped_composition_tag, es5Var);
            }
            es5Var.r(nm0Var);
            baVar.setFrameEndScheduler$ui(new gs5(mo0Var.r()));
            return es5Var;
        }
        dVar.removeAllViews();
        baVar = null;
        if (baVar == null) {
            baVar = new ba(dVar.getContext(), mo0Var);
            dVar.addView(baVar.getView(), g);
        }
        baVar.setComposeViewContext(mo0Var);
        if (dVar.getComposeViewContext$ui() != null) {
            mo0Var.v();
            baVar.setComposeViewContextIncrementedDuringInit$ui(true);
        }
        Object tag2 = baVar.getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof es5) {
        }
        if (es5Var == null) {
            es5Var = new es5(baVar, new yo0(mo0Var.r(), new wf5(baVar.getRoot())));
            baVar.setTag(R.id.wrapped_composition_tag, es5Var);
        }
        es5Var.r(nm0Var);
        baVar.setFrameEndScheduler$ui(new gs5(mo0Var.r()));
        return es5Var;
    }
}
