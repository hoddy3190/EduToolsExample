import org.junit.Assert
import org.junit.Test

class Test {
    @Test fun testSolution() {
        Assert.assertEquals(true, isOdd(0))
        Assert.assertEquals(false, isOdd(9))
        Assert.assertEquals(true, isOdd(28))
        Assert.assertEquals(false, isOdd(-1))
        Assert.assertEquals(true, isOdd(-104))
    }
}