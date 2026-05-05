import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid

// واجهة عرض القنوات لـ BRAYN PRO MAX TV
@Composable
fun ChannelsDashboard(channels: List<LiveChannel>) {
    Column(modifier = Modifier.fillMaxSize().background(BackgroundBlack)) {
        // عنوان القسم باللون الذهبي
        Text(
            text = "البث المباشر - LIVE TV",
            color = PrimaryGold,
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(16.dp)
        )

        // عرض القنوات على شكل شبكة (Grid)
        LazyVerticalGrid(
            columns = GridCells.Fixed(3), // 3 قنوات في الصف الواحد (مناسب للتلفاز)
            contentPadding = PaddingValues(8.dp)
        ) {
            items(channels) { channel ->
                ChannelItem(channel)
            }
        }
    }
}

@Composable
fun ChannelItem(channel: LiveChannel) {
    Card(
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = SurfaceGray),
        modifier = Modifier
            .padding(8.dp)
            .focusable() // لجعل الريموت يتوقف عندها
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            // مكان لوغو القناة
            AsyncImage(model = channel.streamIcon, contentDescription = null)
            Text(text = channel.name, color = Color.White, modifier = Modifier.padding(4.dp))
        }
    }
}
