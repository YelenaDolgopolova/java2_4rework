import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatService;

public class StatServerTest {
    public long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    public StatService service = new StatService();

    @Test
    public void shouldSum() {
        long actual = service.sum(purchases);
        long expected = 180;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAvg() {
        long actual = service.avg(purchases);
        long expected = 15;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMoreThenAvg() {
        long actual = service.monthCountMoreThenAvg(purchases);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnLessThenAvg() {
        long actual = service.monthCountLessThenAvg(purchases);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void minSales() {
        long actual = service.minSales(purchases);
        long expected = 9;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void maxSales() {
        long actual = service.maxSales(purchases);
        long expected = 8;
        Assertions.assertEquals(expected, actual);
    }
}
