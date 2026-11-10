package androidx.startup;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x003c */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onCreate() {
        /*
            r3 = this;
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L43
            android.content.Context r1 = r0.getApplicationContext()
            if (r1 == 0) goto L41
            ro r0 = defpackage.ro.A(r0)
            java.lang.Class r3 = r3.getClass()
            java.lang.Object r1 = r0.m
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r2 = "Startup"
            defpackage.lr2.w(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35 java.lang.Throwable -> L3c
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35 java.lang.Throwable -> L3c
            r2.<init>(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35 java.lang.Throwable -> L3c
            android.content.pm.PackageManager r3 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35 java.lang.Throwable -> L3c
            r1 = 128(0x80, float:1.794E-43)
            android.content.pm.ProviderInfo r3 = r3.getProviderInfo(r2, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35 java.lang.Throwable -> L3c
            android.os.Bundle r3 = r3.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35 java.lang.Throwable -> L3c
            r0.q(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35 java.lang.Throwable -> L3c
            android.os.Trace.endSection()
            goto L41
        L35:
            r3 = move-exception
            il0 r0 = new il0     // Catch: java.lang.Throwable -> L3c
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L3c
            throw r0     // Catch: java.lang.Throwable -> L3c
        L3c:
            r3 = move-exception
            android.os.Trace.endSection()
            throw r3
        L41:
            r3 = 1
            return r3
        L43:
            il0 r3 = new il0
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.startup.InitializationProvider.onCreate():boolean");
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
