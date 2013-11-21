import com.company.Life;
import com.company.LifeStatus;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LifeTest {
    @Test
    public void shouldKeepAliveWhenThereAreTwoLiveCell() throws Exception {
        Life life = new Life();
        life.status = LifeStatus.alive;
        life.aliveAround = 2;
        int aliveNumber = life.calculateAliveAround();
        assertThat(life.currentStatus(life.status, aliveNumber), is(LifeStatus.alive));
    }

    @Test
    public void shouldKeepAliveWhenThereAreThreeLiveCell() throws Exception {
        Life life = new Life();
        life.status = LifeStatus.alive;
        life.aliveAround = 3;
        int aliveNumber = life.calculateAliveAround();
        assertThat(life.currentStatus(life.status, aliveNumber), is(LifeStatus.alive));

    }
}
