# ProGuard rules for ChirpSphere

# Keep Firebase model classes
-keepclassmembers class com.chirpsphere.app.models.** {
            <fields>;
                <methods>;
}

# Keep Firebase and Google Play services classes
-keep class com.google.firebase.** { *; }
-keep class com.google.android.gms.** { *; }

# Keep Kotlin metadata
-keepclassmembers class kotlin.Metadata { *; }
}