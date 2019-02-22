package pattern.interpreter.data

// 交友網站資料
class PersonData {

    var nameList: MutableList<PersonalInfo> = ArrayList()

    init {
        nameList.run {
            add(PersonalInfo("Adela", 20, false, arrayListOf("跳舞", "旅行")))
            add(PersonalInfo("Allison", 23, false, arrayListOf("唱歌", "購物")))
            add(PersonalInfo("Carol", 28, false, arrayListOf("烹飪", "美食")))
            add(PersonalInfo("Diana", 35, false, arrayListOf("瑜珈", "電影", "追劇")))
            add(PersonalInfo("Joy", 41, false, arrayListOf("賽車", "重機")))
            add(PersonalInfo("Laura", 32, false, arrayListOf("購物", "爬山")))
            add(PersonalInfo("Adam", 39, true, arrayListOf("健身", "喝酒")))
            add(PersonalInfo("Chris", 33, true, arrayListOf("旅行")))
            add(PersonalInfo("Eric", 18, true, arrayListOf("睡覺", "電玩")))
            add(PersonalInfo("Jerome", 21, true, arrayListOf("運動")))
        }
    }
}