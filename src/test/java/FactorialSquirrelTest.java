import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

class FactorialSquirrelTest
{
    @Test
    void calculateBernoulli()
    {
        long r = 5;
        long m = 10;
        BigInteger expected = BigInteger.valueOf( 252 );
        BigInteger bernoulliResult = new Function().calculateBernoulli( m, r );
        Assertions.assertEquals( expected, bernoulliResult );
    }

    @Test
    void calculateBernoulliReturnsOneOnZero()
    {
        long r = 0;
        long m = 0;
        BigInteger expected = BigInteger.valueOf( 1 );
        BigInteger bernoulliResult = new Function().calculateBernoulli( m, r );
        Assertions.assertEquals( expected, bernoulliResult );
    }

    @Test
    void calculateAsInTestWork()
    {
        long r = 5;
        long m = 10;
        BigInteger expected = BigInteger.valueOf( 3628800 );
        BigInteger asInTestWorkResult = new Function().calculateAsInTestWork( m, r );
        Assertions.assertEquals( expected, asInTestWorkResult );
    }

    @Test
    void calculateAsInTestWorkReturnsOneOnZero()
    {
        long r = 0;
        long m = 0;
        BigInteger expected = BigInteger.valueOf( 1 );
        BigInteger asInTestWorkResult = new Function().calculateAsInTestWork( m, r );
        Assertions.assertEquals( expected, asInTestWorkResult );
    }
}
