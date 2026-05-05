// الملف الرئيسي لتطبيق BRAYN PRO MAX TV
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // استخدام التنسيق الملكي الذي أنشأناه في Theme.kt
            StreamPulseTheme { 
                var isActivated by remember { mutableStateOf(false) }

                if (!isActivated) {
                    // عرض شاشة التفعيل أولاً
                    ActivationScreen(onSuccess = { isActivated = true })
                } else {
                    // بعد التفعيل بالكود 0770994380، نفتح واجهة القنوات
                    ChannelsDashboard(channels = dummyChannels) 
                }
            }
        }
    }
}
