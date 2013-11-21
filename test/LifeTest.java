import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LifeTest {
    @Test
    public void shouldKeepAliveWhenThereAreTwoLiveCell() throws Exception {
        Life life = new Life();
        life.status = LifeStatus.alive;
        int aliveNumber = life.calculateAliveAround();
        assertThat(life.currentStatus(life.status, aliveNumber), is(LifeStatus.alive));
    }
}
