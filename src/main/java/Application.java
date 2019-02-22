import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application
{
    public static void main( String[] args )
    {
        long r = 0, m = 0;

        System.out.println( "Enter two natural numbers, press <ENTER> after each "
                            + System.lineSeparator()
                            + "first number must be less or equals for second"
                            + System.lineSeparator()
                            + "negative numbers will be its absolute values" );

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) );
        try
        {
            String line = bufferedReader.readLine();
            r = Math.abs( Long.valueOf( line ) );

            line = bufferedReader.readLine();
            m = Math.abs( Long.valueOf( line ) );
        }
        catch( IOException e )
        {
            e.printStackTrace();
            System.exit( 1 );
        }

        if( r > m )
        {
            System.out.println( "First number must be less or equals for second!" );
            System.exit( 1 );
        }

        Function function = new Function();
        System.out.println( "result for testWork f(m,r)=m!/r!(m-r)!: " + function.calculateAsInTestWork( m, r ) );
        System.out.println( "result for Bernoulli f(m,r)=m!/(r!(m-r)!): " + function.calculateBernoulli( m, r ) );
    }
}
