import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem

// مشغل القنوات لتطبيق BRAYN PRO MAX TV
@Composable
fun VideoPlayerScreen(streamUrl: String) {
    val context = LocalContext.current
    
    // إعداد المحرك ExoPlayer
    val exoPlayer = remember {
        ExoPlayer.Builder(context).build().apply {
            val mediaItem = MediaItem.fromUri(streamUrl)
            setMediaItem(mediaItem)
            prepare()
            playWhenReady = true // يبدأ البث فوراً عند الفتح
        }
    }

    // عرض الفيديو بملء الشاشة (Netfly Style)
    AndroidView(
        factory = { ctx ->
            StyledPlayerView(ctx).apply {
                player = exoPlayer
                useController = true // إظهار أزرار التحكم
                setBackgroundColor(Color.Black.toArgb())
            }
        },
        modifier = Modifier.fillMaxSize()
    )
}
