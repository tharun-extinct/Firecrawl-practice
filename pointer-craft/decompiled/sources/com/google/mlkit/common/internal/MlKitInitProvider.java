package com.google.mlkit.common.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import defpackage.f63;
import defpackage.im0;
import defpackage.ji;
import defpackage.jr2;
import defpackage.l0;
import defpackage.ll0;
import defpackage.lm0;
import defpackage.mc4;
import defpackage.q64;
import defpackage.y25;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class MlKitInitProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        jr2.w("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.", !providerInfo.authority.equals("com.google.mlkit.common.mlkitinitprovider"));
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            Log.i("MlKitInitProvider", "No context available. Manually call MlKit.initialize(), otherwise ML Kit will not be functional.");
            return false;
        }
        synchronized (f63.y) {
            jr2.w("MlKitContext is already initialized", f63.r == null);
            f63 f63Var = new f63();
            f63.r = f63Var;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList arrayListM = new ji(context, new q64(MlKitComponentDiscoveryService.class, (byte) 13), (byte) 4).m();
            mc4 mc4Var = y25.g;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            l0 l0Var = im0.r;
            arrayList.addAll(arrayListM);
            arrayList2.add(ll0.y(context, Context.class, new Class[0]));
            arrayList2.add(ll0.y(f63Var, f63.class, new Class[0]));
            lm0 lm0Var = new lm0(arrayList, arrayList2, l0Var);
            f63Var.g = lm0Var;
            lm0Var.a(true);
        }
        return false;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
