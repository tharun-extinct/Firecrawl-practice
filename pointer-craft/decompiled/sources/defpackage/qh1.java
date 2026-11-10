package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* JADX INFO: loaded from: classes.dex */
public final class qh1 implements n21 {
    public final /* synthetic */ ju2 j;

    public qh1(EmojiCompatInitializer emojiCompatInitializer, ju2 ju2Var) {
        this.j = ju2Var;
    }

    @Override // defpackage.n21
    public final void a(gu2 gu2Var) {
        (Build.VERSION.SDK_INT >= 28 ? lp0.g(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new sh1(), 500L);
        this.j.x(this);
    }
}
