package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nw4 {
    public final Object g;

    public nw4(Object obj) {
        this.g = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nw4) && this.g.equals(((nw4) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode() * 31;
    }

    public final String toString() {
        return "TransitionTo(toState=" + this.g + ", sideEffect=null)";
    }
}
