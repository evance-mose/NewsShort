object Dependencies   {

    val coreKtx by lazy { "androidx.core:core-ktx:${Versions.coreKtx}"}
    val lifecycleRuntimeKtx by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntimeKtx}"}
    val activityCompose by lazy { "androidx.activity:activity-compose:${Versions.activityCompose}"}
    val composeBom by lazy { "androidx.compose:compose-bom:${Versions.composeBom}"}
    val composeUi by lazy { "androidx.compose.ui:ui"}
    val composeUiGraphics by lazy { "androidx.compose.ui:ui-graphics"}
    val composeUiToolingPreview by lazy { "androidx.compose.ui:ui-tooling-preview"}
    val composeMaterial3 by lazy { "androidx.compose.material3:material3:${Versions.material3}"}
    val junit by lazy { "junit:junit:${Versions.junit}"}
    val testJunit by lazy { "androidx.test.ext:junit:${Versions.testJunit}"}
    val espressoCore by lazy { "androidx.test.espresso:espresso-core:${Versions.espressoCore}"}
    val composeUiTest by lazy { "androidx.compose.ui:ui-test-junit4"}
    val composeUiTooling by lazy { "androidx.compose.ui:ui-tooling"}
    val composeUiTestManifest by lazy { "androidx.compose.ui:ui-test-manifest"}
    val appCompact by lazy { "androidx.appcompat:appcompat:1.6.1"}
    val material by lazy { "com.google.android.material:material:${Versions.material}"}
    val navigationCompose by lazy { "androidx.navigation:navigation-compose:${Versions.navigationCompose}"}
    val lifecycleViewModel by lazy { "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleViewModelKtx}"}

    val hilt by lazy { "com.google.dagger:hilt-android:${Versions.hilt}"}
    val hiltAndroidCompiler by lazy { "com.google.dagger:hilt-android-compiler:${Versions.hilt}"}
    val hiltCompiler by lazy { "androidx.hilt:hilt-compiler:${Versions.hiltCompiler}"}
    val timber by lazy { "com.jakewharton.timber:timber:${Versions.timber}"}

}

object Modules{
  const val utilites = ":utilities"
}