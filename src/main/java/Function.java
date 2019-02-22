import java.math.BigInteger;

class Function
{
    BigInteger calculateBernoulli( long m, long r )
    {
        return getFactorial( m ).divide(
            getFactorial( r ).multiply( getFactorial( m - r ) )
        );
    }

    private BigInteger getFactorial( long l )
    {
        BigInteger result = BigInteger.ONE;

        if( l <= 0 )
        {
            return result;
        }

        for( long i = 1; i <= l; i++ )
        {
            result = result.multiply( BigInteger.valueOf( i ) );
        }

        return result;
    }

    BigInteger calculateAsInTestWork( long m, long r )
    {
        return getFactorial( m ).divide( getFactorial( r ) )
                                .multiply( getFactorial( m - r ) );
    }
}
