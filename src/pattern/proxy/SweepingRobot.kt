package pattern.proxy

class SweepingRobot: SweepingWork {

    private val user = User("可以每天定時清掃, 又可以掃得很乾淨, 只要不被地墊卡住！")

    override fun sweepingFloor() {
        user.sweepingFloor()
    }
}