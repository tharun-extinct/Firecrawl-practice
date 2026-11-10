package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class g94 {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof g94);
    }

    public final int hashCode() {
        return Float.hashCode(0.1f) + fj.y(0.08f, fj.y(0.1f, Float.hashCode(0.16f) * 31, 31), 31);
    }

    public final String toString() {
        return "RippleAlpha(draggedAlpha=0.16, focusedAlpha=0.1, hoveredAlpha=0.08, pressedAlpha=0.1)";
    }
}
