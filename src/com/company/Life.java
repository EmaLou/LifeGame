package com.company;

public class Life {
    public LifeStatus status;
    public int aliveAround;

    public int calculateAliveAround() {
        return aliveAround;
    }

    public LifeStatus currentStatus(Enum lifeStatus, int aliveAround) {
        if(isCanLive(lifeStatus, aliveAround))
            return LifeStatus.alive;
        return LifeStatus.died;
    }

    private boolean isCanLive(Enum lifeStatus, int aliveAround) {
        if(lifeStatus == LifeStatus.died){
            return aliveAround == 3;
        }
        return (aliveAround == 2 || aliveAround == 3) && lifeStatus == LifeStatus.alive;
    }

}
