# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to the global ProGuard rules.

# Keep Firebase models
-keepclassmembers class * {
        @com.google.firebase.firestore.PropertyName <fields>;
}

}