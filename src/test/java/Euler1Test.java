import org.junit.Assert;
import org.junit.Test;

public class Euler1Test {

    @Test
    public void shouldReturn23(){

        //given
        Eurel1 euler1 = new Eurel1();
        //when
        int result = euler1.calculate(10);
        //then
        Assert.assertEquals(result,23);
    }


    @Test
    public void shouldReturn33(){

        //given
        Eurel1 euler1 = new Eurel1();
        //when
        int result = euler1.calculate(11);
        //then
        Assert.assertEquals(result,33);
    }


    @Test
    public void shouldReturn33b(){

        //given
        Eurel1 euler1 = new Eurel1();
        //when
        int result = euler1.calculate(12);
        //then
        Assert.assertEquals(result,33);
    }

    @Test
    public void shouldReturn45(){

        //given
        Eurel1 euler1 = new Eurel1();
        //when
        int result = euler1.calculate(13);
        //then
        Assert.assertEquals(result,45);
    }

    @Test
    public void shouldReturn60(){

        //given
        Eurel1 euler1 = new Eurel1();
        //when
        int result = euler1.calculate(16);
        //then
        Assert.assertEquals(result,60);
    }

}
