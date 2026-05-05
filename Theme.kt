// ألوان تطبيق BRAYN PRO MAX TV
val BackgroundBlack = Color(0xFF000000) // أسود فخم
val PrimaryCyan = Color(0xFF00FFFF)    // تركوازي مشع
val GoldAccent = Color(0xFFFFD700)     // ذهبي ملكي
val SurfaceGray = Color(0xFF1E1E1E)    // رمادي غامق للبطاقات

@Composable
fun StreamPulseTheme(content: @Composable () -> Unit) {
    val colors = darkColorScheme(
        primary = PrimaryCyan,
        secondary = GoldAccent,
        background = BackgroundBlack,
        surface = SurfaceGray,
        onPrimary = Color.Black,
        onBackground = Color.White,
        onSurface = Color.White
    )

    MaterialTheme(
        colorScheme = colors,
        content = content
    )
}
