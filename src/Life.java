public class Life {
    public LifeStatus status;

    public int calculateAliveAround() {
        return 2;
    }

    public LifeStatus currentStatus(Enum lifeStatus, int aliveAround) {
        if(isCanLive(lifeStatus, aliveAround))
            return LifeStatus.alive;
        return LifeStatus.died;
    }

    private boolean isCanLive(Enum lifeStatus, int aliveAround) {
        return aliveAround == 2 && lifeStatus == LifeStatus.alive;
    }

}
