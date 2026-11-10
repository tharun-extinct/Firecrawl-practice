package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes2.dex */
public final class sw1 extends AnimationSet implements Runnable {
    public boolean a;
    public final ViewGroup j;
    public boolean m;
    public boolean q;
    public final View t;

    public sw1(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.q = true;
        this.j = viewGroup;
        this.t = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.q = true;
        if (this.a) {
            return !this.m;
        }
        if (!super.getTransformation(j, transformation)) {
            this.a = true;
            pk3.g(this.j, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.a;
        ViewGroup viewGroup = this.j;
        if (z || !this.q) {
            viewGroup.endViewTransition(this.t);
            this.m = true;
        } else {
            this.q = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.q = true;
        if (this.a) {
            return !this.m;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.a = true;
            pk3.g(this.j, this);
        }
        return true;
    }
}
