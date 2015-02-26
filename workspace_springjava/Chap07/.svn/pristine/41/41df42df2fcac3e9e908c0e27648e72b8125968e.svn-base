package expert004;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("expert.xml")
public class CarTest {
	@Autowired
	Car car;	

	@Test
	public void 자동차_장착_타이어브랜드_테스트() {
		assertEquals("장착된 타이어: 코리아 타이어", car.getTireBrand());
	}
}