import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color

// شاشة التفعيل الخاصة بـ BRAYN PRO MAX TV
@Composable
fun ActivationScreen() {
    var activationCode by remember { mutableStateOf("") }
    val correctCode = "0770994380" // كود التفعيل الخاص بك

    // تصميم الواجهة بالألوان الملكية
    Column(modifier = Modifier.background(BackgroundBlack)) {
        Text(
            text = "BRAYN PRO MAX TV",
            color = PrimaryGold, // اللون الذهبي الملكي
            style = MaterialTheme.typography.headlineLarge
        )
        
        TextField(
            value = activationCode,
            onValueChange = { activationCode = it },
            label = { Text("أدخل كود التفعيل") },
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = TurquoiseAccent // حواف تركوازية عند الكتابة
            )
        )

        Button(
            onClick = {
                if (activationCode == correctCode) {
                    // الانتقال للـ Dashboard (قنوات IPTV)
                }
            },
            colors = ButtonDefaults.buttonColors(containerColor = PrimaryGold)
        ) {
            Text("تفعيل الآن", color = Color.Black)
        }
    }
}
