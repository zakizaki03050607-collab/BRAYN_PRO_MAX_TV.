// تعريف البيانات لسيرفر BRAYN PRO MAX TV
data class XtreamCredentials(
    val serverUrl: String,    // رابط السيرفر
    val username: String,     // اسم المستخدم
    val password: String,     // كلمة السر
    val activationCode: String // كود التفعيل 0770994380
)

data class LiveChannel(
    val name: String,         // اسم القناة
    val streamId: Int,        // معرف البث
    val streamIcon: String,   // لوغو القناة
    val categoryId: String    // الصنف (رياضة، أفلام...)
)
