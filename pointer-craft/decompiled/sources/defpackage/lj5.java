package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface lj5 extends mj5 {
    int n();

    int x();

    @Override // defpackage.jj5
    default long y(vi viVar, vi viVar2, vi viVar3) {
        return ((long) (x() + n())) * 1000000;
    }
}
