package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nw5 implements ax5 {
    public final byte g;

    /* JADX WARN: Multi-variable type inference failed */
    public nw5(int i) {
        this.g = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return ax5.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ax5)) {
            return false;
        }
        ax5 ax5Var = (ax5) obj;
        return this.g == ax5Var.zza() && xw5.j.equals(ax5Var.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.g ^ 14552422) + (xw5.j.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + ((int) this.g) + "intEncoding=" + xw5.j + ')';
    }

    @Override // defpackage.ax5
    public final int zza() {
        return this.g;
    }

    @Override // defpackage.ax5
    public final xw5 zzb() {
        return xw5.j;
    }
}
