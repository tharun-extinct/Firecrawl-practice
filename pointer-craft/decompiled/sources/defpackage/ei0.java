package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes2.dex */
public final class ei0 extends ViewOutlineProvider {
    public final /* synthetic */ byte g;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        nl5 nl5Var;
        Outline outline2;
        switch (this.g) {
            case 0:
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                break;
            case 1:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                break;
            case 2:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                break;
            case 3:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                break;
            default:
                if ((view instanceof nl5) && (outline2 = (nl5Var = (nl5) view).q) != null) {
                    outline.set(outline2);
                    float f = nl5Var.p;
                    if (f != 0.0f || nl5Var.u != 0.0f) {
                        outline.offset((int) f, (int) nl5Var.u);
                    }
                    break;
                }
                break;
        }
    }
}
