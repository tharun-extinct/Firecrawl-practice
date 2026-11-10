package defpackage;

import android.view.RenderNode;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x64 {
    public static int g(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public static void n(RenderNode renderNode, int i) {
        renderNode.setSpotShadowColor(i);
    }

    public static void r(RenderNode renderNode, int i) {
        renderNode.setAmbientShadowColor(i);
    }

    public static int y(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }
}
