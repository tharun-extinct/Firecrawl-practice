package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class uu4 extends Exception {
    public final Integer j;

    public uu4(Integer num) {
        this.j = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uu4) && this.j.equals(((uu4) obj).j);
    }

    public final Integer g() {
        return this.j;
    }

    public final int hashCode() {
        return this.j.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "SpeechRecognitionError(errorMsg=" + this.j + ")";
    }
}
