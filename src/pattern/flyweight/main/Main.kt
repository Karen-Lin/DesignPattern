package pattern.flyweight.main

import pattern.flyweight.DressCode
import pattern.flyweight.WearFactory

fun main(args: Array<String>) {

    /**
     * 步驟
     * - 將每個人的穿著變成一個共享類別，並且分為兩種資訊：與外在環境無關的資訊 & 會隨著外在環境改變的資訊
     * - 建立一個打扮工廠檢查模特兒是否已經存在
     **/

    // "燕尾服", "西裝褲", "皮鞋"
    val karen = DressCode()
    WearFactory.INSTANCE.get("Karen")
    // "包屁衣", "無", "啾啾鞋"
    val lee = DressCode()
    WearFactory.INSTANCE.get("Lee")
    // "高衩晚禮服", "無", "高跟鞋"
    val claire = DressCode()
    WearFactory.INSTANCE.get("Claire")
    // "制服", "百褶裙", "學生鞋"
    val amin = DressCode()
    WearFactory.INSTANCE.get("Amin")

    // 凱倫想性感一點
    karen.clothes = "馬甲"
    WearFactory.INSTANCE.get("Karen")

}